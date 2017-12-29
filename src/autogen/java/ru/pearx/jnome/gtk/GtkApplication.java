package ru.pearx.jnome.gtk;

import ru.pearx.jnome.glib.GApplication;

/*
 * Created by mrAppleXZ on 28.12.17 16:03.
 */
public class GtkApplication extends GApplication
{
    public GtkApplication(String id, int flags)
    {
        pointer = gtk_application_new(id, flags);
    }

    private static native long gtk_application_new(String id, int flags);
}
