package br.com.pjr.exemplospringbootadminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class ExemploSpringBootAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExemploSpringBootAdminApplication.class, args);
    }

}
