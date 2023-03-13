package mini_projects;
public class Student {
	
	private int studentID;
	private String studentName;
	private String studentPhone;
	private String studentCity;
	
	private String studentcourse;
	private String studenttuition;
	//private String studentbalance;
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	
	public String getStudentcourse() {
		return studentcourse;
	}
	public void setStudentcourse(String studentcourse) {
		this.studentcourse = studentcourse;
	}
	public String getStudenttuition() {
		return studenttuition;
	}
	public void setStudenttuition(String studenttuition) {
		this.studenttuition = studenttuition;
	}
	/*public String getStudentbalance() {
		return studentbalance;
	}
	public void setStudentbalance(String studentbalance) {
		this.studentbalance = studentbalance;
	}*/
	public Student(int studentID, String studentName, String studentPhone, String studentCity , String studentcourse , String studenttuition, String studentbalance ) 
	{
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
		this.studentcourse =studentcourse;
		this.studenttuition =studenttuition;
		//this.studentbalance =studentbalance;
	}
	public Student(String studentName, String studentPhone, String studentCity,String studentcourse , String studenttuition ) {
		super();
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
		this.studentcourse =studentcourse;
		this.studenttuition =studenttuition;
		//this.studentbalance =studentbalance;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ",studentName=" + studentName + ", studentPhone=" + studentPhone
				+ ", studentCity=" + studentCity + ", studentcourse=" + studentcourse+  ", studenttuition="+ studenttuition + "]";
	}
}


