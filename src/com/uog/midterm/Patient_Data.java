package com.uog.midterm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Patient_Data {
	
	public static List<Patient> FindAll(){
		List<Patient> patients= new ArrayList<Patient>();
		String line ;
		try {
			
			@SuppressWarnings("resource")
			BufferedReader bufferedReader = new BufferedReader(new FileReader(Patient.getFilePath()));
			
			while((line=bufferedReader.readLine()) != null) {
				Patient patient = new Patient();
				String[] row = line.split(",");
				patient.setPatient_ID(Integer.parseInt(row[0]));
				patient.setFirst_Name(row[1]);
				patient.setLast_Name(row[2]);
				patient.setWeight(Integer.parseInt(row[3]));
				patient.setDate_of_Birth(row[4]);
				patient.setPhone_number(row[5]);
				patient.setAddress(row[6]);
				
				patients.add(patient);
			}
			
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return patients;
	}
	
	
	public static Patient Save(Patient patient) {
		
		FileWriter filewriter;
		List<Patient> patients = FindAll();
		
		try {
			filewriter = new FileWriter(Patient.getFilePath());
			
			for(int i=0;i<patients.size();i++) {
				filewriter.append(patients.get(i).toString());
				filewriter.append("\n");
			}
			
			
			if(patients.size()>0) {
				patient.setPatient_ID(patients.get(patients.size()-1).getPatient_ID());
				
			}
			else {
				patient.setPatient_ID(1);
			}
			patients.add(patient);
				filewriter.append(patient.toString());
				filewriter.append("\n");
				filewriter.flush();
				filewriter.close();
			System.out.println("Saved Succesfully");
			
			
	} catch (IOException e) {
			
			e.printStackTrace();
		}
		return patient;
	}

	public static Patient FindOne(int Patient_ID){
		
		List<Patient> patients = new ArrayList<Patient>();	
		String line;
		try {
			@SuppressWarnings("resource")
			BufferedReader bufferreader = new BufferedReader(new FileReader(Patient.getFilePath()));
			
			while((line=bufferreader.readLine())!=null) {
				Patient patient = new Patient();
				String[] rowPatient = line.split(",");
				
				if(Integer.parseInt(rowPatient[0]) == Patient_ID ) 
				
				{
					
					patient.setPatient_ID(Integer.parseInt(rowPatient[0]));
					patient.setFirst_Name(rowPatient[1]);
					patient.setLast_Name(rowPatient[2]);
					patient.setWeight(Integer.parseInt(rowPatient[3]));
					patient.setDate_of_Birth(rowPatient[4]);
					patient.setPhone_number(rowPatient[5]);
					patient.setAddress(rowPatient[6]);
				
				
				patients.add(patient);
				
				return patient;
				}
				
				
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null;
		
		
	}
	

	public static Patient DelOne(int Patient_ID) {
		
		FileWriter filewriter;
		List<Patient> patients = FindAll();
		Patient patient = Patient_Data.FindOne(Patient_ID);
		
		try {
			filewriter = new FileWriter(Patient.getFilePath());
			
			for(int i=0;i<patients.size();i++) {
				if(patients .get(i).getPatient_ID()!=Patient_ID) {
				filewriter.append(patients.get(i).toString());
				filewriter.append("\n");
				}
			}
			
			patients.add(patient);
				
				filewriter.flush();
				filewriter.close();
			
	} catch (IOException e) {
			
			e.printStackTrace();
		}
		return patient;
	}

	public static List<Patient> Search(String search){
		List<Patient> patients= new ArrayList<Patient>();
		String line ;
		try {
			@SuppressWarnings("resource")
			BufferedReader bufferedReader = new BufferedReader(new FileReader(Patient.getFilePath()));
			
			while((line=bufferedReader.readLine())!=null) {
				Patient patient = new Patient();
				String[] rowPatient = line.split(",");
				if(rowPatient[1].contains(search)==true) {
					patient.setPatient_ID(Integer.parseInt(rowPatient[0]));
					patient.setFirst_Name(rowPatient[1]);
					patient.setLast_Name(rowPatient[2]);
					patient.setWeight(Integer.parseInt(rowPatient[3]));
					patient.setDate_of_Birth(rowPatient[4]);
					patient.setPhone_number(rowPatient[5]);
					patient.setAddress(rowPatient[6]);
				
				
				
				patients.add(patient);
				}
				//return rooms;
			}
			
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return patients;
	}


	
	public static Patient Update(int Prevoius_ID,Patient NewObject) {
		
		DelOne(Prevoius_ID);
		Save(NewObject);
		System.out.println("Updated Successfully");
		
		return NewObject;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
