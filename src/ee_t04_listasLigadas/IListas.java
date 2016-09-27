package ee_t04_listasLigadas;


/**
 * Write a description of class dn here.
 * 
 * @author (Emanuel lopez) 
 * @version (a version number or a date)
 */
public class IListas<T>{
public INodo<T> inicio;INodo<T> z=null;
public IListas(){
    inicio=null;
}
public INodo<T> getInicio(){
    return inicio;
}
public void setInicio(INodo<T> inicio){
    this.inicio=inicio;
}
public void inserta_inicio(T dato){//incertar elemento en el inicio
    INodo<T> N=new INodo<T>(dato);
    System.out.print("incertado al inicio--->"+dato+"\n");
    N.setSiguiente(inicio);
    inicio=N;
    }
public void inserta_final(T dato){//incertar elemeto al final de lista
     try{
       INodo<T> var=inicio;
       while((var.getSiguiente())!=null){
           var=var.getSiguiente();
        }
        INodo<T> N=new INodo<T>(dato);
        System.out.println("incertado al final ---> "+dato);
        var.setSiguiente(N);
        var=null;
       }catch(Exception e){}
    }
public void inserta_antes_de(T dato, T referencia){// INCERTAR DATO ANTES DE LA REFERENCIA
     INodo<T> aux=inicio; INodo<T> z=null;boolean sts=true;
    if(inicio!=null){
        INodo<T> N=new INodo<T>(dato);
         while(aux!=null){
             z=aux.getSiguiente();
           if(aux.ToString().equals(referencia)){
            System.out.println(dato+" agregado antes de "+referencia);sts=false;
            aux.setSiguiente(N);
            N.setSiguiente(z);
            }
           aux=aux.getSiguiente();
        }
        if(sts==true){System.out.println(" Referencia no encontrada");}
    }
    }
public void inserta_despues_de(T dato, T Referencia){//INCERTAR DATO DESPUES DE LA REFERENCIA
      INodo<T> aux=inicio; INodo<T> z=null;boolean sts=true;INodo<T> tem=null;
         INodo<T> N=new INodo<T>(dato);
      while(aux!=null){
        z=aux.getSiguiente();
        if(aux.ToString().equals(Referencia)){
                System.out.println(dato+" agragado despues de "+Referencia);sts=false;
                aux.setSiguiente(tem);
                tem.setSiguiente(N);
                N.setSiguiente(aux);
                aux.setSiguiente(z);
            }
            tem=aux;   aux=aux.getSiguiente();
        }
       if(sts==true){System.out.println(" Referencia no encontrada");}
    }
public void elimina_primero(){//eliminar elemento inicial
    INodo<T> var=inicio;
    if(inicio==null){System.out.println("Ya no existe elemento para elminar");}else{
     inicio= var.getSiguiente();
    }
}    
public void elimina_ultimo(){                //  eliminar el ultomo elemto de la lista
     INodo<T> var=inicio; INodo<T> z=null;
    if(inicio!=null){                   //System.out.println("No hay elemento para elminar");
      while((var.getSiguiente())!=null){
             z=var;
           var=var.getSiguiente();
        }
      if(var==inicio){
         inicio= var.getSiguiente();
         System.out.print(var.ToString()+"\n");
         }else { z.setSiguiente(null);
         System.out.print(var.ToString()+"\n");
         }
    }
    } 
public void elimina_elemento(T dato){// ELIMINAR ELEMENTO ESPESIFICO
   INodo<T> aux=inicio; INodo<T> z=inicio;boolean sts=true;INodo<T> tem=null;INodo<T> a=inicio;
    while(aux!=null){
      tem=aux.getSiguiente();
      if(aux.ToString().equals(dato)){
       System.out.println(dato+" eliminado ");sts=false;
       if(inicio==aux){System.out.println("Ya no existe elemento para elminar");
         z=z.getSiguiente();
         aux.setSiguiente(tem);
        }else{
         aux=aux.getSiguiente();
		 z.setSiguiente(aux);
            }
            }else{	z=aux;}
          aux=aux.getSiguiente();
        }
        if(sts==true){System.out.println(" Referencia no encontrada");}
}
public void elimina_antes(T dato){// ELIMINAR ELEMENTO ANTES DE LA REFERENCIA
     INodo<T> aux=inicio; INodo<T> z=null;boolean sts=true;INodo<T> tem=null;
    if(inicio!=null){
         while(aux!=null){
           if(aux.ToString().equals(dato)){
            System.out.println(" eliminado antes de "+dato);sts=false;
                z=aux.getSiguiente();
                z=z.getSiguiente();
                aux.setSiguiente(z);
            }
            tem=aux;  aux=aux.getSiguiente();
        }
        if(sts==true){System.out.println(" Referencia no encontrada");}
    }
    }
public void busca_desordenado(T dato){// BUSCAR ELEMENTO
     INodo<T> aux=inicio; int pos=0;boolean sts=true;
    if(inicio!=null){
         while(aux!=null){
            pos++;
            if(aux.ToString().equals(dato)){
                System.out.println(aux.ToString()+" Se encuentra en la posicion "+pos);
                sts=false;
            }
           aux=aux.getSiguiente();
        }
        if(sts==true){System.out.println(" No se encontro "+dato+" en la lista");}
    }
    }
public void obtenDatoEnPosicion(Integer posicion){// OBTTENER LA POSCICION DE UN ELEMENTO
     INodo<T> aux=inicio; int pos=0;boolean sts=true;
    if(inicio!=null){
      while(aux!=null){ 
        pos++;
        if(posicion==pos){
         System.out.println("en la posision "+posicion+" esta "+aux.ToString());
         sts=false;
            }
         aux=aux.getSiguiente();
        }
      if(sts==true){System.out.println(" No se encontro "+posicion+" en la lista");}
    }
    }
 public T busca_rescursivo(INodo<T> p, T dato){// BUSCAR DE FORMA RECURSIVA
        p=inicio;
     while((p.getSiguiente())!=null){
        if(p.ToString().equals(dato)){
          System.out.println("El elemento se encuentra en la lista");
        }
            p=p.getSiguiente();  
        } 
     return dato;
}
    public void  recorreIterativo(){//recorrer lista 
     INodo<T> Q=inicio; boolean lista=false;  INodo<T> aux=inicio;
    while(Q!=null){
        System.out.print(Q.ToString()+", ");lista=true;
        Q.setSiguiente(Q.getSiguiente());
        Q=Q.getSiguiente();
    }
    if(lista==false){System.out.println("No hay mas elemtos!!");}
}
    public void  recorreRecursivo(INodo<T> p){//recorrer lista 
    p=inicio; boolean lista=false;
    while(p!=null){
        System.out.print(p.ToString()+"-->");lista=true;
        p=p.getSiguiente();
    }
    if(lista==false){System.out.println("No hay mas elemtos!!");}
}
    public void recorrer(){//recorrer lista 
    INodo<T> N =inicio; boolean lista=false;
    while(N!=null){
        System.out.print("["+N.ToString()+"]-");lista=true;
        N=N.getSiguiente();
    }
    if(lista==false){System.out.println("No hay mas elemtos!!");}
}
//*******************************incertar dato ordenado
public static void main(String []args){
IListas P=new IListas();
INodo z=null;
System.out.println("\n------- ELEMENTO AGREGADO EN EL INICIO---- ------");
P.inserta_inicio("uno");
P.inserta_inicio("dos");
P.inserta_inicio("tres"); 
P.inserta_inicio("cuatro"); 
P.inserta_inicio("cinco"); 
System.out.println();P.recorrer();
System.out.println("\n----------ELEMENTO AGREGADO AL FINAL ------------");
P.inserta_final("cero");
System.out.println();P.recorrer();
System.out.println("\n------INCERTAR ANTES Y DESPUES DE UN ELEMENTO----");
P.inserta_antes_de("ANTES_UNO","uno");
P.inserta_despues_de("DESPUEs_DOS","dos");
System.out.println();P.recorrer();
System.out.println("\n-INCERTAR ANTES Y DESPUES DE UN ELEMENTO QUE NO EXISTE-----");
P.inserta_despues_de("despues3","seis");
P.inserta_antes_de("despues3","ocho");
System.out.println("\n------------ELIMINAR ELEMENTO INICAL----------------------");
P.elimina_primero();P.recorrer();
System.out.println("\n-----------ELIMNAR UN ELEMTO FINAL- ----------------------");
P.elimina_ultimo();P.recorrer();
System.out.println("\n------------------ELEMINAR ELEMENTO---------------------");
P.elimina_elemento("DESPUEs_DOS");P.recorrer();
System.out.println("\n----------ELIMINAR UN ELEMENTO ANTES DE OTRO---------------");
P.elimina_antes("dos");
System.out.println("\n---------------BUSCAR DESORDENADO----------------------");
P.busca_desordenado("tres");
P.busca_desordenado("ocho");
System.out.println("\n---------------BUSCAR RECURSIVO----------------------");
P.busca_rescursivo(z,"dos");
System.out.println("\n---------OBTENER LA POSICION DE UN ELEMENTO  -------");
P.obtenDatoEnPosicion(2);
System.out.println("\n------------RECORRER RECURSIVO----------------------");
P.recorreRecursivo(z);
System.out.println("\n------------RECORRER INTERACTIVO--------------------");
P.recorreIterativo();System.out.println();
System.out.println("\n------------INCERTAR ORDENADO-----------------------");
P.recorrer();
System.out.println("\n---------------RESULTADO-DE-PRUEBA-FINAL ********--");
 System.out.println();P.recorrer();
}
}