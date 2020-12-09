package com.entity;

public class WatEntity {
	private String LOT_ID;
	private String WAFER_ID;
	private String SITE;
	private String PARA_NAME;
	private Double VALUE;
	public Double getVALUE() {
		return VALUE;
	}
	public void setVALUE(Double VALUE) {
		this.VALUE = VALUE;
	}
	public String getLOT_ID() {
		return LOT_ID;
	}
	public void setLOT_ID(String LOT_ID) {
		this.LOT_ID = LOT_ID;
	}
	public String getWAFER_ID() {
		return WAFER_ID;
	}
	public void setWAFER_ID(String WAFER_ID) {
		this.WAFER_ID = WAFER_ID;
	}
	public String getSITE() {
		return SITE;
	}
	public void setSITE(String SITE) {
		this.SITE = SITE;
	}
	public String getPARA_NAME() {
		return PARA_NAME;
	}
	public void setPARA_NAME(String PARA_NAME) {
		this.PARA_NAME = PARA_NAME;
	}
	
}
