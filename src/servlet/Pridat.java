/*	Do prohlizece zadame :	http://localhost:8080/ProgramWeb/pridat
 */
package servlet;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import rozhrani.PomocneRozhrani;
import www.html.*;
@WebServlet
public class Pridat extends HttpServlet implements PomocneRozhrani {
	private static final long serialVersionUID = 1L;
	private Body body;
	private Head head;
	private Html html;
    public Pridat() {
        super();	}
    // zdedene od GenericServlet
    public void init() throws ServletException {
    	html = new Html();
    	body = new Body(this);
    	head = new Head();	}
    // zdedene od GenericServlet
    public void destroy()  {	
    	html = null;
    	body = null;
    	head = null;	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("Cp1250");
		PrintWriter out = response.getWriter();
		/**	Vytvoreni konstrukce webove stranky	**/
		out.println(html.getStartHtml());
		/**	Vytvoreni Hlavicky webove stranky	**/
		out.println(head.getStartHead());
		out.println(head.getHeadsettings());
		out.println(head.getMetaConfig());
		out.println(head.getTitleDefault());
		out.println(head.getCSSconfig());
		out.println(head.getEndHead());
		/**	Vytvoreni tela webove stranky	**/
		out.println(body.getStartBody());
		out.println(body.getBodyHead());
		out.println(body.getBodyNavigator());
		out.println(body.getBodyMain());
		out.println(body.getBodyFooter());
		out.println(body.getEndBody());
		/**	Ukonceni konstrukce webove stranky	**/
		out.println(html.getEndHtml());	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	}
	public String ziskejJmenoServletu() {
		return "pridat";	}
}