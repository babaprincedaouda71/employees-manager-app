package bf.baba.backend.service;

import bf.baba.backend.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAllEmployees();
    Employee addEmployee(Employee employee);
    Employee findEmployeeById(Long id);
    Employee updateEmployee(Employee employee);
    void removeEmployee(Long id);

    List<Employee> addEmployees(List<Employee> employees);
}
