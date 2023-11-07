package org.example.structural_patterns.proxy_design_pattern;

public class ProxyPatternClient {
    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("Boburjon",5);
        access.grantInternetAccess();
        OfficeInternetAccess access1 = new ProxyInternetAccess("Alen",3);
        access1.grantInternetAccess();
    }
}
