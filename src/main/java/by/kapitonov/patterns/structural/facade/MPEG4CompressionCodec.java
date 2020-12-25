package by.kapitonov.patterns.structural.facade;

public class MPEG4CompressionCodec implements Codec {

    private String codec = "mp4";

    @Override
    public String getCodec() {
        return codec;
    }
}
