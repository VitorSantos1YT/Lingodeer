package l1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashSet f39422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f39423e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k1 f39424f = new k1(t1.i.f51992d, g.f39301e);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f39425g;

    public q(s sVar, long j11, boolean z11, boolean z12, a0.b2 b2Var) {
        this.f39425g = sVar;
        this.f39419a = j11;
        this.f39420b = z11;
        this.f39421c = z12;
    }

    @Override // l1.w
    public final void a(z zVar, fz.e eVar) {
        this.f39425g.f39435b.a(zVar, eVar);
    }

    @Override // l1.w
    public final y.j0 b(z zVar, se.n nVar, fz.e eVar) {
        return this.f39425g.f39435b.b(zVar, nVar, eVar);
    }

    @Override // l1.w
    public final void c() {
        this.f39425g.A--;
    }

    @Override // l1.w
    public final boolean d() {
        return this.f39425g.f39435b.d();
    }

    @Override // l1.w
    public final boolean e() {
        return this.f39420b;
    }

    @Override // l1.w
    public final boolean f() {
        return this.f39421c;
    }

    @Override // l1.w
    public final long g() {
        return this.f39419a;
    }

    @Override // l1.w
    public final v h() {
        return this.f39425g.f39441h;
    }

    @Override // l1.w
    public final q1 i() {
        return (q1) this.f39424f.getValue();
    }

    @Override // l1.w
    public final vy.i j() {
        return this.f39425g.f39435b.j();
    }

    @Override // l1.w
    public final boolean k() {
        return this.f39425g.f39435b.k();
    }

    @Override // l1.w
    public final void l(z zVar) {
        s sVar = this.f39425g;
        sVar.f39435b.l(sVar.f39441h);
        sVar.f39435b.l(zVar);
    }

    @Override // l1.w
    public final y0 m(z0 z0Var) {
        return this.f39425g.f39435b.m(z0Var);
    }

    @Override // l1.w
    public final y.j0 n(z zVar, se.n nVar, y.j0 j0Var) {
        return this.f39425g.f39435b.n(zVar, nVar, j0Var);
    }

    @Override // l1.w
    public final void o(Set set) {
        HashSet hashSet = this.f39422d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f39422d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // l1.w
    public final void p(s sVar) {
        this.f39423e.add(sVar);
    }

    @Override // l1.w
    public final void q(x1 x1Var) {
        this.f39425g.f39435b.q(x1Var);
    }

    @Override // l1.w
    public final void r(z zVar) {
        this.f39425g.f39435b.r(zVar);
    }

    @Override // l1.w
    public final h s(w2.l1 l1Var) {
        return this.f39425g.f39435b.s(l1Var);
    }

    @Override // l1.w
    public final void t() {
        this.f39425g.A++;
    }

    @Override // l1.w
    public final void u(n nVar) {
        HashSet<Set> hashSet = this.f39422d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                kotlin.jvm.internal.m.d(nVar, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(((s) nVar).z());
            }
        }
        LinkedHashSet linkedHashSet = this.f39423e;
        kotlin.jvm.internal.c0.a(linkedHashSet);
        linkedHashSet.remove(nVar);
    }

    @Override // l1.w
    public final void v(z zVar) {
        this.f39425g.f39435b.v(zVar);
    }

    public final void w() {
        LinkedHashSet<s> linkedHashSet = this.f39423e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f39422d;
        if (hashSet != null) {
            for (s sVar : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(sVar.z());
                }
            }
        }
        linkedHashSet.clear();
    }
}
