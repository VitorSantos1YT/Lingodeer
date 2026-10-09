package h7;

import b7.f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ob.l f31876b;

    public /* synthetic */ i(ob.l lVar, int i11, long j11, long j12) {
        this.f31875a = 6;
        this.f31876b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = this.f31875a;
        ob.l lVar = this.f31876b;
        switch (i11) {
            case 0:
                f7.x xVar = (f7.x) lVar.f44823c;
                String str = f0.f3975a;
                g7.f fVar = xVar.f26935a.V;
                fVar.N(fVar.M(), 1029, new g2.a(24));
                break;
            case 1:
                f7.x xVar2 = (f7.x) lVar.f44823c;
                String str2 = f0.f3975a;
                g7.f fVar2 = xVar2.f26935a.V;
                fVar2.N(fVar2.M(), 1010, new g7.c(5));
                break;
            case 2:
                f7.x xVar3 = (f7.x) lVar.f44823c;
                String str3 = f0.f3975a;
                g7.f fVar3 = xVar3.f26935a.V;
                fVar3.N(fVar3.M(), 1032, new g7.c(20));
                break;
            case 3:
                f7.x xVar4 = (f7.x) lVar.f44823c;
                String str4 = f0.f3975a;
                g7.f fVar4 = xVar4.f26935a.V;
                fVar4.N(fVar4.M(), 1008, new g2.a(13));
                break;
            case 4:
                f7.x xVar5 = (f7.x) lVar.f44823c;
                String str5 = f0.f3975a;
                g7.f fVar5 = xVar5.f26935a.V;
                fVar5.N(fVar5.M(), 1012, new g7.c(22));
                break;
            case 5:
                f7.x xVar6 = (f7.x) lVar.f44823c;
                String str6 = f0.f3975a;
                g7.f fVar6 = xVar6.f26935a.V;
                fVar6.N(fVar6.M(), 1007, new g7.c(1));
                break;
            case 6:
                f7.x xVar7 = (f7.x) lVar.f44823c;
                String str7 = f0.f3975a;
                g7.f fVar7 = xVar7.f26935a.V;
                fVar7.N(fVar7.M(), 1011, new g7.c(3));
                break;
            case 7:
                f7.x xVar8 = (f7.x) lVar.f44823c;
                String str8 = f0.f3975a;
                g7.f fVar8 = xVar8.f26935a.V;
                fVar8.N(fVar8.M(), 1031, new g7.c(10));
                break;
            case 8:
                f7.x xVar9 = (f7.x) lVar.f44823c;
                String str9 = f0.f3975a;
                g7.f fVar9 = xVar9.f26935a.V;
                fVar9.N(fVar9.M(), 1014, new g7.c(15));
                break;
            default:
                f7.x xVar10 = (f7.x) lVar.f44823c;
                String str10 = f0.f3975a;
                g7.f fVar10 = xVar10.f26935a.V;
                fVar10.N(fVar10.M(), 1009, new g7.c(12));
                break;
        }
    }

    public /* synthetic */ i(ob.l lVar, long j11) {
        this.f31875a = 1;
        this.f31876b = lVar;
    }

    public /* synthetic */ i(ob.l lVar, Object obj, int i11) {
        this.f31875a = i11;
        this.f31876b = lVar;
    }

    public /* synthetic */ i(ob.l lVar, String str, long j11, long j12) {
        this.f31875a = 3;
        this.f31876b = lVar;
    }

    public /* synthetic */ i(ob.l lVar, y6.p pVar, f7.g gVar) {
        this.f31875a = 9;
        this.f31876b = lVar;
    }
}
