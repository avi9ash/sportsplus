package com.cse.sportsplus.models;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_athelete")
public class Athelete implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="athelete_id")
    private long id;
	@Column(name="first_name")
    private String firstName;
	@Column(name="last_name")
    private String lastName;
	@Column(name="dob")
    private String  dob;
	@Column(name="age")
    private long age;
	@Column(name="gender")
    private char gender;
	@Column(name="contact_no")
    private long contactNo;
	@Column(name="address")
    private String address;
	@Column(name="parent_name")
    private String parentFullName;
	@Column(name="parent_address")
    private String parentAddress;
	@Column(name="parent_contact")
    private long parentContact;
    //primary sports check for implementation...
	@Column(name="training_base")
    private String trainingBase;
	@Column(name="college")
    private String college;
	@Column(name="group_id")
    private ArrayList<Integer> groupId;
	@Column(name="coach_id")
    private long coachId;
	@Column(name="level")
    private String level;
	@Column(name="resident_status")
    private String residentStatus;
	@Column(name="athelete_status")
    private ArrayList<String> athleteStatus;
	@Column(name="blood_group")
    private String bloodGroup;

    public Athelete(long id, String firstName, String lastName, String dob, long age, char gender, long contactNo, String address, String parentFullName, String parentAddress, long parentContact, String trainingBase, String college, ArrayList<Integer> groupId,
                    long coachId, String level, String residentStatus, ArrayList<String> athleteStatus, String bloodGroup) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.age = age;
        this.gender = gender;
        this.contactNo = contactNo;
        this.address = address;
        this.parentFullName = parentFullName;
        this.parentAddress = parentAddress;
        this.parentContact = parentContact;
        this.trainingBase = trainingBase;
        this.college = college;
        this.groupId = groupId;
        this.coachId = coachId;
        this.level = level;
        this.residentStatus = residentStatus;
        this.athleteStatus = athleteStatus;
        this.bloodGroup = bloodGroup;
    }

    public Athelete() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getParentFullName() {
        return parentFullName;
    }

    public void setParentFullName(String parentFullName) {
        this.parentFullName = parentFullName;
    }

    public String getParentAddress() {
        return parentAddress;
    }

    public void setParentAddress(String parentAddress) {
        this.parentAddress = parentAddress;
    }

    public long getParentContact() {
        return parentContact;
    }

    public void setParentContact(long parentContact) {
        this.parentContact = parentContact;
    }

    public String getTrainingBase() {
        return trainingBase;
    }

    public void setTrainingBase(String trainingBase) {
        this.trainingBase = trainingBase;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public ArrayList<Integer> getGroupId() {
        return groupId;
    }

    public void setGroupId(ArrayList<Integer> groupId) {
        this.groupId = groupId;
    }

    public long getCoachId() {
        return coachId;
    }

    public void setCoachId(long coachId) {
        this.coachId = coachId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getResidentStatus() {
        return residentStatus;
    }

    public void setResidentStatus(String residentStatus) {
        this.residentStatus = residentStatus;
    }

    public ArrayList<String> getAthleteStatus() {
        return athleteStatus;
    }

    public void setAthleteStatus(ArrayList<String> athleteStatus) {
        this.athleteStatus = athleteStatus;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
