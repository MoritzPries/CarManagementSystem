# CarManagementSystem
system to manage a car renting system with useful methods and an example

based on the task:

OOP - Implement / Collection
The fleet of a car rental company is to be managed in the future with the help of a software system.
Cars of different equipment and size are rented. Here are some examples:
License plate L-RA- 1001 L-RA-1002 L-RA- 1003 L-RA-1004 L-RA-1005 L-RA-1006
Base price in Euro 50 40 60 90 80
Small car x x
Mid-size car x x
Upper class car x x
Automatic x x x
Air condition x x x x
Navigation system x x x
Parking sensors x x
Winter tires
Special feature new Multimedia
Convertible
The rental price of a car per day is calculated from its basic price and a surcharge of 5 Euro
for each available feature.
For example, the luxury car L-RA-1005 with air-conditioning and navigation system costs
on one day:
Daily rental price = basic price + 2 surcharge = 90 + 2 5 = 100Euros.
A software developer has created a class hierarchy with a development software, generated the
generated the source code for it, created an online documentation and summarized everything in the archive AutoVermietung.
zip. A programmer is now assigned to implement all in the source code not yet
the source code using the online documentation.

a) Class equipment: List all class variables used in the class,
Class methods, instance variables, and instance methods used in the class. Explain the necessary
use of class variables and class methods in at most three sentences.
b) Class equipment: As equipment characteristics the presence of automatic,
air conditioning, navigation system, parking sensors and winter tires are registered as equipment features. Additionally
special features can be registered.
Complete the code of the class and test the class with the above six equipment examples
(main method main):
Generate each of these features and then perform a tire change for the last feature.
perform a tire change. Output all of the generated equipment to the console
and redirect the results to a file Equipment.out.
c) Class hierarchy car: The car rental company offers small, middle class and upper class cars
of different equipment. The license plates of the cars are used for their identi
identification. They all have the structure L-RA-nnnn, where the numbering nnnn starts with
1000 and is consecutive.
Complete the code of the classes car, small car, middle class car and upper class car
and test the class hierarchy in the class car with the above six
car examples:
Create each of these cars using the class Equipment and then execute
then perform a tire change for the last car. Output the created cars
on the console and redirect the results to a file Auto.out.
2
d) Class Hierarchy Location: The rental cars change their locations. They end up
on the company's parking lot, on the street or in a contracted workshop.
workshop.
Add the missing code for the classes Location and Workshop and test the class hierarchy in the class Location.
and test the class hierarchy in the Location class with the six car examples above:
Set up parking lot, street and workshop as locations. Put all small cars in the
parking lot, all mid-size cars to the street, and all full-size cars to the workshop.
For all the locations, output the cars that are located there on the console.
Send a mid-size car of your choice from the street to the parking lot and
an upper class car of your choice from the garage to the parking lot. The
second upper class car will be scrapped. For all the locations, output the bendent
cars on the console. Redirect the results to a file Location.out.
Class Fleet: A management program (without GUI) is to support the dispatcher of the car rental company
in his activity:
All cars for rent are ready in the parking lot. If a car is rented, it ends on the street.
on the street. If it is returned, it is taken to the workshop for inspection.
There it will be decided if it will be rented out again and can be put back on the parking lot or if it should be scrapped,
or whether it should be scrapped.
The management program allows the dispatcher the following scenarios:
 Order New Car:
A new car is purchased and placed in the parking lot.
 Order Rent:
A renter chooses a car and drives it to the street.
 Order Street -> Garage:
A car is returned. It is taken to the workshop for inspection.
 Order Workshop -> Parking:
A serviced car is driven back to the parking lot.
 Scrapping order:
A car is scrapped.
The management program also gives the dispatcher the opportunity to get an overview of the locations of his cars at any time.
an overview of the locations of his cars at any time:
 Which cars are in the parking lot?
 Which cars are on the road?
 Which cars are in the workshop?
