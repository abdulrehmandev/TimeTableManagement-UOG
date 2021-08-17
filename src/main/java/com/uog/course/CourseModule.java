package com.uog.course;

public class CourseModule {

	private long COURSEMODULE_ID;
	private long COURSE_ID;
	private long MODULE_ID;
	private String ISACTIVE;
	private Long MODIFIED_BY;
	private String MODIFIED_WHEN;
	private String MODIFIED_WORKSTATION;

	public static String filePath = "E:\\CSV Academics\\CourseModules.csv";

	public long getCOURSEMODULE_ID() {
		return COURSEMODULE_ID;
	}

	public void setCOURSEMODULE_ID(long COURSEMODULE_ID) {
		this.COURSEMODULE_ID = COURSEMODULE_ID;
	}

	public long getCOURSE_ID() {
		return COURSE_ID;
	}

	public void setCOURSE_ID(long COURSE_ID) {
		this.COURSE_ID = COURSE_ID;
	}

	public long getMODULE_ID() {
		return MODULE_ID;
	}

	public void setMODULE_ID(long MODULE_ID) {
		this.MODULE_ID = MODULE_ID;
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
