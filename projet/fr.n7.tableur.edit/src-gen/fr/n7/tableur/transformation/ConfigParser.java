package fr.n7.tableur.transformation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ConfigParser {
	
    private static boolean checkname(Scanner s, String name) {
        s.useDelimiter(":");
        if (s.hasNext()) {
            String n = s.next();
            n = n.stripLeading();
            return name.equals(n);
        } else return false;
    }

    // reads a definition block. once again, parser sins
    private static List<String> readDefBlock(Scanner s, String name) throws ParseException {
        List<String> l = new LinkedList<>();
        // expected format:
        // <name>:
        // - <item1>
        // - <item2>
        //...
        // or if only one item:
        // <name>: <item1>



        // in all cases, expect "<name>:" firstly.
        if (!checkname(s, name)) {
            throw new ParseException("Could not find named configuration block '" + name + "'. All blocks should be present and in order.", 0);
        } 
        s.useDelimiter("\n");
        String dx = s.next();
        dx = dx.substring(1).stripLeading(); //remove leading & colon
        if (dx.length() > 0) {
            // mono item def
            l.add(dx);
            return l;
        }
        // read to your heart's contents
        while (s.hasNext()) {
            dx = s.next();
            if (dx.startsWith("-")) {
                dx = dx.substring(1).stripLeading();
                l.add(dx);
            }
        }
        // we mightve read too much! oops!
        return l;
    }

    // see below: parser sins
    public static Map<String, List<String>> parse(String file) throws ParseException, IOException {
        String s = Files.readString(Path.of(file));
        String[] elm = s.split("\n(?=[tlcf])");
        if (elm.length < 6) throw new ParseException("Could not find named all configuration blocks. All blocks should be present.", 0);

        Map<String, List<String>> m = new HashMap<>();

        Scanner sc = new Scanner(elm[0]);
        m.put("table", readDefBlock(sc, "table"));
        sc = new Scanner(elm[1]);
        m.put("csv", readDefBlock(sc, "csv"));
        sc = new Scanner(elm[2]);
        m.put("tableExt", readDefBlock(sc, "tableExt"));
        sc = new Scanner(elm[3]);
        m.put("csvExt", readDefBlock(sc, "csvExt"));
        sc = new Scanner(elm[4]);
        m.put("fonction", readDefBlock(sc, "fonction"));
        sc = new Scanner(elm[5]);
        m.put("lib", readDefBlock(sc, "lib"));

        return m;
    }


    public static void main(String[] args) {
        try {
            Map<String, List<String>> m = parse(args[0]);
            for (List<String> ls : m.values()) {
                System.out.println("ELEMENT");
                for (String s : ls) {
                    System.out.println(s);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}