package com.ae.vo;

import java.util.Map;

public class ProductDetailsVO 
{
	private long productCode;
	private String productName;
	private int productTypeCode;
	private int productSubTypeCode;
	private String productDescription;
	private String customiationCode;
	private String dimensions;
	private boolean customizable;
	private String featureCode;
	private int price;
	private int offerCode;
	private int availableCount;
	private int soldCount;
	private long reviewCode;
	
	public ProductDetailsVO(Map<String, Object> rowMap) 
	{
		int productCode = (int)((double)rowMap.get("Product_Code"));
		String productName = (String) rowMap.get("Product_Name");
		int productTypeCode = (int)(double) rowMap.get("Product_Type_Code");
		int productSubTypeCode = (int)(double) rowMap.get("Product_Sub_Type_Code");
		String productDescription = (String) rowMap.get("Product_Description");
		String customiationCode = (String) rowMap.get("Customiation_Code");
		String dimensions = (String) rowMap.get("Dimensions");
		boolean customizable = Boolean.parseBoolean((String) rowMap.get("Customizable"));
		String featureCode = (String) rowMap.get("Feature_Code");
		int price = (int)(double) rowMap.get("Price");
		int offerCode = (int)(double) rowMap.get("Offer_Code");
		int availableCount = (int) (double)rowMap.get("Available_Count");
		int soldCount = (int)(double) rowMap.get("Sold_Count");
		int reviewCode = (int)(double) rowMap.get("Review_Code");

		setProductCode(productCode);
		setProductName(productName);
		setProductTypeCode(productTypeCode);
		setProductSubTypeCode(productSubTypeCode);
		setProductDescription(productDescription);
		setCustomiationCode(customiationCode);
		setDimensions(dimensions);
		setCustomizable(customizable);
		setFeatureCode(featureCode);
		setPrice(price);
		setOfferCode(offerCode);
		setAvailableCount(availableCount);
		setSoldCount(soldCount);
		setReviewCode(reviewCode);
	}

	public long getProductCode() {
		return productCode;
	}
	public void setProductCode(long productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductTypeCode() {
		return productTypeCode;
	}
	public void setProductTypeCode(int productTypeCode) {
		this.productTypeCode = productTypeCode;
	}
	public int getProductSubTypeCode() {
		return productSubTypeCode;
	}
	public void setProductSubTypeCode(int productSubTypeCode) {
		this.productSubTypeCode = productSubTypeCode;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getCustomiationCode() {
		return customiationCode;
	}
	public void setCustomiationCode(String customiationCode) {
		this.customiationCode = customiationCode;
	}
	public String getDimensions() {
		return dimensions;
	}
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}
	public boolean isCustomizable() {
		return customizable;
	}
	public void setCustomizable(boolean customizable) {
		this.customizable = customizable;
	}
	public String getFeatureCode() {
		return featureCode;
	}
	public void setFeatureCode(String featureCode) {
		this.featureCode = featureCode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getOfferCode() {
		return offerCode;
	}
	public void setOfferCode(int offerCode) {
		this.offerCode = offerCode;
	}
	public int getAvailableCount() {
		return availableCount;
	}
	public void setAvailableCount(int availableCount) {
		this.availableCount = availableCount;
	}
	public int getSoldCount() {
		return soldCount;
	}
	public void setSoldCount(int soldCount) {
		this.soldCount = soldCount;
	}
	public long getReviewCode() {
		return reviewCode;
	}
	public void setReviewCode(long reviewCode) {
		this.reviewCode = reviewCode;
	}	
}