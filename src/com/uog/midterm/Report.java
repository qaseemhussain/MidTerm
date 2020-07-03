package com.uog.midterm;

public class Report {

	private String Doctor_Name;
	private int Report_ID;
	private Patient Petient_ID;
	private String Hospital_Name;
	private String Report_Description;
	
	private String Report_Issue_Date;
	
	private static String FilePath = "C:\\Users\\DXB\\Desktop\\ReportData.csv";
	
	public Report(String doctor_Name, int report_ID, Patient petient_ID, String hospital_Name,
			String report_Description, String report_Issue_Date) {
		super();
		Doctor_Name = doctor_Name;
		Report_ID = report_ID;
		Petient_ID = petient_ID;
		Hospital_Name = hospital_Name;
		Report_Description = report_Description;
		Report_Issue_Date = report_Issue_Date;
	}
	
	
	public Report() {
		super();
	}

public String toString() {
		
		String str = "null";
		str = this.Report_ID
				+ "," + this.Petient_ID
				+ "," + this.Doctor_Name
				+ "," + this.Hospital_Name
				+ "," + this.Report_Issue_Date
				+ "," + this.Report_Description;
				
		return str;
	}
	public String getReport_Description() {
		return Report_Description;
	}
	public void setReport_Description(String report_Description) {
		Report_Description = report_Description;
	}
	public String getDoctor_Name() {
		return Doctor_Name;
	}
	public void setDoctor_Name(String doctor_Name) {
		Doctor_Name = doctor_Name;
	}
	public static String getFilePath() {
		return FilePath;
	}
	public static void setFilePath(String filePath) {
		FilePath = filePath;
	}
	public String getHospital_Name() {
		return Hospital_Name;
	}
	public void setHospital_Name(String hospital_Name) {
		Hospital_Name = hospital_Name;
	}
	public int getReport_ID() {
		return Report_ID;
	}
	public void setReport_ID(int report_ID) {
		Report_ID = report_ID;
	}
	
	public Patient getPetient_ID() {
		return Petient_ID;
	}
	public void setPetient_ID(Patient petient_ID) {
		Petient_ID = petient_ID;
	}
	public String getReport_Issue_Date() {
		return Report_Issue_Date;
	}
	public void setReport_Issue_Date(String report_Issue_Date) {
		Report_Issue_Date = report_Issue_Date;
	}
	
}
