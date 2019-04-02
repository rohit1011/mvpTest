package com.example.mvppractice.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;
    @SerializedName("breakfast")
    @Expose
    private List<Breakfast> breakfast = null;
    @SerializedName("APPETIZER")
    @Expose
    private List<APPETIZER> aPPETIZER = null;
    @SerializedName("SOUPS")
    @Expose
    private List<SOUP> sOUPS = null;
    @SerializedName("salads")
    @Expose
    private List<Salad> salads = null;
    @SerializedName("contenintalcuisine")
    @Expose
    private List<Contenintalcuisine> contenintalcuisine = null;
    @SerializedName("dessert")
    @Expose
    private List<Dessert> dessert = null;

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Breakfast> getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(List<Breakfast> breakfast) {
        this.breakfast = breakfast;
    }

    public List<APPETIZER> getAPPETIZER() {
        return aPPETIZER;
    }

    public void setAPPETIZER(List<APPETIZER> aPPETIZER) {
        this.aPPETIZER = aPPETIZER;
    }

    public List<SOUP> getSOUPS() {
        return sOUPS;
    }

    public void setSOUPS(List<SOUP> sOUPS) {
        this.sOUPS = sOUPS;
    }

    public List<Salad> getSalads() {
        return salads;
    }

    public void setSalads(List<Salad> salads) {
        this.salads = salads;
    }

    public List<Contenintalcuisine> getContenintalcuisine() {
        return contenintalcuisine;
    }

    public void setContenintalcuisine(List<Contenintalcuisine> contenintalcuisine) {
        this.contenintalcuisine = contenintalcuisine;
    }

    public List<Dessert> getDessert() {
        return dessert;
    }

    public void setDessert(List<Dessert> dessert) {
        this.dessert = dessert;
    }

}