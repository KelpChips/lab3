import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    String sentences = "";

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format("test lol %d", sentences);
        } 
        else {
            System.out.println("Path: " + url.getPath());
            //adds the word or sentence to list of sentence
            if (url.getPath().contains("/add-message")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) {
                    sentences = sentences + "\n" + parameters[1];
            }
            return "404 Not Found!";
            }
        }
        return sentences;
    }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
