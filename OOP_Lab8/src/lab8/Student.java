package lab8;

//caden finley
public class Student extends Person {
		private String classStatus="";
		public Student(String name1,String address1, String phone1, String email1, String status1) {

			this.name = name1;
			this.adress = address1;
			this.phoneNumber = phone1;
			this.emailAdress = email1;
			this.classStatus= status1;
	}
		public String toString() {
			return(" Student: "+name+"\n Address: "+adress+"\n Phone Number: "
		+phoneNumber+"\n Email Address: "+emailAdress+"\n Class Status: "+classStatus);
		}
}

