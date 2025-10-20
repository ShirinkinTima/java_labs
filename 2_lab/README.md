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

<img width="185" height="233" alt="{66AC4879-D7E7-47D2-A0E9-022ACF5A5AB4}" src="https://github.com/user-attachments/assets/5887523f-9108-4ddc-bb0d-8ac0c51164ce" />

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
