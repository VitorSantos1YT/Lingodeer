package tg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements fz.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f52311b = new l(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f52312c = new l(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52313a;

    public /* synthetic */ l(int i11) {
        this.f52313a = i11;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2  */
    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        int i12;
        switch (this.f52313a) {
            case 0:
                j3.y0 newTextStyle = (j3.y0) obj;
                fz.e content = (fz.e) obj2;
                l1.n nVar = (l1.n) obj3;
                int iIntValue = ((Number) obj4).intValue();
                kotlin.jvm.internal.m.f(newTextStyle, "newTextStyle");
                kotlin.jvm.internal.m.f(content, "content");
                if ((iIntValue & 6) == 0) {
                    i11 = (((l1.s) nVar).f(newTextStyle) ? 4 : 2) | iIntValue;
                } else {
                    i11 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i11 |= ((l1.s) nVar).h(content) ? 32 : 16;
                }
                if ((i11 & 147) == 146) {
                    l1.s sVar = (l1.s) nVar;
                    if (sVar.F()) {
                        sVar.W();
                    } else {
                        l1.t.a(h0.f52286a.a(newTextStyle), t1.e.d(2071797151, new k(content, 0), nVar), nVar, 56);
                    }
                } else {
                    l1.t.a(h0.f52286a.a(newTextStyle), t1.e.d(2071797151, new k(content, 0), nVar), nVar, 56);
                }
                break;
            default:
                long j11 = ((g2.x) obj).f28624a;
                fz.e content2 = (fz.e) obj2;
                l1.n nVar2 = (l1.n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                kotlin.jvm.internal.m.f(content2, "content");
                if ((iIntValue2 & 6) == 0) {
                    i12 = (((l1.s) nVar2).e(j11) ? 4 : 2) | iIntValue2;
                } else {
                    i12 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i12 |= ((l1.s) nVar2).h(content2) ? 32 : 16;
                }
                if ((i12 & 147) == 146) {
                    l1.s sVar2 = (l1.s) nVar2;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        l1.t.a(h0.f52287b.a(new g2.x(j11)), t1.e.d(-824975258, new k(content2, 1), nVar2), nVar2, 56);
                    }
                } else {
                    l1.t.a(h0.f52287b.a(new g2.x(j11)), t1.e.d(-824975258, new k(content2, 1), nVar2), nVar2, 56);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
