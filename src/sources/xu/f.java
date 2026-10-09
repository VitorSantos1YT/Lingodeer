package xu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f56391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f56392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f56393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f56394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f56395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f56396f;

    public f(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f56391a = z11;
        this.f56392b = z12;
        this.f56393c = z13;
        this.f56394d = z14;
        this.f56395e = z15;
        this.f56396f = z16;
    }

    public static f a(f fVar, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i11) {
        if ((i11 & 1) != 0) {
            z11 = fVar.f56391a;
        }
        boolean z17 = z11;
        if ((i11 & 2) != 0) {
            z12 = fVar.f56392b;
        }
        boolean z18 = z12;
        if ((i11 & 4) != 0) {
            z13 = fVar.f56393c;
        }
        boolean z19 = z13;
        if ((i11 & 8) != 0) {
            z14 = fVar.f56394d;
        }
        boolean z20 = z14;
        if ((i11 & 16) != 0) {
            z15 = fVar.f56395e;
        }
        boolean z21 = z15;
        if ((i11 & 32) != 0) {
            z16 = fVar.f56396f;
        }
        fVar.getClass();
        return new f(z17, z18, z19, z20, z21, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f56391a == fVar.f56391a && this.f56392b == fVar.f56392b && this.f56393c == fVar.f56393c && this.f56394d == fVar.f56394d && this.f56395e == fVar.f56395e && this.f56396f == fVar.f56396f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f56396f) + defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e(Boolean.hashCode(this.f56391a) * 31, 31, this.f56392b), 31, this.f56393c), 31, this.f56394d), 31, this.f56395e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DialogState(editNickName=");
        sb2.append(this.f56391a);
        sb2.append(", editAvatar=");
        sb2.append(this.f56392b);
        sb2.append(", deleteAccount=");
        ep.a.B(", resetProgress=", ", changePassword=", sb2, this.f56393c, this.f56394d);
        sb2.append(this.f56395e);
        sb2.append(", logout=");
        sb2.append(this.f56396f);
        sb2.append(")");
        return sb2.toString();
    }
}
