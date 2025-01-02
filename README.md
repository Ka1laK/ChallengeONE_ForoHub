# 🌟 ChallengeONE_ForoHub 🚀

¡Bienvenido a **ForoHub**, tu API REST diseñada para gestionar tópicos de discusión con seguridad y autenticación avanzada! Este proyecto es parte de la especialización Backend de **Oracle Next Education (ONE)**, donde se aplican las mejores prácticas para desarrollar un foro interactivo y seguro. 🎉

---

## 🌟 **Características Principales**

- 🔒 **Autenticación robusta con JWT**  
  Protege tus endpoints con tokens seguros y encriptación avanzada.  

- 📝 **Operaciones CRUD para tópicos**  
  Gestiona fácilmente la creación, actualización y eliminación de tus discusiones.  

- 📄 **Documentación de API con Swagger**  
  ¡Accede a una interfaz interactiva para explorar y probar los endpoints!  

- 🛠️ **Base de datos con migraciones automáticas**  
  Utiliza PostgreSQL y Flyway para garantizar una base sólida y escalable.  

---

## 🛠️ **Stack Tecnológico**

| **Tecnología**        | **Versión**  | **Descripción**                                               |
|------------------------|--------------|---------------------------------------------------------------|
| **Java**              | 21           | Lenguaje principal para la lógica del backend.               |
| **Spring Boot**       | 3.3.4        | Framework para construir la API y gestionar dependencias.     |
| **Spring Security**   | -            | Protección y autenticación de usuarios con JWT.              |
| **Flyway**            | -            | Migraciones automáticas para la base de datos.               |
| **PostgreSQL**        | 16 o superior| Base de datos relacional para almacenar tópicos y usuarios.  |
| **OpenAPI (Swagger)** | 2.1.0        | Documentación interactiva para la API.                       |
| **Lombok**            | -            | Simplifica el código con anotaciones elegantes.              |
| **Maven**             | -            | Gestor de dependencias y construcción del proyecto.          |

---

## 🔗 **Endpoints Principales**

### 🔐 **Autenticación**
- `POST /login` → **Inicia sesión** y obtén tu token JWT.  
- `POST /signup` → **Registra nuevos usuarios** fácilmente.  

### 🗂️ **Gestión de Tópicos**
- `GET /topics` → Lista todos los tópicos (paginado).  
- `GET /topics/{id}` → Consulta un tópico específico.  
- `POST /topics` → **Crea nuevos tópicos** (requiere autenticación).  
- `PUT /topics/{id}` → Actualiza un tópico existente (requiere autenticación).  
- `DELETE /topics/{id}` → Elimina un tópico (requiere autenticación).  

---

## 🛡️ **Seguridad**

- **Autenticación sin estado:** Tokens JWT para proteger cada interacción.  
- **Contraseñas seguras:** Encriptadas con BCrypt para máxima seguridad.  
- **CORS y CSRF:** Protección contra ataques comunes en APIs web.  

---

## 🚀 **Instalación y Configuración**

### **Requisitos Previos**
- ☕ **JDK 21**  
- 🐘 **PostgreSQL 16 o superior**  
- 💻 **IntelliJ IDEA** (o cualquier IDE de tu preferencia).  

### **Pasos para la Instalación**

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/Ka1laK/ChallengeONE_ForoHub.git
