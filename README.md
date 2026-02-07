# Items REST API

A simple **Spring Boot RESTful backend application** that manages a collection of items (similar to a basic ecommerce product service).

The application stores data in-memory using an `ArrayList` and exposes HTTP endpoints to add and retrieve items.

---

## 🌐 Live Demo

Base URL:

```
https://items-rest-api-1.onrender.com
```

---

## ✨ Features

* Add a new item
* Get item by ID
* Input validation
* Proper HTTP status codes
* Global exception handling
* Cloud deployed on Render

---

## 🛠 Tech Stack

* Java 21
* Spring Boot
* Maven
* REST API
* Docker
* Render (Hosting)
* Postman (Testing)

---

## 🧱 Project Architecture

Layered architecture:

```
Controller → Service → Repository → Model → Exception Handler
```

| Layer      | Responsibility              |
| ---------- | --------------------------- |
| Controller | Handles HTTP requests       |
| Service    | Business logic & validation |
| Repository | In-memory data storage      |
| Model      | Item structure              |
| Exception  | Global error handling       |

---

## ▶️ Run Locally

```bash
git clone https://github.com/AshutoshPrakhar/items-rest-api
cd items-rest-api
mvn spring-boot:run
```

Server runs at:

```
http://localhost:8080
```

---

## 🚀 API Endpoints

### 1️⃣ Add Item

**POST** `/items/addItem`

Request Body:

```json
{
  "name": "Laptop",
  "description": "Gaming Laptop"
}
```

Response:

```json
{
  "id": 0,
  "name": "Laptop",
  "description": "Gaming Laptop"
}
```

---

### 2️⃣ Get Item By ID

**GET** `/items/{id}`

Example:

```
/items/1
```

Response:

```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming Laptop"
}
```

---

## ⚠️ Error Handling

| Scenario       | Response        |
| -------------- | --------------- |
| Empty name     | 400 BAD REQUEST |
| Item not found | 404 NOT FOUND   |

Handled using `@RestControllerAdvice`.

---

## 🔍 How Evaluator Can Verify Quickly

Because this is a REST API backend:

* **POST endpoints require Postman (or any API client)** since they need a JSON body
* **GET endpoints can be opened directly in browser**

### Step 1 — Add Item (Postman Required)

POST

```
https://items-rest-api-1.onrender.com/items/addItem
```

Body → raw → JSON

```json
{
  "name": "Phone",
  "description": "Android phone"
}
```

---

### Step 2 — Fetch Item (Works in Browser)

Open in browser:

```
https://items-rest-api-1.onrender.com/items/0
```

You will see the stored item as JSON response.

---

## 🗂 Storage

Data is stored in-memory using `ArrayList`.

⚠ Restarting the server resets all data.

---

## ☁️ Deployment

Application deployed on **Render using Docker container**.

---

## 👨‍💻 Author

Ashutosh Prakhar
