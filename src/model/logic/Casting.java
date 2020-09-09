package model.logic;

public class Casting implements Comparable<Casting>  {
	
	private int iD;
	
	
	private String nombreActor1;
	
	
	private String generoActor1;
	
	
	private String nombreActor2;
	
	
	private String generoActor2;
	
	
	private String nombreActor3;
	
	
	private String generoActor3;
	
	
	private String nombreActor4;
	
	
	private String generoActor4;
	
	
	private String nombreActor5;
	
	
	private String generoActor5;
	
	
	private int numeroActor;
	
	
	private String nombreDirector;
	
	
	private int generoDirector;
	
	
	private int numeroDirector;
	
	
	private String nombreProductor;
	
	
	private int numeroProductor;
	
	
	private String nombreEditor;
	
	
	public Casting (int id, String pnombreActor1, String pgeneroActor1 , String pnombreActor2, String pgeneroActor2 , 
			String pnombreActor3, String pgeneroActor3 , String pnombreActor4, String pgeneroActor4 , String pnombreActor5, 
			String pgeneroActor5 , int pnumeroActor, String pnombreDirector, int pgeneroDirector, int pnumeroDirector,
			String pnombreProductor, int pnumeroProductor, String pnombreEditor){
		
		iD=id;
		
		nombreActor1 = pnombreActor1;
		
		generoActor1 = pgeneroActor1;
 		
		nombreActor2 = pnombreActor2;
		
		generoActor2 = pgeneroActor2;
		
		nombreActor3 = pnombreActor3;
		
		generoActor3 = pgeneroActor3;
		
		nombreActor4 = pnombreActor4;
		
		generoActor4 = pgeneroActor4;
		
		nombreActor5 = pnombreActor5;
		
		generoActor5 = pgeneroActor5;
		
		numeroActor = pnumeroActor;
		
		nombreDirector = pnombreDirector;
		
		generoDirector = pgeneroDirector;
		
		numeroDirector = pnumeroDirector;
		
		nombreProductor = pnombreProductor;
		
		numeroProductor = pnumeroProductor;
		
		nombreEditor = pnombreEditor;
	}
	
	
	
	
	
	
	public int dariD() {
		return iD;
	}
	public void cambiariD(int iD) {
		this.iD = iD;
	}
	public String darNombreActor1() {
		return nombreActor1;
	}
	public void cambiarNombreActor1(String nombreActor1) {
		this.nombreActor1 = nombreActor1;
	}
	public String darNombreActor2() {
		return nombreActor2;
	}
	public void cambiarNombreActor2(String nombreActor2) {
		this.nombreActor2 = nombreActor2;
	}
	public String darGeneroActor1() {
		return generoActor1;
	}
	public void cambiarGeneroActor1(String generoActor1) {
		this.generoActor1 = generoActor1;
	}
	public String darGeneroActor2() {
		return generoActor2;
	}
	public void cambiarGeneroActor2(String generoActor2) {
		this.generoActor2 = generoActor2;
	}
	public String darNombreActor3() {
		return nombreActor3;
	}
	public void cambiarNombreActor3(String nombreActor3) {
		this.nombreActor3 = nombreActor3;
	}
	public String darNombreActor4() {
		return nombreActor4;
	}
	public void cambiarNombreActor4(String nombreActor4) {
		this.nombreActor4 = nombreActor4;
	}
	public String darGeneroActor3() {
		return generoActor3;
	}
	public void cambiarGeneroActor3(String generoActor3) {
		this.generoActor3 = generoActor3;
	}
	public String darGeneroActor4() {
		return generoActor4;
	}
	public void cambiarGeneroActor4(String generoActor4) {
		this.generoActor4 = generoActor4;
	}
	public String darNombreActor5() {
		return nombreActor5;
	}
	public void cambiarNombreActor5(String nombreActor5) {
		this.nombreActor5 = nombreActor5;
	}
	public String darGeneroActor5() {
		return generoActor5;
	}
	public void cambiarGeneroActor5(String generoActor5) {
		this.generoActor5 = generoActor5;
	}
	public int darNumeroActor() {
		return numeroActor;
	}
	public void cambiarNumeroActor(int numeroActor) {
		this.numeroActor = numeroActor;
	}
	public int darNumeroDirector() {
		return numeroDirector;
	}
	public void cambiarNumeroDirector(int numeroDirector) {
		this.numeroDirector = numeroDirector;
	}
	public int darGeneroDirector() {
		return generoDirector;
	}
	public void cambiarGeneroDirector(int generoDirector) {
		this.generoDirector = generoDirector;
	}
	public String darNombreDirector() {
		return nombreDirector;
	}
	public void cambiarNombreDirector(String nombreDirector) {
		this.nombreDirector = nombreDirector;
	}
	public String darNombreProductor() {
		return nombreProductor;
	}
	public void cambiarNombreProductor(String nombreProductor) {
		this.nombreProductor = nombreProductor;
	}
	public int darNumeroProductor() {
		return numeroProductor;
	}
	public void cambiarNumeroProductor(int numeroProductor) {
		this.numeroProductor = numeroProductor;
	}
	public String darNombreEditor() {
		return nombreEditor;
	}
	public void cambiarNombreEditor(String nombreEditor) {
		this.nombreEditor = nombreEditor;
	}






	@Override
	public int compareTo(Casting arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	
}
