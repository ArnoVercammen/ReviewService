package domain;

public class DestinationReview {

	private String destination;
	private String author;
	private String review;
	
	public DestinationReview() {
		
	}
	
	public DestinationReview(String destination, String author, String review) {
		this.setDestination(destination);
		this.setAuthor(author);
		this.setReview(review);
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}
	
	
	
	
}
