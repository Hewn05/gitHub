package array;

public class Book {

	private String bookName;
	private String author;
	
	public Book() {}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	public void setBookName(String str) {
		bookName = str;
	}
	
	public void setAuthor(String str) {
		author = str;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void printBookInfo() {
		System.out.println("제목 : " +  bookName + "\t저자 : " + author);
	}
	
	public Book clone() {
		Book res = new Book();
		res.bookName = this.bookName;
		res.author = this.author;
		
		return res;
	}
	
}
