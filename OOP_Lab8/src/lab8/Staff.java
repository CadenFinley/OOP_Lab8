package lab8;

//caden finley
public class Staff extends Employee{

		private String title;
		public Staff(String name1, String address1, String phone1, String email1,int office1,int salary1,String title1,String newDateHired) {
			this.name = name1;
			this.adress = address1;
			this.phoneNumber = phone1;
			this.emailAdress = email1;
			this.officeNumber = office1;
			this.salary = salary1;
			this.title = title1;
			MyDate date = new MyDate(newDateHired);
			this.dateHired = date.getDate();
	}
		public String toString() {
			return(" Employee: "+name+"\n Address: "+adress+"\n Phone Number: "+phoneNumber+"\n Email Address: "+emailAdress+
					"\n Office Number: "+officeNumber+"\n Salary: "+salary+"\n Title: "+title+"\n Date Hired: "+dateHired);
		}
}

