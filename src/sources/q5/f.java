package q5;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.a1;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.c1;
import androidx.datastore.preferences.protobuf.d1;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.o0;
import androidx.datastore.preferences.protobuf.q;
import androidx.datastore.preferences.protobuf.x0;
import androidx.datastore.preferences.protobuf.z;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends c0 {
    private static final f DEFAULT_INSTANCE;
    private static volatile x0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private o0 preferences_ = o0.f1530b;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        c0.j(f.class, fVar);
    }

    public static o0 l(f fVar) {
        o0 o0Var = fVar.preferences_;
        if (!o0Var.f1531a) {
            fVar.preferences_ = o0Var.c();
        }
        return fVar.preferences_;
    }

    public static d n() {
        return (d) ((z) DEFAULT_INSTANCE.c(b0.NEW_BUILDER));
    }

    public static f o(FileInputStream fileInputStream) throws InvalidProtocolBufferException {
        f fVar = DEFAULT_INSTANCE;
        androidx.datastore.preferences.protobuf.k kVar = new androidx.datastore.preferences.protobuf.k(fileInputStream);
        q qVarA = q.a();
        c0 c0VarI = fVar.i();
        try {
            a1 a1Var = a1.f1445c;
            a1Var.getClass();
            d1 d1VarA = a1Var.a(c0VarI.getClass());
            n nVar = (n) kVar.f1510b;
            if (nVar == null) {
                nVar = new n(kVar);
            }
            d1VarA.i(c0VarI, nVar, qVarA);
            d1VarA.b(c0VarI);
            if (c0.f(c0VarI, true)) {
                return (f) c0VarI;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        } catch (InvalidProtocolBufferException e8) {
            if (e8.f1444a) {
                throw new InvalidProtocolBufferException(e8.getMessage(), e8);
            }
            throw e8;
        } catch (UninitializedMessageException e10) {
            throw new InvalidProtocolBufferException(e10.getMessage());
        } catch (IOException e11) {
            if (e11.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e11.getCause());
            }
            throw new InvalidProtocolBufferException(e11.getMessage(), e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw e12;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final Object c(b0 b0Var) {
        x0 a0Var;
        switch (c.f47468a[b0Var.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new d(DEFAULT_INSTANCE);
            case 3:
                return new c1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", e.f47469a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                x0 x0Var = PARSER;
                if (x0Var != null) {
                    return x0Var;
                }
                synchronized (f.class) {
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

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
