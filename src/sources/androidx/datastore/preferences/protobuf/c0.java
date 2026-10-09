package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, c0> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected k1 unknownFields;

    public c0() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = k1.f1503f;
    }

    public static c0 d(Class cls) {
        c0 c0Var = defaultInstanceMap.get(cls);
        if (c0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                c0Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0Var2 = (c0) ((c0) q1.d(cls)).c(b0.GET_DEFAULT_INSTANCE);
        if (c0Var2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, c0Var2);
        return c0Var2;
    }

    public static Object e(Method method, c0 c0Var, Object... objArr) {
        try {
            return method.invoke(c0Var, objArr);
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

    public static final boolean f(c0 c0Var, boolean z11) {
        byte bByteValue = ((Byte) c0Var.c(b0.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        a1 a1Var = a1.f1445c;
        a1Var.getClass();
        boolean zC = a1Var.a(c0Var.getClass()).c(c0Var);
        if (z11) {
            c0Var.c(b0.SET_MEMOIZED_IS_INITIALIZED);
        }
        return zC;
    }

    public static void j(Class cls, c0 c0Var) {
        c0Var.h();
        defaultInstanceMap.put(cls, c0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int a(d1 d1Var) {
        int iF;
        int iF2;
        if (g()) {
            if (d1Var == null) {
                a1 a1Var = a1.f1445c;
                a1Var.getClass();
                iF2 = a1Var.a(getClass()).f(this);
            } else {
                iF2 = d1Var.f(this);
            }
            if (iF2 >= 0) {
                return iF2;
            }
            throw new IllegalStateException(nv.p.j(iF2, "serialized size must be non-negative, was "));
        }
        int i11 = this.memoizedSerializedSize;
        if ((i11 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i11 & Integer.MAX_VALUE;
        }
        if (d1Var == null) {
            a1 a1Var2 = a1.f1445c;
            a1Var2.getClass();
            iF = a1Var2.a(getClass()).f(this);
        } else {
            iF = d1Var.f(this);
        }
        k(iF);
        return iF;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final void b(o oVar) {
        a1 a1Var = a1.f1445c;
        a1Var.getClass();
        d1 d1VarA = a1Var.a(getClass());
        l0 l0Var = oVar.f1525a;
        if (l0Var == null) {
            l0Var = new l0(oVar);
        }
        d1VarA.e(this, l0Var);
    }

    public abstract Object c(b0 b0Var);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a1 a1Var = a1.f1445c;
        a1Var.getClass();
        return a1Var.a(getClass()).h(this, (c0) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            a1 a1Var = a1.f1445c;
            a1Var.getClass();
            return a1Var.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            a1 a1Var2 = a1.f1445c;
            a1Var2.getClass();
            this.memoizedHashCode = a1Var2.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    public final c0 i() {
        return (c0) c(b0.NEW_MUTABLE_INSTANCE);
    }

    public final void k(int i11) {
        if (i11 < 0) {
            throw new IllegalStateException(nv.p.j(i11, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i11 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = s0.f1549a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        s0.c(this, sb2, 0);
        return sb2.toString();
    }
}
