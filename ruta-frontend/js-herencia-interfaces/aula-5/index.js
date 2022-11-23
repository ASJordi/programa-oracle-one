import {Cliente} from './Cliente.js';
import { CuentaCorriente } from './Cuentas/CuentaCorriente.js';
import { Empleado } from './Empleados/Empleado.js';
import { Director } from './Empleados/Director.js';
import { Gerente } from './Empleados/Gerente.js';
import {SistemaAutenticacion} from "./SistemaAutenticacion.js";

const clienteLeonardo = new Cliente("Leonardo", "12345678-9", "10");
const clienteMaria = new Cliente("Maria", "87654321-9", "20");

clienteLeonardo.asignarClave("1234");
clienteMaria.asignarClave("1234");

const cuentaLeonardo = new CuentaCorriente(clienteLeonardo, "1", "001");
const cuentaMaria = new CuentaCorriente(clienteMaria, "2", "001");

const empleadoJuan = new Empleado("Juan", "12345678-9", 10000);
const gerentePedro = new Gerente("Pedro", "12345678-8", 12000);
const directorElena = new Director("Elena", "12345678-7", 15000);

empleadoJuan.asignarClave("1234");
gerentePedro.asignarClave("1234");
directorElena.asignarClave("1234");

console.log(SistemaAutenticacion.login(empleadoJuan, "1234"));