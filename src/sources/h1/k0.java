package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1.p f30515b;

    public /* synthetic */ k0(x1.p pVar, int i11) {
        this.f30514a = i11;
        this.f30515b = pVar;
    }

    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        switch (this.f30514a) {
            case 0:
                h0.h hVar = (h0.h) obj;
                boolean z11 = hVar instanceof h0.f;
                x1.p pVar = this.f30515b;
                if (z11) {
                    pVar.add(hVar);
                } else if (hVar instanceof h0.g) {
                    pVar.remove(((h0.g) hVar).f29905a);
                } else if (hVar instanceof h0.d) {
                    pVar.add(hVar);
                } else if (hVar instanceof h0.e) {
                    pVar.remove(((h0.e) hVar).f29904a);
                } else if (hVar instanceof h0.k) {
                    pVar.add(hVar);
                } else if (hVar instanceof h0.l) {
                    pVar.remove(((h0.l) hVar).f29909a);
                } else if (hVar instanceof h0.j) {
                    pVar.remove(((h0.j) hVar).f29907a);
                }
                break;
            case 1:
                h0.h hVar2 = (h0.h) obj;
                boolean z12 = hVar2 instanceof h0.f;
                x1.p pVar2 = this.f30515b;
                if (z12) {
                    pVar2.add(hVar2);
                } else if (hVar2 instanceof h0.g) {
                    pVar2.remove(((h0.g) hVar2).f29905a);
                } else if (hVar2 instanceof h0.d) {
                    pVar2.add(hVar2);
                } else if (hVar2 instanceof h0.e) {
                    pVar2.remove(((h0.e) hVar2).f29904a);
                } else if (hVar2 instanceof h0.k) {
                    pVar2.add(hVar2);
                } else if (hVar2 instanceof h0.l) {
                    pVar2.remove(((h0.l) hVar2).f29909a);
                } else if (hVar2 instanceof h0.j) {
                    pVar2.remove(((h0.j) hVar2).f29907a);
                } else if (hVar2 instanceof h0.b) {
                    pVar2.add(hVar2);
                } else if (hVar2 instanceof h0.c) {
                    pVar2.remove(((h0.c) hVar2).f29903a);
                } else if (hVar2 instanceof h0.a) {
                    pVar2.remove(((h0.a) hVar2).f29902a);
                }
                break;
            default:
                h0.h hVar3 = (h0.h) obj;
                boolean z13 = hVar3 instanceof h0.f;
                x1.p pVar3 = this.f30515b;
                if (z13) {
                    pVar3.add(hVar3);
                } else if (hVar3 instanceof h0.g) {
                    pVar3.remove(((h0.g) hVar3).f29905a);
                } else if (hVar3 instanceof h0.d) {
                    pVar3.add(hVar3);
                } else if (hVar3 instanceof h0.e) {
                    pVar3.remove(((h0.e) hVar3).f29904a);
                } else if (hVar3 instanceof h0.k) {
                    pVar3.add(hVar3);
                } else if (hVar3 instanceof h0.l) {
                    pVar3.remove(((h0.l) hVar3).f29909a);
                } else if (hVar3 instanceof h0.j) {
                    pVar3.remove(((h0.j) hVar3).f29907a);
                } else if (hVar3 instanceof h0.b) {
                    pVar3.add(hVar3);
                } else if (hVar3 instanceof h0.c) {
                    pVar3.remove(((h0.c) hVar3).f29903a);
                } else if (hVar3 instanceof h0.a) {
                    pVar3.remove(((h0.a) hVar3).f29902a);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
