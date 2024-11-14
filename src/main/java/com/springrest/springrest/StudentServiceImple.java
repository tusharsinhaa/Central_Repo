package com.springrest.springrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImple implements StudentService {

    @Autowired
   private StudentRepo studentRepo;

    @Override
    public boolean addStudentDetails(Student std) {
        boolean status=false;

        try
        {
            studentRepo.save(std);
            status=true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            status=false;
        }

        return status;
    }
}
