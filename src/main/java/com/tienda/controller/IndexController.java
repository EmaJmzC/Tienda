package com.tienda.controller;

import com.tienda.dao.ClienteDao;
import com.tienda.domain.Cliente;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author PC
 */
@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    ClienteDao clienteDao;
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora utilizando MVC");
        //String mensaje = "Estamos en semana 4, saludos!";
        //model.addAttribute("MensajeSaludo", mensaje);
        
        //Cliente cliente = new Cliente ("Emanuel","Jimenez","ejmz141@gmail.com","12345678");
        //Cliente cliente2 = new Cliente ("Carlos","Calvo","carlos@gmail.com","12345678");
        //Cliente cliente3 = new Cliente ("Juan","Jimenez","juan@gmail.com","18345678");
        
        //model.addAttribute("cliente", cliente);
        
        //List<Cliente> clientes = Arrays.asList(cliente,cliente2,cliente3);
        
        var clientes = clienteDao.findAll();
        model.addAttribute("clientes", clientes);
        
        return "index";
    }
    
}
