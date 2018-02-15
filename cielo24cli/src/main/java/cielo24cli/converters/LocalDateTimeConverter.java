package cielo24cli.converters;

import java.time.LocalDateTime;

import com.beust.jcommander.IStringConverter;

public class LocalDateTimeConverter implements IStringConverter<LocalDateTime> {
	@Override
	public LocalDateTime convert(String arg) {
		try {
			return LocalDateTime.parse(arg);
		} catch (Exception e) {
			return null;
		}
	}
}