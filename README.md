Collection
_________________________
Задание 2:
1. Сравнение ArrayList и LinkedList.
LinkedList необходим тогда, когда нам важна вставка и удаление элемента из середины списка, так как в случае ArrayList приходится передвигать элементы. 
При добавлении в начало списка же ArrayList выигрывает
При изменении элемента, поиска по индексу, поиска по значению, удалении целесообразно использовать ArrayList, так как все данные расположены в одном блоке, чото облегчает поиск.
2. Сравнение HashSet, LinkedHashSet, TreeSet.
В функции удаления самым худщим алгоритмом является TreeSet.
По добавлению элемента лидирует LinkedHashSet.
3.HashMap, LinkedHashMap, TreeMap.
Так как в TreeMap есть функция сортировки, то операция вставки значительна медленее его противников (Но HashMap быстрее LinkedHashMap). 
Также она достаточна плоха в функции Get.
При удалении лидирует в обратную сторону HashMap.