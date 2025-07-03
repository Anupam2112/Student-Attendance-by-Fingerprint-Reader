RFID RC522(MFRC522)
Lucrarea propune realizarea unui sistem bazat pe microcontroller-ul de pe ESP32 care cu ajutorul RFID-ului si a modulului WiFi integrat face mult mai ușoară înregistrarea prezenței la un curs sau chiar la locul de muncă. Acesta integrează pe lângă aceste două componente hardware, și un afișaj LCD care oferă utilzatorilor o interacțiune minimă cu sistemul, dar și un buzzer pasiv care emite niște sunete specifice pentru admis/respins.
ESP32: Microcontroller-ul gestionează semnalele de intrare sau de ieșire, împreuna cu componentele hardware(LCD, RFID, Modul WiFi și Buzzer)
Conectarea WiFi: Pentru a permite ESP32 să comunice cu serverul backend, primul pas este conectarea la o rețea Wi-Fi. Procesul de conectare presupune configurarea ESP32 pentru a se conecta la un punct de acces Wi-Fi, folosind SSID-ul (numele rețelei) și parola corespunzătoare. Codul de conectare utilizează biblioteca WiFi.h, care face posibilă inițializarea și stabilirea conexiunii la rețea.
void setup() {
void loop() {
#include <Wire.h>
#include <LCD_I2C.h>
void setup() {
void loop() {
#include <SPI.h>
#include <MFRC522.h>
MFRC522 rfid(SS_PIN, RST_PIN);
void setup() {
void loop() {
#include <SPI.h>
#include <MFRC522v2.h>
#include <MFRC522DriverSPI.h>
#include <MFRC522DriverPinSimple.h>
#include <MFRC522Debug.h>
MFRC522 rfid(SS_PIN, RST_PIN);
void setup() {
void loop() {
void setup() {
void loop() {
void setup() {
void loop() {
#include <Keypad.h>
void setup() {
void loop() {
void setup() {
void loop() {
Setarea pinurilor ca ieșire: În funcția setup(), se configurează pinii ca ieșiri pentru a putea trimite semnale electrice către LED-uri.
void setup() {
void loop() {
#include <Wire.h>
#include <LCD_I2C.h>
void setup() {
void loop() {
În setup(), pe primul rând al LCD-ului se va afișa prenumele, iar pe al doilea rând se va afișa numele.
#include <Wire.h>
#include <LCD_I2C.h>
void setup() {
void loop() {
MFRC522 rfid(SS_PIN, RST_PIN);
void setup() {
void loop() {
#include <SPI.h>
#include <MFRC522v2.h>
#include <MFRC522DriverSPI.h>
#include <MFRC522DriverPinSimple.h>
#include <MFRC522Debug.h>
MFRC522 rfid(SS_PIN, RST_PIN);
void setup() {
void loop() {
void setup() {
void loop() {
void setup() {
void loop() {
#include <Keypad.h>
void setup() {
void loop() {
// RFID setup
MFRC522DriverPinSimple ss_pin(SDA_PIN); // crearea unui obiect ss_pin 
MFRC522DriverSPI driver{ss_pin}; //driver gestioneaza comunicarea SPI intre microcontroller si modulul RFID
MFRC522 mfrc522{driver};  //crearea obiectului RFID(MFRC522)
WiFiClient client;
  // Parcurge fiecare byte din UID-ul citit de MFRC522
În acest capitol veți regăsi o aplicație destină studenților în bucla setup.
void setup() {
  // Conectează sistemul la rețeaua WiFi
  WiFi.begin(ssid, password); // Inițializează conexiunea WiFi
  while (WiFi.status() != WL_CONNECTED) {
  // Afișează mesajul de succes al conexiunii WiFi pe LCD
  lcdPrint("WiFi");
#include <WiFi.h>
#include <HTTPClient.h>
#include <Wire.h>
#include <MFRC522v2.h>
#include <MFRC522DriverSPI.h>
#include <MFRC522DriverPinSimple.h>
#include <MFRC522Debug.h>
#include <ArduinoJson.h>
// RFID setup
MFRC522DriverPinSimple ss_pin(SDA_PIN); // crearea unui obiect ss_pin 
MFRC522DriverSPI driver{ss_pin}; //driver gestioneaza comunicarea SPI intre microcontroller si modulul RFID
MFRC522 mfrc522{driver};  //crearea obiectului RFID(MFRC522)
WiFiClient client;
  // Parcurge fiecare byte din UID-ul citit de MFRC522
void setup() {
  // Conectează sistemul la rețeaua WiFi
  WiFi.begin(ssid, password); // Inițializează conexiunea WiFi
  while (WiFi.status() != WL_CONNECTED) {
  // Afișează mesajul de succes al conexiunii WiFi pe LCD
  lcdPrint("WiFi");
COMPANY PUBLIC. (2016, April 27). NXP. Retrieved from NXP: https://www.nxp.com/docs/en/data-sheet/MFRC522.pdf