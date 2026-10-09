package n0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f43035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f43036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f43037f;

    public y0() {
        this.f43035d = new ry.k();
        this.f43036e = new xq.c(24);
    }

    public void a(n9.f0 event) {
        ry.k kVar = (ry.k) this.f43035d;
        xq.c cVar = (xq.c) this.f43036e;
        kotlin.jvm.internal.m.f(event, "event");
        this.f43034c = true;
        if (!(event instanceof n9.d0)) {
            if (event instanceof n9.b0) {
                cVar.P(null, n9.u.f43702c);
                int[] iArr = n9.i.f43585a;
                throw null;
            }
            if (event instanceof n9.e0) {
                n9.e0 e0Var = (n9.e0) event;
                cVar.O(e0Var.f43546a);
                this.f43037f = e0Var.f43547b;
                return;
            }
            return;
        }
        n9.d0 d0Var = (n9.d0) event;
        n9.x xVar = d0Var.f43534e;
        int i11 = d0Var.f43532c;
        int i12 = d0Var.f43533d;
        List list = d0Var.f43531b;
        cVar.O(xVar);
        this.f43037f = d0Var.f43535f;
        int i13 = n9.i.f43585a[d0Var.f43530a.ordinal()];
        if (i13 == 1) {
            this.f43032a = i11;
            int size = list.size() - 1;
            lz.f fVar = new lz.f(size, com.bumptech.glide.e.v(size, 0, -1), -1);
            while (fVar.f40537c) {
                kVar.addFirst(list.get(fVar.nextInt()));
            }
            return;
        }
        if (i13 == 2) {
            this.f43033b = i12;
            kVar.addAll(list);
        } else {
            if (i13 != 3) {
                return;
            }
            kVar.clear();
            this.f43033b = i12;
            this.f43032a = i11;
            kVar.addAll(list);
        }
    }

    public List b() {
        ry.k kVar = (ry.k) this.f43035d;
        if (!this.f43034c) {
            return ry.r.f50854a;
        }
        ArrayList arrayList = new ArrayList();
        n9.x xVarU = ((xq.c) this.f43036e).U();
        if (kVar.isEmpty()) {
            arrayList.add(new n9.e0(xVarU, (n9.x) this.f43037f));
            return arrayList;
        }
        n9.d0 d0Var = n9.d0.f43529g;
        arrayList.add(new n9.d0(n9.y.REFRESH, ry.m.a1(kVar), this.f43032a, this.f43033b, xVarU, (n9.x) this.f43037f));
        return arrayList;
    }

    public y0(z0 z0Var, List list) {
        this.f43037f = z0Var;
        this.f43035d = list;
        this.f43036e = new List[list.size()];
        if (list.isEmpty()) {
            i0.a.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
