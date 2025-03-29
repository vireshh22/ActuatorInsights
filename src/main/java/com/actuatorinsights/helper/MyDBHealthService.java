package com.actuatorinsights.helper;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyDBHealthService implements HealthIndicator {

    public boolean isDBOkay() {
        // custom logic
        return false;
    }

    @Override
    public Health health() {
        if (isDBOkay()) {
            return Health.up().withDetail("Database Service", "Database service is up").build();
        }
        return Health.down().withDetail("Database Service", "Database Service is down").build();
    }

}
