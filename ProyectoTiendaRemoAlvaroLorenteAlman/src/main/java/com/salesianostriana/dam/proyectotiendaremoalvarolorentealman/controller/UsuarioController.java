package com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.model.Usuario;
import com.salesianostriana.dam.proyectotiendaremoalvarolorentealman.service.UsuarioService;

@Controller
@RequestMapping("/templates")
public class UsuarioController {
	@Autowired
    private UsuarioService usuarioService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute Usuario usuario) {
        usuarioService.save(usuario);
        return "redirect:/usuarios/login";
    }
    
 
    /*
     *  se leen todos los registros de la tabla ‘usuario’,
     * */
    @RequestMapping(value="", method = RequestMethod.GET)
    public String listaUsuarios(Model model){
        model.addAttribute("usuarios", usuarioService.findAll());
        return "templates/lista";
    }
 
    @RequestMapping(value="/nuevo", method=RequestMethod.GET)
    public String nuevo(Model model){
        model.addAttribute("usuario", new Usuario());
        return "templates/nuevo";
    }
    
    
    /*metodo crear, antes de crear e insertar un elemento en la base de datos, 
     * se encarga de comprobar que 
     * los valores que se le pasan sean correctos
     * 
     * */
    @RequestMapping(value="/crear", method=RequestMethod.POST)
    public String crear(Usuario usuario,
            BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "/templates/nuevo";
        }else{
            usuarioService.save(usuario);
            model.addAttribute("usuario", usuario);
            return "templates/creado";
        }
    }
    /*
     * muestra los valores del nuevo registro
     * */
    @RequestMapping(value="/creado", method = RequestMethod.POST)
    public String creado(@RequestParam("usuario") Usuario usuario){
        return "/templates/creado";
    }
 

}
