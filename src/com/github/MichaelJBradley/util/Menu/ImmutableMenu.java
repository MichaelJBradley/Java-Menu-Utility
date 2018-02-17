package com.github.MichaelJBradley.util.Menu;

import java.util.Collection;

public class ImmutableMenu extends Menu {

	//-- Instance Members --\\
	private Option[] options;
	
	
	//-- Constructors --\\
	public ImmutableMenu() {
		super();
	}
	
	public ImmutableMenu(Collection<Option> c) {
		super(c);
	}

	
	//-- Options --\\
	@Override
	public Option get(int index) {
		return options[index];
	}

	@Override
	public Option set(int index, Option element) {
		Option ret = get(index);
		options[index] = element; 
		return ret;
	}
	
	/**
	 * Sets options array to elements.
	 * @param elements the array of options to set.
	 * @return the options previously associated with this Menu
	 */
	public Option[] setAll(Option[] elements) {
		Option[] ret = options;
		options = elements;
		return ret;
	}
	
	@Override
	public int size() {
		return options.length;
	}

	
	//-- Miscellaneous --\\
	@Override
	public Menu copy(Menu other) {
		return null;
	}
	
	
	//-- Unused --\\
	@Override
	public boolean add(Option e) {
		return false;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}
	
	@Override
	public boolean addAll(Collection<? extends Option> c) {
		return false;
	}
	
	@Override
	public boolean addAll(int index, Collection<? extends Option> c) {
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}

	@Override
	public void add(int index, Option element) {
	}

	@Override
	public Option remove(int index) {
		return null;
	}

	@Override
	public void clear() {
	}
}
