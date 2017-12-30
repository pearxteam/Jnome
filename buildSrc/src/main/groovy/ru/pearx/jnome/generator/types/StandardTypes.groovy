package ru.pearx.jnome.generator.types

/*
 * Created by mrAppleXZ on 29.12.17 21:25.
 */

class StandardTypes
{
    //todo better unsigned support?!?
    static class Int8 implements IType
    {
        @Override
        String getJavaType()
        {
            return "byte"
        }

        @Override
        boolean isCTypeMatches(String type)
        {
            return type == "signed char" || type == "unsigned char" || type == "char"
        }
    }

    static class Int16 implements IType
    {
        @Override
        String getJavaType()
        {
            return "short"
        }

        @Override
        boolean isCTypeMatches(String type)
        {
            return type == "signed short" || type == "unsigned short" || type == "char"
        }
    }

    static class Int32 implements IType
    {
        @Override
        String getJavaType()
        {
            return "int"
        }

        @Override
        boolean isCTypeMatches(String type)
        {
            return type == "signed int" || type == "unsigned int" || type == "char"
        }
    }

    static class Int64 implements IType
    {
        @Override
        String getJavaType()
        {
            return "long"
        }

        @Override
        boolean isCTypeMatches(String type)
        {
            return type == "signed long" || type == "unsigned long" || type == "char"
        }
    }

    static class Float implements IType
    {
        @Override
        String getJavaType()
        {
            return "float"
        }

        @Override
        boolean isCTypeMatches(String type)
        {
            return type == "float"
        }
    }

    static class Double implements IType
    {
        @Override
        String getJavaType()
        {
            return "double"
        }

        @Override
        boolean isCTypeMatches(String type)
        {
            return type == "double"
        }
    }
}
