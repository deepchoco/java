package com.varxyz.jvx330.di.example7;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;

@Component("menuItemDao")
public class MenuItemDao {
	private static final List<MenuItem> MENU = new ArrayList<MenuItem>();
	
	public void save(MenuItem item) { 
		if(!MENU.contains(item)) {//중복검사 contains 는 리스트안에 객체를 @EqualsAndHashCode를 이용해 안에 해쉬코드 값을 비교해서 같은 지 않같은지 비교
			MENU.add(item);
		}
	}
	
	public List<MenuItem> findAllMenuItemList() {//물품 전체찾기
		return MENU;
	}
	
	public MenuItem findByName(String name) {//이름으로 물품찾기
		for(MenuItem item : MENU) {
			if(item.getName().equals(name)) {
				return item;
			}
		}
		throw new RuntimeException(name + "menu does exist");
	}
}
