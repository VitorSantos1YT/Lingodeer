package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r4 f50624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f50627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y4 f50628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f50629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s4 f50630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f50631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f50632i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f50633j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f50634k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f50635l;

    public x4(r4 playbackMode, int i11, int i12, float f5, y4 sleepTimer, boolean z11, s4 playbackOrder, boolean z12, float f11, int i13, float f12, float f13) {
        kotlin.jvm.internal.m.f(playbackMode, "playbackMode");
        kotlin.jvm.internal.m.f(sleepTimer, "sleepTimer");
        kotlin.jvm.internal.m.f(playbackOrder, "playbackOrder");
        this.f50624a = playbackMode;
        this.f50625b = i11;
        this.f50626c = i12;
        this.f50627d = f5;
        this.f50628e = sleepTimer;
        this.f50629f = z11;
        this.f50630g = playbackOrder;
        this.f50631h = z12;
        this.f50632i = f11;
        this.f50633j = i13;
        this.f50634k = f12;
        this.f50635l = f13;
    }

    public static x4 a(x4 x4Var, r4 r4Var, int i11, int i12, float f5, y4 y4Var, boolean z11, s4 s4Var, boolean z12, float f11, int i13, float f12, float f13, int i14) {
        if ((i14 & 1) != 0) {
            r4Var = x4Var.f50624a;
        }
        r4 playbackMode = r4Var;
        if ((i14 & 2) != 0) {
            i11 = x4Var.f50625b;
        }
        int i15 = i11;
        int i16 = (i14 & 4) != 0 ? x4Var.f50626c : i12;
        float f14 = (i14 & 8) != 0 ? x4Var.f50627d : f5;
        y4 sleepTimer = (i14 & 16) != 0 ? x4Var.f50628e : y4Var;
        boolean z13 = (i14 & 32) != 0 ? x4Var.f50629f : z11;
        s4 playbackOrder = (i14 & 64) != 0 ? x4Var.f50630g : s4Var;
        boolean z14 = (i14 & 128) != 0 ? x4Var.f50631h : z12;
        float f15 = (i14 & 256) != 0 ? x4Var.f50632i : f11;
        int i17 = (i14 & 512) != 0 ? x4Var.f50633j : i13;
        float f16 = (i14 & 1024) != 0 ? x4Var.f50634k : f12;
        float f17 = (i14 & 2048) != 0 ? x4Var.f50635l : f13;
        x4Var.getClass();
        kotlin.jvm.internal.m.f(playbackMode, "playbackMode");
        kotlin.jvm.internal.m.f(sleepTimer, "sleepTimer");
        kotlin.jvm.internal.m.f(playbackOrder, "playbackOrder");
        return new x4(playbackMode, i15, i16, f14, sleepTimer, z13, playbackOrder, z14, f15, i17, f16, f17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4)) {
            return false;
        }
        x4 x4Var = (x4) obj;
        return this.f50624a == x4Var.f50624a && this.f50625b == x4Var.f50625b && this.f50626c == x4Var.f50626c && Float.compare(this.f50627d, x4Var.f50627d) == 0 && this.f50628e == x4Var.f50628e && this.f50629f == x4Var.f50629f && this.f50630g == x4Var.f50630g && this.f50631h == x4Var.f50631h && Float.compare(this.f50632i, x4Var.f50632i) == 0 && this.f50633j == x4Var.f50633j && Float.compare(this.f50634k, x4Var.f50634k) == 0 && Float.compare(this.f50635l, x4Var.f50635l) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f50635l) + defpackage.e.a(defpackage.e.b(this.f50633j, defpackage.e.a(defpackage.e.e((this.f50630g.hashCode() + defpackage.e.e((this.f50628e.hashCode() + defpackage.e.a(defpackage.e.b(this.f50626c, defpackage.e.b(this.f50625b, this.f50624a.hashCode() * 31, 31), 31), this.f50627d, 31)) * 31, 31, this.f50629f)) * 31, 31, this.f50631h), this.f50632i, 31), 31), this.f50634k, 31);
    }

    public final String toString() {
        return "CourseListenAlongSettings(playbackMode=" + this.f50624a + ", scriptStyle=" + this.f50625b + ", scriptStyleInAnswer=" + this.f50626c + ", pinyinAlpha=" + this.f50627d + ", sleepTimer=" + this.f50628e + ", showNativeTranslation=" + this.f50629f + ", playbackOrder=" + this.f50630g + ", loop=" + this.f50631h + ", audioSpeed=" + this.f50632i + ", playsPerItem=" + this.f50633j + ", pauseBetweenRepetitionsSeconds=" + this.f50634k + ", pauseBetweenItemsSeconds=" + this.f50635l + ")";
    }
}
