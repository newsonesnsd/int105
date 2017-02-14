/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int105.model;

/**
 *
 * @author INT105
 */
public abstract class Staff {
    private long staffId;
    private String name;
    private String surname;
    private static long seqNo=1000;

    public int compareTo(Staff s) {
        int nameResult = name.compareTo(s.name);
        if(nameResult == 0) {
            return surname.compareTo(s.surname);
        }
        else {
            return nameResult;
        }
    }

    public Staff() {
        this("unknow", "unknow");
    }

    public Staff(String name, String surname) {
        this.staffId = ++seqNo;
        this.name = name;
        this.surname = surname;
    }

    public static long getSeqNo() {
        return seqNo;
    }
    public long getStaffId() {
        return staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "staffId=" + staffId + ", name=" + name + ", surname=" + surname;
    }

    public abstract double pay(); // abstract method

}
