package com.ae.vo;

import java.util.Map;

public class FeatureVO
{
	private int featureCode;
	private String featureName;
	private String featureValue;
	private int featureCost;
	private String featureDesc;
	
	public FeatureVO(Map<String, Object> rowMap) 
	{
		int featureCode = (int)((double)rowMap.get("Feature_Code"));
		String featureValue = (String) rowMap.get("Feature_Value");
		int featureCost = (int)(double) rowMap.get("Feature_Cost");
		String featureName = (String) rowMap.get("Feature_Name");
		String featureDesc = (String) rowMap.get("Feature_Description");

		setFeatureCode(featureCode);
		setFeatureValue(featureValue);
		setFeatureName(featureName);
		setFeatureCost(featureCost);
		setFeatureDesc(featureDesc);
	}

	public int getFeatureCode() {
		return featureCode;
	}
	public void setFeatureCode(int featureCode) {
		this.featureCode = featureCode;
	}
	public String getFeatureName() {
		return featureName;
	}
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}
	public String getFeatureValue() {
		return featureValue;
	}
	public void setFeatureValue(String featureValue) {
		this.featureValue = featureValue;
	}
	public int getFeatureCost() {
		return featureCost;
	}
	public void setFeatureCost(int featureCost) {
		this.featureCost = featureCost;
	}
	public String getFeatureDesc() {
		return featureDesc;
	}
	public void setFeatureDesc(String featureEndDate) {
		this.featureDesc = featureEndDate;
	}
}