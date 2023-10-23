# JDR


## compilation 
La fonction main se trouve dans Jeu.java 

## Character 
Le dossier personnage contient nos héros# Jeu de Rôle en Java

Ce projet est un exemple de jeu de rôle (JDR) en Java qui utilise l'interface utilisateur Swing pour créer une expérience interactive.

## Structure du Projet

Le projet est organisé en plusieurs classes Java pour gérer différentes parties du jeu :

- `Main.java` : Le point d'entrée de l'application qui instancie la classe de gestion du jeu (`Jeu`) et l'interface utilisateur (`JeuInterface`) pour démarrer le jeu.

- `Jeu.java` : La classe de gestion du jeu qui contient la logique du jeu, y compris la création de personnages, les combats, l'avancement de l'histoire, etc.

- `JeuInterface.java` : La classe de l'interface utilisateur Swing qui configure et affiche l'interface graphique du jeu.

- `Character.java` : La classe représentant les personnages jouables du jeu, avec leurs caractéristiques telles que le nom, la classe, les points de vie, etc.

- `Character.Enemy.java` : La classe représentant les ennemis que les personnages doivent affronter, avec leurs caractéristiques telles que le nom, les points de vie, etc.

- D'autres classes : Vous pouvez ajouter des classes supplémentaires pour représenter les aventures, les lieux, les quêtes, etc.




## Comment Exécuter le Jeu

1. Assurez-vous d'avoir Java JDK installé sur votre système.

2. Compilez les fichiers Java en exécutant la commande suivante dans le répertoire du projet :

   ```bash
   javac *.java
