package com.uog.academics.model;

public class UniversityCourse {

    private long UNIVERSITYCOURSE_ID;
	private long COURSE_ID;
	private long DEPARTMENT_ID;
	private long QUALIFICATION_ID;
	private long AWARDINGBODY_ID;
	private String ISACTIVE;
	private long MODIFIED_BY;
	private String MODIFIED_WHEN;
	private String MODIFIED_WORKSTATION;

	public long getUNIVERSITYCOURSE_ID() {
		return UNIVERSITYCOURSE_ID;
	}

	public void setUNIVERSITYCOURSE_ID(long uNIVERSITYCOURSE_ID) {
		UNIVERSITYCOURSE_ID = uNIVERSITYCOURSE_ID;
	}

	public long getCOURSE_ID() {
		return COURSE_ID;
	}

	public void setCOURSE_ID(long cOURSE_ID) {
		COURSE_ID = cOURSE_ID;
	}

	public long getDEPARTMENT_ID() {
		return DEPARTMENT_ID;
	}

	public void setDEPARTMENT_ID(long dEPARTMENT_ID) {
		DEPARTMENT_ID = dEPARTMENT_ID;
	}

	public long getQUALIFICATION_ID() {
		return QUALIFICATION_ID;
	}

	public void setQUALIFICATION_ID(long qUALIFICATION_ID) {
		QUALIFICATION_ID = qUALIFICATION_ID;
	}

	public long getAWARDINGBODY_ID() {
		return AWARDINGBODY_ID;
	}

	public void setAWARDINGBODY_ID(long aWARDINGBODY_ID) {
		AWARDINGBODY_ID = aWARDINGBODY_ID;
	}

	public String getISACTIVE() {
		return ISACTIVE;
	}

	public void setISACTIVE(String iSACTIVE) {
		ISACTIVE = iSACTIVE;
	}

	public Long getMODIFIED_BY() {
		return MODIFIED_BY;
	}

	public void setMODIFIED_BY(Long mODIFIED_BY) {
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
