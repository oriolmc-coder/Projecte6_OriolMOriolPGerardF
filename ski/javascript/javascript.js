window.addEventListener("load", filtres, false);


function comandes(){
   if(!isset($_SESSION['first_load'])){
      document.getElementsByClassName("comandes").style.display = "block";
   }
}

function filtres() {
	var x = document.getElementById("mobil-menu");
    if (x.style.display === "none") {
      x.style.display = "block";
    } else {
      x.style.display = "none";
    }
}

function amagar() {
  var x = document.getElementById("myDIV");
  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}

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