# Joke App

### **Übersicht**
* Diese App ist eine einfache Android-Anwendung, die Witze von einer externen API abruft und sie dem Benutzer anzeigt. 
* Die App ist in Kotlin geschrieben und folgt der MVVM-Architektur. 
* Sie verwendet ViewBinding für die Benutzeroberfläche und Room für die lokale Datenbank.
* Navigation Component wird verwendet, macht es einfach zwischen Fragmenten zu navigieren.

### **Warum diese Architektur und Technologien?**
* MVVM (Model-View-ViewModel): Eine Architektur, die die Trennung von Logik und Benutzeroberfläche erleichtert.
* ViewBinding: Eine effiziente Methode zum Zugriff auf UI-Elemente ohne findViewById.
* Retrofit: Übernimmt die Kommunikation mit dem Server und übersetzt die Antwort in Kotlin Objekte
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
        * adapter: Enthält den RecyclerView-Adapter für die Witze-Liste und ein Adapter für die Kategorie Auswahl
        * data: Enthält Klassen für die Datenverwaltung, einschließlich des Repositories und der API-Service-Klassen.
        * datamodels: Enthält die Datenmodelle.
    - Bibliotheken, Tools
        * Navigation Component**: Für die Navigation zwischen Fragmenten.
        * Retrofit: Für Netzwerkanfragen an die Jokes API, erleichtert die Integration und den Umgang mit APIs. 
        * Moshi: Dient dazu JSON-Antworten in Kotlin- oder Java-Objekte umzuwandeln. Dies ist besonders nützlich, um die Datenmodelle (im datamodels Paket) mit den tatsächlichen Daten zu befüllen.
        * ViewModel und LiveData: Für die Verwaltung von UI-bezogenen Daten.
        * RecyclerView: Für die Anzeige der Witze in einer Liste.

### **Vorgehensweise**
#### I.     Manifest: Internetgenehmigung setzen
#### I.     Packages erstellt
#### I.     gradle(:app): dependecies setzen und viewBinding aktivieren
#### II.    Navigation
    1. im ui-Paket HomeFragment und JokeFragment erstellt
        * ganz Simpel, im HomeFragment einfache Auswahl mittels Button, zur Übung lediglich Joke BTN mit Funktion
        * JokeFragment werden die Witze angezeigt und man kann eine Witze Kategorie auswählen (mittels zwei Recyclerviews- horizontal und vertical scrollbar)
    2. nav_graph erstellen und Navigation einrichten
#### III.   UI- Layout definieren
    1. in der activity_main.xml 
        * FragmentContainerView setzen, damit das was ich im nav_graph als Homescreen definiert habe angezeigt wird
    2. fragment_home.xml
        * Button gesetzt, bei Klick soll später zum JokeFragment navigiert werden
    3. in der fragment_joke.xml
        * Recyclerview (Horizontale) für die Witze Kategorie_Auswahl
        * FragmentContainerView gesetzt: Recyclerview (Vertikale) für die Witze selbst
#### IV.   Im Adaper-Pakage
    - CategoryAdapter.kt für die Witze Kategorie erstellen
        * Ist Für die Darstellung der verschiedenen Witze-Kategorien in der horizontalen RecyclerView innerhalb des JokeFragment verantwortlich
        * Verarbeitet die Klicks auf die Kategorie-Elemente und informiert das JokeCategoryViewModel über die ausgewählte Kategorie
#### V.     category_joke.xml erstellen  --> hier wird das Layout der HorizontalRV für die Kategorie Witze Auswahl definiert
#### VI.    HomeFragment.kt einen onClickListener auf den Witze Button setzen, damit zum fragment_joke navigiert werden kann
#### VII.   Im JokeFragment.kt wird die Logik des Screens definiert und die Daten befüllt --> Steuerzentrale für diesen einen Screen
    1. JokeFragment einbinden und initialisieren
    2. zum Testen Dummy Daten erstellt
    3. Adapter initialisieren
    4. LayoutManager für die RecyclerViews setzen --> Dadurch wird festgelegt, wie die Elemente innerhalb der RecyclerViews angeordnet werden
    5. Adapter für die Kategorien-RecyclerView setzen --> Ist für die Darstellung der Daten zuständig

### Datenmanagement (Livedata, Retrofit, Moshi, API-Calls):
#### I. Datenmodelle Joke und Jokelist erstellen
    * definieren Form und Struktur in die die Empfangenen API Antworten umgewandelt werden
    * das ermöglicht eine einfachere und sicherere Handhabung der Daten 


Hier weiter -->

#### II. JokeViewModel erstellen
    * vermittelt zwischen der UI und den Datenmodellen
    * muss eine LiveData-Liste für beide RecyclerViews haben: eine für die Kategorien und eine für die Witze
#### III.     

