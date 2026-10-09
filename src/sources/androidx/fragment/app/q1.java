package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q1 extends ua.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f1805b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1809f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f1807d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k0 f1808e = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1806c = 1;

    public q1(k1 k1Var) {
        this.f1805b = k1Var;
    }

    @Override // ua.a
    public void a(ViewPager viewPager, int i11, Object obj) {
        k0 k0Var = (k0) obj;
        if (this.f1807d == null) {
            k1 k1Var = this.f1805b;
            k1Var.getClass();
            this.f1807d = new a(k1Var);
        }
        a aVar = this.f1807d;
        aVar.getClass();
        k1 k1Var2 = k0Var.mFragmentManager;
        if (k1Var2 != null && k1Var2 != aVar.f1609r) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + k0Var.toString() + " is already attached to a FragmentManager.");
        }
        aVar.c(new y1(k0Var, 6));
        if (k0Var.equals(this.f1808e)) {
            this.f1808e = null;
        }
    }

    @Override // ua.a
    public final void b() {
        a aVar = this.f1807d;
        if (aVar != null) {
            if (!this.f1809f) {
                try {
                    this.f1809f = true;
                    if (aVar.f1897g) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    aVar.f1898h = false;
                    aVar.f1609r.A(aVar, true);
                    this.f1809f = false;
                } catch (Throwable th2) {
                    this.f1809f = false;
                    throw th2;
                }
            }
            this.f1807d = null;
        }
    }

    @Override // ua.a
    public final Object d(ViewPager viewPager, int i11) {
        a aVar = this.f1807d;
        k1 k1Var = this.f1805b;
        if (aVar == null) {
            k1Var.getClass();
            this.f1807d = new a(k1Var);
        }
        long j11 = i11;
        k0 k0VarD = k1Var.D("android:switcher:" + viewPager.getId() + ":" + j11);
        if (k0VarD != null) {
            a aVar2 = this.f1807d;
            aVar2.getClass();
            aVar2.c(new y1(k0VarD, 7));
        } else {
            k0VarD = j(i11);
            this.f1807d.d(viewPager.getId(), k0VarD, "android:switcher:" + viewPager.getId() + ":" + j11, 1);
        }
        if (k0VarD != this.f1808e) {
            k0VarD.setMenuVisibility(false);
            if (this.f1806c == 1) {
                this.f1807d.m(k0VarD, Lifecycle.State.STARTED);
                return k0VarD;
            }
            k0VarD.setUserVisibleHint(false);
        }
        return k0VarD;
    }

    @Override // ua.a
    public final boolean e(View view, Object obj) {
        return ((k0) obj).getView() == view;
    }

    @Override // ua.a
    public final Parcelable g() {
        return null;
    }

    @Override // ua.a
    public final void h(Object obj) {
        k0 k0Var = (k0) obj;
        k0 k0Var2 = this.f1808e;
        if (k0Var != k0Var2) {
            k1 k1Var = this.f1805b;
            int i11 = this.f1806c;
            if (k0Var2 != null) {
                k0Var2.setMenuVisibility(false);
                if (i11 == 1) {
                    if (this.f1807d == null) {
                        k1Var.getClass();
                        this.f1807d = new a(k1Var);
                    }
                    this.f1807d.m(this.f1808e, Lifecycle.State.STARTED);
                } else {
                    this.f1808e.setUserVisibleHint(false);
                }
            }
            k0Var.setMenuVisibility(true);
            if (i11 == 1) {
                if (this.f1807d == null) {
                    k1Var.getClass();
                    this.f1807d = new a(k1Var);
                }
                this.f1807d.m(k0Var, Lifecycle.State.RESUMED);
            } else {
                k0Var.setUserVisibleHint(true);
            }
            this.f1808e = k0Var;
        }
    }

    @Override // ua.a
    public final void i(ViewPager viewPager) {
        if (viewPager.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public abstract k0 j(int i11);

    @Override // ua.a
    public final void f(Parcelable parcelable, ClassLoader classLoader) {
    }
}
