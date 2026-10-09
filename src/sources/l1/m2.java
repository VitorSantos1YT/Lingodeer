package l1;

import i0.pKy.shrCcjmOhAmRC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 implements y1.c, Iterable, gz.a {
    public int H;
    public HashMap L;
    public y.x M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39359b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39362e;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f39364t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f39358a = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f39360c = new Object[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f39363f = new Object();
    public ArrayList K = new ArrayList();

    public final int b(b bVar) {
        if (this.f39364t) {
            u.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!bVar.a()) {
            r1.a("Anchor refers to a group that was removed");
        }
        return bVar.f39235a;
    }

    public final void d() {
        this.L = new HashMap();
    }

    public final l2 e() {
        if (this.f39364t) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f39362e++;
        return new l2(this);
    }

    public final boolean g(b bVar) {
        int iE;
        return bVar.a() && (iE = o2.e(this.K, bVar.f39235a, this.f39359b)) >= 0 && kotlin.jvm.internal.m.a(this.K.get(iE), bVar);
    }

    public final o0 h(int i11) {
        int i12;
        ArrayList arrayList;
        int iE;
        HashMap map = this.L;
        if (map != null) {
            if (this.f39364t) {
                u.a("use active SlotWriter to crate an anchor for location instead");
            }
            b bVar = (i11 < 0 || i11 >= (i12 = this.f39359b) || (iE = o2.e((arrayList = this.K), i11, i12)) < 0) ? null : (b) arrayList.get(iE);
            if (bVar != null) {
                return (o0) map.get(bVar);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new n0(this, 0, this.f39359b);
    }

    public final p2 f() {
        if (this.f39364t) {
            u.a(shrCcjmOhAmRC.cGTru);
        }
        if (this.f39362e > 0) {
            u.a("Cannot start a writer when a reader is pending");
        }
        this.f39364t = true;
        this.H++;
        return new p2(this);
    }
}
