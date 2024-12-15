# E-store SPA

Ce projet fait partie du programme **NSY205/206 - 2023/2024** à l'Université du CNAM sous la direction du **Pr. Pascal Fares**. C'est une application web full-stack pour une boutique en ligne, mise en œuvre avec **Spring Boot 2** et **Angular 7**.

## Présentation générale

L'application est conçue comme une **Application à Page Unique (SPA)** avec un rendu côté client. Elle comprend des projets backend et frontend distincts, où le frontend interagit avec le backend via des appels API lorsque le serveur backend est actif.

### Fonctionnalités principales
- **Docker & Docker Compose** pour la conteneurisation
- Paniers persistants et basés sur les cookies
- API REST pour une interaction client-serveur transparente
- Gestion du panier et des commandes clients
- Pagination pour de meilleures performances
- Fonctionnalité de paiement
- Catalogue de produits
- Authentification et gestion des commandes basées sur JWT

## Technologies utilisées

### Backend
- **Java 11**
- **Spring Boot 2.2**
- **Spring Data JPA**
- **Authentification JWT**
- **Spring Security**
- **PostgreSQL**
- **Hibernate**
- **Maven**

### Frontend
- **Angular 7**
- **Angular CLI**
- **Bootstrap**

## Schéma de base de données
Le schéma de base de données est défini dans le répertoire `db`. Les données de test sont automatiquement importées dans la base de données à l'aide de `import.sql`.
![db](https://github.com/user-attachments/assets/edc42d40-e203-429f-8921-b06b4223238e)

## Exécution de l'Application

### Prérequis
- **PostgreSQL** pour le backend
- **Node.js** et **npm** pour le frontend

### Démarrage de l'Application

#### Backend
1. Installez PostgreSQL et configurez la source de données dans `application.yml`.
2. Naviguez vers le répertoire `backend` :
   ```bash
   cd backend
   ```
3. Construisez et lancez le projet :
   ```bash
   mvn install
   mvn spring-boot:run
   ```
4. Le serveur backend démarrera à l'adresse `http://localhost:8080`. Les données de test seront automatiquement importées dans la base de données.

#### Frontend
1. Naviguez vers le répertoire `frontend` :
   ```bash
   cd frontend
   ```
2. Installez les dépendances :
   ```bash
   npm install
   ```
3. Lancez l'application :
   ```bash
   ng serve
   ```
4. Le client frontend démarrera à l'adresse `http://localhost:4200`. Assurez-vous que le serveur backend est en cours d'exécution avant d'accéder au frontend.

### Configuration
L'URL de l'API backend est spécifiée dans `src/environments/environment.ts` dans le projet frontend. Par défaut, elle pointe vers `http://localhost:8080/api`.

## Exécution avec Docker

Vous pouvez exécuter l'intégralité de l'application en utilisant Docker pour un déploiement simplifié.

1. **Construisez le projet Backend** :
   ```bash
   cd backend
   mvn package
   ```

2. **Construisez le projet Frontend** :
   ```bash
   cd frontend
   npm install
   ng build --prod
   ```

3. **Lancez l'application avec Docker Compose** :
   ```bash
   docker-compose up --build
   ```
