package www.html;
public class Head {
	//	konstruktor
	public Head(){ }
	public String getStartHead(){
		return "<head>";	}
	public String getHeadsettings(){
		return "<meta http-equiv=\"Content-Type\" content=\"text/html\">"+"\n"
				+"<meta charset=\"Cp1250\">";	}
	public String getMetaConfig(){
		return "<meta name=\"robots\" content=\"ALL,NOINDEX,NOFOLLOW\">"
				+"\n<meta name=\"description\" content=\"Your description\"/>"
				+"\n<meta name=\"keywords\" content=\"keyword1 keyword2\"/>";}
	public String getTitleDefault(){
		return "<title>Vstupni stranka - zobrazujici webovy projekt</title>";	}
	public String getTitleDefault(String s){
		return s;	}
	public String getCSSconfig(){
		return "<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" >";	}
	public String getEndHead(){
		return "</head>";	}
}