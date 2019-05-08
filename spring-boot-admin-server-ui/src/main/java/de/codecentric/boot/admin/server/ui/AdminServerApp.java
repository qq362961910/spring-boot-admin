package de.codecentric.boot.admin.server.ui;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class AdminServerApp {

    public static void main(String[] args) {
//        new SpringApplicationBuilder(AdminServerApp.class)
//            .web(WebApplicationType.REACTIVE)
//            .run(args);
        SpringApplication.run(AdminServerApp.class, args);
    }
}
