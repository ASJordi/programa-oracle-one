import {Cliente} from './Cliente.js';
import {Cuenta} from "./Cuenta.js";
import { CuentaAhorro } from './CuentaAhorro.js';
import { CuentaCorriente } from './CuentaCorriente.js';

const clienteLeonardo = new Cliente("Leonardo", "12345678-9", "10");
const clienteMaria = new Cliente("Maria", "87654321-9", "20");

const cuentaLeonardo = new CuentaCorriente(clienteLeonardo, "1", "001");
const cuentaMaria = new CuentaCorriente(clienteMaria, "2", "001");

cuentaLeonardo.depositoEnCuenta(200);
const cuentaAhorroLeonardo = new CuentaAhorro(clienteLeonardo, "1", "001", 10000);

console.log(cuentaLeonardo.consultarSaldo());
cuentaLeonardo.retiroEnCuenta(100);
console.log(cuentaLeonardo.consultarSaldo());