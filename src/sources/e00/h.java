package e00;

import g00.d1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import qy.q;
import ry.r;
import ry.v;
import ry.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements g, g00.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o00.a f24683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f24685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f24686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g[] f24687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List[] f24688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f24689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f24690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g[] f24691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q f24692k;

    public h(String serialName, o00.a aVar, int i11, List list, a aVar2) {
        kotlin.jvm.internal.m.f(serialName, "serialName");
        this.f24682a = serialName;
        this.f24683b = aVar;
        this.f24684c = i11;
        ArrayList arrayList = aVar2.f24663b;
        this.f24685d = ry.m.Y0(arrayList);
        int i12 = 0;
        this.f24686e = (String[]) arrayList.toArray(new String[0]);
        this.f24687f = d1.c(aVar2.f24665d);
        this.f24688g = (List[]) aVar2.f24666e.toArray(new List[0]);
        ArrayList arrayList2 = aVar2.f24667f;
        kotlin.jvm.internal.m.f(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        int size = arrayList2.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList2.get(i13);
            i13++;
            zArr[i12] = ((Boolean) obj).booleanValue();
            i12++;
        }
        this.f24689h = zArr;
        String[] strArr = this.f24686e;
        kotlin.jvm.internal.m.f(strArr, "<this>");
        j jVar = new j(new lt.e(strArr, 28), 3);
        ArrayList arrayList3 = new ArrayList(ry.n.W(jVar, 10));
        Iterator it = jVar.iterator();
        while (true) {
            nz.d dVar = (nz.d) it;
            if (!dVar.f44314c.hasNext()) {
                this.f24690i = x.g0(arrayList3);
                this.f24691j = d1.c(list);
                this.f24692k = com.bumptech.glide.d.v(new cr.n(this, 13));
                return;
            }
            v vVar = (v) dVar.next();
            arrayList3.add(new qy.l(vVar.f50858b, Integer.valueOf(vVar.f50857a)));
        }
    }

    @Override // e00.g
    public final String a() {
        return this.f24682a;
    }

    @Override // g00.l
    public final Set b() {
        return this.f24685d;
    }

    @Override // e00.g
    public final boolean c() {
        return false;
    }

    @Override // e00.g
    public final int d(String name) {
        kotlin.jvm.internal.m.f(name, "name");
        Integer num = (Integer) this.f24690i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // e00.g
    public final o00.a e() {
        return this.f24683b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            g gVar = (g) obj;
            if (kotlin.jvm.internal.m.a(this.f24682a, gVar.a()) && Arrays.equals(this.f24691j, ((h) obj).f24691j)) {
                int iF = gVar.f();
                int i11 = this.f24684c;
                if (i11 == iF) {
                    for (int i12 = 0; i12 < i11; i12++) {
                        g[] gVarArr = this.f24687f;
                        if (kotlin.jvm.internal.m.a(gVarArr[i12].a(), gVar.i(i12).a()) && kotlin.jvm.internal.m.a(gVarArr[i12].e(), gVar.i(i12).e())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // e00.g
    public final int f() {
        return this.f24684c;
    }

    @Override // e00.g
    public final String g(int i11) {
        return this.f24686e[i11];
    }

    @Override // e00.g
    public final List getAnnotations() {
        return r.f50854a;
    }

    @Override // e00.g
    public final List h(int i11) {
        return this.f24688g[i11];
    }

    public final int hashCode() {
        return ((Number) this.f24692k.getValue()).intValue();
    }

    @Override // e00.g
    public final g i(int i11) {
        return this.f24687f[i11];
    }

    @Override // e00.g
    public final boolean isInline() {
        return false;
    }

    @Override // e00.g
    public final boolean j(int i11) {
        return this.f24689h[i11];
    }

    public final String toString() {
        return d1.m(this);
    }
}
