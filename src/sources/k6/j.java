package k6;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends c6.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c6.l f37930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37932e;

    public j() {
        super(0, 3);
        this.f37930c = c6.j.f6631a;
        this.f37931d = 0;
        this.f37932e = 0;
    }

    @Override // c6.g
    public final c6.g a() {
        j jVar = new j();
        jVar.f37930c = this.f37930c;
        jVar.f37931d = this.f37931d;
        jVar.f37932e = this.f37932e;
        ArrayList arrayList = this.f6630b;
        ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            arrayList2.add(((c6.g) obj).a());
        }
        jVar.f6630b.addAll(arrayList2);
        return jVar;
    }

    @Override // c6.g
    public final c6.l b() {
        return this.f37930c;
    }

    @Override // c6.g
    public final void c(c6.l lVar) {
        this.f37930c = lVar;
    }

    public final String toString() {
        return "EmittableColumn(modifier=" + this.f37930c + ", verticalAlignment=" + ((Object) b.b(this.f37931d)) + ", horizontalAlignment=" + ((Object) a.b(this.f37932e)) + ", children=[\n" + d() + "\n])";
    }
}
