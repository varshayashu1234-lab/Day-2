package varsha;
 	interface Atm {
	    void depo();
	}

	interface Atm1 {
	    void min();
	}

	public class Interface implements Atm, Atm1 {

	    public void depo() {
	        System.out.println("dep");
	    }

	    public void min() {
	        System.out.println("min");
	    }

	    public static void main(String[] args) {

	        Interface v = new Interface();

	        v.min();
	        v.depo();
	    }
	}

