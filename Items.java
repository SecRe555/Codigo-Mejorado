package records;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/***
 * Clase donde se encuentran las funciones que trae el codigo
 * @param: 
 * @editBy: Daniel Manzano
 */
class Items {
    private ArrayList<Data> registros; //Lista donde se almacenaran los registros.
    private boolean comprobacion = false; //Variable para hacer comprobaciones.
    
    //constructor
    public Items() {
        registros = new ArrayList<Data>();
    }//end constructor

    public void addRecord() {
        String name = JOptionPane.showInputDialog(null, "Ingrese el nombre:", "Añadiendo Registro", 
            JOptionPane.QUESTION_MESSAGE);
        String address = JOptionPane.showInputDialog(null, "Ingrese la direccion:", "Añadiendo Registro", 
            JOptionPane.QUESTION_MESSAGE);
        String phoneNumber = JOptionPane.showInputDialog(null, "Ingrese el numero de telefono:", "Añadiendo Registro", 
            JOptionPane.QUESTION_MESSAGE);
        Data registro = new Data(name, address, phoneNumber);

        registros.add(registro); //Añadimos el registro 
    }//end addRecord

    public void searchRecord() {
        if (registros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Disculpe, no hay registros guardados.", "No se econtraron registros", 
                    JOptionPane.ERROR_MESSAGE);
        } else {
            String search = JOptionPane.showInputDialog(null, "Introduzca el nombre a buscar:", "Buscando registro.",
                    JOptionPane.QUESTION_MESSAGE);
            for (int i = 0; i < registros.size(); i++) {
                Data registro = registros.get(i);
                if (search.equals(registro.getName())) {
                    comprobacion = true;
                    registro.print();
                }//end if
            } // end for
            if (!comprobacion) {
                JOptionPane.showMessageDialog(null, "Registro no encontrado", "Disculpe", JOptionPane.WARNING_MESSAGE);
            }//end if
        }//end if
    } // end searchPerson

    //Delete the specific person from the record
    public void deleteRecord() {
        if (registros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Disculpe, no hay registros guardados.", "No se econtraron registros", 
                    JOptionPane.ERROR_MESSAGE);
        } else {
            String search = JOptionPane.showInputDialog(null, "Introduzca el nombre  a buscar:", "Borrando registro.", 
                    JOptionPane.QUESTION_MESSAGE);
            for (int i = 0; i < registros.size(); i++) {
                Data registro = registros.get(i);
                if (search.equals(registro.getName())) {
                    comprobacion = true;
                    registros.remove(i);
                    JOptionPane.showMessageDialog(null, "El registro fue borrado", "Borrado satisfactoriamente",
                        JOptionPane.PLAIN_MESSAGE);
                }//end if
            }//end for
            if (!comprobacion) {
                JOptionPane.showMessageDialog(null, "Registro no encontrado", "Disculpe", JOptionPane.WARNING_MESSAGE);
            }//end if
        }//end if
    }//end deleteRecord

    // To display all the records   
    public void allRecord() {
        if (registros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Disculpe, no hay registros guardados.", "No se econtraron registros", 
                    JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i = 0; i < registros.size(); i++) {
                Data registro = registros.get(i);
                JOptionPane.showMessageDialog(null, "Registro numero: " + (i + 1) + "\n\nNombre: " + registro.getName() 
                    + "\nDireccion: " + registro.getAddress() + "\nNumero telefonico: " + registro.getPhoneNumber(),
                        "Registros", JOptionPane.PLAIN_MESSAGE);
            }//end for
        }//end if
    }//end allRecord

    // Modify records. 
    public void modifyRecord() {
        if (registros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Disculpe, no hay registros guardados.", "No se encontraron registros",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            String search = JOptionPane.showInputDialog(null, "Introduzca el nombre del registro a modificar.",
                "Editando registro", JOptionPane.QUESTION_MESSAGE);
            for (int i = 0; i < registros.size(); i++) {
                Data registro = registros.get(i);
                if (search.equals(registro.getName())) {
                    comprobacion = true;
                    registro.print();
                    String name = JOptionPane.showInputDialog(null, "Introduzca un nuevo nombre: "
                        + "\n(El ultimo fue " + registro.getName()
                        + ")", "Modificando nombre", JOptionPane.QUESTION_MESSAGE);
                    String address = JOptionPane.showInputDialog(null, "Introduzca una nueva direccion: "
                        + "\n(La ultima fue " + registro.getAddress()
                        + ")", "Modificando direccion", JOptionPane.QUESTION_MESSAGE);
                    String phoneNumber = JOptionPane.showInputDialog(null, "Introduzca un nuevo numero telefonico: "
                        + "\n(El ultimo fue " 
                        + registro.getPhoneNumber() + ")", "Modificando numero telefonico",JOptionPane.QUESTION_MESSAGE);
                    registro.setName(name);
                    registro.setAddress(address);
                    registro.setPhoneNumber(phoneNumber);
                    registro.print();
                }//end if
            }//end for
            if (!comprobacion) {
                JOptionPane.showMessageDialog(null, "Registro no encontrado", "Disculpe", JOptionPane.WARNING_MESSAGE);
            }//end if
        }//end if
    }//end modifyRecord
}//end of class