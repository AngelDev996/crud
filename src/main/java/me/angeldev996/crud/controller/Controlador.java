//Autor: Angel Valladares
//Date: 01-09-2021

package me.angeldev996.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import me.angeldev996.crud.interfaceService.InterfazPersonaService;
import me.angeldev996.crud.model.Persona;

@Controller
@RequestMapping
public class Controlador {

	@Autowired
	private InterfazPersonaService service;

	@GetMapping("/listar")
	public String listar(Model model) {
		List<Persona> personas = service.listar();
		model.addAttribute("personas", personas);
		return "index";
	}
	
	
	@GetMapping("/new")
	public String agregar(Model modelo) {
		
		modelo.addAttribute("persona", new Persona());
		
		return "formulario";
	}
	
	
	@PostMapping("/save")
	public String save(Persona p,  Model modelo) {
		service.save(p);
		return "redirect:/listar";
		
	}
	
	
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id,  Model modelo) {
		
		Optional<Persona>persona= service.ListarId(id);
		
		modelo.addAttribute("persona", persona);
		
		return "formulario";
	}
	
	
	
	@GetMapping("/eliminar/{id}")
	public String delete(Model modelo, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}
	
}
