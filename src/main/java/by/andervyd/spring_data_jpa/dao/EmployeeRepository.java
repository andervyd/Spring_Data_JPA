package by.andervyd.spring_data_jpa.dao;

import by.andervyd.spring_data_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    public List<Employee> findAllByName(String name);
}
