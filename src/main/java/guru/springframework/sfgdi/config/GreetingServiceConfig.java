package guru.springframework.sfgdi.config;

import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;

/**
 * Created by HashmatN at 4:05 PM on Sep 14, 2021
 */
@EnableConfigurationProperties(SfgConsturctorConfig.class)
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

  @Bean
  FakeDataSource fakeDataSource(SfgConsturctorConfig sfgConsturctorConfig) {
    FakeDataSource fakeDataSource = new FakeDataSource();
    fakeDataSource.setUsername(sfgConsturctorConfig.getUsername());
    fakeDataSource.setPassword(sfgConsturctorConfig.getPassword());
    fakeDataSource.setJdbcurl(sfgConsturctorConfig.getJdbcurl());
    return fakeDataSource;
  }

  @Bean
  PetServiceFactory petServiceFactory() {
    return new PetServiceFactory();
  }

  @Profile({"dog", "default"})
  @Bean
  PetService dogPetService(PetServiceFactory petServiceFactory) {
    return petServiceFactory.getPetService("dog");
  }

  @Bean
  @Profile("cat")
  PetService catPetService(PetServiceFactory petServiceFactory) {
    return petServiceFactory.getPetService("cat");
  }

  @Profile("ES")
  @Bean("i18nService")
  I18nSpanishGreetingService i18nSpanishGreetingService() {
    return new I18nSpanishGreetingService();
  }

  @Bean
  EnglishGreetingRepository englishGreetingRepository() {
    return new EnglishGreetingRepositoryImpl();
  }

  @Profile({"EN", "default"})
  @Bean
  I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository) {
    return new I18nEnglishGreetingService(englishGreetingRepository);
  }

  @Primary
  @Bean
  PrimaryGreetingService primaryGreetingService() {
    return new PrimaryGreetingService();
  }

  //@Bean
  ConstructorGreetingService constructorGreetingService(){
    return new ConstructorGreetingService();
  }

  @Bean
  PropertyInjectedGreetingService propertyInjectedGreetingService() {
    return new PropertyInjectedGreetingService();
  }

  @Bean
  SetterInjectedGreetingService setterInjectedGreetingService() {
    return new SetterInjectedGreetingService();
  }
}
