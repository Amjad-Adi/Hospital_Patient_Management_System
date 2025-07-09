/*
 Name: Amjad Qaher Sadeq Adi
 Id: 1230800
 Lec Sec :3
 Lab Sec :4L
 */
package myPackage;

public class EmergencyPatient extends PatientBase{//inherits all patientPase properties and methods
private double emergencyFee;

public EmergencyPatient() {
	
}

public EmergencyPatient(String patientId, String name, int age, String medicalHistory, Department department, double emergencyFee) {
	super(patientId, name, age, medicalHistory, department);
	this.emergencyFee = emergencyFee;
}

public double getEmergecyFee() {
	return emergencyFee;
}

public void setEmergecyFee(double emergencyFee) {
	this.emergencyFee = emergencyFee;
}

@Override
public double calculateBill() {
	double totalServiceCost=0;
	for(HospitalService i: getServices())//looping the service array list for the patient and summing every service cost
		totalServiceCost+=i.getServiceCost();
	return emergencyFee+totalServiceCost*(1+TAX_RATE);
}
}
