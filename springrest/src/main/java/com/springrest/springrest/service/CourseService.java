package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entity.Course;

public interface CourseService {
	
	public List<Course> getcourses();
	
	public Course getCourse(int courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course, int courseId);
	
	public void deleteCourse(int courseId);
}
