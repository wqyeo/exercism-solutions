public class LogLine {

    private String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String logLevelString = logLine.split("]:")[0].replace("[", "");
        return LogLevel.getLogLevelFromString(logLevelString);
    }

    private String getLogLevelString() {
        return logLine.split("]:")[1].trim();
    }

    public String getOutputForShortLog() {
        LogLevel logLevel = getLogLevel();
        return String.format("%d:%s", logLevel.getLogLevelNumbers(), getLogLevelString());
    }
}
