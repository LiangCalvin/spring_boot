package com.sirapopb.app_sirapopb;

import com.sirapopb.app_sirapopb.entity.Person;
import com.sirapopb.app_sirapopb.repository.PersonDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AppSirapopbApplication {

	public static void main(String[] args) {

		SpringApplication.run(AppSirapopbApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(PersonDAO dao){
		return runner->{
//			saveData(dao);
//			deleteData(dao);
			getData(dao);
			getAllData(dao);
			updateData(dao);
		};
	}

	public void saveData(PersonDAO dao) {
		Person KimK = new Person("J","B");
		dao.save(KimK);
		System.out.println("Finished update");
	}

	public void deleteData(PersonDAO dao) {
		int j=5;
		dao.delete(j);
		System.out.println("finished delete");
	}

	public void getData(PersonDAO id) {
		int a= 6;
		Person result = id.get(a);
		System.out.println("finished fetch: " + result);
	}

	public void getAllData(PersonDAO dao) {
		List<Person> result = dao.getAll();
		for (Person i: result) {
			System.out.println(i);
		}
		System.out.println("All :"+result);
	}

	public void updateData(PersonDAO dao) {
		int j=6;
		Person result = dao.get(j);
		result.setFirst_name("Mark");
		result.setLast_name("Z");
		Person update_result = dao.update(result);
		System.out.println("Updated!" + result);
	}
}
