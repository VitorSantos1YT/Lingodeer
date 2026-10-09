package rq;

import java.util.ArrayList;
import kotlin.jvm.internal.m;
import sq.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends lp.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public mp.b f49366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f49367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a5.f f49368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final oi.c f49369j;

    public c(v vVar, ArrayList arrayList) {
        super(vVar);
        this.f49366g = vVar;
        this.f49367h = arrayList;
        this.f49368i = new a5.f(24, false);
        this.f49369j = new oi.c(2);
    }

    public static pq.a m(ArrayList arrayList, pq.a aVar) {
        double dRandom = Math.random();
        int size = arrayList.size();
        while (true) {
            int i11 = (int) (dRandom * ((double) size));
            if (!m.a(((g) arrayList.get(i11)).f49358b, aVar)) {
                return ((g) arrayList.get(i11)).f49358b;
            }
            dRandom = Math.random();
            size = arrayList.size();
        }
    }

    @Override // lp.a
    public final a5.f d() {
        return this.f49368i;
    }

    @Override // lp.a
    public final mp.b e() {
        return this.f49366g;
    }

    @Override // lp.a
    public final oi.c f() {
        return this.f49369j;
    }

    @Override // lp.a
    public final hi.a g(qi.a m) {
        m.f(m, "m");
        return null;
    }

    @Override // lp.a
    public final void j(mp.b bVar) {
        m.f(bVar, "<set-?>");
        this.f49366g = bVar;
    }

    @Override // lp.a
    public final hi.a l(qi.a aVar) {
        return null;
    }
}
