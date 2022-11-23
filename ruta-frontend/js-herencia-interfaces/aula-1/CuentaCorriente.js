import { Cliente } from "./Cliente.js";
/**
 * Definicion de clase CuentaCorriente
 * @param {string} numero
 * @param {agencia} agencia
 * @param {number} saldo
*/

export class CuentaCorriente{

  #cliente;
  numero;
  agencia;
  #saldo;
  static cantidadCuentas = 0;

  set setCliente(valor){
    if(valor instanceof Cliente){
      this.#cliente = valor;
    }
  }

  get getCliente(){
    return this.#cliente;
  }

  constructor(cliente, numero, agencia){
    this.setCliente = cliente;
    this.numero = numero;
    this.agencia = agencia; 
    this.#saldo = 0;
    CuentaCorriente.cantidadCuentas++;
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