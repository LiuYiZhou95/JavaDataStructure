package com.weakreference;

import java.lang.ref.WeakReference;

public class Salad extends WeakReference{
    public Salad(Apple apple){super(apple);}
}
