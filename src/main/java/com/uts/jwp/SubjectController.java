package com.uts.jwp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.Subject;



@RestController
public class SubjectController {
    
    @GetMapping("/subjects")
    public List<Subject> getSubjects() {

        List<Subject> subjectList = new ArrayList<>();
        Subject subject1 = new Subject();
        subject1.setCourseCode("PG130");
        subject1.setCourseName("Java WEB Programming");
        subject1.setTotalCredit(3);
        subject1.setFaculty("FTI");

        Subject subject2 = new Subject();
        subject2.setCourseCode("PG100");
        subject2.setCourseName("JRekayasa WEB");
        subject2.setTotalCredit(2);
        subject2.setFaculty("FTI");

        Subject subject3 = new Subject();
        subject3.setCourseCode("AC120");
        subject3.setCourseName("Dasar Accounting");
        subject3.setTotalCredit(3);
        subject3.setFaculty("FE");

        Subject subject4 = new Subject();
        subject4.setCourseCode("2112501461");
        subject4.setCourseName("Lilis Sri Lestari");
        subject4.setTotalCredit(3);
        subject4.setFaculty("FTI");

        subjectList.addAll(List.of(subject1, subject2, subject3, subject4));
        return subjectList;
    }


}
    