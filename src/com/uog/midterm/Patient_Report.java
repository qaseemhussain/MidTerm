package com.uog.midterm;

public class Patient_Report {

	public static void main(String[] args) {
		
	
		
		
		
		Patient patient = new Patient();
		patient.setFirst_Name("mQaseem");
		patient.setLast_Name("Hussain");
		patient.setWeight(60);
		patient.setDate_of_Birth("1999");
		patient.setAddress("Gujrat");
		patient.setPhone_number("123");
		Patient_Data.Save(patient);
		Patient_Data.Update(3, patient);
		System.out.println(Patient_Data.FindOne(1));
		
		System.out.println("-------------------------------");
		
		Report report = new Report();
		report.setDoctor_Name("Qaseem");
		report.setHospital_Name("Al Musam");
		report.setPetient_ID(patient);
		report.setReport_Issue_Date("2020");
		report.setReport_Description("For Casual Tests");
		Report_Data.Update(1, report);
		System.out.println(Report_Data.FindOne(2));
		
		
		
//		System.out.println("-----------------------------");
//		System.out.println("Find All");
//		System.out.println(Patient_Data.FindAll());
//		System.out.println("-----------------------------");
//		System.out.println("Find One");
//		System.out.println(Patient_Data.FindOne(3));
//		System.out.println("-----------------------------");
//		System.out.println("Search One");
//		System.out.println(Patient_Data.Search("Qaseem"));
//		System.out.println("-----------------------------");
//		System.out.println("For Delete");
//		System.out.println(Patient_Data.DelOne(1));
//		System.out.println("-----------------------------");
//		System.out.println("-----------------------------");
//		System.out.println("-----------------------------");
//		System.out.println("For Report Data");
//		Report report = new Report();
//		report.setDoctor_Name("Qassem");
//		report.setHospital_Name("Al Musam");
//		report.setPetient_ID(patient);
//		report.setReport_Issue_Date("2020");
//		report.setReport_Description("For Casual Tests");
//		System.out.println("-----------------------------");
//		System.out.println("Find All");
//		System.out.println(Report_Data.FindAll());
//		System.out.println("Find One");
//		System.out.println(Report_Data.FindOne(1));
//		System.out.println("-----------------------------");
//		System.out.println("Search One");
//		System.out.println(Report_Data.Search(""));
//		System.out.println("-----------------------------");
//		System.out.println("For Delete");
//		//System.out.println(Report_Data.DelOne(1));
//		System.out.println("-----------------------------");

	}

}
