package com.symbiantech.CalcEngine;

import java.security.PublicKey;

public class MathEquation {
    private double leftVals;
    private double rightVals;
    private char opCodes;
    private double results;

    public double getLeftVals () { return leftVals;}
    public void setLeftVals (double leftVals) {this.leftVals = leftVals;}

    public double getRightVals() {return rightVals;}
    public void setRightVals(double rightVals) {this.rightVals = rightVals;}

    public char getOpCodes() {return opCodes;}
    public void setOpCodes(char opCodes) {this.opCodes = opCodes;}

    public double getResults() {return results;}

    public MathEquation() {

    }

    public MathEquation(char opCodes) {
        this.opCodes = opCodes;
    }

    public MathEquation(char opCodes, double leftVals, double rightVals) {
        this(opCodes);
        this.leftVals = leftVals;
        this.rightVals = rightVals;
    }

    public void execute() {
    switch (opCodes) {
        case 'a':
            results = leftVals + rightVals;
            break;
        case 's':
            results = leftVals - rightVals;
            break;
        case 'd':
            results = rightVals != 0.0d ? leftVals / rightVals : 0.0d;
            break;
        case 'm':
            results = leftVals * rightVals;
            break;
        default:
            System.out.println("Incorrect opcodes entered");
        }
    }

    public void execute(double leftVals, double rightVals) {
        this.leftVals = leftVals;
        this.rightVals = rightVals;
        execute();
    }

    public void execute(int leftVals, int rightVals) {
        this.leftVals = leftVals;
        this.rightVals = rightVals;
        execute();
        results = (int) results;
    }

}
