package com.Vigenere;
/**
 * @author Ccama
 */
public class Model_Vigenere {

    private String table = "abcdefghijklmnñopqrstuvwxyzáéíóúABCDEFGHIJKLMNÑOPQRSTUVWXYZ" +
            "ÁÉÍÓÚ1234567890.,;_:+-*/ @$€#¿?!¡=()[]{}\\\"";

    public String Cleaning_text(String text)
    {
        text = text.replaceAll("\n", "");

        for(int x = 0; x < text.length(); x++)
        {
            int position = table.indexOf(text.charAt(x));
            if (position == -1)
            {
                text= text.replace(text.charAt(x), ' ');
            }
        }
        return text;
    }

    public String Encrypt(String text, String key)
    {
        String cleaned_text = Cleaning_text(text);
        String encrypted = "";

        for(int t = 0,k = 0; t < cleaned_text.length(); t++, k = (k + 1) % key.length())
        {
            int position = (table.indexOf(cleaned_text.charAt(t)) + table.indexOf(key.charAt(k))) % table.length();
            encrypted += table.charAt(position);
        }
        return encrypted;
    }

    public String Descrypt(String text, String key)
    {
        String cleaned_text = Cleaning_text(text);
        String decrypted = "";

        for(int t = 0, k = 0; t < cleaned_text.length(); t++, k = (k + 1) % key.length())
        {
            int position = (table.indexOf(cleaned_text.charAt(t)) - table.indexOf(key.charAt(k)));
            position = (position < 0)?(position + table.length()): position;
            decrypted += table.charAt(position);
        }
        return decrypted;
    }

}
