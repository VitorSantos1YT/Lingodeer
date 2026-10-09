package xu;

import vf.eq.EHjhWcesDUIsIw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e1 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f56389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f56390c;

    public /* synthetic */ e1(int i11, fz.a aVar, l1.b1 b1Var) {
        this.f56388a = i11;
        this.f56389b = aVar;
        this.f56390c = b1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f56388a) {
            case 0:
                this.f56389b.invoke();
                this.f56390c.setValue(EHjhWcesDUIsIw.xRVLPKOaqikZ);
                break;
            case 1:
                this.f56389b.invoke();
                this.f56390c.setValue(Boolean.FALSE);
                break;
            case 2:
                this.f56389b.invoke();
                this.f56390c.setValue(Boolean.FALSE);
                break;
            case 3:
                this.f56390c.setValue(Boolean.TRUE);
                this.f56389b.invoke();
                break;
            default:
                this.f56389b.invoke();
                this.f56390c.setValue(Boolean.FALSE);
                break;
        }
        return qy.b0.f48488a;
    }
}
