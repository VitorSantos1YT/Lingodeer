package kr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f38537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f38538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f38539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f38540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f38541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f38542j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f38543k;

    public n(String str, String name, String avatar, String str2, long j11, int i11, int i12, boolean z11, boolean z12, boolean z13, float f5) {
        kotlin.jvm.internal.m.f(name, "name");
        kotlin.jvm.internal.m.f(avatar, "avatar");
        this.f38533a = str;
        this.f38534b = name;
        this.f38535c = avatar;
        this.f38536d = str2;
        this.f38537e = j11;
        this.f38538f = i11;
        this.f38539g = i12;
        this.f38540h = z11;
        this.f38541i = z12;
        this.f38542j = z13;
        this.f38543k = f5;
    }

    public static n a(n nVar, int i11, boolean z11, boolean z12, boolean z13, float f5, int i12) {
        String str = nVar.f38533a;
        String name = nVar.f38534b;
        String avatar = nVar.f38535c;
        String str2 = nVar.f38536d;
        long j11 = nVar.f38537e;
        int i13 = nVar.f38538f;
        if ((i12 & 64) != 0) {
            i11 = nVar.f38539g;
        }
        int i14 = i11;
        if ((i12 & 128) != 0) {
            z11 = nVar.f38540h;
        }
        boolean z14 = z11;
        boolean z15 = (i12 & 256) != 0 ? nVar.f38541i : z12;
        boolean z16 = (i12 & 512) != 0 ? nVar.f38542j : z13;
        float f11 = (i12 & 1024) != 0 ? nVar.f38543k : f5;
        kotlin.jvm.internal.m.f(name, "name");
        kotlin.jvm.internal.m.f(avatar, "avatar");
        return new n(str, name, avatar, str2, j11, i13, i14, z14, z15, z16, f11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return kotlin.jvm.internal.m.a(this.f38533a, nVar.f38533a) && kotlin.jvm.internal.m.a(this.f38534b, nVar.f38534b) && kotlin.jvm.internal.m.a(this.f38535c, nVar.f38535c) && kotlin.jvm.internal.m.a(this.f38536d, nVar.f38536d) && this.f38537e == nVar.f38537e && this.f38538f == nVar.f38538f && this.f38539g == nVar.f38539g && this.f38540h == nVar.f38540h && this.f38541i == nVar.f38541i && this.f38542j == nVar.f38542j && Float.compare(this.f38543k, nVar.f38543k) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f38543k) + defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.b(this.f38539g, defpackage.e.b(this.f38538f, defpackage.e.f(this.f38537e, defpackage.e.d(defpackage.e.d(defpackage.e.d(this.f38533a.hashCode() * 31, 31, this.f38534b), 31, this.f38535c), 31, this.f38536d), 31), 31), 31), 31, this.f38540h), 31, this.f38541i), 31, this.f38542j);
    }

    public final String toString() {
        StringBuilder sbS = defpackage.e.s("StoryLeaderBoardUser(uid=", this.f38533a, ", name=", this.f38534b, ", avatar=");
        com.google.android.material.datepicker.d.w(sbS, this.f38535c, ", audioUrl=", this.f38536d, ", uploadTime=");
        sbS.append(this.f38537e);
        sbS.append(", unitSortIndex=");
        sbS.append(this.f38538f);
        sbS.append(", likes=");
        sbS.append(this.f38539g);
        sbS.append(", isLiked=");
        sbS.append(this.f38540h);
        b7.e0.z(", isSelected=", ", isPlaying=", sbS, this.f38541i, this.f38542j);
        sbS.append(", downloadProgress=");
        sbS.append(this.f38543k);
        sbS.append(")");
        return sbS.toString();
    }
}
