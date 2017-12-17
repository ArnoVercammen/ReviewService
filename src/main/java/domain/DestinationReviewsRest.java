package domain;

import java.util.ArrayList;

public class DestinationReviewsRest {
	
	private ArrayList<DestinationReview> reviewList;
	
	public DestinationReviewsRest() {
		reviewList = new ArrayList<DestinationReview>();
		
	}
	
	public void setDestinationReviewsRest(ArrayList<DestinationReview> reviewList) {
		this.reviewList = reviewList;
	}
	public ArrayList<DestinationReview> getDestinationReviewsRest() {
		return this.reviewList;
	}
}
