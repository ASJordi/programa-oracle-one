import {Cliente} from './Cliente.js';
import {CuentaCorriente} from "./CuentaCorriente.js";

// Creacion de objeto cliente Leonardo
const clienteLeonardo = new Cliente();
clienteLeonardo.nombreCliente = "Leonardo";
clienteLeonardo.dniCliente = "12345678-9";
clienteLeonardo.rutCliente = "10";

const cuentaLeonardo = new CuentaCorriente();
cuentaLeonardo.cliente = clienteLeonardo;
cuentaLeonardo.numero = "1";
cuentaLeonardo.agencia = "001";
cuentaLeonardo.depositoEnCuenta(5000);

// Creacion de objeto cliente Maria

const clienteMaria = new Cliente();
clienteMaria.nombreCliente = "Maria";
clienteMaria.dniCliente = "87654321-9";
clienteMaria.rutCliente = "20";

const cuentaMaria = new CuentaCorriente();
cuentaMaria.cliente = clienteMaria;
cuentaMaria.numero = "2";
cuentaMaria.agencia = "001";

// Transferencia de cuenta de Leonardo a cuenta de Maria
cuentaLeonardo.transferirParaCuenta(2000, cuentaMaria);

// Consulta de saldos
let saldoLeonardo = cuentaLeonardo.consultarSaldo();
let saldoMaria = cuentaMaria.consultarSaldo();
console.log(`Saldo de Leonardo: ${saldoLeonardo}`);
console.log(`Saldo de Maria: ${saldoMaria}`);