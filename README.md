# 🎬 VeeGo Online Browsing System

VeeGo Online Browsing System is a **100% Java-based web application** designed to manage a video database through a user-friendly web interface. The system supports full **CRUD operations** (Create, Read, Update, Delete) along with **search functionality**, making it suitable for learning and demonstrating Java EE web development concepts.

---

## 📌 Features

- 🔍 **Video Search**  
  Search for videos using a web-based interface powered by JSP and Servlets.

- 🗂️ **Content Management (CRUD)**
  - ➕ **Insert**: Add new video records to the database  
  - ✏️ **Update**: Modify existing video details  
  - ❌ **Delete**: Remove video entries  

- ✅ **User Feedback System**  
  Displays success or failure messages after each operation.

---

## 🛠️ Technologies Used

- **Java** – Core programming language  
- **JSP (Java Server Pages)** – Dynamic web interface  
- **Servlets** – Server-side request handling  
- **JDBC (Java Database Connectivity)** – Database interaction  
- **Apache Tomcat** – Web application server  
- **HTML/CSS** – Frontend structure and styling  


---

### 🧩 Architectural Overview

- **Model Layer**  
  `Video.java` represents the video entity and its attributes.

- **Controller Layer**  
  Servlets handle request processing, validation, and interaction with the database.

- **View Layer**  
  JSP pages provide the user interface for data input and feedback.

- **Database Layer**  
  `VideoDBUtil.java` manages all database connectivity and queries using JDBC.

This structure ensures a **clear separation of concerns**, making the application easier to understand, maintain, and extend.



---

## 🚀 Usage

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/Manuthi24/VeeGo-Online-Browsing-System/tree/main

