Gradle Project code smells
-----------------------
Dentro de cada paquete se encuentran ejemplos con olores, hay que hacer los refactors a consideración para remover estos olores.


    <proj>
      |
      +- src
          |
          +- main
              |
              +- java
              | mx.com.kubo // application sources
                    | abusers // abusers smells example
                    | bloaters  // bloaters smells example
                    | preventers // preventers smells example
          |
          +- test
              |
              +- java
              | mx.com.kubo // application tests
                    | abusers // abusers test code
                    | bloaters  // bloaters test code
                    | preventers // preventers test code
                 // application resources
                
Clonar proyecto:
-----------------
    git clone $projectUrl
    

Run tests:
----------------
    ./gradlew test


LINKS
https://drive.google.com/file/d/0BwhCYaYDn8EgNzAzZjA5ZmItNjU3NS00MzQ5LTkwYjMtMDJhNDU5ZTM0MTlh/view
https://drive.google.com/file/d/0BwhCYaYDn8EgOTViYjJhYzMtMzYxMC00MzFjLWJjMzYtOGJiMDc5N2JkYmJi/view
