package e6;

import a.ar.MFeWs;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends c6.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c6.l f24956d;

    public k1(int i11) {
        super(i11, 2);
        this.f24955c = i11;
        this.f24956d = c6.j.f6631a;
    }

    @Override // c6.g
    public final c6.g a() {
        k1 k1Var = new k1(this.f24955c);
        k1Var.f24956d = this.f24956d;
        ArrayList arrayList = this.f6630b;
        ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            arrayList2.add(((c6.g) obj).a());
        }
        k1Var.f6630b.addAll(arrayList2);
        return k1Var;
    }

    @Override // c6.g
    public final c6.l b() {
        return this.f24956d;
    }

    @Override // c6.g
    public final void c(c6.l lVar) {
        this.f24956d = lVar;
    }

    public final String toString() {
        return MFeWs.XCMmIneXj + this.f24956d + ", children=[\n" + d() + "\n])";
    }
}
