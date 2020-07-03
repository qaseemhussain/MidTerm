package com.uog.midterm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Report_Data {
	
	public static List<Report> FindAll(){
		List<Report> reports= new ArrayList<Report>();
		String line ;
		try {
			
			@SuppressWarnings("resource")
			BufferedReader bufferedReader = new BufferedReader(new FileReader(Report.getFilePath()));
			
			while((line=bufferedReader.readLine()) != null) {
				Report report = new Report();
				String[] row = line.split(",");
				report.setReport_ID(Integer.parseInt(row[0]));
				report.setPetient_ID(Patient_Data.FindOne(Integer.parseInt(row[1])));
				report.setDoctor_Name(row[2]);
				report.setHospital_Name(row[3]);
				report.setReport_Issue_Date(row[4]);
				report.setReport_Description(row[5]);
				
				
				reports.add(report);
			}
			
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return reports;
	}
	
	
	public static Report Save(Report report) {
		
		FileWriter filewriter;
		List<Report> reports = FindAll();
		
		try {
			filewriter = new FileWriter(Report.getFilePath());
			
			for(int i=0;i<reports.size();i++) {
				filewriter.append(reports.get(i).toString());
				filewriter.append("\n");
			}
			
			
			if(reports.size()>0) {
				report.setReport_ID(reports.get(reports.size()-1).getReport_ID());
				
			}
			else {
				report.setReport_ID(1);
			}
			reports.add(report);
				filewriter.append(report.toString());
				filewriter.append("\n");
				filewriter.flush();
				filewriter.close();
			
			
			
	} catch (IOException e) {
			
			e.printStackTrace();
		}
		return report;
	}

	public static Report FindOne(int Patient_ID){
		
		List<Report> reports = new ArrayList<Report>();	
		String line;
		try {
			@SuppressWarnings("resource")
			BufferedReader bufferreader = new BufferedReader(new FileReader(Report.getFilePath()));
			
			while((line=bufferreader.readLine())!=null) {
				Report report = new Report();
				String[] rowReport = line.split(",");
				
				if(Integer.parseInt(rowReport[0]) == Patient_ID ) 
				
				{
					
					report.setReport_ID(Integer.parseInt(rowReport[0]));
					report.setPetient_ID(Patient_Data.FindOne(Integer.parseInt(rowReport[1])));
					report.setDoctor_Name(rowReport[2]);
					report.setHospital_Name(rowReport[3]);
					report.setReport_Issue_Date(rowReport[4]);
					report.setReport_Description(rowReport[5]);
				
				
					reports.add(report);
				
				return report;
				}
				
				
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null;
		
		
	}
	

	public static Report DelOne(int Report_ID) {
		
		FileWriter filewriter;
		List<Report> reports = FindAll();
		Report report = Report_Data.FindOne(Report_ID);
		
		try {
			filewriter = new FileWriter(Report.getFilePath());
			
			for(int i=0;i<reports.size();i++) {
				if(reports .get(i).getReport_ID()!=Report_ID) {
				filewriter.append(reports.get(i).toString());
				filewriter.append("\n");
				}
			}
			
			reports.add(report);
				
				filewriter.flush();
				filewriter.close();
			
	} catch (IOException e) {
			
			e.printStackTrace();
		}
		return report;
	}

	public static List<Report> Search(String search){
		List<Report> reports= new ArrayList<Report>();
		String line ;
		try {
			@SuppressWarnings("resource")
			BufferedReader bufferedReader = new BufferedReader(new FileReader(Report.getFilePath()));
			
			while((line=bufferedReader.readLine())!=null) {
				Report report = new Report();
				String[] row = line.split(",");
				if(row[2].contains(search)==true) {
					report.setReport_ID(Integer.parseInt(row[0]));
					report.setPetient_ID(Patient_Data.FindOne(Integer.parseInt(row[1])));
					report.setDoctor_Name(row[2]);
					report.setHospital_Name(row[3]);
					report.setReport_Issue_Date(row[4]);
					report.setReport_Description(row[5]);
				
				
				
				reports.add(report);
				}
				//return rooms;
			}
			
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return reports;
	}

	public static Report Update(int Prevois_ID,Report NewObject) {
		DelOne(Prevois_ID);
		System.out.println("Updated Successfully");
	
		Save(NewObject);
		return NewObject;
		
}
}

