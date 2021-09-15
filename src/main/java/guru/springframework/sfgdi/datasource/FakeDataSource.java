package guru.springframework.sfgdi.datasource;

/**
 * Created by HashmatN at 3:18 PM on Sep 15, 2021
 */
public class FakeDataSource {

  private String username;
  private String password;
  private String jdbcurl;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getJdbcurl() {
    return jdbcurl;
  }

  public void setJdbcurl(String jdbcurl) {
    this.jdbcurl = jdbcurl;
  }
}
