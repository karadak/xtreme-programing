/*
 * Clase que verifica el ingreso correcto de un usuario
 * 
 */
package IDE;

/**
 *
 * @author Nelson Reyes
 */
public class LogIn 
{
    /*
     * verifica el passeword del usuario
     */
    private boolean comprobarPassword(String clave)
    {
        boolean respuesta = false;
        String clave_seguridad = "admin";
        
        if(clave.equals(clave_seguridad))
        {
            respuesta = true;
        }
        
        return respuesta;            
        
    }
    
    /*
     * Verifica el nombre de usuario
     */
    private boolean comprobarUsuario(String usuario)
    {
        boolean respuesta = false;
        
        String nombre_usuario = "admin";
        
        if(usuario.equals(nombre_usuario))
        {
            respuesta = true;
        }
        
        return respuesta;            
        
    }
    
    /*
     * valida el ingreso
     * si el password y usuario coinciden
     */
    protected boolean validarIngreso(String password, String Usuario)
    {
        boolean ingresar = false;
        
        if(this.comprobarUsuario(Usuario) && this.comprobarPassword(password))
        {            
            ingresar = true;
        }
        return ingresar;
        
    }
    
    
    
}
