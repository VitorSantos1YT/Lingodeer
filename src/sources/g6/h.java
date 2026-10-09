package g6;

import androidx.glance.appwidget.protobuf.r0;
import androidx.glance.appwidget.protobuf.u;
import androidx.glance.appwidget.protobuf.v;
import androidx.glance.appwidget.protobuf.v0;
import androidx.glance.appwidget.protobuf.w;
import androidx.glance.appwidget.protobuf.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends x {
    private static final h DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LAYOUT_INDEX_FIELD_NUMBER = 2;
    private static volatile r0 PARSER;
    private int bitField0_;
    private int layoutIndex_;
    private j layout_;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        x.i(h.class, hVar);
    }

    public static void k(h hVar, j jVar) {
        hVar.getClass();
        jVar.getClass();
        hVar.layout_ = jVar;
        hVar.bitField0_ |= 1;
    }

    public static void l(h hVar, int i11) {
        hVar.layoutIndex_ = i11;
    }

    public static g o() {
        return (g) ((u) DEFAULT_INSTANCE.b(w.NEW_BUILDER));
    }

    @Override // androidx.glance.appwidget.protobuf.x
    public final Object b(w wVar) {
        r0 vVar;
        switch (a.f28781a[wVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new g(DEFAULT_INSTANCE);
            case 3:
                return new v0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "layout_", "layoutIndex_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                r0 r0Var = PARSER;
                if (r0Var != null) {
                    return r0Var;
                }
                synchronized (h.class) {
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

    public final j m() {
        j jVar = this.layout_;
        return jVar == null ? j.v() : jVar;
    }

    public final int n() {
        return this.layoutIndex_;
    }
}
