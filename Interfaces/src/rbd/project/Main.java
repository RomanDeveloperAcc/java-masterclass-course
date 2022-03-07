package rbd.project;

public class Main {

    public static void main(String[] args) {
	    ITelephone bobsPhone;

	    bobsPhone = new DeskPhone(123456);
	    bobsPhone.powerOn();
	    bobsPhone.callPhone(123456);
	    bobsPhone.answer();

	    bobsPhone = new MobalPhone(24565);
	    bobsPhone.powerOn();
	    bobsPhone.callPhone(24565);
	    bobsPhone.answer();

    }
}
