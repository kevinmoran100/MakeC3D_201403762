package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String v;
    private String f;
    

    public NodoC3D(String cad) {
        this.cad = cad;
        this.v=null;
        this.f=null;
    }
    
    public NodoC3D(String cad, String v, String f) {
        this.cad = cad;//verdadero
        this.v=v;
        this.f=f;
    }
    
    public String getCad(){
        return cad;
    }
    
    public String getV(){
        return v;
    }
    
    public String getF(){
        return f;
    }
    
    public boolean es_rel(){
        return (this.f!=null) && (this.v!=null);
    }
    
   
        
}
