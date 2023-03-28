package com.tienda.controller;

import com.tienda.domain.Articulo;
import com.tienda.service.ArticuloService;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    ArticuloService articuloService;
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora utilizando MVC");
        var articulos = articuloService.getArticulos(true);
        model.addAttribute("articulos", articulos);
        return "index";
    }
}
