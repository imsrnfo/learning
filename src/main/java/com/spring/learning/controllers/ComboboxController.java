package com.spring.learning.controllers;

import com.spring.learning.models.Objeto;
import com.spring.learning.services.ObjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value="/combobox")
public class ComboboxController {

    @Autowired
    private ObjetoService objetoService;

    @GetMapping("/llenar")
    public String listar(Model model) {
        List<Objeto> objetos = objetoService.listar();
        model.addAttribute("objetos", objetos);
        return "combobox/llenar";
    }

}
