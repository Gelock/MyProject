package com.javarush.task.task26.task2613.command;

import com.javarush.task.task26.task2613.exception.InterruptOperationException;

/**
 * Created by Sashka on 03.11.2016.
 */
interface Command
{
    void execute() throws InterruptOperationException;
}
