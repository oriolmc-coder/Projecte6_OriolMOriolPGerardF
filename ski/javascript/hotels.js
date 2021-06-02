window.addEventListener("load", inici, false);

function inici() {


    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            lecturaXML(this);
        }
    };
    xhttp.open("GET", "./xml/esquis.xml", true);
    xhttp.send();
}



function lecturaXML(xml) {

    var xmlDoc = xml.responseXML;

    var seccio = document.getElementsByTagName("section")[0];

    for (var i = 0; i < xmlDoc.getElementsByTagName("esqui").length; i++) {

        nom = xmlDoc.getElementsByTagName("nom")[i].childNodes[0].nodeValue;

        talla = xmlDoc.getElementsByTagName("talla")[i].childNodes[0].nodeValue;

        preu = xmlDoc.getElementsByTagName("preu")[i].childNodes[0].nodeValue;

        imatge = xmlDoc.getElementsByTagName("imatge")[i].childNodes[0].nodeValue;

        seccio.innerHTML += "<div class='producte fade-in'>" +
            "<img src= './media/" + imatge + "'alt='imatge'/>" +
            "<div class='dades'>" +
            "<h2 class='nom'>" + nom + "</h2>" +
            "<h3 class='duresa'>Talla: " + talla + "</h3>" +
            "<p class='preu'>" + preu + "€</p>" +
            "</div>" +
            "<a href='#' class='registrar'>Reservar</a>" +
            "</div>";

    }

    inici2();

}

function inici2(){
                
    var registre = document.getElementsByClassName("registrar");
    
    for(i=0; i< registre.length; i++){
        console.log("funcio1"+i);
        registre[i].addEventListener("click", function(e){
            
            e.preventDefault();
            
            //imatge = e.target.parentElement.getElementsByClassName("producte")[0].getElementsByTagName("img")[0].srcContent;
            
            nom = e.target.parentElement.getElementsByClassName("dades")[0].getElementsByTagName("h2")[0].textContent;
            
            talla = e.target.parentElement.getElementsByClassName("dades")[0].getElementsByTagName("h3")[0].textContent;
            
            preu = e.target.parentElement.getElementsByClassName("dades")[0].getElementsByTagName("p")[0].textContent;
            
            
            grabarDades(imatge, nom, talla, preu);

            
        }, false);
    }
}

function grabarDades(imatge, nom, talla, preu){
    console.log("funcio");
    clau = localStorage.length + 1;

    // Storing data:
    myObj = {
        imatge: imatge,
        nom: nom,
        talla: talla,
        preu: preu
    };



    myJSON = JSON.stringify(myObj);
    localStorage.setItem(clau, myJSON);

    getValue();

}

function getValue(){
    console.log("Prova");
    document.getElementById("myDIV").innerHTML = "";
    for (i = 0; i < localStorage.length; i++){
        clau = localStorage.key(i);

        text = localStorage.getItem(clau);
        obj = JSON.parse(text);

        document.getElementById("myDIV").innerHTML +=
                                                      "<br>"+
                                                      "<img src='./media/" + obj.imatge + "' />"+
                                                      "<h2 class='nom2'>Nom: " + obj.nom + "</h2>"+
                                                      "<h3 class='ciutat2'>" + obj.talla + "</h3>"+
                                                      "<p class='preu2'>Preu: " + obj.preu + "</p>"+
                                                      "<br>"+
                                                      "<a href='javascript:void(0)' class='borrarp' onclick='esborrar(\""+clau+"\");'>X Eliminar</a>"+
                                                      "<br>"+
                                                      "<br>"+
                                                      "<hr>";

    }
    // for (i = 0; i < localStorage.length; i++){
    // if (typeof(Storage) !== "undefined") {
    // // Retrieve
    // document.getElementById("myDIV").innerHTML = "<table class='taula-cistella' border='4'>"+
    //                                                 "<tbody>"+
    //                                                 "<tr>"+
    //                                                 "<th style='width: 7%'>ID Producte</th>"+
    //                                                 "<th style='width: 16%'>Nom</th>"+
    //                                                 "<th style='width: 3%'>Ciutat</th>"+
    //                                                 "<th style='width: 2%'>Preu</th>"+
    //                                                 "</tr>"+
    //                                                 "<tr>"+
    //                                                 "<td>"+JSON.parse(localStorage.getItem(localStorage.key(i))).ref+"</td>"+
    //                                                 "<td>"+JSON.parse(localStorage.getItem(localStorage.key(i))).nom+"</td>"+
    //                                                 "<td>"+JSON.parse(localStorage.getItem(localStorage.key(i))).ciutat+"</td>"+
    //                                                 "<td>"+JSON.parse(localStorage.getItem(localStorage.key(i))).preu+" €</td>"+
    //                                                 "</tr>"+
    //                                                 "</tbody>"+
    //                                              "</table>"+
    //                                              "<button class='boto-cistella' onclick='javascript:window.localStorage.clear();'>Borrar productes</button>&nbsp;&nbsp;<a class='boto-cistella2' href='confirmar.php'>Finalitzar comanda</a>&nbsp;&nbsp; <button class='boto-cistella' onclick='getValue()'>Recarregar cistella</button>";
    // } else {
    //     document.getElementById("myDIV").innerHTML = "Sorry, your browser does not support Web Storage...";
    //     }
    // }
}

function esborrar(clau){
    if(confirm("Estas segur que vols eliminar el registre?")){
        localStorage.removeItem(clau);

        getValue();  
    }
}