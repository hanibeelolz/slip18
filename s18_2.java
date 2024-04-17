cust.html

<html>
<body>
<form  method="get" action="http://localhost:8080/slip18">

<b>Enter Student Details :<br>

Enter Roll No :<input type="text" name="t1"><br><br>
Enter Name : <input type="text" name="t2"><br><br>
Enter class :<input type="text" name="t3"><br><br>

<b>Enter Student Marks Details :

Subject 1 : <input type="text" name="su1"><br><br>
Subject 2 : <input type="text" name="su2"><br><br>
Subject 3 :<input type="text" name="su3"><br><br>

<input type="submit" value="Result">


</form>
</body>
</html>

  
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class slip18 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
    	int sno,s1,s2,s3,total;
    	String snm,sclass;
    	float per;
    	res.setContentType("text/html");
    	PrintWriter out=res.getWriter();
    	sno=Integer.parseInt(req.getParameter("t1"));
    	snm=req.getParameter("t2");
    	sclass=req.getParameter("t3");
    	s1=Integer.parseInt(req.getParameter("su1"));
    	s2=Integer.parseInt(req.getParameter("su2"));
    	s3=Integer.parseInt(req.getParameter("su3"));
    	total=s1+s2+s3;
    	per=(total/3);
    	out.println("<html><body>");
    	out.print("<h2>Result of student</h2><br>");
    	out.println("<b><i>Roll No :</b></i>"+sno+"<br>");
    	out.println("<b><i>Name :</b></i>"+snm+"<br>");
    	out.println("<b><i>Class :</b></i>"+sclass+"<br>");
    	out.println("<b><i>Subject1:</b></i>"+s1+"<br>");
    	out.println("<b><i>Subject2:</b></i>"+s2+"<br>");
    	out.println("<b><i>Subject3:</b></i>"+s3+"<br>");
    	out.println("<b><i>Total :</b></i>"+total+"<br>");
    	out.println("<b><i>Percentage :</b></i>"+per+"<br>");
    	if(per<50)
        	out.println("<h1><i>Pass Class</i></h1>");
    	else if(per<55 && per>50)
        	out.println("<h1><i>Second class</i></h1>");
    	else if(per<60 && per>=55)
        	out.println("<h1><i>Higher class</i></h1>");
    	out.close();
	}
}