In the management program, implement all the services as follows:
e) Provide the dispatcher with a menu for the orders menueDisplayOrder() and a menu for the overview menueDisplayOrder().
menu for the overview menueDisplayLocation(). First implement
the overview of the locations of his cars.
f) Order New Car First complete the missing code of the class Fleet
for buying a car and buy the above six cars for testing. Enter
then display all the cars in the parking lot on the console.
g) Add the missing code for the fleet class and test the management program with the above six cars.
with the above six car examples and other examples. Rent
Cars, have some returned. Decide whether returned cars should be
scrapped or rented out again.

based on the original task in german language:

OOP - Implementieren / Collection
Der Fuhrpark einer Autovermietung soll künftig mit Hilfe eines Softwaresystems verwaltet werden.
Es werden Autos unterschiedlicher Ausstattung und Gröÿe vermietet. Hier einige Beispiele:
Kennzeichen L-RA-1001 L-RA-1002 L-RA-1003 L-RA-1004 L-RA-1005 L-RA-1006
Grundpreis in Euro 50 40 60 60 90 80
Kleinwagen x x
Mittelklassewagen x x
Oberklassewagen x x
Automatik x x x
Klimaanlage x x x x x x
Navigationssystem x x x x x
Parksensoren x x
Winterreifen
Besonderheit neu Multimedia
Cabrio
Der Mietpreis eines Autos pro Tag wird aus dessen Grundpreis und einem Zuschlag von 5 Euro
für jedes vorhandene Ausstattungsmerkmal berechnet.
Der Oberklassewagen L-RA-1005 mit Klimaanlage und Navigationssystems zum Beispiel kostet
an einem Tag:
Tagesmietpreis = Grundpreis + 2  Zuschlag = 90 + 2  5 = 100Euro
Ein Softwareentwickler hat mit einer Entwicklungssoftware eine Klassenhierarchie geschaen, den
Quellcode dazu generiert, eine Online-Dokumentation erzeugt und alles im Archiv AutoVermietung.
zip zusammengefasst. Einem Programmierer wird nun übertragen, alle im Quellcode noch
nicht implementierten Bestandteile anhand der Online-Dokumentation zu ergänzen.
a) Klasse Ausstattung: Listen Sie jeweils alle in der Klasse verwendeten Klassenvariablen,
Klassenmethoden, Instanzvariablen und Instanzmethoden auf. Erläutern Sie den hier notwendigen
Einsatz von Klassenvariablen und Klassenmethoden in maximal drei Sätzen.
b) Klasse Ausstattung: Als Ausstattungsmerkmale werden das Vorhandensein von Automatik,
Klimaanlage, Navigationssystem, Parksensoren und Winterreifen registriert. Zusätzlich
können noch Besonderheiten eingetragen werden.
Ergänzen Sie den Code der Klasse und testen Sie die Klasse mit den obigen sechs Ausstattungsbeispielen
(Hauptmethode main):
Erzeugen Sie jede dieser Ausstattungen und führen Sie anschlieÿend für die letzte Ausstattung
einen Reifenwechsel durch. Geben Sie alle erzeugten Ausstattungen auf der Konsole
aus und leiten Sie die Ergebnisse in eine Datei Ausstattung.out um.
c) Klassenhierarchie Auto: Die Autovermietung bietet Klein-, Mittelklasse- und Oberklassewagen
unterschiedlicher Ausstattung an. Die Kennzeichen der Autos dienen ihrer Identi-
kation. Sie haben sämtlich den Aufbau L-RA-nnnn, wobei die Nummerierung nnnn mit
1000 beginnt und fortlaufend erfolgt.
Ergänzen Sie den Code der Klassen Auto, Kleinwagen, Mittelklassewagen und Oberklassewagen
und testen Sie in der Klasse Auto die Klassenhierarchie mit den obigen sechs
Autobeispielen:
Erzeugen Sie jedes dieser Autos unter Verwendung der Klasse Ausstattung und führen Sie
anschlieÿend für das letzte Auto einen Reifenwechsel durch. Geben Sie die erzeugten Autos
auf der Konsole aus und leiten Sie die Ergebnisse in eine Datei Auto.out um.
2
d) Klassenhierarchie Ort: Die Mietautos wechseln ihre Aufenthaltsorte. Sie benden sich
auf dem betriebseigenen Parkplatz, auf der Straÿe oder in einer vertraglich gebundenen
Werkstatt.
Ergänzen Sie den noch fehlenden Code der Klassen Ort und Werkstatt und testen Sie in
der Klasse Ort die Klassenhierarchie mit den obigen sechs Autobeispielen:
Richten Sie Parkplatz, Straÿe undWerkstatt als Orte ein. Stellen Sie alle Kleinwagen auf den
Parkplatz, alle Mittelklassewagen auf die Straÿe und alle Oberklassewagen in die Werkstatt.
Geben Sie für alle Orte die sich dort bendenten Autos auf der Konsole aus.
Schicken Sie einen Mittelklassewagen Ihrer Wahl von der Strasse auf den Parkplatz und
einen Oberklassewagen Ihrer Wahl von der Werkstatt ebenfalls auf den Parkplatz. Der
zweite Oberklassewagen wird verschrottet. Geben Sie für alle Orte die sich dort bendenten
Autos auf der Konsole aus. Leiten Sie die Ergebnisse in eine Datei Ort.out um.
Klasse Fuhrpark: Ein Verwaltungsprogramm (ohne GUI) soll den Dispatcher der Autovermietung
bei seiner Tätigkeit unterstützen:
Alle Autos zur Vermietung stehen auf dem Parkplatz bereit. Ist ein Auto vermietet, so bendet
es sich auf der Straÿe. Wird es zurückgegeben, so kommt es in die Werkstatt zur Durchsicht.
Dort wird entschieden, ob es weiter vermietet wird und somit wieder auf den Parkplatz kann,
oder ob es zu verschrotten ist.
Das Verwaltungsprogramm ermöglicht dem Dispatcher folgende Szenarien:
 Auftrag Neues Auto:
