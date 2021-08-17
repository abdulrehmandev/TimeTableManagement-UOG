package com.uog.academics.model;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

@SuppressWarnings("unused")
public class University {

    private int UNIVERSITY_ID;
    private String UNIVERSITY_CODE;
    private String UNIVERSITY_NAME;
    private String UNIVERSITY_DESCRIPTION;
    private String ADDRESS_LINE1;
    private String ADDRESS_LINE2;
    private String ADDRESS_LINE3;
    private String ADDRESS_LINE4;
    private String ADDRESS_LINE5;
    private String ADDRESS_POSTCODE;
    private int ADDRESSCOUNTRY_ID;
    private String TELEPHONE;
    private String FAXNO;
    private String EMAIL;
    private String LOGO_PATH;
    private String ICON_PATH;
    private String ISACTIVE;
    private int MODIFIED_BY;
    private String MODIFIED_WHEN;
    private String MODIFIED_WORKSTATION;

    public static String filePath = "E:\\CSV Academics\\Universities.csv";

    public int getUNIVERSITY_ID() { return UNIVERSITY_ID; }
    public String getADDRESS_LINE3() { return ADDRESS_LINE3; }
    public String getUNIVERSITY_CODE() {
        return UNIVERSITY_CODE;
    }
    public String getADDRESS_LINE1() { return ADDRESS_LINE1; }
    public String getADDRESS_LINE2() { return ADDRESS_LINE2; }
    public String getEMAIL() { return EMAIL; }
    public String getUNIVERSITY_NAME() {
        return UNIVERSITY_NAME;
    }
    public String getMODIFIED_WHEN() { return MODIFIED_WHEN; }
    public String getICON_PATH() {
        return ICON_PATH;
    }
    public String getLOGO_PATH() {
        return LOGO_PATH;
    }
    public String getISACTIVE() { return ISACTIVE; }
    public int getMODIFIED_BY() {
        return MODIFIED_BY;
    }
    public String getMODIFIED_WORKSTATION() { return MODIFIED_WORKSTATION; }
    public String getUNIVERSITY_DESCRIPTION() {
        return UNIVERSITY_DESCRIPTION;
    }
    public String getADDRESS_LINE4() { return ADDRESS_LINE4; }
    public int getADDRESSCOUNTRY_ID() {
        return ADDRESSCOUNTRY_ID;
    }
    public String getTELEPHONE() {
        return TELEPHONE;
    }
    public String getFAXNO() {
        return FAXNO;
    }
    public String getADDRESS_POSTCODE() {
        return ADDRESS_POSTCODE;
    }
    public String getADDRESS_LINE5() {
        return ADDRESS_LINE5;
    }

    //setters
    public void setADDRESS_LINE5(String ADDRESS_LINE5) {
        this.ADDRESS_LINE5 = ADDRESS_LINE5;
    }
    public void setADDRESS_POSTCODE(String ADDRESS_POSTCODE) {
        this.ADDRESS_POSTCODE = ADDRESS_POSTCODE;
    }
    public void setMODIFIED_WORKSTATION(String MODIFIED_WORKSTATION) { this.MODIFIED_WORKSTATION = MODIFIED_WORKSTATION; }
    public void setLOGO_PATH(String LOGO_PATH) { this.LOGO_PATH = LOGO_PATH; }
    public void setEMAIL(String EMAIL) { this.EMAIL = EMAIL; }
    public void setADDRESS_LINE4(String ADDRESS_LINE4) { this.ADDRESS_LINE4 = ADDRESS_LINE4; }
    public void setADDRESS_LINE1(String ADDRESS_LINE1) { this.ADDRESS_LINE1 = ADDRESS_LINE1; }
    public void setUNIVERSITY_DESCRIPTION(String UNIVRSITY_DESCRIPTION) { this.UNIVERSITY_DESCRIPTION = UNIVRSITY_DESCRIPTION; }
    public void setICON_PATH(String ICON_PATH) {
        this.ICON_PATH = ICON_PATH;
    }
    public void setMODIFIED_WHEN(String MODIFIED_WHEN) { this.MODIFIED_WHEN = MODIFIED_WHEN; }
    public void setMODIFIED_BY(int MODIFIED_BY) {
        this.MODIFIED_BY = MODIFIED_BY;
    }
    public void setISACTIVE(String ISACTIVE) { this.ISACTIVE = ISACTIVE; }
    public void setUNIVERSITY_NAME(String UNIVRESITY_NAME) { this.UNIVERSITY_NAME = UNIVRESITY_NAME; }
    public void setUNIVERSITY_CODE(String UNIVERSITY_CODE) { this.UNIVERSITY_CODE = UNIVERSITY_CODE; }
    public void setUNIVERSITY_ID(int UNIVERSITY_ID) { this.UNIVERSITY_ID = UNIVERSITY_ID; }
    public void setADDRESS_LINE2(String ADDRESS_LINE2) {
        this.ADDRESS_LINE2 = ADDRESS_LINE2;
    }
    public void setADDRESS_LINE3(String ADDRESS_LINE3) {
        this.ADDRESS_LINE3 = ADDRESS_LINE3;
    }
    public void setFAXNO(String FAXNO) { this.FAXNO = FAXNO; }
    public void setTELEPHONE(String TELEPHONE) {
        this.TELEPHONE = TELEPHONE;
    }
    public void setADDRESSCOUNTRY_ID(int ADDRESSCOUNTRY_ID) {
        this.ADDRESSCOUNTRY_ID = ADDRESSCOUNTRY_ID;
    }

