package com.birdben.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

public class MainSPI {
    public static void main(String[] args) {
        ServiceLoader<Search> serviceLoader = ServiceLoader.load(Search.class);
        Iterator<Search> it = serviceLoader.iterator();
        while (it.hasNext()) {
            Search search = it.next();
            search.doSearch();
        }
    }
}
