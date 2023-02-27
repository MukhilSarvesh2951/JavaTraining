package List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class MovieTest {

	public static void main(String[] args) {
		Movie movie1=new Movie("Singam","Surya",2012);
		Movie movie2=new Movie("Friends","Vijay",2002);
		Movie movie3=new Movie("I","Vikram",2013);
		Movie movie4=new Movie("Vikram","Kamal Haasan",2022);
		Movie movie5=new Movie("Basha","Rajni",1995);
		
	
        System.out.println("Content is ready....all movies are ready...");
        
  //ArrayList is a raw type.
  //References to generic type ArrayList<E> should be parameterized      
        
        ArrayList<Movie> myPlayList = new ArrayList<Movie>(); // no [] management here....wow
        //LinkedList myPlayList = new LinkedList(); // no [] management here....wow
        //TreeSet    myPlayList = new TreeSet(); // no [] management here....wow
       // HashSet myPlayList = new HashSet(); // no [] management here....wow

        System.out.println("Collection is ready....can we add duplicate movies???");
        
        System.out.println("1st movie...adding...");
        myPlayList.add(movie1);
        
        System.out.println("2nd movie...adding...");
        myPlayList.add(movie2);
        
        System.out.println("3rd movie...adding...");
        myPlayList.add(movie3);
        
        System.out.println("4th movie...adding...");
        myPlayList.add(movie4);
        
        System.out.println("5th movie...adding...");
        myPlayList.add(movie5);
           
   
        
        System.out.println("All movies are added");
        Collections.sort(myPlayList);
        System.out.println("Sorted...");

        Iterator<Movie> movieIterator = myPlayList.iterator();  //Iterator function
        while(movieIterator.hasNext()) {
        	Movie x = movieIterator.next();
        	
        	System.out.println("x "+x);
        }
        
	}
}

class Movie implements Comparable<Movie> //isA
{
    String title;
    String artist;
    
    int year;

	@Override
	public int compareTo(Movie o) {
		
		System.out.println("comparing "+year+ " with "+o.year);
		return Integer.compare(year, o.year);
		// TODO Auto-generated method stub
		
	}

	public Movie(String title, String artist, int year) {
		super();
		this.title = title;
		this.artist = artist;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", artist=" + artist + ", year=" + year + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	

   /* @Override
	public int compareTo(Song o) { //this function is invoked by add method of TreeSet to compare two songs
		System.out.println("comparing "+year+ " with "+o.year);
		return Integer.compare(year, o.year);
	}
    */
    


  
	
}


