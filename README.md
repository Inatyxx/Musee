# Introduction aux relations entre les classes

Ce projet est une introduction aux relations entre les classes en programmation orientée objet. Il présente les liens qui permettent aux objets de collaborer et de représenter des concepts du monde réel.

## Objectifs

- Comprendre comment des classes peuvent être liées.
- Découvrir l’association, l’agrégation et la composition.
- Comprendre l’héritage et la dépendance.
- Apprendre à choisir une relation adaptée à un besoin.

## Les principales relations

| Relation | Description |
| --- | --- |
| Association | Deux classes décrivent des objets qui collaborent ou se connaissent. |
| Agrégation | Un objet regroupe d’autres objets, qui peuvent exister indépendamment. |
| Composition | Un objet est constitué d’autres objets dont le cycle de vie dépend de lui. |
| Héritage | Une classe spécialisée reprend et complète une classe plus générale. |
| Dépendance | Une classe utilise ponctuellement une autre classe. |

## Exemple : un musée

Un musée peut exposer plusieurs œuvres. Une œuvre peut exister indépendamment du musée : ce lien peut être modélisé par une agrégation.

```text
Musee "1" o── "0..*" Oeuvre
```

## Mise en pratique

Parcourez les exemples du projet, repérez les classes et identifiez leurs relations. Puis, créez vos propres exemples pour mettre ces notions en pratique.

## Prérequis

Des bases en programmation et en classes sont recommandées. Le projet s’adresse aux personnes qui découvrent la programmation orientée objet.
