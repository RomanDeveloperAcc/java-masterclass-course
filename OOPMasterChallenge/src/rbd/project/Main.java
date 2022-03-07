package rbd.project;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
	    hamburger.addHamburgerAddition1("Tomato", 0.27);
	    hamburger.addHamburgerAddition2("Lettuce", 0.75);
	    hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total burger price " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
		System.out.println("Total healthy burger price " + healthyBurger.itemizeHamburger());

		DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
		deluxeHamburger.addHamburgerAddition1("Something", 1.11);
		System.out.println("Total deluxe burger price " + deluxeHamburger.itemizeHamburger());
	}
}
