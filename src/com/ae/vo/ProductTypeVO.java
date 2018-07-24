package com.ae.vo;

import java.util.Map;

public class ProductTypeVO
{
	private int productTypeCode;
	private String productType;
	
	public ProductTypeVO(Map<String, Object> rowMap) 
	{
		int productTypeCode = (int)((double)rowMap.get("Product_Type_Code"));
		String productType = (String) rowMap.get("Product_Type");

		setProductTypeCode(productTypeCode);;
		setProductType(productType);;
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
