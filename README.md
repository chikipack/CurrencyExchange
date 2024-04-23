# Conversor de Moneda
Este programa es un conversor de moneda simple escrito en Java, que permite a los usuarios convertir montos entre varias monedas populares como el Dólar Estadounidense (USD), el Peso Mexicano (MXN), el Peso Chileno (CLP), y el Yen Japonés (JPY).
## Características

### Conversión entre monedas

- **USD y MXN**
- **MXN y USD**
- **USD y CLP**
- **CLP y USD**
- **USD y JPY**
- **JPY y USD**

## Requisitos
Para ejecutar este programa, necesitarás:

- **Java JDK 11 o superior.**
- **Acceso a internet para las consultas de las tasas de cambio a través de una API.**

## Cómo usar
Descarga o clona el repositorio en tu sistema local.
Asegúrate de que Java está correctamente instalado y configurado.
Compila y ejecuta el programa utilizando tu entorno de desarrollo o desde la línea de comandos.

### Compilación y Ejecución
javac principal.java
java principal


### Uso del programa
Una vez ejecutado, el programa te presentará un menú de opciones:

***********************
Bienvenido al conversor de moneda.

Selecciona un tipo de cambio 

0) Salir
1) Dolar(USD) -> Peso Mexicano(MXN)
2) Peso Mexicano(MXN) -> Dolar(USD)
3) Dolar(USD) -> Peso Chileno(CLP)
4) Peso Chileno(CLP) -> Dolar(USD)
5) Dolar(USD) -> Yen Japones(JPY)
6) Yen Japones (JPY) -> Dolar(USD)

una vez selecciones una opcion entre las disponibles

**e.g:**
*1*

saldra un mensaje:
*Cuanto quieres convertir*

deberas ingresar una cantidad 

**e.g.** 
*100*

y despues se mostrara en pantalla

**100.0 USD son: 1713.08 MXN**

y el programa volver al estado inicial
Si quieres salir, deperas ingresar la opcion *0*

si ingresas algun otro valor numerico que no este en las opciones el programa mostrara: **Opcion no valida**

Si ingreas algun caracter que no sea numerico el programa terminara su ejecucion
