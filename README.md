Collection
_________________________
Задание 2:
1. Сравнение ArrayList и LinkedList.
LinkedList необходим тогда, когда нам важна вставка и удаление элемента из середины списка, так как в случае ArrayList приходится передвигать элементы. 
При добавлении в начало списка же ArrayList выигрывает
При изменении элемента, поиска по индексу, поиска по значению, удалении целесообразно использовать ArrayList, так как все данные расположены в одном блоке, чото облегчает поиск.

2. Сравнение HashSet, LinkedHashSet, TreeSet.
ADD TO END
HashSet: 38300
LinkedHashSet: 36300
TreeSet: 37800
Здесь же результаты достаточно схожи.

REMOVE
HashSet: 47400
LinkedHashSet: 44500
TreeSet: 97500
В удалении лидирует в плохом смысле TreeSet.

3.HashMap, LinkedHashMap, TreeMap.

PUT
HashMap: 45000
LinkedHashMap: 51200
TreeMap: 51700
TreeMap плоха из-за функции сортировки.

GET
HashMap: 59000
LinkedHashMap: 252100
TreeMap: 108400

LinkedHashMap плоха так как все объекты, находятся в разных местах.

REMOVE
HashMap: 54000
LinkedHashMap: 50800
TreeMap: 492000


