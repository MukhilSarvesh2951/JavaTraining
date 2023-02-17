
public class OverridingTest {

	public static void main(String[] args) {

	    Newspaper newspaper= new Newspaper();
		newspaper.ShowingNews();
		newspaper.ShowingComedy();
		System.out.println("-------");

		Magazine magazine=new Magazine();
		magazine.ShowingAdvertisements();
		magazine.ShowingComedy();
		magazine.ShowingNews();

		SocialMedia socialmedia=new SocialMedia();
		socialmedia.ShareMedia();
		socialmedia.ShowingAdvertisements();

	}

}

class Newspaper
{
	int news=100;
	int comedy=10;

	void ShowingNews() { //overridden/hidden
		System.out.println("Newspaper is for news...");
	}
	void ShowingComedy() {
		System.out.println("Newspaper has comics....");
	}
}
class Magazine extends Newspaper
{
	void ShowingNews() { //re-defn / overriding /hiding
		System.out.println("Magazine has news....");
	}
	void ShowingComedy() {
		System.out.println("Magazine shows Comedy...");
	}
	void ShowingAdvertisements() {
		System.out.println("Magazine has advertisements...");
	}
}

class SocialMedia extends Magazine
{
	void ShowingNews() { //re-defn / overriding /hiding
		System.out.println("SocialMedia has news....");
	}
	void ShowingComedy() {
		System.out.println("SocialMedia shows Comedy...");
	}
	void ShowingAdvertisements() {
		System.out.println("SocialMedia has advertisements...");
	}
	void ShowingMemes() {
		System.out.println("SocialMedia has memes...");
	}
	void ShareMedia() {
		System.out.println("SocialMedia shares media...");
	}
}

