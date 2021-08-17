package com.uog.course;

public class ModuleAssessmentCriteria {

    private long ASSESSMENTCRITERIA_ID;
	private long MODULE_ID;
	private long LEARNINGOUTCOME_ID;
	private long ASSESSMENTCRITERIA_NO;
	private String ASSESSMENTCRITERIA_CODE;
	private String ASSESSMENTCRITERIA_DESC;
	private String ISACTIVE;
	private Long MODIFIED_BY;
	private String MODIFIED_WHEN;
	private String MODIFIED_WORKSTATION;

	public static String filePath = "E:\\CSV Academics\\ModuleAssessmentCriteria.csv";

	public long getASSESSMENTCRITERIA_ID() {
		return ASSESSMENTCRITERIA_ID;
	}

	public void setASSESSMENTCRITERIA_ID(long ASSESSMENTCRITERIA_ID) {
		this.ASSESSMENTCRITERIA_ID = ASSESSMENTCRITERIA_ID;
	}

	public long getMODULE_ID() {
		return MODULE_ID;
	}

	public void setMODULE_ID(long MODULE_ID) {
		this.MODULE_ID = MODULE_ID;
	}

	public long getLEARNINGOUTCOME_ID() {
		return LEARNINGOUTCOME_ID;
	}

	public void setLEARNINGOUTCOME_ID(long LEARNINGOUTCOME_ID) {
		this.LEARNINGOUTCOME_ID = LEARNINGOUTCOME_ID;
	}

	public long getASSESSMENTCRITERIA_NO() {
		return ASSESSMENTCRITERIA_NO;
	}

	public void setASSESSMENTCRITERIA_NO(long ASSESSMENTCRITERIA_NO) {
		this.ASSESSMENTCRITERIA_NO = ASSESSMENTCRITERIA_NO;
	}

	public String getASSESSMENTCRITERIA_CODE() {
		return ASSESSMENTCRITERIA_CODE;
	}

	public void setASSESSMENTCRITERIA_CODE(String ASSESSMENTCRITERIA_CODE) {
		this.ASSESSMENTCRITERIA_CODE = ASSESSMENTCRITERIA_CODE;
	}

	public String getASSESSMENTCRITERIA_DESC() {
		return ASSESSMENTCRITERIA_DESC;
	}

	public void setASSESSMENTCRITERIA_DESC(String ASSESSMENTCRITERIA_DESC) {
		this.ASSESSMENTCRITERIA_DESC = ASSESSMENTCRITERIA_DESC;
	}

	public String getISACTIVE() {
		return ISACTIVE;
	}

	public void setISACTIVE(String ISACTIVE) {
		this.ISACTIVE = ISACTIVE;
	}

	public Long getMODIFIED_BY() {
		return MODIFIED_BY;
	}

	public void setMODIFIED_BY(Long MODIFIED_BY) {
		this.MODIFIED_BY = MODIFIED_BY;
	}

	public String getMODIFIED_WHEN() {
		return MODIFIED_WHEN;
	}

	public void setMODIFIED_WHEN(String MODIFIED_WHEN) {
		this.MODIFIED_WHEN = MODIFIED_WHEN;
	}

	public String getMODIFIED_WORKSTATION() {
		return MODIFIED_WORKSTATION;
	}

	public void setMODIFIED_WORKSTATION(String MODIFIED_WORKSTATION) {
		this.MODIFIED_WORKSTATION = MODIFIED_WORKSTATION;
	}
}
