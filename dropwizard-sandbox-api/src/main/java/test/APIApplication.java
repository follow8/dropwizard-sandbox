package test;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class APIApplication extends Application<APIConfiguration> {
  public static void main(String[] args) throws Exception {
    new APIApplication().run(args);
  }

  @Override
  public String getName() {
    return "api";
  }

  @Override
  public void initialize(Bootstrap<APIConfiguration> bootstrap) {

  }

  @Override
  public void run(APIConfiguration configuration, Environment environment) throws Exception {
  }
}
