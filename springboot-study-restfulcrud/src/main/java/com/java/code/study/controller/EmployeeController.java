package com.java.code.study.controller;

import com.java.code.study.dao.DepartmentDao;
import com.java.code.study.dao.EmployeeDao;
import com.java.code.study.entities.Department;
import com.java.code.study.entities.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @author zouw
 * @date Created in 8:13 PM 2019/5/11
 */
@Controller
public class EmployeeController {

    @Resource
    DepartmentDao departmentDao;

    @Resource
    private EmployeeDao employeeDao;
    @GetMapping(value = "/emps")
    public String list(Model model) {
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps",employees);
        return "emp/list";
    }

    @GetMapping(value = "/emp")
    public String toAddPage(Model model) {
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }

    @PostMapping(value = "/emp")
    public String addEmp(Employee employee) {
        employeeDao.save(employee);
        //重定向
        return "redirect:/emps";
    }

    @GetMapping(value = "emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id,Model model) {
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp",employee);
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }

    @PutMapping(value = "/emp")
    public String updateEmployee(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/emps";

    }

    @DeleteMapping("/emp/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id) {
        employeeDao.delete(id);
        return "redirect:/emps";
    }
}
