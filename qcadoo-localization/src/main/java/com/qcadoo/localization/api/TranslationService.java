/**
 * ***************************************************************************
 * Copyright (c) 2010 Qcadoo Limited
 * Project: Qcadoo MES
 * Version: 0.3.0
 *
 * This file is part of Qcadoo.
 *
 * Qcadoo is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation; either version 3 of the License,
 * or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 * ***************************************************************************
 */

package com.qcadoo.localization.api;

import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Service for getting translations.
 * 
 * @since 0.4.0
 */
public interface TranslationService {

    /**
     * Returns all messages (key and translation) for given group name.
     * 
     * @param group
     *            group
     * @param locale
     *            prefix
     * @return messages
     */
    Map<String, String> getMessagesGroup(String group, Locale locale);

    /**
     * Translates given code into the locale using the args.
     * 
     * @param messageCode
     *            message's code
     * @param locale
     *            locale
     * @param args
     *            message's args
     * @return the translation
     */
    String translate(String code, Locale locale, Object... args);

    /**
     * Translates given codes into the locale using the args. First translated code will be returned.
     * 
     * @param messageCodes
     *            message's codes
     * @param locale
     *            locale
     * @param args
     *            message's args
     * @return the translation
     */
    String translate(List<String> code, Locale locale, Object... args);

    /**
     * Returns a map of available locales, defined in basic's plugin qcadoo-plugin
     * 
     * @return a map with a locale value and its name
     */
    Map<String, String> getLocales();
}
