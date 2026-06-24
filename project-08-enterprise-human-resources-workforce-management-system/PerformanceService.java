package src.services;

public class PerformanceService {

    private int reviews = 0;

    public void addReview(
            String employee,
            int rating) {

        reviews++;
    }

    public int totalReviews() {
        return reviews;
    }
}
