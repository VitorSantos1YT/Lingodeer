package s7;

import y6.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f51444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y6.p f51446d;

    public o(int i11, p0 p0Var, int i12) {
        this.f51443a = i11;
        this.f51444b = p0Var;
        this.f51445c = i12;
        this.f51446d = p0Var.f57307d[i12];
    }

    public abstract int a();

    public abstract boolean b(o oVar);
}
