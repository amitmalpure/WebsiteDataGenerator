package com.ae.vo;

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
	private int available;
	private int soldCount;
	private long reviewCode;
	
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
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
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