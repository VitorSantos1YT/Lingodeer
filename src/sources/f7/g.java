package f7;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y6.p f26737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y6.p f26738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26740e;

    public g(String str, y6.p pVar, y6.p pVar2, int i11, int i12) {
        b7.a.d(i11 == 0 || i12 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f26736a = str;
        pVar.getClass();
        this.f26737b = pVar;
        pVar2.getClass();
        this.f26738c = pVar2;
        this.f26739d = i11;
        this.f26740e = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f26739d == gVar.f26739d && this.f26740e == gVar.f26740e && this.f26736a.equals(gVar.f26736a) && this.f26737b.equals(gVar.f26737b) && this.f26738c.equals(gVar.f26738c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f26738c.hashCode() + ((this.f26737b.hashCode() + defpackage.e.d((((527 + this.f26739d) * 31) + this.f26740e) * 31, 31, this.f26736a)) * 31);
    }
}
