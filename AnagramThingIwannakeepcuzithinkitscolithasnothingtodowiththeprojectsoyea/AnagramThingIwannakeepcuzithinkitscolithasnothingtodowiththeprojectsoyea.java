import java.util.Scanner;
public class AnagramThingIwannakeepcuzithinkitscolithasnothingtodowiththeprojectsoyea{
    public static void main(String[] args){Scanner sc = new Scanner(System.in);System.out.println("Enter a String: ");String qwer = sc.nextLine();System.out.println("Enter a String: ");String asdf = sc.nextLine(); int zxcv = 0;int poiu = 0; for (;qwer.indexOf(" ") != -1;) {if(qwer.indexOf(" ") == 0){qwer = qwer.substring(1);}qwer = qwer.substring(0,qwer.indexOf(" ")) + qwer.substring(qwer.indexOf(" ")+1);}for (;asdf.indexOf(" ") != -1;) {if(asdf.indexOf(" ") == 0){asdf = asdf.substring(1);}asdf = asdf.substring(0,asdf.indexOf(" ")) + asdf.substring(asdf.indexOf(" ")+1);}System.out.println(asdf);System.out.println(qwer); 
for (int c = 0;c < qwer.length(); c++) {for (int python = 0;python < asdf.length(); python++) 
{if ((qwer.substring(c, c+1).equals(asdf.substring(python, python+1)))) {zxcv++;break;}}}
for (int c = 0;c < asdf.length(); c++) {for (int python = 0;python < qwer.length(); python++) 
{if ((asdf.substring(c, c+1).equals(qwer.substring(python, python+1)))) {poiu++;break;}}}
if ((zxcv == asdf.length()) && (poiu == zxcv) &&(poiu == qwer.length())) {System.out.println("YES YES YES YES YEEEEESSS!!!");} else {System.out.println("NO NO NO NO NOOOOOOOOOOOOO!!!");}}}