package ee_t04_listasLigadas;
/**
 * Write a description of class dn here.
 * 
 * @author (Emanuel lopez) 
 * @version (a version number or a date)
 */
public class INodo<T>{
						 private T Dato;
						 private INodo<T> siguiente;
	private INodo(){//contructor
		Dato=null;
		siguiente=null;
	}
	public INodo(T dato){//inicializacion
		this.Dato=dato;
		siguiente=null;
	}
	public T getDato(){ 
		return Dato;
	}
	public void setDato(T dato){
		this.Dato=dato;
	}
	public INodo<T> getSiguiente(){
		return siguiente;
	}
	public void setSiguiente(INodo<T> siguiente){
		this.siguiente=siguiente;
	}
	public String ToString(){///To String
	   return ""+Dato;
	   }
}