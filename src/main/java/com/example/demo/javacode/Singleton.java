package com.example.demo.javacode;

/**
 * Одина из лучших реализаций синголтона ленивая!!!, потокобезопасная!!!
 *
 * реализация основана на гарантиях класслоадора
 * - синголтон гарантируется тем, что класслоадер обязан создать только один экзампляр класса класс
 * - ленивая загрузка гарантируется тем, что класслоадер загрузит класс только когда он попадет в скоуп выполнения
 * - потокобезопасность гарантируется тем, что класслоадер вернет ссылку на объект только после того,
 *   как у объекта будут полностью инициализированы все поля
 */

public class Singleton {

    private static class SingletonHolder{
        static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }

    private Singleton(){}
}