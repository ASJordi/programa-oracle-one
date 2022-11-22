import {Cliente} from './Cliente.js';
import {CuentaCorriente} from "./CuentaCorriente.js";

// Creacion de objeto cliente
const clienteLeonardo = new Cliente("Leonardo", "12345678-9", "10");
const clienteMaria = new Cliente("Maria", "87654321-9", "20");

// Creacion de objeto cuenta corriente
const cuentaLeonardo = new CuentaCorriente(clienteLeonardo, "1", "001");
const cuentaMaria = new CuentaCorriente(clienteMaria, "2", "001");

// Deposito en cuenta corriente
cuentaLeonardo.depositoEnCuenta(5000);

// Transferencia de cuenta de Leonardo a cuenta de Maria
cuentaLeonardo.transferirParaCuenta(2000, cuentaMaria);

console.log(CuentaCorriente.cantidadCuentas);