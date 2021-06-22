
# ATM-simulation
===========================
Created in 2012

Es un sencillo simulador de un cajero automatico. Realizado en Java y utiliza JFrame como IU. Cuenta con funcionalidades comunes como acceso, deposito, retiro, consulta y factura. Ademas de todas las validaciones nesesarias para que no se pueda robar su dinero.

# Funcionamiento
___
# Acceso 

![ATM-simulation](https://github.com/delfer66/ATM-simulation/blob/master/img/login.jpg)

Solo se puede acceder con los siguientes usuarios y contraseñas.
Usuarios y Contraseñas de cuentas de ahorros.

```java
String[] usu = {"fernando","cflopez","hswilson","yxrefrigeradora","apcasa"};
String[] con = {"aaaa123456","ffff111111","wwww222222","rrrr111111","pppp111111"};
```

Usuarios y Contraseñas de cuentas corrientes.

```java
String[] usu = {"fernando","sdlopez","yxrefrigeradora"};
String[] con = {"aaaa123456","ssss111111","rrrr111111"};
```
___
# Retiro

Se puede retirar cual quiera de los montos marcado y seleccionar una cuenta.

![ATM-simulation](https://github.com/delfer66/ATM-simulation/blob/master/img/retiro.jpg)

Si se selecciona otros el monto maximo es 600.

![ATM-simulation](https://github.com/delfer66/ATM-simulation/blob/master/img/otros.jpg)
___
# Deposito

Solo es nesesario ingresar el valor de dinero y la cuenta donde se va a depositar.

![ATM-simulation](https://github.com/delfer66/ATM-simulation/blob/master/img/deposito.jpg)
___
# Consulta

Se muestra un detalle de las transacciones realizadas.

![ATM-simulation](https://github.com/delfer66/ATM-simulation/blob/master/img/consulta.jpg)
___
# Factura

Se muestra un detalle de la transaccion realizada.

![ATM-simulation](https://github.com/delfer66/ATM-simulation/blob/master/img/factura.jpg)