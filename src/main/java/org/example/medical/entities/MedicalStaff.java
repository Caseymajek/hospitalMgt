package org.example.medical.entities;

import java.math.BigDecimal;

public class MedicalStaff extends User {
    private String grade;
    private String role;
    private String specialization;
    private Double salary;

    public MedicalStaff(String grade, String role, String specialization, Double salary) {
        this.grade = grade;
        this.role = role;
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "MedicalStaff{" +
                "grade='" + grade + '\'' +
                ", role='" + role + '\'' +
                ", specialization='" + specialization + '\'' +
                ", salary=" + salary +
                '}';
    }
}
