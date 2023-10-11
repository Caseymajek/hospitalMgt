package org.example.medical.entities;

import java.time.LocalDate;
import java.util.List;

public class Patient extends User {
    private String weight;
    private String height;
    private String medicalHistory;
    private String nameHmo;
    private LocalDate DOA;
    private LocalDate DOD;
    private List<allergies> allergies;
    private String NOK;
    private String address;

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getNameHmo() {
        return nameHmo;
    }

    public void setNameHmo(String nameHmo) {
        this.nameHmo = nameHmo;
    }

    public LocalDate getDOA() {
        return DOA;
    }

    public void setDOA(LocalDate DOA) {
        this.DOA = DOA;
    }

    public LocalDate getDOD() {
        return DOD;
    }

    public void setDOD(LocalDate DOD) {
        this.DOD = DOD;
    }

    public List<org.example.medical.entities.allergies> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<org.example.medical.entities.allergies> allergies) {
        this.allergies = allergies;
    }

    public String getNOK() {
        return NOK;
    }

    public void setNOK(String NOK) {
        this.NOK = NOK;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
