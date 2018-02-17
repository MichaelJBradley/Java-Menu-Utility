package com.github.MichaelJBradley.util.Menu;

import java.util.Collection;
import java.util.Iterator;

public class OptionIterator implements Iterator <Option> {

	Menu options;
	int current;
	
	public OptionIterator() {
		current = 0;
	}
	
	public OptionIterator(Collection<Option> c) {
		options = ImmutableMenu(c);
	}
	
	@Override
	public boolean hasNext() {
		if (current + 1 >= options.size()) {
			return false;
		}
		
		return options.get(current + 1) != null;
	}

	@Override
	public Option next() {
		return options.get(current++);
	}

}
