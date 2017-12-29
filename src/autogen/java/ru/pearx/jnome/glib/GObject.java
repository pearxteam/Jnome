package ru.pearx.jnome.glib;

/*
 * Created by mrAppleXZ on 29.12.17 11:53.
 */
public class GObject
{
    protected long pointer;

    protected static native void g_object_unref(long pointer);

    @Override
    protected void finalize() throws Throwable
    {
        g_object_unref(pointer);
    }
}
