Homework 2.
Домашняя работа на срд, чтв.


Создать ветку от существующего проекта gitHub: https://github.com/AndesTechConsulting3/JavaSE-Day05-Homework2.git
Имя ветки должно содержать строку rfb, например VasilyPetrov-rfb-branch-home2.

Создать класс Customer Создать поля firstName, secondName, age, address.
Создать абстрактный класс Account. Добавить поля Customer, ballance, accountId.
Добавить абстрактные методы withdrawal, putMoney.
(можно скопировать часть из предыдущей дом. работы)

Создать классы счетов DebitAccount и CreditAccount как потомки Account.
Реализовать методы withdrawal, putMoney.

Конструктор в классе CreditAccount сделать закрытым. Создание счёта сделать через фабричный метод.
При этом в методе должна проверяться "кредитная история", возраст и в случае отказа 
(несоответствия выбраннам параметрам - решите сами, каким),
счёт создаваться не должен. 

Конструктор в классе DebitAccount сделать открытым.

Создать закрытые статические поля (константные) в классах счетов, определяющие лимиты по снятию средств,
а также лимиты по остаткам и избыткам.

Проверять лимиты перед выполнением действий с балансом в методах
withdrawal, putMoney.

Протестировать конфигурацию. 

Сделать коммит и пуш Вашей ветки.
