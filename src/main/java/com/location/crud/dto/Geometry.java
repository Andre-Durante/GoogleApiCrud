package com.location.crud.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Geometry {
    @JsonProperty("bounds")
    private Bounds bounds;

    @JsonProperty("location_type")
    private String location_type;

    @JsonProperty("location")
    private Location location;

    @JsonProperty("viewport")
    private Bounds viewport;

    public Bounds getBounds() { return bounds; }

    public void setBounds(Bounds bounds) {
        this.bounds = bounds;
    }

    public String getLocation_type() {
        return location_type;
    }

    public void setLocationType(String locationType) {
        this.location_type = locationType;
    }

    public Location getLocation() { return location; }

    public void setLocation(Location location) { this.location = location; }

    public Bounds getViewport() { return viewport; }

    public void setViewport(Bounds viewport) { this.viewport = viewport; }

    public static Builder builder() { return new Builder(); }

    public static final class Builder {

        private Geometry objectBuild;

        private Builder() {
            this.objectBuild = new Geometry();
        }

        public Geometry build() {
            return objectBuild;
        }

        public Builder bounds(Bounds bounds) {
            objectBuild.setBounds(bounds);
            return this;
        }

        public Builder locationType(String locationType) {
            objectBuild.setLocationType(locationType);
            return this;
        }

        public Builder location(Location location) {
            objectBuild.setLocation(location);
            return this;
        }

        public Builder viewport(Bounds viewport) {
            objectBuild.setViewport(viewport);
            return this;
        }
    }
}
