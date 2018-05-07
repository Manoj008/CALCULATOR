import java.awt.event.*;
class Work implements ActionListener
{
    Calculator c;
    String s="";
    Work(Calculator c)
    {
        this.c=c;
    }
    public void operations(String s)
    {
        int i,j,k,count=0;
        float a,b;
        try
        {
            for(i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='*')
                {
                    count++;
                }
            }
            while(count>0)
            {
                for(i=0;i<s.length();i++)
                {
                    if(s.charAt(i)=='*')
                    {
                        break;
                    }
                }
                j=i+2;
                k=i-2;
                while(j<s.length())
                {
                    if(s.charAt(j)=='+' || s.charAt(j)=='-' || s.charAt(j)=='*' || s.charAt(j)=='/')
                    {
                        break;
                    }
                    else
                    {
                        j++;
                    }
                }
                if(j>=s.length())
                {
                    a=Float.parseFloat(s.substring(i+1));
                }
                else
                {
                    a=Float.parseFloat(s.substring(i+1,j));
                }
                while(k>=0)
                {
                    if((s.charAt(k)=='+' || s.charAt(k)=='-' || s.charAt(k)=='*' || s.charAt(k)=='/')&& k!=0)
                    {
                        if(s.charAt(k-1)=='+' || s.charAt(k-1)=='-' || s.charAt(k-1)=='*' || s.charAt(k-1)=='/')
                        {
                            k--;
                        }
                        else
                        {
                            break;
                        }
                    }
                    else
                    {
                        k--;
                    }
                }
                b=Float.parseFloat(s.substring(k+1,i));
                a=a*b;
                if(k<=0 && j>=s.length())
                {
                    s=actualString(a);
                }
                else if(k<=0)
                {
                    s=actualString(a)+s.substring(j);
                }
                else if(j>=s.length())
                {
                    s=s.substring(0,k+1)+actualString(a);
                }
                else
                {
                    s=s.substring(0,k+1)+actualString(a)+s.substring(j);
                }
                count--;
            }

            for(i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='/')
                {
                    count++;
                }
            }
            while(count>0)
            {
                for(i=0;i<s.length();i++)
                {
                    if(s.charAt(i)=='/')
                    {
                        break;
                    }
                }
                j=i+2;
                k=i-2;
                while(j<s.length())
                {
                    if(s.charAt(j)=='+' || s.charAt(j)=='-' || s.charAt(j)=='*' || s.charAt(j)=='/')
                    {
                        break;
                    }
                    else
                    {
                        j++;
                    }
                }
                if(j>=s.length())
                {
                    a=Float.parseFloat(s.substring(i+1));
                }
                else
                {
                    a=Float.parseFloat(s.substring(i+1,j));
                }
                while(k>=0)
                {
                    if((s.charAt(k)=='+' || s.charAt(k)=='-' || s.charAt(k)=='*' || s.charAt(k)=='/') && k!=0)
                    {
                        if(s.charAt(k-1)=='+' || s.charAt(k-1)=='-' || s.charAt(k-1)=='*' || s.charAt(k-1)=='/')
                        {
                            k--;
                        }
                        else
                        {
                            break;
                        }
                    }
                    else
                    {
                        k--;
                    }
                }
                b=Float.parseFloat(s.substring(k+1,i));
                a=b/a;

                if(k<=0 && j>=s.length())
                {
                    s=actualString(a);
                }
                else if(k<=0)
                {
                    s=actualString(a)+s.substring(j);
                }
                else if(j>=s.length())
                {
                    s=s.substring(0,k+1)+actualString(a);
                }
                else
                {
                    s=s.substring(0,k+1)+actualString(a)+s.substring(j);
                }
                count--;
            }