Ein neues Auto wird gekauft und auf dem Parkplatz bereitgestellt.
 Auftrag Vermieten:
Ein Mieter sucht sich ein Auto aus und fährt damit auf die Straÿe.
 Auftrag Straÿe -> Werkstatt:
Ein Auto wird zurückgegeben. Es wird zur Durchsicht in die Werkstatt gefahren.
 Auftrag Werkstatt -> Parkplatz:
Ein gewartetes Auto wird zurück auf den Parkplatz gefahren.
 Auftrag Verschrotten:
Ein Auto wird verschrottet.
Das Verwaltungsprogramm gibt weiterhin dem Dispatcher die Gelegenheit, sich zu jeder Zeit
einen Überblick über die Aufenhaltorte seiner Autos zu verschaen:
 Welche Autos benden sich auf dem Parkplatz?
 Welche Autos benden sich auf der Straÿe?
 Welche Autos benden sich in der Werkstatt?
Implementieren Sie im Verwaltungsprogramm alle Diestleistungen wie folgt:
e) Stellen Sie dem Dispatcher ein Menü für die Aufträge menueAnzeigeAuftrag() und ein
Menü fuer den Überblick menueAnzeigeOrt() zur Verfügung. Implementieren Sie zunächst
den Überblick über die Aufenhaltorte seiner Autos.
f) Auftrag Neues Auto Ergänzen Sie zuerst den fehlenden Code der Klasse Fuhrpark
für den Kauf eines Autos und kaufen Sie die obigen sechs Autos zum Test ein. Geben Sie
anschlieÿend alle Autos, die sich auf dem Parkplatz benden, auf der Konsole aus.
g) Ergänzen Sie den noch fehlenden Code der Klasse Fuhrpark und testen Sie das Verwaltungsprogramm
mit den obigen sechs Autobeispielen und weiteren Beispielen. Vermieten
Sie Autos, lassen Sie welche zurückgeben. Entscheiden Sie, ob zurückgegebene Fahrzeuge
verschrottet oder weiter vermietet werden.
