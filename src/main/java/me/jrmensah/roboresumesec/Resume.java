package me.jrmensah.roboresumesec;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Resume {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String firstName;
    private String middleInit;
    private String lastName;
    private String email;
    private String college;
    private String degree;
    private String major;
    private String year;
    private String skill;
    private String workplace;
    private String workTitle;
    private String duty;
    private String level;

    public Resume() {
    }

    public Resume(String firstName, String middleInit, String lastName, String email, String college, String degree, String major, String year, String skill, String workplace, String workTitle, String duty, String level) {
        this.firstName = firstName;
        this.middleInit = middleInit;
        this.lastName = lastName;
        this.email = email;
        this.college = college;
        this.degree = degree;
        this.major = major;
        this.year = year;
        this.skill = skill;
        this.workplace = workplace;
        this.workTitle = workTitle;
        this.duty = duty;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleInit() {
        return middleInit;
    }

    public void setMiddleInit(String middleInit) {
        this.middleInit = middleInit;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getWorkTitle() {
        return workTitle;
    }

    public void setWorkTitle(String workTitle) {
        this.workTitle = workTitle;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}