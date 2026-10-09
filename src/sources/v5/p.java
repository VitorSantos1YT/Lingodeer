package v5;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f53541a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f53542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f53543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s f53544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f53546f;

    public p(s sVar) {
        this.f53542b = sVar;
        this.f53543c = sVar;
    }

    public final void a() {
        this.f53541a = 1;
        this.f53543c = this.f53542b;
        this.f53546f = 0;
    }

    public final boolean b() {
        w5.a aVarB = this.f53543c.f53556b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarB.f51943d).get(iA + aVarB.f51940a) == 0) || this.f53545e == 65039;
    }
}
