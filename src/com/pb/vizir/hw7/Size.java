package com.pb.vizir.hw7;

public enum Size {
    XXS("XXS", 32),
    XS("XS", 34),
    S("S", 36),
    M("M", 38),
    L("L", 40);

    private String description;
    private int euroSize;

    Size (String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    public String getDescription() {
        if (this.description == XXS.description) {
            return "Детский размер";
        }
        return "Взрослый размер";
    }

    public int getEuroSize() {
        return this.euroSize;
    }
}