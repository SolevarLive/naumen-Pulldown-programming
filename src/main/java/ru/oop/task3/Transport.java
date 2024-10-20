package ru.oop.task3;

/**
 *  Различные виды транспорта.
 */
interface Transport extends Positioned {

    /**
     * Посадка в транспорт, если человек находится на месте посадки
     * если нет доходит до этого места
     *
     * @param person человек
     */
    void board(Person person);

    /**
     * Перемещение к месту назначения.
     *
     * @param destination место назначения.
     */
    void drive(Position destination);
}