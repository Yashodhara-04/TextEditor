package Receiver;

public class TextCommand {
    StringBuilder contentData = new StringBuilder();

    public void insertText(String content, int position)
    {
        if(position > contentData.length())
        {
            contentData.append(new String(new char[position -contentData.length()]).replace('\0', ' '));
        }
        contentData.insert(position,content);
    }

    public void deleteText(int startIndex, String text)
    {
        int endIndex = startIndex + text.length();
        contentData.delete(startIndex, endIndex);
    }

    public String showContent()
    {
        int stratPosition = contentData.toString().length();
        return contentData.toString() + "(Next Start Position : " +  stratPosition + " )";
    }
}
