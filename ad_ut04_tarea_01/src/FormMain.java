import models.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormMain extends JFrame {

    private JPanel contentPanel;
    private JButton bClose;
    private JPanel bottomPanel;
    private JButton bTest;
    private JButton bCreateSessionFactory;
    private JButton bCloseSessionFactory;
    private JButton bCreateJugador;
    private JTextField tfJugadorName;
    private JTextField tfJugadorCorreo;
    private JTextField tfJugadorId;
    private JTextField tfJugadorFechaRegistro;
    private JButton bUpdateJugador;
    private JButton bEliminarJugador;
    private JButton bGetPersonaje;
    private JTextField tfPersonajeId;
    private JTextField tfPersonajeNombre;
    private JTextField tfPersonajeRaza;
    private JTextField tfPersonajeNivel;
    private JTextField tfPersonajeExperiencia;
    private JTextField tfPersonajeJugador;
    private JButton bAsociateJugadorPersonaje;
    private JPanel panelJugador;
    private JPanel panelPersonaje;
    private JButton bGetJugador;
    private JButton bCreateSession;
    private JButton bCloseSession;
    private JTable tableCazados;
    private JPanel panelCazados;
    private JPanel panelMisiones;
    private JTable tableMisiones;
    private JPanel panelObjetos;
    private JTable tableObjetos;
    private JLabel Objetos;
    private JButton bGetPersonajeComerciante;
    private JButton bGetPersonajeMision;

    // SessionFactory global
    SessionFactory factory = null;
    // Session global
    Session session = null;

    // Último jugador seleccionado
    Jugador lastJugador = null;
    // Último personaje seleccionado
    Personaje lastPersonaje = null;

    /// PERSONAJE

    // Obtener personaje que está en una determinada misión
    private void onGetPersonajeMisionClick() {
        log("=> onGetPersonajeMisionClick");

        // TODO: onGetPersonajeMisionClick(). Obtener personaje que está en una determinada misión
        /*
         - Llamar a checkCreatedSession()
         - Obtener personaje que esté en alguna misión cuyo nombre contenga "noble" (mediante createSelectionQuery y utilizando HQL)
            - Si no existe => Mostrar "Personaje no encontrado" => Fin
         - Llamar a showPersonajeInfo() (en el caso que existan varios personajes, mostrar el primero)
         */


    }

    // Obtener personaje con objetos de un determinado comerciante
    private void onGetPersonajeComercianteClick() {
        log("=> onGetPersonajeComercianteClick");

        // TODO: onGetPersonajeComercianteClick(). Obtener personaje con objetos de un determinado comerciante
        /*
         - Llamar a checkCreatedSession()
         - Obtener personaje que tenga algún objeto que venda el comerciante de nombre "Gremist" (mediante createQuery y utilizando HQL)
            - Si no existe => Mostrar "Personaje no encontrado" => Fin
         - Llamar a showPersonajeInfo() (en el caso que existan varios personajes, mostrar el primero)
         */


    }

    // Asociar un jugador a un personaje
    private void onAsociateJugadorPersonajeClick() {
        log("=> onAsociateJugadorPersonajeClick");

        // TODO: onAsociateJugadorPersonajeClick(). Asociar un jugador a un personaje
        /*
        - Si no ha seleccionado un jugador => Mostrar "Jugador no seleccionado" => Fin
        - Si no ha seleccionado un personaje => Mostrar "Personaje no seleccionado" = Fin
        - Llamar a checkCreatedSessionFactory()
        - Utilizar una nueva transacción
        - Asociar jugador en BD al personaje
        - Llamar a showPersonajeInfo()
        */


    }

    // Obtener personaje por el nombre
    private void onGetPersonajeClick() {
        log("=> onGetPersonajeClick");

        // TODO: onGetPersonajeClick(). Obtener personaje por el nombre
        /*
         - Llamar a checkCreatedSession()
         - Obtener personaje cuyo nombre contenga el introducido (mediante una Named Query con un parámetro que sea el nombre)
            - Si no existe => Mostrar "Personaje no encontrado" => Fin
         - Llamar a showPersonajeInfo()
         */


    }

    // Mostrar la información de un personaje
    private void showPersonajeInfo(Personaje personaje) {
        log("=> showPersonajeInfo");

        // TODO: showPersonajeInfo(). Mostrar la información de un personaje
        /*
        - Último personaje = este personaje
        - Limpiar tablas de datos: llamando a tableCazadosClean(), tableMisionesClean() y tableObjetosClean()
        - Rellenar los controles con los datos del personaje
        - Rellenar tablas de datos: llamando a tableCazadosAddRow(), tableMisionesAddRow() y tableObjetosAddRow()
        - Llamar a showInfo con los datos del personaje
         */


    }

    /// JUGADOR

    // Eliminar un jugador
    private void onDeleteJugadorClick() {
        log("=> onDeleteJugadorClick");

        // TODO: onDeleteJugadorClick(). Eliminar un jugador
        /*
        - Llamar a checkCreatedSessionFactory()
        - Utilizar una nueva transacción
        - Obtener jugador indicando en el campo ID
            - Si no existe => Mostrar "Jugador no encontrado" => Fin
        - Eliminar jugador de la BD
        - Llamar a showJugadorInfo()
        - Último jugador = nulo
         */


    }

    // Modificar un jugador
    private void onUpdateJugadorClick() {
        log("=> onUpdateJugadorClick");

        // TODO: onUpdateJugadorClick(). Modificar un jugador
        /*
        - Llamar a checkCreatedSessionFactory()
        - Utilizar una nueva transacción
        - Obtener jugador indicando en el campo ID
            - Si no existe => Mostrar "Jugador no encontrado" => Fin
        - Modificar jugador en la BD con el nombre y correo introducidos
        - Llamar a showJugadorInfo()
         */


    }

    // Crear un nuevo jugador
    private void onCreateJugadorClick() {
        log("=> onCreateJugadorClick");

        // TODO: onCreateJugadorClick(). Crear un nuevo jugador
        /*
         - Llamar a checkCreatedSessionFactory()
         - Utilizar una nueva transacción
         - Crear Jugador en BD con el nombre y correo introducidos
         - Llamar a showJugadorInfo()
         */


    }

    // Obtener los datos del jugador con un determinado id
    private void onGetJugadorClick() {
        log("=> onGetJugadorClick");

        // TODO: onGetJugadorClick(). Obtener los datos del jugador con un determinado id
        /*
         - Llamar a checkCreatedSession()
         - Obtener jugador indicado en el campo ID (mediante find())
            - Si no existe => Mostrar "Jugador no encontrado" => Fin
         - Llamar a showJugadorInfo()
         */


    }

    // Mostrar la información de un jugador
    private void showJugadorInfo(Jugador jugador) {
        log("=> showJugadorInfo");

        // TODO: showJugadorInfo(). Mostrar la información de un jugador
        /*
        - Último jugador = este jugador
        - Rellenar los controles con los datos del jugador
        - Llamar a showInfo con los datos del jugador
         */


    }

    /// TEST

    // Cerrar SessionFactory global
    private void onCloseSessionFactoryClick() {
        log("=> onCloseSessionFactoryClick");

        // TODO: onCloseSessionFactoryClick(). Cerrar SessionFactory global
        /*
         - Si existe SessionFactory global => La cierra
         - Mostrar "OK"
         */


    }

    // Cerrar Session global
    private void onCloseSessionClick() {
        log("=> onCloseSessionClick");

        // TODO: onCloseSessionClick(). Cerrar Session global
        /*
         - Si existe Session global => La cierra
         - Mostrar "OK"
         */


    }

    // Crear Session global
    private void onCreateSessionClick() {
        log("=> onCreateSessionClick");

        // TODO: onCreateSessionClick(). Crear Session global.
        /*
         - Llamar a checkCreatedSession()
         - Mostrar "OK"
         */


    }

    // Crear SessionFactory global
    private void onCreateSessionFactoryClick() {
        log("=> onCreateSessionFactoryClick");

        // TODO: onCreateSessionFactoryClick(). Crear SessionFactory global.
        /*
         - Llamar a checkCreatedSessionFactory()
         - Mostrar "OK"
         */


    }

    // Comprobar conexión
    private void test() {
        log("=> Test");

        // TODO: Test(). Comprobar configuración
        /*
         - Crear SessionFactory local
         - Crear Session local
         - Crear, ejecutar y obtener consulta nativa "SHOW TABLES" (createNativeQuery y SQL)
         - Mostrar "X tablas", con X es el número de tablas que hay en el esquema
         - Liberar Session local
         - Liberar SessionFactory local
         */


    }

    /// SESSION

    // Si la Session global no está creada, la crea
    private void checkCreatedSession() {
        log("=> checkCreatedSession");

        // TODO: checkCreatedSession(). Si la Session global no está creada, la crea
        // - Si está creada => No hace nada => Fin
        // - Llamar a checkCreatedSessionFactory()
        // - Si no está creada => La crea llamando a creaSession


    }

    // Crea un nuevo Session a partir de un SessionFactory
    private Session creaSession(SessionFactory factory) {
        log("=> creaSession");

        // TODO: Crear Session


    }

    // Cierra un Session
    private void cierraSession(Session session) {
        log("=> cierraSession");

        // TODO: Liberar Session


    }

    /// SESSION FACTORY

    // Si la SessionFactory global no está creada, la crea
    private void checkCreatedSessionFactory() {
        log("=> checkCreatedSessionFactory");

        // TODO: checkCreatedSessionFactory(). Si la SessionFactory global no está creada, la crea
        // - Si está creada => No hace nada => Fin
        // - Si no está creada => La crea llamando a creaSessionFactory


    }

    // Crea un nuevo SessionFactory
    private SessionFactory creaSessionFactory() {
        log("=> creaSessionFactory");

        // TODO: Crear SessionFactory


    }

    // Cierra un SessionFactory
    private void cierraSessionFactory(SessionFactory factory) {
        log("=> cierraSessionFactory");

        // TODO: Liberar SessionFactory


    }

    /// LOGS

    // Mostrar mensaje por consola
    private static void log(String msg) {
        // NO MODIFICAR

        System.out.println(msg);
    }

    /// MENSAJES

    // Mostrar mensaje informativo
    private void showInfo(String message) {
        // NO MODIFICAR

        if (message == null)
            return;

        JOptionPane.showMessageDialog(this,
                message,
                getTitle() + " - Info",
                JOptionPane.INFORMATION_MESSAGE);
    }

    // Mostrar mensaje de advertencia
    private void showWarning(String message) {
        // NO MODIFICAR

        if (message == null)
            return;

        JOptionPane.showMessageDialog(null,
                message,
                getTitle() + " - Advertencia",
                JOptionPane.WARNING_MESSAGE);
    }

    // Mostrar mensaje de error
    private void showError(String message) {
        // NO MODIFICAR

        if (message == null)
            return;

        JOptionPane.showMessageDialog(null,
                message,
                getTitle() + " - Error",
                JOptionPane.ERROR_MESSAGE);
    }

    // JTables

    // Función que limpia las filas de la tabla de los monstruos cazados por un personaje
    private void tableCazadosClean() {
        // NO MODIFICAR

        tableClean(tableCazados);
    }

    // Función que añade una fila a la tabla de monstruos cazados por de un personaje
    private void tableCazadosAddRow(int id, int personajeId, String personajeNombre, int monstruoId, String monstruoNombre, int cantidad) {
        // NO MODIFICAR

        DefaultTableModel tableModel = (DefaultTableModel) tableCazados.getModel();
        tableModel.addRow(new Object[]{id, personajeId, personajeNombre, monstruoId, monstruoNombre, cantidad});
    }

    // Función que limpia las filas de la tabla de las misiones de un personaje
    private void tableMisionesClean() {
        // NO MODIFICAR

        tableClean(tableMisiones);
    }

    // Función que añade una fila a la tabla de misiones de un personaje
    private void tableMisionesAddRow(int id, int personajeId, String personajeNombre, int misionId, String misionNombre, String misionDescripcion, int misionExperiencia, int misionOro, MisionEstado estado) {
        // NO MODIFICAR

        DefaultTableModel tableModel = (DefaultTableModel) tableMisiones.getModel();
        tableModel.addRow(new Object[]{id, personajeId, personajeNombre, misionId, misionNombre, misionDescripcion, misionExperiencia, misionOro, estado.toString()});
    }

    // Función que limpia las filas de la tabla de los objetos de un personaje
    private void tableObjetosClean() {
        // NO MODIFICAR

        tableClean(tableObjetos);
    }

    // Función que añade una fila a la tabla de objetos de un personaje
    private void tableObjetosAddRow(int id, int personajeId, String personajeNombre, int objetoId, String objetoNombre, ObjetoTipo objetoTipo, int objetoValor, int cantidad) {
        // NO MODIFICAR

        DefaultTableModel tableModel = (DefaultTableModel) tableObjetos.getModel();
        tableModel.addRow(new Object[]{id, personajeId, personajeNombre, objetoId, objetoNombre, objetoTipo.toString(), objetoValor, cantidad});
    }

    // Función que elimina las filas de un JTable
    private void tableClean(JTable table) {
        // NO MODIFICAR

        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.setRowCount(0);
    }

    ///

    // Constructor
    public FormMain() {
        // NO MODIFICAR

        // título
        setTitle("AD. UT04. Tarea 1");

        // al cerrar la ventana, salir de la aplicación
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // establecer contenido
        setContentPane(contentPanel);
        pack();

        // ventana centrada en la pantalla
        setLocationRelativeTo(null);

        // tabla cazados
        DefaultTableModel tableModelCazados = new DefaultTableModel();
        tableModelCazados.addColumn("Id");
        tableModelCazados.addColumn("Personaje ID");
        tableModelCazados.addColumn("Personaje");
        tableModelCazados.addColumn("Monstruo ID");
        tableModelCazados.addColumn("Monstruo");
        tableModelCazados.addColumn("Cantidad");
        tableCazados.setModel(tableModelCazados);

        // tabla misiones
        DefaultTableModel tableModelMisiones = new DefaultTableModel();
        tableModelMisiones.addColumn("Id");
        tableModelMisiones.addColumn("Personaje ID");
        tableModelMisiones.addColumn("Personaje");
        tableModelMisiones.addColumn("Misión ID");
        tableModelMisiones.addColumn("Misión nombre");
        tableModelMisiones.addColumn("Descripcion");
        tableModelMisiones.addColumn("Experiencia");
        tableModelMisiones.addColumn("Oro");
        tableModelMisiones.addColumn("Estado");
        tableMisiones.setModel(tableModelMisiones);

        // tabla objetos
        DefaultTableModel tableModelObjetos = new DefaultTableModel();
        tableModelObjetos.addColumn("Id");
        tableModelObjetos.addColumn("Personaje ID");
        tableModelObjetos.addColumn("Personaje");
        tableModelObjetos.addColumn("Objeto ID");
        tableModelObjetos.addColumn("Objeto nombre");
        tableModelObjetos.addColumn("Tipo");
        tableModelObjetos.addColumn("Valor");
        tableModelObjetos.addColumn("Cantidad");
        tableObjetos.setModel(tableModelObjetos);

        // clicks
        bClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        bTest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                test();
            }
        });
        bCreateSessionFactory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onCreateSessionFactoryClick();
            }
        });
        bCreateSession.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onCreateSessionClick();
            }
        });
        bCloseSession.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onCloseSessionClick();
            }
        });
        bCloseSessionFactory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onCloseSessionFactoryClick();
            }
        });
        bGetJugador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onGetJugadorClick();
            }
        });
        bCreateJugador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onCreateJugadorClick();
            }
        });
        bUpdateJugador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onUpdateJugadorClick();
            }
        });
        bEliminarJugador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onDeleteJugadorClick();
            }
        });
        bGetPersonaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onGetPersonajeClick();
            }
        });
        bAsociateJugadorPersonaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onAsociateJugadorPersonajeClick();
            }
        });
        bGetPersonajeComerciante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onGetPersonajeComercianteClick();
            }
        });
        bGetPersonajeMision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onGetPersonajeMisionClick();
            }
        });
    }

    // Función main
    public static void main(String[] args) {
        // NO MODIFICAR

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FormMain formMain = new FormMain();
                formMain.setVisible(true);
            }
        });
    }
}