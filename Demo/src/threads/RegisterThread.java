package threads;

class RegisterThread extends Thread {
    Course c;

    RegisterThread(Course c) {
	    this.c = c;
    }
    public void run() {
	    c.registerForCourse(1);
    }
    
    public static void main(String args[]) {
    	Course cse = new Course("CSE", 1);
    	RegisterThread regObj1 = new RegisterThread(cse);
    	regObj1.start();
    	RegisterThread regObj2 = new RegisterThread(cse);
    	regObj2.start();
    }
}
