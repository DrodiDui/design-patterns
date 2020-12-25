package by.kapitonov.patterns.structural.facade;

public class OggCompressionCodec implements Codec {

    private String codec = "ogg";

    @Override
    public String getCodec() {
        return codec;
    }
}
