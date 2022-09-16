package com.kenzie.app;

// import necessary libraries


import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Scanner;

public class Main {
    /* Java Fundamentals Capstone project:
       - Define as many variables, properties, and methods as you decide are necessary to
       solve the program requirements.
       - You are not limited to only the class files included here
       - You must write the HTTP GET call inside the CustomHttpClient.sendGET(String URL) method
         definition provided
       - Your program execution must run from the main() method in Main.java
       - The rest is up to you. Good luck and happy coding!

     */


    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        //Write main execution code here

        int score = 0;
        String response = "none yet";

        for(int i = 0; i < 10; i++) {

            CustomHttpClient myHttpClient = new CustomHttpClient();
            String URLString = "https://jservice.kenzie.academy/api/random-clue";

            ClueDTO clueDTO = new ClueDTO();

            String s = myHttpClient.sendGET(URLString);
            ObjectMapper mapper = new ObjectMapper();
            try {
                clueDTO = mapper.readValue(s, ClueDTO.class);
            } catch (Exception e) {
                e.getMessage();
            }

            System.out.println("Category is " + clueDTO.getCategory().getTitle());
            System.out.println("Question " + (i+1) + ": " + clueDTO.getQuestion());

            System.out.println("Enter response: ");

            System.out.println(clueDTO.answer);

            response = input.nextLine();

            if (response.isBlank()){ //User hits enter without typing anything
                System.out.println("Response was left blank please enter an answer: ");
                response = input.nextLine();
            }

            response = response.trim(); //if User enters blank spaces

            if (response.equalsIgnoreCase(clueDTO.answer) || response.contains(clueDTO.answer) || clueDTO.answer.contains(response) ) {

                System.out.println("Correct");
                score++;
                System.out.println("Score incremented by 1");
                System.out.println("Total Score " + score);

            } else {
                System.out.println("Incorrect answer");
                System.out.println("Correct answer is " + clueDTO.getAnswer());
                System.out.println("Total score " + score);

            }

        }

        System.out.println("Total Score is " + score);

    }
}

