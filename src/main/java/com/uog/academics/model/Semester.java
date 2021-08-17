package com.uog.academics.model;

public class Semester {

    private long SEMESTER_ID;
	private long ACADEMICSYEAR_ID;
	private String SEMESTER_DESC;
	private String SEMESTER_STARTDATE;
	private String SEMESTER_ENDDATE;
	private String ISACTIVE;
	private long MODIFIED_BY;
	private String MODIFIED_WHEN;
	private String MODIFIED_WORKSTATION;

	public static String filePath = "E:\\CSV Academics\\Semesters.csv";

	public long getSEMESTER_ID() {
		return SEMESTER_ID;
	}

	public void setSEMESTER_ID(long sEMESTER_ID) {
		SEMESTER_ID = sEMESTER_ID;
	}

	public long getACADEMICSYEAR_ID() {
		return ACADEMICSYEAR_ID;
	}

	public void setACADEMICSYEAR_ID(long aCDYEAR_ID) {
		ACADEMICSYEAR_ID = aCDYEAR_ID;
	}

	public String getSEMESTER_DESC() {
		return SEMESTER_DESC;
	}

	public void setSEMESTER_DESC(String sEMESTER_DESC) {
		SEMESTER_DESC = sEMESTER_DESC;
	}

	public String getSEMESTER_STARTDATE() {
		return SEMESTER_STARTDATE;
	}

	public void setSEMESTER_STARTDATE(String sEMESTER_STARTDATE) {
		SEMESTER_STARTDATE = sEMESTER_STARTDATE;
	}

	public String getSEMESTER_ENDDATE() {
		return SEMESTER_ENDDATE;
	}

	public void setSEMESTER_ENDDATE(String sEMESTER_ENDDATE) {
		SEMESTER_ENDDATE = sEMESTER_ENDDATE;
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

}
