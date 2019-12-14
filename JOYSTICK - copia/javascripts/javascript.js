

    /* implementa un interruptor o toggle que a cada click
    pasa de un estado responsive (botones desplegado) a
    otro topnav a secas (botones plegados) */
    function myFunction() {
    var x = document.getElementById("myTopnav");
    if (x.className === "topnav") {
        x.className += " responsive";
    } else {
        x.className = "topnav";
    }
    }
