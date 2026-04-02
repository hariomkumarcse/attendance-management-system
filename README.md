# Attendance Management System 🚀

## 📌 About
This project is a Java-based Attendance Management System built using Object-Oriented Programming concepts.

It reads student attendance data from a CSV file and processes it to identify attendance status.

---

## 🛠️ Technologies Used
- Java (Core + OOP)
- File Handling (CSV)
- Exception Handling

---

## 📂 Project Structure

F5Assignment/
│
├── SubjectWiseSheet_CSV.csv
├── AttendanceMain.java
│
└── in/
    └── ac/
        └── mitmeerut/
            ├── student/
            │     └── Student.java
            │
            └── attendance/
                  ├── AttendanceExtractor.java
                  ├── IntfAttendanceExtractor.java
                  └── LowAttendanceException.java

                  
---

## ⚙️ How to Run

### Compile: javac -d . AttendanceMain.java in/ac/mitmeerut/**/*.java  
### Short cut compile use: javac -d . $(find . -name "*.java")
### There whole command for mac users only

### Run: java AttendanceMain


---

## 🎯 Features
- Reads attendance data from CSV file
- Calculates attendance percentage
- Custom exception for low attendance
- Structured package-based design

---

## 📅 Future Improvements
- Add GUI (JavaFX or Swing)
- Export reports
- Database integration

---

⭐ This project is part of my Java learning journey.
