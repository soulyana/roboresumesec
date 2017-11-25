package me.jrmensah.roboresumesec;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Resume {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @NotNull
    @Size(min=2)
    private String firstName;
    @NotNull
    private String middleInit;
    @NotNull
    @Size(min=2)
    private String lastName;
    @NotNull
    @Size(min=2)
    private String email;
    @NotNull
    @Size(min=3)
    private String college;
    @NotNull
    @Size(min=2)
    private String degree;
    @NotNull
    @Size(min=3)
    private String major;
    @NotNull
    @Size(min=2)
    private String year;
    @NotNull
    @Size(min=3)
    private String skill;
    @NotNull
    @Size(min=3)
    private String workplace;
    @NotNull
    @Size(min=3)
    private String workTitle;
    @NotNull
    @Size(min=3)
    private String duty;
    @NotNull
    @Size(min=3)
    private String level;

    public Resume(String john, String s, String s1, String s2, String bs, String psychology, String uMaryland, String s3, String php, String amtrak, String developer, String duty1, String duty2, String highly_skilled) {
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

    public Resume() {

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