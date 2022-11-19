let ciudades = ['Londres', 'New York', 'Madrid', 'Estambul', 'Paris'];
let paises = ['Inglaterra', 'Estados Unidos', 'España', 'Turquia', 'Francia'];

// Obtener tamaño de la lista
let cantidadCiudades = ciudades.length;

// Eliminar el último elemento de la lista
// ciudades.pop();

// Eliminar el primer elemento de la lista
// ciudades.shift();

// Eliminar determinado elemento de la lista
// ciudades.splice(1, 1);

//Filtrar elementos de la lista
let ciudadesMayores = ciudades.filter(e => e.length > 6);

// Convertir lista a string
let ciudadesString = ciudades.join(', ');

// Ordenar lista de forma ascendente
let ciudadesOrdenadas = ciudades.sort();

// Ordenar lista de forma descendente
let ciudadesOrdenadasDesc = ciudades.sort().reverse();

// Obtener la posición de un elemento en la lista
let posicion = ciudades.indexOf('Madrid');

// Obtener el elemento de una posición determinada
let ciudad = ciudades[2];

// Unir dos listas
let ciudadesYPaises = ciudades.concat(paises);