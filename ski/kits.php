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
              <li><a href="kits.php">KITS</a></li>
              <li><a href="prediccio.php">PREDICCIÓ</a></li>
              <li><a href="contact.asp">CONTACTE</a></li>
              <li><a href="cistella.php"><i class="fas fa-shopping-cart"></i></a></li>
              <li><a href="login.php"><i class="fas fa-sign-in-alt"></i></a></li>
          </ul>
      </nav>
      <br />
      <a class="menu-mob" href="#" onclick="filtres()"><i class="fas fa-bars">&nbsp;</i>MENÚ</a>
      <ul id="mobil-menu" class="menu-mob">
            <li><a href="index.html">INICI</a></li>
            <li><a href="equips.php">EQUIPS</a></li>
            <li><a href="kits.php">KITS</a></li>
            <li><a href="prediccio.php">PREDICCIÓ</a></li>
            <li><a href="contact.asp">CONTACTE</a></li>
            <li><a href="cistella.php"><i class="fas fa-shopping-cart"></i></a></li>
            <li><a href="login.php"><i class="fas fa-sign-in-alt"></i></a></li>
          </ul>
    </header>
    <div class="carousel">
      <img src="./media/carousel.jpg" />
    </div>
    <div class="content">
      <form action='' method='post'>
      <h1>PREPARA EL TEU KIT EN UNS SEGONS</h1>
      <div class="row">
      <div class="col-md-3" style="text-align: center;">
           <img src="./media/casc.jpg" style="width: 66%; height: 100%;"/>
      </div>
      <div class="col-md-9">
           <h2>ESCULL EL TEU CASC</h2>
           <select id="ca" name="casc" form="carform">
            <option value="1">CASC HEAD PER A NENS DE MENYS DE 6 ANYS</option>
            <option value="2">CASC HEAD ADVANCED PER A MÉS DE 6 ANYS</option>
            <option value="3">CASC HEAD PRO PER A ADULTS COLOR BLANC</option>
            <option value="4">CASC PROFESSIONAL BRIKO FIBRA DE CARBONO</option>
            <option value="5">CASC SE ELITE CARBON FULL PRO</option>
            <option value="6">CASC AMB ULLERES HEAD PRO X33</option>
          </select>
      </div>
      </div>
      <div class="row">
      <div class="col-md-3"  style="text-align: center;">
           <img src="./media/roba.jpg" style="width: 100%; height: 100%;"/>
      </div>
      <div class="col-md-9">
           <h2>ESCULL LA ROBA</h2>
           <select id="co" name="roba" form="carform">
            <option value="1">CONJUNT NORDICA BLANC TÈRMIC EXT</option>
            <option value="2">CONJUNT ALPINA NEGRE / GRIS INICIACIÓ</option>
            <option value="3">CONJUNT QUICKSILVER CAMO PRO SUPER AILLANT</option>
            <option value="4">CONJUNT ALPÍ TEIXIT NYLON PROFESSIONAL</option>
          </select>
      </div>
      </div>
      <div class="row">
      <div class="col-md-3"  style="text-align: center;">
           <img src="./media/bota.jpg" style="width: 80%; height: 100%;"/>
      </div>
      <div class="col-md-9">
           <h2>ESCULL LES BOTES</h2>
           <select id="bo" name="botes" form="carform">
            <option value="1">BOTES SALOMON KIDS COLOR TARONJA INICIACIÓ</option>
            <option value="2">BOTES NORDICA XTRAIL BEGINNER PER A NENS/NENES</option>
            <option value="3">BOTES QUICKSILVES PRO ADULT ALL TERRAIN FULL-GRIP</option>
            <option value="4">BOTES SALOMON S-PRO EXTREME SKI TECH BLACK</option>
          </select>
      </div>
      </div>
      <div class="row">
      <div class="col-md-3" style="text-align: center;">
           <img src="./media/esqui.jpg" style="width: 30%; height: 100%;"/>
      </div>
      <div class="col-md-9">
           <h2>ESCULL ELS TEUS ESQUIS</h2>
           <select id="es" name="esquis" form="carform">
            <option value="1">ESQUIS ATOMIC GREEN ALIEN XTR2</option>
            <option value="2">ESQUIS DYNAFOT ADULT EXTREME 330</option>
            <option value="3">ESQUIS HEAD PRO CRAWLER OUTROAD SKI</option>
            <option value="4">ESQUIS NORDICA ADVANCED SKI FULLGRIP</option>
            <option value="5">LA SPORTIVA ANCHOR PROFESSIONAL GRIP</option>
            <option value="6">LA SPORTIVA ELITE DEMON SKI</option>
          </select>
      </div>
      </div>
      <input type="submit" value="submit"/>
      <?php
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
        if(isset($_POST['esquis']) && isset($_POST['roba']) && isset($_POST['bota']) && isset($_POST['casc'])) {

          // product ID
          $esquis = $_POST['esquis'];
          $roba = $_POST['roba'];
          $bota = $_POST['bota'];
          $casc = $_POST['casc'];
      
          // begin the query
          /*$query = 'INSERT INTO kits VALUES ("'$esquis', '$roba', '$bota .', '. $casc .'")';*/

          mysqli_query($conn,$query);
        }
      ?>
      </form>
    </div>
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