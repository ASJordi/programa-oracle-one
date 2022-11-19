// Operadores de comparación
const ciudadDestino = 'Mexico';
const ciudadesDisponibles = ['Madrid', 'Barcelona', 'Londres', 'New York', 'Paris'];
const valorPasaje = 500;
let edadPasajero = 18;
let estaAcompaniado = false;

if(edadPasajero >= 18 || estaAcompaniado){
  if (ciudadesDisponibles.includes(ciudadDestino)){
    console.log('Puedes comprar el pasaje');
  } else{
    console.log('No se encuentra disponible el destino');
  }
} else{
  console.log('No puedes comprar el pasaje');
}

if(valorPasaje === 500) {
  console.log('El pasaje es igual a 500');
} else {
  console.log('El pasaje es diferente a 500');
}

// Operadores lógicos
// AND (&&) se cumple si todas las condiciones son verdaderas
// OR (||) se cumple si al menos una condición es verdadera
// NOT (!) se cumple si la condición es falsa