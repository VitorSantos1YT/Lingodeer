package q5;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.b1;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.c1;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.x0;
import androidx.datastore.preferences.protobuf.y0;
import androidx.datastore.preferences.protobuf.z;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends c0 {
    private static final h DEFAULT_INSTANCE;
    private static volatile x0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private d0 strings_ = b1.f1449d;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        c0.j(h.class, hVar);
    }

    public static void l(h hVar, Iterable iterable) {
        d0 d0Var = hVar.strings_;
        if (!((androidx.datastore.preferences.protobuf.b) d0Var).f1448a) {
            b1 b1Var = (b1) d0Var;
            int i11 = b1Var.f1451c;
            hVar.strings_ = b1Var.e(i11 == 0 ? 10 : i11 * 2);
        }
        RandomAccess randomAccess = hVar.strings_;
        Charset charset = e0.f1463a;
        if (iterable instanceof g0) {
            List listQ = ((g0) iterable).q();
            if (randomAccess != null) {
                throw new ClassCastException();
            }
            ((b1) randomAccess).getClass();
            Iterator it = listQ.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof androidx.datastore.preferences.protobuf.i) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                androidx.datastore.preferences.protobuf.i.e(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof y0) {
            ((androidx.datastore.preferences.protobuf.b) randomAccess).addAll((Collection) iterable);
            return;
        }
        if ((randomAccess instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) randomAccess).ensureCapacity(((Collection) iterable).size() + ((b1) randomAccess).f1451c);
        }
        b1 b1Var2 = (b1) randomAccess;
        int i12 = b1Var2.f1451c;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (b1Var2.f1451c - i12) + " is null.";
                for (int i13 = b1Var2.f1451c - 1; i13 >= i12; i13--) {
                    b1Var2.remove(i13);
                }
                throw new NullPointerException(str);
            }
            b1Var2.add(obj);
        }
    }

    public static h m() {
        return DEFAULT_INSTANCE;
    }

    public static g o() {
        return (g) ((z) DEFAULT_INSTANCE.c(b0.NEW_BUILDER));
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final Object c(b0 b0Var) {
        x0 a0Var;
        switch (c.f47468a[b0Var.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new g(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                x0 x0Var = PARSER;
                if (x0Var != null) {
                    return x0Var;
                }
                synchronized (h.class) {
                    try {
                        a0Var = PARSER;
                        if (a0Var == null) {
                            a0Var = new a0();
                            PARSER = a0Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return a0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final d0 n() {
        return this.strings_;
    }
}
