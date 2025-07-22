package com.br.todolistapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Configuration
public class EnvConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();

        try {
            File envFile = new File(".env"); // Lê o arquivo .env na raiz do projeto
            if (envFile.exists()) {
                Properties envProperties = new Properties();
                envProperties.load(new FileInputStream(envFile)); // Carrega as variáveis

                configurer.setProperties(envProperties); // Injeta no Spring
            }
        } catch (IOException e) {
            throw new RuntimeException("Falha ao carregar o arquivo .env", e);
        }

        return configurer;
    }
}