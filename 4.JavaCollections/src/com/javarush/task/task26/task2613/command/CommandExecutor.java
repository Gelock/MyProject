package com.javarush.task.task26.task2613.command;

import com.javarush.task.task26.task2613.Operation;
import com.javarush.task.task26.task2613.exception.InterruptOperationException;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sashka on 03.11.2016.
 */
public class CommandExecutor
{
    private static Map<Operation, Command> commands = new HashMap<>();

    private CommandExecutor()
    {
    }

    static
    {
        commands.put(Operation.LOGIN, new LoginCommand());
        commands.put(Operation.INFO, new InfoCommand());
        commands.put(Operation.DEPOSIT, new DepositCommand());
        commands.put(Operation.WITHDRAW, new WithdrawCommand());
        commands.put(Operation.EXIT, new ExitCommand());
    }

    public static final void execute(Operation operation) throws InterruptOperationException
    {
        commands.get(operation).execute();
    }
}