/*
 Name: Amjad Qaher Sadeq Adi
 Id: 1230800
 Lec Sec :3
 Lab Sec :4L
 */
package myPackage;

import java.util.ArrayList;
public abstract class PatientBase implements Billable,Comparable<PatientBase>{
private String patientId;
private String name;
private int age;
private String medicalHistory;
private Department department;
private ArrayList <HospitalService> services=new ArrayList<HospitalService>();
public PatientBase() {
	
}
public PatientBase(String patientId, String name, int age, String medicalHistory, Department department) {
	this.patientId = patientId;
	this.name = name;
	this.age = age;
	this.medicalHistory = medicalHistory;
	this.department = department;
	department.addPatient(this);//Adding the patient to his department patient ArrayList
}
public String getPatientId() {
	return patientId;
}
public void setPatientId(String patientId) {
	this.patientId = patientId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getMedicalHistory() {
	return medicalHistory;
}
public void setMedicalHistory(String medicalHistory) {
	this.medicalHistory = medicalHistory;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
public ArrayList<HospitalService> getServices() {
	return services;
}
public void setServices(ArrayList<HospitalService> services) {
	this.services = services;
}
@Override
public int compareTo(PatientBase second) {//Comparing Patients Bills
	return Double.compare(calculateBill(), second.calculateBill());
}
@Override
public abstract double calculateBill();//passing the responsibility of the method implementation to the sub classes

public String toString() {
	String patientInfo="PatientBase: [patientId=" + patientId + ", name=" + name + ", age=" + age + ", medicalHistory="
			+ medicalHistory +", Bill= "+ calculateBill()+ "]\nbeing treated in Department [department Id=" + department.getDepartmentId() + ", name=" + department.getName()+
			"]\nServices taken:\n";//printing the patient info
	if(services.isEmpty())//if the patient takes no service print none
		patientInfo+="none\n";
	else for(int i=0;i<services.size();i++)//if the patient takes services print its info
	patientInfo+= (i+1)+"-Hospital service: [Service name: "+services.get(i).getServiceName()+", serviceCost: "+services.get(i).getServiceCost()+"]\n";
	return patientInfo;
}
}
