/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class cuentaAhorros {
        
        String[] usu = {"fernando","cflopez","hswilson","yxrefrigeradora","apcasa"};
        String[] con={"aaaa123456","ffff111111","wwww222222","rrrr111111","pppp111111"};
        String[] sal={"1111" , "800.45" , "234.45" , "0.0" , "324"};
        String[] nombre={"Fernando CV","carlos falton lopez","hol s. wilson","senoryx estremadarefrigeradora"};
        String uactual,cactual,nactual,nom,sactual;

        
    public cuentaAhorros() 
    {
                this.nom="";
                this.uactual="";
                this.cactual=""; 
                this.sactual="";
    }

    public String[] buscarCuentaA(String Iusu,String Icon)
    {
        for(int i=0; i<usu.length; i++)
        {
            if((usu[i].equalsIgnoreCase(Iusu)) && (con[i].equalsIgnoreCase(Icon))){
                this.nom=nombre[i];
                this.uactual=usu[i];
                this.cactual=con[i]; 
                this.sactual=sal[i];
            }
        }
       String[] cuenta={uactual,cactual,nom,sactual};
       return cuenta;
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
    return nactual;
    }
            
    public String Saldo() 
    {
    return sactual;
    }

}
