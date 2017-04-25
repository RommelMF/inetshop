package shop.models;

import shop.models.impl.StoneSort;

import java.util.List;

public interface Manager {

	/*
	*return all goods type
	*/
	List<StoneSort> getAllSorts();
	
	/*
	* change stone's quantity. If we want increase quantity, 
	* we just set positive params,
	* if we wand decrease - set negative params
	*/
	void changeQuantity(int counter, StoneSort id);
	
	/*
	* return StoneSort by this name
	*/
	StoneSort getByName(String name);
	
	/*
	* return StoneSort by this ID
	*/
	StoneSort getById(long id);
	
	
	/*
	* adding new StoneSort
	*/
	void setStoneSort(StoneSort instance);
	
	void removeByName(String name);
	
	void removeById(long id);
	
	
	
}
