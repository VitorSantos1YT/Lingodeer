package io.grpc.okhttp.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f34506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f34507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f34508d;

    public b(boolean z11) {
        this.f34505a = z11;
    }

    public final void a(a... aVarArr) {
        if (!this.f34505a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[aVarArr.length];
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            strArr[i11] = aVarArr[i11].javaName;
        }
        this.f34506b = strArr;
    }

    public final void b(m... mVarArr) {
        if (!this.f34505a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (mVarArr.length == 0) {
            throw new IllegalArgumentException("At least one TlsVersion is required");
        }
        String[] strArr = new String[mVarArr.length];
        for (int i11 = 0; i11 < mVarArr.length; i11++) {
            strArr[i11] = mVarArr[i11].javaName;
        }
        this.f34507c = strArr;
    }

    public b(c cVar) {
        this.f34505a = cVar.f34510a;
        this.f34506b = cVar.f34511b;
        this.f34507c = cVar.f34512c;
        this.f34508d = cVar.f34513d;
    }
}
