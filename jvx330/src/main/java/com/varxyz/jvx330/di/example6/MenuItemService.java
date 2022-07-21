package com.varxyz.jvx330.di.example6;

import java.util.List;

public interface MenuItemService {
	void addItem(String name, int price);
	
	List<MenuItem> findAllMenu();
	
	MenuItem findMenuByName();

}
