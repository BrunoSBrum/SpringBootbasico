package com.local.estado.localEstado.anotacaoValidacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidadordeNome.class)
public @interface ExclusivoString {
	String message() default " Somente é permitido Regiões: Norte, Nortedeste, Sul, Sudeste e Centro Oeste";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload> [] payload() default {};
	
}
