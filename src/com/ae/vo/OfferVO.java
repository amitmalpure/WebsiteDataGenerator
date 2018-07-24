package com.ae.vo;

import java.util.Map;

public class OfferVO
{
	private int offerCode;
	private String offerName;
	private int offerDiscount;
	private String offerStartDate;
	private String offerEndDate;

	public OfferVO(Map<String, Object> rowMap) 
	{
		int offerCode = (int)((double)rowMap.get("Offer_Code"));
		String offerName = (String) rowMap.get("Offer_Name");
		int offerDiscount = (int)(double) rowMap.get("Offer_Discount");
		String offerStartDate = (String) rowMap.get("Offer_Start-Date");
		String offerEndDate = (String) rowMap.get("Offer_End-Date");

		setOfferCode(offerCode);
		setOfferName(offerName);
		setOfferDiscount(offerDiscount);
		setOfferStartDate(offerStartDate);
		setOfferEndDate(offerEndDate);
	}
	
	public int getOfferCode() {
		return offerCode;
	}
	public void setOfferCode(int offerCode) {
		this.offerCode = offerCode;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public int getOfferDiscount() {
		return offerDiscount;
	}
	public void setOfferDiscount(int offerDiscount) {
		this.offerDiscount = offerDiscount;
	}
	public String getOfferStartDate() {
		return offerStartDate;
	}
	public void setOfferStartDate(String offerStartDate) {
		this.offerStartDate = offerStartDate;
	}
	public String getOfferEndDate() {
		return offerEndDate;
	}
	public void setOfferEndDate(String offerEndDate) {
		this.offerEndDate = offerEndDate;
	}
}