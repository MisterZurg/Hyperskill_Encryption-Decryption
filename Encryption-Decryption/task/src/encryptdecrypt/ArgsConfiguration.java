package encryptdecrypt;
// Stage 4/6: I command you
public class ArgsConfiguration {
    // Default values
    String mode = "enc";
    int key = 0;
    String data = "";
    // Stage 5/6: X-files
    String inFile = "";
    String outFile = "";
    // Stage 6/6: Choices, choices
    String algorithm = "";

    void prepare(String[] arguments) {
        for (int i = 0; i < arguments.length; i+=2) {
            switch (arguments[i]) {
                case "-mode":
                    this.mode = arguments[i+1];
                    break;
                case "-key":
                    this.key = Integer.parseInt(arguments[i+1]);
                    break;
                case "-data":
                    this.data = arguments[i+1];
                    break;
                // Stage 5/6: X-files continue
                case "-in":
                    this.inFile = arguments[i+1];
                    break;
                case "-out":
                    this.outFile = arguments[i+1];
                    break;
                // Stage 6/6: Choices, choices
                case "-alg":
                    this.algorithm = arguments[i+1];
                    break;
            }
        }
    }
}
