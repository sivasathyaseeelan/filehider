package views;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
             case 3:
                System.exit(0);
        }
    }
}
