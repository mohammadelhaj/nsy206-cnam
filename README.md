# Online Shop Application

This project is part of the **NSY205/206 - 2023/2024** curriculum at CNAM University under the guidance of **Prof. Pascal Fares**. It is a full-stack web application for an online shop, implemented using **Spring Boot 2** and **Angular 7**.

## Overview

The application is a **Single Page Application (SPA)** with client-side rendering. It features separate backend and frontend projects hosted on different branches. The frontend communicates with the backend through API calls while the backend server is running.

### Key Features
- **Docker & Docker Compose** for containerization
- Persistent and cookie-based shopping carts
- REST API for seamless client-server interaction
- Customer cart and order management
- Pagination for better performance
- Checkout functionality
- Product catalog
- JWT-based authentication and order management

## Technologies Used

### Backend
- **Java 11**
- **Spring Boot 2.2**
- **Spring Data JPA**
- **JWT Authentication**
- **Spring Security**
- **PostgreSQL**
- **Hibernate**
- **Maven**

### Frontend
- **Angular 7**
- **Angular CLI**
- **Bootstrap**

## Database Schema
The database schema is defined in the `db` directory. Mock data is automatically imported into the database using `import.sql`.
![db](https://github.com/user-attachments/assets/edc42d40-e203-429f-8921-b06b4223238e)


## Running the Application

### Prerequisites
- **PostgreSQL** for the backend
- **Node.js** and **npm** for the frontend

### Starting the Application

#### Backend
1. Install PostgreSQL and configure the datasource in `application.yml`.
2. Navigate to the `backend` directory:
   ```bash
   cd backend
   ```
3. Build and run the project:
   ```bash
   mvn install
   mvn spring-boot:run
   ```
4. The backend server will start at `http://localhost:8080`. Mock data will be imported into the database automatically.

#### Frontend
1. Navigate to the `frontend` directory:
   ```bash
   cd frontend
   ```
2. Install dependencies:
   ```bash
   npm install
   ```
3. Run the application:
   ```bash
   ng serve
   ```
4. The frontend client will start at `http://localhost:4200`. Ensure the backend server is running before accessing the frontend.

### Configuration
The backend API URL is specified in `src/environments/environment.ts` in the frontend project. By default, it points to `http://localhost:8080/api`.

## Running with Docker

You can run the entire application using Docker for simplified deployment.

1. **Build the Backend Project**:
   ```bash
   cd backend
   mvn package
   ```

2. **Build the Frontend Project**:
   ```bash
   cd frontend
   npm install
   ng build --prod
   ```

3. **Run the Application with Docker Compose**:
   ```bash
   docker-compose up --build
   
