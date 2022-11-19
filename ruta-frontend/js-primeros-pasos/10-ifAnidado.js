// Operadores de comparación
const ciudadDestino = 'Mexico';
const ciudadesDisponibles = ['Madrid', 'Barcelona', 'Londres', 'New York', 'Paris'];
const valorPasaje = 500;
let edadPasajero = 18;
let estaAcompaniado = false;

console.log(`Verificando destino ${ciudadDestino}...`);
if(edadPasajero >= 18 || estaAcompaniado){
  if (ciudadesDisponibles.includes(ciudadDestino)){
    console.log('Puedes comprar el pasaje');
  } else{
    console.log('No se encuentra disponible el destino');
  }
} else{
  console.log('No puedes comprar el pasaje');
}