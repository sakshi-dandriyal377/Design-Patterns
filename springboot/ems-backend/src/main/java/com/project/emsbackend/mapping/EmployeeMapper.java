package com.project.emsbackend.mapping;

import com.project.emsbackend.dto.EmployeeDto;
import com.project.emsbackend.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                                employee.getId(),
                                employee.getFirstName(),
                                employee.getLastName(),
                                employee.getEmail()
                              );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                            employeeDto.getId(),
                            employeeDto.getFirstName(),
                            employeeDto.getLastName(),
                            employeeDto.getEmail()
        );
    }
}
