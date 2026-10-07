Практическая работа №2

Каждая часть запускается отдельно. Дополнительные библиотеки не нужны.
Нужен JDK версии 8 или новее. В IntelliJ IDEA можно открыть папку нужной
части, отметить src как Sources Root и запустить Main или TestCar.

Запуск из терминала: сначала перейдите в папку соответствующей части.

Часть 1:
javac -encoding UTF-8 -d out src/vehicles/Car.java src/vehicles/ElectricCar.java src/app/Main.java
java -Dfile.encoding=UTF-8 -cp out app.Main

Часть 2:
javac -encoding UTF-8 -d out src/vehicles/Vehicle.java src/vehicles/Car.java src/vehicles/ElectricCar.java src/app/TestCar.java
java -Dfile.encoding=UTF-8 -cp out app.TestCar

В папке каждой части сохранён результат запуска в файле Результат.txt.
Отчёт находится в отдельном файле Word.
