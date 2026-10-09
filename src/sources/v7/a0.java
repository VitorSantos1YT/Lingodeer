package v7;

import b7.f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qp.r f53583b;

    public /* synthetic */ a0(qp.r rVar, int i11, long j11) {
        this.f53582a = 3;
        this.f53583b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = this.f53582a;
        qp.r rVar = this.f53583b;
        switch (i11) {
            case 0:
                f7.x xVar = (f7.x) rVar.f48146c;
                String str = f0.f3975a;
                g7.f fVar = xVar.f26935a.V;
                fVar.N(fVar.M(), 1016, new g2.a(26));
                break;
            case 1:
                f7.x xVar2 = (f7.x) rVar.f48146c;
                String str2 = f0.f3975a;
                g7.f fVar2 = xVar2.f26935a.V;
                fVar2.N(fVar2.M(), 1030, new g2.a(9));
                break;
            case 2:
                f7.x xVar3 = (f7.x) rVar.f48146c;
                String str3 = f0.f3975a;
                g7.f fVar3 = xVar3.f26935a.V;
                fVar3.N(fVar3.M(), 1019, new g2.a(15));
                break;
            case 3:
                f7.x xVar4 = (f7.x) rVar.f48146c;
                String str4 = f0.f3975a;
                g7.f fVar4 = xVar4.f26935a.V;
                fVar4.N(fVar4.J(fVar4.f28807d.f28802e), 1018, new g7.c(6));
                break;
            case 4:
                f7.x xVar5 = (f7.x) rVar.f48146c;
                String str5 = f0.f3975a;
                g7.f fVar5 = xVar5.f26935a.V;
                fVar5.N(fVar5.J(fVar5.f28807d.f28802e), 1021, new g7.c(7));
                break;
            case 5:
                f7.x xVar6 = (f7.x) rVar.f48146c;
                String str6 = f0.f3975a;
                g7.f fVar6 = xVar6.f26935a.V;
                fVar6.N(fVar6.M(), 1015, new g7.c(13));
                break;
            default:
                f7.x xVar7 = (f7.x) rVar.f48146c;
                String str7 = f0.f3975a;
                g7.f fVar7 = xVar7.f26935a.V;
                fVar7.N(fVar7.M(), 1017, new g7.c(9));
                break;
        }
    }

    public /* synthetic */ a0(qp.r rVar, long j11, int i11) {
        this.f53582a = 4;
        this.f53583b = rVar;
    }

    public /* synthetic */ a0(qp.r rVar, Object obj, int i11) {
        this.f53582a = i11;
        this.f53583b = rVar;
    }

    public /* synthetic */ a0(qp.r rVar, String str, long j11, long j12) {
        this.f53582a = 0;
        this.f53583b = rVar;
    }

    public /* synthetic */ a0(qp.r rVar, y6.p pVar, f7.g gVar) {
        this.f53582a = 6;
        this.f53583b = rVar;
    }
}
