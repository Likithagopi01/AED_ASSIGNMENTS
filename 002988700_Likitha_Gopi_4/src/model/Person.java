/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Likitha G
 */
public class Person {

    String personName;
    String age;
    String ageGroup;
    House house;
    Patient patient;
    VitalSigns vitalSign;

    public VitalSigns getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSigns vitalSign) {
        this.vitalSign = vitalSign;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

//
//    public void setPid(String pid) {
//       
//    }
//    
    @Override
    public String toString() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setPersonName(Person pName) {

    }
    
    


//    public EncounterHistory getEncounterHistory() {
//      return null;
//    }
//
//    public void setEncounterHistory(EncounterHistory encounterHistory) {
//        
//    }
//    public String getPid() {
//       return "";
//    }
}
