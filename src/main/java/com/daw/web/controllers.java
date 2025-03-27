package com.daw.web.controllers;


import java.time.LocalDate;

import java.util.ArrayList;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.daw.persistence.entities.Tarea;

import com.daw.persistence.entities.enumerados.Estado;


@RestController

@RequestMapping("/tareas")

public class TareaController {

	

	@GetMapping

	public List<Tarea> list(){

		

		Tarea tarea1 = new Tarea(1, "Comprar alimentos", "Ir al supermercado a comprar víveres", 

                LocalDate.of(2025, 3, 27), LocalDate.of(2025, 3, 29), Estado.PENDIENTE);

		Tarea tarea2 = new Tarea(2, "Hacer ejercicio", "Ir al gimnasio a hacer ejercicio", 

                LocalDate.of(2025, 3, 27), LocalDate.of(2025, 3, 28), Estado.EN_PROGRESO);

		Tarea tarea3 = new Tarea(3, "Estudiar Java", "Repasar conceptos de programación en Java", 

                LocalDate.of(2025, 3, 27), LocalDate.of(2025, 3, 30), Estado.COMPLETADA);


		List<Tarea> listaDeTareas = new ArrayList<>();

		listaDeTareas.add(tarea1);

		listaDeTareas.add(tarea2);

		listaDeTareas.add(tarea3);

		

		return listaDeTareas;

	}

}