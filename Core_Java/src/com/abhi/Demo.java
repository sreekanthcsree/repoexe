package com.abhi;

import java.util.Optional;

public class Demo {
	
	
	public static void main(String[] args) {
		
//		Optional<String> optionalString = Optional.of(null);
//		
//		if(optionalString.isPresent()) {
//			String value = optionalString.get();
//			System.out.println("the value is : "+value);
//		}else {
//			System.out.println("Optional is empty");
//		}
//		
		Optional<String> emptyOptional=Optional.empty();	
		
		if(emptyOptional.isPresent()) {
			String value= emptyOptional.get();
			System.out.println("the value is : "+value);
		}else {
			System.out.println("Optional is  empty");
		}
	}

}
