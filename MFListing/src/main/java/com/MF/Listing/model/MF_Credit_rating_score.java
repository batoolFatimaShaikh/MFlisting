package com.MF.Listing.model;

public class MF_Credit_rating_score {
	private int rating_id;
	private String rating;
	private boolean modified_ts;
	public MF_Credit_rating_score() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MF_Credit_rating_score(int rating_id, String rating, boolean modified_ts) {
		super();
		this.rating_id = rating_id;
		this.rating = rating;
		this.modified_ts = modified_ts;
	}
	public int getRating_id() {
		return rating_id;
	}
	public void setRating_id(int rating_id) {
		this.rating_id = rating_id;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public boolean isModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(boolean modified_ts) {
		this.modified_ts = modified_ts;
	}
	@Override
	public String toString() {
		return "Credit_rating_score [rating_id=" + rating_id + ", rating=" + rating + ", modified_ts=" + modified_ts
				+ "]";
	}
	

}
