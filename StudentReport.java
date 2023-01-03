package com.mile1.service;
import com.mile1.bean.Student;
public class StudentReport{
public String findGrades(Student studentObject)
{
	if(studentObject.getMarks()<35)
	{
		studentObject.setGrade("F");
	}
	else
	{
		int sum=0;
		for(int i=0;i<(studentObject.getMarks()).length;i++)
		{
			s=s+studentObject.getMarks[i];
		}
		if(sum<150)
			studentObject.setGrade("C");
		else if(sum<200)
			studentObject.setGrade("B");
		else if(sum<250)
			studentObject.setGrade("A");
		else
			studentObject.setGrade("A+");
	}
	return studentObject.getGrade();
}
}
