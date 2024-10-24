package ru.oop.task2;

/**
 *  Транспорт.
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