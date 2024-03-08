package org.doctorapp.client;

import org.doctorapp.model.Doctor;
import org.doctorapp.model.Specialization;
import org.doctorapp.service.DoctorServiceImpl;
import org.doctorapp.service.IDoctorService;

import java.util.List;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IDoctorService doctorService = new DoctorServiceImpl();
        //System.out.println("Enter your choice");
        //int choice = sc.nextInt();
        try {


//        Specialization specialization = Specialization.GYNAE;
//        String speciality = specialization.getSpeciality();
            for (Doctor doc : doctorService.getBySpeciality("GYNAECOLOGIST")) {
                System.out.println(doc);
            }

//        doctorService.addDoctor(new Doctor("Arvind","DERMATOLOGIST",700,5,7));
//          doctorService.updateDoctor(1,900);
                //doctorService.deleteDoctor(5);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
