package Invoker;

import Command.ICommand;

import java.util.Stack;

public class TextEditorInvoker {

    Stack<ICommand> executeHistory = new Stack<>();
    Stack<ICommand> undoHistory = new Stack<>();

    public void executeCommand(ICommand iCommand)
    {
        iCommand.execute();
        executeHistory.push(iCommand);
    }

    public void undo()
    {
         if(!executeHistory.isEmpty())
         {
             ICommand iCommand= executeHistory.pop();
             iCommand.undo();
             undoHistory.push(iCommand);
         }
    }

    public void redo()
    {
        if(!undoHistory.isEmpty())
        {
            ICommand iCommand = undoHistory.pop();
            iCommand.execute();
            executeHistory.push(iCommand);
        }
    }
}
