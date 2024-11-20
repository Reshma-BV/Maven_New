package aggregation;

public class Book 
{
	String bookname;
	int bookid;
	String publication;
	double price;
	Author author;
	
	Book(String bookname, int bookid, String publication, double price, Author author)
	{
		this.bookname=bookname;
		this.bookid=bookid;
		this.publication=publication;
		this.price=price;
		this.author=author;
	}
	
	public void display()
	{
		System.out.println(bookname+" "+bookid+" "+publication+ " "+price);
		System.out.println(author.authorfirstname+author.authorlastname+author.authorage+author.authornationality);
	}

	public static void main(String[] args) 
	{
		
		Author objauth=new Author("JK","Rowling",60,"British");
		Book objbook=new Book("Harry Potter",7,"Bloomsbury",30.5,objauth);
		objbook.display();
	}

}
