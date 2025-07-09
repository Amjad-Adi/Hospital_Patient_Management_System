/*
 Name: Amjad Qaher Sadeq Adi
 Id: 1230800
 Lec Sec :3
 Lab Sec :4L
 */
package myPackage;

import java.util.ArrayList;//Imported for the usage of ArrayList

public class Department {
private String departmentId;
private String name;
private ArrayList<Doctor>doctors=new ArrayList<Doctor>();
private ArrayList<PatientBase>patients=new ArrayList<PatientBase>();
public Department() {
	
}
public Department(String departmentId, String name) {
	this.departmentId = departmentId;
	this.name = name;
}
public String getDepartmentId() {
	return departmentId;
}
public void setDepartmentId(String departmentId) {
	this.departmentId = departmentId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public ArrayList<Doctor> getDoctors() {
	return doctors;
}
public void setDoctors(ArrayList<Doctor> doctors) {
	this.doctors = doctors;
}
public ArrayList<PatientBase> getPatients() {
	return patients;
}
public void setPatients(ArrayList<PatientBase> patients) {
	this.patients = patients;
}
public void addDoctor(Doctor doctor) {//Adding the doctor to the department array list
	doctors.add(doctor);
}
public void addPatient(PatientBase patient) {//Adding the patient to the department array list
	patients.add(patient);
}
@Override
public String toString() {
	String str= "Department [department Id=" + departmentId + ", name=" + name+"]\nDoctors in department: ";//department info
	if(doctors.isEmpty())//if there is no doctors in the department print none
		str+="none\n";
	else for(int i=0;i<doctors.size();i++)//if there is doctors in the department print their info
		str+="\n"+(i+1)+"-Doctor [doctor Id=" + doctors.get(i).getDoctorId() + ", name=" + doctors.get(i).getName()  + ", specialty=" +doctors.get(i).getSpecialty() +
		", degree=" + doctors.get(i).getDegree() + ", base salary=" + doctors.get(i).getBaseSalary() + ", over time hours=" + doctors.get(i).getOvertimeHours()+ 
		", over time rate=" + doctors.get(i).getOvertimeRate() + ", Over time pay= "
		+ doctors.get(i).calculateOverTimePay() +", salary ="+doctors.get(i).calculateSalary() +"]\n";
	str+="Patients in department:";
	if(patients.isEmpty())//if there is no patients in the department print none
		str+="none\n";
	else for(int i=0;i<patients.size();i++)//if there is patients in the department print their info
		str+="\n"+(i+1)+"-PatientBase [patientId=" + patients.get(i).getPatientId() + ", name=" + patients.get(i).getName() + ", age=" + patients.get(i).getAge() + ", medicalHistory="
				+ patients.get(i).getMedicalHistory()+"]";
return str;
}
}
