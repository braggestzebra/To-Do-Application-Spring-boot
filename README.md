# To-Do List Application

This is a simple To-Do List web application built with **Spring Boot**, **Thymeleaf**, and **Bootstrap 5**. It allows users to:

- Add new tasks
- Mark tasks as completed
- Delete tasks
- View all tasks in a clean UI

---

## 🔧 Technologies Used

- Java 17+ / Java 23
- Spring Boot 3.5.0
- Thymeleaf
- Bootstrap 5
- H2 (in-memory database) or MySQL (optional)
- Maven

---

## 🚀 Features

- Add a task with a title
- Mark a task as "Done" or "Undo"
- Delete a task
- Strikethrough styling for completed tasks
- Responsive UI using Bootstrap

---

## 🛠️ Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/Braggestzebra/To-Do-Application-Spring-boot.git
   cd To-Do-App
Run the application

bash
Copy
Edit
./mvnw spring-boot:run
or in IntelliJ, just run the ToDoAppApplication class.

Access the app
Visit http://localhost:8080/tasks

🗃️ Folder Structure
nginx
Copy
Edit
src
 └── main
     ├── java
     │   └── com.app.To.Do.App
     │       ├── controller      # Handles web routes
     │       ├── model           # Task entity
     │       ├── repository      # Spring Data JPA
     │       └── services        # Task logic
     └── resources
         ├── templates           # Thymeleaf HTML templates
         └── application.properties
📦 Example TaskController.java
java
Copy
Edit
@GetMapping
public String getTasks(Model model) {
    List<Task> tasks = taskService.getAllTasks();
    model.addAttribute("tasks", tasks);
    return "tasks";
