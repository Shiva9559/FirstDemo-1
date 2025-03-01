package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstDemo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(FirstDemo1Application.class, args);
		TeksStudent ts = new TeksStudent(101, "Shiva", "springboot");
		TeksStudent ts1 = new TeksStudent(102, "Nitin", "php");
		TeksStudent ts2 = new TeksStudent(103, "Naveen", "python");
		TeksStudent ts3 = new TeksStudent(104, "Karthik", "genai");
		TeksStudent ts4 = new TeksStudent(105, "Subbu", "java");
		
		MyRepo repo= context.getBean(MyRepo.class);
	    //repo.save(ts2);
		//repo.saveAll(List.of(ts,ts1,ts2,ts3,ts4));
		//repo.count();
		Optional<TeksStudent> record =  repo.findById(105);
		//System.out.println(record);
		Iterable<TeksStudent> all= repo.findAll();
		all.forEach(data->System.out.println(data));
		
		System.out.println("Records Inserted");
	}

}
