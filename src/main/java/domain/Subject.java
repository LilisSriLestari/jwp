package domain;

public class Subject {
    private String courseCode;
    private String courseName;
    private Integer totalCredit;
    private String faculty;

    public Subject() {
    }
    
    public String getCourseCode() {
        return courseCode;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public Integer getTotalCredit() {
        return totalCredit;
    }
    public void setTotalCredit(Integer totalCredit) {
        this.totalCredit = totalCredit;
    }
    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
