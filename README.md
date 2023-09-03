# Joke App

### **Übersicht**

Diese App ist eine einfache Android-Anwendung, die Witze von einer externen API abruft und sie dem Benutzer anzeigt. Die App ist in Kotlin geschrieben und folgt der MVVM-Architektur. Sie verwendet auch ViewBinding für die Benutzeroberfläche und Room für die lokale Datenbank.

### **Warum diese Architektur und Technologien?**
* MVVM (Model-View-ViewModel): Eine Architektur, die die Trennung von Logik und Benutzeroberfläche erleichtert.
* ViewBinding: Eine effiziente Methode zum Zugriff auf UI-Elemente ohne findViewById.
* Volley (nutzt eingebautes Caching und Funktionen wie- Bild-Downloads, Abbrechen von Anfragen usw.): Eine Bibliothek für Netzwerkanfragen, die die Arbeit mit APIs vereinfacht.
* Room: Eine SQLite-Abstraktion, die den Umgang mit Datenbanken in Android erleichtert.

### **Geplante Features**
* Abrufen von Witzen: Die App wird eine externe API verwenden, um zufällige Witze abzurufen.
* Anzeigen von Witzen: Die Witze werden in der Benutzeroberfläche angezeigt.
* Speichern von Witzen: Die App wird die Witze in einer lokalen Room-Datenbank speichern, um sie später wieder anzeigen zu können.

### **Architektur**
    - Datenfluss
        * View (MainActivity): Der Benutzer interagiert mit der Benutzeroberfläche.
        * ViewModel (JokeViewModel): Verarbeitet Benutzeraktionen und aktualisiert die View.
        * Repository (JokeRepository): Verwaltet den Datenfluss zwischen der API und der lokalen Datenbank.
        * API (JokeApi): Externe Schnittstelle zum Abrufen von Witzen.
        * Datenbank (Room): Lokale Speicherung für Witze.
    - Klassen und ihre Rollen
        * MainActivity.kt: Steuert die Benutzeroberfläche und hört auf Benutzeraktionen.
        * JokeViewModel.kt: Enthält die Geschäftslogik und kommuniziert mit dem Repository.
        * JokeRepository.kt: Verwaltet den Datenzugriff, sowohl von der API als auch von der Datenbank.
        * JokeApi.kt: Definiert die Methoden für die API-Aufrufe.
        * JokeResponse.kt: Datenmodell für die API-Antwort.
        * JokeDao.kt: Definiert die Methoden für den Zugriff auf die Room-Datenbank.
        * AppDatabase.kt: Initialisiert die Room-Datenbank.

### **Vorgehensweise**
#### I.     Manifest: Internetgenehmigung setzen
#### II.    gradle(:app): dependecies setzen und viewBinding aktivieren
#### III.   UI- Layout definieren
#### IV.
#### V.
#### VI.
#### VII.
#### VIII.
#### IX.
#### X.     
