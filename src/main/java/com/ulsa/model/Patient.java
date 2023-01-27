package com.ulsa.model;

public class Patient {
	private int numberFile;
	private String title;
	private String name;
	private String lastname;
	private String address;
	private String city;
	private String state;
	private int cp;
	private String phoneHouse;
	private String phoneOffice;
	private String email;
	private String sex;
	private String nss;
	private String birthplace;
	private String birthdate;
	private int age;
	private String medic;
	private String civilState;
	private String motherName;
	private String fatherName;
	private String coupleName;
	private String precedence;
	private String ocupation;
	private String escolarity;
	private String school;
	private String observations;

	public Patient() {
	}

	public Patient(int numberFile, String title, String name, String lastname, String address, String city,
			String state, int cp, String phoneHouse, String phoneOffice, String email, String sex, String nss,
			String birthplace, String birthdate, int age, String medic, String civilState, String motherName,
			String fatherName, String coupleName, String precedence, String ocupation, String escolarity, String school,
			String observations) {
		super();
		this.numberFile = numberFile;
		this.title = title;
		this.name = name;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.cp = cp;
		this.phoneHouse = phoneHouse;
		this.phoneOffice = phoneOffice;
		this.email = email;
		this.sex = sex;
		this.nss = nss;
		this.birthplace = birthplace;
		this.birthdate = birthdate;
		this.age = age;
		this.medic = medic;
		this.civilState = civilState;
		this.motherName = motherName;
		this.fatherName = fatherName;
		this.coupleName = coupleName;
		this.precedence = precedence;
		this.ocupation = ocupation;
		this.escolarity = escolarity;
		this.school = school;
		this.observations = observations;
	}

	public int getNumberFile() {
		return numberFile;
	}

	public void setNumberFile(int numberFile) {
		this.numberFile = numberFile;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getPhoneHouse() {
		return phoneHouse;
	}

	public void setPhoneHouse(String phoneHouse) {
		this.phoneHouse = phoneHouse;
	}

	public String getPhoneOffice() {
		return phoneOffice;
	}

	public void setPhoneOffice(String phoneOffice) {
		this.phoneOffice = phoneOffice;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public String getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMedic() {
		return medic;
	}

	public void setMedic(String medic) {
		this.medic = medic;
	}

	public String getCivilState() {
		return civilState;
	}

	public void setCivilState(String civilState) {
		this.civilState = civilState;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getCoupleName() {
		return coupleName;
	}

	public void setCoupleName(String coupleName) {
		this.coupleName = coupleName;
	}

	public String getPrecedence() {
		return precedence;
	}

	public void setPrecedence(String precedence) {
		this.precedence = precedence;
	}

	public String getOcupation() {
		return ocupation;
	}

	public void setOcupation(String ocupation) {
		this.ocupation = ocupation;
	}

	public String getEscolarity() {
		return escolarity;
	}

	public void setEscolarity(String escolarity) {
		this.escolarity = escolarity;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

}
