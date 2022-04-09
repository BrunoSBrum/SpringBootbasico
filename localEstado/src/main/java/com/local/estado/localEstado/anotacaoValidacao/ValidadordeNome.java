package com.local.estado.localEstado.anotacaoValidacao;

import java.util.ArrayList;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidadordeNome implements ConstraintValidator<ExclusivoString, String> {

	
	ArrayList<String> regiaoDB = new ArrayList<String>();
	
	@Override
	public boolean isValid(String regiao, ConstraintValidatorContext constraintValidatorContext) {
		
		regiaoDB.add("Norte");
		regiaoDB.add("Nordeste");
		regiaoDB.add("Sul");
		regiaoDB.add("Sudeste");
		regiaoDB.add("Centro Oeste");
		
		
		return regiaoDB.contains(regiao);
	
	}


	

		
	}
	
	


	
	
	


