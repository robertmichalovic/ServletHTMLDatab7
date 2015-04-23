package www.html;
import rozhrani.PomocneRozhrani;
class BodyHeader {
	protected String getCSSSettings(){
		return "<div class=\"header\"><div class=\"header-container\">";	}
	protected String getCSSNadpis(){
		return "<div class=\"logo\"><div class=\"aNadpis\"> Projekt na práci s tabulkami</div></div>";	}
	protected String getClear(){
		return "<div class=\"clear\"></div></div></div>";	}
}
class BodyNavigator {
	protected String getCSSSettings(){
		return "<div class=\"nav\"><div class=\"nav-in\"><ul>";	}
	protected String getNavigatorLink(){
		return "<li class=\"last\">"+
				"<a href=\"http://localhost:8080/ProgramWeb/hlavni\">Hlavní stranka</a></li>"+
				"<li><a href=\"http://localhost:8080/ProgramWeb/zobrazit\">Zobrazit Seznam</a></li>"+
				"<li><a href=\"http://localhost:8080/ProgramWeb/pridat\">Pøidat Osobu</a></li>"+
				"<li><a href=\"http://localhost:8080/ProgramWeb/odebrat\">Odebrat Osobu</a></li>"+
				"<li class=\"no_bg ped\"><a href=\"http://localhost:8080/ProgramWeb/odebrat\">Upravit Osobu</a></li>";		}
	protected String getClear(){
		return "</ul> <div class=\"clear\"></div></div></div>";	}
}
class BodyMain {
	private String jmenoServletu;
	public void setJmenoServletu(String jmenoServletu) 		{	this.jmenoServletu = jmenoServletu;	}
	public BodyMain(PomocneRozhrani rozhrani) {
		this.setJmenoServletu(rozhrani.ziskejJmenoServletu());	}
	protected String getCSSSettings(){
		System.out.println("Testovaci vypis : "+this.jmenoServletu);		//	Testovaci vypis
		return "<div class=\"container\"><p>Zobrazime bez nastaveni obrazovky +ìšèøžýáíéúù"
				+ "<img src=\"images/lab.jpg\" title=\"Obrázek naprosto o nièem\" width=\"100%\"></p></div>";	}
}
class BodyFooter {
	protected String getCSSSetings(){
		return "<div class=\"footer\"><div class=\"footer-in\">"; }
	protected String getFooterData(){
		return "<div class=\"copy\"><p>Copyright © 2015 WebsiteName, HTML5. All rights reserved Robert Michaloviè. "
				+ " Design by <a href=\"http://www.templategarden.com\" target=\"_blank\" rel=\"nofollow\">TemplateGarden</a></p></div>";	}
	protected String getClear(){
		return "<div class=\"clear\"></div></div></div>";	}
}
public class Body {
	private BodyHeader header;
	private BodyNavigator navigator;
	private BodyMain main;
	private BodyFooter footer;
	//	konstruktor
	public Body(PomocneRozhrani rozhrani){	
		header = new BodyHeader();
		navigator = new BodyNavigator();
		main = new BodyMain(rozhrani);
		footer = new BodyFooter();	}
	public String getStartBody(){
		return "<body><div class=\"wrapper\">";	}
	public String getBodyHead(){
		return 	header.getCSSSettings()+header.getCSSNadpis()+header.getClear();	}
	public String getBodyNavigator(){
		return navigator.getCSSSettings()+navigator.getNavigatorLink()+navigator.getClear();	}
	public String getBodyMain(){
		return main.getCSSSettings();	}
	public String getBodyFooter(){
		return footer.getCSSSetings()+footer.getFooterData()+footer.getClear();	}
	public String getEndBody(){
		return "</div></body>";	}
}