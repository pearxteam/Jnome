package ru.pearx.jnome.generator.types

/*
 * Created by mrAppleXZ on 29.12.17 21:13.
 */

trait IType
{
    abstract String getJavaType()
    abstract boolean isCTypeMatches(String type)

    void onDefine(String filename, String contents) {}
}