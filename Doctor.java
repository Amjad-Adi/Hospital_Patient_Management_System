/*
 Name: Amjad Qaher Sadeq Adi
 Id: 1230800
 Lec Sec :3
 Lab Sec :4L
 */
package myPackage;
public class Doctor implements Comparable<Doctor>{
private String doctorId;
private String name;
private String specialty;
private String degree;
private double baseSalary;
private double overtimeHours;
private double overtimeRate;
private Department department;
public Doctor() {
	
}
public Doctor(String doctorId, String name, String specialty, String degree, double baseSalary, double overtimeHours, double overtimeRate, Department department) {
	this.doctorId = doctorId;
	this.name = name;
	this.specialty = specialty;
	this.degree = degree;
	this.baseSalary = baseSalary;
	this.overtimeHours=overtimeHours;
	this.overtimeRate = overtimeRate;
	this.department = department;
	department.addDoctor(this);//Adding the doctor to his department Doctors arrayList
}
public String getDoctorId() {
	return doctorId;
}
public void setDoctorId(String doctorId) {
	this.doctorId = doctorId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSpecialty() {
	return specialty;
}
public void setSpecialty(String specialty) {
	this.specialty = specialty;
}
public String getDegree() {
	return degree;
}
public void setDegree(String degree) {
	this.degree = degree;
}
public double getBaseSalary() {
	return baseSalary;
}
public void setBaseSalary(double baseSalary) {
	this.baseSalary = baseSalary;
}
public double getOvertimeRate() {
	return overtimeRate;
}
public void setOvertimeRate(double overtimeRate) {
	this.overtimeRate = overtimeRate;
}
public double getOvertimeHours() {
	return overtimeHours;
}
public void setOvertimeHours(double overtimeHours) {
	this.overtimeHours = overtimeHours;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
public double calculateSalary() {
	double salary=0;
	if(degree.equals("Bachelor"))
		salary=baseSalary*1.1;
	else if(degree.equals("Master"))
		salary=baseSalary*1.2;
	else if(degree.equals("PhD"))
		salary=baseSalary*1.3;
	return salary+calculateOverTimePay();
}
public double calculateOverTimePay() {
	return overtimeHours*overtimeRate;
}

@Override
public String toString() {// returns the doctor info
	return "Doctor [doctor Id=" + doctorId + ", name=" + name + ", specialty=" + specialty + ", degree=" + degree
			+ ", base salary=" + baseSalary + ", over time hours=" + overtimeHours + ", over time rate=" + overtimeRate
			+", Over time pay= "+ calculateOverTimePay() +", salary =" +calculateSalary() + "]";
}
@Override
public int compareTo(Doctor secondDoctor) {//Comparing the doctors based on their total salary
    return Double.compare(calculateSalary(), secondDoctor.calculateSalary());//there is no need to put this.calculateSalary() in the first argument
}

}