    public String toString() {
        String data = null;

        data = this.UNIVERSITY_ID+" , "+this.UNIVERSITY_CODE+" , "+this.UNIVERSITY_NAME+" , "+this.UNIVERSITY_DESCRIPTION+" , "+this.ADDRESS_LINE1
                +" , "+this.ADDRESS_LINE2+" , "+this.ADDRESS_LINE3+" , "+this.ADDRESS_LINE4+" , "+this.ADDRESS_LINE5
                +" , "+this.ADDRESSCOUNTRY_ID+" , "+this.TELEPHONE+" , "+this.FAXNO+" , "+this.EMAIL+" , "+this.LOGO_PATH
                +" , "+this.ICON_PATH+" , "+this.ISACTIVE+" , "+this.MODIFIED_BY+" , "
                +this.MODIFIED_WHEN+" , "+this.MODIFIED_WORKSTATION+"\n";

        return data;
    }

    public void takeInput() {
        Scanner scan = new Scanner(System.in);

        scan.nextLine();
        System.out.print("\nUni ID: ");
        setUNIVERSITY_ID(scan.nextInt());
        System.out.print("Uni Code: ");
        scan.nextLine();
        setUNIVERSITY_CODE(scan.nextLine());
        System.out.print("Uni Name: ");
        setUNIVERSITY_NAME(scan.nextLine());
        System.out.print("Uni Desc: ");
        setUNIVERSITY_DESCRIPTION(scan.nextLine());
        System.out.print("Add. Line 1: ");
        setADDRESS_LINE1(scan.nextLine());
        System.out.print("Add. Line 2: ");
        setADDRESS_LINE2(scan.nextLine());
        System.out.print("Add. Line 3: ");
        setADDRESS_LINE3(scan.nextLine());
        System.out.print("Add. Line 4: ");
        setADDRESS_LINE4(scan.nextLine());
        System.out.print("Add. Line 5: ");
        setADDRESS_LINE5(scan.nextLine());
        System.out.print("Add. Postcode: ");
        setADDRESS_POSTCODE(scan.nextLine());
        System.out.print("Add. Country ID: ");
        setADDRESSCOUNTRY_ID(scan.nextInt());
        scan.nextLine();
        System.out.print("Telephone: ");
        setTELEPHONE(scan.nextLine());
        System.out.print("Fax No: ");
        setFAXNO(scan.nextLine());
        System.out.print("Email: ");
        setEMAIL(scan.nextLine());
        System.out.print("Logo Path: ");
        setLOGO_PATH(scan.nextLine());
        System.out.print("Icon Path: ");
        setICON_PATH(scan.nextLine());
        System.out.print("Is Active or Not: ");
        setISACTIVE(scan.nextLine());
        System.out.print("Modifier ID: ");
        setMODIFIED_BY(scan.nextInt());
        scan.nextLine();
        System.out.print("Modification Date [YY-MM-DD] : ");
        setMODIFIED_WHEN(scan.nextLine());
        System.out.print("Modification Workstation: ");
        setMODIFIED_WORKSTATION(scan.nextLine());

        scan.close();
    }

}
