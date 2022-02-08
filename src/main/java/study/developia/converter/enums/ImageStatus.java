package study.developia.converter.enums;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum ImageStatus {
    PENDING("PENDING"),
    APPROVE("APPROVE"),
    REJECT("REJECT");

    private static final Map<String, ImageStatus> partnerServiceImageStatusHashMap = new HashMap<>();

    static {
        for (ImageStatus value : values()) {
            partnerServiceImageStatusHashMap.put(value.name(), value);
        }
    }

    @Getter
    private final String value;

    ImageStatus(String value) {
        this.value = value;
    }

    public static ImageStatus findBy(String value) throws Exception {
        return Optional.ofNullable(partnerServiceImageStatusHashMap.get(value))
            .orElseThrow(() -> new Exception("Error"));
    }
}
