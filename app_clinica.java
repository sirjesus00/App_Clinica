import javax.swing.JOptionPane;

public class app_clinica {

    static cls_paciente[] pacientes = new cls_paciente[100];// Creacion de vector de objetos.
    static int posicionInt = 0;// Variable para mover las posiciones del vertor

    public static void main(String[] args) {

        fnt_menu(true);

    }

    private static void fnt_menu(boolean men) {
        while (men == true) {
            String optionesStr = JOptionPane.showInputDialog(null,
                    "MENU DE OPCIONES\n1.Registrar\n2. Consultar\n3. Salir");
            if (optionesStr.equals("1")) {
                fnt_registrar();
            }

            if (optionesStr.equals("2")) {
              int codigoInt = Integer.parseInt(JOptionPane.showInputDialog(null,"Codigo del paciente"));
                fnt_consultar(codigoInt);
            }
            if (optionesStr.equals("3")) {
                men = false;
            }
        }
    }

    private static void fnt_registrar() {
        int codigoInt = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo paciente"));
        int contactoInt = Integer.parseInt(JOptionPane.showInputDialog(null, "Contacto paciente"));
        String nombreStr = JOptionPane.showInputDialog(null, "Nombre paciente");
        String epsStr = JOptionPane.showInputDialog(null, "EPS paciente");
        pacientes[posicionInt] = new cls_paciente(codigoInt, nombreStr, contactoInt, epsStr);
        posicionInt = +1;
        JOptionPane.showMessageDialog(null, "Paciente registrado con exito", "Registrar",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static void fnt_consultar(int codigo) {
        int posInt = 0;
        boolean swBln = false;
        for (int i = 0; i < posicionInt; i++) {
            if (codigo == pacientes[i].getCodigoInt()) {
                posInt = i;
                swBln = true;
                break;
            }

        }
        if (swBln == false) {
            JOptionPane.showInputDialog(null, "No se encontraron datos asociados", "Consulta",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"Codigo: " +pacientes[posInt].getCodigoInt()+"\nContacto: " +pacientes[posInt].getContactoInt()+"\nNombre: "+pacientes[posInt].getNombreStr()+"\nEps: "+pacientes[posInt].getEpsStr());
                    
        }
    }

}