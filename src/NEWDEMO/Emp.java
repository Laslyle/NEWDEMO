package NEWDEMO;

public class Emp {
public String getEmpPayNumber() {
		return EmpPayNumber;
	}
	public void setEmpPayNumber(String empof) {
		EmpPayNumber = empof;
	}
	public String getTelNumber() {
		return TelNumber;
	}
	public void setTelNumber(String empof) {
		TelNumber = empof;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getInitName() {
		return initName;
	}
	public void setInitName(String initName) {
		this.initName = initName;
	}
	public String getDepNumber() {
		return DepNumber;
	}
	public void setDepNumber(String empof) {
		DepNumber = empof;
	}
	public String getJobTitle() {
		return JobTitle;
	}
	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String empof) {
		Date = empof;
	}
String	EmpPayNumber;//3 位数字
String	TelNumber;//XX-XXXXXXXX （X 都为数字，详细要求见下文 P8）
String	lastName;//(last name, first name, initial) （必须都为英文）
String	firstName;
String	initName;
String	DepNumber;//（都为数字）
String JobTitle; //（必须都为英文）
String Date;// XX-XX-XXXX（X 都为数字）
}