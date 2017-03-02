package com.javarush.task.task26.task2613;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sashka on 03.11.2016.
 */
public class CurrencyManipulatorFactory
{
    private static Map<String, CurrencyManipulator> manipulators = new HashMap<>();

    private CurrencyManipulatorFactory()
    {
    }

    public static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode)
    {
        for (Map.Entry<String, CurrencyManipulator> pair : manipulators.entrySet())
        {
            if (pair.getKey().equals(currencyCode))
            {
                return pair.getValue();
            }
        }
        CurrencyManipulator newCM = new CurrencyManipulator(currencyCode);
        manipulators.put(currencyCode, newCM);
        return newCM;
    }

    public static Collection<CurrencyManipulator> getAllCurrencyManipulators()
    {
        return manipulators.values();
    }
}
