package myPackage;

public class HospitalService {
private String serviceName;
private double serviceCost;
private PatientBase patient;
public HospitalService(){
	
}
public HospitalService(String serviceName, double serviceCost, PatientBase patient) {
	this.serviceName = serviceName;
	this.serviceCost = serviceCost;
	this.patient = patient;
	patient.getServices().add(this);//Adding the service to its patient service list
}
public String getServiceName() {
	return serviceName;
}
public void setServiceName(String serviceName) {
	this.serviceName = serviceName;
}
public double getServiceCost() {
	return serviceCost;
}
public void setServiceCost(double serviceCost) {
	this.serviceCost = serviceCost;
}
public PatientBase getPatient() {
	return patient;
}
public void setPatient(PatientBase patient) {
	this.patient = patient;
}
@Override
public String toString() {//print the service info and the patient that takes it ifo
	return "Hospital service: Service name: "+serviceName+", serviceCost: "+serviceCost+"\ntaken by patient: [patientId=" + patient.getPatientId() + ", name=" + patient.getName() + ", age=" + patient.getAge() + ", medicalHistory="
			+ patient.getMedicalHistory()+"]";
}
}
