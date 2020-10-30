package com.location.crud.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressComponents {

    @JsonProperty("long_name")
    private String longName;
    @JsonProperty("short_name")
    private String shortName;
    @JsonProperty("types")
    private String[] types;

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) { this.longName = longName; }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String[] getTypes() {
        return types;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }

    public static Builder builder() { return new Builder(); }

    public static final class Builder {

        private AddressComponents objectBuild;

        private Builder() { this.objectBuild = new AddressComponents(); }

        public AddressComponents build() {
            return objectBuild;
        }


        public Builder longName(String longName) {
            objectBuild.setLongName(longName);
            return this;
        }

        public Builder shortName(String shortName) {
            objectBuild.setShortName(shortName);
            return this;
        }

        public Builder types(String[] types) {
            objectBuild.setTypes(types);
            return this;
        }
    }
}