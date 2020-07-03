package com.uog.midterm;

public class Patient {
	private int Patient_ID;
	private String First_Name;
	private String Last_Name;
	private int Weight;
	private String Date_of_Birth;
	private String Address;
	private String Phone_number;
	static private String FilePath = "C:\\Users\\DXB\\Desktop\\PatientData.csv";
	
	
	
	
	

	public static String getFilePath() {
		return FilePath;
	}
	public static void setFilePath(String filePath) {
		FilePath = filePath;
	}
	public int getPatient_ID() {
		return Patient_ID;
	}
	public void setPatient_ID(int patient_ID) {
		Patient_ID = patient_ID;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		Weight = weight;
	}
	public String getDate_of_Birth() {
		return Date_of_Birth;
	}
	public void setDate_of_Birth(String date_of_Birth) {
		Date_of_Birth = date_of_Birth;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhone_number() {
		return Phone_number;
	}
	public void setPhone_number(String phone_number) {
		Phone_number = phone_number;
	}

public String toString() {
		
		String str = "null";
		str = this.Patient_ID
				+ "," + this.First_Name
				+ "," + this.Last_Name
				+ "," + this.Weight
				+ "," + this.Date_of_Birth
				+ "," + this.Address
				+ "," + this.Phone_number;
				
		return str;
	}

	
	
	
	
	
	

}
