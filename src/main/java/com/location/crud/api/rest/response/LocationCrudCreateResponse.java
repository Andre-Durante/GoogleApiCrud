package com.location.crud.api.rest.response;

public class LocationCrudCreateResponse {

    private String id;
    private String description;

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public static Builder builder() { return new Builder(); }

    public static final class Builder {

        private LocationCrudCreateResponse objectBuild;

        private Builder() {
            this.objectBuild = new LocationCrudCreateResponse();
        }

        public LocationCrudCreateResponse build() {
            return objectBuild;
        }

        public Builder id(String id) {
            objectBuild.setId(id);
            return this;
        }

        public Builder description(String description) {
            objectBuild.setDescription(description);
            return this;
        }
    }
}