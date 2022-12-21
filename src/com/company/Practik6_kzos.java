package com.company;

import java.util.*;
import java.lang.String;

public class Practik6_kzos {
    public static void main(String[] args) {
        final int N = 8;
        final int S = 4;
        final int l = 4;
        final int A = 100;
        final int qMin = -3;
        final int qMax = 3;
        int a;
        int b;

        int j = 0;

        int temp = qMin;
        double Re = 0;
        double Im = 0;
        double[] Y = new double[qMax - qMin + 1];
        double[] sin0 = new double[N];
        double[] cos0 = new double[N];
        double[] sin1 = new double[S * N];
        double[] cos1 = new double[S * N];
        for (int i = 0; i < N; i++) {
            sin0[i] = Math.sin(2 * Math.PI * i / N);
            cos0[i] = Math.cos(2 * Math.PI * i / N);
        }

        for (int i = 0; i < S * N; i++) {

            sin1[i] = Math.sin(2 * Math.PI * i / (S * N));
            cos1[i] = Math.cos(2 * Math.PI * i / (S * N));
        }

        do {

            for (int i = 0; i < N; i++) {

                a = (Math.abs(S * l + temp) * i) % (S * N);
                b = l * i % N;
                Re += A * cos1[a] * cos0[b] + A * sin1[a] * sin0[b];
                Im += A * cos1[a] * sin0[b] - A * sin1[a] * cos0[b];
            }

            Y[j] = Math.sqrt(Math.pow(Re, 2) + Math.pow(Im, 2));
            Re = Im = 0;
            j++;

        } while (temp++ < qMax);
        System.out.println("X\t \tY");
        for (int i = 0; i < qMax - qMin + 1; i++) {
            System.out.println((qMin + i) + ";" + "\t \t" + Y[i]);
        }
    }
}
