Курсовая работа
Требуется сделать новостной сайт



1) Сделать макет в figma 80%
2) Написать UML 20%
3) Написать бэк 0%
4) Научиться работать с БД 0%
5) Подружить бэк с бд 0%
6) Понять как работает Spring boot 0%
7) Подружить бэк с фронтом 0%
8) Написать HTML и CSS 1%


Осталось 72	 дней	

https://www.figma.com/file/eDbjipnnu5NkJQD2LIBbJz/%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D1%82%D0%BD%D0%BE%D0%B9-%D1%81%D0%B0%D0%B9%D1%82?node-id=0%3A1


Работники:
1) Администратор(Admin)
	* составление списков сотрудников
		* добавление сотрудника
			* Фамилия Имя Отчество email password должность отдел(по возможности)
		* права доступа
			* По нажатию на сотрудника в компании будет открываться отдельная страница с информацией о нём


/ у каждоко сотрудника таблица задач:
	дедлайн,
	тема,
	описание,
	участники задачи,
/ 
	
2) Главный редактор(CheafEditor) (основной параметр дедлайн) 
	* Составление тем новостного выпуска и распределение их по отделам
		* Создание новости
		* Выбор отдела
	* Проверка наличия подготовленных публикаций
		Вывод списка публикаций

3) Редактор отдела(DepartmentEditor) (основной параметр темы) 
	* (Read Only) список тем
	* Составление списка публикаций (задачи) и распределение их по авторам
		
	* Редактирование публикации

	* Разрешение на выкладку публикации на сайт

4) Автор
	* Подготовка публикации
	* Исправление замечаний редактора отдела

В дедлайн пишется набор тем, которые распределяются по отделам (темам), которые в свою очередь Редактор отдела распределяет задачи (по теме отдела) по авторам.

figma: 
1) Готова админ-панель
	* done дописать создание департаментов
2) Генеральный редактор
3) Редактор отдела
4) Автор
5) done Написать основную страницу


Написал тестовый класс для понимая как использовать дедлайны и как работают ссылки в java

Пытаюсь понять как правильно спроектировать написать ядро программы
* Написал что-то похожее на правду но очень карявую правду (папка logic)
* Написал ещё скелет классов работников (папка person)
* В основном файле сделал проверку работоспособности классов

Не знаю как раздать доступ

Загуглить как делать веб интерфейс
Начать с бд и каким образом хранить экземпляры классов


К каждому классу человека добавил ID для работы с JPA

Отношения между темами и постами будет OneToMany
Отношение между департаментами и сотрудниками OneToMany