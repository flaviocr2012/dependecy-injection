package com.spring.autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Aplicacao {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan(Aplicacao.class.getPackage().getName());

		ClienteServico servico = context.getBean(ClienteServico.class);

		context.close();
	}

	}





