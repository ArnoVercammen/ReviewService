package db;

import java.util.ArrayList;

import domain.DestinationReview;

public class DestinationReviewRepositoryInMemory implements DestinationReviewRepository  {
	
	private ArrayList<DestinationReview> reviewList;
	
	public DestinationReviewRepositoryInMemory() {
		reviewList = new ArrayList<DestinationReview>();
		DestinationReview leuven1 = new DestinationReview("Leuven","Arno","Heel Leuke stad!");
		DestinationReview leuven2 = new DestinationReview("Leuven","Vincent","Zeer geschikt voor jongeren die is goed willen feeste!");
		this.reviewList.add(leuven1);
		this.reviewList.add(leuven2);
		DestinationReview brussel1 = new DestinationReview("Brussel","Barry","toffe stad!");
		DestinationReview brussel2 = new DestinationReview("Brussel","Gilles","zeker een aanrader!");
		this.reviewList.add(brussel1);
		this.reviewList.add(brussel2);
		DestinationReview brugge1 = new DestinationReview("Brugge","Niel","heb me goed geamusseerd!");
		DestinationReview brugge2 = new DestinationReview("Brugge","Nico","zeker een aanrader!");
		this.reviewList.add(brugge1);
		this.reviewList.add(brugge2);
		
	}
	
	public ArrayList<DestinationReview> getReviewsDestination(String destination){
		ArrayList<DestinationReview> result = new ArrayList<DestinationReview>();
		for(DestinationReview d : this.reviewList) {
			if(d.getDestination().equals(destination)) {
				result.add(d);
			}
		}
		return result;
	}
}
