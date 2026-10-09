package com.google.common.eventbus;

import com.google.common.base.Strings;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Primitives;
import com.google.common.reflect.TypeToken;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class SubscriberRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LoadingCache f17320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LoadingCache f17321b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class MethodIdentifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f17323b;

        public MethodIdentifier(Method method) {
            this.f17322a = method.getName();
            this.f17323b = Arrays.asList(method.getParameterTypes());
        }

        public final boolean equals(Object obj) {
            if (obj instanceof MethodIdentifier) {
                MethodIdentifier methodIdentifier = (MethodIdentifier) obj;
                if (this.f17322a.equals(methodIdentifier.f17322a) && this.f17323b.equals(methodIdentifier.f17323b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f17322a, this.f17323b});
        }
    }

    static {
        CacheBuilder cacheBuilderC = CacheBuilder.c();
        cacheBuilderC.d();
        f17320a = cacheBuilderC.a(new CacheLoader<Class<?>, ImmutableList<Method>>() { // from class: com.google.common.eventbus.SubscriberRegistry.1
            @Override // com.google.common.cache.CacheLoader
            public final Object a(Object obj) {
                LoadingCache loadingCache = SubscriberRegistry.f17320a;
                Set setZ0 = new TypeToken.TypeSet().z0();
                HashMap map = new HashMap();
                Iterator it = setZ0.iterator();
                while (it.hasNext()) {
                    for (Method method : ((Class) it.next()).getDeclaredMethods()) {
                        if (method.isAnnotationPresent(Subscribe.class) && !method.isSynthetic()) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            boolean z11 = parameterTypes.length == 1;
                            int length = parameterTypes.length;
                            if (!z11) {
                                throw new IllegalArgumentException(Strings.c("Method %s has @Subscribe annotation but has %s parameters. Subscriber methods must have exactly 1 parameter.", method, Integer.valueOf(length)));
                            }
                            boolean zIsPrimitive = parameterTypes[0].isPrimitive();
                            String name = parameterTypes[0].getName();
                            Class<?> cls = parameterTypes[0];
                            Map map2 = Primitives.f17522a;
                            cls.getClass();
                            Class<?> cls2 = (Class) Primitives.f17522a.get(cls);
                            if (cls2 != null) {
                                cls = cls2;
                            }
                            String simpleName = cls.getSimpleName();
                            if (zIsPrimitive) {
                                throw new IllegalArgumentException(Strings.c("@Subscribe method %s's parameter is %s. Subscriber methods cannot accept primitives. Consider changing the parameter to %s.", method, name, simpleName));
                            }
                            MethodIdentifier methodIdentifier = new MethodIdentifier(method);
                            if (!map.containsKey(methodIdentifier)) {
                                map.put(methodIdentifier, method);
                            }
                        }
                    }
                }
                return ImmutableList.n(map.values());
            }
        });
        CacheBuilder cacheBuilderC2 = CacheBuilder.c();
        cacheBuilderC2.d();
        f17321b = cacheBuilderC2.a(new CacheLoader<Class<?>, ImmutableSet<Class<?>>>() { // from class: com.google.common.eventbus.SubscriberRegistry.2
            @Override // com.google.common.cache.CacheLoader
            public final Object a(Object obj) {
                return ImmutableSet.m(new TypeToken.TypeSet().z0());
            }
        });
    }
}
