package com.location.crud.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
    @JsonProperty("lat")
    private String lat;

    @JsonProperty("lng")
    private String lng;

    public String getLat() { return lat; }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public static Builder builder() { return new Builder(); }

    public static final class Builder {

        private Location objectBuild;

        private Builder() {
            this.objectBuild = new Location();
        }

        public Location build() {
            return objectBuild;
        }

        public Builder latitude(String latitude) {
            objectBuild.setLat(latitude);
            return this;
        }

        public Builder longitude(String longitude) {
            objectBuild.setLng(longitude);
            return this;
        }
    }
}
