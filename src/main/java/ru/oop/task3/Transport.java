package ru.oop.task3;

/**
 *  Различные виды транспорта.
 */
interface Transport extends Positioned {

    /**
     * Перемещение к месту назначения человека.
     *
     * @param destination место назначения.
     * @param person человек
     */
    void drive(Position destination, Person person);
}