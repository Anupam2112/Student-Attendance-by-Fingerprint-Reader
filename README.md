# Automatic Attendance System with RFID and ESP32

This project is a complete solution for automated attendance tracking. It integrates an **embedded hardware system** (Arduino-based) with a **Java Spring Boot application** for data management and visualization.

## 📌 Description

The system allows users to scan their RFID cards using an RC522 reader connected to an Arduino Uno. Once a card is detected, the information is displayed on an LCD screen and sent via an ESP8266 WiFi module to the Java backend API, where the attendance is logged.

This solution was implemented as part of a university graduation project.

---

## ✅ Features

- RFID card detection and identification
- Real-time display on I2C LCD
- WiFi-based data transmission using ESP8266 (ESP-01)
- REST API for attendance submission
- Java Spring Boot backend
- Modular architecture (DTOs, Controllers, Services, Repositories)
- MySQL/SQL Server integration

---

## 🛠 Technologies Used

### Backend (Java):
- Java 17
- Spring Boot
- Spring MVC, Spring Data JPA
- REST API
- Maven

### Embedded:
- Arduino Uno
- MFRC522 RFID Reader
- ESP8266 (ESP-01)
- I2C LCD 16x2
- C++ (Arduino IDE)

---

## 🔧 Hardware Setup

| Component       | Description                             |
|----------------|-----------------------------------------|
| Arduino Uno     | Main microcontroller                    |
| RC522           | RFID reader for tag/card scanning       |
| ESP-01 (ESP8266)| WiFi module for HTTP POST transmission  |
| LCD 16x2 I2C    | Displays user/card information          |
| RFID Card/Tag   | Used to register presence               |

Wiring diagrams and connection details can be found in the `esp32/` folder.

---

## 🚀 How to Use

### Backend Java Application:

```bash
cd Automatic_attendance-main
./mvnw spring-boot:run
```

Make sure to configure your database credentials in `src/main/resources/application.properties`.

### Arduino/ESP32 Code:

1. Open `esp32/Cod_ESP32.ino` in Arduino IDE.
2. Install libraries: `MFRC522`, `LiquidCrystal_I2C`, `ESP8266WiFi`, `WiFiClient`, `ESP8266HTTPClient`
3. Update WiFi credentials and backend URL.
4. Upload the sketch to the ESP-01 using a USB adapter.

---

## 📂 Project Structure

```
Automatic_attendance_with_ESP32/
│
├── src/                 # Java Spring Boot source code
├── esp32/               # Arduino code (.ino)
├── docker-compose.yml   # (optional) DB + API integration
├── README.md            # This file
└── ...
```

---

## 👤 Author

**Belu Liviu**  
Faculty of Electrical Engineering and Computer Science  
Transilvania University of Brașov

