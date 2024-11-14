package com.springrest.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
		//(exclude = {DataSourceAutoConfiguration.class })
public class SpringrestApplication  {


	/*public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
	}*/

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringrestApplication.class, args);
		//StudentService studentService= context.getBean(StudentServiceImple.class);

		/*Student st = new Student();
		st.setId(12345);
		st.setMarks(50);
		st.setRollno(1);
		st.setName("Spring");*/

		UserService userService = context.getBean(UserServiceImple.class);

		User user = new User();

		boolean status=userService.addUserService(user);
		if(status)
		{
			System.out.println("Inserted");
		}
		else
		{
			System.out.println("Not Inserted");
		}
	}
}


