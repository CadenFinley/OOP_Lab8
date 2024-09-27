package lab8;
//caden finley

public class Faculty extends Employee{
		private String officeHours;
		private String rank;
		public Faculty(String name1, String address1, String phone1, String email1,int office1,int salary1,String hours1,String rank1,String newDateHired) {
			this.name = name1;
			this.adress = address1;
			this.phoneNumber = phone1;
			this.emailAdress = email1;
			this.officeNumber = office1;
			this.salary = salary1;
			MyDate date = new MyDate(newDateHired);
			this.dateHired = date.getDate();
			this.officeHours = hours1;
			this.rank =rank1;
	}
		public String toString() {
			return(" Employee: "+name+"\n Address: "+adress+"\n Phone Number: "+phoneNumber+"\n Email Address: "+emailAdress+"\n Office Number: "
		+officeNumber+"\n Salary: "+salary+"\n Office Hours: "+officeHours+"\n Rank: "+rank+"\n Date Hired: "+dateHired);
		}
}

