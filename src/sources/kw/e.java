package kw;

import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f38858b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(h hVar, int i11) {
        super(0);
        this.f38857a = i11;
        this.f38858b = hVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f38857a) {
            case 0:
                h hVar = this.f38858b;
                return Float.valueOf(hVar.a() / hVar.f38870g.l() < 1.0f ? 0.3f : 1.0f);
            default:
                return Float.valueOf(this.f38858b.f38869f.l() * 0.5f);
        }
    }
}
