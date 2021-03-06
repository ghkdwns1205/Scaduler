package jh.scaduler.config.yml;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import org.springframework.context.support.ResourceBundleMessageSource;
import net.rakugakibox.util.YamlResourceBundle;

public class YamlMessageSource extends ResourceBundleMessageSource {
	@Override
    protected ResourceBundle doGetBundle(String basename, Locale locale) throws MissingResourceException {
        return ResourceBundle.getBundle(basename, locale, YamlResourceBundle.Control.INSTANCE);
    }
}