package com.github.MichaelJBradley.util.Menu;

import java.util.Collection;

public class ImmutableMenu extends Menu {

	public ImmutableMenu() {
		super();
	}
	
	public ImmutableMenu(Collection<Option> c) {
		super(c);
	}
}
