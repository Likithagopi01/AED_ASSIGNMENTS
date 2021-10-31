/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;

/**
 *
 * @author psrib
 */
public class Patient  {

    EncounterHistory encounterHistory;
    String pid;
    String ageGroup;

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public static String ageCalculate(String ageGroup) {

        String s[] = ageGroup.split(" ");
        if (s[1].equals("days")) {
            return "NEWBORN";
        } else if (s[1].equals("months")) {
            return "INFANT";
        } else if (s[1].equals("years") && Integer.parseInt(s[0]) < 3) {
            return "TODDLER";
        } else if (s[1].equals("years") && Integer.parseInt(s[0]) >= 3 && Integer.parseInt(s[0]) <= 5) {
            return "PRESCHOOLER";
        } else if (s[1].equals("years") && Integer.parseInt(s[0]) >= 6 && Integer.parseInt(s[0]) <= 12) {
            return "SCHOOLAGE";
        } else if (s[1].equals("years") && Integer.parseInt(s[0]) >= 13) {
            return "ADOLESCENT";
        }

        return "";
    }

}
