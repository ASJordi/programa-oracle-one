export function valida(input){
  const tipoDeInput = input.dataset.tipo;
  if(validadores[tipoDeInput]){
    validadores[tipoDeInput](input);
  }
  if(input.validity.valid){
    input.parentElement.classList.remove('input-container--invalid');
    input.parentElement.querySelector('.input-message-error').innerHTML = "";
  } else{
    input.parentElement.classList.add('input-container--invalid');
    input.parentElement.querySelector('.input-message-error').innerHTML = mostrarMensajeDeError(tipoDeInput, input);
  }
}

const tipoDeErrores = [
  "valueMissing",
  "typeMismatch",
  "patternMismatch",
  "customError",
];

const mensajesDeError = {
  nombre: {
    valueMissing: 'El campo nombre no puede estar vacío'
  },
  email: {
    valueMissing: 'El campo email no puede estar vacío',
    typeMismatch: 'El email ingresado no es válido'
  },
  password: {
    valueMissing: 'El campo password no puede estar vacío',
    patternMismatch: 'Al menos 6 caracteres, máximo 12, debe contener una letra minúscula, una letra mayúscula, un número y no puede contener caracteres especiales',
  },
  nacimiento: {
    valueMissing: 'El campo fecha de nacimiento no puede estar vacío',
    customError: 'Debes ser mayor de edad para registrarte'
  },
  numero: {
    valueMissing: 'El campo número no puede estar vacío',
    patternMismatch: 'El número ingresado no es válido, debe ser XXXXXXXXXX'
  },
  direccion: {
    valueMissing: 'El campo dirección no puede estar vacío',
    patternMismatch: 'La dirección ingresada no es válida'
  },
  ciudad: {
    valueMissing: 'El campo ciudad no puede estar vacío',
    patternMismatch: 'La ciudad ingresada no es válida'
  },
  estado: {
    valueMissing: 'El campo estado no puede estar vacío',
    patternMismatch: 'El estado ingresado no es válido'
  }
};

const validadores = {
  nacimiento: (input) => validarNacimiento(input),
};

function mostrarMensajeDeError(tipoDeInput, input){
  let mensaje = "";
  tipoDeErrores.forEach(error =>{
    if(input.validity[error]){
      mensaje =  mensajesDeError[tipoDeInput][error];
    }
  });

  return mensaje;
}

function validarNacimiento(input){
  const fechaCliente = new Date(input.value);
  let mensaje = "";
  if(!mayorDeEdad(fechaCliente)){
    mensaje = 'Debes ser mayor de edad para registrarte';
  }

  input.setCustomValidity(mensaje);
}

function mayorDeEdad(fecha){
  const fechaActual = new Date();
  const diferenciaFechas = new Date(fecha.getUTCFullYear() + 18, fecha.getUTCMonth(), fecha.getUTCDate());  
  return diferenciaFechas <= fechaActual; 
}