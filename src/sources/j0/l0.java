package j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1.d f35337b;

    public l0(t1.d dVar) {
        this.f35336a = 4;
        this.f35337b = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fd  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f35336a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.f35337b.invoke(u0.f35422a, sVar, 6);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                l1.n nVar2 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar2 = (l1.s) nVar2;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        this.f35337b.invoke(nVar2, 0);
                    }
                } else {
                    this.f35337b.invoke(nVar2, 0);
                }
                break;
            case 2:
                l1.n nVar3 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar3 = (l1.s) nVar3;
                    if (sVar3.F()) {
                        sVar3.W();
                    } else {
                        this.f35337b.invoke(tg.i0.f52292a, nVar3, 0);
                    }
                } else {
                    this.f35337b.invoke(tg.i0.f52292a, nVar3, 0);
                }
                break;
            case 3:
                l1.n nVar4 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar4 = (l1.s) nVar4;
                    if (sVar4.F()) {
                        sVar4.W();
                    } else {
                        this.f35337b.invoke(nVar4, 0);
                    }
                } else {
                    this.f35337b.invoke(nVar4, 0);
                }
                break;
            case 4:
                l1.n nVar5 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar5 = (l1.s) nVar5;
                    if (sVar5.F()) {
                        sVar5.W();
                    } else {
                        tg.v.a(z1.o.f58481a, null, this.f35337b, nVar5, 0, 0);
                    }
                } else {
                    tg.v.a(z1.o.f58481a, null, this.f35337b, nVar5, 0, 0);
                }
                break;
            case 5:
                l1.n nVar6 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar6 = (l1.s) nVar6;
                    if (sVar6.F()) {
                        sVar6.W();
                    } else {
                        this.f35337b.invoke(nVar6, 0);
                    }
                } else {
                    this.f35337b.invoke(nVar6, 0);
                }
                break;
            default:
                l1.n nVar7 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar7 = (l1.s) nVar7;
                    if (sVar7.F()) {
                        sVar7.W();
                    } else {
                        l1.t.a(ug.d.f52966a.a(Boolean.TRUE), t1.e.d(1492427592, new l0(this.f35337b, 5), nVar7), nVar7, 56);
                    }
                } else {
                    l1.t.a(ug.d.f52966a.a(Boolean.TRUE), t1.e.d(1492427592, new l0(this.f35337b, 5), nVar7), nVar7, 56);
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ l0(t1.d dVar, int i11) {
        this.f35336a = i11;
        this.f35337b = dVar;
    }
}
