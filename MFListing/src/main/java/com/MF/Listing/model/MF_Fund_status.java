package com.MF.Listing.model;

import java.math.BigInteger;

public class MF_Fund_status {
	private String status_id;
	private String status_description;
	private boolean modified_ts;
	public MF_Fund_status() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MF_Fund_status(String status_id, String status_description, boolean modified_ts) {
		super();
		this.status_id = status_id;
		this.status_description = status_description;
		this.modified_ts = modified_ts;
	}
	public String getStatus_id() {
		return status_id;
	}
	public void setStatus_id(String status_id) {
		this.status_id = status_id;
	}
	public String getStatus_description() {
		return status_description;
	}
	public void setStatus_description(String status_description) {
		this.status_description = status_description;
	}
	public boolean isModified_ts() {
		return modified_ts;
	}
	public void setModified_ts(boolean modified_ts) {
		this.modified_ts = modified_ts;
	}
	@Override
	public String toString() {
		return "MF_Fund_status [status_id=" + status_id + ", status_description=" + status_description
				+ ", modified_ts=" + modified_ts + "]";
	}
	
	
}
