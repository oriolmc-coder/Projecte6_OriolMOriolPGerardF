
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.awt.Insets;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
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
     // static Scanner sc = new Scanner(System.in);
    Scene miEscena;
    Pane contenedor;
    Label labelNom,labelID,labelDni,labelNivell,labelCarnet,labelNombrosa,labelData,labelHores;
    TextField tfNom,tfID,tfDni,tfNivell,tfCarnet,tfNombrosa,tfData,tfHores,tfPreu;
    Button btnInserir, btnGuardarBD, btnConsultar;
    Connection conn =null;
   TableView<Curs> table;
   TableView<CursClient> taulacc;
  
  
   
 
  
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       Application.launch(args);
       Esquinaut2 curs = new Esquinaut2();

    //   Esquinaut2 cursclient = new Esquinaut2();
      
       
      
          
    }
    
    @Override
 
    public void start(Stage miEscenario) throws SQLException, ClassNotFoundException{  
     //TAULA
        TableColumn<Curs,String> colCurs = new TableColumn<>("Curs");
         TableColumn<Curs,String> idcursColumn = new TableColumn<>("id_curs");
      idcursColumn.setCellValueFactory(new PropertyValueFactory<>("id_curs"));
       //nomcurs column 
       TableColumn<Curs,String> nomColumn = new TableColumn<>("nom_curs");
      nomColumn.setCellValueFactory(new PropertyValueFactory<>("nom_curs"));
       //preu
        TableColumn<Curs,String> preuColumn = new TableColumn<>("preu_curs");
        preuColumn.setCellValueFactory(new PropertyValueFactory<>("preu_curs"));        
        //nivell federat
        TableColumn<Curs,String> nivellColumn = new TableColumn<>("nivell_curs");
        nivellColumn.setCellValueFactory(new PropertyValueFactory<>("nivell_curs"));
        //hores
      TableColumn<Curs,Double> horesColumn = new TableColumn<>("hores_curs");
      horesColumn.setCellValueFactory(new PropertyValueFactory<>("hores_curs"));
     table = new TableView<>();
         table.getColumns().addAll(idcursColumn,nomColumn,preuColumn,nivellColumn,horesColumn);

        
        table.relocate(100,50);
        table.setMaxHeight(200);
       
        table.setItems(getCurs());
        
        //--------------FI TAULA-------------
        
        //---------TAULA ARRAY----------
            TableColumn<CursClient,String> colCursClient = new TableColumn<>("CursClient");
         TableColumn<CursClient,String> idcurs = new TableColumn<>("ID");
      idcurs.setCellValueFactory(new PropertyValueFactory<>("id_curs"));
      
           TableColumn<CursClient,String> nivell = new TableColumn<>("Nivell");
           nivell.setCellValueFactory(new PropertyValueFactory<>("nivellFederat"));

           
            TableColumn<CursClient,String> familiaNombrosa = new TableColumn<>("Familia Nom.");
           familiaNombrosa.setCellValueFactory(new PropertyValueFactory<>("familiaNombrosa"));
           
              TableColumn<CursClient,String> data= new TableColumn<>("Data");
           data.setCellValueFactory(new PropertyValueFactory<>("data"));
           
            TableColumn<CursClient,Double> hores= new TableColumn<>("Hores");
           hores.setCellValueFactory(new PropertyValueFactory<>("hores"));
           
          
          
        taulacc = new TableView<>();
        taulacc.getColumns().addAll(idcurs,nivell,familiaNombrosa,data,hores);
        taulacc.relocate(910, 50);
        taulacc.setMaxHeight(200);
        
        //taulacc.setItems(getCursClient());
      //-----------------------
      
      
      
        //----------BOTONS----------------
        
        btnInserir = new Button("Curs Familiar");
        btnInserir.relocate(700, 600);
        btnInserir.setOnAction((event)->{
          agregarCursFamiliar();  
        }
        
        );
        
         btnConsultar = new Button("Curs Federat");
        btnConsultar.relocate(820, 600);
        btnConsultar.setOnAction((event)->{
            agregarCursFederat();
        });
        
         btnGuardarBD = new Button("Curs més llogat");
        btnGuardarBD.relocate(930, 600);
       btnGuardarBD.setOnAction((event)->{
            try {
                db40();
            } catch (SQLException ex) {
                System.out.println("No s'ha pogut guardar a la BDOO");;
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Esquinaut2.class.getName()).log(Level.SEVERE, null, ex);
            }
       });
        
        //LABELFIELD
         labelID = new Label("ID del Curs: ");
        labelID.relocate(590, 200);
        labelDni = new Label("Dni: ");
        labelDni.relocate(590, 250);
         labelNivell = new Label("Nivell de Federat");
         labelNivell.relocate(590, 300);
