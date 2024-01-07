package com.strategy.frete.controller;

import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.strategy.frete.interfaces.Transportadora;

@RestController
@RequestMapping("/transportadora")
public class StratageyController {
	
    @Autowired
    private Map<String, Transportadora> transportadoraMap;

    @GetMapping("frete")
	public Double obterFrete(@RequestParam String transportadora) {
		Transportadora transportadoraImpl = transportadoraMap.get(transportadora);
		
		if (Objects.nonNull(transportadoraImpl)) {
			return transportadoraImpl.calcularFrete();
		}
		
		throw new RuntimeException("Transportadora não encontrada.");
	}
}
