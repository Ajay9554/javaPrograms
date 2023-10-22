package com.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question {
	private String questionText;
	private List<String> options;
	private int correctOptionIndex;

	public Question(String questionText, List<String> options, int correctOptionIndex) {
		this.questionText = questionText;
		this.options = options;
		this.correctOptionIndex = correctOptionIndex;
	}

	public String getQuestionText() {
		return questionText;
	}

	public List<String> getOptions() {
		return options;
	}

	public int getCorrectOptionIndex() {
		return correctOptionIndex;
	}
}

class Quiz {
	private String quizTitle;
	private List<Question> questions;

	public Quiz(String quizTitle) {
		this.quizTitle = quizTitle;
		this.questions = new ArrayList<>();
	}

	public void addQuestion(Question question) {
		questions.add(question);
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public String getQuizTitle() {
		return quizTitle;
	}
}

public class QuizMaker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Quiz> quizzes = new ArrayList<>();

		while (true) {
			System.out.println("\nQuiz Maker Menu:");
			System.out.println("1. Create a new quiz");
			System.out.println("2. Add a question to a quiz");
			System.out.println("3. Display all quizzes");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine();  

			switch (choice) {
			case 1:
				System.out.print("Enter the title of the new quiz: ");
				String quizTitle = scanner.nextLine();
				
				Quiz newQuiz = new Quiz(quizTitle);
				quizzes.add(newQuiz);
				System.out.println("New quiz created: " + quizTitle);
				break;
			case 2:
				System.out.println("Select a quiz to add a question to:");
				for (int i = 0; i < quizzes.size(); i++) {
					System.out.println((i + 1) + ". " + quizzes.get(i).getQuizTitle());
				}
				int quizIndex = scanner.nextInt() - 1;
				scanner.nextLine(); 
				
				if (quizIndex >= 0 && quizIndex < quizzes.size()) {
					System.out.print("Enter the question text: ");
					String questionText = scanner.nextLine();
					
					List<String> options = new ArrayList<>();
					for (int i = 1; i <= 4; i++) {
						System.out.print("Enter option " + i + ": ");
						options.add(scanner.nextLine());
					}
					System.out.print("Enter the correct option number (1-4): ");
					int correctOptionIndex = scanner.nextInt() - 1;
					scanner.nextLine();  
					
					Question question = new Question(questionText, options, correctOptionIndex);
					quizzes.get(quizIndex).addQuestion(question);
					System.out.println("Question added to the quiz.");
				} else {
					System.out.println("Invalid quiz selection.");
				}
				break;
			case 3:
				System.out.println("\nQuizzes:");
				for (int i = 0; i < quizzes.size(); i++) {
					System.out.println((i + 1) + ". " + quizzes.get(i).getQuizTitle());
				}
				System.out.print("Select a quiz to display (1-" + quizzes.size() + "): ");
				int displayIndex = scanner.nextInt() - 1;
				scanner.nextLine();  
				
				if (displayIndex >= 0 && displayIndex < quizzes.size()) {
					Quiz selectedQuiz = quizzes.get(displayIndex);
					System.out.println("\n" + selectedQuiz.getQuizTitle() + " Quiz:");
					
					List<Question> questions = selectedQuiz.getQuestions();
					for (int i = 0; i < questions.size(); i++) {
						Question q = questions.get(i);
						System.out.println("Q" + (i + 1) + ": " + q.getQuestionText());
						
						List<String> options = q.getOptions();
						for (int j = 0; j < options.size(); j++) {
							System.out.println("   " + (char) ('A' + j) + ". " + options.get(j));
						}
					}
				} else {
					System.out.println("Invalid quiz selection.");
				}
				break;
			case 4:
				System.out.println("Exiting the Quiz Maker.");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
