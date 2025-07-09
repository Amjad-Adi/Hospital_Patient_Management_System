/*
 Name: Amjad Qaher Sadeq Adi
 Id: 1230800
 Lec Sec :3
 Lab Sec :4L
 */
package myPackage;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		Department surgeyDepartment = new Department("1A", "Department of surgey");
		Department musselesDepartment = new Department("2B", "Department of musseles");
		Department bonesDepartment = new Department("3C", "Department of Bones");
		Doctor doctorSalem = new Doctor("1111", "Salem", "Surgey", "Master", 5000, 20, 100, surgeyDepartment);
		Doctor doctorKareem = new Doctor("2222", "Kareem", "Musseles", "Bachelor", 4000, 40, 80, musselesDepartment);
		ArrayList<PatientBase> patientsInHospital = new ArrayList<PatientBase>();
		patientsInHospital.add(new EmergencyPatient("789", "Sameer", 9, "Muscle cramp", musselesDepartment, 5000));
		patientsInHospital.add(new LongTermPatient("456", "Ali", 50, "Broken bones", bonesDepartment, 100, 30));
		patientsInHospital.add(new EmergencyPatient("123", "Husam", 18, "ischaemic stroke", surgeyDepartment, 550));
		ArrayList<Doctor> doctorsInHospital = new ArrayList<Doctor>();
		doctorsInHospital.add(doctorSalem);
		doctorsInHospital.add(doctorKareem);
		ArrayList<HospitalService> hospitalServices = new ArrayList<HospitalService>();
		hospitalServices.add(new HospitalService("XRAY", 50, patientsInHospital.get(1)));
		hospitalServices.add(new HospitalService("LabTest", 100, patientsInHospital.get(2)));
		//The results:
		generateBill(patientsInHospital.get(2));
		System.out.println("********************************************************************************************************************************************");
		Collections.sort(patientsInHospital);
		System.out.println("This message is to inform you that patients has been sorted by Bill amount\n********************************************************************************************************************************************");
		sortDoctorsBySalary(doctorsInHospital);
		System.out.println("This message is to inform you that doctors has been sorted by Bill amount\n********************************************************************************************************************************************");
		for(Doctor i:doctorsInHospital)
			System.out.println("Doctor "+i.getName()+", working in: "+i.getDepartment().getName()+", with salary: "+i.calculateSalary());
		System.out.println("********************************************************************************************************************************************");
		for(PatientBase i:patientsInHospital)
			System.out.println("Patient name: "+i.getName()+", Age of: "+i.getAge());
		System.out.println("********************************************************************************************************************************************");
		System.out.println("The total sum of all patients bill is: "+calculateTotalpatientsBill(patientsInHospital));
		System.out.println("********************************************************************************************************************************************");
	}

	public static void generateBill(PatientBase patient) {
		System.out.println("Patients ID: " + patient.getPatientId() + ", Patient name: " + patient.getName()
				+ " ,Total Bill: " + patient.calculateBill());
	}

	public static double calculateTotalpatientsBill(ArrayList<PatientBase> patientList) {
		double totalPatientsBill = 0;
		for (PatientBase i : patientList)
			totalPatientsBill += i.calculateBill();
		return totalPatientsBill;
	}

	public static void sortDoctorsBySalary(ArrayList<Doctor> doctorArrayList) {
		Collections.sort(doctorArrayList);
	}

}