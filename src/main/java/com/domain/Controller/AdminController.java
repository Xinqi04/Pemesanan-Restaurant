package com.domain.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.domain.model.entities.Admin;
import com.domain.services.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("admins", adminService.findAll());
        model.addAttribute("admin", new Admin());
        return "admin";
    }

    @PostMapping
    public String createOrUpdate(@ModelAttribute Admin admin) {
        adminService.save(admin);
        return "redirect:/admin";
    }

    @GetMapping("/delete/{id}")
    public String removeOne(@PathVariable("id") Long id) {
        adminService.removeOne(id);
        return "redirect:/admin";
    }
}
