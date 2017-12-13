/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.Model;

import java.awt.Point;

/**
 *
 * @author Darrin
 */
public enum Actor {

    Avatar1("Avatar1", "The lead person", new Point(1, 1)),
    Avatar2("Avatar2", "Second in command", new Point(0, 1)),
    Avatar3("Avatar3", "Third", new Point(1, 2)),
    Avatar4("Avatar4", "Fourth.", new Point(2, 3)),
    Avatar5("Avatar5", "Fifth", new Point(1, 2)),;

    private String name;
    private String description;
    private Point coordinates;

    Actor(String name, String description, Point coordinates) {
        this.name = name;
        this.description = description;
        this.coordinates = coordinates;

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description="
                      + description + ", coordinates=" + coordinates + '}';
    }

    
}
