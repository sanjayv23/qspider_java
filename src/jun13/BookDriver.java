package jun13;

import java.util.Arrays;

public class BookDriver {
	public static void main(String[] args) {
		Book b1=new Book(500,"ab");
		Book b2=new Book(300,"ef");
		Book b3=new Book(100,"cd");
		Book b4=new Book(400,"gh");
		Book b5=new Book(200,"ij");
		Book[] books= {b1,b2,b3,b4,b5};
		
		for(Book b:books) {
			System.out.println(b.price+" "+b.author);
		}
		Arrays.sort(books);
		System.out.println("-----");
		for(Book b:books) {
			System.out.println(b.price+" "+b.author);
		}
	}
}
