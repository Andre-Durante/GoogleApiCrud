package com.location.crud.api.rest.response;

public class LocationCrudReadResponse {

    private String id;
    private String streetName;
    private String number;
    private String complement;
    private String neighbourhood;
    private String city;
    private String state;
    private String country;
    private String zipcode;
    private String latitude;
    private String longitude;

    public static Builder builder() {
        return new Builder();
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) { this.city = city; }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public static final class Builder {

        private LocationCrudReadResponse objectBuild;

        private Builder() {
            this.objectBuild = new LocationCrudReadResponse();
        }

        public LocationCrudReadResponse build() {
            return objectBuild;
        }

        public Builder id(String id) {
            objectBuild.setId(id);
            return this;
        }

        public Builder streetName(String streetName) {
            objectBuild.setStreetName(streetName);
            return this;
        }

        public Builder number(String number) {
            objectBuild.setNumber(number);
            return this;
        }

        public Builder complement(String complement) {
            objectBuild.setComplement(complement);
            return this;
        }

        public Builder neighbourhood(String neighbourhood) {
            objectBuild.setNeighbourhood(neighbourhood);
            return this;
        }

        public Builder city(String city) {
            objectBuild.setCity(city);
            return this;
        }

        public Builder state(String state) {
            objectBuild.setState(state);
            return this;
        }

        public Builder country(String country) {
            objectBuild.setCountry(country);
            return this;
        }

        public Builder zipcode(String zipcode) {
            objectBuild.setZipcode(zipcode);
            return this;
        }

        public Builder latitude(String latitude) {
            objectBuild.setLatitude(latitude);
            return this;
        }

        public Builder longitude(String longitude) {
            objectBuild.setLongitude(longitude);
            return this;
        }
    }
}
