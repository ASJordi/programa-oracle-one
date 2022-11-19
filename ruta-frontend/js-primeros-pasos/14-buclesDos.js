const datos = [
  {'ciudad': 'Madrid', 'precio': 200},
  {'ciudad': 'Barcelona', 'precio': 300},
  {'ciudad': 'Londres', 'precio': 400},
  {'ciudad': 'New York', 'precio': 500},
  {'ciudad': 'Paris', 'precio': 600}];
let presupuesto = 400;
const ciudadDestino = 'Londres'
let i = 0;

do {
  if( presupuesto >= datos[i].precio ) {
    console.log(`Puedes viajar a ${datos[i].ciudad}`);
  } else{
    console.log('Sin coincidencias');
    break;
  }
  i++;
} while (ciudadDestino !== '' && i < datos.length);  