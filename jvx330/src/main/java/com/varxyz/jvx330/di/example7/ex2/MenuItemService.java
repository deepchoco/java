package com.varxyz.jvx330.di.example7.ex2;

import java.util.List;

public interface MenuItemService {
	void addMenuItem(MenuItem menuitem);
	
	List<MenuItem> findAllMenu();
	
}
