 🚀 Customer Search Portal (FindDetails)

A robust, high-performance Backend application built with **Java 17** and **Spring Boot**, designed to search and manage customer data in real-time. This project demonstrates a secure integration between a Spring Boot backend and a **Supabase (PostgreSQL)** cloud database.

## 🛠️ Tech Stack
* **Backend:** Java 17, Spring Boot 3.x, Spring Data JPA
* **Database:** PostgreSQL (Hosted via Supabase)
* **Security:** Environment-based credential management
* **Frontend:** Thymeleaf, CSS3 (Custom Dark Mode UI)
* **Build Tool:** Maven

## ✨ Key Features
* **Dynamic Search:** Real-time filtering by Name, Email, or Mobile number using JPA `LIKE` queries.
* **Cloud Integration:** Fully connected to a remote Supabase instance.
* **Responsive UI:** A professional, dark-themed dashboard designed for high readability.
* **Production Ready:** Configured with HikariCP connection pooling and environment variable protection.

---

## 🏗️ Project Structure
```text
mobilenumber/
├── src/main/java/          # Java Source Code
├── src/main/resources/
│   ├── templates/          # Thymeleaf HTML
│   ├── static/css/         # External Stylesheets
│   └── application.yaml    # App Configuration
├── Dockerfile              # Containerization Setup
└── pom.xml                 # Maven Dependencies
```

---

## 🚀 Getting Started

### 1. Prerequisites
* JDK 17 or higher
* A Supabase Project (PostgreSQL)
* Maven

### 2. Environment Variables
To keep the database secure, this project uses environment variables. **Do not hardcode your passwords.** Set the following variables in your IDE (IntelliJ) or System:

| Variable | Description |
| :--- | :--- |
| `DB_URL` | `jdbc:postgresql://db.[YOUR_ID].supabase.co:5432/postgres` |
| `DB_USER` | `postgres` |
| `DB_PASSWORD` | `Your_Supabase_Database_Password` |

### 3. Running Locally
```bash
# Clone the repository
git clone https://github.com/rohit-kumar-in/finddetails.git

# Navigate to folder
cd finddetails

# Build the JAR
./mvnw clean package -DskipTests

# Run the application
java -jar target/mobilenumber-0.0.1-SNAPSHOT.jar
```
The app will be live at `http://localhost:8080/search`.

---

## 🔒 Security Best Practices
As a Cybersecurity Consultant, this project follows:
* **Secret Masking:** Database credentials are never committed to Version Control.
* **Input Sanitization:** Search keywords are cleaned to prevent accidental query errors.
* **Secure Deployment:** Prepared for Docker containerization to ensure environment isolation.

## 📈 Roadmap
- [ ] Add OAuth2 (Google Login) for restricted access.
- [ ] Implement JWT for stateless API authentication.
- [ ] Add Export to CSV/Excel functionality for search results.

---

## 📄 License
This project is for educational and portfolio purposes.

---

### How to add this:
1. Open IntelliJ.
2. Open your `README.md` file.
3. Replace the content with the text above.
4. **Save, Commit, and Push:**
   ```powershell
   git add README.md
   git commit -m "docs: added professional README"
   git push origin main
   ```

**How does it look on your GitHub page now? It should look like a professional portfolio piece!**Since you are a **Cybersecurity Consultant** moving into **Backend Engineering**, your README should look professional, organized, and highlight your technical skills. 

Here is a modern, high-quality **README.md** template specifically tailored for your `finddetails` project. You can copy and paste this directly into your file.

---

# 🚀 Customer Search Portal (FindDetails)

A robust, high-performance Backend application built with **Java 17** and **Spring Boot**, designed to search and manage customer data in real-time. This project demonstrates a secure integration between a Spring Boot backend and a **Supabase (PostgreSQL)** cloud database.

## 🛠️ Tech Stack
* **Backend:** Java 17, Spring Boot 3.x, Spring Data JPA
* **Database:** PostgreSQL (Hosted via Supabase)
* **Security:** Environment-based credential management
* **Frontend:** Thymeleaf, CSS3 (Custom Dark Mode UI)
* **Build Tool:** Maven

## ✨ Key Features
* **Dynamic Search:** Real-time filtering by Name, Email, or Mobile number using JPA `LIKE` queries.
* **Cloud Integration:** Fully connected to a remote Supabase instance.
* **Responsive UI:** A professional, dark-themed dashboard designed for high readability.
* **Production Ready:** Configured with HikariCP connection pooling and environment variable protection.

---

## 🏗️ Project Structure
```text
mobilenumber/
├── src/main/java/          # Java Source Code
├── src/main/resources/
│   ├── templates/          # Thymeleaf HTML
│   ├── static/css/         # External Stylesheets
│   └── application.yaml    # App Configuration
├── Dockerfile              # Containerization Setup
└── pom.xml                 # Maven Dependencies
```

---

## 🚀 Getting Started

### 1. Prerequisites
* JDK 17 or higher
* A Supabase Project (PostgreSQL)
* Maven

### 2. Environment Variables
To keep the database secure, this project uses environment variables. **Do not hardcode your passwords.** Set the following variables in your IDE (IntelliJ) or System:

| Variable | Description |
| :--- | :--- |
| `DB_URL` | `jdbc:postgresql://db.[YOUR_ID].supabase.co:5432/postgres` |
| `DB_USER` | `postgres` |
| `DB_PASSWORD` | `Your_Supabase_Database_Password` |

### 3. Running Locally
```bash
# Clone the repository
git clone https://github.com/rohit-kumar-in/finddetails.git

# Navigate to folder
cd finddetails

# Build the JAR
./mvnw clean package -DskipTests

# Run the application
java -jar target/mobilenumber-0.0.1-SNAPSHOT.jar
```
The app will be live at `http://localhost:8080/search`.

---

## 🔒 Security Best Practices
As a Cybersecurity Consultant, this project follows:
* **Secret Masking:** Database credentials are never committed to Version Control.
* **Input Sanitization:** Search keywords are cleaned to prevent accidental query errors.
* **Secure Deployment:** Prepared for Docker containerization to ensure environment isolation.

## 📈 Roadmap
- [ ] Add OAuth2 (Google Login) for restricted access.
- [ ] Implement JWT for stateless API authentication.
- [ ] Add Export to CSV/Excel functionality for search results.

---

## 📄 License
This project is for educational and portfolio purposes.
