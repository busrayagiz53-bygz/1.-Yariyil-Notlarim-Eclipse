package com.study.eclipse;

import com.study.eclipse.*;

public class StudentClassObjects {


		private String fname;
		private String lname;
		private int stuID;
		private double gpa;
		private String department;
		private int password;
		
		//constructor = yapıcı
		
		public StudentClassObjects() {
			//default const.
		}
		
		public StudentClassObjects(String fname) {
			this.fname=fname;
			this.password=ArrayRandomPassword.generatePassword(10);
		}
		
		public StudentClassObjects(String fname, String lname, String department) {
			this.fname=fname;
			this.lname=lname;
			this.department=department;
			this.password=ArrayRandomPassword.generatePassword(10);
		}
		
		
		
		public StudentClassObjects(String fname, String lname, int stuID, double gpa, String department) {
			super();
			this.fname = fname;
			this.lname = lname;
			this.stuID = stuID;
			this.gpa = gpa;
			this.department = department;
			this.password=ArrayRandomPassword.generatePassword(10);
		}
		
		

		public StudentClassObjects(int stuID) {
			super();
			this.stuID = stuID;
		}

		public String getFname() {
			return fname;
		}



		public String getLname() {
			return lname;
		}



		public int getStuID() {
			return stuID;
		}



		public double getGpa() {
			return gpa;
		}

		public void setGpa(double gpa) {
			this.gpa = gpa;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public int getPassword() {
			return password;
		}

		public void setPassword(int password) {
			this.password = password;
		}

		@Override
		public String toString() {
			
			return "Name: " + fname+" "+lname+", ID:" + stuID + ", GPA:" + gpa + ", passowrd:" + password;
		}
		

	}

	

