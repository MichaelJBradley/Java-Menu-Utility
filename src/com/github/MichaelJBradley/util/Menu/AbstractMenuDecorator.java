package com.github.MichaelJBradley.util.Menu;

public abstract class AbstractMenuDecorator {

	protected Menu menu;
	
	
	/**
	 * Constructs an AbstractMenuDecorator object with its {@link Menu} reference set to {@code null}.
	 */
	public AbstractMenuDecorator() {
		menu = null;
	}
	
	/**
	 * Constructs an AbstractMenuDecorator object with its {@link Menu} reference set to menu.
	 * @param menu the Menu object to be decorated.
	 */
	public AbstractMenuDecorator(Menu menu) {
		setMenu(menu);
	}
	
	
	//-- Accessors and Mutators --\\
	/**
	 * @return the {@link Menu} to be decorated.
	 */
	public Menu getMenu() {
		return menu;
	}
	
	/**
	 * Set the {@link Menu} to be decorated.
	 * @param menu the Menu object to be decorated.
	 * @return a reference to this object.
	 */
	public AbstractMenuDecorator setMenu(Menu menu) {
		this.menu = menu;
		return this;
	}
	
	
	//-- Decoration --\\
	@Override
	/**
	 * Concrete Menu decorator classes override this method to decorate the menu.
	 */
	public abstract String toString();
}
