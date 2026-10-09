package n3;

import com.google.android.gms.internal.stats.RC.ualZoVVCQs;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f43127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f43129d;

    public a0(int i11, s sVar, int i12, r rVar) {
        this.f43126a = i11;
        this.f43127b = sVar;
        this.f43128c = i12;
        this.f43129d = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f43126a == a0Var.f43126a && kotlin.jvm.internal.m.a(this.f43127b, a0Var.f43127b) && this.f43128c == a0Var.f43128c && this.f43129d.equals(a0Var.f43129d);
    }

    public final int hashCode() {
        return this.f43129d.f43172a.hashCode() + defpackage.e.b(0, defpackage.e.b(this.f43128c, ((this.f43126a * 31) + this.f43127b.f43179a) * 31, 31), 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ResourceFont(resId=");
        sb2.append(this.f43126a);
        sb2.append(", weight=");
        sb2.append(this.f43127b);
        sb2.append(", style=");
        int i11 = this.f43128c;
        if (i11 == 0) {
            str = "Normal";
        } else {
            str = i11 == 1 ? ualZoVVCQs.djJE : "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(", loadingStrategy=Blocking)");
        return sb2.toString();
    }
}
