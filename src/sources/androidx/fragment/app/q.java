package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends l2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m2 f1789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m2 f1790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h2 f1791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f1792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f1793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f1794i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y.e f1795j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f1796k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f1797l;
    public final y.e m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y.e f1798n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f1799o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v4.b f1800p = new v4.b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f1801q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1802r;

    public q(ArrayList arrayList, m2 m2Var, m2 m2Var2, h2 h2Var, Object obj, ArrayList arrayList2, ArrayList arrayList3, y.e eVar, ArrayList arrayList4, ArrayList arrayList5, y.e eVar2, y.e eVar3, boolean z11) {
        this.f1788c = arrayList;
        this.f1789d = m2Var;
        this.f1790e = m2Var2;
        this.f1791f = h2Var;
        this.f1792g = obj;
        this.f1793h = arrayList2;
        this.f1794i = arrayList3;
        this.f1795j = eVar;
        this.f1796k = arrayList4;
        this.f1797l = arrayList5;
        this.m = eVar2;
        this.f1798n = eVar3;
        this.f1799o = z11;
    }

    public static void f(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i11 = z4.u0.f58902a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = viewGroup.getChildAt(i12);
            if (childAt.getVisibility() == 0) {
                f(childAt, arrayList);
            }
        }
    }

    @Override // androidx.fragment.app.l2
    public final boolean a() {
        Object obj;
        Object obj2;
        h2 h2Var = this.f1791f;
        if (h2Var.l()) {
            ArrayList arrayList = this.f1788c;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    r rVar = (r) obj3;
                    if (Build.VERSION.SDK_INT < 34 || (obj2 = rVar.f1810b) == null || !h2Var.m(obj2)) {
                    }
                }
                obj = this.f1792g;
                return obj != null ? true : true;
            }
            obj = this.f1792g;
            if (obj != null || h2Var.m(obj)) {
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.l2
    public final void b(ViewGroup container) {
        kotlin.jvm.internal.m.f(container, "container");
        this.f1800p.a();
    }

    @Override // androidx.fragment.app.l2
    public final void c(ViewGroup container) {
        kotlin.jvm.internal.m.f(container, "container");
        boolean zIsLaidOut = container.isLaidOut();
        int i11 = 0;
        ArrayList arrayList = this.f1788c;
        if (!zIsLaidOut || this.f1802r) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                r rVar = (r) obj;
                m2 m2Var = rVar.f1737a;
                if (k1.L(2)) {
                    if (this.f1802r) {
                        Objects.toString(m2Var);
                    } else {
                        container.toString();
                        Objects.toString(m2Var);
                    }
                }
                rVar.f1737a.c(this);
            }
            this.f1802r = false;
            return;
        }
        Object obj2 = this.f1801q;
        h2 h2Var = this.f1791f;
        m2 m2Var2 = this.f1790e;
        m2 m2Var3 = this.f1789d;
        if (obj2 != null) {
            h2Var.c(obj2);
            if (k1.L(2)) {
                Objects.toString(m2Var3);
                Objects.toString(m2Var2);
                return;
            }
            return;
        }
        qy.l lVarG = g(container, m2Var2, m2Var3);
        ArrayList arrayList2 = (ArrayList) lVarG.f48495a;
        Object obj3 = lVarG.f48496b;
        ArrayList arrayList3 = new ArrayList(ry.n.W(arrayList, 10));
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj4 = arrayList.get(i13);
            i13++;
            arrayList3.add(((r) obj4).f1737a);
        }
        int size3 = arrayList3.size();
        while (i11 < size3) {
            Object obj5 = arrayList3.get(i11);
            i11++;
            m2 m2Var4 = (m2) obj5;
            h2Var.u(m2Var4.f1756c, obj3, this.f1800p, new m(m2Var4, this, 1));
        }
        i(arrayList2, container, new o(this, container, obj3));
        if (k1.L(2)) {
            Objects.toString(m2Var3);
            Objects.toString(m2Var2);
        }
    }

    @Override // androidx.fragment.app.l2
    public final void d(f.a backEvent, ViewGroup container) {
        kotlin.jvm.internal.m.f(backEvent, "backEvent");
        kotlin.jvm.internal.m.f(container, "container");
        Object obj = this.f1801q;
        if (obj != null) {
            this.f1791f.r(obj, backEvent.f26117c);
        }
    }

    @Override // androidx.fragment.app.l2
    public final void e(ViewGroup container) {
        Object obj;
        kotlin.jvm.internal.m.f(container, "container");
        boolean zIsLaidOut = container.isLaidOut();
        int i11 = 0;
        ArrayList arrayList = this.f1788c;
        if (zIsLaidOut) {
            boolean zH = h();
            m2 m2Var = this.f1790e;
            m2 m2Var2 = this.f1789d;
            if (zH && (obj = this.f1792g) != null && !a()) {
                Objects.toString(obj);
                Objects.toString(m2Var2);
                Objects.toString(m2Var);
            }
            if (a() && h()) {
                kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                qy.l lVarG = g(container, m2Var, m2Var2);
                ArrayList arrayList2 = (ArrayList) lVarG.f48495a;
                Object obj2 = lVarG.f48496b;
                ArrayList arrayList3 = new ArrayList(ry.n.W(arrayList, 10));
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    arrayList3.add(((r) obj3).f1737a);
                }
                int size2 = arrayList3.size();
                while (i11 < size2) {
                    Object obj4 = arrayList3.get(i11);
                    i11++;
                    m2 m2Var3 = (m2) obj4;
                    z zVar = new z(yVar, 1);
                    k0 k0Var = m2Var3.f1756c;
                    this.f1791f.v(obj2, this.f1800p, zVar, new m(m2Var3, this, 0));
                }
                i(arrayList2, container, new p(this, container, obj2, yVar, 0));
            }
        } else {
            int size3 = arrayList.size();
            while (i11 < size3) {
                Object obj5 = arrayList.get(i11);
                i11++;
                m2 m2Var4 = ((r) obj5).f1737a;
                if (k1.L(2)) {
                    container.toString();
                    Objects.toString(m2Var4);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00c3  */
    public final qy.l g(ViewGroup viewGroup, m2 m2Var, m2 m2Var2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        h2 h2Var;
        View view = new View(viewGroup.getContext());
        Rect rect = new Rect();
        ArrayList arrayList3 = this.f1788c;
        int size = arrayList3.size();
        View view2 = null;
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            arrayList = this.f1794i;
            arrayList2 = this.f1793h;
            obj = this.f1792g;
            h2Var = this.f1791f;
            if (i11 >= size) {
                break;
            }
            Object obj2 = arrayList3.get(i11);
            i11++;
            if (((r) obj2).f1812d == null || m2Var2 == null || m2Var == null || this.f1795j.isEmpty() || obj == null) {
                size = size;
                z11 = z11;
            } else {
                k0 inFragment = m2Var.f1756c;
                int i12 = size;
                k0 outFragment = m2Var2.f1756c;
                f2 f2Var = a2.f1614a;
                boolean z12 = z11;
                kotlin.jvm.internal.m.f(inFragment, "inFragment");
                kotlin.jvm.internal.m.f(outFragment, "outFragment");
                if (this.f1799o) {
                    outFragment.getEnterTransitionCallback();
                } else {
                    inFragment.getEnterTransitionCallback();
                }
                z4.w.a(viewGroup, new d(m2Var, m2Var2, this, 1));
                y.e eVar = this.m;
                arrayList2.addAll(eVar.values());
                ArrayList arrayList4 = this.f1797l;
                if (!arrayList4.isEmpty()) {
                    Object obj3 = arrayList4.get(0);
                    kotlin.jvm.internal.m.e(obj3, "exitingNames[0]");
                    View view3 = (View) eVar.get((String) obj3);
                    h2Var.s(view3, obj);
                    view2 = view3;
                }
                y.e eVar2 = this.f1798n;
                arrayList.addAll(eVar2.values());
                ArrayList arrayList5 = this.f1796k;
                if (arrayList5.isEmpty()) {
                    z11 = z12;
                } else {
                    Object obj4 = arrayList5.get(0);
                    kotlin.jvm.internal.m.e(obj4, "enteringNames[0]");
                    View view4 = (View) eVar2.get((String) obj4);
                    if (view4 != null) {
                        z4.w.a(viewGroup, new n(h2Var, view4, rect));
                        z11 = true;
                    } else {
                        z11 = z12;
                    }
                }
                h2Var.w(obj, view, arrayList2);
                Object obj5 = this.f1792g;
                h2Var.q(obj5, null, null, obj5, arrayList);
                size = i12;
            }
        }
        boolean z13 = z11;
        ArrayList arrayList6 = new ArrayList();
        int size2 = arrayList3.size();
        int i13 = 0;
        Object objO = null;
        Object objO2 = null;
        while (i13 < size2) {
            r rVar = (r) arrayList3.get(i13);
            i13++;
            m2 m2Var3 = rVar.f1737a;
            arrayList3 = arrayList3;
            Object objH = h2Var.h(rVar.f1810b);
            if (objH != null) {
                int i14 = size2;
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = arrayList2;
                k0 k0Var = m2Var3.f1756c;
                Object obj6 = obj;
                View view5 = k0Var.mView;
                Object obj7 = objO2;
                kotlin.jvm.internal.m.e(view5, "operation.fragment.mView");
                f(view5, arrayList7);
                if (obj6 != null && (m2Var3 == m2Var2 || m2Var3 == m2Var)) {
                    if (m2Var3 == m2Var2) {
                        arrayList7.removeAll(ry.m.f1(arrayList8));
                    } else {
                        arrayList7.removeAll(ry.m.f1(arrayList));
                    }
                }
                if (arrayList7.isEmpty()) {
                    h2Var.a(view, objH);
                } else {
                    h2Var.b(objH, arrayList7);
                    h2Var.q(objH, objH, arrayList7, null, null);
                    if (m2Var3.f1754a == q2.GONE) {
                        m2Var3.f1762i = false;
                        ArrayList arrayList9 = new ArrayList(arrayList7);
                        arrayList9.remove(k0Var.mView);
                        h2Var.p(objH, k0Var.mView, arrayList9);
                        z4.w.a(viewGroup, new z(arrayList7, 2));
                    }
                }
                if (m2Var3.f1754a == q2.VISIBLE) {
                    arrayList6.addAll(arrayList7);
                    if (z13) {
                        h2Var.t(objH, rect);
                    }
                    if (k1.L(2)) {
                        objH.toString();
                        int size3 = arrayList7.size();
                        int i15 = 0;
                        while (i15 < size3) {
                            Object transitioningViews = arrayList7.get(i15);
                            i15++;
                            kotlin.jvm.internal.m.e(transitioningViews, "transitioningViews");
                            ((View) transitioningViews).toString();
                        }
                    }
                } else {
                    h2Var.s(view2, objH);
                    if (k1.L(2)) {
                        objH.toString();
                        int size4 = arrayList7.size();
                        int i16 = 0;
                        while (i16 < size4) {
                            Object transitioningViews2 = arrayList7.get(i16);
                            i16++;
                            kotlin.jvm.internal.m.e(transitioningViews2, "transitioningViews");
                            ((View) transitioningViews2).toString();
                        }
                    }
                }
                if (rVar.f1811c) {
                    objO = h2Var.o(objO, objH);
                    size2 = i14;
                    arrayList2 = arrayList8;
                    obj = obj6;
                    objO2 = obj7;
                } else {
                    objO2 = h2Var.o(obj7, objH);
                    size2 = i14;
                    arrayList2 = arrayList8;
                    obj = obj6;
                }
            }
        }
        Object objN = h2Var.n(objO, objO2, obj);
        if (k1.L(2)) {
            Objects.toString(objN);
            viewGroup.toString();
        }
        return new qy.l(arrayList6, objN);
    }

    public final boolean h() {
        ArrayList arrayList = this.f1788c;
        if (arrayList.isEmpty()) {
            return true;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            if (!((r) obj).f1737a.f1756c.mTransitioning) {
                return false;
            }
        }
        return true;
    }

    public final void i(ArrayList arrayList, ViewGroup viewGroup, fz.a aVar) {
        a2.a(4, arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f1794i;
        int size = arrayList3.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) arrayList3.get(i11);
            WeakHashMap weakHashMap = z4.s0.f58893a;
            arrayList2.add(z4.j0.f(view));
            z4.j0.n(view, null);
        }
        boolean zL = k1.L(2);
        ArrayList arrayList4 = this.f1793h;
        if (zL) {
            int size2 = arrayList4.size();
            int i12 = 0;
            while (i12 < size2) {
                Object sharedElementFirstOutViews = arrayList4.get(i12);
                i12++;
                kotlin.jvm.internal.m.e(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                View view2 = (View) sharedElementFirstOutViews;
                view2.toString();
                WeakHashMap weakHashMap2 = z4.s0.f58893a;
                z4.j0.f(view2);
            }
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object sharedElementLastInViews = arrayList3.get(i13);
                i13++;
                kotlin.jvm.internal.m.e(sharedElementLastInViews, "sharedElementLastInViews");
                View view3 = (View) sharedElementLastInViews;
                view3.toString();
                WeakHashMap weakHashMap3 = z4.s0.f58893a;
                z4.j0.f(view3);
            }
        }
        aVar.invoke();
        int size4 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i14 = 0; i14 < size4; i14++) {
            View view4 = (View) arrayList4.get(i14);
            WeakHashMap weakHashMap4 = z4.s0.f58893a;
            String strF = z4.j0.f(view4);
            arrayList5.add(strF);
            if (strF != null) {
                z4.j0.n(view4, null);
                String str = (String) this.f1795j.get(strF);
                for (int i15 = 0; i15 < size4; i15++) {
                    if (str.equals(arrayList2.get(i15))) {
                        z4.j0.n((View) arrayList3.get(i15), strF);
                        break;
                    }
                }
            }
        }
        z4.w.a(viewGroup, new g2(size4, arrayList3, arrayList2, arrayList4, arrayList5));
        a2.a(0, arrayList);
        this.f1791f.x(this.f1792g, arrayList4, arrayList3);
    }
}
