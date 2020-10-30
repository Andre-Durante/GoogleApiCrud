package com.location.crud.dto;

public class GoogleClientData {

    private Results[] results;
    private String status ;

    public Results[] getResults() { return results; }

    public void setResults(Results[] results) { this.results = results; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public static Builder builder() { return new Builder(); }

    public static final class Builder {

        private GoogleClientData objectBuild;

        private Builder() {
            this.objectBuild = new GoogleClientData();
        }

        public GoogleClientData build() {
            return objectBuild;
        }

        public Builder results(Results[] results) {
            objectBuild.setResults(results);
            return this;
        }

        public Builder status(String status) {
            objectBuild.setStatus(status);
            return this;
        }
    }
}