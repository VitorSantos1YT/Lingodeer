package g3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.e f28637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f28638c;

    public a0(String str, fz.e eVar) {
        this.f28636a = str;
        this.f28637b = eVar;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f28636a;
    }

    public /* synthetic */ a0(String str) {
        this(str, m.W);
    }

    public a0(String str, int i11) {
        this(str);
        this.f28638c = true;
    }

    public a0(String str, boolean z11, fz.e eVar) {
        this(str, eVar);
        this.f28638c = z11;
    }
}
