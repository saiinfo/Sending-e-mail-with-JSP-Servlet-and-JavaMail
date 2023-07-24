# Project Name
Sending-e-mail-with-JSP-Servlet-and-JavaMail

# Project Description
Sending emails with JSP, Servlet, and JavaMail involves setting up a web application that allows users to input email details (recipient address, subject, message) through a JSP form and uses a Servlet to process the form data and send the email using JavaMail API.



### Set up your Java web application project:
1. Create a new Java web application project using your preferred IDE (e.g., Eclipse, IntelliJ) or build tools (e.g., Maven, Gradle).
2. Configure the necessary servlet container (e.g., Apache Tomcat) to run your web application.

### Add JavaMail API dependency:
1. Download the JavaMail API (javax.mail.jar) from the Oracle website or use a dependency management tool like Maven or Gradle to include the JavaMail API in your project's classpath.
   
### Create a JSP page (email-form.jsp):
1. Create a JSP page (email-form.jsp) with an HTML form where the user can input the email details like recipient address, subject, message body, etc.
2. Submit the form to a servlet (e.g., SendEmailServlet) that will handle the email sending logic.

### Create a Servlet (SendEmailServlet.java):
1. Create a servlet (SendEmailServlet.java) that will handle the email sending logic.
2. In the servlet, use JavaMail API to send the email based on the user's input from the form.
3. Import necessary JavaMail classes and configure your email server settings (SMTP server, username, password, etc.) in the servlet.

### Deploy and run your web application:
1. Deploy your web application to the servlet container (e.g., Tomcat).
2. Access the email form page (email-form.jsp) through your web application URL (e.g., http://localhost:8080/your-app-name/email-form.jsp).
3. Fill out the email form and submit it to send the email.

# Project Priview
The form will look like this in a web browser:
![image](https://github.com/saiinfo/Sending-e-mail-with-JSP-Servlet-and-JavaMail/assets/26924010/da8a0bf8-5cb9-4d8b-ba18-836bc4e95dd4)
A form is displayed for entering message details. Type some information into the fields:
![image](https://github.com/saiinfo/Sending-e-mail-with-JSP-Servlet-and-JavaMail/assets/26924010/d46a79bf-95f6-4e75-b9a7-9b71bfd7c24f)
Hit Send button, it will take a while when the e-mail is sending. And finally, we will get a result page which either tells the e-mail was sent:
![image](https://github.com/saiinfo/Sending-e-mail-with-JSP-Servlet-and-JavaMail/assets/26924010/6463d3bb-60dd-474c-8841-82de605016a2)
Output for mail box
![image](https://github.com/saiinfo/Sending-e-mail-with-JSP-Servlet-and-JavaMail/assets/26924010/df0eb1b2-40c2-4c2f-8988-a3b5a5dad30a)




 
