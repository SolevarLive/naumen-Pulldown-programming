package ru.oop.task3;

/**
 *  Различные виды транспорта.
 */
interface Transport extends Positioned {

    /**
     * Перемещение к месту назначения.
     *
     * @param destination место назначения.
     */
    void drive(Position destination);
}