package sh.fer.calendar.infrastructure.configuration.snowflake;

import com.callicoder.snowflake.Snowflake;

public class EventID {

    private static Snowflake instance;

    private EventID(){}

    public static Snowflake getInstance() {

        if (instance == null) {
            instance = new Snowflake();
        }
        return instance;
    }

}
