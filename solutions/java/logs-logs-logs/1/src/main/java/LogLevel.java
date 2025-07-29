public enum LogLevel {
    UNKNOWN(0),
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42);

    private final int logLevel;

    LogLevel(int logLevel) {
        this.logLevel = logLevel;
    }

    public int getLogLevelNumbers() {
        return logLevel;
    }

    public String getLogLevelString() {
        return switch (logLevel) {
            case 0 -> "UKW";
            case 1 -> "TRC";
            case 2 -> "DBG";
            case 4 -> "INF";
            case 5 -> "WRN";
            case 6 -> "ERR";
            case 42 -> "FTL";
            default -> "XYZ";
        };
    }

    public static LogLevel getLogLevelFromString(String logLevelString) {
        return switch (logLevelString) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }
}
