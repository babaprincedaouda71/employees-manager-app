package bf.baba.backend;

import bf.baba.backend.entity.Employee;
import bf.baba.backend.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class BackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackEndApplication.class, args);
    }

    @Bean
    CommandLineRunner start(EmployeeService employeeService){
        return args -> {
            List<Employee> employeeList = List.of(
                    Employee.builder()
                            .name("Baba Prince")
                            .email("babaprince@gmail.com")
                            .phone("+212693823094")
                            .employeeCode(UUID.randomUUID().toString())
                            .jobTitle("Java")
                            .imageUrl("https://bootdey.com/img/Content/avatar/avatar1.png")
                            .build(),
                    Employee.builder()
                            .name("Abdoul Azize")
                            .email("abdoulaziz@gmail.com")
                            .phone("+212693823094")
                            .employeeCode(UUID.randomUUID().toString())
                            .jobTitle("UIX Desinger")
                            .imageUrl("https://bootdey.com/img/Content/avatar/avatar2.png")
                            .build(),
                    Employee.builder()
                            .name("Boris Samne")
                            .email("borissamne@gmail.com")
                            .phone("+212693823094")
                            .jobTitle("R")
                            .employeeCode(UUID.randomUUID().toString())
                            .imageUrl("https://bootdey.com/img/Content/avatar/avatar3.png")
                            .build()
            );

            employeeService.addEmployees(employeeList);
        };
    }

}
