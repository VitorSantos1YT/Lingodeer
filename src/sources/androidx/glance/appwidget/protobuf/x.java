package androidx.glance.appwidget.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, x> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected z0 unknownFields;

    public x() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = z0.f2011f;
    }

    public static x c(Class cls) {
        x xVar = defaultInstanceMap.get(cls);
        if (xVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                xVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = (x) ((x) f1.d(cls)).b(w.GET_DEFAULT_INSTANCE);
        if (xVar2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, xVar2);
        return xVar2;
    }

    public static Object d(Method method, x xVar, Object... objArr) {
        try {
            return method.invoke(xVar, objArr);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e8);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean e(x xVar, boolean z11) {
        byte bByteValue = ((Byte) xVar.b(w.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        t0 t0Var = t0.f1996c;
        t0Var.getClass();
        boolean zC = t0Var.a(xVar.getClass()).c(xVar);
        if (z11) {
            xVar.b(w.SET_MEMOIZED_IS_INITIALIZED);
        }
        return zC;
    }

    public static void i(Class cls, x xVar) {
        xVar.g();
        defaultInstanceMap.put(cls, xVar);
    }

    @Override // androidx.glance.appwidget.protobuf.a
    public final int a(w0 w0Var) {
        int iE;
        int iE2;
        if (f()) {
            if (w0Var == null) {
                t0 t0Var = t0.f1996c;
                t0Var.getClass();
                iE2 = t0Var.a(getClass()).e(this);
            } else {
                iE2 = w0Var.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            throw new IllegalStateException(nv.p.j(iE2, "serialized size must be non-negative, was "));
        }
        int i11 = this.memoizedSerializedSize;
        if ((i11 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i11 & Integer.MAX_VALUE;
        }
        if (w0Var == null) {
            t0 t0Var2 = t0.f1996c;
            t0Var2.getClass();
            iE = t0Var2.a(getClass()).e(this);
        } else {
            iE = w0Var.e(this);
        }
        j(iE);
        return iE;
    }

    public abstract Object b(w wVar);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t0 t0Var = t0.f1996c;
        t0Var.getClass();
        return t0Var.a(getClass()).i(this, (x) obj);
    }

    public final boolean f() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void g() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final x h() {
        return (x) b(w.NEW_MUTABLE_INSTANCE);
    }

    public final int hashCode() {
        if (f()) {
            t0 t0Var = t0.f1996c;
            t0Var.getClass();
            return t0Var.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            t0 t0Var2 = t0.f1996c;
            t0Var2.getClass();
            this.memoizedHashCode = t0Var2.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    public final void j(int i11) {
        if (i11 < 0) {
            throw new IllegalStateException(nv.p.j(i11, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i11 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = m0.f1966a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        m0.c(this, sb2, 0);
        return sb2.toString();
    }
}
