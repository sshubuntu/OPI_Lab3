package com.sshubuntu.weblab3.i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public final class MessageProvider {

    private static final String BUNDLE_NAME = "i18n.messages";
    private static final ResourceBundle BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, Locale.getDefault());

    private MessageProvider() {
    }

    public static String get(String key, Object... args) {
        String pattern = BUNDLE.getString(key);
        return MessageFormat.format(pattern, args);
    }
}
