package o20;

import okhttp3.Call;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class t extends w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f44595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Call.Factory f44596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f44597c;

    public t(s0 s0Var, Call.Factory factory, m mVar) {
        this.f44595a = s0Var;
        this.f44596b = factory;
        this.f44597c = mVar;
    }

    public abstract Object b(b0 b0Var, Object[] objArr);
}
