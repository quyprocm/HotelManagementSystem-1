package controller;

import util.HibernateUtils;

public class Main {

    public static void main(String[] args) {
        HibernateUtils.getSessionFactory();
    }
}
