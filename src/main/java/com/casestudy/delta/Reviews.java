package com.casestudy.delta;

public class Reviews {

	private int restId;
	private String reviewDes;
	public Reviews() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reviews(int restId, String reviewDes) {
		super();
		this.restId = restId;
		this.reviewDes = reviewDes;
	}
	public int getRestId() {
		return restId;
	}
	public void setRestId(int restId) {
		this.restId = restId;
	}
	public String getReviewDes() {
		return reviewDes;
	}
	public void setReviewDes(String reviewDes) {
		this.reviewDes = reviewDes;
	}
	@Override
	public String toString() {
		return "Reviews [restId=" + restId + ", reviewDes=" + reviewDes + "]";
	}
	
	
	
}
