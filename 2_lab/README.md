# Ширинкин Тимофей ИТ-12-2024  
Файл src содержит классы для решения Лабороторной работы 2, вариант 2

## Класс Human

### Методы:
- **Конструкторы**
  - `Human(String name, int height)` - создание объекта с именем и ростом
  - `Human()` - конструктор по умолчанию (name=null, height=160)

- **Сеттеры**
  - `setName(String name)` - установка имени
  - `setHeight(int height)` - установка роста (только 100-220 см)

- **Геттеры**
  - `getName()` - получение имени
  - `getHeight()` - получение роста

- **Другие методы**
  - `toString()` - строковое представление в формате "Имя, рост: X"
 
## Класс Name

### Методы:
- **Конструкторы**
  - `Name()` - конструктор по умолчанию (все поля null)
  - `Name(Name name)` - конструктор копирования
  - `Name(String secondName, String name, String patronymic)` - создание с ФИО

- **Сеттеры**
  - `setSecondName(String secondName)` - установка фамилии
  - `setName(String name)` - установка имени
  - `setPatronymic(String patronymic)` - установка отчества

- **Геттеры**
  - `getSecondName(): String` - получение фамилии
  - `getName(): String` - получение имени
  - `getPatronymic(): String` - получение отчества

- **Другие методы**
  - `toString(): String` - форматированный вывод ФИО (ненулевые поля через пробел)


<img width="924" height="412" alt="{DFAF521A-CDEC-4793-98F0-15843568A287}" src="https://github.com/user-attachments/assets/3867934c-c6ec-4e0d-9177-fb303f19b898" />  
<img width="390" height="224" alt="{584639E3-8DFD-4928-B4A5-B039B74D27B5}" src="https://github.com/user-attachments/assets/d8be59d8-59a7-42a9-b393-a8847ebda7bf" />  


## Класс HumanWithName

### Методы:
- **Конструкторы**
  - `HumanWithName(Name name, int height)` - создание с объектом Name и ростом
  - `HumanWithName()` - конструктор по умолчанию (name=null, height=160)
  - `HumanWithName(HumanWithName humanWithName)` - конструктор копирования

- **Сеттеры**
  - `setName(Name name)` - установка объекта Name
  - `setHeight(int height)` - установка роста (только 100-220 см)

- **Геттеры**
  - `getName(): Name` - получение объекта Name
  - `getHeight(): int` - получение роста

- **Другие методы**
  - `toString(): String` - строковое представление "Name, рост: X"

<img width="932" height="330" alt="{72BCF015-2669-47FB-8DCB-C980FF8CD7AF}" src="https://github.com/user-attachments/assets/c3d84a14-17fb-45d1-8201-6ec0eb7b28fd" />  
<img width="438" height="211" alt="{4C3234E2-7D02-485F-BC17-6FFFB2CA9B90}" src="https://github.com/user-attachments/assets/244f1e36-e623-4270-a32f-d581fabbf293" />

 
## Класс City

### Методы:
- **Конструкторы**
  - `City(String city)` - создание города с пустыми маршрутами
  - `City(String city, Map<City, Integer> routes)` - создание с готовыми маршрутами

- **Сеттеры/Геттеры**
  - `getCityName(): String` - получение названия города
  - `setCityName(String city)` - установка названия города

- **Работа с маршрутами**
  - `addRoute(City targetCity, int weight)` - добавление маршрута к городу с весом
  - `removeRoute(City targetCity)` - удаление маршрута к указанному городу
  - `getRoutes(): Map<City, Integer>` - получение копии карты маршрутов

- **Другие методы**
  - `toString(): String` - форматированный вывод города и его маршрутов

<img width="731" height="508" alt="{DF3E86D7-4D45-4A66-BBA0-3662FA412A07}" src="https://github.com/user-attachments/assets/c9c2c4bd-e3af-4639-b715-e50f311c02c0" />
<img width="487" height="493" alt="{F65B53A2-BDC5-4530-A9DE-11ED5F58561C}" src="https://github.com/user-attachments/assets/6d8f2ebf-343e-45af-a986-7665adbbda3e" />
<img width="580" height="799" alt="{008210D6-B360-40C1-ACBC-0039E4ED6C69}" src="https://github.com/user-attachments/assets/2a3a2201-bad7-4dd3-9b00-01f3c3b5cd22" />  


## Класс Fraction

### Методы:
- **Конструкторы**
  - `Fraction(int numerator, int denominator)` - создание дроби
  - `Fraction(int numerator)` - создание дроби с знаменателем 1

- **Сеттеры/Геттеры**
  - `setNumerator(int numerator)` - установка числителя
  - `setDenominator(int denominator)` - установка знаменателя (≠0)
  - `getNumerator(): int` - получение числителя
  - `getDenominator(): int` - получение знаменателя

- **Арифметические операции**
  - `add(Fraction other)` - сложение с дробью
  - `add(int number)` - сложение с целым числом
  - `subtract(Fraction other)` - вычитание дроби
  - `subtract(int number)` - вычитание целого числа
  - `multiply(Fraction other)` - умножение на дробь
  - `multiply(int number)` - умножение на целое число
  - `divide(Fraction other)` - деление на дробь
  - `divide(int number)` - деление на целое число

- **Вспомогательные методы**
  - `gcd(int a, int b): int` - нахождение НОД (приватный)
  - `simplify(): Fraction` - сокращение дроби (приватный)

- **Другие методы**
  - `toString(): String` - строковое представление в формате "a/b"

<img width="701" height="466" alt="{F52327BA-0294-4BAB-92F7-8F19AD9007EE}" src="https://github.com/user-attachments/assets/614782d6-a411-4c14-88d8-9b56b43ffae2" />
<img width="377" height="333" alt="{DDE4B49D-CE8C-49FA-8E35-5C77CB074B80}" src="https://github.com/user-attachments/assets/a292546c-ae1e-4d89-8873-64f7cd9f2756" />
