# **Коллекции Queue**.

Перед Вами симулятор аттракциона!
Каждый человек, который посетил парк аттракционов, описан в классе ```Person```. Про каждого человека известно его имя, фамилия и количество билетов.

В классе ```Main``` создан статический метод ```List<Person> generateClients() {```, который возвращает список из 5 людей.

В ```main``` создана очередь на аттракцион ```Queue<Person> queue```. Она заполнена людьми из списка, который возвращает метод ```generateClients()```.

Далее задан бесконечный цикл ```while (!queue.isEmpty()) {```, который делает итерации пока очередь не будет пуста. На каждой итерации из очереди вытаскивается следующий клиент и на экран выводится сообщение вида: "Максим Горький прокатился на аттракционе". При этом у клиента уменьшается количество билетов на 1 и, если оно не стало нулевым, он вставляется обратно в очередь, в её конец.