package com.conversion.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="facility")
public class FacilityEntity {
	@Id
	@Column(name="tran_id")
	@GeneratedValue
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="code")
	private String code;
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="zip")
	private String zip;

	@Column(name="phone")
	private String phone;	
	
	@Column(name="note")
	private String note;

	@Column(name="robot_flag")
	private String robotFlag;
	
	public FacilityEntity() {
		
	}
	
	public FacilityEntity(int id, String name, String phone, String city, String state, String address, String zip,
			String note, String code, String robotFlag) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.city = city;
		this.state = state;
		this.address = address;
		this.zip = zip;
		this.note = note;
		this.code = code;
		this.robotFlag = robotFlag;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRobotFlag() {
		return robotFlag;
	}

	public void setRobotFlag(String robotFlag) {
		this.robotFlag = robotFlag;
	}


	@Override
	public String toString() {
		return "FacilityEntity [id=" + id + ", name=" + name + ", code=" + code + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zip=" + zip + ", phone=" + phone + ", note=" + note + ", robotFlag="
				+ robotFlag + "]";
	}
	
}
