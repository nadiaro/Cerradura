package ar.edu.unlam;

public class Cerradura {
	
	private Integer claveDeApertura;
	private Integer cantidadDeFallosConsecutivosQueLaBloquean;
	private Boolean estadoCerradura;
	
	
	public Cerradura(Integer claveDeApertura,
			Integer cantidadDeFallosConsecutivosQueLaBloquean) {
		this.claveDeApertura = claveDeApertura;
		this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
		this.estadoCerradura=false;
	}


	public Boolean abrir (Integer clave){
	       if(cantidadDeFallosConsecutivosQueLaBloquean<3){
	               if(this.claveDeApertura.equals(clave)){
	                 return this.estadoCerradura=true;
	                }else{
	                  System.out.println("Contraseña incorrecta, intente nuevamente");
	                 }
	       }else{
	           System.out.println("Se ha alcanzado el numero maximo de intentos, cerradura bloqueada permanentemente");
	         }
	       cantidadDeFallosConsecutivosQueLaBloquean++;
	       return estadoCerradura; }
	
	
	public void cerrar(){
		this.estadoCerradura=false;
	}
	
	public Boolean estaAbierta(){
		return this.estadoCerradura=true;
		
	}
	public Boolean estaCerrada(){
		return this.estadoCerradura;
	}
	
	public Boolean fueBloqueada(){
		if(this.cantidadDeFallosConsecutivosQueLaBloquean>=3){
			return this.estadoCerradura=false;
		}
		return estadoCerradura;
		
	}
	
	public Integer getClaveDeApertura() {
		return claveDeApertura;
	}

	public void setClaveDeApertura(Integer claveDeApertura) {
		this.claveDeApertura = claveDeApertura;
	}


	public Integer getCantidadDeFallosConsecutivosQueLaBloquean() {
		return cantidadDeFallosConsecutivosQueLaBloquean;
	}


	public void setCantidadDeFallosConsecutivosQueLaBloquean(
			Integer cantidadDeFallosConsecutivosQueLaBloquean) {
		this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
	}
	
	

}



