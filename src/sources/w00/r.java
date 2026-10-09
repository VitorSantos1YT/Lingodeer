package w00;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements d10.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f54447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54448b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList f54449c = new LinkedList();

    public r(char c11) {
        this.f54447a = c11;
    }

    @Override // d10.a
    public final int a(b bVar, b bVar2) {
        int size = bVar.f54369a.size();
        LinkedList<d10.a> linkedList = this.f54449c;
        for (d10.a aVar : linkedList) {
            if (aVar.c() <= size) {
                return aVar.a(bVar, bVar2);
            }
        }
        aVar = (d10.a) linkedList.getFirst();
        return aVar.a(bVar, bVar2);
    }

    @Override // d10.a
    public final char b() {
        return this.f54447a;
    }

    @Override // d10.a
    public final int c() {
        return this.f54448b;
    }

    @Override // d10.a
    public final char d() {
        return this.f54447a;
    }

    public final void e(d10.a aVar) {
        int iC = aVar.c();
        LinkedList linkedList = this.f54449c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            d10.a aVar2 = (d10.a) listIterator.next();
            int iC2 = aVar2.c();
            if (iC > iC2) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (iC == iC2) {
                String strValueOf = String.valueOf(aVar2);
                String strValueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder("Cannot add two delimiter processors for char '");
                sb2.append(this.f54447a);
                sb2.append("' and minimum length ");
                sb2.append(iC);
                sb2.append("; conflicting processors: ");
                throw new IllegalArgumentException(nv.p.u(sb2, strValueOf, ", ", strValueOf2));
            }
        }
        linkedList.add(aVar);
        this.f54448b = iC;
    }
}
