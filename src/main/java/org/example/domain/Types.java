package org.example.domain;

public enum Types {

    ROBOT_VACUUM_CLEANERS("Роботы-пылесосы", "Вернем 10% на Клевер", "Роботы-пылесосы", "Робот-пылесос"),
    LAPTOPS("Ноутбуки", "Вернем 10% на Клевер", "Ноутбуки", "Ноутбук"),
    TABLETS("Планшеты", "Вернем 10% на Клевер", "Планшеты", "Планшет"),
    EBOOKS("Электронные книги", "Вернем 10% на Клевер", "Электронные книги", "Электронная книга"),
    BLOW_DRYERS("Фены", "Вернем 10% на Клевер", "Фены", "Фен"),
    MONITORS("Мониторы", "Вернем 10% на Клевер", "Мониторы", "Монитор"),
    EVERYDAY("Вернем 10% на Клевер", "С покупки товаров на каждый день", "На каждый день", "хз");

    private final String title;
    private final String subTitle;
    private final String pageTitle;
    private final String titleSingle;

    Types(String title, String subTitle, String pageTitle, String titleSingle) {
        this.title = title;
        this.subTitle = subTitle;
        this.pageTitle = pageTitle;
        this.titleSingle = titleSingle;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public String getTitleSingle() {
        return titleSingle;
    }
}
