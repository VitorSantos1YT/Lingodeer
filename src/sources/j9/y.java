package j9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f36270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f36272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f36273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f36274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f36275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f36276h;

    public y(boolean z11, boolean z12, int i11, boolean z13, boolean z14, int i12, int i13) {
        this.f36269a = z11;
        this.f36270b = z12;
        this.f36271c = i11;
        this.f36272d = z13;
        this.f36273e = z14;
        this.f36274f = i12;
        this.f36275g = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f36269a == yVar.f36269a && this.f36270b == yVar.f36270b && this.f36271c == yVar.f36271c && kotlin.jvm.internal.m.a(this.f36276h, yVar.f36276h) && this.f36272d == yVar.f36272d && this.f36273e == yVar.f36273e && this.f36274f == yVar.f36274f && this.f36275g == yVar.f36275g;
    }

    public final int hashCode() {
        int i11 = (((((this.f36269a ? 1 : 0) * 31) + (this.f36270b ? 1 : 0)) * 31) + this.f36271c) * 31;
        String str = this.f36276h;
        return ((((((((((((i11 + (str != null ? str.hashCode() : 0)) * 29791) + (this.f36272d ? 1 : 0)) * 31) + (this.f36273e ? 1 : 0)) * 31) + this.f36274f) * 31) + this.f36275g) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        String str = this.f36276h;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(y.class.getSimpleName());
        sb2.append("(");
        if (this.f36269a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f36270b) {
            sb2.append("restoreState ");
        }
        if ((str != null || this.f36271c != -1) && str != null) {
            sb2.append("popUpTo(");
            sb2.append(str);
            if (this.f36272d) {
                sb2.append(" inclusive");
            }
            if (this.f36273e) {
                sb2.append(" saveState");
            }
            sb2.append(")");
        }
        int i11 = this.f36275g;
        int i12 = this.f36274f;
        if (i12 != -1 || i11 != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(i12));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(i11));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(-1));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(-1));
            sb2.append(")");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        return string;
    }
}
