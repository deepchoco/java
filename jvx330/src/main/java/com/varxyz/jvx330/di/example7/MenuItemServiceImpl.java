package com.varxyz.jvx330.di.example7;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("menuItemService")
public class MenuItemServiceImpl implements MenuItemService {
	
	@Autowired
	private MenuItemDao itemDao;
	
//	autowire를 사용하면 위코드처럼 코드량을 줄일수있다 하지만 밑의 쓰지않는 코드에 써놔도 문제가 없음
//	public void setItemDao(MenuItemDao itemDao) {
//		this.itemDao = itemDao
//	}
	
	@Override
	public void addMenuItem(MenuItem item) {
		itemDao.save(item);
	}
	
	@Override
	public List<MenuItem> getAllMenuItemList() {
		return itemDao.findAllMenuItemList();
	}
	
	@Override
	public MenuItem getMenuItem(String name) {
		return itemDao.findByName(name);
	}
}
