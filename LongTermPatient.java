/*
 Name: Amjad Qaher Sadeq Adi
 Id: 1230800
 Lec Sec :3
 Lab Sec :4L
 */
package myPackage;

public class LongTermPatient extends PatientBase{//inherits all patientPase properties and methods
private int daysAdmitted;
private double dailyRate;

public LongTermPatient() {

}

public LongTermPatient(String patientId, String name, int age, String medicalHistory, Department department,int daysAdmitted, double dailyRate) {
	super(patientId, name, age, medicalHistory, department);
	this.daysAdmitted = daysAdmitted;
	this.dailyRate = dailyRate;
}

public int getDaysAdmitted() {
	return daysAdmitted;
}

public void setDaysAdmitted(int daysAdmitted) {
	this.daysAdmitted = daysAdmitted;
}

public double getDailyRate() {
	return dailyRate;
}

public void setDailyRate(double dailyRate) {
	this.dailyRate = dailyRate;
}

@Override
public double calculateBill() {//looping the service array list for the patient and summing every service cost
	double totalServiceCost=0;
	for(HospitalService i: getServices())
		totalServiceCost+=i.getServiceCost();
	return (daysAdmitted*dailyRate+totalServiceCost)*(1+TAX_RATE);
}

}
