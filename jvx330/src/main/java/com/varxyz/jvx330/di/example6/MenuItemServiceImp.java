package com.varxyz.jvx330.di.example6;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class MenuItemServiceImp implements MenuItemService {
	
	@Autowired
	MenuItemDao menuItemDao;
	
	@Override
	public void addItem(String name, int price) {
		
	}

	@Override
	public List<MenuItem> findAllMenu() {
		return null;
	}

	@Override
	public MenuItem findMenuByName() {
		return null;
	}

}
