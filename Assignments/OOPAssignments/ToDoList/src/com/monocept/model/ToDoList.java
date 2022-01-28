package com.monocept.model;

	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.Date;
	import java.util.List;
	import java.util.Scanner;

	public class ToDoList {

		String topic;
		static List<Task> tasks = new ArrayList<>();

		public ToDoList(String topicName) {
			topic = topicName;
		}

		//below, implement the methods provided in the UML diagram
		//I provided the task creation and the task creation methods

		//implement boolean method for assignTask, assignDeadLine
		//display, markAsDone, removeTask and renameTask

		 

		public void createTask() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter task name");
			String name = sc.nextLine();
			System.out.println("Please enter employee name");
			String empname = sc.nextLine();
			System.out.println("Please enter due date");
			System.out.println("Please enter your date in the format dd/MM/yyyy");
			Scanner scanner = new Scanner(System.in);
			Date d = null;
			try {
				d = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
			} catch (ParseException e) {
				e.printStackTrace();
			}

			Task t = new Task();
			t.setName(name);
			t.setDeadLine(d);
			t.setEmployee(empname);
			tasks.add(t);
			System.out.println("Task added successfully.");

		}

		public static void createTask(String string) {
			// TODO Auto-generated method stub
			
		}

		public static void add(ToDoList toDoList) {
			// TODO Auto-generated method stub
			
		}

	}