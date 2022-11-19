const datos = [
  {'ciudad': 'Madrid', 'precio': 200},
  {'ciudad': 'Barcelona', 'precio': 300},
  {'ciudad': 'Londres', 'precio': 400},
  {'ciudad': 'New York', 'precio': 500},
  {'ciudad': 'Paris', 'precio': 600}];
let presupuesto = 400;

for (let i = 0; i < datos.length; i++) {
  if (datos[i].precio <= presupuesto) {
    console.log(`Puede viajar a ${datos[i].ciudad}`);
  }
} 