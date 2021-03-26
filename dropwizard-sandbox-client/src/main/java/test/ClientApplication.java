package test;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ClientApplication extends Application<ClientConfiguration> {

    public static void main(final String[] args) throws Exception {
        new ClientApplication().run(args);
    }

    @Override
    public String getName() {
        return "client";
    }

    @Override
    public void initialize(final Bootstrap<ClientConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final ClientConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
