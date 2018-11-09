package com.github.MichaelJBradley.util.jmu.Menus.Decorators;

import com.github.MichaelJBradley.util.jmu.Menus.Menu;

public class PaddedBottomMenu extends PaddedMenu {

	public PaddedBottomMenu() {
		super();
	}
	
	public PaddedBottomMenu(Menu menu, int pads) {
		super(menu, pads);
	}
	
	//-- Decoration --\\
	@Override
	public String toString() {
		StringBuilder ret = new StringBuilder(menu.toString());
		for (int i = 0; i < pads; i++) {
			ret.append("\n");
		}
		
		return ret.toString();
	}
}
