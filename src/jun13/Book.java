package jun13;

public class Book implements Comparable{
	int price;
	String author;
	public Book(int price, String author) {
		super();
		this.price = price;
		this.author = author;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Book b1=(Book)o;
		return this.author.compareTo(b1.author);
	}
	
}
