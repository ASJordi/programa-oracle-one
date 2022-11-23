import { Cliente } from "./Cliente.js";

export class Cuenta{

  #cliente;
  #saldo;

  set setCliente(valor){
    if(valor instanceof Cliente){
      this.#cliente = valor;
    }
  }

  get getCliente(){
    return this.#cliente;
  }

  constructor(cliente, numero, agencia, saldo){
    this.numero = numero;
    this.agencia = agencia;
    this.setCliente = cliente;
    this.#saldo = saldo;
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