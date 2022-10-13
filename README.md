
1.
1.A. W jakim celu używa się klas abstrakcyjnych, a w jakim interfejsów?

Klasa abstrakcyjna jest to klasa, która nie może mieć swoich reprezentantów pod postacią obiektów, można po niej 
jedynie dziedziczyć. Klasy abstrakcyjne stosuje się, gdy chcemy współdzielić część kodu pomiędzy klasami i mamy określoną hierarchię
którą chcemy odwzorować w kodzie, np. klasa Zwierzę posiada metodę "jeść", którą dziedziczy klasa Pies. Klasa Pies  
posiada metodę "szczekać" oraz metodę "jeść" odziedziczoną po abstrakcyjnej klasie Zwierze.  Każde Zwierze dziedziczy
metodę "jeść", ale tylko klasa Pies korzysta z metody "szczekać".
Interfejsy służą do definiowania zachowania obiektów, mogą zawierać jedynie stałe i deklaracje
metod. Interfejsów używa się tam gdzie potrzebujemy różnych implementacji tego samego interfejsu. Jako przykład można podać 
interfejs  Zwierzę posiadający metodę "odgłosy" z implementacją dla klasy pies jako "szczekanie",
a dla klasy kot jako "miauczenie".
Interfejsy są prostsze w utrzymaniu w stosunku do hierachii klas abstrakcyjnych, dlatego też są częściej stosowane.

1.B. Czym różni się tablica od listy liniowej?
Główna różnica pomiędzy tablicą a listą liniową jest taka, że w przeciwieństwie do tablicy, przy tworzeniu listy
nie trzeba podawać jej rozmiaru, gdyż listy mają zmienną ilość elementów. Listy są prostsze w obsłudze
niż tablice, gdyż posiadają dużo metod, które pozwalają na liście wykonać różne operacje, natomiast tablice są szybsze 
i warto je wybrać, jeśli nie będziemy jej modyfikować, a często odczywtywać.