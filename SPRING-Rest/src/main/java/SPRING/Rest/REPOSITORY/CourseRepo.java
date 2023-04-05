package SPRING.Rest.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SPRING.Rest.MODEL.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer>{

}
