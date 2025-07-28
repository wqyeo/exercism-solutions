class SqueakyClean {

    static String clean(String input) {
        String cleaned = replaceSpacesWithUnderscores(input);
        cleaned = convertKebabToCamelCase(cleaned);
        cleaned = convertLeetspeak(cleaned);
        cleaned = omitNonLetters(cleaned);
        return cleaned;
    }

    private static String replaceSpacesWithUnderscores(String input) {
        return input.replace(" ", "_");
    }

    private static String convertKebabToCamelCase(String input) {
        StringBuilder result = new StringBuilder();
        boolean nextUpperCase = false;

        for (char c : input.toCharArray()) {
            if (c == '-') {
                nextUpperCase = true;
            } else if (nextUpperCase) {
                result.append(Character.toUpperCase(c));
                nextUpperCase = false;
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    private static String convertLeetspeak(String input) {
        return input.replace('4', 'a')
                    .replace('3', 'e')
                    .replace('0', 'o')
                    .replace('1', 'l')
                    .replace('7', 't');
    }

    private static String omitNonLetters(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c) || c == '_') {
                result.append(c);
            }
        }
        return result.toString();
    }
}
