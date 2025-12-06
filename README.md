Student Automation System (Java GUI)
A desktop-based Student Information System developed using Java and Swing (GUI). This project was designed to simulate a university automation environment where students and academicians have different access levels and functionalities.

The project emphasizes Object-Oriented Programming (OOP) principles, specifically focusing on Inheritance, Abstraction, and Polymorphism to manage user roles and data.

🚀 Features
🔐 User Authentication
Secure Login: Role-based login system for Students (Ogrenci) and Academicians (Akademisyen).

Registration: New users can register via the GUI.

Validation: Input validation for IDs and passwords using Try-Catch blocks to prevent crashes on invalid input (e.g., entering text into a numeric ID field).

🎓 Student Module
View enrolled courses (Dersler).

View grades and academic notes (NotGoruntuleme).

Course selection interface (DersSecimi).

👨‍🏫 Academician Module
Student management system.

Grade entry system (NotGirme).

Access to student lists and details.

🏗️ Technical Architecture & OOP Concepts
This project demonstrates a strong understanding of Java OOP principles:

Inheritance:

The Giris class extends JFrame to inherit GUI properties.

Ogrenci and Akademisyen classes inherit from a base Kullanici (User) class to avoid code duplication.

Abstraction:

Abstract Classes: Utilized to define a template for common user behaviors and system operations, enforcing specific implementations in child classes.

Interfaces were used to standardize operations across different modules.

Encapsulation:

Sensitive data (like passwords and IDs) are declared as private and accessed via Getter/Setter methods to ensure data security.

Polymorphism:

The login system dynamically handles different user types (Student vs. Academician) using a unified logic flow.

Data Structures:

HashMap is used for efficient data storage and retrieval (e.g., OgrenciListesi.ogrenciListesi.containsKey()), allowing for O(1) complexity in user lookups.

🛠️ Technologies Used
Language: Java (JDK 22)

GUI Framework: Java Swing (JFrame, JPanel, JOptionPane)

IDE: Eclipse

💻 How to Run
Clone the repository:

Bash

git clone https://github.com/YOUR_USERNAME/REPO_NAME.git
Open in Eclipse:

Open Eclipse IDE.

File -> Open Projects from File System.

Select the cloned folder.

Run:

Navigate to src/Otomasyon/Giris.java.

Right-click -> Run As -> Java Application.
