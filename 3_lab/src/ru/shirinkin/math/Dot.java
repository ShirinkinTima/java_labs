package ru.shirinkin.math;

public class Dot implements Cloneable {
    private int x;
    private int y;

    public Dot(int x, int y) {
        setCoordinate(x, y);
    }

    public Dot() {
        this.x = 0;
        this.y = 0;
    }

    public Dot(Dot dot) {
        this.x = dot.x;
        this.y = dot.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setCoordinate(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public Dot clone() {
        try {
            // Вызываем метод clone() родительского класса
            Dot cloned = (Dot) super.clone();
            // Поскольку поля int, они автоматически скопируются
            return cloned;
        } catch (CloneNotSupportedException e) {
            // Этот exception не должен произойти, т.к. мы реализуем Cloneable
            throw new AssertionError("Клонирование не поддерживается", e);
        }
    }

    @Override
    public String toString() {
        return "{" + this.x + ";" + this.y + "}";
    }
}