# О проекте 

<p>Предназначен для закрепления знаний, полученных при изучении блока посвященного ООП из <a href="https://github.com/Javandy58/job4j_elementary">курса по основам языка Java</a>.</p>
<p>Этот проект - консольное приложение. После запуска пользователю отображается меню с возможностями программы. Программа просит ввести в консоль пункт меню для дальнейшего действия. Например, пользователь ввел цифру 0. Система просит пользователя ввести имя заявки. После этого действия система сохраняет в памяти заявку и снова отображает пункты меню. Если пользователь выбрал пункт 6 - это будет выход из программы, т.е. программа закрывается.</p>
<h2>Структура проекта</h2>
<ul>
  <li>Данные будут храниться в памяти. Хранилище будет описывать класс <a href="https://github.com/Javandy58/job4j_tracker/blob/master/src/main/java/ru/job4j/tracker/MemTracker.java">ru.job4j.tracker.MemTracker</a></li>
  <li>Так же описано хранилище основанное на базе данных <a href="https://github.com/Javandy58/job4j_tracker/blob/master/src/main/java/ru/job4j/tracker/SqlTracker.java">ru.job4j.tracker.SqlTracker</a></li>
  <li><a href="https://github.com/Javandy58/job4j_tracker/blob/master/src/main/java/ru/job4j/tracker/Item.java">ru.job4j.tracker.Item</a> объект этого класса будет описывать модель данных</li>
  <li>Объект для управления меню <a href="https://github.com/Javandy58/job4j_tracker/blob/master/src/main/java/ru/job4j/tracker/StartUI.java">ru.job4j.tracker.StartUI</a></li>
</ul>
