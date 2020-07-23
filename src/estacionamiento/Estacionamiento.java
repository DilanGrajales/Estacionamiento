/*
CREEN LAS CLASES Y ASIGNEMOS CADA UNO UNA CLASE PARA NO TRABAJAR EN LA MISMA
CLARO CUANDO DEJEMOS DE USAR LA CLASE QUE ESTEMOS PROGRAMANDO AVISAR PARA QUE OTRO PUEDA MODIFICARLA
ASI CUANDO VAYAMOS A PROGRAMAR Y NO SEA NUESTRA CLASE EN USO HAY QUE PREGUNTAR SI PODEMOS MODIFICARLA 
YA QUE EL NETBEANS NO GUARDA SI NO LE DICES O SI NO COMPILAS
 */
package estacionamiento;

/**
 * @author Dilan
 * @author Paola
 * @author Kevin
 * @author ANT EsPiRiTu
 */
public class Estacionamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        conexion conex = new conexion();
        Login login = new Login();
        registro reg = new registro();
        System.out.println("HOLA MUNDO");
        //LEAN HASTA ARRIVA 
        login.setVisible(true);
        conex.conexion();
        
        
    }
    
}
