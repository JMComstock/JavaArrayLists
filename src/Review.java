public class Review {
    private int rating = -1;
    private String comment = "No comment";

    public void setRatingAndComment(int rating, String comment) {
        this.rating = rating;
        this.comment = comment;
    }
    public int getRating() { return rating; }
    public String getComment() { return comment; }
}
