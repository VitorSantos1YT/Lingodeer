package mu;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f42146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f42147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f42148e;

    public k(int i11, int i12, boolean z11, int i13, ArrayList arrayList) {
        this.f42144a = i11;
        this.f42145b = i12;
        this.f42146c = z11;
        this.f42147d = i13;
        this.f42148e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f42144a == kVar.f42144a && this.f42145b == kVar.f42145b && this.f42146c == kVar.f42146c && this.f42147d == kVar.f42147d && this.f42148e.equals(kVar.f42148e);
    }

    public final int hashCode() {
        return this.f42148e.hashCode() + defpackage.e.b(0, defpackage.e.b(this.f42147d, defpackage.e.e(defpackage.e.b(this.f42145b, Integer.hashCode(this.f42144a) * 31, 31), 31, this.f42146c), 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = w4.c.k("Success(gemCount=", this.f42144a, ", appendGemCount=", this.f42145b, ", needLogin=");
        sbK.append(this.f42146c);
        sbK.append(", streakFreezeCount=");
        sbK.append(this.f42147d);
        sbK.append(", xpBoostCount=0, gemPrices=");
        sbK.append(this.f42148e);
        sbK.append(")");
        return sbK.toString();
    }
}
