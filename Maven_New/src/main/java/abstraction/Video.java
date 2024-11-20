package abstraction;

public class Video extends Google
{
public void search()
{
	System.out.println("Search video on google chrome");
}
	public static void main(String[] args) 
	{
		Video video=new Video();
		video.search();
		Image image=new Image();
		image.search();
	}

}
