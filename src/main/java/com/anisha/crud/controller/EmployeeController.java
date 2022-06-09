package com.anisha.crud.controller;

import com.anisha.crud.model.Employee;
import com.anisha.crud.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo repo;

    @RequestMapping(method = RequestMethod.GET,value = "/getEmployee")
    public List<Employee> getEmployee() {
        return repo.findAll();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/postEmployee")
    public String AddEmployee(@RequestBody Employee employee){
        repo.save(employee);
        return "Added Successfully";
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/delEmployee/{id}")
    public String DelEmployee(@PathVariable int id){
        repo.deleteById(id);
        return "Deleted Successfully";
    }
}
