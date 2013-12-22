class Singleton {	

static Boolean initialized = false;

static Singleton instance = null;

private Singleton() {

}

public static Singleton getInstance() {
	
	if(!initialized) {
		instance = new Singleton();
		initialized = true;
	}
		
	return instance;
	}


}