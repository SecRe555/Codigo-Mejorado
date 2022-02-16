package records;

import javax.swing.JOptionPane;
/***
 * Programa para guardar registros de personas.
 * @editBy: Daniel Manzano
 */
public class Test {

    public static void main(String[] args) {
        Items itObj = new Items(); //Objeto de la clase items.
        int option = 0; //Opcion usada por el cliente.

        while (true) {
            try{
                option = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca una opcion para continuar"
                    + "\n1.- Añadir registro. \n2.- Buscar registro. \n3.- Borrar registro."
                    + "\n4.- Modificar registro \n5.- Mostrar todos los registros. \n\n6.- Salir", 
                        "Menu principal", JOptionPane.QUESTION_MESSAGE));
            } catch (Exception e){
                /*En caso de que el usuario introduzca algun caracter no valido se iguala 0
                para que el switch se diriga a la opcion por default*/
                option = 0; 
            }

            switch (option) {
                case 1:
                    itObj.addRecord();
                    break;
                case 2:
                    itObj.searchRecord();
                    break;
                case 3:
                    itObj.deleteRecord();
                    break;
                case 4:
                    itObj.modifyRecord();
                    break;
                case 5:
                    itObj.allRecord();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Tenga un buen dia", "Adios", JOptionPane.PLAIN_MESSAGE);
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida, intente nuevamente", "ERROR", 
                        JOptionPane.ERROR_MESSAGE);
                    break;
            }//end switch
        }//end while
    }// end of main
}// end of class
