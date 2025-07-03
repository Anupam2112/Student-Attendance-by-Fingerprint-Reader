# Automatic Attendance

A Java-based application designed for efficient and automated attendance tracking. This project uses Docker Compose to manage its environment and supports development in IntelliJ IDEA.

---

## Prerequisites

Before setting up the project, ensure the following tools are installed:

1. [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
2. [Docker Desktop](https://www.docker.com/products/docker-desktop)

---

## Setup and Installation

### 1. Install IntelliJ IDEA
- Download IntelliJ IDEA Community or Ultimate from [JetBrains](https://www.jetbrains.com/idea/download/).
- Follow the installation steps for your OS.
- Open IntelliJ and set up the Java JDK if prompted.

### 2. Install Docker Desktop
- Download Docker Desktop from [Docker](https://www.docker.com/products/docker-desktop).
- Install and start Docker Desktop. Ensure Docker is running before proceeding.

### 3. Clone the Repository
Clone this repository using the command below:
```bash
git clone https://github.com/Candu34/Automatic_attendance.git
cd Automatic_attendance
```

### 4. Open the Project in IntelliJ IDEA
1. Launch IntelliJ IDEA.
2. Select **File > Open** and navigate to the project folder.
3. IntelliJ will detect the Maven or Gradle structure and import the project dependencies.

### 5. Start Docker Containers
1. Open the **Docker** tab in IntelliJ (available in the toolbar).
2. Locate the `docker-compose.yml` file in the project directory.
3. Right-click on the file and select **Run 'docker-compose up'** to start the containers.

### 6. Verify the Database Connection
1. Open the **Database** tab in IntelliJ IDEA (use **View > Tool Windows > Database** if it's not visible).
2. Click the **+** icon and select **Data Source > PostgreSQL** (or the database you are using).
3. Fill in the connection details as specified in `docker-compose.yml`:
   - Host: `localhost`
   - Port: `<Database Port>`
   - Database: `<Database Name>`
   - Username: `<DB Username>`
   - Password: `<DB Password>`
4. Test the connection and save it.

### 7. Insert Data into the Database
1. Open the **Database** tab in IntelliJ IDEA.
2. Locate your database connection and open the **Console**.
3. Run the following SQL commands to populate the database:

```sql
insert into student_class (name) values ('4LF711');
insert into student_class (name) values ('123');
insert into student_class (name) values ('122');

insert into student (email, full_name, rfid_card_id, class_id) values ('liviubelu@student.unitbv.ro', 'Liviu Belu', 'F9 B0 07 E5', 2);
insert into student (email, full_name, rfid_card_id, class_id) values ('brujbeanugabriel@student.unitbv.ro', 'Brujbeanu Gabriel', '13 E1 54 CD', 2);
insert into student (email, full_name, rfid_card_id, class_id) values ('canduion@student.unitbv.ro', 'Candu Ion', 'b3 78 cc 2c', 3);
insert into student (email, full_name, rfid_card_id, class_id) values ('vasilecenusa@student.unitbv.ro', 'Vasile Cenusa', '07 79 8e 02', 3);

insert into student (email, full_name, rfid_card_id, class_id) values ('kjkdadsadad', 'Test test', 'F9 B0 07 E5', 2); 
insert into student (email, full_name, rfid_card_id, class_id) values ('adsadasdad', 'Test2', '13 E1 54 CD', 2); 
insert into student (email, full_name, rfid_card_id, class_id) values ('cdadsadadada', 'Test1 test1', 'b3 78 cc 2c', 2); 
insert into student (email, full_name, rfid_card_id, class_id) values ('adasdasdadasdasdas', 'Vasile Cenusa', '07 79 8e 02', 2);
```

### 8. View Attendance Records
1. Open the **Database** tab in IntelliJ IDEA.
2. Locate your database connection and open the **Console**.
3. Run the following SQL command to view attendance records:

```sql
select * from attendance;
```

### 9. Run the Application
1. Ensure that all Docker containers are running.
2. Use IntelliJ's **Run/Debug Configuration** to start the application.
3. Access the application via the specified URL in your browser or API testing tool.



