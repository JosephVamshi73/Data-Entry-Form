package com.example.dataentry.controller;

import com.example.dataentry.model.UserEntry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FormController {

    private final List<UserEntry> entries = new ArrayList<>();

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("userEntry", new UserEntry());
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute UserEntry userEntry, Model model) {
        if (userEntry.getName() == null || userEntry.getName().isBlank() ||
            userEntry.getTitle() == null || userEntry.getTitle().isBlank()) {
            model.addAttribute("error", "Name and Title are required!");
            return "form";
        }

        entries.add(userEntry);
        model.addAttribute("latest", userEntry);
        model.addAttribute("entries", entries);
        return "confirm";
    }
}