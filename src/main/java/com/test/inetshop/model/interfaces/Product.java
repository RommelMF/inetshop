package com.test.inetshop.model.interfaces;

import java.util.Map;

public interface Product {
	
	public double getCost();
	public void setCost(double cost);
	
	public long getId();
	public void setId(long id);
	
	public String getTitle();
	public void setTitle(String title);
	
	public String getName();
	public void setName(String name);
	
	public Map<String, String> getMapCharacters(); 
	public void setMapCharacters(Map<String, String> map);
	
}
