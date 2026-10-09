package n9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c1 f43517e = new c1(d0.f43529g);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f43518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43521d;

    public c1(int i11, int i12, List pages) {
        kotlin.jvm.internal.m.f(pages, "pages");
        this.f43518a = ry.m.c1(pages);
        Iterator it = pages.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((d2) it.next()).f43539b.size();
        }
        this.f43519b = size;
        this.f43520c = i11;
        this.f43521d = i12;
    }

    public final f2 a(int i11) {
        ArrayList arrayList;
        Integer numValueOf;
        int size = i11 - this.f43520c;
        int i12 = 0;
        while (true) {
            arrayList = this.f43518a;
            if (size < ((d2) arrayList.get(i12)).f43539b.size() || i12 >= ns.o.A(arrayList)) {
                break;
            }
            size -= ((d2) arrayList.get(i12)).f43539b.size();
            i12++;
        }
        d2 d2Var = (d2) arrayList.get(i12);
        int i13 = i11 - this.f43520c;
        int iC = (c() - i11) - this.f43521d;
        int i14 = 1;
        int i15 = iC - 1;
        Integer numC0 = ry.l.c0(((d2) ry.m.q0(arrayList)).f43538a);
        kotlin.jvm.internal.m.c(numC0);
        int iIntValue = numC0.intValue();
        int[] iArr = ((d2) ry.m.z0(arrayList)).f43538a;
        kotlin.jvm.internal.m.f(iArr, "<this>");
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i16 = iArr[0];
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i17 = iArr[i14];
                    if (i16 < i17) {
                        i16 = i17;
                    }
                    if (i14 == length) {
                        break;
                    }
                    i14++;
                }
            }
            numValueOf = Integer.valueOf(i16);
        }
        kotlin.jvm.internal.m.c(numValueOf);
        return new f2(d2Var.f43540c, size, i13, i15, iIntValue, numValueOf.intValue());
    }

    public final Object b(int i11) {
        ArrayList arrayList = this.f43518a;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            int size2 = ((d2) arrayList.get(i12)).f43539b.size();
            if (size2 > i11) {
                break;
            }
            i11 -= size2;
            i12++;
        }
        return ((d2) arrayList.get(i12)).f43539b.get(i11);
    }

    public final int c() {
        return this.f43520c + this.f43519b + this.f43521d;
    }

    public final m d(f0 pageEvent) {
        kotlin.jvm.internal.m.f(pageEvent, "pageEvent");
        boolean z11 = pageEvent instanceof d0;
        ArrayList arrayList = this.f43518a;
        if (!z11) {
            if (!(pageEvent instanceof b0)) {
                throw new IllegalStateException("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            }
            lz.g gVar = new lz.g(0, 0, 1);
            Iterator it = arrayList.iterator();
            int size = 0;
            while (it.hasNext()) {
                d2 d2Var = (d2) it.next();
                for (int i11 : d2Var.f43538a) {
                    if (gVar.b(i11)) {
                        size += d2Var.f43539b.size();
                        it.remove();
                        break;
                    }
                }
            }
            int i12 = this.f43519b - size;
            this.f43519b = i12;
            if (y.PREPEND == null) {
                int i13 = this.f43520c;
                this.f43520c = 0;
                return new h1(size, 0, i13);
            }
            int i14 = this.f43521d;
            this.f43521d = 0;
            return new g1(this.f43520c + i12, size, 0, i14);
        }
        d0 d0Var = (d0) pageEvent;
        List list = d0Var.f43531b;
        Iterator it2 = list.iterator();
        int size2 = 0;
        while (it2.hasNext()) {
            size2 += ((d2) it2.next()).f43539b.size();
        }
        int i15 = b1.f43498a[d0Var.f43530a.ordinal()];
        if (i15 == 1) {
            throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        }
        if (i15 == 2) {
            int i16 = this.f43520c;
            arrayList.addAll(0, list);
            this.f43519b += size2;
            this.f43520c = d0Var.f43532c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                ry.m.d0(arrayList2, ((d2) it3.next()).f43539b);
            }
            return new i1(arrayList2, this.f43520c, i16);
        }
        if (i15 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i17 = this.f43521d;
        int i18 = this.f43519b;
        arrayList.addAll(arrayList.size(), list);
        this.f43519b += size2;
        this.f43521d = d0Var.f43533d;
        int i19 = this.f43520c + i18;
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            ry.m.d0(arrayList3, ((d2) it4.next()).f43539b);
        }
        return new f1(i19, arrayList3, this.f43521d, i17);
    }

    public final String toString() {
        int i11 = this.f43519b;
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(b(i12));
        }
        String strY0 = ry.m.y0(arrayList, null, null, null, null, 63);
        StringBuilder sb2 = new StringBuilder("[(");
        sb2.append(this.f43520c);
        sb2.append(" placeholders), ");
        sb2.append(strY0);
        sb2.append(", (");
        return hh.p0.i(this.f43521d, " placeholders)]", sb2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c1(d0 insertEvent) {
        this(insertEvent.f43532c, insertEvent.f43533d, insertEvent.f43531b);
        kotlin.jvm.internal.m.f(insertEvent, "insertEvent");
    }
}
