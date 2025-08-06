package com.spotifystats;

public enum Keys {
    CLIENT_ID("f657c78e6ac4479994e4c5031f29951c"),
    CLIENT_SECRET("95bb730ed7bf4eb7bfad2d0ab0259e9f");

    private final String value;

    Keys(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

