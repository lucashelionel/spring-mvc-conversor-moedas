package br.com.unipe.projeto.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("br.com.unipe.projeto")
@EnableWebMvc
public class RootConfig {
	
	
}
