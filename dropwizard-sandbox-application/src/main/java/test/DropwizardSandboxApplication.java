package test;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DropwizardSandboxApplication extends Application<DropwizardSandboxApplicationConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropwizardSandboxApplication().run(args);
    }

    @Override
    public String getName() {
        return "DropwizardSandboxApplication";
    }

    @Override
    public void initialize(final Bootstrap<DropwizardSandboxApplicationConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DropwizardSandboxApplicationConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
