package homeWork3;

public class StudentInfo {

	public static void main(String[] args) {

		Student stdInfo = new Student();
		stdInfo.setStudentFirstName("Barack");
		stdInfo.setStudentLastName("Obama");
		stdInfo.setStudentId(123456);
		stdInfo.setStudentSSN("123-456-7890");

		System.out.println("Students Info: " + stdInfo.getStudentFirstName() + " "+ stdInfo.getStudentLastName()
		+ " " + stdInfo.getStudentId() + " " + stdInfo.getStudentSSN());
		
		Student stdInfo2 = new Student();
		stdInfo2.setStudentFirstName("Donald");
		stdInfo2.setStudentLastName("Trump");
		stdInfo2.setStudentId(111111);
		stdInfo2.setStudentSSN("098-765-4321");
	
		System.out.println("Students Info: " + stdInfo2.getStudentFirstName() + " "+ stdInfo2.getStudentLastName()
		+ " " + stdInfo2.getStudentId() + " " + stdInfo2.getStudentSSN());
	}
	

}
