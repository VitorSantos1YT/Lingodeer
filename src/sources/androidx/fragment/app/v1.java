package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.ViewPager;
import com.lingo.lingoskill.object.PdWord;
import com.lingodeer.data.model.INTENTS;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v1 extends ua.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f1852b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1858h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f1854d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f1855e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f1856f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k0 f1857g = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1853c = 1;

    public v1(k1 k1Var) {
        this.f1852b = k1Var;
    }

    @Override // ua.a
    public final void b() {
        a aVar = this.f1854d;
        if (aVar != null) {
            if (!this.f1858h) {
                try {
                    this.f1858h = true;
                    if (aVar.f1897g) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    aVar.f1898h = false;
                    aVar.f1609r.A(aVar, true);
                    this.f1858h = false;
                } catch (Throwable th2) {
                    this.f1858h = false;
                    throw th2;
                }
            }
            this.f1854d = null;
        }
    }

    @Override // ua.a
    public final Object d(ViewPager viewPager, int i11) {
        j0 j0Var;
        k0 k0Var;
        ArrayList arrayList = this.f1856f;
        if (arrayList.size() > i11 && (k0Var = (k0) arrayList.get(i11)) != null) {
            return k0Var;
        }
        if (this.f1854d == null) {
            k1 k1Var = this.f1852b;
            k1Var.getClass();
            this.f1854d = new a(k1Var);
        }
        PdWord pdWord = (PdWord) ((hh.n1) this).f32270i.get(i11);
        kotlin.jvm.internal.m.f(pdWord, "pdWord");
        hh.c1 c1Var = new hh.c1();
        Bundle bundle = new Bundle();
        bundle.putParcelable(INTENTS.EXTRA_OBJECT, pdWord);
        c1Var.setArguments(bundle);
        ArrayList arrayList2 = this.f1855e;
        if (arrayList2.size() > i11 && (j0Var = (j0) arrayList2.get(i11)) != null) {
            c1Var.setInitialSavedState(j0Var);
        }
        while (arrayList.size() <= i11) {
            arrayList.add(null);
        }
        c1Var.setMenuVisibility(false);
        int i12 = this.f1853c;
        if (i12 == 0) {
            c1Var.setUserVisibleHint(false);
        }
        arrayList.set(i11, c1Var);
        this.f1854d.d(viewPager.getId(), c1Var, null, 1);
        if (i12 == 1) {
            this.f1854d.m(c1Var, Lifecycle.State.STARTED);
        }
        return c1Var;
    }

    @Override // ua.a
    public final boolean e(View view, Object obj) {
        return ((k0) obj).getView() == view;
    }

    @Override // ua.a
    public final void f(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            ArrayList arrayList = this.f1855e;
            arrayList.clear();
            ArrayList arrayList2 = this.f1856f;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    arrayList.add((j0) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i11 = Integer.parseInt(str.substring(1));
                    k0 k0VarH = this.f1852b.H(str, bundle);
                    if (k0VarH != null) {
                        while (arrayList2.size() <= i11) {
                            arrayList2.add(null);
                        }
                        k0VarH.setMenuVisibility(false);
                        arrayList2.set(i11, k0VarH);
                    }
                }
            }
        }
    }

    @Override // ua.a
    public final Parcelable g() {
        Bundle bundle;
        ArrayList arrayList = this.f1855e;
        if (arrayList.size() > 0) {
            bundle = new Bundle();
            j0[] j0VarArr = new j0[arrayList.size()];
            arrayList.toArray(j0VarArr);
            bundle.putParcelableArray("states", j0VarArr);
        } else {
            bundle = null;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.f1856f;
            if (i11 >= arrayList2.size()) {
                return bundle;
            }
            k0 k0Var = (k0) arrayList2.get(i11);
            if (k0Var != null && k0Var.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f1852b.W(bundle, nv.p.j(i11, "f"), k0Var);
            }
            i11++;
        }
    }

    @Override // ua.a
    public final void h(Object obj) {
        k0 k0Var = (k0) obj;
        k0 k0Var2 = this.f1857g;
        if (k0Var != k0Var2) {
            k1 k1Var = this.f1852b;
            int i11 = this.f1853c;
            if (k0Var2 != null) {
                k0Var2.setMenuVisibility(false);
                if (i11 == 1) {
                    if (this.f1854d == null) {
                        k1Var.getClass();
                        this.f1854d = new a(k1Var);
                    }
                    this.f1854d.m(this.f1857g, Lifecycle.State.STARTED);
                } else {
                    this.f1857g.setUserVisibleHint(false);
                }
            }
            k0Var.setMenuVisibility(true);
            if (i11 == 1) {
                if (this.f1854d == null) {
                    k1Var.getClass();
                    this.f1854d = new a(k1Var);
                }
                this.f1854d.m(k0Var, Lifecycle.State.RESUMED);
            } else {
                k0Var.setUserVisibleHint(true);
            }
            this.f1857g = k0Var;
        }
    }

    @Override // ua.a
    public final void i(ViewPager viewPager) {
        if (viewPager.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
