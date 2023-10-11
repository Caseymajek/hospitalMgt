package org.example.medical.medicalServices;

import org.example.medical.entities.MedicalStaff;
import org.example.medical.entities.Patient;

public interface Services {
    void admit (Patient patient);
    void discharge (MedicalStaff patient);
    void treatment (MedicalStaff patient);
    void  consultation (MedicalStaff patient);
}
