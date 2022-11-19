const ciudadesDisponibles = ['Madrid', 'Barcelona', 'Londres', 'New York', 'Paris'];
const precioPasaje = [200, 300, 400, 500, 600];
let presupuesto = 600;
let i = 0;

while (precioPasaje[i] > presupuesto && i < ciudadesDisponibles.length) {
  i++;
}

console.log(`Puedes viajar a ${ciudadesDisponibles[i]}`);