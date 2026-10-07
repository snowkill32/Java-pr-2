# Java пр-2

Практическая работа №2 по дисциплине «Программирование на языке Джава».
Группа: УНБО-04-25. Преподаватель: Рачков А. В.

## Скачать работу

- [Скачать отчёт Word](https://github.com/snowkill32/Java-pr-2/raw/refs/heads/main/report.docx).
- [Скачать архив со всей работой](https://github.com/snowkill32/Java-pr-2/raw/refs/heads/main/java-pr-2.zip).
- [Весь код в одном файле](code.txt).
- [Порядок сдачи и объяснения](defense.txt).

Для Word и ZIP используйте ссылки «Скачать» выше. Они скачивают сами файлы.
Если открыли страницу файла на GitHub, нажмите **Download raw file**.
Сохранение веб-страницы браузером сохраняет страницу GitHub, а не документ Word.

## Отдельные файлы Java

Каждый класс находится в своём `.java`-файле. Ниже прямые ссылки на все семь файлов.

| Часть | Пакет | Файлы |
| --- | --- | --- |
| 1 | `vehicles` | [Car.java](part1/src/vehicles/Car.java), [ElectricCar.java](part1/src/vehicles/ElectricCar.java) |
| 1 | `app` | [Main.java](part1/src/app/Main.java) |
| 2 | `vehicles` | [Vehicle.java](part2/src/vehicles/Vehicle.java), [Car.java](part2/src/vehicles/Car.java), [ElectricCar.java](part2/src/vehicles/ElectricCar.java) |
| 2 | `app` | [TestCar.java](part2/src/app/TestCar.java) |

```text
part1/
  src/
    vehicles/
      Car.java
      ElectricCar.java
    app/
      Main.java
  output.txt
part2/
  src/
    vehicles/
      Vehicle.java
      Car.java
      ElectricCar.java
    app/
      TestCar.java
  output.txt
```

`code.txt` — дополнительный файл для чтения всего кода.
Для запуска используйте `.java`-файлы. Каждая часть запускается отдельно.
Названия папок и файлов в архиве записаны латиницей. Текстовые файлы `.txt`
сохранены в UTF-8 с BOM для открытия в Windows; Java-файлы — в UTF-8 без BOM.

## Запуск

Нужен JDK 8 или новее. Дополнительные библиотеки не нужны.
Код использует обычные поля, конструкторы, многострочные геттеры и сеттеры,
наследование и методы. Абстрактный класс и полиморфизм включены по заданию.
Отчёт оформлен по последнему присланному шаблону с полными условиями и
скриншотами фактической проверки программ. В отчёте приведён полный код всех
семи файлов, а в самом конце — полный вывод обеих программ.
В IntelliJ IDEA откройте `part1` или `part2`, отметьте `src` как Sources Root
и запустите `Main` или `TestCar`.

Для запуска в терминале из корня репозитория:

### Часть 1

```powershell
cd part1
javac -encoding UTF-8 -d out src/vehicles/Car.java src/vehicles/ElectricCar.java src/app/Main.java
java -Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8 -cp out app.Main
```

### Часть 2

Откройте новый терминал в корне репозитория:

```powershell
cd part2
javac -encoding UTF-8 -d out src/vehicles/Vehicle.java src/vehicles/Car.java src/vehicles/ElectricCar.java src/app/TestCar.java
java -Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8 -cp out app.TestCar
```

Обе части проверены компиляцией и запуском. Результаты находятся в `output.txt`.
