Spring Boot DevOps – Projet pédagogique
-

📌 Présentation:
- 
Ce projet est une application Spring Boot utilisée dans le cadre du cours DevOps.
L'objectif est de construire progressivement une chaîne CI/CD en intégrant différents outils DevOps, depuis la gestion du code source jusqu'au déploiement et à la supervision de l'application.
Le projet servira de support pratique pour mettre en œuvre les différentes étapes du cycle Build → Test → Analyse → Package → Publication → Déploiement → Monitoring.

🎯 Objectifs pédagogiques
-
À travers ce projet, vous allez apprendre à :
- gérer le code source avec Git / GitHub ;
- automatiser le build avec Maven ;
- mettre en place une Intégration Continue (CI) avec Jenkins ;
- automatiser l'exécution des tests ;
- analyser la qualité du code avec SonarQube ;
- construire une image Docker ;
- publier et utiliser une image Docker ;
- déployer et orchestrer l'application avec Kubernetes ;
- mettre en place la supervision avec Prometheus et Grafana ;
- construire progressivement une chaîne CI/CD complète.

📁 Structure du projet
-
spring-boot-devops/
├── src/
├── pom.xml
└── README.md

📁 Structure du projet

Le projet suit la structure standard d'une application Spring Boot avec Maven.
Les fichiers DevOps seront ajoutés progressivement au cours des différentes étapes du projet.

spring-boot-devops/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── ...                    # Code source Java
│   │   │
│   │   └── resources/
│   │       └── application.properties # Configuration de l'application
│   │
│   └── test/
│       └── java/
│           └── ...                    # Tests unitaires et d'intégration
│
├── pom.xml                            # Configuration Maven
├── Jenkinsfile                        # Pipeline CI/CD Jenkins
├── Dockerfile                         # Construction de l'image Docker
└── README.md                           # Documentation du projet

- La structure pourra évoluer au fur et à mesure de l'intégration des différents outils DevOps.
