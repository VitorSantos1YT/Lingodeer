package androidx.lifecycle;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import ns.o;
import oz.x;
import vf.eq.EHjhWcesDUIsIw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class Lifecycling {
    private static final int GENERATED_CALLBACK = 2;
    private static final int REFLECTIVE_CALLBACK = 1;
    public static final Lifecycling INSTANCE = new Lifecycling();
    private static final Map<Class<?>, Integer> callbackCache = new HashMap();
    private static final Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> classToAdapters = new HashMap();

    private Lifecycling() {
    }

    private final GeneratedAdapter createGeneratedAdapter(Constructor<? extends GeneratedAdapter> constructor, Object obj) {
        try {
            GeneratedAdapter generatedAdapterNewInstance = constructor.newInstance(obj);
            m.c(generatedAdapterNewInstance);
            return generatedAdapterNewInstance;
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    private final Constructor<? extends GeneratedAdapter> generatedConstructor(Class<?> cls) {
        try {
            Package r9 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r9 != null ? r9.getName() : BuildConfig.VERSION_NAME;
            m.c(name);
            if (name.length() != 0) {
                m.c(canonicalName);
                canonicalName = canonicalName.substring(name.length() + 1);
                m.e(canonicalName, "substring(...)");
            }
            m.c(canonicalName);
            String adapterName = getAdapterName(canonicalName);
            if (name.length() != 0) {
                adapterName = name + '.' + adapterName;
            }
            Constructor declaredConstructor = Class.forName(adapterName).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException(e8);
        }
    }

    private final int getObserverConstructorType(Class<?> cls) {
        Map<Class<?>, Integer> map = callbackCache;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iResolveObserverCallbackType = resolveObserverCallbackType(cls);
        map.put(cls, Integer.valueOf(iResolveObserverCallbackType));
        return iResolveObserverCallbackType;
    }

    private final boolean isLifecycleParent(Class<?> cls) {
        return cls != null && LifecycleObserver.class.isAssignableFrom(cls);
    }

    public static final LifecycleEventObserver lifecycleEventObserver(Object object) {
        m.f(object, "object");
        boolean z11 = object instanceof LifecycleEventObserver;
        boolean z12 = object instanceof DefaultLifecycleObserver;
        if (z11 && z12) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, (LifecycleEventObserver) object);
        }
        if (z12) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, null);
        }
        if (z11) {
            return (LifecycleEventObserver) object;
        }
        Class<?> cls = object.getClass();
        Lifecycling lifecycling = INSTANCE;
        if (lifecycling.getObserverConstructorType(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(object);
        }
        List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(cls);
        m.c(list);
        List<Constructor<? extends GeneratedAdapter>> list2 = list;
        if (list2.size() == 1) {
            return new SingleGeneratedAdapterObserver(lifecycling.createGeneratedAdapter(list2.get(0), object));
        }
        int size = list2.size();
        GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
        for (int i11 = 0; i11 < size; i11++) {
            generatedAdapterArr[i11] = INSTANCE.createGeneratedAdapter(list2.get(i11), object);
        }
        return new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
    }

    private final int resolveObserverCallbackType(Class<?> cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() != null) {
            Constructor<? extends GeneratedAdapter> constructorGeneratedConstructor = generatedConstructor(cls);
            if (constructorGeneratedConstructor != null) {
                classToAdapters.put(cls, o.K(constructorGeneratedConstructor));
                return 2;
            }
            if (!ClassesInfoCache.sInstance.hasLifecycleMethods(cls)) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (isLifecycleParent(superclass)) {
                    m.c(superclass);
                    if (getObserverConstructorType(superclass) != 1) {
                        List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(superclass);
                        m.c(list);
                        arrayList = new ArrayList(list);
                    }
                } else {
                    arrayList = null;
                }
                e00.i iVarA = l.a(cls.getInterfaces());
                while (iVarA.hasNext()) {
                    Class<?> cls2 = (Class) iVarA.next();
                    if (isLifecycleParent(cls2)) {
                        m.c(cls2);
                        if (getObserverConstructorType(cls2) != 1) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            List<Constructor<? extends GeneratedAdapter>> list2 = classToAdapters.get(cls2);
                            m.c(list2);
                            arrayList.addAll(list2);
                        }
                    }
                }
                if (arrayList != null) {
                    classToAdapters.put(cls, arrayList);
                    return 2;
                }
            }
        }
        return 1;
    }

    public static final String getAdapterName(String str) {
        m.f(str, EHjhWcesDUIsIw.DKAeFEeymYefq);
        return x.q0(str, ".", "_").concat("_LifecycleAdapter");
    }
}
