package com.uog.academics.model;

public class Building {

	private long BUILDING_ID;
	private long CAMPUS_ID;
	private String BUILDING_CODE;
	private String BUILDING_NAME;
	private String ISACTIVE;
	private long MODIFIED_BY;
	private String MODIFIED_WHEN;
	private String MODIFIED_WORKSTATION;

	public static String filePath = "E:\\CSV Academics\\Buildings.csv";

	public long getBUILDING_ID() {
		return BUILDING_ID;
	}

	public void setBUILDING_ID(long bUILDING_ID) {
		BUILDING_ID = bUILDING_ID;
	}

	public long getCAMPUS_ID() {
		return CAMPUS_ID;
	}

	public void setCAMPUS_ID(long cAMPUS_ID) {
		CAMPUS_ID = cAMPUS_ID;
	}

	public String getBUILDING_CODE() {
		return BUILDING_CODE;
	}

	public void setBUILDING_CODE(String bUILDING_CODE) {
		BUILDING_CODE = bUILDING_CODE;
	}

	public String getBUILDING_NAME() {
		return BUILDING_NAME;
	}

	public void setBUILDING_NAME(String bUILDING_NAME) {
		BUILDING_NAME = bUILDING_NAME;
	}

	public String getISACTIVE() {
		return ISACTIVE;
	}

	public void setISACTIVE(String iSACTIVE) {
		ISACTIVE = iSACTIVE;
	}
	
	public long getMODIFIED_BY() {
		return MODIFIED_BY;
	}

	public void setMODIFIED_BY(long mODIFIED_BY) {
		MODIFIED_BY = mODIFIED_BY;
	}

	public String getMODIFIED_WHEN() {
		return MODIFIED_WHEN;
	}

	public void setMODIFIED_WHEN(String mODIFIED_WHEN) {
		MODIFIED_WHEN = mODIFIED_WHEN;
	}

	public String getMODIFIED_WORKSTATION() {
		return MODIFIED_WORKSTATION;
	}

	public void setMODIFIED_WORKSTATION(String mODIFIED_WORKSTATION) {
		MODIFIED_WORKSTATION = mODIFIED_WORKSTATION;
	}

	public static long getDatabaseTableID() {
		return (long) 3;
	}

}