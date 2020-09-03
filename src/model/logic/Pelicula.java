package model.logic;

import java.sql.Date;
import model.data_structures.ArregloDinamico;
import model.data_structures.IArregloDinamico;

public class Pelicula implements Comparable<Pelicula> 
{
	private int iD;
	
	
	private double presupuesto;
	
	
	private String imdb_Id;
	
	
	private String idiomaOriginal;
	
	
	private String tituloOriginal;
	
	
	private String resumen;
	
	
	private String popularidad;
	
	
	private String productora;
	
	
	private String fechaEstreno;
	
	
	private String ganancia;
	
	
	private String tiempoReproduccion;
	
	
	private String idiomasHablados;
	
	
	private String Estado;
	
	
	private String tagline;
	
	
	private String promedioVotos;
	
	
	private int cuentaVotos;
	
	
	private int numeroCompaniaProductora;
	
	
	private int numeroCompaniaPaises;
	
	
	private int numeroIdiomasHablados;
	
	
	private IArregloDinamico casting;
	
	private Pelicula siguiente;
	
	private Pelicula anterior;

	
	
	
	public Pelicula (int pID, double pPresupuesto,String generos, String pImdb_Id, String pIdiomaOriginal, 
			String pTituloOriginal, String pResumen, String pPopularidad,String pProductora, String productCompanies,
			String productionCountries,
			String pFechaEstreno, String pGanancia, String pTiempoReproduccion, 
			String pIdiomasHablados, String pEstado,String pTagline, String titulo,
			String pPromedioVotos,int pCuentaVotos, int pNumeroCompaniaProductora, 
			int pNumeroCompaniaPaises, int pNumeroIdiomasHablados)
	{
	
		iD=pID;
	
		presupuesto = pPresupuesto;
	
	
		imdb_Id = pImdb_Id;
	
		idiomaOriginal = pIdiomaOriginal;
	
	
		tituloOriginal = pTituloOriginal;
	
	
		resumen = pResumen;

	
		popularidad = pPopularidad;
	
	
		productora = pProductora;
	
	
		fechaEstreno = pFechaEstreno;
	
	
		ganancia = pGanancia;
		
		
		tiempoReproduccion = pTiempoReproduccion;
		
		
		idiomasHablados = pIdiomasHablados;
		
		
		Estado = pEstado;
		
		
		tagline = pTagline;
		
		
		promedioVotos = pPromedioVotos;
		
		
		cuentaVotos = pCuentaVotos;
		
		
		numeroCompaniaProductora = pNumeroCompaniaProductora;
		
		
		numeroCompaniaPaises = pNumeroCompaniaPaises;
		
		
		numeroIdiomasHablados = pNumeroIdiomasHablados;
		
	
		siguiente = null;
	

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public int darId(){
		return iD;
	}
	
	public void cambiarId(int nuevoId){
		iD = nuevoId;
	}
	
	public double darPresupuesto(){
		return presupuesto;
	}
	
	public void cambiarPresupuesto(int nuevoPresupuesto){
		presupuesto = nuevoPresupuesto;
	}
	
	public String darImdbId(){
		return imdb_Id;
	}
	
	public void cambiarImdbId(String nuevoId){
		imdb_Id = nuevoId;
	}
	
	public String darIdiomaOriginal(){
		return idiomaOriginal;
	}
	
	public void cambiarIdiomaOriginal(String nuevoIdioma){
		idiomaOriginal = nuevoIdioma;
	}
	
	public String darResumen()
	{
		return resumen;
	}
	
	public void cambiarResumen(String nuevoResumen){
		resumen = nuevoResumen;
	}
	
	public String darPopularidad(){
		return popularidad;
	}
	
	public void cambiarPopularidad(String nuevaPopularidad){
		popularidad = nuevaPopularidad;
	}
	
	public String darProductora(){
		return productora;
	}
	
	public void cambiarProductora(String nuevaProductora){
		productora = nuevaProductora;
	}
	
	public String darFechaEstreno(){
		return fechaEstreno;
	}
	
	public void cambiarFechaEstreno(String nuevaFecha){
		fechaEstreno = nuevaFecha;
	}
	
	public String darGanancia(){
		return ganancia;
	}
	
	public void cambiarGanancia(String nuevaGanancia){
		ganancia = nuevaGanancia;
	}
	
	public String darTiempoReproduccion(){
		return tiempoReproduccion;
	}
	
	public void cambiarTiempoReproduccion(String nuevoTiempo){
		tiempoReproduccion = nuevoTiempo;
	}
	
	public String darIdiomasHablados(){
		return idiomasHablados;
	}
	
	public void cambiarIdiomasHablados(String nuevosIdiomas){
		idiomasHablados = nuevosIdiomas;
	}
	
	
	public String darEstado(){
		return Estado;
	}
	
	public void cambiarEstado(String nuevoEstado){
		Estado = nuevoEstado;
	}
	
	public String darTagline(){
		return tagline;
	}
	
	public void cambiarTagline(String nuevoTagline){
		tagline = nuevoTagline;
	}
	
	public String darPromedioVotos(){
		return promedioVotos;
	}
	
	public void cambiarPromedioVotos(String nuevoPromedio){
		promedioVotos =  nuevoPromedio;
	}
	
	public int darCuentaVotos(){
		return cuentaVotos;
	}
	
	public void cambiarCuentaVotos(int nuevoCuenta){
		cuentaVotos = nuevoCuenta;
	}
	
	public int darNumeroCompaniaProductora(){
		return numeroCompaniaProductora;
	}
	
	public void cambiaNumeroCompaniaProductora(int nuevoN){
		numeroCompaniaProductora = nuevoN;
	}
	
	public int darNumeroCompaniaPaises(){
		return numeroCompaniaPaises;
	}
	
	public void cambiarNumeroCompaniaPaises(int nuevoN){
		numeroCompaniaPaises = nuevoN;
	}
	
	public int darNumeroIdiomasHablados(){
		return numeroIdiomasHablados;
	}
	
	public void cambiarNumeroIdiomasHablados(int nuevoN){
		numeroIdiomasHablados = nuevoN;
	}

	public String darTituloOriginal() {
		return tituloOriginal;
	}

	public void cambiarTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}

	
	public  Pelicula darSiguiente()
	{
		return siguiente;
	}
	public Pelicula darAnterior()
	{
		return anterior;
	}
	public <T> void cambiarAnterior(T elemento)
	{
		anterior = (Pelicula) elemento;
	}
	
	public <T> void cambiarSiguiente(T elemento)
	{
		siguiente= (Pelicula) elemento;
	}
	public void desconectarSiguiente()
	{
		siguiente = siguiente.siguiente;
	}
	public void insertarDespues(Pelicula peli)
	{
		peli.siguiente = siguiente;
		siguiente = peli;
	}	



	public int compareTo(Pelicula p1) {
		
		if (Double.parseDouble(this.darPromedioVotos()) > Double.parseDouble(p1.darPromedioVotos())){
			
			return 1;
		
		}else if(Double.parseDouble(this.darPromedioVotos()) == Double.parseDouble(p1.darPromedioVotos())){
		
			return 0;
		
		}else{
			
			return -1;
		}
		
		

	}



}
