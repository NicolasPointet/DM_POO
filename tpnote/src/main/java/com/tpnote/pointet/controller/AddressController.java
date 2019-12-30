package com.tpnote.pointet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddressController {

    @GetMapping("/adresse")
    public String greeting(Model model) {
        return "address";
    }
}
