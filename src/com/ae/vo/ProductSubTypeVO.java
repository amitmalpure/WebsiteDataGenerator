package com.ae.vo;

import java.util.Map;

public class ProductSubTypeVO
{
	private int productSubTypeCode;
	private int productTypeCode;
	private String productType;
	
	public ProductSubTypeVO(Map<String, Object> rowMap) 
	{
		int productSubTypeCode = (int)((double)rowMap.get("Product_Sub_Type_Code"));
		int productTypeCode = (int)((double)rowMap.get("Product_Type_Code"));
		String productType = (String) rowMap.get("Product_Type");

		setProductSubTypeCode(productSubTypeCode);;
		setProductTypeCode(productTypeCode);;
		setProductType(productType);;
	}

	public int getProductSubTypeCode() {
		return productSubTypeCode;
	}
	public void setProductSubTypeCode(int productSubTypeCode) {
		this.productSubTypeCode = productSubTypeCode;
	}
	public int getProductTypeCode() {
		return productTypeCode;
	}
	public void setProductTypeCode(int productTypeCode) {
		this.productTypeCode = productTypeCode;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	

}
