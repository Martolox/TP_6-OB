# TP 8 - Observer

### Observer
- Define una dependencia de uno-a-muchos entre objetos, de forma que cuando un objeto cambie de estado se notifique y se actualicen automáticamente todos los objetos que dependen de él.
	- Pull
	- Push

- Dependencias:
    - JUnit5
    - JSON
    - OpenCSV
    - Jakarta Mail
    - Derby DB
- API call
	- Se realiza petición de servicios a OpenWeather.

## 1. Medidor de Temperatura (Parte A)
Se provee un Medidor de Temperatura que consulta un servicio web de Wheather Channel. Primero se modifica la clase WeatherChannel para que consuma servicios de OpenWeather.
  
## 2. Observer: Medidor de Temperatura (Parte B)
Se deben escribir dos observadores.
1. Uno que guarda lectura y fecha en un archivo de texto.
2. Otro que imprime en consola la temperatura.

![TP 8.1](/images/TP8.1.png)

## 3. Decorator: Medidor de Temperatura (Parte C)
Se resuelve el mismo ejercicio aplicando Decorator.
  
![TP 8.2](/images/TP8.2.png)

## 4. Observer: Agregar Participante (TP 4 - Layers, Ejercicio 1)
Se modifica para que envíe un mail cuando un participante se inscribe

## 5. Observer: Restaurante (TP 1, TP 2)
Se crea una pantalla que tendrá el gerente del restaurante con el monto de la facturación de la ultima mesa.