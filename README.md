# 🎬 VeeGo Online Browsing System

The **VeeGo Online Browsing System** is a **Java-based web application** developed using **JSP, Servlets, and JDBC**. The system is designed to manage a video database through a web interface, supporting full **CRUD operations** and **search functionality**. It demonstrates core Java EE concepts and follows a clean separation of concerns between presentation, logic, and data access layers.

---

## 🚀 Features

- 🔍 **Video Search**
  - Search videos using keywords via a web-based interface.

- 🗂️ **Video Management (CRUD)**
  - ➕ Insert new video records
  - ✏️ Update existing video details
  - ❌ Delete video entries

- ✅ **User Feedback System**
  - Displays success or error messages after each operation.

---

## 🛠️ Technologies Used

- **Java** – Primary programming language  
- **JSP (Java Server Pages)** – Dynamic UI rendering  
- **Servlets** – Request handling and business logic  
- **JDBC** – Database connectivity and operations  
- **Apache Tomcat** – Web server and servlet container  
- **HTML / CSS** – Frontend structure and styling  

---


## 🧩 System Architecture

- **Model Layer**  
  - `Video.java` represents video entities.

- **Controller Layer**  
  - Servlets handle HTTP requests and coordinate application logic.

- **View Layer**  
  - JSP pages provide the user interface and user interaction.

- **Database Layer**  
  - `VideoDBUtil.java` manages all JDBC connections and SQL operations.

This layered approach improves **maintainability, scalability, and clarity**.

---

## ⚙️ Installation & Setup


### 1️⃣ Clone the Repository
```bash
git clone https://github.com/Manuthi24/VeeGo-Online-Browsing-System/tree/main

