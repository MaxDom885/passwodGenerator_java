# Générateur de mots de passe sécurisés

Ce programme en Java génère des mots de passe sécurisés basés sur les préférences de l'utilisateur concernant les types de caractères et la longueur du mot de passe.

## Fonctionnalités

- **Personnalisation des types de caractères :**
  - Lettres minuscules
  - Lettres majuscules
  - Chiffres
  - Symboles spéciaux
  - Combinaison de tous ces caractères
- **Spécification de la longueur du mot de passe** : L'utilisateur peut définir une longueur personnalisée (minimum 4 caractères).

## Prérequis

- **Java Development Kit (JDK)** version 6 ou ultérieure
- Un éditeur de code ou IDE prenant en charge Java (comme IntelliJ IDEA, Eclipse ou VS Code)
- Un terminal pour exécuter l'application

## Utilisation

1. Clonez ou téléchargez le code source du programme.
2. Compilez le fichier `Password.java` en utilisant `javac` :
   ```bash
   javac Password.java

##Sortie
Choisissez les types de caractères que vous désirez dans votre mot de passe :
Miniscules 1 
Majuscules 2 
Symboles 3 
Chiffres 4 
Tous les Caractères 5
> 5

Entrez la longueur désirée pour votre mot de passe (minimum 4 caractères) :
> 12

Mot de Passe : aB9?d#K7w&F@

##Points techniques
Génération sécurisée : Le programme utilise la classe SecureRandom pour garantir un choix aléatoire et sécurisé des caractères.
Gestion des entrées utilisateur : Validation de la longueur minimale pour garantir la qualité des mots de passe générés.

##Limites
La structure actuelle ne propose pas de mélange automatique des types de caractères pour garantir qu'ils sont tous présents dans un mot de passe (par exemple, au moins une lettre majuscule ou un symbole).
L'interface utilisateur est uniquement textuelle.

##Améliorations possibles
Ajouter une option pour générer un mot de passe contenant un mélange équilibré de tous les types de caractères sélectionnés.
Fournir une interface graphique pour une meilleure expérience utilisateur.
Ajouter des tests unitaires pour valider les fonctionnalités.

##Auteur
Par Masmoud Yacoubou (maxdomyacoubou@gmail.com)
Ce programme a été écrit pour apprendre et pratiquer la génération de mots de passe sécurisés en Java.
