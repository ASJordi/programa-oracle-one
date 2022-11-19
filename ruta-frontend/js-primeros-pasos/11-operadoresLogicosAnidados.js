// Operadores de comparación
const ciudadDestino = 'Mexico';
const ciudadesDisponibles = ['Madrid', 'Barcelona', 'Londres', 'New York', 'Paris'];
let edadPasajero = 18;
let estaAcompaniado = false;
tienePasaporte = true;

if(ciudadesDisponibles.includes(ciudadDestino) && edadPasajero >= 18 || estaAcompaniado && tienePasaporte){
  console.log('Puedes viajar');
} else{
  console.log('No puedes viajar');
}