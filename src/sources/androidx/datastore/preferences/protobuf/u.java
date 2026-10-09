package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1567c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f1568a = f1.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1569b;

    static {
        new u(0);
    }

    public u() {
    }

    public static void b(o oVar, y1 y1Var, int i11, Object obj) {
        if (y1Var == y1.GROUP) {
            oVar.y0(i11, 3);
            ((a) obj).b(oVar);
            oVar.y0(i11, 4);
        }
        oVar.y0(i11, y1Var.b());
        switch (t.f1551b[y1Var.ordinal()]) {
            case 1:
                oVar.s0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 2:
                oVar.q0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 3:
                oVar.C0(((Long) obj).longValue());
                break;
            case 4:
                oVar.C0(((Long) obj).longValue());
                break;
            case 5:
                oVar.u0(((Integer) obj).intValue());
                break;
            case 6:
                oVar.s0(((Long) obj).longValue());
                break;
            case 7:
                oVar.q0(((Integer) obj).intValue());
                break;
            case 8:
                oVar.k0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                ((a) obj).b(oVar);
                break;
            case 10:
                a aVar = (a) obj;
                oVar.getClass();
                oVar.A0(((c0) aVar).a(null));
                aVar.b(oVar);
                break;
            case 11:
                if (!(obj instanceof i)) {
                    oVar.x0((String) obj);
                } else {
                    oVar.o0((i) obj);
                }
                break;
            case 12:
                if (!(obj instanceof i)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    oVar.A0(length);
                    oVar.l0(bArr, 0, length);
                } else {
                    oVar.o0((i) obj);
                }
                break;
            case 13:
                oVar.A0(((Integer) obj).intValue());
                break;
            case 14:
                oVar.q0(((Integer) obj).intValue());
                break;
            case 15:
                oVar.s0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                oVar.A0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                oVar.C0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 18:
                oVar.u0(((Integer) obj).intValue());
                break;
        }
    }

    public final void a() {
        if (this.f1569b) {
            return;
        }
        f1 f1Var = this.f1568a;
        int size = f1Var.f1471a.size();
        for (int i11 = 0; i11 < size; i11++) {
            Map.Entry entryC = f1Var.c(i11);
            if (entryC.getValue() instanceof c0) {
                c0 c0Var = (c0) entryC.getValue();
                c0Var.getClass();
                a1 a1Var = a1.f1445c;
                a1Var.getClass();
                a1Var.a(c0Var.getClass()).b(c0Var);
                c0Var.h();
            }
        }
        if (!f1Var.f1473c) {
            if (f1Var.f1471a.size() > 0) {
                f1Var.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = f1Var.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!f1Var.f1473c) {
            f1Var.f1472b = f1Var.f1472b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(f1Var.f1472b);
            f1Var.f1475e = f1Var.f1475e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(f1Var.f1475e);
            f1Var.f1473c = true;
        }
        this.f1569b = true;
    }

    public final Object clone() {
        u uVar = new u();
        f1 f1Var = this.f1568a;
        if (f1Var.f1471a.size() > 0) {
            Map.Entry entryC = f1Var.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = f1Var.d().iterator();
        if (!it.hasNext()) {
            return uVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f1568a.equals(((u) obj).f1568a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1568a.hashCode();
    }

    public u(int i11) {
        a();
        a();
    }
}
