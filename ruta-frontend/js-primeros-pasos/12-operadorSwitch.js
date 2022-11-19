const ciudadDestino = 'Mexico';
const ciudadesDisponibles = ['Madrid', 'Barcelona', 'Londres', 'New York', 'Paris'];
let valorPasaje = 0;

switch (ciudadDestino) {
  case 'Madrid':
    valorPasaje = 200;
    break;
  case 'Barcelona':
    valorPasaje = 300;
    break;
  case 'Londres':
    valorPasaje = 400;
    break;
  case 'New York':
    valorPasaje = 500;
    break;
  case 'Paris':
    valorPasaje = 600;
    break;
  default:
    valorPasaje = 100;
    break;
}