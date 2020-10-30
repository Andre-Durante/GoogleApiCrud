package com.location.crud.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Bounds {
    @JsonProperty("northeast")
    private Location northeast;

    @JsonProperty("southwest")
    private Location southwest;

    public Location getNortheast() { return northeast; }

    public void setNortheast(Location northeast) {
        this.northeast = northeast;
    }

    public Location getSouthwest() {
        return southwest;
    }

    public void setSouthwest(Location southwest) {
        this.southwest = southwest;
    }

    public static Builder builder() { return new Builder(); }

    public static final class Builder {

        private Bounds objectBuild;

        private Builder() {
            this.objectBuild = new Bounds();
        }

        public Bounds build() {
            return objectBuild;
        }

        public Builder northeast(Location northeast) {
            objectBuild.setNortheast(northeast);
            return this;
        }

        public Builder southwest(Location southwest) {
            objectBuild.setSouthwest(southwest);
            return this;
        }
    }
}
