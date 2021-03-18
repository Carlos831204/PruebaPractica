package com.test.job.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.test.job.dto.ArrayRegistrosDTO;
import com.test.job.dto.Mensaje;
import com.test.job.dto.RegistroDto;
import com.test.job.entity.Registro;
import com.test.job.service.RegistroService;

@Controller
@RequestMapping("/registro")
public class RegistroController {

	@Autowired
	RegistroService registroService;

	@GetMapping("/lista")
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/registro/lista");
		List<Registro> registros = registroService.list();
		mv.addObject("registros", registros);
		return mv;
	}

	@GetMapping("nuevo")
	public String nuevo() {

		return "registro/nuevo";
	}

	@PostMapping("/guardar")
	public ModelAndView crear(@RequestParam String nombre, @RequestParam String apellido) {
		ModelAndView mv = new ModelAndView();

		Registro registro = new Registro(nombre, apellido, false);
		registroService.save(registro);
		mv.setViewName("redirect:/registro/nuevo");
		return mv;
	}

	@PostMapping("/actualizar")
	public ModelAndView actualizar(@RequestBody List<Registro> listaRegistros) {
		ModelAndView mv = new ModelAndView();
		
		for(Registro registro: listaRegistros) {
			Registro r = registroService.getOne(registro.getId()).get();
			r.setProcesado(true);
			registroService.save(r);
			System.out.println("El registro con id " + r.getId() + " ha sido actualizado");
		}

		return new ModelAndView("redirect:/registro/lista");

	}

}
