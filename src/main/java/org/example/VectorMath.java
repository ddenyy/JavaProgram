package org.example;

import java.util.ArrayList;
import java.util.List;

public class VectorMath {
    private double x;
    private double y;
    private double z;

    VectorMath(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // формула вычисления длинны вектора
    public double getSize()
    {
        return Math.sqrt(x*x + y*y + z*z);
    }

    // скалярное произведение
    public double getScalarProduct(VectorMath second)
    {
        return second.x * x + second.y * y + second.z * z;
    }

    // векторное произведение
    public VectorMath getVectorProduct(VectorMath second)
    {
        return new VectorMath(y*second.z - z * second.y, z * second.x - x * second.z, x * second.y - y * second.x);
    }

    // угол между двумя векторами
    public double getAngle(VectorMath second)
    {
        double scalar_two_vectors = getScalarProduct(second);
        scalar_two_vectors /= (this.getSize() + second.getSize());

        return scalar_two_vectors;
    }

    public VectorMath sum(VectorMath second)
    {
        return new VectorMath(this.x + second.x, this.y + second.y, this.z + second.z);
    }


    public static List<VectorMath> getRandArr(int N)
    {
        double rand_x = Math.random() * 10;
        double rand_y = Math.random() * 10;
        double rand_z = Math.random() * 10;

        List<VectorMath> Rand_arr = new ArrayList<>(N);

        for (int i = 0; i < N - 1; i++)
        {
             rand_x = Math.random() * 10;
             rand_y = Math.random() * 10;
             rand_z = Math.random() * 10;
             Rand_arr.add(new VectorMath(rand_x, rand_y, rand_z));
        }

        return Rand_arr;
    }

    public VectorMath subtract(VectorMath vector) {
        return new VectorMath(
                x - vector.x,
                y - vector.y,
                z - vector.z
        );
    }


    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }


}
