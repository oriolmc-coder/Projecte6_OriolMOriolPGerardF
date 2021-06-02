window.addEventListener("load", inici, false);

function inici(){
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            myFunction(this);
        }
    };
    xhttp.open("GET", "https://static-m.meteo.cat/content/opendata/ctermini_comarcal.xml", true);
    xhttp.send();
}

function myFunction(xml) {
    var xmlDoc = xml.responseXML;
    // NOMS ALT URGELL
    var nom = xmlDoc.getElementsByTagName("comarca")[3].getAttribute("nomCOMARCA");
    var capital = xmlDoc.getElementsByTagName("comarca")[3].getAttribute("nomCAPITALCO");

    // NOMS ALTA RIBAGORÇA
    var altariba = xmlDoc.getElementsByTagName("comarca")[4].getAttribute("nomCOMARCA");
    var altariba2 = xmlDoc.getElementsByTagName("comarca")[4].getAttribute("nomCAPITALCO");

    // NOMS CERDANYA
    var cerdanya = xmlDoc.getElementsByTagName("comarca")[14].getAttribute("nomCOMARCA");
    var cerdanya2 = xmlDoc.getElementsByTagName("comarca")[14].getAttribute("nomCAPITALCO");

    // NOMS PALLARS
    var pallars = xmlDoc.getElementsByTagName("comarca")[25].getAttribute("nomCOMARCA");
    var pallars2 = xmlDoc.getElementsByTagName("comarca")[25].getAttribute("nomCAPITALCO");

    // NOMS VALL ARAN
    var aran = xmlDoc.getElementsByTagName("comarca")[38].getAttribute("nomCOMARCA");
    var aran2 = xmlDoc.getElementsByTagName("comarca")[38].getAttribute("nomCAPITALCO");


    // DADES AL URGELL
    var prediccio = xmlDoc.getElementsByTagName("variable")[4].getAttribute("data");
    var prediccio3 = xmlDoc.getElementsByTagName("variable")[4].getAttribute("simbolmati");
    var prediccio11 = xmlDoc.getElementsByTagName("variable")[4].getAttribute("simboltarda");
    var prediccio4 = xmlDoc.getElementsByTagName("variable")[4].getAttribute("tempmax");
    var prediccio5 = xmlDoc.getElementsByTagName("variable")[4].getAttribute("tempmin");
    var prediccio6 = xmlDoc.getElementsByTagName("variable")[5].getAttribute("data");
    var prediccio8 = xmlDoc.getElementsByTagName("variable")[5].getAttribute("simbolmati");
    var prediccio12 = xmlDoc.getElementsByTagName("variable")[5].getAttribute("simboltarda");
    var prediccio9 = xmlDoc.getElementsByTagName("variable")[5].getAttribute("tempmax");
    var prediccio10 = xmlDoc.getElementsByTagName("variable")[5].getAttribute("tempmin");

    var prediccio13 = xmlDoc.getElementsByTagName("variable")[4].getAttribute("probcalamati");
    var prediccio14 = xmlDoc.getElementsByTagName("variable")[4].getAttribute("probcalatarda");

    var calamarsa = xmlDoc.getElementsByTagName("calamarsa");
    var nomprobcalamati, nomprobcalatarda;

    for(i = 0; i < calamarsa.length; i++){
        
        if(calamarsa[i].getAttribute("id")==prediccio13){
            nomprobcalamati = calamarsa[i].getAttribute("nomprobcalamati"); 
        }

        if(calamarsa[i].getAttribute("id")==prediccio14){
            nomprobcalatarda = calamarsa[i].getAttribute("nomprobcalatarda"); 
        }
        
    }


    var prediccio15 = xmlDoc.getElementsByTagName("variable")[5].getAttribute("probcalamati");
    var prediccio16 = xmlDoc.getElementsByTagName("variable")[5].getAttribute("probcalatarda");

    var calamarsa_d = xmlDoc.getElementsByTagName("calamarsa");
    var nomprobcalamati_d, nomprobcalatarda_d;

    for(i = 0; i < calamarsa_d.length; i++){
        
        if(calamarsa_d[i].getAttribute("id")==prediccio15){
            nomprobcalamati_d = calamarsa_d[i].getAttribute("nomprobcalamati"); 
        }

        if(calamarsa_d[i].getAttribute("id")==prediccio16){
            nomprobcalatarda_d = calamarsa_d[i].getAttribute("nomprobcalatarda"); 
        }
        
    }

    

    var prediccio18 = xmlDoc.getElementsByTagName("variable")[4].getAttribute("probprecipitaciomati");
    var prediccio19 = xmlDoc.getElementsByTagName("variable")[4].getAttribute("probprecipitaciotarda");

    var pluja = xmlDoc.getElementsByTagName("precipitacio");
    var nomprobprecipitaciomati, nomprobprecipitaciotarda;

    for(i = 0; i < pluja.length; i++){
        
        if(pluja[i].getAttribute("id")==prediccio18){
            nomprobprecipitaciomati = pluja[i].getAttribute("nomprobprecipitaciomati"); 
        }

        if(pluja[i].getAttribute("id")==prediccio19){
            nomprobprecipitaciotarda = pluja[i].getAttribute("nomprobprecipitaciotarda"); 
        }
        
    }

    var prediccio20 = xmlDoc.getElementsByTagName("variable")[5].getAttribute("probprecipitaciomati");
    var prediccio21 = xmlDoc.getElementsByTagName("variable")[5].getAttribute("probprecipitaciotarda");

    var pluja_d = xmlDoc.getElementsByTagName("precipitacio");
    var nomprobprecipitaciomati_d, nomprobprecipitaciotarda_d;

    for(i = 0; i < pluja_d.length; i++){
        
        if(pluja_d[i].getAttribute("id")==prediccio20){
            nomprobprecipitaciomati_d = pluja_d[i].getAttribute("nomprobprecipitaciomati"); 
        }

        if(pluja_d[i].getAttribute("id")==prediccio21){
            nomprobprecipitaciotarda_d = pluja_d[i].getAttribute("nomprobprecipitaciotarda"); 
        }
        
    }

    // DADES ALTA RIBAGORÇA
    var altariba3 = xmlDoc.getElementsByTagName("variable")[6].getAttribute("data");
    var altariba4 = xmlDoc.getElementsByTagName("variable")[6].getAttribute("simbolmati");
    var altariba12 = xmlDoc.getElementsByTagName("variable")[6].getAttribute("simboltarda");
    var altariba5 = xmlDoc.getElementsByTagName("variable")[6].getAttribute("tempmax");
    var altariba6 = xmlDoc.getElementsByTagName("variable")[6].getAttribute("tempmin");
    var altariba7 = xmlDoc.getElementsByTagName("variable")[7].getAttribute("data");
    var altariba8 = xmlDoc.getElementsByTagName("variable")[7].getAttribute("simbolmati");
    var altariba13 = xmlDoc.getElementsByTagName("variable")[7].getAttribute("simboltarda");
    var altariba9 = xmlDoc.getElementsByTagName("variable")[7].getAttribute("tempmax");
    var altariba10 = xmlDoc.getElementsByTagName("variable")[7].getAttribute("tempmin");


    var altariba14 = xmlDoc.getElementsByTagName("variable")[6].getAttribute("probcalamati");
    var altariba15 = xmlDoc.getElementsByTagName("variable")[6].getAttribute("probcalatarda");

    var calamarsa2 = xmlDoc.getElementsByTagName("calamarsa");
    var nomprobcalamati2, nomprobcalatarda2;

    for(i = 0; i < calamarsa2.length; i++){
        
        if(calamarsa2[i].getAttribute("id")==altariba14){
            nomprobcalamati2 = calamarsa2[i].getAttribute("nomprobcalamati"); 
        }

        if(calamarsa2[i].getAttribute("id")==altariba15){
            nomprobcalatarda2 = calamarsa2[i].getAttribute("nomprobcalatarda"); 
        }
        
    }


    var altariba16 = xmlDoc.getElementsByTagName("variable")[7].getAttribute("probcalamati");
    var altariba17 = xmlDoc.getElementsByTagName("variable")[7].getAttribute("probcalatarda");

    var calamarsa_d2 = xmlDoc.getElementsByTagName("calamarsa");
    var nomprobcalamati_d2, nomprobcalatarda_d2;

    for(i = 0; i < calamarsa_d2.length; i++){
        
        if(calamarsa_d[i].getAttribute("id")==altariba16){
            nomprobcalamati_d2 = calamarsa_d2[i].getAttribute("nomprobcalamati"); 
        }

        if(calamarsa_d[i].getAttribute("id")==altariba17){
            nomprobcalatarda_d2 = calamarsa_d2[i].getAttribute("nomprobcalatarda"); 
        }
        
    }

    

    var altariba18 = xmlDoc.getElementsByTagName("variable")[6].getAttribute("probprecipitaciomati");
    var altariba19 = xmlDoc.getElementsByTagName("variable")[6].getAttribute("probprecipitaciotarda");

    var pluja2 = xmlDoc.getElementsByTagName("precipitacio");
    var nomprobprecipitaciomati2, nomprobprecipitaciotarda2;

    for(i = 0; i < pluja2.length; i++){
        
        if(pluja2[i].getAttribute("id")==altariba18){
            nomprobprecipitaciomati2 = pluja2[i].getAttribute("nomprobprecipitaciomati"); 
        }

        if(pluja2[i].getAttribute("id")==altariba19){
            nomprobprecipitaciotarda2 = pluja2[i].getAttribute("nomprobprecipitaciotarda"); 
        }
        
    }

    var altariba20 = xmlDoc.getElementsByTagName("variable")[7].getAttribute("probprecipitaciomati");
    var altariba21 = xmlDoc.getElementsByTagName("variable")[7].getAttribute("probprecipitaciotarda");

    var pluja_d2 = xmlDoc.getElementsByTagName("precipitacio");
    var nomprobprecipitaciomati_d2, nomprobprecipitaciotarda_d2;

    for(i = 0; i < pluja_d2.length; i++){
        
        if(pluja_d2[i].getAttribute("id")==altariba20){
            nomprobprecipitaciomati_d2 = pluja_d2[i].getAttribute("nomprobprecipitaciomati"); 
        }

        if(pluja_d[i].getAttribute("id")==altariba21){
            nomprobprecipitaciotarda_d2 = pluja_d2[i].getAttribute("nomprobprecipitaciotarda"); 
        }
        
    }


    // DADES CERDANYA
    var cerdanya3 = xmlDoc.getElementsByTagName("variable")[24].getAttribute("data");
    var cerdanya4 = xmlDoc.getElementsByTagName("variable")[24].getAttribute("simbolmati");
    var cerdanya12 = xmlDoc.getElementsByTagName("variable")[24].getAttribute("simboltarda");
    var cerdanya5 = xmlDoc.getElementsByTagName("variable")[24].getAttribute("tempmax");
    var cerdanya6 = xmlDoc.getElementsByTagName("variable")[24].getAttribute("tempmin");
    var cerdanya7 = xmlDoc.getElementsByTagName("variable")[25].getAttribute("data");
    var cerdanya8 = xmlDoc.getElementsByTagName("variable")[25].getAttribute("simbolmati");
    var cerdanya13 = xmlDoc.getElementsByTagName("variable")[25].getAttribute("simboltarda");
    var cerdanya9 = xmlDoc.getElementsByTagName("variable")[25].getAttribute("tempmax");
    var cerdanya10 = xmlDoc.getElementsByTagName("variable")[25].getAttribute("tempmin");


    var cerdanya14 = xmlDoc.getElementsByTagName("variable")[24].getAttribute("probcalamati");
    var cerdanya15 = xmlDoc.getElementsByTagName("variable")[24].getAttribute("probcalatarda");

    var calamarsa3 = xmlDoc.getElementsByTagName("calamarsa");
    var nomprobcalamati3, nomprobcalatarda3;

    for(i = 0; i < calamarsa3.length; i++){
        
        if(calamarsa3[i].getAttribute("id")==cerdanya14){
            nomprobcalamati3 = calamarsa3[i].getAttribute("nomprobcalamati"); 
        }

        if(calamarsa3[i].getAttribute("id")==cerdanya15){
            nomprobcalatarda3 = calamarsa3[i].getAttribute("nomprobcalatarda"); 
        }
        
    }


    var cerdanya16 = xmlDoc.getElementsByTagName("variable")[25].getAttribute("probcalamati");
    var cerdanya17 = xmlDoc.getElementsByTagName("variable")[25].getAttribute("probcalatarda");

    var calamarsa_d3 = xmlDoc.getElementsByTagName("calamarsa");
    var nomprobcalamati_d3, nomprobcalatarda_d3;

    for(i = 0; i < calamarsa_d2.length; i++){
        
        if(calamarsa_d3[i].getAttribute("id")==cerdanya16){
            nomprobcalamati_d3 = calamarsa_d3[i].getAttribute("nomprobcalamati"); 
        }

        if(calamarsa_d3[i].getAttribute("id")==cerdanya17){
            nomprobcalatarda_d3 = calamarsa_d3[i].getAttribute("nomprobcalatarda"); 
        }
        
    }

    

    var cerdanya18 = xmlDoc.getElementsByTagName("variable")[24].getAttribute("probprecipitaciomati");
    var cerdanya19 = xmlDoc.getElementsByTagName("variable")[24].getAttribute("probprecipitaciotarda");

    var pluja3 = xmlDoc.getElementsByTagName("precipitacio");
    var nomprobprecipitaciomati3, nomprobprecipitaciotarda3;

    for(i = 0; i < pluja3.length; i++){
        
        if(pluja3[i].getAttribute("id")==cerdanya18){
            nomprobprecipitaciomati3 = pluja3[i].getAttribute("nomprobprecipitaciomati"); 
        }

        if(pluja3[i].getAttribute("id")==cerdanya19){
            nomprobprecipitaciotarda3 = pluja3[i].getAttribute("nomprobprecipitaciotarda"); 
        }
        
    }

    var cerdanya20 = xmlDoc.getElementsByTagName("variable")[25].getAttribute("probprecipitaciomati");
    var cerdanya21 = xmlDoc.getElementsByTagName("variable")[25].getAttribute("probprecipitaciotarda");

    var pluja_d3 = xmlDoc.getElementsByTagName("precipitacio");
    var nomprobprecipitaciomati_d3, nomprobprecipitaciotarda_d3;

    for(i = 0; i < pluja_d3.length; i++){
        
        if(pluja_d2[i].getAttribute("id")==cerdanya20){
            nomprobprecipitaciomati_d3 = pluja_d2[i].getAttribute("nomprobprecipitaciomati"); 
        }

        if(pluja_d[i].getAttribute("id")==cerdanya21){
            nomprobprecipitaciotarda_d3 = pluja_d3[i].getAttribute("nomprobprecipitaciotarda"); 
        }
        
    }



    // DADES PALLARS
    var pallars3 = xmlDoc.getElementsByTagName("variable")[46].getAttribute("data");
    var pallars4 = xmlDoc.getElementsByTagName("variable")[46].getAttribute("simbolmati");
    var pallars12 = xmlDoc.getElementsByTagName("variable")[46].getAttribute("simboltarda");
    var pallars5 = xmlDoc.getElementsByTagName("variable")[46].getAttribute("tempmax");
    var pallars6 = xmlDoc.getElementsByTagName("variable")[46].getAttribute("tempmin");
    var pallars7 = xmlDoc.getElementsByTagName("variable")[47].getAttribute("data");
    var pallars8 = xmlDoc.getElementsByTagName("variable")[47].getAttribute("simbolmati");
    var pallars13 = xmlDoc.getElementsByTagName("variable")[47].getAttribute("simboltarda");
    var pallars9 = xmlDoc.getElementsByTagName("variable")[47].getAttribute("tempmax");
    var pallars10 = xmlDoc.getElementsByTagName("variable")[47].getAttribute("tempmin");


    var pallars14 = xmlDoc.getElementsByTagName("variable")[46].getAttribute("probcalamati");
    var pallars15 = xmlDoc.getElementsByTagName("variable")[46].getAttribute("probcalatarda");

    var calamarsa4 = xmlDoc.getElementsByTagName("calamarsa");
    var nomprobcalamati4, nomprobcalatarda4;

    for(i = 0; i < calamarsa4.length; i++){
        
        if(calamarsa4[i].getAttribute("id")==pallars14){
            nomprobcalamati4 = calamarsa4[i].getAttribute("nomprobcalamati"); 
        }

        if(calamarsa4[i].getAttribute("id")==pallars15){
            nomprobcalatarda4 = calamarsa4[i].getAttribute("nomprobcalatarda"); 
        }
        
    }


    var pallars16 = xmlDoc.getElementsByTagName("variable")[25].getAttribute("probcalamati");
    var pallars17 = xmlDoc.getElementsByTagName("variable")[25].getAttribute("probcalatarda");

    var calamarsa_d4 = xmlDoc.getElementsByTagName("calamarsa");
    var nomprobcalamati_d4, nomprobcalatarda_d4;

    for(i = 0; i < calamarsa_d4.length; i++){
        
        if(calamarsa_d4[i].getAttribute("id")==pallars16){
            nomprobcalamati_d4 = calamarsa_d4[i].getAttribute("nomprobcalamati"); 
        }

        if(calamarsa_d4[i].getAttribute("id")==pallars17){
            nomprobcalatarda_d4 = calamarsa_d4[i].getAttribute("nomprobcalatarda"); 
        }
        
    }

    

    var pallars18 = xmlDoc.getElementsByTagName("variable")[46].getAttribute("probprecipitaciomati");
    var pallars19 = xmlDoc.getElementsByTagName("variable")[46].getAttribute("probprecipitaciotarda");

    var pluja4 = xmlDoc.getElementsByTagName("precipitacio");
    var nomprobprecipitaciomati4, nomprobprecipitaciotarda4;

    for(i = 0; i < pluja4.length; i++){
        
        if(pluja4[i].getAttribute("id")==pallars18){
            nomprobprecipitaciomati4 = pluja4[i].getAttribute("nomprobprecipitaciomati"); 
        }

        if(pluja4[i].getAttribute("id")==pallars19){
            nomprobprecipitaciotarda4 = pluja4[i].getAttribute("nomprobprecipitaciotarda"); 
        }
        
    }

    var pallars20 = xmlDoc.getElementsByTagName("variable")[47].getAttribute("probprecipitaciomati");
    var pallars21 = xmlDoc.getElementsByTagName("variable")[47].getAttribute("probprecipitaciotarda");

    var pluja_d4 = xmlDoc.getElementsByTagName("precipitacio");
    var nomprobprecipitaciomati_d4, nomprobprecipitaciotarda_d4;

    for(i = 0; i < pluja_d4.length; i++){
        
        if(pluja_d4[i].getAttribute("id")==pallars20){
            nomprobprecipitaciomati_d4 = pluja_d4[i].getAttribute("nomprobprecipitaciomati"); 
        }

        if(pluja_d4[i].getAttribute("id")==pallars21){
            nomprobprecipitaciotarda_d4 = pluja_d4[i].getAttribute("nomprobprecipitaciotarda"); 
        }
        
    }



    // DADES VALL ARAN
    var aran3 = xmlDoc.getElementsByTagName("variable")[72].getAttribute("data");
    var aran4 = xmlDoc.getElementsByTagName("variable")[72].getAttribute("simbolmati");
    var aran12 = xmlDoc.getElementsByTagName("variable")[72].getAttribute("simboltarda");
    var aran5 = xmlDoc.getElementsByTagName("variable")[72].getAttribute("tempmax");
    var aran6 = xmlDoc.getElementsByTagName("variable")[72].getAttribute("tempmin");
    var aran7 = xmlDoc.getElementsByTagName("variable")[73].getAttribute("data");
    var aran8 = xmlDoc.getElementsByTagName("variable")[73].getAttribute("simbolmati");
    var aran13 = xmlDoc.getElementsByTagName("variable")[73].getAttribute("simboltarda");
    var aran9 = xmlDoc.getElementsByTagName("variable")[73].getAttribute("tempmax");
    var aran10 = xmlDoc.getElementsByTagName("variable")[73].getAttribute("tempmin");


    var aran14 = xmlDoc.getElementsByTagName("variable")[72].getAttribute("probcalamati");
    var aran15 = xmlDoc.getElementsByTagName("variable")[72].getAttribute("probcalatarda");

    var calamarsa5 = xmlDoc.getElementsByTagName("calamarsa");
    var nomprobcalamati5, nomprobcalatarda5;

    for(i = 0; i < calamarsa5.length; i++){
        
        if(calamarsa5[i].getAttribute("id")==aran14){
            nomprobcalamati5 = calamarsa5[i].getAttribute("nomprobcalamati"); 
        }

        if(calamarsa5[i].getAttribute("id")==aran15){
            nomprobcalatarda5 = calamarsa5[i].getAttribute("nomprobcalatarda"); 
        }
        
    }


    var aran16 = xmlDoc.getElementsByTagName("variable")[73].getAttribute("probcalamati");
    var aran17 = xmlDoc.getElementsByTagName("variable")[73].getAttribute("probcalatarda");

    var calamarsa_d5 = xmlDoc.getElementsByTagName("calamarsa");
    var nomprobcalamati_d5, nomprobcalatarda_d5;

    for(i = 0; i < calamarsa_d5.length; i++){
        
        if(calamarsa_d5[i].getAttribute("id")==aran16){
            nomprobcalamati_d5 = calamarsa_d5[i].getAttribute("nomprobcalamati"); 
        }

        if(calamarsa_d5[i].getAttribute("id")==aran17){
            nomprobcalatarda_d5 = calamarsa_d5[i].getAttribute("nomprobcalatarda"); 
        }
        
    }

    

    var aran18 = xmlDoc.getElementsByTagName("variable")[72].getAttribute("probprecipitaciomati");
    var aran19 = xmlDoc.getElementsByTagName("variable")[72].getAttribute("probprecipitaciotarda");

    var pluja5 = xmlDoc.getElementsByTagName("precipitacio");
    var nomprobprecipitaciomati5, nomprobprecipitaciotarda5;

    for(i = 0; i < pluja5.length; i++){
        
        if(pluja5[i].getAttribute("id")==aran18){
            nomprobprecipitaciomati5 = pluja5[i].getAttribute("nomprobprecipitaciomati"); 
        }

        if(pluja5[i].getAttribute("id")==aran19){
            nomprobprecipitaciotarda5 = pluja5[i].getAttribute("nomprobprecipitaciotarda"); 
        }
        
    }

    var aran20 = xmlDoc.getElementsByTagName("variable")[73].getAttribute("probprecipitaciomati");
    var aran21 = xmlDoc.getElementsByTagName("variable")[73].getAttribute("probprecipitaciotarda");

    var pluja_d5 = xmlDoc.getElementsByTagName("precipitacio");
    var nomprobprecipitaciomati_d5, nomprobprecipitaciotarda_d5;

    for(i = 0; i < pluja_d5.length; i++){
        
        if(pluja_d5[i].getAttribute("id")==aran20){
            nomprobprecipitaciomati_d5 = pluja_d5[i].getAttribute("nomprobprecipitaciomati"); 
        }

        if(pluja_d5[i].getAttribute("id")==aran21){
            nomprobprecipitaciotarda_d5 = pluja_d5[i].getAttribute("nomprobprecipitaciotarda"); 
        }
        
    }

    

    // IMPRIMIR ALT URGELL
    document.getElementById("demo2").innerHTML = capital + ", " + nom;
    document.getElementById("demo4").innerHTML = "<strong>Avui:</strong><br />" + prediccio;
    document.getElementById("demo6").innerHTML = "<div class='temperatura'><div class='maxima'>" + prediccio4 + "ºC</div>&nbsp;<div class='minima'>" + prediccio5 + "ºC</div></div>";
    document.getElementById("demo7").innerHTML = "<img title='Matí' src='https://static-m.meteo.cat/assets-w3/images/meteors/estatcel/"+ prediccio3 + "'/><img title='Tarda' src='https://static-m.meteo.cat/assets-w3/images/meteors/estatcel/"+ prediccio11 + "'/>";
    document.getElementById("demo9").innerHTML = "<strong>Demà:</strong><br />" + prediccio6;
    document.getElementById("demo10").innerHTML = "<div class='temperatura'><div class='maxima'>" + prediccio9 + "ºC</div>&nbsp;<div class='minima'>" + prediccio10 + "ºC</div></div>";
    document.getElementById("demo11").innerHTML = "<img title='Matí' src='https://static-m.meteo.cat/assets-w3/images/meteors/estatcel/"+ prediccio8 + "'/><img title='Tarda' src='https://static-m.meteo.cat/assets-w3/images/meteors/estatcel/"+ prediccio12 + "'/>";
    document.getElementById("demo12").innerHTML = "<strong>Calamarsa</strong><br /><br /><div class='pluges'><img src='./media/cala.gif' style='width: 50px;'/>&nbsp;Matí: " + nomprobcalamati + "<br />&nbsp;Tarda: " + nomprobcalatarda+"</div>";
    document.getElementById("demo13").innerHTML = "<strong>Calamarsa</strong><br /><br /><div class='pluges'><img src='./media/cala.gif' style='width: 50px;'/>&nbsp;Matí: " + nomprobcalamati_d + "<br />&nbsp;Tarda: " + nomprobcalatarda_d +"</div>";
    document.getElementById("demo14").innerHTML = "<strong>Precipitació</strong><br /><br /><div class='pluges'><img src='./media/pluja.gif' style='width: 50px;'/>&nbsp;Matí: " + nomprobprecipitaciomati + "<br />&nbsp;Tarda: " + nomprobprecipitaciotarda +"</div>";
    document.getElementById("demo15").innerHTML = "<strong>Precipitacio</strong><br /><br /><div class='pluges'><img src='./media/pluja.gif' style='width: 50px;'/>&nbsp;Matí: " + nomprobprecipitaciomati_d + "<br />&nbsp;Tarda: " + nomprobprecipitaciotarda_d +"</div>";


    // IMPRIMIR ALTA RIBAGORÇA
    document.getElementById("demo30").innerHTML = altariba2 + ", " + altariba;
    document.getElementById("demo31").innerHTML = "<strong>Avui:</strong><br />" + altariba3;
    document.getElementById("demo32").innerHTML = "<div class='temperatura'><div class='maxima'>" + altariba5 + "ºC</div>&nbsp;<div class='minima'>" + altariba6 + "ºC</div></div>";
    document.getElementById("demo33").innerHTML = "<img title='Matí' src='https://static-m.meteo.cat/assets-w3/images/meteors/estatcel/"+ altariba4 + "'/><img title='Tarda' src='https://static-m.meteo.cat/assets-w3/images/meteors/estatcel/"+ altariba12 + "'/>";
    document.getElementById("demo34").innerHTML = "<strong>Demà:</strong><br />" + altariba7;
    document.getElementById("demo35").innerHTML = "<div class='temperatura'><div class='maxima'>" + altariba9 + "ºC</div>&nbsp;<div class='minima'>" + altariba10 + "ºC</div></div>";
    document.getElementById("demo36").innerHTML = "<img title='Matí' src='https://static-m.meteo.cat/assets-w3/images/meteors/estatcel/"+ altariba8 + "'/><img title='Tarda' src='https://static-m.meteo.cat/assets-w3/images/meteors/estatcel/"+ altariba13 + "'/>";
    document.getElementById("demo37").innerHTML = "<strong>Calamarsa</strong><br /><br /><div class='pluges'><img src='./media/cala.gif' style='width: 50px;'/>&nbsp;Matí: " + nomprobcalamati2 + "<br />&nbsp;Tarda: " + nomprobcalatarda2+"</div>";
    document.getElementById("demo38").innerHTML = "<strong>Calamarsa</strong><br /><br /><div class='pluges'><img src='./media/cala.gif' style='width: 50px;'/>&nbsp;Matí: " + nomprobcalamati_d2 + "<br />&nbsp;Tarda: " + nomprobcalatarda_d2+"</div>";
    document.getElementById("demo39").innerHTML = "<strong>Precipitació</strong><br /><br /><div class='pluges'><img src='./media/pluja.gif' style='width: 50px;'/>&nbsp;Matí: " + nomprobprecipitaciomati2 + "<br />&nbsp;Tarda: " +nomprobprecipitaciotarda2+"</div>";
    document.getElementById("demo399").innerHTML = "<strong>Precipitacio</strong><br /><br /><div class='pluges'><img src='./media/pluja.gif' style='width: 50px;'/>&nbsp;Matí: " + nomprobprecipitaciomati_d2 + "<br />&nbsp;Tarda: " +nomprobprecipitaciotarda_d2+"</div>";


    // IMPRIMIR CERDANYA
    document.getElementById("demo40").innerHTML = cerdanya2 + ", " + cerdanya;
    document.getElementById("demo41").innerHTML = "<strong>Avui:</strong><br />" + cerdanya3;
    document.getElementById("demo42").innerHTML = "<div class='temperatura'><div class='maxima'>" + cerdanya5 + "ºC</div>&nbsp;<div class='minima'>" + cerdanya6 + "ºC</div></div>";
    document.getElementById("demo43").innerHTML = "<img title='Matí' src='https://static-m.meteo.cat/assets-w3/images/meteors/estatcel/"+ cerdanya4 + "'/><img title='Tarda' src='https://static-m.meteo.cat/assets-w3/images/meteors/estatcel/"+ cerdanya12 + "'/>";
    document.getElementById("demo44").innerHTML = "<strong>Demà:</strong><br />" + cerdanya7;
    document.getElementById("demo45").innerHTML = "<div class='temperatura'><div class='maxima'>" + cerdanya9 + "ºC</div>&nbsp;<div class='minima'>" + cerdanya10 + "ºC</div></div>";
    document.getElementById("demo46").innerHTML = "<img title='Matí' src='https://static-m.meteo.cat/assets-w3/images/meteors/estatcel/"+ cerdanya8 + "'/><img title='Tarda' src='https://static-m.meteo.cat/assets-w3/images/meteors/estatcel/"+ cerdanya13 + "'/>";
    document.getElementById("demo47").innerHTML = "<strong>Calamarsa</strong><br /><br /><div class='pluges'><img src='./media/cala.gif' style='width: 50px;'/>&nbsp;Matí: " + nomprobcalamati3 + "<br />&nbsp;Tarda: " +nomprobcalatarda3+"</div>";
    document.getElementById("demo48").innerHTML = "<strong>Calamarsa</strong><br /><br /><div class='pluges'><img src='./media/cala.gif' style='width: 50px;'/>&nbsp;Matí: " + nomprobcalamati_d3 + "<br />&nbsp;Tarda: " +nomprobcalatarda_d3+"</div>";
    document.getElementById("demo49").innerHTML = "<strong>Precipitació</strong><br /><br /><div class='pluges'><img src='./media/pluja.gif' style='width: 50px;'/>&nbsp;Matí: " + nomprobprecipitaciomati3 + "<br />&nbsp;Tarda: " +nomprobprecipitaciotarda3+"</div>";
    document.getElementById("demo499").innerHTML = "<strong>Precipitacio</strong><br /><br /><div class='pluges'><img src='./media/pluja.gif' style='width: 50px;'/>&nbsp;Matí: " + nomprobprecipitaciomati_d3 + "<br />&nbsp;Tarda: " +nomprobprecipitaciotarda_d3+"</div>";


    // IMPRIMIR PALLARS
    document.getElementById("demo50").innerHTML = pallars2 + ", " + pallars;
    document.getElementById("demo51").innerHTML = "<strong>Avui:</strong><br />" + pallars3;
    document.getElementById("demo52").innerHTML = "<div class='temperatura'><div class='maxima'>" + pallars5 + "ºC</div>&nbsp;<div class='minima'>" + pallars6 + "ºC</div></div>";
    document.getElementById("demo53").innerHTML = "<img title='Matí' src='https://static-m.meteo.cat/assets-w3/images/meteors/estatcel/"+ pallars4 + "'/><img title='Tarda' src='https://static-m.meteo.cat/assets-w3/images/meteors/estatcel/"+ pallars12 + "'/>";
    document.getElementById("demo54").innerHTML = "<strong>Demà:</strong><br />" +pallars7;
    document.getElementById("demo55").innerHTML = "<div class='temperatura'><div class='maxima'>" + pallars9 + "ºC</div>&nbsp;<div class='minima'>" + pallars10 + "ºC</div></div>";
    document.getElementById("demo56").innerHTML = "<img title='Matí' src='https://static-m.meteo.cat/assets-w3/images/meteors/estatcel/"+ pallars8 + "'/><img title='Tarda' src='https://static-m.meteo.cat/assets-w3/images/meteors/estatcel/"+ pallars13 + "'/>";
    document.getElementById("demo57").innerHTML = "<strong>Calamarsa</strong><br /><br /><div class='pluges'><img src='./media/cala.gif' style='width: 50px;'/>&nbsp;Matí: " + nomprobcalamati4 + "<br />&nbsp;Tarda: " +nomprobcalatarda4+"</div>";
    document.getElementById("demo58").innerHTML = "<strong>Calamarsa</strong><br /><br /><div class='pluges'><img src='./media/cala.gif' style='width: 50px;'/>&nbsp;Matí: " + nomprobcalamati_d4 + "<br />&nbsp;Tarda: " +nomprobcalatarda_d4+"</div>";
    document.getElementById("demo59").innerHTML = "<strong>Precipitació</strong><br /><br /><div class='pluges'><img src='./media/pluja.gif' style='width: 50px;'/>&nbsp;Matí: " + nomprobprecipitaciomati4 + "<br />&nbsp;Tarda: " +nomprobprecipitaciotarda4+"</div>";
    document.getElementById("demo599").innerHTML = "<strong>Precipitacio</strong><br /><br /><div class='pluges'><img src='./media/pluja.gif' style='width: 50px;'/>&nbsp;Matí: " + nomprobprecipitaciomati_d4 + "<br />&nbsp;Tarda: " +nomprobprecipitaciotarda_d4+"</div>";


    // IMPRIMIR VALL ARAN
    document.getElementById("demo60").innerHTML = aran2 + ", " + aran;
    document.getElementById("demo61").innerHTML = "<strong>Avui:</strong><br />" + aran3;
    document.getElementById("demo62").innerHTML = "<div class='temperatura'><div class='maxima'>" + aran5 + "ºC</div>&nbsp;<div class='minima'>" + aran6 + "ºC</div></div>";
    document.getElementById("demo63").innerHTML = "<img title='Matí' src='https://static-m.meteo.cat/assets-w3/images/meteors/estatcel/"+ aran4 + "'/><img title='Tarda' src='https://static-m.meteo.cat/assets-w3/images/meteors/estatcel/"+ aran12 + "'/>";
    document.getElementById("demo64").innerHTML = "<strong>Demà:</strong><br />" +aran7;
    document.getElementById("demo65").innerHTML = "<div class='temperatura'><div class='maxima'>" + aran9 + "ºC</div>&nbsp;<div class='minima'>" + aran10 + "ºC</div></div>";
    document.getElementById("demo66").innerHTML = "<img title='Matí' src='https://static-m.meteo.cat/assets-w3/images/meteors/estatcel/"+ aran8 + "'/><img title='Tarda' src='https://static-m.meteo.cat/assets-w3/images/meteors/estatcel/"+ aran13 + "'/>";
    document.getElementById("demo67").innerHTML = "<strong>Calamarsa</strong><br /><br /><div class='pluges'><img src='./media/cala.gif' style='width: 50px;'/>&nbsp;Matí: " + nomprobcalamati5 + "<br />&nbsp;Tarda: " +nomprobcalatarda5+"</div>";
    document.getElementById("demo68").innerHTML = "<strong>Calamarsa</strong><br /><br /><div class='pluges'><img src='./media/cala.gif' style='width: 50px;'/>&nbsp;Matí: " + nomprobcalamati_d5 + "<br />&nbsp;Tarda: " +nomprobcalatarda_d5+"</div>";  
    document.getElementById("demo69").innerHTML = "<strong>Precipitació</strong><br /><br /><div class='pluges'><img src='./media/pluja.gif' style='width: 50px;'/>&nbsp;Matí: " + nomprobprecipitaciomati5 + "<br />&nbsp;Tarda: " +nomprobprecipitaciotarda5+"</div>";
    document.getElementById("demo699").innerHTML = "<strong>Precipitacio</strong><br /><br /><div class='pluges'><img src='./media/pluja.gif' style='width: 50px;'/>&nbsp;Matí: " + nomprobprecipitaciomati_d5 + "<br />&nbsp;Tarda: " +nomprobprecipitaciotarda_d5+"</div>";

}
