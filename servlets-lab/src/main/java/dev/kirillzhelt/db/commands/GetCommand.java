package dev.kirillzhelt.db.commands;

import dev.kirillzhelt.db.commands.params.CommandParams;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * Base interface for commands that works on get
 */
public interface GetCommand extends Command {

    void executeGet(CommandParams params) throws ServletException, IOException;

}
