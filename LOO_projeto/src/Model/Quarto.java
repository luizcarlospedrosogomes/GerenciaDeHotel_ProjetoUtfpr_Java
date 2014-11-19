package Model;
// Generated 18/11/2014 01:42:29 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Quarto generated by hbm2java
 */
public class Quarto  implements java.io.Serializable {


     private int codigo;
     private Integer numero;
     private Set statuses = new HashSet(0);

    public Quarto() {
    }

	
    public Quarto(int codigo) {
        this.codigo = codigo;
    }
    public Quarto(int codigo, Integer numero, Set statuses) {
       this.codigo = codigo;
       this.numero = numero;
       this.statuses = statuses;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Integer getNumero() {
        return this.numero;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public Set getStatuses() {
        return this.statuses;
    }
    
    public void setStatuses(Set statuses) {
        this.statuses = statuses;
    }




}

