import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        String url = new Scanner(System.in).nextLine();
        // String url = "https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost";
        String[] partsURL = url.split("\\?");
        String[] paramsURL = partsURL[1].split("&");
        String password = "";
        for (int i = 0; i < paramsURL.length; i++) {
            String[] param = paramsURL[i].split("=", -1);
            if (param[0].equals("pass")) {
                password = param[1];
            }
            System.out.println(param[1].equals("") ?
                    param[0] + " : not found" :
                    param[0] + " : " + param[1]);
        }
        System.out.print(password == "" ?
                "" : "password : " + password + "\n");
    }
}