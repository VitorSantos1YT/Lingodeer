package e6;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends c6.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f24875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t1 f24876d;

    public a0() {
        super(0, 3);
        this.f24875c = 9205357640488583168L;
        this.f24876d = s1.f25047a;
    }

    @Override // c6.g
    public final c6.g a() {
        a0 a0Var = new a0();
        a0Var.f24875c = this.f24875c;
        a0Var.f24876d = this.f24876d;
        ArrayList arrayList = this.f6630b;
        ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            arrayList2.add(((c6.g) obj).a());
        }
        a0Var.f6630b.addAll(arrayList2);
        return a0Var;
    }

    @Override // c6.g
    public final c6.l b() {
        c6.l lVarB;
        c6.g gVar = (c6.g) ry.m.Q0(this.f6630b);
        return (gVar == null || (lVarB = gVar.b()) == null) ? vc.a.i(c6.j.f6631a) : lVarB;
    }

    @Override // c6.g
    public final void c(c6.l lVar) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    public final String toString() {
        return "EmittableSizeBox(size=" + ((Object) v3.h.c(this.f24875c)) + ", sizeMode=" + this.f24876d + ", children=[\n" + d() + "\n])";
    }
}
