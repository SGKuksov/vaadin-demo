package ru.ntik;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.spring.annotation.EnableVaadin;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.ntik.platforma.config.PlatformaConfiguration;

import java.util.Properties;

//todo move common to core-platform
//todo add data rest
//todo add openapi
//todo add mapstruct
//todo return DTOs
//todo implement other REST API
//todo add gitignore

@EnableVaadin("ru.ntik")
@EntityScan("ru.ntik")
//@EnableJpaRepositories("ru.ntik")
@SpringBootApplication(scanBasePackages = {"ru.ntik"})
@Import(PlatformaConfiguration.class)
public class PlatformaApp {

    public static void main(String[] args) {
        Properties properties = new Properties();

        /*Connection properties*/
        properties.put("server.port", "20000"); //injected by plugin
        properties.put("server.servlet.context-path", "/dispatch"); //injected by plugin

        /*Vaadin properties*/
        properties.put("logging.level.org.atmosphere ", "warn");
        properties.put("spring.mustache.check-template-location ", "false");
        properties.put("vaadin.whitelisted-packages", "com.vaadin,org.vaadin,dev.hilla,com.example.application");

        /*Security settings*/
        properties.put("pico.endpoint.passwordauth", "http://192.168.151.19/api/v1/auth/verify");
        properties.put("pico.endpoint.tokenauth", "http://192.168.151.19/api/v1/auth/verifyToken");

        properties.put("pico.endpoint.login", "http://192.168.12.98:8899/pico_backend/api/v1/auth");
        properties.put("pico.endpoint.permissions", "http://192.168.12.98:8899/pico_backend/api/v1/accessobjects/allowed");


        /*Persistence settings*/
        properties.put("spring.datasource.url", "jdbc:postgresql://srv-platfoma-dev01.nauka.local/dispatch");  //injected by plugin
        properties.put("spring.datasource.password", "postgres");
        properties.put("spring.datasource.username", "postgres");
//        properties.put("spring.jpa.properties.hibernate.hbm2dll.create_namespaces", "true"); //schema creation
        properties.put("spring.jpa.hibernate.ddl-auto", "none"); //table creation

        new SpringApplicationBuilder(PlatformaApp.class).properties(properties).run(args);
    }
}
