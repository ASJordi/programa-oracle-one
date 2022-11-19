// Definicion de una lista
const ciudadesDisponibles = new Array('Londres', 'New York', 'Madrid', 'Paris');

const paisesDisponibles = ['España', 'Francia', 'Inglaterra', 'Portugal'];

// {
//   // Agregar elementos al final de la lista
//   ciudadesDisponibles.push('Buenos Aires');

//   // Agregar elementos al inicio de la lista
//   ciudadesDisponibles.unshift('Bogota');
// }

// mostrar elemento de la lista
// console.log(ciudadesDisponibles[0]);

// Eliminar elementos de la lista y agregar nuevos
// primero indicamos la posicion del elemento a eliminar
// luego indicamos la cantidad de elementos a eliminar
// luego indicamos los elementos a agregar
ciudadesDisponibles.splice(1, 1, 'Buenos Aires', 'Bogota');

