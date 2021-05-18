
import java.awt.Insets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



/**
 *
 * @author 
 */
public class Esquinaut2 extends Application {
    
    Scene miEscena;
    Pane contenedor;
    Label lblNombre, lblApellidos, lblMensaje;
    TextField txtNombre,txtApellidos;
    Button btnNuevo, btnGuardar, btnCancelar;
    Connection conn =null;
  
 //   private TableView table = new TableView();

 
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       Application.launch(args);
       Esquinaut2 curs = new Esquinaut2();
       curs.visualitzarCursos();
       
      
          
    }
   private void visualitzarCursos() throws SQLException, ClassNotFoundException{
        
        conectar();
        
         
            
        }
    private void obtenirCursosClients(){
        obtenirCurs();
    }
    
       public  Connection conectar() throws SQLException, ClassNotFoundException{
           System.out.println("hola");
            String servidor = "jdbc:mysql://192.168.111.1/esquinaut";
            String driver = "com.mysql.jdbc.Driver";
            String user = "topuser";
            String password = "Fat/3232";
            
        try{
            conn = DriverManager.getConnection(servidor , user , password);
            System.out.println(conn);
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("No connectat");
        }
        return conn;
      }
       private void obtenirCurs(){
           
        String sentenciaSQL = "SELECT * FROM cursos";
        PreparedStatement sentencia = null;

               

       
           
           
           
           
           
       }

    @Override
 
    public void start(Stage miEscenario){    
        
                //textfields
//        lblNombre = new Label("Nombre");
//        lblNombre.setTranslateX(20);
//        lblNombre.setTranslateY(20);
//        txtNombre = new TextField();
//        txtNombre.setTranslateX(90);
//        txtNombre.setTranslateY(20);
//        lblApellidos = new Label ("Apellidos");
//        lblApellidos.setTranslateX(20);
//        lblApellidos.setTranslateY(60);
//        txtApellidos = new TextField();
//        txtApellidos.setTranslateX(90);
//        txtApellidos.setTranslateY(60);
//        
//        
//        btnNuevo = new Button("Nuevo");
//        btnNuevo.setTranslateX(100);
//        btnNuevo.setTranslateY(100);
//        btnGuardar = new Button("Guardar");
//        btnGuardar.setTranslateX(100);
//        btnGuardar.setTranslateY(145);
//        btnCancelar = new Button("Cancelar");
//        btnCancelar.setTranslateX(100);
//        btnCancelar.setTranslateY(190);
//        lblMensaje = new Label("Mensaje");
//         lblMensaje.relocate(600, 250);

       TableView<Curs> table = new TableView();
        TableColumn<Curs,Integer > colId = new TableColumn<>("Id_Curs");
        TableColumn<Curs, String> colNom = new TableColumn<>("Nom ");
        TableColumn<Curs, String> colPreu = new TableColumn<>("Preu");
        TableColumn<Curs, String> colNivell = new TableColumn<>("Nivell");
        TableColumn<Curs, Double> colHores = new TableColumn<>("Hores");
        
        TableColumn<Curs,String> colCurs = new TableColumn<>("Curs");
        colCurs.getColumns().addAll(colId,colNom,colPreu,colNivell,colHores);
        
        table.getColumns().addAll(colId,colNom,colPreu,colNivell,colHores);
        
        colId.setCellValueFactory(new PropertyValueFactory<>("id_curs"));
        colNom.setCellValueFactory(new PropertyValueFactory<>("nom_curs"));
        colPreu.setCellValueFactory(new PropertyValueFactory<>("preu_curs"));
        colPreu.setCellValueFactory(new PropertyValueFactory<>("nivell_curs"));
        colPreu.setCellValueFactory(new PropertyValueFactory<>("hores_curs"));
        
        table.relocate(100,50);
        contenedor = new Pane();
       // contenedor.getChildren().addAll(lblNombre,txtNombre,lblApellidos,txtApellidos,btnNuevo,btnGuardar,btnCancelar,lblMensaje,table);
         contenedor.getChildren().addAll(table);
        miEscena = new Scene(contenedor);
                 
        
        miEscenario.setTitle("Esquinaut");
        miEscenario.setMinWidth(1280);
        miEscenario.setHeight(720);
        miEscenario.setScene(miEscena);
        miEscenario.show();
      
        
     
       
    
}
}