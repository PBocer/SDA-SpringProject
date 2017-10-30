package com.sda.springjavapoz4;

import com.sda.springjavapoz4.service.SomeService;
import com.sun.media.sound.SoftMidiAudioFileReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class MySpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringApplication.class, args);
	}
	@Primary
	@Bean
	public SomeService someService(){
		return new SomeService("My secret message");
	}

	@Bean
	public SomeService aboutService(){
		return new SomeService("About service");

	}
}