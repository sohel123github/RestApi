package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entity.Course;

@Service
public class CouresServiceImpl implements CourseService{
	
	@Autowired
	private CourseDao courseDao;
	
//	List<Course> list;
	
	public CouresServiceImpl () {
//		list=new ArrayList<>();
//		list.add(new Course(1, "Java", "This is a java Course"));
//		list.add(new Course(2, "Python", "This is a Python Course"));
//		list.add(new Course(3, "Kotlin", "This is a Kotlin Course"));
//		list.add(new Course(4, "ReactJs", "This is a ReactJs Course"));
	}
	
	@Override
	public List<Course> getcourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(int courseId) {
//		Course c=null;
//		for (Course course : list) {
//			if(course.getCourseId()==courseId) {
//				c= course;
//				break;
//			}
//		}
		
		Course c=null;
		try {
			c=this.courseDao.findById(courseId).get();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course, int courseId) {
//		list=list.stream().map(e -> {
//			if (e.getCourseId()==courseId) {
//				e.setCourseName(course.getCourseName());
//				e.setDescription(course.getDescription());
//			}
//			return e;
//		}).collect(Collectors.toList());
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(int courseId) {
//		list=list.stream().filter(e -> e.getCourseId() != courseId)
//		.collect(Collectors.toList());
		
			Course entity=courseDao.getReferenceById(courseId);
			courseDao.delete(entity);
	}

	

	
	
	
	
}
