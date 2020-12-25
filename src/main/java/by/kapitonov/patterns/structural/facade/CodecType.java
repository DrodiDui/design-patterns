package by.kapitonov.patterns.structural.facade;

public enum CodecType {

    OGG_CODEC("ogg"),
    MPEG_CODEC("mp4");

    private String codecTypeName;

    CodecType(String codecTypeName) {
        this.codecTypeName = codecTypeName;
    }
}
