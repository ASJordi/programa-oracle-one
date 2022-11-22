/**
 * Definicion de clase Cliente
 * @param {string} nombreCLiente
 * @param {string} dniCliente
 * @param {string} numeroCuenta
*/

class Cliente{
  nombreCLiente;
  dniCliente;
  rutCliente;
}

/**
 * Definicion de clase CuentaCorriente
 * @param {string} numeroCuenta
 * @param {number} saldo
 * @param {agencia} agencia
*/

class CuentaCorriente{
  numero;
  #saldo;
  agencia;

  constructor(){
    this.numero = "";
    this.#saldo = 0;
    this.agencia = ""; 
  }

  depositoEnCuenta(valor){
    if(valor > 0){
      this.#saldo += valor;
    return this.#saldo;                             
    }
  }

  retiroEnCuenta(valor){
    if(valor <= this.#saldo){
      this.#saldo -= valor;
    return this.#saldo;
    }
  }

  consultarSaldo(){
    return this.#saldo;
  }
}

const cuentaCorriente1 = new CuentaCorriente();
cuentaCorriente1.numero = "1";
cuentaCorriente1.agencia = "1";
cuentaCorriente1.depositoEnCuenta(1000);