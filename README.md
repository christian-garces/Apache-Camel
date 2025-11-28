Documentación del Proyecto Apache Camel Orchestrator
1. Introducción
Este proyecto implementa un orquestador de APIs utilizando Apache Camel.
Su objetivo es demostrar cómo construir flujos de integración modulares, escalables y fáciles de mantener, conectando múltiples servicios REST en una arquitectura multicapa.

2. Arquitectura del Proyecto
El proyecto sigue una estructura modular:
src/main/java/com/christian/orquestador/
│── routes/        # Definición de rutas Camel
│── processors/    # Lógica de transformación y validación
│── config/        # Configuración del CamelContext y beans
test/              # Pruebas unitarias con JUnit
docs/              # Diagramas y documentación técnica

Flujo de integración
- Entrada REST: Se recibe una petición desde un endpoint.
- Procesador: Se transforma o valida la información.
- Orquestación: Se encadena con otros endpoints o servicios externos.
- Respuesta: Se devuelve el resultado al cliente.
Ejemplo simplificado:
from("rest:get:enigma/step1")
    .process(new StepOneProcessor())
    .to("rest:post:enigma/step2");

3. Requisitos
- Java 11+
- Apache Maven
- Apache Camel 3.x
- Docker (opcional para despliegue)

4. Instalación y Ejecución
   
Clonar el repositorio
git clone https://github.com/christian-garces/Apache-Camel.git
cd Apache-Camel

Compilar y ejecutar
mvn clean install
mvn spring-boot:run

Despliegue con Docker
docker build -t apache-camel-orchestrator .
docker run -p 8080:8080 apache-camel-orchestrator

5. Ejemplos de uso
- GET /enigma/step1 → inicia el flujo de integración.
- POST /enigma/step2 → recibe datos procesados y continúa la orquestación.

6. Pruebas
Ejecuta las pruebas unitarias con:
mvn test

7. Roadmap
- [ ] Añadir más ejemplos de integración con APIs externas.
- [ ] Implementar pruebas de integración con Docker Compose.
- [ ] Documentar métricas y monitoreo con Prometheus/Grafana.

8. Licencia
Este proyecto está bajo la licencia MIT.
Puedes usarlo, modificarlo y distribuirlo libremente, siempre dando crédito al autor


