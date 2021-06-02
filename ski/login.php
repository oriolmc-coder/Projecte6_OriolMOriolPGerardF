
<!DOCTYPE html>
<html lang="ca">
  <head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.7/css/all.css">
    <script src="https://kit.fontawesome.com/yourcode.js" crossorigin="anonymous"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="./javascript/javascript.js"></script>
    <link rel="stylesheet" href="./css/styles.css" />  
    <title>Ski World - Lloguer d'equips d'esquí</title>
  </head>
  <body>
    <header>
      <img src="./media/logo.png" class="logo" />
      <nav>
        <ul>
              <li><a href="index.html">INICI</a></li>
              <li><a href="equips.php">EQUIPS</a></li>
              <li><a href="prediccio.php">PREDICCIÓ</a></li>
              <li><a href="cursos.php">CURSOS</a></li>
              <li><a href="login.php">ACCÉS/PERFIL</a></li>
          </ul>
      </nav>
      <br />
      <a class="menu-mob" href="#" onclick="filtres()"><i class="fas fa-bars">&nbsp;</i>MENÚ</a>
      <ul id="mobil-menu" class="menu-mob">
              <li><a href="index.html">INICI</a></li>
              <li><a href="equips.php">EQUIPS</a></li>
              <li><a href="prediccio.php">PREDICCIÓ</a></li>
              <li><a href="cursos.php">CURSOS</a></li>
              <li><a href="login.php">ACCÉS/PERFIL</a></li>
          </ul>
    </header>
    <div class="carousel">
      <img src="./media/carousel.jpg" />
    </div>
    <div class="content">
      <h1>ACCÉS PER CLIENTS</h1>
      <div class="row">
      <div class="col-xs-12 col-lg-4" style="margin-right: 30px;">
      
      <?php 
                error_reporting(0);
                session_start();
                    if($_SESSION['login_user']==true){ 
                        echo '<span><strong>Benvingut: </strong></span>';
                        echo "<span>" . $_SESSION["login_user"] . "</span>";
                        echo '<a href="logout.php" >    Sortir</a>';
                        }
                ?>
      <?php
            error_reporting(0);
            $servername = "localhost";
            $username = "root";
            $password = "";
            $dbname = "skiworld2";

            // Create connection
            $conn = new mysqli($servername, $username, $password, $dbname);
            // Check connection
            if ($conn->connect_error) {
                die("Connection failed: " . $conn->connect_error);
            }

            $sql = "SELECT * FROM member WHERE username = '".$_SESSION['login_user']."'";
            $result = $conn->query($sql);
            
        while($row = mysqli_fetch_array($result))
        {
        echo "<div class='dades-personals'>";
        echo "<h2>LES TEVES DADES</h2>"; 
        echo "<p><strong>ID: </strong>" . $row['mem_id'] . "</p>";
        echo "<p><strong>DNI: </strong>" . $row['username'] . "</p>";
        echo "<p><strong>NOM: </strong>" . $row['fname'] . "</p>";
        echo "<p><strong>COGNOMS: </strong>" . $row['lname'] . "</p>";
        echo "<p><strong>EMAIL: </strong>" . $row['address'] . "</p>";
        echo "<p><strong>CONTRASENYA: </strong>" . $row['password'] . "</p>";
        echo "</div>";
        echo "<h2>HISTORIAL DE COMANDES</h2>"; 
        }
        

        
        ?>
        
        </div>
        <div class="col-xs-12 col-lg-4" style="margin-right: 30px;">
            <div id="signup">
            <div id="signup-st">
            <?php
            $remarks = isset($_GET['remarks']) ? $_GET['remarks'] : '';
                if ($remarks==null and $remarks=="") {
                echo ' <div id="reg-head" class="headrg">Registreu-vos aqui</div> <br />';
                }
                if ($remarks=='success') {
                echo ' <div id="reg-head" class="headrg">Registrat amb èxit</div> ';
                }
                if ($remarks=='failed') {
                echo ' <div id="reg-head-fail" class="headrg">Registre incorrecte, Aquest usuari ja existeix</div> ';
                }
                if ($remarks=='error') {
                echo ' <div id="reg-head-fail" class="headrg">Registre erroni! <br> Error: '.$_GET['value'].' </div> ';
                }
            ?>
            </div>
        <form name="reg" action="execute.php" onsubmit="return validateForm()" method="post" id="reg">
        <table  cellpadding="2" cellspacing="0">
        <tr>
        <td class="t-1">
        <div id="tb-name">Nom:</div>
        </td>
        <td>
        <input type="text" name="fname" id="tb-box" required/>
        </td>
        </tr>
        <tr>
        <td class="t-1"><div id="tb-name">Cognom:</div></td>
        <td><input type="text" name="lname" id="tb-box" required/></td>
        </tr>
        <tr>
        <td class="t-1"><div id="tb-name">Email:</div></td>
        <td><input type="text" id="tb-box" name="address" required/></td>
        </tr>
        <tr>
        <td class="t-1"><div id="tb-name">DNI:</div></td>
        <td><input type="text" id="tb-box" name="username" minlength="9" maxlength="9" required/></td>
        </tr>
        <tr>
        <td class="t-1"><div id="tb-name">Contrasenya:</div></td>
        <td><input id="tb-box" type="password" name="password" required/></td>
        </tr>
        </table>
        <br />
        <div id="st"><input name="submit" type="submit" value="REGISTRAR-ME" id="st-btn"/></div>
        </form>
        
        </div></div>
        <br /><br />
        <div class="col-xs-12 col-lg-4"  style="margin-right: 30px;">
        <div id="login">
        <div id="login-st">
        <form action="logincheck.php" method="POST" id="signin" id="reg">
        <?
                echo "Hello" .$_SESSION['username'];
                ?>
        <?php
        $remarks = isset($_GET['remark_login']) ? $_GET['remark_login'] : '';
        if ($remarks==null and $remarks=="") {
        echo ' <div id="reg-head" class="headrg">Accedeix aqui</div><br /> ';
        }
        if ($remarks=='failed') {
        echo ' <div id="reg-head-fail" class="headrg">Accés erroni!, Credencials invàlides</div> ';
        }
        ?>
        <table  cellpadding="2" cellspacing="0">
        <tr id="lg-1">
        <td class="tl-1"><div id="tb-name">Usuari:</div></td>
        <td><input type="text" id="tb-box" name="username" required/></td>
        </tr>
        <tr id="lg-1">
        <td class="tl-1"><div id="tb-name">Contrasenya:</div></td>
        <td><input id="tb-box" type="password" name="password" required/></td>
        </tr>
        </table>
        <br />
        <div id="st"><input name="submit" type="submit" value="ACCEDIR" id="st-btn"/></div>
        </form>
        
        </div>
        </div>
        </div>
        </div>
        <p class="comandes"><strong><u>Les teves compres</u></strong></p>    
        <?php
            error_reporting(0);
            $servername = "localhost";
            $username = "root";
            $password = "";
            $dbname = "skiworld2";

            // Create connection
            $conn = new mysqli($servername, $username, $password, $dbname);
            // Check connection
            if ($conn->connect_error) {
                die("Connection failed: " . $conn->connect_error);
            }

            $sql = "SELECT * FROM cursosclients, cursos WHERE cursosclients.id_curs = cursos.id_curs AND mem_id = '".$_SESSION['login_user']."'";
            $result = $conn->query($sql);
         
        while($row = mysqli_fetch_array($result))
        {
        
        echo "<p><strong>ID COMPRA: </strong>" . $row['referencia'] . "&nbsp;&nbsp;&nbsp;<strong>CURS: </strong>" . $row['id_curs'] . "&nbsp;&nbsp;" . $row['nom'] . "&nbsp;&nbsp;<strong>IMPORT: </strong>" . $row['preu'] . "€</p><hr />";
        }
        
        
        
        ?>

    </div>
    <marquee direction="right" scrollamount="80" behavior=scroll style="margin-bottom: -32px;">  
    <img src="./media/esquiador.gif" class="esquiador"/>
    </marquee>  
    <footer>
      <div class="row">
        <div class="col-sm-12 col-md-6">
          <img class="logo2" src="./media/logo2.png" />
        </div>
        <div class="col-sm-12 col-md-6">
          <ul>
            <li><a href="default.asp">AVÍS LEGAL</a></li>
            <li><a href="news.asp">POLÍTICA DE COOKES</a></li>
            <li><a href="contact.asp">POLÍTICA DE PRIVACITAT</a></li>
          </ul>
        </div>
      </div>
    </footer>
  </body>
</html>