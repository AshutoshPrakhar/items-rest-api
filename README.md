# Items REST API

A simple Spring Boot RESTful backend application that manages a collection of items using in-memory storage (ArrayList).

## Features

* Add a new item
* Get item by ID
* Input validation
* Proper HTTP status codes
* Exception handling

---

## Tech Stack

* Java 21
* Spring Boot
* Maven

---

## How to Run

1. Clone repository
2. Open in IntelliJ / VS Code
3. Run `ItemsApiApplication.java`
4. Server runs on:

```
http://localhost:8080
```

---

## API Endpoints

### Add Item

POST `/items/addItem`

Body:

```json
{
  "name": "Laptop",
  "description": "Gaming laptop"
}
```

Response: `201 CREATED`

---

### Get Item

GET `/items/{id}`

Response:

```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming laptop"
}
```

---

### Error Responses

| Case           | Status          |
| -------------- | --------------- |
| Invalid input  | 400 BAD REQUEST |
| Item not found | 404 NOT FOUND   |

---

## Storage

Data is stored in-memory using ArrayList.
Restarting the server resets data.

---

## Author

Ashutosh Prakhar
