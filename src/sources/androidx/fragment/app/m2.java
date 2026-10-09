package androidx.fragment.app;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q2 f1754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n2 f1755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f1756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1761h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1762i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f1763j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f1764k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u1 f1765l;

    public m2(q2 finalState, n2 lifecycleImpact, u1 u1Var) {
        kotlin.jvm.internal.m.f(finalState, "finalState");
        kotlin.jvm.internal.m.f(lifecycleImpact, "lifecycleImpact");
        k0 fragment = u1Var.f1846c;
        kotlin.jvm.internal.m.e(fragment, "fragmentStateManager.fragment");
        kotlin.jvm.internal.m.f(finalState, "finalState");
        kotlin.jvm.internal.m.f(lifecycleImpact, "lifecycleImpact");
        kotlin.jvm.internal.m.f(fragment, "fragment");
        this.f1754a = finalState;
        this.f1755b = lifecycleImpact;
        this.f1756c = fragment;
        this.f1757d = new ArrayList();
        this.f1762i = true;
        ArrayList arrayList = new ArrayList();
        this.f1763j = arrayList;
        this.f1764k = arrayList;
        this.f1765l = u1Var;
    }

    public final void a(ViewGroup container) {
        kotlin.jvm.internal.m.f(container, "container");
        this.f1761h = false;
        if (this.f1758e) {
            return;
        }
        this.f1758e = true;
        if (this.f1763j.isEmpty()) {
            b();
            return;
        }
        for (l2 l2Var : ry.m.a1(this.f1764k)) {
            l2Var.getClass();
            if (!l2Var.f1741b) {
                l2Var.b(container);
            }
            l2Var.f1741b = true;
        }
    }

    public final void b() {
        this.f1761h = false;
        if (!this.f1759f) {
            if (k1.L(2)) {
                toString();
            }
            this.f1759f = true;
            ArrayList arrayList = this.f1757d;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((Runnable) obj).run();
            }
        }
        this.f1756c.mTransitioning = false;
        this.f1765l.i();
    }

    public final void c(l2 effect) {
        kotlin.jvm.internal.m.f(effect, "effect");
        ArrayList arrayList = this.f1763j;
        if (arrayList.remove(effect) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(q2 finalState, n2 lifecycleImpact) {
        kotlin.jvm.internal.m.f(finalState, "finalState");
        kotlin.jvm.internal.m.f(lifecycleImpact, "lifecycleImpact");
        int i11 = r2.f1825a[lifecycleImpact.ordinal()];
        k0 k0Var = this.f1756c;
        if (i11 == 1) {
            if (this.f1754a == q2.REMOVED) {
                if (k1.L(2)) {
                    Objects.toString(k0Var);
                    Objects.toString(this.f1755b);
                }
                this.f1754a = q2.VISIBLE;
                this.f1755b = n2.ADDING;
                this.f1762i = true;
                return;
            }
            return;
        }
        if (i11 == 2) {
            if (k1.L(2)) {
                Objects.toString(k0Var);
                Objects.toString(this.f1754a);
                Objects.toString(this.f1755b);
            }
            this.f1754a = q2.REMOVED;
            this.f1755b = n2.REMOVING;
            this.f1762i = true;
            return;
        }
        if (i11 == 3 && this.f1754a != q2.REMOVED) {
            if (k1.L(2)) {
                Objects.toString(k0Var);
                Objects.toString(this.f1754a);
                finalState.toString();
            }
            this.f1754a = finalState;
        }
    }

    public final String toString() {
        StringBuilder sbQ = hh.p0.q("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbQ.append(this.f1754a);
        sbQ.append(" lifecycleImpact = ");
        sbQ.append(this.f1755b);
        sbQ.append(" fragment = ");
        sbQ.append(this.f1756c);
        sbQ.append('}');
        return sbQ.toString();
    }
}
