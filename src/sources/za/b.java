package za;

import re.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f59051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f59052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f59053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f59054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f59055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f59056i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f59057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f59058c;

    static {
        int i11 = 0;
        f59051d = new b("VERTICAL", i11);
        f59052e = new b("HORIZONTAL", i11);
        int i12 = 1;
        f59053f = new b("FLAT", i12);
        f59054g = new b("HALF_OPENED", i12);
        int i13 = 2;
        f59055h = new b("FOLD", i13);
        f59056i = new b("HINGE", i13);
    }

    public /* synthetic */ b(String str, int i11) {
        this.f59057b = i11;
        this.f59058c = str;
    }

    public String toString() {
        switch (this.f59057b) {
            case 0:
                return (String) this.f59058c;
            case 1:
                return (String) this.f59058c;
            case 2:
                return (String) this.f59058c;
            default:
                return super.toString();
        }
    }

    public b(n nVar, ab.a aVar, g0 g0Var) {
        this.f59057b = 3;
        this.f59058c = aVar;
    }
}
