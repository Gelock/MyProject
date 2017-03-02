package com.javarush.task.task27.task2712.statistic.event;

import java.util.Date;

/**
 * Created by Sashka on 27.12.2016.
 */
public interface EventDataRow
{
    EventType getType();

    Date getDate();

    int getTime();
}
