/**
 * Definicion de clase Cliente
 * @param {string} nombreCLiente
 * @param {string} dniCliente
 * @param {string} numeroCuenta
*/

export class Cliente{
  nombreCliente;
  dniCliente;
  rutCliente;

  constructor(nombreCliente, dniCliente, rutCliente){
    this.nombreCliente = nombreCliente;
    this.dniCliente = dniCliente;
    this.rutCliente = rutCliente; 
  }
}