            for(i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='+')
                {
                    count++;
                }
            }
            while(count>0)
            {
                for(i=0;i<s.length();i++)
                {
                    if(s.charAt(i)=='+')
                    {
                        break;
                    }
                }
                j=i+2;
                k=i-2;
                while(j<s.length())
                {
                    if(s.charAt(j)=='+' || s.charAt(j)=='-' || s.charAt(j)=='*' || s.charAt(j)=='/')
                    {
                        break;
                    }
                    else
                    {
                        j++;
                    }
                }
                if(j>=s.length())
                {
                    a=Float.parseFloat(s.substring(i+1));
                }
                else
                {
                    a=Float.parseFloat(s.substring(i+1,j));
                }
                while(k>=0)
                {
                    if((s.charAt(k)=='+' || s.charAt(k)=='-' || s.charAt(k)=='*' || s.charAt(k)=='/')&& k!=0)
                    {
                        if(s.charAt(k-1)=='+' || s.charAt(k-1)=='-' || s.charAt(k-1)=='*' || s.charAt(k-1)=='/')
                        {
                            k--;
                        }
                        else
                        {
                            break;
                        }
                    }
                    else
                    {
                        k--;
                    }
                }
                b=Float.parseFloat(s.substring(k+1,i));
                a=a+b;
                if(k<=0 && j>=s.length())
                {
                    s=actualString(a);
                }
                else if(k<=0)
                {
                    s=actualString(a)+s.substring(j);
                }
                else if(j>=s.length())
                {
                    s=s.substring(0,k+1)+actualString(a);
                }
                else
                {
                    s=s.substring(0,k+1)+actualString(a)+s.substring(j);
                }
                count--;
            }

            for(i=1;i<s.length();i++)
            {
                if(s.charAt(i)=='-' && (s.charAt(i-1)!='+' && s.charAt(i-1)!='-' && s.charAt(i-1)!='*' && s.charAt(i-1)!='/'))
                {
                    count++;
                }
            }
            while(count>0)
            {
                for(i=1;i<s.length();i++)
                {
                    if(s.charAt(i)=='-' && (s.charAt(i-1)!='+' && s.charAt(i-1)!='-' && s.charAt(i-1)!='*' && s.charAt(i-1)!='/'))
                    {
                        break;
                    }
                }
                j=i+2;
                k=i-2;
                while(j<s.length())
                {
                    if(s.charAt(j)=='+' || s.charAt(j)=='-' || s.charAt(j)=='*' || s.charAt(j)=='/')
                    {
                        break;
                    }
                    else
                    {
                        j++;
                    }
                }
                if(j>=s.length())
                {
                    a=Float.parseFloat(s.substring(i+1));
                }
                else
                {
                    a=Float.parseFloat(s.substring(i+1,j));
                }
                while(k>=0)
                {
                    if((s.charAt(k)=='+' || s.charAt(k)=='-' || s.charAt(k)=='*' || s.charAt(k)=='/')&& k!=0)
                    {
                        if(s.charAt(k-1)=='+' || s.charAt(k-1)=='-' || s.charAt(k-1)=='*' || s.charAt(k-1)=='/')
                        {
                            k--;
                        }
                        else
                        {
                            break;
                        }
                    }
                    else
                    {
                        k--;
                    }
                }
                b=Float.parseFloat(s.substring(k+1,i));
                a=b-a;
                if(k<=0 && j>=s.length())
                {
                    s=actualString(a);
                }
                else if(k<=0)
                {
                    s=actualString(a)+s.substring(j);
                }
                else if(j>=s.length())
                {
                    s=s.substring(0,k+1)+actualString(a);
                }
                else
                {
                    s=s.substring(0,k+1)+actualString(a)+s.substring(j);
                }
                count--;
            }
            c.t2.setText(s);
        }
        catch(Exception e)
        {
            c.t2.setText("Invalid Expression");
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==c.b[0])
        {
            c.t1.setText(c.t1.getText()+"7");
            operations(c.t1.getText());
            enableButton("+-/D=*");
        }
        else if(e.getSource()==c.b[1])
        {
            c.t1.setText(c.t1.getText()+"8");
            operations(c.t1.getText());
            enableButton("+-/D=*");
        }
        else if(e.getSource()==c.b[2])
        {
            c.t1.setText(c.t1.getText()+"9");
            operations(c.t1.getText());
            enableButton("+-/D=*");
        }
        else if(e.getSource()==c.b[3])
        {
            c.t1.setText(c.t1.getText()+"4");
            operations(c.t1.getText());
            enableButton("+-/D=*");
        }
        else if(e.getSource()==c.b[4])
        {
            c.t1.setText(c.t1.getText()+"5");
            operations(c.t1.getText());
            enableButton("+-/D=*");
        }
        else if(e.getSource()==c.b[5])
        {
            c.t1.setText(c.t1.getText()+"6");
            operations(c.t1.getText());
            enableButton("+-/D=*");
        }
        else if(e.getSource()==c.b[6])
        {
            c.t1.setText(c.t1.getText()+"1");
            operations(c.t1.getText());
            enableButton("+-/D=*");
        }
        else if(e.getSource()==c.b[7])
        {
            c.t1.setText(c.t1.getText()+"2");
            operations(c.t1.getText());
            enableButton("+-/D=*");
        }
        else if(e.getSource()==c.b[8])
        {
            c.t1.setText(c.t1.getText()+"3");
            operations(c.t1.getText());
            enableButton("+-/D=*");
        }
        else if(e.getSource()==c.b[9])
        {
            s=c.t1.getText();
            if(s.length()==0)
            {
                c.t1.setText(c.t1.getText()+".");
                disableButton("+/*=");
                return;
            }
            int a=(s.indexOf('*')<s.indexOf('/'))?s.indexOf('/'):s.indexOf('*');
            a=(a<s.indexOf('+'))?s.indexOf('+'):a;
            a=(a<s.indexOf('-'))?s.indexOf('-'):a;
            s=s.substring(a+1);
            if(s.indexOf('.')==-1)
            {
                c.t1.setText(c.t1.getText()+".");
                disableButton("+-=/*");
            }

        }
        else if(e.getSource()==c.b[10])
        {
            c.t1.setText(c.t1.getText()+"0");
            operations(c.t1.getText());
            enableButton("+-/D=*");
        }
        else if(e.getSource()==c.b[11])
        {
            if(c.t2.getText()=="")
            {
                return;
            }
            operations(c.t1.getText());
            enableButton("+-/D=*");
            c.t1.setText(c.t2.getText());
            c.t2.setText("");
        }
        else if(e.getSource()==c.b[12])
        {
            s=c.t1.getText();
            if(s.length()==1)
            {
                c.t1.setText("");
                c.t2.setText("");
                disableButton("+*/D=");
            }
            else
            {
                c.t1.setText(s.substring(0,s.length()-1));
                if(s.charAt(s.length()-1)=='+' || s.charAt(s.length()-1)=='-' || s.charAt(s.length()-1)=='*' || s.charAt(s.length()-1)=='/')
                {
                    if(s.charAt(s.length()-1)=='-' && (s.charAt(s.length()-2)=='+' || s.charAt(s.length()-2)=='-' || s.charAt(s.length()-2)=='*' || s.charAt(s.length()-2)=='/'))
                    {
                        enableButton("-");
                    }
                    else
                    {
                        enableButton("+-/*");
                    }
                }
                else
                {
                    if(s.charAt(s.length()-2)=='+' || s.charAt(s.length()-2)=='-' || s.charAt(s.length()-2)=='*' || s.charAt(s.length()-2)=='/' || s.charAt(s.length()-2)=='.')
                    {
                        if(s.charAt(s.length()-2)=='-' && s.length()==2)
                        {
                            c.t2.setText(" ");
                            disableButton("+-/*=");
                        }
                        else if((s.charAt(s.length()-2)=='-'|| s.charAt(s.length()-2)=='.') && (s.charAt(s.length()-3)=='+' || s.charAt(s.length()-3)=='-' || s.charAt(s.length()-3)=='*' || s.charAt(s.length()-3)=='/'))
                        {
                            operations(s.substring(0,s.length()-3));
                            disableButton("+-/*");
                        }
                        else
                        {
                            operations(s.substring(0,s.length()-2));
                            disableButton("+/*");
                        }
                    }
                    else
                    {
                        operations(s.substring(0,s.length()-1));
                    }
                }
            }

        }
        else if(e.getSource()==c.b[13])
        {
            c.t1.setText(c.t1.getText()+"/");
            disableButton("+/=*");
        }
        else if(e.getSource()==c.b[14])
        {
            c.t1.setText(c.t1.getText()+"*");
            disableButton("+/=*");
        }
        else if(e.getSource()==c.b[15])
        {
            c.t1.setText(c.t1.getText()+"-");
            s=c.t1.getText();
            if(s.length()==1)
            {
                disableButton("-");
            }
            else if((s.charAt(s.length()-2)=='+' || s.charAt(s.length()-2)=='-' || s.charAt(s.length()-2)=='-' || s.charAt(s.length()-2)=='/'))
            {
                disableButton("-");
            }
            disableButton("+/*");
        }
        else if(e.getSource()==c.b[16])
        {
            c.t1.setText(c.t1.getText()+"+");
            disableButton("+/=*");
        }
    }
    public String actualString(Float a)
    {
        String s=String.valueOf(a);
        if(Integer.parseInt(s.substring(s.indexOf('.')+1))==0)
        {
            return s.substring(0,s.indexOf('.'));
        }
        return s;
    }
    public void disableButton(String s)
    {
        if(s.indexOf('+')!=-1)
        {
            c.b[16].setEnabled(false);
        }
        if(s.indexOf('-')!=-1)
        {
            c.b[15].setEnabled(false);
        }
        if(s.indexOf('*')!=-1)
        {
            c.b[14].setEnabled(false);
        }
        if(s.indexOf('/')!=-1)
        {
            c.b[13].setEnabled(false);
        }
        if(s.indexOf('D')!=-1)
        {
            c.b[12].setEnabled(false);
        }
        if(s.indexOf('=')!=-1)
        {
            c.b[11].setEnabled(false);
        }
        if(s.indexOf('.')!=-1)
        {
            c.b[9].setEnabled(false);
        }
    }
    public void enableButton(String s)
    {
        if(s.indexOf('+')!=-1)
        {
            c.b[16].setEnabled(true);
        }
        if(s.indexOf('-')!=-1)
        {
            c.b[15].setEnabled(true);
        }
        if(s.indexOf('*')!=-1)
        {
            c.b[14].setEnabled(true);
        }
        if(s.indexOf('/')!=-1)
        {
            c.b[13].setEnabled(true);
        }
        if(s.indexOf('D')!=-1)
        {
            c.b[12].setEnabled(true);
        }
        if(s.indexOf('=')!=-1)
        {
            c.b[11].setEnabled(true);
        }
        if(s.indexOf('.')!=-1)
        {
            c.b[9].setEnabled(true);
        }
    }
}
