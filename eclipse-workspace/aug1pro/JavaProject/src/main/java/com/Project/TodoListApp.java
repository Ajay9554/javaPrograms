package com.Project;

import java.util.ArrayList;
import java.util.Scanner;

class Task {
	private String title;
	private String description;
	private String status;

	public Task(String title, String description) {
		this.title = title;
		this.description = description;
		this.status = "To Do";
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Title: " + title + "\nDescription: " + description + "\nStatus: " + status;
	}
}

public class TodoListApp {
	private static ArrayList<Task> tasks = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean quit = false;
		while (!quit) {
			System.out.println("\nTodo List Application");
			System.out.println("1. Add Task");
			System.out.println("2. View Tasks");
			System.out.println("3. Update Task Status");
			System.out.println("4. Delete Task");
			System.out.println("5. Quit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				addTask();
				break;
			case 2:
				viewTasks();
				break;
			case 3:
				updateTaskStatus();
				break;
			case 4:
				deleteTask();
				break;
			case 5:
				quit = true;
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private static void addTask() {
		System.out.print("Enter task title: ");
		String title = scanner.nextLine();
		System.out.print("Enter task description: ");
		String description = scanner.nextLine();

		Task task = new Task(title, description);
		tasks.add(task);
		System.out.println("Task added successfully.");
	}

	private static void viewTasks() {
		System.out.println("\n--- Task List ---");
		for (int i = 0; i < tasks.size(); i++) {
			System.out.println("Task " + (i + 1) + ":\n" + tasks.get(i));
		}
	}

	private static void updateTaskStatus() {
		viewTasks();
		System.out.print("\nEnter the task number to update: ");
		int taskNumber = scanner.nextInt();
		scanner.nextLine();

		if (taskNumber >= 1 && taskNumber <= tasks.size()) {
			System.out.print("Enter new status (e.g., 'To Do', 'In Progress', 'Completed'): ");
			String newStatus = scanner.nextLine();

			tasks.get(taskNumber - 1).setStatus(newStatus);
			System.out.println("Task status updated.");
		} else {
			System.out.println("Invalid task number.");
		}
	}

	private static void deleteTask() {
		viewTasks();
		System.out.print("\nEnter the task number to delete: ");
		int taskNumber = scanner.nextInt();
		scanner.nextLine();

		if (taskNumber >= 1 && taskNumber <= tasks.size()) {
			tasks.remove(taskNumber - 1);
			System.out.println("Task deleted.");
		} else {
			System.out.println("Invalid task number.");
		}
	}
}
