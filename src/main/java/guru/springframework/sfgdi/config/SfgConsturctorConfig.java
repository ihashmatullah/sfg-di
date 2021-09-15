package guru.springframework.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * Created by HashmatN at 4:58 PM on Sep 15, 2021
 */
@ConstructorBinding
@ConfigurationProperties("guru")
public class SfgConsturctorConfig {
  private final String username;
  private final String password;
  private final String jdbcurl;

  public SfgConsturctorConfig(String username, String password, String jdbcurl) {
    this.username = username;
    this.password = password;
    this.jdbcurl = jdbcurl;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getJdbcurl() {
    return jdbcurl;
  }
}
