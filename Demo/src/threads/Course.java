package threads;

class Course {
    String courseName;
    int numOfSeats;
    
    public Course(String courseName, int numOfSeats) {
        this.courseName = courseName;
        this.numOfSeats = numOfSeats;
    }
    
    /*
    public void registerForCourse(int rollNo) {
        try {
            if(this.numOfSeats - 1 < 0) {
                throw new Exception("No more seats available for this course");
            }
            System.out.println("Booking successful!");
            this.numOfSeats -= 1;
            System.out.println("Available seats: " + this.numOfSeats);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    */
    
    /*
    public synchronized void registerForCourse(int rollNo) {
        try {
            if(this.numOfSeats - 1 < 0) {
                throw new Exception("No more seats available for this course");
            }
            System.out.println("Booking successful!");
            this.numOfSeats -= 1;
            System.out.println("Available seats: " + this.numOfSeats);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    */
    
    public synchronized void registerForCourse(int rollNo) {
        try {
            if(this.numOfSeats - 1 < 0) {
                this.wait(5000);                    // This releases the lock on the object and waits for 5 seconds
                if(this.numOfSeats - 1 < 0)         // Check if any seat got released by the Cancellation 
                throw new Exception("No more seats available for this course");
            }
            System.out.println("Booking successful!");
            this.numOfSeats -= 1;
            System.out.println("Available seats: " + this.numOfSeats);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public synchronized void cancelSeats() {
        try {
            this.numOfSeats += 1;
            System.out.println("Cancellation successful!");
            System.out.println("Available seats: " + this.numOfSeats);
           // since we are using sleep with time it will auto resume after time lapse 
            this.notify();    // Notifies one of the waiting threads to resume
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
