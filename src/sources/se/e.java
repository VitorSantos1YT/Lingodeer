package se;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 20160803001L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f51589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f51590d;

    public e(boolean z11, boolean z12, String str, String str2) {
        this.f51587a = str;
        this.f51588b = str2;
        this.f51589c = z11;
        this.f51590d = z12;
    }

    private final Object readResolve() {
        return new f(this.f51589c, this.f51590d, this.f51587a, this.f51588b);
    }
}
