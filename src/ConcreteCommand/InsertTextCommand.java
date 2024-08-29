package ConcreteCommand;

import Command.ICommand;
import Receiver.TextCommand;

public class InsertTextCommand implements ICommand {
    TextCommand textCommand= null;
    String text;
    int startPosition;

    public InsertTextCommand(TextCommand textCommand, String text, int startPosition) {
        this.textCommand = textCommand;
        this.text = text;
        this.startPosition = startPosition;
    }

    @Override
    public void execute() {
        textCommand.insertText(text,startPosition);
    }

    @Override
    public void undo() {
        textCommand.deleteText(startPosition, text);
    }

}
