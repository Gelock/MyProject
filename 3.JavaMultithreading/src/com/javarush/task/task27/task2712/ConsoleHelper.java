package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sashka on 21.12.2016.
 */
public class ConsoleHelper
{
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message)
    {
        System.out.println(message);
    }

    public static String readString() throws IOException
    {
        return reader.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException
    {
        List<Dish> dishes = new ArrayList<>();
        while (true)
        {
            String input = readString();
            if ("exit".equals(input))
            {
                break;
            }

            try
            {
                Dish dish = Dish.valueOf(input);
                dishes.add(dish);
            }
            catch (IllegalArgumentException e)
            {
                writeMessage(input + " is not detected");
            }
        }
        return dishes;
    }

}
