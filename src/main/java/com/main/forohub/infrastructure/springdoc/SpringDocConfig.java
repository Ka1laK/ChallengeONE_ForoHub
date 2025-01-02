package com.main.forohub.infrastructure.springdoc;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes("bearer-key",
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")))
                .info(new Info()
                        .title("ForoHub")
                        .description("La API Rest de ForoHub ofrece operaciones CRUD, con autenticacion, paginacion y respuestas JSON")
                        .contact(new Contact()
                                .name("Ka1laK")
                                .email("kailak@example.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://github.com/Ka1laK")));
    }
}
