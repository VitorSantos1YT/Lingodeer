package n3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f43144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f43145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f43148e;

    public d0(i iVar, s sVar, int i11, int i12, Object obj) {
        this.f43144a = iVar;
        this.f43145b = sVar;
        this.f43146c = i11;
        this.f43147d = i12;
        this.f43148e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return kotlin.jvm.internal.m.a(this.f43144a, d0Var.f43144a) && kotlin.jvm.internal.m.a(this.f43145b, d0Var.f43145b) && this.f43146c == d0Var.f43146c && this.f43147d == d0Var.f43147d && kotlin.jvm.internal.m.a(this.f43148e, d0Var.f43148e);
    }

    public final int hashCode() {
        i iVar = this.f43144a;
        int iB = defpackage.e.b(this.f43147d, defpackage.e.b(this.f43146c, (((iVar == null ? 0 : iVar.hashCode()) * 31) + this.f43145b.f43179a) * 31, 31), 31);
        Object obj = this.f43148e;
        return iB + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TypefaceRequest(fontFamily=");
        sb2.append(this.f43144a);
        sb2.append(", fontWeight=");
        sb2.append(this.f43145b);
        sb2.append(", fontStyle=");
        String str2 = "Invalid";
        int i11 = this.f43146c;
        if (i11 == 0) {
            str = "Normal";
        } else {
            str = i11 == 1 ? "Italic" : "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(", fontSynthesis=");
        int i12 = this.f43147d;
        if (i12 == 0) {
            str2 = "None";
        } else if (i12 == 1) {
            str2 = "Weight";
        } else if (i12 == 2) {
            str2 = "Style";
        } else if (i12 == 65535) {
            str2 = "All";
        }
        sb2.append((Object) str2);
        sb2.append(", resourceLoaderCacheKey=");
        sb2.append(this.f43148e);
        sb2.append(')');
        return sb2.toString();
    }
}
