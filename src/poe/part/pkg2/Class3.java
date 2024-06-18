package poe.part.pkg2;
class Class3
{
    public boolean CheckUserName(String username)
    {
        if (username.length() <= 5) 
        {
            System.out.print("Username successfully captured");
        } else 
        {
            System.out.print("Username is not correctly formatted,please ensure that your username contains an underscore and is no more than 5 characters in length");
        }
        if (username.contains("_"))
        {
            return true;
        } else 
        {
            return false;
        }

    }

    public boolean CheckPasswordComplexity(String password) 
    {
        if (password.length() > 8) 
        {
            if (CheckPass(password)) 
            {
                return true;
            } else 
            {
                return false;
            }
        }
        return false;
    }

    public boolean CheckPassword(String password)
    {
        boolean hasNum = false;
        boolean hasCap = false;
        char c;
        for (int i = 0; i < password.length(); i++)
        {
            c = password.charAt(i);
            if (Character.isDigit(c));
            {
                hasNum = true;
            }

            if (Character.isUpperCase(c)) 
            {
                hasCap = true;
            }
            if (hasNum && hasCap) 
            {
                return true;
            }

        }
        return false;
    }

    public boolean checkpasswordcomplexity(String password)
    {
        boolean hasSpecialChar = false;
        String SpecialChar[] = {"@", "$", "!", "~", "#"};

        int count = 0;
        while (count < SpecialChar.length) {
            if (password.contains(SpecialChar[count])) {
                hasSpecialChar = true;
                count = SpecialChar.length;
            }
            count++;
        }
        return hasSpecialChar;
    }

    private boolean CheckPass(String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
