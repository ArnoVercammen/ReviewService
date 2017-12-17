package main;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import db.DestinationReviewRepository;
import db.DestinationReviewRepositoryInMemory;
import domain.DestinationReview;
import domain.DestinationReviewsRest;

@RestController
public class ReviewController {

	private DestinationReviewRepository destinationReviewRepository = new DestinationReviewRepositoryInMemory();
	
	@RequestMapping("/review/{destination}")
	public DestinationReviewsRest getReviewsDestination(@PathVariable String destination){
		DestinationReviewsRest dest = new DestinationReviewsRest();
		dest.setDestinationReviewsRest(this.destinationReviewRepository.getReviewsDestination(destination));
		return dest;
	}
	
}