//         labelCarnet = new Label("Numero del Carnet");
//         labelCarnet.relocate(590, 350);
         labelNombrosa = new Label("Familia Nombrosa?");
         labelNombrosa.relocate(590, 400);
         labelData = new Label("Data");
         labelData.relocate(590, 450);
         labelHores = new Label("Hores");
         labelHores.relocate(590, 500);
         
        //TEXTFIELD
        tfID = new TextField();
        tfID.relocate(740, 200);
        tfDni = new TextField();
        tfDni.relocate(740, 250);
        tfNivell = new TextField();
        tfNivell.relocate(740, 300);
        tfNivell.setPromptText("A,B,C,D,E");
        tfCarnet = new TextField();
        tfCarnet.relocate(740, 350);
        tfNombrosa = new TextField();
        tfNombrosa.relocate(740, 400);
        tfData = new TextField();
        tfData.relocate(740, 450);
        tfHores = new TextField();
        tfHores.relocate(740, 500);
        tfPreu = new TextField();
        tfPreu.relocate(740, 550);
 
        contenedor = new Pane();
  
         contenedor.getChildren().addAll(table,btnInserir,btnConsultar,btnGuardarBD,labelID,tfPreu,tfID,tfDni,tfNivell,tfNombrosa,tfData,tfHores,labelDni,labelNivell,labelNombrosa,labelData,labelHores,taulacc);
        miEscena = new Scene(contenedor);
        table = new TableView<>();
           
        miEscenario.setTitle("Esquinaut");
        miEscenario.setMinWidth(1440);
        miEscenario.setHeight(785);
        miEscenario.setScene(miEscena);
       
        miEscenario.show();   
}
    private ObservableList<Curs>curs;
       public ObservableList<Curs> getCurs() throws SQLException, ClassNotFoundException{
        conectar();
        ObservableList<Curs> curs =FXCollections.observableArrayList();
     
        try{      
        String SQL = "Select * from curs";            
        ResultSet rs = conn.createStatement().executeQuery(SQL);  
        while(rs.next()){
           Curs curs2 = new Curs();
           curs2.setNom_curs(rs.getString("nom"));
           curs2.setId_curs(rs.getString("id_curs"));
           curs2.setPreu_curs(rs.getString("preu"));
           curs2.setNivell_curs(rs.getString("niv_federat"));
           curs2.setHores_curs(rs.getDouble("hores"));
             curs.add(curs2);
             
                                                                                                                
        table.setItems(curs);
    }
        } catch(SQLException e){
          e.printStackTrace();
          System.out.println("No mostra");            
    }
        
          
    return curs;
  
    }
          public  Connection conectar() throws SQLException, ClassNotFoundException{
           
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
           
          public void agregarCursFamiliar(){
              
                CursClient cc = new CursFamiliar();
               CursFamiliar cf = (CursFamiliar)cc ;
               
               
               cf.setId_curs(Integer.parseInt(tfID.getText())); 
               cf.setFamiliaNombrosa(tfNombrosa.getText());
              cf.setPreu(Double.parseDouble(tfPreu.getText()));
               cf.setHores (Integer.parseInt(tfHores.getText()));
               cf.setData(tfData.getText());
              cf.setDni(tfDni.getText());
                 

if (cf.hores <= 2){
        cf.preufinal = (cc.preu * 80) / 100;
              System.out.println("El preu final es:"+ cf.preufinal);
          }else if (cf.hores == 3) {
        cf.preufinal= (cc.preu * 70) / 100;
              System.out.println("El preu final es:"+ cf.preufinal);
          }else if (cf.hores == 6){
        cf.preufinal = (cf.preu * 50) / 100;
              System.out.println("El preu final es:"+ cf.preufinal);
          } else if (cf.preufinal > 0){
              double preufamilianombrosa = (cf.preufinal * 60) /100;
              System.out.println("Si tens familia nombrosa el preu es :" + preufamilianombrosa );
          } else {
              System.out.println("l'opcio no es valida");
          }
           System.out.println(cf);
   
                    tfID.clear();
                    tfNombrosa.clear();
                    tfHores.clear();
                    tfData.clear();
                    tfDni.clear(); 
                    tfHores.clear();
                    tfPreu.clear();
                    
                    taulacc.getItems().add(cf);
                  
          }
          
          public void agregarCursFederat(){
              CursClient cc = new CursFederat();
              CursFederat fd = (CursFederat) cc;
              
              fd.setId_curs(Integer.parseInt(tfID.getText()));
              //fd.setNumCarnet(tfCarnet.getText());
              fd.setHores(Integer.parseInt(tfHores.getText()));
              fd.setData(tfData.getText());
              fd.setNivellFederat(tfNivell.getText());
              fd.setDni(tfDni.getText());
              
              System.out.println(fd);
              
              tfID.clear();
              tfCarnet.clear();
              tfHores.clear();
              tfData.clear();
              tfNivell.clear();
              tfDni.clear();
              
              taulacc.getItems().add(fd);    
}
          
          
          public ObservableList<CursClient> getCursClient(){
                ObservableList<CursClient> cursclient = FXCollections.observableArrayList();

//                   CursClient cc = new CursFamiliar();
//                    CursClient cC = new CursFederat();
                    CursFamiliar cf = (CursFamiliar)cursclient ;
                    CursFederat fd = (CursFederat) cursclient;
             
                    cursclient.add(cf);
                    cursclient.add(fd);
                    return cursclient;
}
          
          
          public void db40() throws SQLException, ClassNotFoundException{
              Curs c1 = new Curs();
              File f = new File("curs.db4o");
              f.delete();
              ObjectContainer db = Db4oEmbedded.openFile(f.getAbsolutePath());
              
              
              /////////////
              
              
              conectar();
                 try{      
        String SQL = "Select * from curs ";            
        ResultSet rs = conn.createStatement().executeQuery(SQL);  
        while(rs.next()){
           
          c1.setNom_curs(rs.getString("nom"));
          c1.setId_curs(rs.getString("id_curs"));
    }
        } catch(SQLException e){
          e.printStackTrace();
          System.out.println("No mostra");            
    }
              
             
              /////////////
              
              db.store(c1);
              Curs c = new Curs();
              ObjectSet <Curs> result = db.queryByExample(c);
              
              while(result.hasNext()){
                  System.out.println(result.next());
              }
              
              db.close();
          }
          

          
}