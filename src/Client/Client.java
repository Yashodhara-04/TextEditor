package Client;

import CommandInterface.DeleteTextCommand;
import CommandInterface.ICommand;
import CommandInterface.InsertTextCommand;
import Invoker.TextEditorInvoker;
import Receiver.TextCommand;

import java.util.Scanner;

public class Client {
    Scanner sc = new Scanner(System.in);
    TextCommand textCommand = new TextCommand();
    TextEditorInvoker textEditorInvoker = new TextEditorInvoker();

    public void runApplication()
    {
        while(true)
        {
            action();
        }
    }

    public void action()
    {
        System.out.println("\n1.Insert Text\n2.Delete Text\n3.Undo Text \n4.Redo Text\n5.Show Text \n6.Exit");
        int choice = getInputInteger("Enter the Choice: ");
        switch (choice)
        {
            case 1 ->
            {
                String text = getInputString("Enter Text to Insert: ");
                int startPosition = getInputInteger("Enter Starting position: ");
                InsertTextCommand insertTextCommand = new InsertTextCommand(textCommand, text, startPosition);
                textEditorInvoker.executeCommand(insertTextCommand);
            }
            case 2 ->
            {
                String text = getInputString("Enter Text to Delete: ");
                int startPosition = getInputInteger("Enter Starting position");
                if(isValidStrng(text, startPosition))
                {
                    DeleteTextCommand deleteTextCommand = new DeleteTextCommand(textCommand, text, startPosition);
                    textEditorInvoker.executeCommand(deleteTextCommand);
                }
                else {
                    System.out.println("Incorrect Index!!");
                }
            }
            case 3 ->
            {
                textEditorInvoker.undo();
            }
            case 4 ->
            {
                textEditorInvoker.redo();
            }
            case 5 ->
            {
                System.out.println("\n Content: " + textCommand.showContent());
            }
            case 6 ->
            {
                System.out.println("Exiting");
            }
            default ->
            {

            }

        }
    }

    public boolean isValidStrng(String text, int startIndex)
    {
        boolean isValid = false;
        String contentData = textCommand.showContent();
        int endIndex = startIndex + text.length();
        if((startIndex < contentData.length() && endIndex < contentData.length()) && contentData.substring(startIndex, endIndex).equalsIgnoreCase(text))
        {
            isValid = true;
        }
        return isValid;
    }

    public int getInputInteger(String message)
    {
        boolean valid = false;
        int result = 0;
        while(!valid)
        {
            try
            {
                System.out.println(message);
                result = Integer.parseInt(sc.nextLine());
                valid = true;
            }
            catch (Exception ex)
            {
                System.out.println("Input data must be an integer!!");
            }
        }

        return result;
    }

    public String getInputString(String message)
    {
        System.out.println(message);
        String result = sc.nextLine();
        return result;
    }


}
