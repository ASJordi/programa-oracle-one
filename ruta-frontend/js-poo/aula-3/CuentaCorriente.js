/**
 * Definicion de clase CuentaCorriente
 * @param {string} numeroCuenta
 * @param {number} saldo
 * @param {agencia} agencia
*/

export class CuentaCorriente{

  cliente;
  numero;
  agencia;
  #saldo;

  constructor(){
    this.cliente = null;
    this.numero = "";
    this.agencia = ""; 
    this.#saldo = 0;
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

  transferirParaCuenta(valor, cuentaDestino){
    if(valor > 0){
      this.retiroEnCuenta(valor);
      cuentaDestino.depositoEnCuenta(valor);
    }
  }
}