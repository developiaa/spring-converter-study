package study.developia.converter.converter;

import lombok.SneakyThrows;
import study.developia.converter.enums.ImageStatus;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class PartnerServiceImageStatusConverter
        implements AttributeConverter<ImageStatus, String> {

    @Override
    public String convertToDatabaseColumn(ImageStatus attribute) {
        return attribute.getValue();
    }

    @SneakyThrows
    @Override
    public ImageStatus convertToEntityAttribute(String dbData) {
        return ImageStatus.findBy(dbData);
    }
}
