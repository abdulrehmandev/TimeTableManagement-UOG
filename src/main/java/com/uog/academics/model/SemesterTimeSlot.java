package com.uog.academics.model;

public class SemesterTimeSlot {

	private long TIMESLOT_ID;
	private long CAMPUS_ID;
	private long SEMESTER_ID;
	private long WEEKDAY_ID;
	private String TIMESLOT_START;
	private String TIMESLOT_END;
	private String ISACTIVE;
	private long MODIFIED_BY;
	private String MODIFIED_WHEN;
	private String MODIFIED_WORKSTATION;

	public static String filePath = "E:\\CSV Academics\\Semestertimeslots.csv";


	public long getTIMESLOT_ID() {
		return TIMESLOT_ID;
	}

	public void setTIMESLOT_ID(long TIMESLOT_ID) {
		TIMESLOT_ID = TIMESLOT_ID;
	}

	public long getCAMPUS_ID() {
		return CAMPUS_ID;
	}

	public void setCAMPUS_ID(long CAMPUS_ID) {
		CAMPUS_ID = CAMPUS_ID;
	}

	public long getSEMESTER_ID() {
		return SEMESTER_ID;
	}

	public void setSEMESTER_ID(long SEMESTER_ID) {
		SEMESTER_ID = SEMESTER_ID;
	}

	public long getWEEKDAY_ID() {
		return WEEKDAY_ID;
	}

	public void setWEEKDAY_ID(long WEEKDAY_ID) {
		WEEKDAY_ID = WEEKDAY_ID;
	}

	public String getTIMESLOT_START() {
		return TIMESLOT_START;
	}

	public void setTIMESLOT_START(String TIMESLOT_START) {
		TIMESLOT_START = TIMESLOT_START;
	}

	public String getTIMESLOT_END() {
		return TIMESLOT_END;
	}

	public void setTIMESLOT_END(String TIMESLOT_END) {
		TIMESLOT_END = TIMESLOT_END;
	}

	public String getISACTIVE() {
		return ISACTIVE;
	}
	
	public void setISACTIVE(String ISACTIVE) {
		ISACTIVE = ISACTIVE;
	}

	public long getMODIFIED_BY() {
		return MODIFIED_BY;
	}

	public void setMODIFIED_BY(long MODIFIED_BY) {
		MODIFIED_BY = MODIFIED_BY;
	}

	public String getMODIFIED_WHEN() {
		return MODIFIED_WHEN;
	}

	public void setMODIFIED_WHEN(String MODIFIED_WHEN) {
		MODIFIED_WHEN = MODIFIED_WHEN;
	}

	public String getMODIFIED_WORKSTATION() {
		return MODIFIED_WORKSTATION;
	}

	public void setMODIFIED_WORKSTATION(String MODIFIED_WORKSTATION) {
		MODIFIED_WORKSTATION = MODIFIED_WORKSTATION;
	}

}
