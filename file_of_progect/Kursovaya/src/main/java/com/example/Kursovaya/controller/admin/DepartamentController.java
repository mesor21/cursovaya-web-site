package com.example.Kursovaya.controller.admin;

import com.example.Kursovaya.service.DepartmenService;
import com.example.Kursovaya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class DepartamentController {
    @Autowired
    DepartmenService departmenService;
    @GetMapping("/departmentList")
    public String getDepController(Model model){
        model.addAttribute("allDep", departmenService.getAllDepartament());
        return "admindepartament";
    }
    @PostMapping("/addDepartment")
    public String addNewDep(){
        departmenService.addNewDep();
        return "redirect:/admin/departmentList";
    }
}
