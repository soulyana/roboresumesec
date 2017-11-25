package me.jrmensah.roboresumesec;

import com.company.colleges.College;
import com.company.jobs.Job;
import com.company.resume.Resume;
import com.company.skills.Skill;

import java.util.ArrayList;
import java.util.Scanner;

/*
*Jerilyn Mensah
* October 20, 2017
* This application will accept user input to create a resume for an employee. The user is to enter their name,
* email address, education history, work experience and skills and the application will print the results at
* the end.
*
* Update- October 25, 2017
* This application will now accept between 1 to 10 educational achievements, 0 to 20 work experiences and 1 to 20
* skills with ratings.
*
*
 */

public class Main {

    public static void main(String[] args) {

        //Declare variables

        Scanner keyboard = new Scanner(System.in);


        ArrayList<College> education = new ArrayList<College>();
        ArrayList<Job> experience = new ArrayList<Job>();
        ArrayList<Skill> expertise = new ArrayList<Skill>();


        int size = 20;
        int counter = 0;
        Resume resume = new Resume();




        String answer = "";

        // Create a new person for resume
        Person person = new Person();


        //Prompt user to enter values into the program
        System.out.println("Welcome to the RoboResume!");
        System.out.println("Please enter your name, email, education, work experiences and skills with the rating below");
        System.out.println(" ");

    do {
        System.out.println("Enter your Name:");
        person.setName(keyboard.nextLine());
        System.out.println("Enter your Email:");
        person.setName(keyboard.nextLine());
        System.out.println("Education Achievements:");
        System.out.println(" ");
        System.out.println("Please submit between 1 to 10 entries.");

        for (counter = 0; counter <= 10; counter++) {


            do {
                College college = new College();
                System.out.println("You have submitted" + " " + (counter) + " " + "entries");
                System.out.println(" ");
                System.out.println("Enter the Degree of College");
                college.degree = keyboard.nextLine();
                System.out.println("Enter Major at College:");
                college.major = keyboard.nextLine();
                System.out.println("Enter Name of College:");
                college.name = keyboard.nextLine();
                System.out.println("Enter the year of Graduation");
                college.year = keyboard.nextInt();
                keyboard.nextLine();
                education.add(college);
                System.out.println("Do you want to enter a school?");
                answer = keyboard.nextLine();
                if (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                    System.out.println("Invalid entry. Please enter 'Y' or 'N'");
                    answer = keyboard.nextLine();
                }
            }while (answer.equalsIgnoreCase("y") || !answer.equalsIgnoreCase("n"));


            System.out.println("You have submitted" + " " + (counter+=1) + " " + "entries");
            System.out.println(" ");

            //Print all college entries
            System.out.println("Here are the education achievements you entered:");
            System.out.println(" ");

            for (College college : education) {
                System.out.print(college.degree);
                System.out.print(" " + "in" + " ");
                System.out.println(college.major);
                System.out.print(college.name);
                System.out.println(" " + "," + college.year);


            }
        resume.setEducation(education);
        System.out.println(" ");



        // Get the user's work experience
        for (counter = 0; counter <= 10; counter++) {
            do {
                System.out.println("Please submit between 0 to 10 entries.");
                System.out.println("");
                if (counter > 10) {
                    System.out.println("You have exceeded 10 entries");
                }else {
                    do {
                        Job job = new Job();
                        System.out.println("You have submitted" + " " + (counter) + " " + "entries");
                        System.out.println("Enter the job title");
                        job.title = keyboard.nextLine();
                        System.out.println("Enter the place of the job:");
                        job.place = keyboard.nextLine();
                        System.out.println("Enter the dates you worked at the job:");
                        job.date = keyboard.nextLine();
                        System.out.println("Enter your first duty");
                        job.duty1 = keyboard.nextLine();
                        System.out.println("Enter your second duty");
                        job.duty2 = keyboard.nextLine();
                        experience.add(job);
                        System.out.println("Do you want to enter a work experience?");
                        answer = keyboard.nextLine();
                        if (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                            System.out.println("Invalid entry. Please enter 'Y' or 'N'");
                            answer = keyboard.nextLine();
                        }
                    } while (answer.equalsIgnoreCase("y") || !answer.equalsIgnoreCase("n"));
                    System.out.println("You have submitted" + " " + (counter+=1) + " " + "entries");
                    System.out.println(" ");
                }

                //Print all job entries
                System.out.println("Here are the work experiences you entered:");
                System.out.println(" ");

                for (Job jobs : experience) {
                    System.out.println(jobs.title);
                    System.out.println(jobs.place + " " + "," + " " + " " + jobs.date);
                    System.out.println(jobs.duty1);
                    System.out.println(jobs.duty2);
                }
                resume.setExperience(experience);
                System.out.println(" ");


                //Get the user's Skills and their rating

                for (counter = 1; counter <= 20; counter++) {
                    do {
                        Skill skill = new Skill();
                        System.out.println("Please submit between 1 to 20 entries");
                        System.out.println("");
                        if (counter < 1) {
                            System.out.println("Please submit at least 1 entry!");
                        } else if (counter > 20) {
                            System.out.println("You have exceeded 20 entries!");
                        }
                            do {
                                System.out.println("You have submitted" + " " + (counter) + " " + "entries");
                                System.out.println(" ");

                                System.out.println("Enter your first skill");
                                skill.skill1 = keyboard.nextLine();
                                System.out.println("Enter your second skill:");
                                skill.skill2 = keyboard.nextLine();
                                System.out.println("Enter your third skill:");
                                skill.skill3 = keyboard.nextLine();
                                expertise.add(skill);
                                System.out.println("Do you want to enter a set of skills?");
                                answer = keyboard.nextLine();
                                if (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                                    System.out.println("Invalid entry. Please enter 'Y' or 'N'");
                                    answer = keyboard.nextLine();
                                }
                            } while (answer.equalsIgnoreCase("y") || !answer.equalsIgnoreCase("n"));

                        System.out.println("You have submitted" + " " + (counter+=3) + " " + "entries");
                        System.out.println(" ");


                        //Print all skills with ratings
                        System.out.println("Here are the skills and ratings you entered:");
                        System.out.println(" ");

                        for (Skill skills : expertise) {
                            System.out.println(skill.skill1);
                            System.out.println(skill.skill2);
                            System.out.println(skill.skill3);

                        }

                        resume.setExpertise(expertise);
                        System.out.println(" ");

                    } while (answer.equalsIgnoreCase("y"));
                    // Print all variables
//
                }
                while (answer.equalsIgnoreCase("y")) ;
            } while (answer.equalsIgnoreCase("y"));
        }

        }
    }while(answer.equalsIgnoreCase("y"));
    }
    public static void print(){
        System.out.println("");


    }

    private static class College {
        public String degree;
    }

    private static class Job {
    }

    private static class Skill {
    }

    private static class Resume {
    }
}




















