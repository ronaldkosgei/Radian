package com.practice.entity;

import javax.persistence.*;


@Entity(name = "shops")
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "date", unique = true)
    private String date;

    @Column(name = "daily_sales")
    private double dailySales;

    @Column(name = "daily_items_sold")
    private int dailyItemsSold;

    @Column(name = "daily_profit_made")
    private double dailyProfitMade;

    @Column(name = "monthly_sales")
    private double monthlySales;

    @Column(name = "monthly_items_sold")
    private int monthlyItemsSold;

    @Column(name = "monthly_profit_made")
    private double monthlyProfitMade;

    @Column(name = "restocked_items")
    private int restockedItems;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getDailySales() {
        return dailySales;
    }

    public void setDailySales(double dailySales) {
        this.dailySales = dailySales;
    }

    public int getDailyItemsSold() {
        return dailyItemsSold;
    }

    public void setDailyItemsSold(int dailyItemsSold) {
        this.dailyItemsSold = dailyItemsSold;
    }

    public double getDailyProfitMade() {
        return dailyProfitMade;
    }

    public void setDailyProfitMade(double dailyprofitMade) {
        this.dailyProfitMade = dailyprofitMade;
    }

    public double getMonthlySales() {
        return monthlySales;
    }

    public void setMonthlySales(double monthlySales) {
        this.monthlySales = monthlySales;
    }

    public int getMonthlyItemsSold() {
        return monthlyItemsSold;
    }

    public void setMonthlyItemsSold(int monthlyItemsSold) {
        this.monthlyItemsSold = monthlyItemsSold;
    }

    public double getMonthlyProfitMade() {
        return monthlyProfitMade;
    }

    public void setMonthlyProfitMade(double monthlyProfitMade) {
        this.monthlyProfitMade = monthlyProfitMade;
    }

    public int getRestockedItems() {
        return restockedItems;
    }

    public void setRestockedItems(int restockedItems) {
        this.restockedItems = restockedItems;
    }

    public Shop() {
    }

}
