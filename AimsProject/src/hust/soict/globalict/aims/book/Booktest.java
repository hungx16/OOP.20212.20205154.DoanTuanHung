package hust.soict.globalict.aims.book;

import java.util.ArrayList;

import hust.soict.globalict.aims.media.Book;

public class Booktest {

	public static void main(String[] args) {
		ArrayList<String>authors=new ArrayList<String>();
		authors.add("Hung");
		authors.add("Hien");
		Book b1=new Book("Harry potter and the lost treasure","Novel",18.67f,authors);
		System.out.println(b1.toString());

	}

}
