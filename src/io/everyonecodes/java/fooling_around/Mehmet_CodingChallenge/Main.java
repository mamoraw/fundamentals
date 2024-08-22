package io.everyonecodes.java.fooling_around.Mehmet_CodingChallenge;
//Write a java command line program that gives me two options. One to ask a specific question and the other option is to add questions and their answers
//Therefore the following restrictions apply:
//A Question is a String with max 255 chars
//An Answer is a String with max 255 chars
//A Question can have multiple answers (like bullet points)
//If the user asks a question it has to be exactly the same as entered – no “best match”.
//If the user asks a question which is not stored yet the program should print “the answer to life, universe and everything is 42” according to “The hitchhikers guide to the Galaxy”
//If the user asks a question whish is  stored the program should print all answers to that question.
//Every Answer in a separate line
//Adding a question looks like:
//<question>? “<answer1>” “<answer2>” “<answerX>”
//Char “?” is the separator between question and answers
//Every Question needs to have at least one answer but can have unlimited answers all inside of char “
//Provide tests for the functionality described in 1)
//Provide the source code on any GIT repo worldwide (GITLAB, GITHUB, whatever you prefer and/or use)
//No other restrictions apply
//Examples:
//Adding a question:
//What is Peters favorite food? “Pizza” “Spaghetti” “Ice cream”
//Asking a question which is in the system:
//What is Peters favorite food?
//Answers will be
//Pizza
//Spaghetti
//Ice cream
//Asking a question which is not in the system:
//When is Peters birthday?
//Answer will be
//the answer to life, universe and everything is 42

import java.util.*;

public class Main {

    private static Map<String, List<String>> questionAnswerMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Ask a question");
            System.out.println("2. Add a question and its answers");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    askQuestion(scanner);
                    break;
                case 2:
                    addQuestion(scanner);
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }

        scanner.close();
    }

    private static void askQuestion(Scanner scanner) {
        System.out.print("Enter the question: ");
        String question = scanner.nextLine().trim();

        if (questionAnswerMap.containsKey(question)) {
            List<String> answers = questionAnswerMap.get(question);
            System.out.println("Answers:");
            for (String answer : answers) {
                System.out.println(answer);
            }
        } else {
            System.out.println("The answer to life, universe and everything is 42");
        }
    }

    private static void addQuestion(Scanner scanner) {
        System.out.print("Enter the question followed by answers in the format: <question>? \"<answer1>\" \"<answer2>\" ... \"<answerX>\": ");
        String input = scanner.nextLine().trim();

        if (input.length() > 255) {
            System.out.println("Input is too long. Please keep it within 255 characters.");
            return;
        }

        // Split the input into question and answers
        String[] parts = input.split("\\?", 2);
        if (parts.length != 2) {
            System.out.println("Invalid format. Make sure you have a question followed by answers separated by '?'.");
            return;
        }

        String question = parts[0].trim() + "?";
        String answersPart = parts[1].trim();

        // Extract answers
        List<String> answers = new ArrayList<>();
        String[] answerArray = answersPart.split(" \"");

        for (String answer : answerArray) {
            answer = answer.replaceAll("\"", "").trim();
            if (answer.length() > 255) {
                System.out.println("Each answer must be within 255 characters.");
                return;
            }
            if (!answer.isEmpty()) {
                answers.add(answer);
            }
        }

        if (question.length() > 255 || answers.isEmpty()) {
            System.out.println("Invalid input. Please ensure the question and each answer are within 255 characters and that there is at least one answer.");
            return;
        }

        questionAnswerMap.put(question, answers);
        System.out.println("Question and answers added successfully.");
    }
}
