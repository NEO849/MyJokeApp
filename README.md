# Joke App

### **Übersicht**
* Diese App ist eine einfache Android-Anwendung, die Witze von einer externen API abruft und sie dem Benutzer anzeigt. 
* Die App ist in Kotlin geschrieben und folgt der MVVM-Architektur. 
* Sie verwendet ViewBinding für die Benutzeroberfläche und Room für die lokale Datenbank.
* Navigation Component wird verwendet, macht es einfach zwischen Fragmenten zu navigieren.

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
    - Packages 
        * ui: Enthält alle UI-bezogenen Klassen und Fragmente.
        * adapter: Enthält den RecyclerView-Adapter für die Witze-Liste.
        * data: Enthält Klassen für die Datenverwaltung, einschließlich des Repositories und der API-Service-Klassen.
        * datamodels: Enthält die Datenmodelle.
    - Bibliotheken, Tools
        * Navigation Component**: Für die Navigation zwischen Fragmenten.
        * Volley: Für Netzwerkanfragen an die Jokes API.
        * ViewModel und LiveData**: Für die Verwaltung von UI-bezogenen Daten.
        * RecyclerView: Für die Anzeige der Witze in einer Liste.

### **Vorgehensweise**
#### I.     Manifest: Internetgenehmigung setzen
#### II.    gradle(:app): dependecies setzen und viewBinding aktivieren
#### III.   Packages erstellen, UI- Layout definieren
    1. in der activity_main.xml 
        * Horizontale Recyclerview für die Witze Kategorie_Auswahl
        * fragment_container worin die Witze angezeigt werden

#### IV.
#### V.
#### VI.
#### VII.
#### VIII.
#### IX.
#### X.     