package SPRING.Rest.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SPRING.Rest.MODEL.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
