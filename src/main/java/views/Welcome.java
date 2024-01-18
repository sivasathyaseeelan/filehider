package views;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import model.User;
import service.GenerateOTP;
import service.UserService;

public class Welcome {
    public void welcomeSession() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hi welcoome to FILE HIDER");
        System.out.println("Press 1 to login");
        System.out.println("Press 2 to signup");
        System.out.println("Press 0 to exit");
        int choice = 0;
        try {
            choice = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        switch (choice) {
            case 1:
                login();
            case 2:
                signUp();
            case 0:
                System.exit(0);
        }
    }

    private void login(){

    }

    private void signUp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Name:");
        String name = sc.nextLine();
        System.out.println("Please enter your Email:");
        String email = sc.nextLine();
        String genOTP = GenerateOTP.getOTP();
        System.out.println("Pleaase enter the OTP:");
        String otp = sc.nextLine();
        if(otp.equals(genOTP)){
            User user = new User(name, email);
            int response = UserService.saveUser(user);
            switch(response){
                case 0:
                    System.out.println("User registered");
                case 1:
                    System.out.println("User already exists");
            }
        }
        else{
            System.out.println("Wrong OTP");
        }
    }
}
