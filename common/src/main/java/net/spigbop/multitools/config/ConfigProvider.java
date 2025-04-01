package net.spigbop.multitools.config;

import net.spigbop.multitools.Constants;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ConfigProvider {
    protected static Class<?> supplierClass = null;
    protected static Object supplierObject = null;

    public static void resolveConfig() {
        if(supplierClass != null) return;

        try {
            supplierObject = Class.forName("net.spigbop.multitools.Multitools").getDeclaredField("config").get(null);
            supplierClass = supplierObject.getClass();
        } catch (Exception _e) {
            try {
                supplierClass = Class.forName("net.spigbop.multitools.config.ForgeConfig");
                supplierClass.getMethod("register").invoke(null);
            } catch (Exception e) {
                Constants.LOG.warn("Error loading config {}", e.toString());
            }
        }
    }

    public static <T> T request(String name, T defaultValue) {
        resolveConfig();

        try {
            Field field = supplierClass.getField(name);
            if(supplierObject != null) {
                return (T) field.get(supplierObject);
            } else {
                Object forgeConfigSpecVar = field.get(null);
                Method getter = forgeConfigSpecVar.getClass().getMethod("get");
                return (T) getter.invoke(forgeConfigSpecVar);
            }
        } catch (Exception e) {
            Constants.LOG.warn("Couldn't find get config entry, defaulting: {}", name);
        }

        return defaultValue;
    }
}
