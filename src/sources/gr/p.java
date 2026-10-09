package gr;

import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j9.v f29733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f29734c;

    public /* synthetic */ p(j9.v vVar, fz.a aVar, int i11) {
        this.f29732a = i11;
        this.f29733b = vVar;
        this.f29734c = aVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f29732a) {
            case 0:
                if (!this.f29733b.c()) {
                    this.f29734c.invoke();
                }
                break;
            default:
                if (!this.f29733b.c()) {
                    this.f29734c.invoke();
                }
                break;
        }
        return b0.f48488a;
    }
}
