/*
Copyright (c) 2025 Ahmed R. Sadik, Honda Research Institute Europe GmbH 

This source code is licensed under the MIT License found in the
LICENSE file in the root directory of this source tree. This dataset contains smelly code for research and refactoring purposes.
*/


public class Pizza {
    private String size;
    private String doughType;
    private String topping;

    public Pizza(String size, String doughType, String topping) {
        this.size = size;
        this.doughType = doughType;
        this.topping = topping;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setDoughType(String doughType) {
        this.doughType = doughType;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getSize() {
        return size;
    }

    public String getDoughType() {
        return doughType;
    }

    public String getTopping() {
        return topping;
    }
}






