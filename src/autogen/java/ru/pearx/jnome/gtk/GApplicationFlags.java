package ru.pearx.jnome.gtk;

/*
 * Created by mrAppleXZ on 28.12.17 16:08.
 */
public class GApplicationFlags
{
    public static final int G_APPLICATION_FLAGS_NONE = 0;
    public static final int G_APPLICATION_IS_SERVICE = 1 << 0;
    public static final int G_APPLICATION_IS_LAUNCHER = 1 << 1;
    public static final int G_APPLICATION_HANDLES_OPEN = 1 << 2;
    public static final int G_APPLICATION_HANDLES_COMMAND_LINE = 1 << 3;
    public static final int G_APPLICATION_SEND_ENVIRONMENT = 1 << 4;
    public static final int G_APPLICATION_NON_UNIQUE = 1 << 5;
    public static final int G_APPLICATION_CAN_OVERRIDE_APP_ID = 1 << 6;
}
