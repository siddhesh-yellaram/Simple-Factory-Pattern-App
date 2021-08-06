package com.techlab.model;

public class AutoMobileFactory {
	public IAuto make(AutoType a) {
		if(a == AutoType.AUDI) {
			return new Audi();
		}else if(a == AutoType.BMW) {
			return new BMW();
		}else {
			return new Tesla();
		}
	}
}
