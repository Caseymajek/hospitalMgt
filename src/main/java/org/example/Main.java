package org.example;

import org.example.medical.entities.MedicalStaff;
import org.example.medical.entities.Patient;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       // MedicalStaff.grade = "78554";
        MedicalStaff mediCare = new MedicalStaff("A1", "gfgfg", "surgeon", 45.7);
        System.out.println(mediCare);



        Patient pcm = new Patient();
        pcm.setWeight("5CM");
        System.out.println("The weight of the patient is: " + pcm.getWeight());
    }
}