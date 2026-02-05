# Item API – Spring Boot REST Application

## 📌 Overview
This project is a simple Java backend application built using **Spring Boot**.  
It exposes a RESTful API to manage a collection of items, similar to a basic ecommerce or catalog service.

This project was developed as part of a **Freelance Java Developer sample task**.

---

## 🛠 Tech Stack
- Java 17
- Spring Boot
- Spring Web (REST)
- Bean Validation (Jakarta Validation)
- Maven
- In-memory storage (ArrayList)

---

## ✨ Features
- Create and manage items using REST APIs
- In-memory data storage (no database)
- Input validation for request payloads
- Clean controller–service–model architecture
- Deployed to cloud for live demo

---

## 📦 Item Model
Each item contains the following fields:
- `id` – Unique identifier
- `name` – Item name
- `description` – Item description
- `price` – Item price

---

## 🔗 API Endpoints

### ➕ Add a new item
**POST** `/items`

**Request Body (JSON):**
```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Test item",
  "price": 50000
}
