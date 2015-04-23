/*	Do prohlizece zadame :	http://localhost:8080/ProgramWeb/test
 */
package servlet;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import rozhrani.PomocneRozhrani;
import www.html.*;
@WebServlet("/testX")
public class Test extends HttpServlet implements PomocneRozhrani {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private Body body;
	@SuppressWarnings("unused")
	private Head head;
	@SuppressWarnings("unused")
	private Html html;
    public Test() {
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
		out.println("<!DOCTYPE html>"
				+ "<html>"
				+ "<head>"
				+ "<meta http-equiv=\"Content-Type\" content=\"text/html\">"
				+ "<meta charset=\"Cp1250\">"
				+ "<title>Vstupni stranka - zobrazujici webovy projekt</title>"
				+ "<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" >"
				+ "</head><body>"
				+ "<div class=\"wrapper\"> "
				+ "<div class=\"header\">"
				+ "<div class=\"header-container\">"
				+ "<div class=\"logo\"><div class=\"aNadpis\"> Projekt na práci s tabulkami øè</div></div>"
				+ "<div class=\"clear\"></div></div></div>"
				+ "<div class=\"nav\">"
				+ "<div class=\"nav-in\"><ul>"
				+ "<li class=\"last\"><a href=\"#\">Hlavní stranka</a></li>"
				+ "<li><a href=\"#\">Zobrazit Seznam</a></li>"
				+ "<li><a href=\"#\">Pøidat Osobu</a></li>"
				+ "<li><a href=\"#\">Odebrat Osobu</a></li>"
				+ "<li><a href=\"#\">Upravit Osobu</a></li>"
				+ "<li><a href=\"#\">Uložit na server</a></li>"
				+ "<li><a href=\"#\">Naèíst ze serveru</a></li></ul>"
				+ "<div class=\"clear\"></div></div></div>"
				+ "<div class=\"container\">"
				+ "<p>Zobrazime bez nastaveni obrazovky +ìšèøžýáíéúù<img src=\"images/lab.jpg\" title=\"Obrazek naprosto o nicem\" width=\"100%\"></p></div>"
				+ "<div class=\"footer\">"
				+ "<div class=\"footer-in\">"
				+ "<div class=\"copy\">"
				+ "<p>Copyright © 2015 WebsiteName, HTML5. All rights reserved Robert Michaloviè.  Design by <a href=\"http://www.templategarden.com\" "
				+ "target=\"_blank\" rel=\"nofollow\">TemplateGarden</a></p></div>"
				+ "<div class=\"clear\"></div></div></div>"
				+ "</div></body></html>");	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	}
	public String ziskejJmenoServletu() {
		return "test";	}
}