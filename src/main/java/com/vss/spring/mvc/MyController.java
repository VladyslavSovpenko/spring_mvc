package com.vss.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askDetails(Model model) {
        Employee employee = new Employee();
        employee.setSalary(300);
        model.addAttribute("employee", employee);
        return "ask-emp-details";
    }

//    @RequestMapping("/showDetails")
//    public String showDetails(){
//        return "show-emp-details";
//    }

    //    @RequestMapping("/showDetails")
//    public String showDetails(HttpServletRequest request, Model model){
//        String name = request.getParameter("employeeName");
//        model.addAttribute("nameAttribute", "Mr. "+name);
//        return "show-emp-details";
//    }

    @RequestMapping("/showDetails")
    public String showDetails(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "ask-emp-details";
        } else {
            return "show-emp-details";
        }
    }
}
