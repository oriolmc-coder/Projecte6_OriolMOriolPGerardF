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
      <h1>LA TEVA SELECCIÓ</h1>
      
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