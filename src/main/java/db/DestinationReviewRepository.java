package db;

import java.util.ArrayList;

import domain.DestinationReview;

public interface DestinationReviewRepository {
	public ArrayList<DestinationReview> getReviewsDestination(String destination);
}
