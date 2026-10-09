package k6;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends c6.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c6.l f37928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f37929d;

    public i() {
        super(0, 3);
        this.f37928c = c6.j.f6631a;
        this.f37929d = c.f37913c;
    }

    @Override // c6.g
    public final c6.g a() {
        i iVar = new i();
        iVar.f37928c = this.f37928c;
        iVar.f37929d = this.f37929d;
        ArrayList arrayList = this.f6630b;
        ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            arrayList2.add(((c6.g) obj).a());
        }
        iVar.f6630b.addAll(arrayList2);
        return iVar;
    }

    @Override // c6.g
    public final c6.l b() {
        return this.f37928c;
    }

    @Override // c6.g
    public final void c(c6.l lVar) {
        this.f37928c = lVar;
    }

    public final String toString() {
        return "EmittableBox(modifier=" + this.f37928c + ", contentAlignment=" + this.f37929d + "children=[\n" + d() + "\n])";
    }
}
