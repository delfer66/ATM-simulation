/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class cuentaCorriente {
        
        String[] usu = {"fernando","sdlopez","yxrefrigeradora"};
        String[] con={"aaaa123456","ssss111111","rrrr111111"};
        String[] sal={"2000" , "800.45" , "234.45"};
        String[] nombre={"Fernando CV","carlos falton lopez","hol s. wilson","senoryx estremadarefrigeradora"};
        String uactual,cactual,nom, sactual;
        
    public cuentaCorriente () 
    {
                this.nom="";
                this.uactual="";
                this.cactual=""; 
                this.sactual="";
    }

    public String[] buscarCuentaC(String Iusu,String Icon)
    {
        for(int i=0; i<usu.length; i++)
        {
            if((usu[i].equalsIgnoreCase(Iusu)) && (con[i].equalsIgnoreCase(Icon))){
                nom=nombre[i];
                uactual=usu[i];
                cactual=con[i]; 
                sactual=sal[i];
                }
        }
        String[] cuenta={uactual,cactual,nom,sactual};
    return cuenta;
    }
    
    public void obtenerUsuario(String a) 
    {
    this.uactual=a;
    }
    
    public void obtenerContrasena(String a) 
    {
    this.cactual=a;
    }
        
    public void obtenerNombre(String a) 
    {
    this.nom=a;
    }
            
    public void obtenerSaldo(String a) 
    {
    this.sactual=a;
    }
    
    
    
    public String Usuario() 
    {
    return uactual;
    }
    
    public String Contrasena() 
    {
    return cactual;
    }
        
    public String Nombre() 
    {
    return nom;
    }
            
    public String Saldo() 
    {
    return sactual;
    }
}
