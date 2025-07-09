# Hospital_Patient_Management_System(9.3/10)

![image](https://github.com/user-attachments/assets/1c1b14eb-52c2-4a5d-bc80-30a19ba90152)

A comprehensive Java-based simulation of a hospital management system that models patient records, billing, departmental structure, and staff salary computations using object-oriented programming principles.

This system demonstrates inheritance, polymorphism, encapsulation, and collection handling in Java.

🎯 Project Objective
To design and implement a modular hospital management system in Java using Eclipse IDE that:

Tracks emergency and long-term patients

Computes bills based on patient type and services used

Calculates doctor salaries with consideration of degree and overtime

Associates doctors and patients with specific departments

Allows sorting and reporting of hospital data for analysis

🧱 Key Components
🧑‍⚕️ Doctor Class
Attributes: ID, name, specialty, degree, base salary, overtime hours/rate, department.

Methods:

calculateSalary(): Computes total salary based on degree level and overtime.

calculateOvertimePay(): Computes pay for overtime hours.

🏥 Department Class
Attributes: ID, name.

Methods:

addDoctor(Doctor): Adds a doctor to the department.

addPatient(Patient): Adds a patient to the department.

👨‍🦽 PatientBase Class (Abstract)
Attributes: ID, name, age, medical history, department.

Subclasses:

EmergencyPatient: Includes emergencyFee.

calculateBill(): emergencyFee + totalServiceCost × (1 + TAX_RATE)

LongTermPatient: Includes daysAdmitted, dailyRate.

calculateBill(): (daysAdmitted × dailyRate + totalServiceCost) × (1 + TAX_RATE)

🧪 HospitalService Class
Attributes: service name, cost, associated patient.

🧪 Simulation Tasks in Main
Create:

3 predefined patients (2 emergency, 1 long-term)

3 departments

2 predefined doctors

List of hospital services (e.g., MRI, X-ray) assigned to patients

Generate the bill for the third patient

Sort and display:

Patients by bill amount

Doctors by salary

Print:

Doctors’ department names and salaries

Patients’ names and ages

Total hospital billing amount

🧠 Concepts Practiced
✅ Inheritance & Polymorphism

✅ ArrayLists & Collections

✅ Static method utilities

✅ Custom sorting using Collections.sort()

✅ Clean class design and modularization

✅ Data encapsulation with getters/setters
