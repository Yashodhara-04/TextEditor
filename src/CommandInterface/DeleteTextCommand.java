package CommandInterface;

import Receiver.TextCommand;

public class DeleteTextCommand implements  ICommand{
    TextCommand textCommand;
    String text ;
    int startPosition;

    public DeleteTextCommand(TextCommand textCommand,String text, int startPosition) {
        this.textCommand = textCommand;
        this.text = text;
        this.startPosition = startPosition;
    }

    @Override
    public void execute() {
        textCommand.deleteText(startPosition, text);
    }

    @Override
    public void undo() {
        textCommand.insertText(text, startPosition);
    }
}
