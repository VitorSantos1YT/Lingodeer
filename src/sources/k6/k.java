package k6;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends c6.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c6.l f37933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37935e;

    public k() {
        super(0, 3);
        this.f37933c = c6.j.f6631a;
        this.f37934d = 0;
        this.f37935e = 0;
    }

    @Override // c6.g
    public final c6.g a() {
        k kVar = new k();
        kVar.f37933c = this.f37933c;
        kVar.f37934d = this.f37934d;
        kVar.f37935e = this.f37935e;
        ArrayList arrayList = this.f6630b;
        ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            arrayList2.add(((c6.g) obj).a());
        }
        kVar.f6630b.addAll(arrayList2);
        return kVar;
    }

    @Override // c6.g
    public final c6.l b() {
        return this.f37933c;
    }

    @Override // c6.g
    public final void c(c6.l lVar) {
        this.f37933c = lVar;
    }

    public final String toString() {
        return "EmittableRow(modifier=" + this.f37933c + ", horizontalAlignment=" + ((Object) a.b(this.f37934d)) + ", verticalAlignment=" + ((Object) b.b(this.f37935e)) + ", children=[\n" + d() + "\n])";
    }
}
