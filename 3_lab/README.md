# Shirinkin Timofey IT-12-2024
## Лабораторная 3, вариант 2

# Структура
<img width="516" height="777" alt="{593B6441-E3C4-4137-A75B-229B16A6DFD5}" src="https://github.com/user-attachments/assets/14a67bda-6e09-4e0e-b928-04f4a9a69966" />

## Классы дробей (Fraction, Fraction1ex, Fraction3ex)

### Конструкторы
- **`Fraction(int numerator, int denominator)`** - создает дробь с автоматическим сокращением и проверкой знаменателя
- **`Fraction(int numerator)`** - создает дробь из целого числа (знаменатель = 1)

### Геттеры
- **`getNumerator()`** - возвращает числитель дроби
- **`getDenominator()`** - возвращает знаменатель дроби

### Арифметические операции
- **`add(Fraction other)`** - сложение с другой дробью
- **`add(int number)`** - сложение с целым числом
- **`subtract(Fraction other)`** - вычитание другой дроби
- **`subtract(int number)`** - вычитание целого числа
- **`multiply(Fraction other)`** - умножение на другую дробь
- **`multiply(int number)`** - умножение на целое число
- **`divide(Fraction other)`** - деление на другую дробь (с проверкой деления на ноль)
- **`divide(int number)`** - деление на целое число (с проверкой деления на ноль)

### Методы класса Number
- **`intValue()`** - возвращает целую часть дроби (дробная часть отбрасывается)
- **`longValue()`** - возвращает значение как long
- **`floatValue()`** - возвращает значение как float
- **`doubleValue()`** - возвращает значение как double

### Вспомогательные методы
- **`gcd(int a, int b)`** - вычисляет НОД (наибольший общий делитель) алгоритмом Евклида
- **`toString()`** - строковое представление дроби (например, "3/4" или "5")
- **`equals(Object obj)`** - сравнение дробей с учетом сокращения
- **`hashCode()`** - вычисление хеш-кода дроби

<img width="952" height="723" alt="{5E0E580B-F512-444D-A895-5584BB5430E1}" src="https://github.com/user-attachments/assets/87e8dd8d-aed6-4f4b-8367-a8699417c2e2" />  
<img width="367" height="490" alt="{932EF120-9052-4437-B531-0990185C5D8D}" src="https://github.com/user-attachments/assets/19bd5d70-adbd-42f2-b5f5-7f56ea4a49f7" />  
  
<img width="754" height="336" alt="{8F047B07-2369-4D86-9C05-1044A306C4EC}" src="https://github.com/user-attachments/assets/d6c143ca-303b-4dfc-bfb9-310311d03d8d" />    
<img width="234" height="118" alt="{E2E9EDCC-49AF-40F0-84C7-F83C4D0B69EC}" src="https://github.com/user-attachments/assets/4116e046-ba1c-4149-8353-d57b64d9ff1d" />



## Класс City

### Конструкторы
- **`City(String name)`** - создает город без маршрутов
- **`City(String name, Map<City, Integer> initialRoutes)`** - создает город с начальными маршрутами

### Основные методы
- **`addRoute(City targetCity, int weight)`** - добавляет маршрут в другой город с расстоянием
- **`removeRoute(City targetCity)`** - удаляет маршрут в указанный город
- **`getRoutes()`** - возвращает копию карты маршрутов
- **`hasRouteTo(City targetCity)`** - проверяет существование прямого маршрута
- **`getRouteDistance(City targetCity)`** - возвращает расстояние до города

### Вспомогательные методы
- **`isValidRoute(City targetCity, int weight)`** - проверяет корректность параметров маршрута
- **`toString()`** - подробное строковое представление города с маршрутами
- **`equals(Object obj)`** - сравнение городов (по имени и маршрутам)
- **`hashCode()`** - хеш-код на основе имени города


<img width="786" height="697" alt="{9D4A6A2D-1D03-464D-BE18-756FE25CBED6}" src="https://github.com/user-attachments/assets/88444604-e618-4768-b713-2a1beafbec3c" />  
<img width="1095" height="721" alt="{CE78A6A2-0E00-46BB-A7A7-CD27C1338198}" src="https://github.com/user-attachments/assets/66682a41-40c0-4c36-b50b-867870abff69" />  
<img width="925" height="538" alt="{68C197AE-6551-4354-A73D-F189D5A891F4}" src="https://github.com/user-attachments/assets/53049948-5cef-4a84-9fe0-ea2b317fe0b2" />  
<img width="551" height="741" alt="{280E031D-0077-4DDD-98BF-CFAF450F156C}" src="https://github.com/user-attachments/assets/415ded59-67d6-475b-a629-0a9737490d07" />  
<img width="479" height="135" alt="{C1D9A518-2C0E-48FF-BF2A-E88CF094E67F}" src="https://github.com/user-attachments/assets/f1a9fe9f-7a54-4c43-bb6d-5f63dc800d3d" />  

## Класс Route

### Конструкторы
- **`Route(City start, City end)`** - создает маршрут между двумя городами

### Основные методы
- **`getRoute()`** - возвращает массив городов маршрута (использует BFS для поиска пути)
- **`getRouteLength()`** - возвращает количество городов в маршруте
- **`isRouteExists()`** - проверяет существование маршрута

### Сеттеры
- **`setStart(City start)`** - устанавливает город начала маршрута
- **`setEnd(City end)`** - устанавливает город конца маршрута

### Вспомогательные методы
- **`buildPath(Map<City, City> previous)`** - восстанавливает путь из карты предыдущих городов
- **`toString()`** - строковое представление маршрута

## Классы людей (Human, HumanWithName, Name)

### Human
- **`Human(String name, int height)`** - создает человека с именем и ростом
- **`setHeight(int height)`** - устанавливает рост (100-220 см)
- **`toString()`** - формат: "Имя, рост: 180"

### HumanWithName
- **`HumanWithName(Name name, int height)`** - создает человека с объектом Name и ростом
- **`HumanWithName(HumanWithName humanWithName)`** - конструктор копирования

### Name
- **`Name(String secondName, String name, String patronymic)`** - создает ФИО
- **`toString()`** - объединяет компоненты в строку (например, "Иванов Иван Иванович")

## Утилитарные классы

### SimpleSum
- **`sum(double... numbers)`** - суммирует произвольное количество чисел

### Pow
- **`powCustom(String xStr, String yStr)`** - возводит число в степень (принимает строки)

### Dot
- **`Dot(int x, int y)`** - создает точку с координатами
- **`clone()`** - создает копию точки
- **`setCoordinate(int x, int y)`** - устанавливает координаты
- **`toString()`** - формат: "{x;y}"
