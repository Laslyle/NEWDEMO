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
String	EmpPayNumber;//3 λ����
String	TelNumber;//XX-XXXXXXXX ��X ��Ϊ���֣���ϸҪ������� P8��
String	lastName;//(last name, first name, initial) �����붼ΪӢ�ģ�
String	firstName;
String	initName;
String	DepNumber;//����Ϊ���֣�
String JobTitle; //�����붼ΪӢ�ģ�
String Date;// XX-XX-XXXX��X ��Ϊ���֣�
}