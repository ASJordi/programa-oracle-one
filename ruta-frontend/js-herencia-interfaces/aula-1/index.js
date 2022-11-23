import {Cliente} from './Cliente.js';
import {Cuenta} from "./Cuenta.js";
// import {CuentaCorriente} from "./CuentaCorriente.js";
// import {CuentaAhorro} from "./CuentaAhorro.js";

const clienteLeonardo = new Cliente("Leonardo", "12345678-9", "10");
const clienteMaria = new Cliente("Maria", "87654321-9", "20");

const cuentaLeonardo = new Cuenta(clienteLeonardo, "1", "001", 5000);
const cuentaMaria = new Cuenta(clienteMaria, "2", "001", 1000);

console.log(cuentaMaria.consultarSaldo());