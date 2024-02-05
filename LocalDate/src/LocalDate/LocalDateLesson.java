package LocalDate;

import java.time.LocalDate;
import java.util.Date;

public class LocalDateLesson {

public static void main(String[] args) {
	//	### Задание 1: Отображение текущей даты и времени
//	- Создайте программу, которая выводит на экран текущую дату и время в формате "год-месяц-день час:минута:секунда".+++
//	Date date = new Date();
//  System.out.println(date);
//
//	### Задание 2: Работа с датой рождения
//	- Введите свою дату рождения в объект `LocalDate`.+++
//	LocalDate my = LocalDate.of(2010, 2, 27);
//	System.out.println(my);
//	- Выведите на экран текущую дату и сколько вам лет.+++
//     LocalDate local = LocalDate.now();
//     int year = 14;
//     System.out.println(local + " " + year);
//	### Задание 3: Разница между датами
//
//	- Введите две даты (например, сегодня и следующий месяц).---
//	int month = currentDate.getMonthValue();
//	LocalDate month1 = currentDate.plusMonths(1);
//	
//	- Найдите разницу в днях между этими датами.---
//
//	### Задание 4: Работа с временем
//
//	- Создайте метод, который выводит текущее время в формате "час:минута:секунда".+
//	LocalTime time = LocalTime.now();
//	System.out.println(time);
//	- Проверьте, является ли текущее время утренним (до 12:00) или вечерним.---
//	### Задание 5: Определение времени года и ближайшего праздника
//
//	- Введите текущую дату.+
//	LocalDate now2 = LocalDate.now();
//	- Определите, в какое время года она попадает (весна, лето, осень, зима).+
//	int[] winter =  new int[3];
//	winter[0] =  0;
//	winter[1] =  1;
//	winter[2] =  2;
//	int[] spring =  new int[3];
//	spring[0] = 3;
//	spring[1] = 4;
//	spring[2] = 5;
//	int[] summer =  new int[3];
//	summer[0] = 6;
//	summer[1] = 7;
//	summer[2] = 8;
//	int[] autumn =  new int[3];
//	autumn[0] = 9;
//	autumn[1] = 10;
//	autumn[2] = 11;
//	
//	if(now2.getMonthValue() == winter[0] || now2.getMonthValue() == winter[1] || now2.getMonthValue() == winter[2]) {
//		System.out.println("Сейчас зима");
//	} else if (now2.getMonthValue() == spring[0] || now2.getMonthValue() == spring[1] || now2.getMonthValue() == spring[2]) {
//		System.out.println("Сейчас весна");
//	} else if(now2.getMonthValue() == summer[0] || now2.getMonthValue() == summer[1] || now2.getMonthValue() == summer[2]) {
//		System.out.println("Сейчас лето");
//	} else if(now2.getMonthValue() == autumn[0] || now2.getMonthValue() == autumn[1] || now2.getMonthValue() == autumn[2]) {
//		System.out.println("Сейчас осень");
//	}
//	- Создайте список праздников и определите, когда будет следующий ближайший праздник.---


}}