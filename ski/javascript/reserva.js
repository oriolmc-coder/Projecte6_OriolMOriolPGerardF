window.addEventListener("load", getValue, false);
function getValue(){
    console.log("Prova");
    document.getElementById("reserva-final").innerHTML = "";
    for (i = 0; i < localStorage.length; i++){
        clau = localStorage.key(i);

        text = localStorage.getItem(clau);
        obj = JSON.parse(text);

        document.getElementById("reserva-final").innerHTML +=
                                                      "<div class='final col-xs-12 col-md-6'>"+
                                                      "<br>"+
                                                      "<img src='./media/" + obj.imatge + "' />"+
                                                      "<h2 class='nom2'>Nom: " + obj.nom + "</h2>"+
                                                      "<h3 class='ciutat2'>" + obj.talla + "</h3>"+
                                                      "<p class='preu2'>Preu: " + obj.preu + "</p>"+
                                                      "<br>"+
                                                      "<a href='javascript:void(0)' class='borrarp' onclick='esborrar(\""+clau+"\");'>X Eliminar</a>"+
                                                      "<br>"+
                                                      "<br>"+
                                                      "<hr>"+
                                                      "</div>";

    }
}