package com.strategy.frete.service;

import org.springframework.stereotype.Service;

import com.strategy.frete.interfaces.Transportadora;

@Service("camilo")
public class CamiloDosSantosTransportadoraImpl implements Transportadora {

	@Override
	public double calcularFrete() {
		return 20;
	}

}
