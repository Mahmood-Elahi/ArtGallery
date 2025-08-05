package artGallery;
public class Art {
	private String title;
	private String artistName;
	private int year;
	private double price;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Title: " + title + "\nArtist: " + artistName + "\nYear: " + year + "\nPrice: $" + price;
	}
}