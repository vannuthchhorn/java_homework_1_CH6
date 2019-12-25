package homework;

public class Book {
 
	public String title;
	public String author;
	public int publishYear;
	public boolean isBorrowed;
	
	public Book(String title, String autor, int publishYear) {
		this.title = title;
		this.author = autor;
		this.publishYear = publishYear;
	}
	// borrowed 
	public void borowed() {
		isBorrowed = true;
	}
	// NOT borrowed
	public void returnBack() {
		isBorrowed = false;
	}
	// title of a book
	String getTitle() {
		return title;
	}
	// author of a book
	String getAutor() {
		return author;
	}
   //year of publishYear
	int getPublishYear() {
		return publishYear;
	}
	// whether or not a book is new borrowed
	public String isBorrowed() {
		String BorrowedBooks;
		if(isBorrowed == true) {
			BorrowedBooks= "Not available ";
		}else {
			BorrowedBooks=  "Available";
		}
		return BorrowedBooks;
	}
	// displays all
	public String toString() {
		return "Title : "+title +"\n\t "+ author+"--published" +" "+ publishYear +" \n\t "+"Status: " + isBorrowed() + "to borrow";
	}
}