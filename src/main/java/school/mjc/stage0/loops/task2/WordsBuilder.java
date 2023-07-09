package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
char symbol = 0;
        int i = symbol;
    while (i<127) {
        symbol++;
        if(symbol == '!') {
            String str = String.valueOf(symbol);
            System.out.print(str);
            continue;
        } else if (symbol == 'H') {
            String str = String.valueOf(symbol);
            System.out.print(str);
            continue;
        }
        else if (symbol == 'I') {
            String str = String.valueOf(symbol);
            System.out.print(str);
            continue;
        }
        else if (symbol == 'N') {
            String str = String.valueOf(symbol);
            System.out.print(str);
            continue;
        } else if (symbol == 'T') {
            String str = String.valueOf(symbol);
            System.out.print(str);
            break;
        }
    }
    }
}
