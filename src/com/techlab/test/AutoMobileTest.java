package com.techlab.test;

import com.techlab.model.AutoMobileFactory;
import com.techlab.model.AutoType;
import com.techlab.model.IAuto;

public class AutoMobileTest {

	public static void main(String[] args) {
		AutoMobileFactory factory = new AutoMobileFactory();
		IAuto auto = factory.make(AutoType.BMW);
		auto.start();
		auto.stop();
		auto.getName();
	}

}
