import { Cliente } from "../Cliente.js";

export class Cuenta{

  #cliente;
  #saldo;

  constructor(cliente, numero, agencia, saldo){
    if(this.constructor == Cuenta){
      throw new Error("No se puede instanciar una clase abstracta");
    }
    this.numero = numero;
    this.agencia = agencia;
    this.setCliente = cliente;
    this.#saldo = saldo;
  }

  set setCliente(valor){
    if(valor instanceof Cliente){
      this.#cliente = valor;
    }
  }

  get getCliente(){
    return this.#cliente;
  }


  depositoEnCuenta(valor){
    if(valor > 0){
      this.#saldo += valor;
    return this.#saldo;                             
    }
  }

  retiroEnCuenta(valor){
    // Método abstracto
    throw new Error("Debe implementar el metodo retiroEnCuenta en su clase hija");
  }

  _retiroEnCuenta(valor, comision){
    valor =  valor * (1 + (comision / 100));
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