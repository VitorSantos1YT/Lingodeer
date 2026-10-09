package g6;

import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.glance.appwidget.protobuf.UninitializedMessageException;
import androidx.glance.appwidget.protobuf.a0;
import androidx.glance.appwidget.protobuf.r0;
import androidx.glance.appwidget.protobuf.t0;
import androidx.glance.appwidget.protobuf.u0;
import androidx.glance.appwidget.protobuf.v;
import androidx.glance.appwidget.protobuf.v0;
import androidx.glance.appwidget.protobuf.w;
import androidx.glance.appwidget.protobuf.w0;
import androidx.glance.appwidget.protobuf.x;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends x {
    private static final f DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int NEXT_INDEX_FIELD_NUMBER = 2;
    private static volatile r0 PARSER;
    private a0 layout_ = u0.f2001d;
    private int nextIndex_;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        x.i(f.class, fVar);
    }

    public static void k(f fVar, h hVar) {
        fVar.getClass();
        a0 a0Var = fVar.layout_;
        if (!((androidx.glance.appwidget.protobuf.b) a0Var).f1911a) {
            u0 u0Var = (u0) a0Var;
            int i11 = u0Var.f2003c;
            fVar.layout_ = u0Var.e(i11 == 0 ? 10 : i11 * 2);
        }
        ((u0) fVar.layout_).add(hVar);
    }

    public static void l(f fVar) {
        fVar.getClass();
        fVar.layout_ = u0.f2001d;
    }

    public static void m(f fVar, int i11) {
        fVar.nextIndex_ = i11;
    }

    public static f n() {
        return DEFAULT_INSTANCE;
    }

    public static f q(FileInputStream fileInputStream) throws InvalidProtocolBufferException {
        f fVar = DEFAULT_INSTANCE;
        androidx.glance.appwidget.protobuf.j jVar = new androidx.glance.appwidget.protobuf.j(fileInputStream);
        androidx.glance.appwidget.protobuf.n nVarA = androidx.glance.appwidget.protobuf.n.a();
        x xVarH = fVar.h();
        try {
            t0 t0Var = t0.f1996c;
            t0Var.getClass();
            w0 w0VarA = t0Var.a(xVarH.getClass());
            androidx.glance.appwidget.protobuf.k kVar = (androidx.glance.appwidget.protobuf.k) jVar.f1510b;
            if (kVar == null) {
                kVar = new androidx.glance.appwidget.protobuf.k(jVar);
            }
            w0VarA.f(xVarH, kVar, nVarA);
            w0VarA.b(xVarH);
            if (x.e(xVarH, true)) {
                return (f) xVarH;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        } catch (InvalidProtocolBufferException e8) {
            if (e8.f1910a) {
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

    @Override // androidx.glance.appwidget.protobuf.x
    public final Object b(w wVar) {
        r0 vVar;
        switch (a.f28781a[wVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new e(DEFAULT_INSTANCE);
            case 3:
                return new v0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"layout_", h.class, "nextIndex_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                r0 r0Var = PARSER;
                if (r0Var != null) {
                    return r0Var;
                }
                synchronized (f.class) {
                    try {
                        vVar = PARSER;
                        if (vVar == null) {
                            vVar = new v();
                            PARSER = vVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return vVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final a0 o() {
        return this.layout_;
    }

    public final int p() {
        return this.nextIndex_;
    }
}
