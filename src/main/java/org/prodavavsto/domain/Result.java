package org.prodavavsto.domain;

public class Result {
    private int id;
    private String sample;
    private int particle_num;
    private double c_U234;
    private double c_U234_Err;
    private double c_U235;
    private double c_U235_Err;
    private double c_U236;
    private double c_U236_Err;
    private double c_U236_Raw;
    private double c_U238;
    private double c_U238_Err;
    private double r_239_238;

    public Result() {
        this.c_U234 = 0.0d;
        this.c_U234_Err = 0.0d;
        this.c_U235 = 0.0d;
        this.c_U235_Err = 0.0d;
        this.c_U236 = 0.0d;
        this.c_U236_Err = 0.0d;
        this.c_U236_Raw = 0.0d;
        this.c_U238 = 0.0d;
        this.c_U238_Err = 0.0d;
        this.r_239_238 = 0.0d;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public int getParticle_num() {
        return particle_num;
    }

    public void setParticle_num(int particle_num) {
        this.particle_num = particle_num;
    }

    public double getC_U234() {
        return c_U234;
    }

    public void setC_U234(double c_U234) {
        this.c_U234 = c_U234;
    }

    public double getC_U234_Err() {
        return c_U234_Err;
    }

    public void setC_U234_Err(double c_U234_Err) {
        this.c_U234_Err = c_U234_Err;
    }

    public double getC_U235() {
        return c_U235;
    }

    public void setC_U235(double c_U235) {
        this.c_U235 = c_U235;
    }

    public double getC_U235_Err() {
        return c_U235_Err;
    }

    public void setC_U235_Err(double c_U235_Err) {
        this.c_U235_Err = c_U235_Err;
    }

    public double getC_U236() {
        return c_U236;
    }

    public void setC_U236(double c_U236) {
        this.c_U236 = c_U236;
    }

    public double getC_U236_Err() {
        return c_U236_Err;
    }

    public void setC_U236_Err(double c_U236_Err) {
        this.c_U236_Err = c_U236_Err;
    }

    public double getC_U236_Raw() {
        return c_U236_Raw;
    }

    public void setC_U236_Raw(double c_U236_Raw) {
        this.c_U236_Raw = c_U236_Raw;
    }

    public double getC_U238() {
        return c_U238;
    }

    public void setC_U238(double c_U238) {
        this.c_U238 = c_U238;
    }

    public double getC_U238_Err() {
        return c_U238_Err;
    }

    public void setC_U238_Err(double c_U238_Err) {
        this.c_U238_Err = c_U238_Err;
    }

    public double getR_239_238() {
        return r_239_238;
    }

    public void setR_239_238(double r_239_238) {
        this.r_239_238 = r_239_238;
    }
}
