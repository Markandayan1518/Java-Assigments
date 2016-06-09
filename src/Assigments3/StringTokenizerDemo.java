
package Assigments3;

import java.util.StringTokenizer;

/**
 *
 * @author mark-4304
 */
public class StringTokenizerDemo {
    public static void main(String[] args) {
        String url = "https://dcentral.wiki.zoho.com/Java-and-Webserver.html?pid=0";
        StringTokenizer tokenizer = new StringTokenizer(url, "://-.?=");
        while( tokenizer.hasMoreTokens() ){
            System.out.println(tokenizer.nextToken());
        }
    }
}
