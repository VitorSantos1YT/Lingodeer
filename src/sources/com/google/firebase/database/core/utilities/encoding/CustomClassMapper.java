package com.google.firebase.database.core.utilities.encoding;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;
import com.google.firebase.database.PropertyName;
import com.google.firebase.database.ThrowOnExtraProperties;
import com.google.firebase.database.core.utilities.Utilities;
import defpackage.e;
import ep.a;
import hh.p0;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CustomClassMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f19436a = new ConcurrentHashMap();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class BeanMapper<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f19437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Constructor f19438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f19439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final HashMap f19440d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final HashMap f19441e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final HashMap f19442f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final HashMap f19443g;

        public BeanMapper(Class cls) {
            Method[] methods;
            int length;
            int i11;
            this.f19437a = cls;
            this.f19439c = cls.isAnnotationPresent(ThrowOnExtraProperties.class);
            cls.isAnnotationPresent(IgnoreExtraProperties.class);
            this.f19440d = new HashMap();
            this.f19442f = new HashMap();
            this.f19441e = new HashMap();
            this.f19443g = new HashMap();
            Constructor<T> constructor = null;
            try {
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                constructor = declaredConstructor;
                while (true) {
                    Class cls2 = Void.TYPE;
                    if (i11 >= length) {
                        for (Field field : cls.getFields()) {
                            if (!field.getDeclaringClass().equals(Object.class) && Modifier.isPublic(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers()) && !field.isAnnotationPresent(Exclude.class)) {
                                String strB = b(field);
                                a(strB == null ? field.getName() : strB);
                            }
                        }
                        HashMap map = new HashMap();
                        Class superclass = cls;
                        do {
                            for (Method method : superclass.getDeclaredMethods()) {
                                if (method.getName().startsWith("set") && !method.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(cls2) && method.getParameterTypes().length == 1 && !method.isAnnotationPresent(Exclude.class)) {
                                    String strE = e(method);
                                    String str = (String) this.f19440d.get(strE.toLowerCase(Locale.US));
                                    if (str == null) {
                                        continue;
                                    } else {
                                        if (!str.equals(strE)) {
                                            throw new DatabaseException("Found setter with invalid case-sensitive name: " + method.getName());
                                        }
                                        if (method.isBridge()) {
                                            map.put(strE, method);
                                        } else {
                                            Method method2 = (Method) this.f19442f.get(strE);
                                            Method method3 = (Method) map.get(strE);
                                            if (method2 == null) {
                                                method.setAccessible(true);
                                                this.f19442f.put(strE, method);
                                            } else if (!d(method, method2) && (method3 == null || !d(method, method3))) {
                                                throw new DatabaseException("Found a conflicting setters with name: " + method.getName() + " (conflicts with " + method2.getName() + " defined on " + method2.getDeclaringClass().getName() + ")");
                                            }
                                        }
                                    }
                                }
                            }
                            for (Field field2 : superclass.getDeclaredFields()) {
                                String strB2 = b(field2);
                                strB2 = strB2 == null ? field2.getName() : strB2;
                                if (this.f19440d.containsKey(strB2.toLowerCase(Locale.US)) && !this.f19443g.containsKey(strB2)) {
                                    field2.setAccessible(true);
                                    this.f19443g.put(strB2, field2);
                                }
                            }
                            superclass = superclass.getSuperclass();
                            if (superclass == null) {
                                break;
                            }
                        } while (!superclass.equals(Object.class));
                        if (this.f19440d.isEmpty()) {
                            throw new DatabaseException("No properties to serialize found on class ".concat(cls.getName()));
                        }
                        return;
                    }
                    Method method4 = methods[i11];
                    if ((method4.getName().startsWith("get") || method4.getName().startsWith("is")) && !method4.getDeclaringClass().equals(Object.class) && Modifier.isPublic(method4.getModifiers()) && !Modifier.isStatic(method4.getModifiers()) && !method4.getReturnType().equals(cls2) && method4.getParameterTypes().length == 0 && !method4.isBridge() && !method4.isAnnotationPresent(Exclude.class)) {
                        String strE2 = e(method4);
                        a(strE2);
                        method4.setAccessible(true);
                        if (this.f19441e.containsKey(strE2)) {
                            throw new DatabaseException("Found conflicting getters for name: " + method4.getName());
                        }
                        this.f19441e.put(strE2, method4);
                    }
                    i11++;
                }
            } catch (NoSuchMethodException unused) {
            }
            this.f19438b = constructor;
            methods = cls.getMethods();
            length = methods.length;
            i11 = 0;
        }

        public static String b(AccessibleObject accessibleObject) {
            if (accessibleObject.isAnnotationPresent(PropertyName.class)) {
                return ((PropertyName) accessibleObject.getAnnotation(PropertyName.class)).value();
            }
            return null;
        }

        public static boolean d(Method method, Method method2) {
            method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass());
            char[] cArr = Utilities.f19432a;
            Class<?> returnType = method.getReturnType();
            Class cls = Void.TYPE;
            returnType.equals(cls);
            method2.getReturnType().equals(cls);
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] parameterTypes2 = method2.getParameterTypes();
            int length = parameterTypes.length;
            int length2 = parameterTypes2.length;
            return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
        }

        public static String e(Method method) {
            String strB = b(method);
            if (strB != null) {
                return strB;
            }
            String name = method.getName();
            String[] strArr = {"get", "set", "is"};
            String str = null;
            for (int i11 = 0; i11 < 3; i11++) {
                String str2 = strArr[i11];
                if (name.startsWith(str2)) {
                    str = str2;
                }
            }
            if (str == null) {
                throw new IllegalArgumentException(a.e("Unknown Bean prefix for method: ", name));
            }
            char[] charArray = name.substring(str.length()).toCharArray();
            for (int i12 = 0; i12 < charArray.length && Character.isUpperCase(charArray[i12]); i12++) {
                charArray[i12] = Character.toLowerCase(charArray[i12]);
            }
            return new String(charArray);
        }

        public static Type f(Type type, Map map) {
            if (!(type instanceof TypeVariable)) {
                return type;
            }
            Type type2 = (Type) map.get(type);
            if (type2 != null) {
                return type2;
            }
            throw new IllegalStateException("Could not resolve type " + type);
        }

        public final void a(String str) {
            Locale locale = Locale.US;
            String str2 = (String) this.f19440d.put(str.toLowerCase(locale), str);
            if (str2 == null || str.equals(str2)) {
                return;
            }
            throw new DatabaseException("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
        }

        public final Object c(Map map, Map map2) {
            Class cls = this.f19437a;
            Constructor constructor = this.f19438b;
            if (constructor == null) {
                throw new DatabaseException("Class " + cls.getName() + " does not define a no-argument constructor. If you are using ProGuard, make sure these constructors are not stripped.");
            }
            try {
                Object objNewInstance = constructor.newInstance(null);
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    HashMap map3 = this.f19442f;
                    if (map3.containsKey(str)) {
                        Method method = (Method) map3.get(str);
                        Type[] genericParameterTypes = method.getGenericParameterTypes();
                        if (genericParameterTypes.length != 1) {
                            throw new IllegalStateException("Setter does not have exactly one parameter");
                        }
                        try {
                            method.invoke(objNewInstance, CustomClassMapper.c(entry.getValue(), f(genericParameterTypes[0], map2)));
                        } catch (IllegalAccessException e8) {
                            throw new RuntimeException(e8);
                        } catch (InvocationTargetException e10) {
                            throw new RuntimeException(e10);
                        }
                    } else {
                        HashMap map4 = this.f19443g;
                        if (map4.containsKey(str)) {
                            Field field = (Field) map4.get(str);
                            try {
                                field.set(objNewInstance, CustomClassMapper.c(entry.getValue(), f(field.getGenericType(), map2)));
                            } catch (IllegalAccessException e11) {
                                throw new RuntimeException(e11);
                            }
                        } else {
                            StringBuilder sbQ = p0.q("No setter/field for ", str, " found on class ");
                            sbQ.append(cls.getName());
                            String string = sbQ.toString();
                            if (this.f19440d.containsKey(str.toLowerCase(Locale.US))) {
                                string = e.m(string, " (fields/setters are case sensitive!)");
                            }
                            if (this.f19439c) {
                                throw new DatabaseException(string);
                            }
                        }
                    }
                }
                return objNewInstance;
            } catch (IllegalAccessException e12) {
                throw new RuntimeException(e12);
            } catch (InstantiationException e13) {
                throw new RuntimeException(e13);
            } catch (InvocationTargetException e14) {
                throw new RuntimeException(e14);
            }
        }
    }

    public static Double a(Object obj) {
        if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        }
        if (!(obj instanceof Long)) {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            throw new DatabaseException("Failed to convert a value of type " + obj.getClass().getName() + " to double");
        }
        Long l9 = (Long) obj;
        Double dValueOf = Double.valueOf(l9.doubleValue());
        if (dValueOf.longValue() == l9.longValue()) {
            return dValueOf;
        }
        throw new DatabaseException("Loss of precision while converting number to double: " + obj + ". Did you mean to use a 64-bit long instead?");
    }

    public static Object b(Class cls, Object obj) {
        if (obj == null) {
            return null;
        }
        if (!cls.isPrimitive() && !Number.class.isAssignableFrom(cls) && !Boolean.class.isAssignableFrom(cls) && !Character.class.isAssignableFrom(cls)) {
            if (String.class.isAssignableFrom(cls)) {
                if (obj instanceof String) {
                    return (String) obj;
                }
                throw new DatabaseException("Failed to convert value of type " + obj.getClass().getName() + " to String");
            }
            if (cls.isArray()) {
                throw new DatabaseException("Converting to Arrays is not supported, please use Listsinstead");
            }
            if (cls.getTypeParameters().length > 0) {
                throw new DatabaseException("Class " + cls.getName() + " has generic type parameters, please use GenericTypeIndicator instead");
            }
            if (cls.equals(Object.class)) {
                return obj;
            }
            if (!cls.isEnum()) {
                BeanMapper beanMapperE = e(cls);
                if (obj instanceof Map) {
                    return beanMapperE.c(d(obj), Collections.EMPTY_MAP);
                }
                throw new DatabaseException("Can't convert object of type " + obj.getClass().getName() + " to type " + cls.getName());
            }
            if (!(obj instanceof String)) {
                throw new DatabaseException("Expected a String while deserializing to enum " + cls + " but got a " + obj.getClass());
            }
            String str = (String) obj;
            try {
                return Enum.valueOf(cls, str);
            } catch (IllegalArgumentException unused) {
                throw new DatabaseException("Could not find enum value of " + cls.getName() + " for value \"" + str + "\"");
            }
        }
        if (Integer.class.isAssignableFrom(cls) || Integer.TYPE.isAssignableFrom(cls)) {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            if (!(obj instanceof Long) && !(obj instanceof Double)) {
                throw new DatabaseException("Failed to convert a value of type " + obj.getClass().getName() + " to int");
            }
            Number number = (Number) obj;
            double dDoubleValue = number.doubleValue();
            if (dDoubleValue >= -2.147483648E9d && dDoubleValue <= 2.147483647E9d) {
                return Integer.valueOf(number.intValue());
            }
            throw new DatabaseException("Numeric value out of 32-bit integer range: " + dDoubleValue + ". Did you mean to use a long or double instead of an int?");
        }
        if (Boolean.class.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls)) {
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            throw new DatabaseException("Failed to convert value of type " + obj.getClass().getName() + " to boolean");
        }
        if (Double.class.isAssignableFrom(cls) || Double.TYPE.isAssignableFrom(cls)) {
            return a(obj);
        }
        if (!Long.class.isAssignableFrom(cls) && !Long.TYPE.isAssignableFrom(cls)) {
            if (Float.class.isAssignableFrom(cls) || Float.TYPE.isAssignableFrom(cls)) {
                return Float.valueOf(a(obj).floatValue());
            }
            throw new DatabaseException(a.g("Deserializing values to ", cls.getSimpleName(), " is not supported"));
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (!(obj instanceof Double)) {
            throw new DatabaseException("Failed to convert a value of type " + obj.getClass().getName() + " to long");
        }
        Double d5 = (Double) obj;
        if (d5.doubleValue() >= -9.223372036854776E18d && d5.doubleValue() <= 9.223372036854776E18d) {
            return Long.valueOf(d5.longValue());
        }
        throw new DatabaseException("Numeric value out of 64-bit long range: " + d5 + ". Did you mean to use a double instead of a long?");
    }

    public static Object c(Object obj, Type type) {
        if (obj == null) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof Class) {
                return b((Class) type, obj);
            }
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                if (wildcardType.getLowerBounds().length > 0) {
                    throw new DatabaseException("Generic lower-bounded wildcard types are not supported");
                }
                Type[] upperBounds = wildcardType.getUpperBounds();
                int length = upperBounds.length;
                type.toString();
                char[] cArr = Utilities.f19432a;
                return c(obj, upperBounds[0]);
            }
            if (type instanceof TypeVariable) {
                Type[] bounds = ((TypeVariable) type).getBounds();
                int length2 = bounds.length;
                type.toString();
                char[] cArr2 = Utilities.f19432a;
                return c(obj, bounds[0]);
            }
            if (type instanceof GenericArrayType) {
                throw new DatabaseException("Generic Arrays are not supported, please use Lists instead");
            }
            throw new IllegalStateException("Unknown type encountered: " + type);
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Class cls = (Class) parameterizedType.getRawType();
        if (List.class.isAssignableFrom(cls)) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            if (!(obj instanceof List)) {
                throw new DatabaseException("Expected a List while deserializing, but got a " + obj.getClass());
            }
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c(it.next(), type2));
            }
            return arrayList;
        }
        if (Map.class.isAssignableFrom(cls)) {
            Type type3 = parameterizedType.getActualTypeArguments()[0];
            Type type4 = parameterizedType.getActualTypeArguments()[1];
            if (!type3.equals(String.class)) {
                throw new DatabaseException("Only Maps with string keys are supported, but found Map with key type " + type3);
            }
            Map mapD = d(obj);
            HashMap map = new HashMap();
            for (Map.Entry entry : mapD.entrySet()) {
                map.put((String) entry.getKey(), c(entry.getValue(), type4));
            }
            return map;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            throw new DatabaseException("Collections are not supported, please use Lists instead");
        }
        Map mapD2 = d(obj);
        BeanMapper beanMapperE = e(cls);
        HashMap map2 = new HashMap();
        TypeVariable[] typeParameters = beanMapperE.f19437a.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length != typeParameters.length) {
            throw new IllegalStateException("Mismatched lengths for type variables and actual types");
        }
        for (int i11 = 0; i11 < typeParameters.length; i11++) {
            map2.put(typeParameters[i11], actualTypeArguments[i11]);
        }
        return beanMapperE.c(mapD2, map2);
    }

    public static Map d(Object obj) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new DatabaseException("Expected a Map while deserializing, but got a " + obj.getClass());
    }

    public static BeanMapper e(Class cls) {
        ConcurrentHashMap concurrentHashMap = f19436a;
        BeanMapper beanMapper = (BeanMapper) concurrentHashMap.get(cls);
        if (beanMapper != null) {
            return beanMapper;
        }
        BeanMapper beanMapper2 = new BeanMapper(cls);
        concurrentHashMap.put(cls, beanMapper2);
        return beanMapper2;
    }

    public static Object f(Object obj) {
        Object objInvoke;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            if ((obj instanceof Float) || (obj instanceof Double)) {
                Number number = (Number) obj;
                double dDoubleValue = number.doubleValue();
                return (dDoubleValue > 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d || Math.floor(dDoubleValue) != dDoubleValue) ? Double.valueOf(dDoubleValue) : Long.valueOf(number.longValue());
            }
            if ((obj instanceof Long) || (obj instanceof Integer)) {
                return obj;
            }
            throw new DatabaseException(a.g("Numbers of type ", obj.getClass().getSimpleName(), " are not supported, please use an int, long, float or double"));
        }
        if ((obj instanceof String) || (obj instanceof Boolean)) {
            return obj;
        }
        if (obj instanceof Character) {
            throw new DatabaseException("Characters are not supported, please use Strings");
        }
        if (obj instanceof Map) {
            HashMap map = new HashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new DatabaseException("Maps with non-string keys are not supported");
                }
                map.put((String) key, f(entry.getValue()));
            }
            return map;
        }
        if (obj instanceof Collection) {
            if (!(obj instanceof List)) {
                throw new DatabaseException("Serializing Collections is not supported, please use Lists instead");
            }
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(f(it.next()));
            }
            return arrayList;
        }
        if (obj.getClass().isArray()) {
            throw new DatabaseException("Serializing Arrays is not supported, please use Lists instead");
        }
        if (obj instanceof Enum) {
            return ((Enum) obj).name();
        }
        BeanMapper beanMapperE = e(obj.getClass());
        HashMap map2 = beanMapperE.f19441e;
        Class cls = beanMapperE.f19437a;
        if (!cls.isAssignableFrom(obj.getClass())) {
            throw new IllegalArgumentException("Can't serialize object of class " + obj.getClass() + " with BeanMapper for class " + cls);
        }
        HashMap map3 = new HashMap();
        for (String str : beanMapperE.f19440d.values()) {
            if (map2.containsKey(str)) {
                try {
                    objInvoke = ((Method) map2.get(str)).invoke(obj, null);
                } catch (IllegalAccessException e8) {
                    throw new RuntimeException(e8);
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException(e10);
                }
            } else {
                Field field = (Field) beanMapperE.f19443g.get(str);
                if (field == null) {
                    throw new IllegalStateException(a.e("Bean property without field or getter:", str));
                }
                try {
                    objInvoke = field.get(obj);
                } catch (IllegalAccessException e11) {
                    throw new RuntimeException(e11);
                }
            }
            map3.put(str, f(objInvoke));
        }
        return map3;
    }
}
