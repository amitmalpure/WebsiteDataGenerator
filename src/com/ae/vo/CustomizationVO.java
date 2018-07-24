package com.ae.vo;

import java.util.Map;

public class CustomizationVO
{
	private int customizationCode;
	private String customizationName;
	private String customizationValue;
	private int customizationCost;
	private String customizationDesc;

	public CustomizationVO(Map<String, Object> rowMap) 
	{
		int customizationCode = (int)((double)rowMap.get("Customization_Code"));
		String customizationValue = (String) rowMap.get("Customization_Value");
		int customizationCost = (int)(double) rowMap.get("Customization_Cost");
		String customizationName = (String) rowMap.get("Customization_Name");
		String customizationDesc = (String) rowMap.get("Customization_Description");

		setCustomizationCode(customizationCode);
		setCustomizationValue(customizationValue);
		setCustomizationName(customizationName);
		setCustomizationCost(customizationCost);
		setCustomizationDesc(customizationDesc);
	}
	
	public int getCustomizationCode() {
		return customizationCode;
	}
	public void setCustomizationCode(int customizationCode) {
		this.customizationCode = customizationCode;
	}
	public String getCustomizationName() {
		return customizationName;
	}
	public void setCustomizationName(String customizationName) {
		this.customizationName = customizationName;
	}
	public String getCustomizationValue() {
		return customizationValue;
	}
	public void setCustomizationValue(String customizationValue) {
		this.customizationValue = customizationValue;
	}
	public int getCustomizationCost() {
		return customizationCost;
	}
	public void setCustomizationCost(int customizationCost) {
		this.customizationCost = customizationCost;
	}
	public String getCustomizationDesc() {
		return customizationDesc;
	}
	public void setCustomizationDesc(String customizationDesc) {
		this.customizationDesc = customizationDesc;
	}
}