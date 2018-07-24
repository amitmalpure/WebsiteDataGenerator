package com.ae.vo;

import java.util.Map;

public class ReviewVO
{
	private int reviewCode;
	private String reviewTitle;
	private String reviewDesc;
	private String reviewDate;
	private String reviewerName;

	public ReviewVO(Map<String, Object> rowMap) 
	{
		int reviewCode = (int)((double)rowMap.get("Review_Code"));
		String reviewTitle = (String) rowMap.get("Review_Title");
		String reviewerName = (String) rowMap.get("Reviewer_Name");
		String reviewDate = (String) rowMap.get("Review_Date");
		String reviewDesc = (String) rowMap.get("Review_Description");

		setReviewCode(reviewCode);
		setReviewTitle(reviewTitle);
		setReviewDate(reviewDate);
		setReviewerName(reviewerName);
		setReviewDesc(reviewDesc);
	}
	
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
	public String getReviewDesc() {
		return reviewDesc;
	}
	public void setReviewDesc(String reviewDesc) {
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
	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}
}