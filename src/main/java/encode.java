import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class encode {
    public static void main(String[] args) {
        String responseBodyStr01 ="eyJjb2RlIjoyMDAsIm1zZyI6Ik9LIiwiZGF0YSI6eyJ1cmwiOiIvL3RyYWluLm0uamQuY29tL3RyYWluP2pkcmVhY3RrZXk9SkRSZWFjdFRyYWluJmpkcmVhY3RhcHA9SkRSZWFjdFRyYWluJnJuX3RyYW5zcGFyZW50ZW5hYmxlPXRydWUmcm5fcm91dGVyTmFtZT10cmFpbiZybl90cmFpbkRhdGU9MjAyMi0wMi0xMSZ0cmFpbkRhdGU9MjAyMi0wMi0xMSZybl9mcm9tU3RhdGlvbkNvZGU9QkpQJmZyb21TdGF0aW9uQ29kZT1CSlAmcm5fdG9TdGF0aW9uQ29kZT1TSEgmdG9TdGF0aW9uQ29kZT1TSEgmcm5fZnJvbVN0YXRpb25OYW1lPeWMl+S6rCZmcm9tU3RhdGlvbk5hbWU95YyX5LqsJnJuX3RvU3RhdGlvbk5hbWU95LiK5rW3JnRvU3RhdGlvbk5hbWU95LiK5rW3JmpkcmVhY3RBcHBlbmRQYXRoPXRyYWluJnRyYWluX3NvdXJjZT1qaXBpYW8iLCJkYXRlIjoiMjAyMi0wMi0xMSIsImRlcENpdHkiOiLljJfkuqwiLCJkZXBDaXR5Q29kZSI6IkJKUCIsImFyckNpdHkiOiLkuIrmtbciLCJhcnJDaXR5Q29kZSI6IlNISCIsInByaWNlIjoxNTYuNX0sInRpbWVzdGFtcCI6MTY0NDQ2MjQxNTMyM30=";
        byte [] responseBodyStr02=Base64.getDecoder().decode(responseBodyStr01);
       String responseBodyStr=null;
        try {
            responseBodyStr = new String(responseBodyStr02, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(responseBodyStr);

    }
}
