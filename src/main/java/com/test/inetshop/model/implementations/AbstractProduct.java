package com.test.inetshop.model.implementations;

import java.util.Map;

import com.test.inetshop.model.interfaces.Product;

public abstract class AbstractProduct implements Product {

	private double cost;
	private String name;
	private String title;
	private long id;
	private Map<String, String> description;
	
}
