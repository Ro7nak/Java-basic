package jUnit;

class Books{
	int bookId;
	String bookName;
	
	public Books(int bookId, String bookName) {
		this.bookId = bookId;
		this.bookName = bookName;
	}
	
    @Override
    public boolean equals(Object anObject) {
    	Books bookObjThird = (Books) anObject;
        if (bookId == bookObjThird.bookId) {
            return true;
        }
		return false;  
 }
}
