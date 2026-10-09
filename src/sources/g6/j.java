package g6;

import androidx.glance.appwidget.protobuf.a0;
import androidx.glance.appwidget.protobuf.b0;
import androidx.glance.appwidget.protobuf.r0;
import androidx.glance.appwidget.protobuf.u;
import androidx.glance.appwidget.protobuf.u0;
import androidx.glance.appwidget.protobuf.v;
import androidx.glance.appwidget.protobuf.v0;
import androidx.glance.appwidget.protobuf.w;
import androidx.glance.appwidget.protobuf.x;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends x {
    public static final int CHILDREN_FIELD_NUMBER = 7;
    private static final j DEFAULT_INSTANCE;
    public static final int HASACTION_FIELD_NUMBER = 9;
    public static final int HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER = 11;
    public static final int HAS_IMAGE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
    public static final int IDENTITY_FIELD_NUMBER = 8;
    public static final int IMAGE_SCALE_FIELD_NUMBER = 6;
    private static volatile r0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private a0 children_ = u0.f2001d;
    private boolean hasAction_;
    private boolean hasImageColorFilter_;
    private boolean hasImageDescription_;
    private int height_;
    private int horizontalAlignment_;
    private int identity_;
    private int imageScale_;
    private int type_;
    private int verticalAlignment_;
    private int width_;

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        x.i(j.class, jVar);
    }

    public static void k(j jVar, k kVar) {
        jVar.getClass();
        jVar.type_ = kVar.d();
    }

    public static void l(j jVar, c cVar) {
        jVar.getClass();
        jVar.width_ = cVar.d();
    }

    public static void m(j jVar, c cVar) {
        jVar.getClass();
        jVar.height_ = cVar.d();
    }

    public static void n(j jVar, d dVar) {
        jVar.getClass();
        jVar.horizontalAlignment_ = dVar.d();
    }

    public static void o(j jVar, m mVar) {
        jVar.getClass();
        jVar.verticalAlignment_ = mVar.d();
    }

    public static void p(j jVar, b bVar) {
        jVar.getClass();
        jVar.imageScale_ = bVar.d();
    }

    public static void q(j jVar, l lVar) {
        jVar.getClass();
        jVar.identity_ = lVar.d();
    }

    public static void r(j jVar, boolean z11) {
        jVar.hasAction_ = z11;
    }

    public static void s(j jVar, ArrayList arrayList) {
        a0 a0Var = jVar.children_;
        if (!((androidx.glance.appwidget.protobuf.b) a0Var).f1911a) {
            u0 u0Var = (u0) a0Var;
            int i11 = u0Var.f2003c;
            jVar.children_ = u0Var.e(i11 == 0 ? 10 : i11 * 2);
        }
        RandomAccess randomAccess = jVar.children_;
        Charset charset = b0.f1912a;
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(arrayList.size() + ((u0) randomAccess).f2003c);
        }
        u0 u0Var2 = (u0) randomAccess;
        int i12 = u0Var2.f2003c;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            if (obj == null) {
                String str = "Element at index " + (u0Var2.f2003c - i12) + " is null.";
                for (int i14 = u0Var2.f2003c - 1; i14 >= i12; i14--) {
                    u0Var2.remove(i14);
                }
                throw new NullPointerException(str);
            }
            u0Var2.add(obj);
        }
    }

    public static void t(j jVar, boolean z11) {
        jVar.hasImageDescription_ = z11;
    }

    public static void u(j jVar) {
        jVar.hasImageColorFilter_ = false;
    }

    public static j v() {
        return DEFAULT_INSTANCE;
    }

    public static i w() {
        return (i) ((u) DEFAULT_INSTANCE.b(w.NEW_BUILDER));
    }

    @Override // androidx.glance.appwidget.protobuf.x
    public final Object b(w wVar) {
        r0 vVar;
        switch (a.f28781a[wVar.ordinal()]) {
            case 1:
                return new j();
            case 2:
                return new i(DEFAULT_INSTANCE);
            case 3:
                return new v0(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\u001b\b\f\t\u0007\n\u0007\u000b\u0007", new Object[]{"type_", "width_", "height_", "horizontalAlignment_", "verticalAlignment_", "imageScale_", "children_", j.class, "identity_", "hasAction_", "hasImageDescription_", "hasImageColorFilter_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                r0 r0Var = PARSER;
                if (r0Var != null) {
                    return r0Var;
                }
                synchronized (j.class) {
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
}
