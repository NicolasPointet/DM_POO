package com.tpnote.pointet.controller;

import com.tpnote.pointet.model.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddressesController {

    @Autowired
    AddressRepository addressRepository;

    @GetMapping("/adresses")
    public String greeting(Model model) {
        model.addAttribute("allAddresses", addressRepository.findAll());
        return "addresses";
    }
}
