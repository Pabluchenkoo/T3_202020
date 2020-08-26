package model.logic;

import java.sql.Date;
import model.data_structures.ArregloDinamico;
import model.data_structures.IArregloDinamico;

public class Pelicula 
{
	private int iD;
	
	
	private int presupuesto;
	
	
	private String imdb_Id;
	
	
	private String idiomaOriginal;
	
	
	private String tituloOriginal;
	
	
	private String resumen;
	
	
	private String popularidad;
	
	
	private String productora;
	
	
	private Date fechaEstreno;
	
	
	private int ganancia;
	
	
	private int tiempoReproduccion;
	
	
	private String idiomasHablados;
	
	
	private String Estado;
	
	
	private String tagline;
	
	
	private double promedioVotos;
	
	
	private int cuentaVotos;
	
	
	private int numeroCompaniaProductora;
	
	
	private int numeroCompaniaPaises;
	
	
	private int numeroIdiomasHablados;
	
	
	private IArregloDinamico casting;
	

	
	
	
	public Pelicula (int pID, int pPresupuesto, String pImdb_Id, String pIdiomaOriginal, String pTituloOriginal, String pResumen, String pPopularidad,String pProductora, Date pFechaEstreno, int pGanancia, int pTiempoReproduccion, String pIdiomasHablados, String pEstado,String pTagline, double pPromedioVotos,int pCuentaVotos, int pNumeroCompaniaProductora, int pNumeroCompaniaPaises, int pNumeroIdiomasHablados)
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
		
	
	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	private int darId(){
		return iD;
	}
	
	private void cambiarId(int nuevoId){
		iD = nuevoId;
	}
	
	private int darPresupuesto(){
		return presupuesto;
	}
	
	private void cambiarPresupuesto(int nuevoPresupuesto){
		presupuesto = nuevoPresupuesto;
	}
	
	private String darImdbId(){
		return imdb_Id;
	}
	
	private void cambiarImdbId(String nuevoId){
		imdb_Id = nuevoId;
	}
	
	private String darIdiomaOriginal(){
		return idiomaOriginal;
	}
	
	private void cambiarIdiomaOriginal(String nuevoIdioma){
		idiomaOriginal = nuevoIdioma;
	}
	
	private String darResumen()
	{
		return resumen;
	}
	
	private void cambiarResumen(String nuevoResumen){
		resumen = nuevoResumen;
	}
	
	private String darPopularidad(){
		return popularidad;
	}
	
	private void cambiarPopularidad(String nuevaPopularidad){
		popularidad = nuevaPopularidad;
	}
	
	private String darProductora(){
		return productora;
	}
	
	private void cambiarProductora(String nuevaProductora){
		productora = nuevaProductora;
	}
	
	private Date darFechaEstreno(){
		return fechaEstreno;
	}
	
	private void cambiarFechaEstreno(Date nuevaFecha){
		fechaEstreno = nuevaFecha;
	}
	
	private int darGanancia(){
		return ganancia;
	}
	
	private void cambiarGanancia(int nuevaGanancia){
		ganancia = nuevaGanancia;
	}
	
	private int darTiempoReproduccion(){
		return tiempoReproduccion;
	}
	
	private void cambiarTiempoReproduccion(int nuevoTiempo){
		tiempoReproduccion = nuevoTiempo;
	}
	
	private String darIdiomasHablados(){
		return idiomasHablados;
	}
	
	private void cambiarIdiomasHablados(String nuevosIdiomas){
		idiomasHablados = nuevosIdiomas;
	}
	
	
	private String darEstado(){
		return Estado;
	}
	
	private void cambiarEstado(String nuevoEstado){
		Estado = nuevoEstado;
	}
	
	private String darTagline(){
		return tagline;
	}
	
	private void cambiarTagline(String nuevoTagline){
		tagline = nuevoTagline;
	}
	
	private double darPromedioVotos(){
		return promedioVotos;
	}
	
	private void cambiarPromedioVotos(double nuevoPromedio){
		promedioVotos =  nuevoPromedio;
	}
	
	private int darCuentaVotos(){
		return cuentaVotos;
	}
	
	private void cambiarCuentaVotos(int nuevoCuenta){
		cuentaVotos = nuevoCuenta;
	}
	
	private int darNumeroCompaniaProductora(){
		return numeroCompaniaProductora;
	}
	
	private void cambiaNumeroCompaniaProductora(int nuevoN){
		numeroCompaniaProductora = nuevoN;
	}
	
	private int darNumeroCompaniaPaises(){
		return numeroCompaniaPaises;
	}
	
	private void cambiarNumeroCompaniaPaises(int nuevoN){
		numeroCompaniaPaises = nuevoN;
	}
	
	private int darNumeroIdiomasHablados(){
		return numeroIdiomasHablados;
	}
	
	private void cambiarNumeroIdiomasHablados(int nuevoN){
		numeroIdiomasHablados = nuevoN;
	}

	public String darTituloOriginal() {
		return tituloOriginal;
	}

	public void cambiarTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}
}
