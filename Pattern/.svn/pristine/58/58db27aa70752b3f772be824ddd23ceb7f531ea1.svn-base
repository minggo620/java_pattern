package pattern.prototype;

/**
 * 学生
 * @author minggo
 * @time 2017年7月18日下午5:37:19
 */
public class Student implements Cloneable{
	
	private String name;
	private int age;
	
	private String school;
	private String schooladdr;
	
	public Student(School school){
		this.school = school.getSchoolName();
		this.schooladdr = school.getSchoolName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSchooladdr() {
		return schooladdr;
	}

	public void setSchooladdr(String schooladdr) {
		this.schooladdr = schooladdr;
	}

	@Override
	protected Student clone() throws CloneNotSupportedException {
		
		Student student = null;
		student = (Student) super.clone();
		
		return student;
		
	}
	
}
