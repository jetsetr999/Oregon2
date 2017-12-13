/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.Model;

import java.util.Objects;

/**
 *
 * @author Darrin
 */
public class Weather {
    //class variables
    private String storm;
    private double holdTime;

    public Weather() {
    }

        public String getStorm() {
        return storm;
    }

    public void setStorm(String storm) {
        this.storm = storm;
    }

    public double getHoldTime() {
        return holdTime;
    }

    public void setHoldTime(double holdTime) {
        this.holdTime = holdTime;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.storm);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.holdTime) ^ (Double.doubleToLongBits(this.holdTime) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Weather other = (Weather) obj;
        if (!Objects.equals(this.storm, other.storm)) {
            return false;
        }
        if (Double.doubleToLongBits(this.holdTime) != Double.doubleToLongBits(other.holdTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Weather{" + "storm=" + storm + ", holdTime=" + holdTime + '}';
    }
    
    
}
