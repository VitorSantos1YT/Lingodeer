package rt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b5 implements c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f49509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f49510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w4 f49511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x4 f49512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f49513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f49514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v4 f49515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Float f49516i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f49517j;

    public b5(int i11, boolean z11, List list, w4 resourceMode, x4 x4Var, List list2, int i12, v4 queueState, Float f5) {
        int i13;
        kotlin.jvm.internal.m.f(resourceMode, "resourceMode");
        kotlin.jvm.internal.m.f(queueState, "queueState");
        this.f49508a = i11;
        this.f49509b = z11;
        this.f49510c = list;
        this.f49511d = resourceMode;
        this.f49512e = x4Var;
        this.f49513f = list2;
        this.f49514g = i12;
        this.f49515h = queueState;
        this.f49516i = f5;
        int i14 = 0;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            int i15 = 0;
            while (it.hasNext()) {
                if (((d5) it.next()).f49619g && (i15 = i15 + 1) < 0) {
                    ns.o.U();
                    throw null;
                }
            }
        }
        List units = this.f49510c;
        w4 resourceMode2 = this.f49511d;
        kotlin.jvm.internal.m.f(units, "units");
        kotlin.jvm.internal.m.f(resourceMode2, "resourceMode");
        ArrayList arrayList = new ArrayList();
        for (Object obj : units) {
            d5 d5Var = (d5) obj;
            if (d5Var.f49619g && d5Var.f49618f) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i16 = 0;
        while (i16 < size) {
            Object obj2 = arrayList.get(i16);
            i16++;
            d5 d5Var2 = (d5) obj2;
            int i17 = q4.f50284a[resourceMode2.ordinal()];
            if (i17 == 1) {
                i13 = d5Var2.f49616d;
            } else if (i17 == 2) {
                i13 = d5Var2.f49617e;
            } else {
                if (i17 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = d5Var2.f49616d + d5Var2.f49617e;
            }
            i14 += i13;
        }
        this.f49517j = i14;
    }

    public static b5 a(b5 b5Var, boolean z11, List units, w4 resourceMode, x4 settings, List queue, int i11, v4 queueState, Float f5, int i12) {
        boolean z12 = z11;
        int i13 = b5Var.f49508a;
        if ((i12 & 2) != 0) {
            z12 = b5Var.f49509b;
        }
        if ((i12 & 4) != 0) {
            units = b5Var.f49510c;
        }
        if ((i12 & 8) != 0) {
            resourceMode = b5Var.f49511d;
        }
        if ((i12 & 16) != 0) {
            settings = b5Var.f49512e;
        }
        if ((i12 & 32) != 0) {
            queue = b5Var.f49513f;
        }
        if ((i12 & 64) != 0) {
            i11 = b5Var.f49514g;
        }
        if ((i12 & 128) != 0) {
            queueState = b5Var.f49515h;
        }
        if ((i12 & 256) != 0) {
            f5 = b5Var.f49516i;
        }
        Float f11 = f5;
        kotlin.jvm.internal.m.f(units, "units");
        kotlin.jvm.internal.m.f(resourceMode, "resourceMode");
        kotlin.jvm.internal.m.f(settings, "settings");
        kotlin.jvm.internal.m.f(queue, "queue");
        kotlin.jvm.internal.m.f(queueState, "queueState");
        v4 v4Var = queueState;
        int i14 = i11;
        List list = queue;
        x4 x4Var = settings;
        w4 w4Var = resourceMode;
        return new b5(i13, z12, units, w4Var, x4Var, list, i14, v4Var, f11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5)) {
            return false;
        }
        b5 b5Var = (b5) obj;
        return this.f49508a == b5Var.f49508a && this.f49509b == b5Var.f49509b && kotlin.jvm.internal.m.a(this.f49510c, b5Var.f49510c) && this.f49511d == b5Var.f49511d && kotlin.jvm.internal.m.a(this.f49512e, b5Var.f49512e) && kotlin.jvm.internal.m.a(this.f49513f, b5Var.f49513f) && this.f49514g == b5Var.f49514g && this.f49515h == b5Var.f49515h && kotlin.jvm.internal.m.a(this.f49516i, b5Var.f49516i);
    }

    public final int hashCode() {
        int iHashCode = (this.f49515h.hashCode() + defpackage.e.b(this.f49514g, hh.p0.b((this.f49512e.hashCode() + ((this.f49511d.hashCode() + hh.p0.b(defpackage.e.e(Integer.hashCode(this.f49508a) * 31, 31, this.f49509b), 31, this.f49510c)) * 31)) * 31, 31, this.f49513f), 31)) * 31;
        Float f5 = this.f49516i;
        return iHashCode + (f5 == null ? 0 : f5.hashCode());
    }

    public final String toString() {
        return "Success(keyLanguage=" + this.f49508a + ", hasPurchased=" + this.f49509b + ", units=" + this.f49510c + ", resourceMode=" + this.f49511d + ", settings=" + this.f49512e + ", queue=" + this.f49513f + ", currentIndex=" + this.f49514g + ", queueState=" + this.f49515h + ", resourceCheckProgress=" + this.f49516i + ")";
    }
}
