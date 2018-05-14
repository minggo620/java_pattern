package pattern.prototype;

import java.util.Random;

/**
 * 原型模式
 * 1.一种拷贝方式对对象进行拷贝一份。
 * 2.注意浅拷贝和深拷贝。
 * @author minggo
 * @time 2017年7月18日下午5:22:13
 */
public class Client {

	public static void main(String[] args) {
		School school = new School();
		school.setSchoolName("广州执信中学");
		school.setAddress("广州市越秀区执信南路");
		
		Student student = new Student(school);
		
		for (int i = 0; i < 10; i++) {
			try {
				Student std = student.clone();
				std.setAge(new Random().nextInt(8)+20);
				std.setName("学生"+i);
				
				inputStudent(std);
				
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			} 
		}
	}
	
	public static void inputStudent(Student student){
		System.out.println("学生："+student.getName()+"年龄："+student.getAge()+",学校:"+student.getSchool()+"校址："+student.getSchooladdr());
	}

}
