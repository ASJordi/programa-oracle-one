let canvas = document.getElementById('canvas');
let ctx = canvas.getContext('2d');

ctx.fillStyle = 'gray';
ctx.fillRect(0, 0, canvas.width, canvas.height);

let puedoDibujar = false;
let xBtnRojo = 0;
let xBtnVerde = 50;
let xBtnAzul = 100;
let xBtnLimpiar = 150;
let yBtn = 0;
let sizeBtn = 50;
let color = 'blue';

function dibujarCirculo(x, y, color){
    if(puedoDibujar){
        ctx.fillStyle = color;
        ctx.beginPath();
        ctx.arc(x, y, 10, 0, 2 * Math.PI);
        ctx.fill();
    }
}

function dibujarBoton(x, y, ancho, alto, color) {

    ctx.fillStyle = color;
    ctx.fillRect(x, y, ancho, alto);
    ctx.fill();
}

function habilitarDibujo(){
    puedoDibujar = true;
}

function deshabilitarDibujo(){
    puedoDibujar = false;
}

function limpiarCanvas(){
    ctx.fillStyle = 'gray';
    ctx.fillRect(0, 0, canvas.width, canvas.height);

}

function escribirTexto(x, y, msg, color){
    ctx.font = "15px Arial";
    ctx.fillStyle = color;
    ctx.fillText(msg, x, y);
}

function dibujarPaletaColores(){
    dibujarBoton(xBtnRojo, yBtn, sizeBtn, sizeBtn, 'red');
    dibujarBoton(xBtnVerde, yBtn, sizeBtn, sizeBtn, 'green');
    dibujarBoton(xBtnAzul, yBtn, sizeBtn, sizeBtn, 'blue');
    dibujarBoton(xBtnLimpiar, yBtn, sizeBtn, sizeBtn, 'white');
    escribirTexto(xBtnLimpiar, 30, 'Limpiar', 'black');
}

//funcion para delimitar el area de dibujo
function delimitarAreaDibujo(xCoordenada, yCoordenada)
{
    if ((xCoordenada >= 0) && (xCoordenada < (4*sizeBtn+5)) && 
        (yCoordenada >=0) && (yCoordenada < (sizeBtn+5))) {

        return false;
    }
    else
    {
        return true;
    }
}

function capturarMovimientoMouse(evento){
    var x = evento.pageX - canvas.offsetLeft;
    var y = evento.pageY - canvas.offsetTop;
    if(delimitarAreaDibujo(x, y)){
        dibujarCirculo(x, y, color);
    }
}

function seleccionarColor(evento)
{
    var x = evento.pageX - canvas.offsetLeft;
    var y = evento.pageY - canvas.offsetTop;

    //Cada condición altera el color de la variable colorActual

    //Comenzamos por la condición del eje Y que es común para todas


    if ((y > yBtn) && (y < (yBtn + sizeBtn))) 
    {

        if((x > xBtnRojo) && (x < (xBtnRojo + sizeBtn))) 
        {
            color = "red";
            console.log(color);

        } 
        else if ((x > xBtnVerde) && (x < (xBtnVerde + sizeBtn))) 
        {
            color = "green";
            console.log(color);
        } 
        else if((x > xBtnAzul) && (x < (xBtnAzul + sizeBtn))) 
        {
            color = "blue";
            console.log(color);
        }  
        else if((x > xBtnLimpiar) && (x < (xBtnLimpiar + sizeBtn))) 
        {
            limpiarCanvas();
            dibujarPaletaColores();
        }          
    }
}


// Evento para dibujar con el mouse
canvas.onmousemove = capturarMovimientoMouse;

//Eventos para activar o desactivar el dibujado
canvas.onmousedown = habilitarDibujo;
canvas.onmouseup = deshabilitarDibujo;

// Dibujar paleta de colores
dibujarPaletaColores();

canvas.onclick = seleccionarColor;