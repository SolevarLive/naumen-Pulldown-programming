package ru.oop.task2;

/**
 * Человек
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
interface Person extends Positioned {

    /**
     * Пройти до указанного места из текущего местоположения
     *
     * @param destination место назначения
     */
    void walk(Position destination);

    /**
     * Посадка в транспорт, если человек находится на месте посадки
     * Если нет доходит до этого места
     *
     * @param transport средство передвижения
     */
    void board(Transport transport);
}
