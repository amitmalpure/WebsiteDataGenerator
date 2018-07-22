package com.ae.vo;

public class ReviewVO
{
	private int reviewCode;
	private String reviewTitle;
	private int reviewDesc;
	private String reviewDate;
	private String reviewerName;

	public int getReviewCode() {
		return reviewCode;
	}
	public void setReviewCode(int reviewCode) {
		this.reviewCode = reviewCode;
	}
	public String getReviewTitle() {
		return reviewTitle;
	}
	public void setReviewTitle(String reviewName) {
		this.reviewTitle = reviewName;
	}
	public int getReviewDesc() {
		return reviewDesc;
	}
	public void setReviewDesc(int reviewDesc) {
		this.reviewDesc = reviewDesc;
	}
	public String getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}
	public String getReviewerName() {
		return reviewerName;
	}
	public void setReviewEndDate(String reviewerName) {
		this.reviewerName = reviewerName;
	}
}