package ifElse;

import java.util.*;

public class Ternaries2 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Please Enter Your Status Code:");

            int a =  scan.nextInt();

            String statusCode =
                    (a == 200)? "OK"
                            : (a == 201)? "Created"
                            : (a == 202)? "Accepted"
                            : (a == 301)? "Moved Permanently"
                            : (a == 303)? "See Other"
                            : (a == 304)? "Not Modified"
                            : (a == 307)? "Temporary Redirect"
                            : (a == 400)? "Bad Request"
                            : (a == 401)? "Unauthorized"
                            : (a == 403)? "Forbidden"
                            : (a == 404)? "Not Found"
                            : (a == 410)? "Gone"
                            : (a == 500)? "Internal Server Error"
                            : (a == 503)? "Service Unavailable"
                            :"Invalid Status Code";

            System.out.println(statusCode);



        }
    }

