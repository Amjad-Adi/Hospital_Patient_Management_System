/*
 Name: Amjad Qaher Sadeq Adi
 Id: 1230800
 Lec Sec :3
 Lab Sec :4L
 */
package myPackage;

public interface Billable {//Using interface to ensure the classes that implements it has the constant TAX_RATE and defines the implementation of calculateBill method
public final double TAX_RATE=2;//Actually we can write double TAX_RATE=2 and it is the same as public static final double TAX_RATE=2 in an interface
public abstract double calculateBill();//Actually we can write double calculateBill() and it is the same as public abstract double calculateBill() in an interface
}
