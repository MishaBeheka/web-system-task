# Calculating the roots of the quadratic equation

<hr>

Реализовать веб приложение для вычисления корней квадратного уравнения вида ax^2 + bx + c = 0
Описание процесса работы с программой.

Пользователь открывает начальную страницу и вводит значения коэффициентов a, b и с
После ввода коэффициентов пользователь нажимает на кнопку "рассчитать"
Программа должна сохранить значения коэффициентов и рассчитанных корней уравнения в базу данных. Пользователю нужно вывести страницу, на которой выводится значения введенных коэффициентов и значения корней уравнения. Если корни уравнения вычислить нельзя, то вместо реузультатов вывести сообщение об ошибке.

Требования к реализации
При разработке приложения необходимо использовать Spring MVC 3.x, Maven, Java 7. Для работы с БД можно использовать любую ORM. Для сборки проекта нужно использовать Maven. Результаты нужно выложить на GitHub. Моменты, которые в задании явно не оговорены, можно реализовывать на свое усмотрение.

<hr>

# Project structure
  * Java 7
  * Spring MVC 3.2.18
  * Tomcat 9.0.21
  * MySQL 8.0.17
  * Hibernate 5.4.5
  * Maven 4.0.0
  * javax.servlet-api 3.1.0
  * javax.servlet.jsp-api 2.3.1
  * javax.servlet.jsp.jstl-api 1.2.1
  * bootstrap 4.4.1
  
  <hr>
  
  # For developers
   * Open the project in your IDE.
      
   * Configure Tomcat:
      * add artifact Tomcat 9.0.21
      * choose the page "Deployment" and change "Application context" to "/"
      * run the application
      
   <hr>
   
   # For users
   
   * When you start the program, you will find yourself on the main page of the program, 
   where you need to enter values ​​for A, B, C and click "Show result".
   * If the data is correct, you will get the result of an equation that is automatically written to the database.
   * If the information is incorrect, you will receive this message.
              