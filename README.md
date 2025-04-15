
        Consignes pour ce test technique :

        1. **Exercice 1 : Calculer l'aire des formes géométriques**
            - Vous avez des instances de `Square` (carré) et `Triangle` (triangle).
            - Pour chaque forme, **calculez l'aire** en utilisant les coordonnées la méthode areacalc()
            - **Affichez le résultat** de l'aire de chaque forme à l'aide de `System.out.println`.
            - Ensuite, **filtrez** les formes dont l'aire est **supérieure à 250**.
            - **Comptez** le nombre de formes avec une aire supérieure à 250.
            - Utilisez l'assertion suivante pour vérifier que le nombre de formes avec une aire > 250 est correct :
                ```java
                Assertions.assertEquals(3, /*count*/);
                ```

        2. **Exercice 2 : Séparer les nombres pairs et impairs**
            - Vous disposez d'une liste de nombres : `List<Integer> numbers`.
            - Vous devez créer une **map** qui partitionne les nombres :
                - La clé `true` correspond aux nombres **pairs**.
                - La clé `false` correspond aux nombres **impairs**.
            - La structure de la map doit ressembler à ceci :
                - `partitionedNumbers.get(true)` contiendra les nombres pairs.
                - `partitionedNumbers.get(false)` contiendra les nombres impairs.
            - Utilisez les assertions suivantes pour vérifier que la partition est correcte :
                ```java
                Assertions.assertEquals(4, partitionedNumbers.get(false).size());
                Assertions.assertEquals(3, partitionedNumbers.get(true).size());
                ```

        3. **Exercice 3 : Trouver une occurrence spécifique dans un texte**
            - Vous avez une chaîne de texte `text` et un élément `strElement` (ici, le mot "pas").
            - Votre tâche est de compter **combien de fois le mot "pas" apparaît dans le texte**, en vous assurant qu'il est comptabilisé uniquement lorsqu'il apparaît seul (et non dans d'autres mots).
            - Utilisez la méthode `findOccurrenceElement(strElement, text)` pour implémenter cette logique.
            - Utilisez l'assertion suivante pour vérifier que le nombre d'occurrences du mot "pas" est correct :
                ```java
                Assertions.assertEquals(1, findOccurrenceElement(strElement, text));
                ```

        4. **Exercice 4 : Construire un arbre binaire**
            - Vous avez une liste de nombres `BigInteger` et un nœud racine `Node`.
            - Votre tâche est de **construire un arbre binaire** de manière récursive, où chaque nombre de la liste est un nœud dans l'arbre.
            - Le nœud racine (root) doit être initialisé avec la valeur `1` et les autres nœuds doivent être insérés récursivement en fonction de leur valeur.
            - Vous pouvez vous référer à l'image dans le README pour avoir une idée de la structure attendue de l'arbre.
            - Utilisez les assertions suivantes pour vérifier la structure de l'arbre :
                ```java
                Assertions.assertEquals(BigInteger.valueOf(2), root.getLeft().getValue());
                Assertions.assertEquals(BigInteger.valueOf(7), root.getRight().getRight().getValue());
                ```

        5. **Remarques importantes :**
            - Vous **ne devez modifier que cette classe**, et ne pas toucher aux assertions déjà présentes.
            - **Un seul exercice nécessite une solution plus complexe (l'arbre binaire)**, les autres exercices peuvent être résolus en une ou deux lignes de code.

 

![image](https://github.com/user-attachments/assets/cb78745a-c7a4-4619-acb4-887b65ee3ab4)
