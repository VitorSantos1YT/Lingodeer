package l2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f39577k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final tw.c f39578l = new tw.c(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f39580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f39581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f39582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f39583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0 f39584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f39585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f39586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f39587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f39588j;

    public e(String str, float f5, float f11, float f12, float f13, g0 g0Var, long j11, int i11, boolean z11) {
        int i12;
        synchronized (f39578l) {
            i12 = f39577k;
            f39577k = i12 + 1;
        }
        this.f39579a = str;
        this.f39580b = f5;
        this.f39581c = f11;
        this.f39582d = f12;
        this.f39583e = f13;
        this.f39584f = g0Var;
        this.f39585g = j11;
        this.f39586h = i11;
        this.f39587i = z11;
        this.f39588j = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.m.a(this.f39579a, eVar.f39579a) && v3.f.b(this.f39580b, eVar.f39580b) && v3.f.b(this.f39581c, eVar.f39581c) && this.f39582d == eVar.f39582d && this.f39583e == eVar.f39583e && this.f39584f.equals(eVar.f39584f) && g2.x.d(this.f39585g, eVar.f39585g) && this.f39586h == eVar.f39586h && this.f39587i == eVar.f39587i;
    }

    public final int hashCode() {
        int iHashCode = (this.f39584f.hashCode() + defpackage.e.a(defpackage.e.a(defpackage.e.a(defpackage.e.a(this.f39579a.hashCode() * 31, this.f39580b, 31), this.f39581c, 31), this.f39582d, 31), this.f39583e, 31)) * 31;
        int i11 = g2.x.f28623j;
        return Boolean.hashCode(this.f39587i) + defpackage.e.b(this.f39586h, defpackage.e.f(this.f39585g, iHashCode, 31), 31);
    }
}
