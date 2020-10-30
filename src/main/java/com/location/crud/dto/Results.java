package com.location.crud.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Results {

    @JsonProperty("address_components")
    private AddressComponents[] address_components;
    @JsonProperty("formatted_address")
    private String formatted_address;
    @JsonProperty("geometry")
    private Geometry geometry;
    @JsonProperty("partial_match")
    private boolean partial_match;
    @JsonProperty("place_id")
    private String place_id;
    @JsonProperty("types")
    private String[] types;

    public AddressComponents[] getAddressComponents() { return address_components; }

    public void setAddressComponents(AddressComponents[] addressComponents) { this.address_components = addressComponents; }

    public String getFormattedAddress() { return formatted_address; }

    public void setFormattedAddress(String formattedAddress) { this.formatted_address = formattedAddress; }

    public Geometry getGeometry() { return geometry; }

    public void setGeometry(Geometry geometry) { this.geometry = geometry; }

    public boolean getPartialMatch() { return partial_match; }

    public void setPartialMatch(boolean partialMatch) { this.partial_match = partialMatch; }

    public String getPlaceId() { return place_id; }

    public void setPlaceId(String placeId) { this.place_id = placeId; }


    public String[] getTypes() { return types; }

    public void setTypes(String[] types) { this.types = types; }

    public static Builder builder() { return new Builder(); }

    public static final class Builder {

        private Results objectBuild;

        private Builder() {
            this.objectBuild = new Results();
        }

        public Results build() {
            return objectBuild;
        }

        public Builder addressComponents(AddressComponents[] addressComponents) {
            objectBuild.setAddressComponents(addressComponents);
            return this;
        }

        public Builder formattedAddress(String formattedAddress) {
            objectBuild.setFormattedAddress(formattedAddress);
            return this;
        }

        public Builder geometry(Geometry geometry) {
            objectBuild.setGeometry(geometry);
            return this;
        }

        public Builder partialMatch(boolean partialMatch) {
            objectBuild.setPartialMatch(partialMatch);
            return this;
        }

        public Builder placeId(String placeId) {
            objectBuild.setPlaceId(placeId);
            return this;
        }

        public Builder types(String[] types) {
            objectBuild.setTypes(types);
            return this;
        }
    }
}
