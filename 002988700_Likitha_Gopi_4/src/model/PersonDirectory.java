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
import java.util.ArrayList;

public class PersonDirectory {

//    ArrayList<Person> personDirectory = new ArrayList();
   private ArrayList<Person> personDirectory = new ArrayList<>();

   public PersonDirectory() {
        personDirectory = new ArrayList<>();
    }
   
    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }

    public Person addNewPerson() {
        Person Newperson = new Person();
        personDirectory.add(Newperson);
        return Newperson;
    }

    public void deletePerson(Person person) {
        personDirectory.remove(person);
    }

    public ArrayList<Person> searchPatient(String key)
    {
        ArrayList<Person> searchPatientDirectory = new ArrayList();
        for(Person person: personDirectory)
        {
            if(person.getPersonName().toLowerCase().startsWith(key.toLowerCase()))
            {
                if(person.getPatient()!=null)
                {
                    searchPatientDirectory.add(person);
                }
            }
        }
        return searchPatientDirectory;
    }
}
