<!DOCTYPE html>
<html lang="ca">
  <head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.10.2/css/all.css">
    <script src="https://kit.fontawesome.com/yourcode.js" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="./javascript/javascript.js"></script>
    <script>
    $(document).ready(function(){
      $("#myInput").on("keyup", function() {
        var value = $(this).val().toLowerCase();
        $("#myList .producte1").filter(function() {
          $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
        });
      });
    });
    </script>
    <link rel="stylesheet" href="./css/styles.css" />  
    <title>Ski World - Lloguer d'equips d'esquí</title>
  </head>
  <body class="page-4">
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
      <h1>EQUIPAMENT VARIAT</h1>
      <label>Filtra per material: </label><input id="myInput" type="text" placeholder="Esquis, casc, botes..">
      <br />
<div class="filterBtns">
<button class="btn active" onclick="filterSelection('all')">Tots</button>
<button class="btn" onclick="filterSelection('esquis')">Esquis</button>
<button class="btn" onclick="filterSelection('roba')">Roba</button>
<button class="btn" onclick="filterSelection('botes')">Botes</button>
<button class="btn" onclick="filterSelection('cascs')">Cascs</button>
</div>
      <section id="myList" class="material results">
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

            $sql = "SELECT * FROM roba";
            $result = $conn->query($sql);

            if ($result->num_rows > 0) {
                // output data of each row
                while($row = $result->fetch_assoc()) {
                    echo "<div id='roba' class='producte1 roba filterElements'><br><img style='width: 72%;' src='".$row['imatge']."' /> <br> <strong>". $row["marca"]. " </strong><br> <strong>Ref.:</strong>" . $row["id_roba"]. " <br>  <strong>Preu: </strong>" .$row["preu"] ."€ <br><br></div> ";
                }
            } else {
                echo "0 results";
            }

            $conn->close();
            ?>
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

            $sql = "SELECT * FROM esquis";
            $result = $conn->query($sql);

            if ($result->num_rows > 0) {
                // output data of each row
                while($row = $result->fetch_assoc()) {
                    echo "<div id='esquis' class='producte1 esquis filterElements'><br><img style='width: 72%;' src='".$row['imatge']."' /> <br> <strong>". $row["marca"]. " </strong><br> <strong>Ref.:</strong>" . $row["id_esqui"]. " <br>  <strong>Preu: </strong>" .$row["preu"] ."€ <br><br></div> ";
                }
            } else {
                echo "0 results";
            }

            $conn->close();
            ?>
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

            $sql = "SELECT * FROM cascs";
            $result = $conn->query($sql);

            if ($result->num_rows > 0) {
                // output data of each row
                while($row = $result->fetch_assoc()) {
                    echo "<div id='cascs' class='producte1 cascs filterElements'><br><img style='width: 72%;' src='".$row['imatge']."' /> <br> <strong>". $row["marca"]. " </strong><br> <strong>Ref.:</strong>" . $row["id_casc"]. " <br>  <strong>Preu: </strong>" .$row["preu"] ."€ <br><br></div> ";
                }
            } else {
                echo "0 results";
            }

            $conn->close();
            ?>
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

            $sql = "SELECT * FROM botes";
            $result = $conn->query($sql);

            if ($result->num_rows > 0) {
                // output data of each row
                while($row = $result->fetch_assoc()) {
                    echo "<div id='botes' class='producte1 botes filterElements'><br><img style='width: 72%;' src='".$row['imatge']."' /> <br> <strong>". $row["marca"]. " </strong><br> <strong>Ref.:</strong>" . $row["id_bota"]. " <br>  <strong>Preu: </strong>" .$row["preu"] ."€ <br><br></div> ";
                }
            } else {
                echo "0 results";
            }

            $conn->close();
            ?>
      </section>
        <script>
         filterSelection("all");
   function filterSelection(c) {
      var x, i;
      x = document.querySelectorAll(".filterElements");
      if (c == "all") c = "";
      Array.from(x).forEach(item => {
         removeActiveClass(item, "show");
         if (item.className.indexOf(c) > -1) addActiveClass(item, "show");
      });
   }
   function addActiveClass(ele, name) {
      var i, arr1, arr2;
      arr1 = ele.className.split(" ");
      arr2 = name.split(" ");
      for (i = 0; i < arr2.length; i++) {
         if (arr1.indexOf(arr2[i]) == -1) {
            ele.className += " " + arr2[i];
         }
      }
   }
   function removeActiveClass(ele, name) {
      var i, arr1, arr2;
      arr1 = ele.className.split(" ");
      arr2 = name.split(" ");
      for (i = 0; i < arr2.length; i++) {
         while (arr1.indexOf(arr2[i]) > -1) {
            arr1.splice(arr1.indexOf(arr2[i]), 1);
         }
      }
      ele.className = arr1.join(" ");
   }
   var filterBtns = document.querySelector(".filterBtns");
   var btns = filterBtns.getElementsByTagName("button");
   for (var i = 0; i < btns.length; i++) {
      btns[i].addEventListener("click", function() {
         var current = document.getElementsByClassName("active");
         current[0].className = current[0].className.replace(" active", "");
         this.className += " active";
      });
   }
        </script>  
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