package com.google.common.base;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Throwables {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f16413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f16414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f16415c;

    /* JADX INFO: renamed from: com.google.common.base.Throwables$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends AbstractList<StackTraceElement> {
        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i11) {
            Method method = Throwables.f16414b;
            java.util.Objects.requireNonNull(method);
            Object obj = Throwables.f16413a;
            java.util.Objects.requireNonNull(obj);
            try {
                return (StackTraceElement) method.invoke(obj, null, Integer.valueOf(i11));
            } catch (IllegalAccessException e8) {
                throw new RuntimeException(e8);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                Throwables.a(cause);
                throw new RuntimeException(cause);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            Method method = Throwables.f16415c;
            java.util.Objects.requireNonNull(method);
            Object obj = Throwables.f16413a;
            java.util.Objects.requireNonNull(obj);
            try {
                return ((Integer) method.invoke(obj, null)).intValue();
            } catch (IllegalAccessException e8) {
                throw new RuntimeException(e8);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                Throwables.a(cause);
                throw new RuntimeException(cause);
            }
        }
    }

    static {
        Object objInvoke;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            objInvoke = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e8) {
            throw e8;
        } catch (Throwable unused) {
            objInvoke = null;
        }
        f16413a = objInvoke;
        if (objInvoke == null) {
            method = null;
        } else {
            try {
                method = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
            } catch (ThreadDeath e10) {
                throw e10;
            } catch (Throwable unused2) {
                method = null;
            }
        }
        f16414b = method;
        if (objInvoke != null) {
            try {
                try {
                    method2 = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceDepth", Throwable.class);
                } catch (ThreadDeath e11) {
                    throw e11;
                } catch (Throwable unused3) {
                    method2 = null;
                }
                if (method2 != null) {
                    method2.invoke(objInvoke, new Throwable());
                    method3 = method2;
                }
            } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused4) {
            }
        }
        f16415c = method3;
    }

    private Throwables() {
    }

    public static void a(Throwable th2) {
        th2.getClass();
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
    }
}
