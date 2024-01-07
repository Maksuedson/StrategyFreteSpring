package com.strategy.frete.service;

import org.springframework.stereotype.Service;

import com.strategy.frete.interfaces.Transportadora;

@Service("jadlog")
public class JadLogTransportadoraImpl implements Transportadora{

	@Override
	public double calcularFrete() {
		return 10;
	}

}
