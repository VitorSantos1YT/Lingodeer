package mw;

import fa.EQx.nuRcCS;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g4 implements k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f42426b = Logger.getLogger(g4.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Constructor f42427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f42428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final RuntimeException f42429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object[] f42430f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f42431a;

    public g4() {
        RuntimeException runtimeException = f42429e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f42431a = f42427c.newInstance(null);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // mw.k2
    public final void a() {
        try {
            f42428d.invoke(this.f42431a, f42430f);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    static {
        Method method;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod(nuRcCS.NPGw, Long.TYPE);
            try {
                cls.getMethod("sum", null);
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i11];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    } else {
                        i11++;
                    }
                }
                th = null;
            } catch (Throwable th2) {
                th = th2;
                f42426b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                constructor = null;
            }
        } catch (Throwable th3) {
            th = th3;
            method = null;
        }
        if (th != null || constructor == null) {
            f42427c = null;
            f42428d = null;
            f42429e = new RuntimeException(th);
        } else {
            f42427c = constructor;
            f42428d = method;
            f42429e = null;
        }
        f42430f = new Object[]{1L};
    }
}
