package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f1826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1831f;

    public s(ViewGroup container) {
        kotlin.jvm.internal.m.f(container, "container");
        this.f1826a = container;
        this.f1827b = new ArrayList();
        this.f1828c = new ArrayList();
    }

    public static void f(y.e eVar, View view) {
        WeakHashMap weakHashMap = z4.s0.f58893a;
        String strF = z4.j0.f(view);
        if (strF != null) {
            eVar.put(strF, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt.getVisibility() == 0) {
                    f(eVar, childAt);
                }
            }
        }
    }

    public static final s j(ViewGroup container, k1 fragmentManager) {
        kotlin.jvm.internal.m.f(container, "container");
        kotlin.jvm.internal.m.f(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.m.e(fragmentManager.K(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof s) {
            return (s) tag;
        }
        s sVar = new s(container);
        container.setTag(R.id.special_effects_controller_view_tag, sVar);
        return sVar;
    }

    public static boolean k(ArrayList arrayList) {
        boolean z11;
        Object obj;
        int size = arrayList.size();
        int i11 = 0;
        loop0: while (true) {
            z11 = true;
            while (true) {
                if (i11 >= size) {
                    break loop0;
                }
                Object obj2 = arrayList.get(i11);
                i11++;
                m2 m2Var = (m2) obj2;
                if (!m2Var.f1764k.isEmpty()) {
                    ArrayList arrayList2 = m2Var.f1764k;
                    if (arrayList2 != null && arrayList2.isEmpty()) {
                        break;
                    }
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    do {
                        if (i12 >= size2) {
                            break;
                        }
                        obj = arrayList2.get(i12);
                        i12++;
                    } while (((l2) obj).a());
                }
                z11 = false;
            }
        }
        if (z11) {
            ArrayList arrayList3 = new ArrayList();
            int size3 = arrayList.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList.get(i13);
                i13++;
                ry.m.d0(arrayList3, ((m2) obj3).f1764k);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(m2 operation) {
        kotlin.jvm.internal.m.f(operation, "operation");
        if (operation.f1762i) {
            q2 q2Var = operation.f1754a;
            View viewRequireView = operation.f1756c.requireView();
            kotlin.jvm.internal.m.e(viewRequireView, "operation.fragment.requireView()");
            q2Var.a(viewRequireView, this.f1826a);
            operation.f1762i = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x037f A[LOOP:18: B:120:0x037d->B:121:0x037f, LOOP_END] */
    public final void b(ArrayList arrayList, boolean z11) {
        Object obj;
        Object objPrevious;
        ArrayList arrayList2;
        q qVar;
        boolean z12;
        int size;
        int i11;
        ArrayList arrayList3;
        ArrayList arrayList4;
        m2 m2Var;
        m2 m2Var2;
        h2 h2Var;
        ArrayList arrayList5;
        ArrayList<String> sharedElementSourceNames;
        ArrayList<String> sharedElementTargetNames;
        qy.l lVar;
        int size2 = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                obj = null;
                break;
            }
            obj = arrayList.get(i13);
            i13++;
            m2 m2Var3 = (m2) obj;
            o2 o2Var = q2.Companion;
            View view = m2Var3.f1756c.mView;
            kotlin.jvm.internal.m.e(view, "operation.fragment.mView");
            o2Var.getClass();
            q2 q2VarA = o2.a(view);
            q2 q2Var = q2.VISIBLE;
            if (q2VarA == q2Var && m2Var3.f1754a != q2Var) {
                break;
            }
        }
        m2 m2Var4 = (m2) obj;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            m2 m2Var5 = (m2) objPrevious;
            o2 o2Var2 = q2.Companion;
            View view2 = m2Var5.f1756c.mView;
            kotlin.jvm.internal.m.e(view2, "operation.fragment.mView");
            o2Var2.getClass();
            q2 q2VarA2 = o2.a(view2);
            q2 q2Var2 = q2.VISIBLE;
            if (q2VarA2 != q2Var2 && m2Var5.f1754a == q2Var2) {
                break;
            }
        }
        m2 m2Var6 = (m2) objPrevious;
        if (k1.L(2)) {
            Objects.toString(m2Var4);
            Objects.toString(m2Var6);
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        k0 k0Var = ((m2) ry.m.z0(arrayList)).f1756c;
        int size3 = arrayList.size();
        int i14 = 0;
        while (i14 < size3) {
            Object obj2 = arrayList.get(i14);
            i14++;
            h0 h0Var = ((m2) obj2).f1756c.mAnimationInfo;
            h0 h0Var2 = k0Var.mAnimationInfo;
            h0Var.f1677b = h0Var2.f1677b;
            h0Var.f1678c = h0Var2.f1678c;
            h0Var.f1679d = h0Var2.f1679d;
            h0Var.f1680e = h0Var2.f1680e;
        }
        int size4 = arrayList.size();
        int i15 = 0;
        while (true) {
            int i16 = 1;
            if (i15 >= size4) {
                break;
            }
            Object obj3 = arrayList.get(i15);
            i15++;
            m2 m2Var7 = (m2) obj3;
            arrayList6.add(new g(m2Var7, z11));
            arrayList7.add(new r(m2Var7, z11, !z11 ? m2Var7 != m2Var6 : m2Var7 != m2Var4));
            m2Var7.f1757d.add(new k2(this, m2Var7, i16));
        }
        ArrayList arrayList8 = new ArrayList();
        int size5 = arrayList7.size();
        int i17 = 0;
        while (i17 < size5) {
            Object obj4 = arrayList7.get(i17);
            i17++;
            if (!((r) obj4).a()) {
                arrayList8.add(obj4);
            }
        }
        ArrayList arrayList9 = new ArrayList();
        int size6 = arrayList8.size();
        int i18 = 0;
        while (i18 < size6) {
            Object obj5 = arrayList8.get(i18);
            i18++;
            if (((r) obj5).b() != null) {
                arrayList9.add(obj5);
            }
        }
        int size7 = arrayList9.size();
        int i19 = 0;
        h2 h2Var2 = null;
        while (i19 < size7) {
            Object obj6 = arrayList9.get(i19);
            i19++;
            r rVar = (r) obj6;
            h2 h2VarB = rVar.b();
            if (h2Var2 != null && h2VarB != h2Var2) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + rVar.f1737a.f1756c + " returned Transition " + rVar.f1810b + " which uses a different Transition type than other Fragments.").toString());
            }
            h2Var2 = h2VarB;
        }
        if (h2Var2 == null) {
            arrayList2 = arrayList6;
            z12 = true;
        } else {
            ArrayList arrayList10 = new ArrayList();
            ArrayList arrayList11 = new ArrayList();
            y.e eVar = new y.e(0);
            ArrayList<String> arrayList12 = new ArrayList<>();
            ArrayList<String> arrayList13 = new ArrayList<>();
            y.e eVar2 = new y.e(0);
            ArrayList<String> arrayList14 = arrayList13;
            y.e eVar3 = new y.e(0);
            int size8 = arrayList9.size();
            loop10: while (true) {
                Object objY = null;
                while (true) {
                    if (i12 >= size8) {
                        ArrayList arrayList15 = arrayList10;
                        arrayList2 = arrayList6;
                        m2 m2Var8 = m2Var4;
                        m2 m2Var9 = m2Var6;
                        h2 h2Var3 = h2Var2;
                        ArrayList arrayList16 = arrayList11;
                        if (objY == null) {
                            if (!arrayList9.isEmpty()) {
                                int size9 = arrayList9.size();
                                int i21 = 0;
                                while (true) {
                                    if (i21 < size9) {
                                        Object obj7 = arrayList9.get(i21);
                                        i21++;
                                        if (((r) obj7).f1810b != null) {
                                            z12 = true;
                                            qVar = new q(arrayList9, m2Var8, m2Var9, h2Var3, objY, arrayList15, arrayList16, eVar, arrayList12, arrayList14, eVar2, eVar3, z11);
                                            size = arrayList9.size();
                                            i11 = 0;
                                            while (i11 < size) {
                                                Object obj8 = arrayList9.get(i11);
                                                i11++;
                                                ((r) obj8).f1737a.f1763j.add(qVar);
                                            }
                                            break loop10;
                                            break loop10;
                                        }
                                    }
                                }
                            }
                            z12 = true;
                            break loop10;
                        }
                        z12 = true;
                        qVar = new q(arrayList9, m2Var8, m2Var9, h2Var3, objY, arrayList15, arrayList16, eVar, arrayList12, arrayList14, eVar2, eVar3, z11);
                        size = arrayList9.size();
                        i11 = 0;
                        while (i11 < size) {
                            Object obj9 = arrayList9.get(i11);
                            i11++;
                            ((r) obj9).f1737a.f1763j.add(qVar);
                        }
                        break loop10;
                    }
                    Object obj10 = arrayList9.get(i12);
                    i12++;
                    Object obj11 = ((r) obj10).f1812d;
                    if (obj11 == null || m2Var4 == null) {
                        arrayList3 = arrayList10;
                    } else {
                        arrayList3 = arrayList10;
                        k0 k0Var2 = m2Var4.f1756c;
                        if (m2Var6 != null) {
                            k0 k0Var3 = m2Var6.f1756c;
                            objY = h2Var2.y(h2Var2.h(obj11));
                            sharedElementSourceNames = k0Var3.getSharedElementSourceNames();
                            arrayList4 = arrayList6;
                            kotlin.jvm.internal.m.e(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                            ArrayList<String> sharedElementSourceNames2 = k0Var2.getSharedElementSourceNames();
                            m2Var = m2Var4;
                            kotlin.jvm.internal.m.e(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                            ArrayList<String> sharedElementTargetNames2 = k0Var2.getSharedElementTargetNames();
                            m2Var2 = m2Var6;
                            kotlin.jvm.internal.m.e(sharedElementTargetNames2, "firstOut.fragment.sharedElementTargetNames");
                            int size10 = sharedElementTargetNames2.size();
                            h2Var = h2Var2;
                            arrayList5 = arrayList11;
                            int i22 = 0;
                            while (i22 < size10) {
                                int i23 = size10;
                                int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames2.get(i22));
                                if (iIndexOf != -1) {
                                    sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i22));
                                }
                                i22++;
                                size10 = i23;
                            }
                            sharedElementTargetNames = k0Var3.getSharedElementTargetNames();
                            kotlin.jvm.internal.m.e(sharedElementTargetNames, "lastIn.fragment.sharedElementTargetNames");
                            if (z11) {
                                k0Var2.getEnterTransitionCallback();
                                k0Var3.getExitTransitionCallback();
                                lVar = new qy.l(null, null);
                            } else {
                                k0Var2.getExitTransitionCallback();
                                k0Var3.getEnterTransitionCallback();
                                lVar = new qy.l(null, null);
                            }
                            if (lVar.f48495a != null) {
                                throw new ClassCastException();
                            }
                            if (lVar.f48496b != null) {
                                throw new ClassCastException();
                            }
                            int i24 = 0;
                            for (int size11 = sharedElementSourceNames.size(); i24 < size11; size11 = size11) {
                                String str = sharedElementSourceNames.get(i24);
                                kotlin.jvm.internal.m.e(str, "exitingNames[i]");
                                String str2 = sharedElementTargetNames.get(i24);
                                kotlin.jvm.internal.m.e(str2, "enteringNames[i]");
                                eVar.put(str, str2);
                                i24++;
                            }
                            if (k1.L(2)) {
                                int size12 = sharedElementTargetNames.size();
                                for (int i25 = 0; i25 < size12; i25++) {
                                    sharedElementTargetNames.get(i25);
                                }
                                int size13 = sharedElementSourceNames.size();
                                for (int i26 = 0; i26 < size13; i26++) {
                                    sharedElementSourceNames.get(i26);
                                }
                            }
                            View view3 = k0Var2.mView;
                            kotlin.jvm.internal.m.e(view3, "firstOut.fragment.mView");
                            f(eVar2, view3);
                            eVar2.m(sharedElementSourceNames);
                            eVar.m(eVar2.keySet());
                            View view4 = k0Var3.mView;
                            kotlin.jvm.internal.m.e(view4, "lastIn.fragment.mView");
                            f(eVar3, view4);
                            eVar3.m(sharedElementTargetNames);
                            eVar3.m(eVar.values());
                            f2 f2Var = a2.f1614a;
                            for (int i27 = eVar.f56767c - 1; -1 < i27; i27--) {
                                if (!eVar3.containsKey((String) eVar.j(i27))) {
                                    eVar.h(i27);
                                }
                            }
                            int i28 = 3;
                            ry.m.n0(eVar2.entrySet(), new a0.o0(eVar.keySet(), i28), false);
                            ry.m.n0(eVar3.entrySet(), new a0.o0(eVar.values(), i28), false);
                            if (eVar.isEmpty()) {
                                break;
                            }
                            arrayList12 = sharedElementTargetNames;
                            arrayList14 = sharedElementSourceNames;
                        }
                        arrayList10 = arrayList3;
                        arrayList6 = arrayList4;
                        m2Var4 = m2Var;
                        m2Var6 = m2Var2;
                        h2Var2 = h2Var;
                        arrayList11 = arrayList5;
                    }
                    arrayList4 = arrayList6;
                    m2Var = m2Var4;
                    m2Var2 = m2Var6;
                    h2Var = h2Var2;
                    arrayList5 = arrayList11;
                    arrayList10 = arrayList3;
                    arrayList6 = arrayList4;
                    m2Var4 = m2Var;
                    m2Var6 = m2Var2;
                    h2Var2 = h2Var;
                    arrayList11 = arrayList5;
                }
                Objects.toString(objY);
                m2Var.toString();
                m2Var2.toString();
                arrayList3.clear();
                arrayList5.clear();
                arrayList12 = sharedElementTargetNames;
                arrayList14 = sharedElementSourceNames;
                arrayList10 = arrayList3;
                arrayList6 = arrayList4;
                m2Var4 = m2Var;
                m2Var6 = m2Var2;
                h2Var2 = h2Var;
                arrayList11 = arrayList5;
            }
        }
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        int size14 = arrayList2.size();
        int i29 = 0;
        while (i29 < size14) {
            Object obj12 = arrayList2.get(i29);
            i29++;
            ry.m.d0(arrayList18, ((g) obj12).f1737a.f1764k);
        }
        ArrayList arrayList19 = arrayList2;
        boolean zIsEmpty = arrayList18.isEmpty();
        int size15 = arrayList19.size();
        int i30 = 0;
        boolean z13 = false;
        while (i30 < size15) {
            Object obj13 = arrayList19.get(i30);
            i30++;
            g gVar = (g) obj13;
            Context context = this.f1826a.getContext();
            m2 m2Var10 = gVar.f1737a;
            kotlin.jvm.internal.m.e(context, "context");
            q0 q0VarB = gVar.b(context);
            if (q0VarB != null) {
                if (((AnimatorSet) q0VarB.f1804b) == null) {
                    arrayList17.add(gVar);
                } else {
                    k0 k0Var4 = m2Var10.f1756c;
                    if (m2Var10.f1764k.isEmpty()) {
                        if (m2Var10.f1754a == q2.GONE) {
                            m2Var10.f1762i = false;
                        }
                        m2Var10.f1763j.add(new i(gVar));
                        z13 = z12;
                    } else if (k1.L(2)) {
                        Objects.toString(k0Var4);
                    }
                }
            }
        }
        int size16 = arrayList17.size();
        int i31 = 0;
        while (i31 < size16) {
            Object obj14 = arrayList17.get(i31);
            i31++;
            g gVar2 = (g) obj14;
            m2 m2Var11 = gVar2.f1737a;
            k0 k0Var5 = m2Var11.f1756c;
            if (zIsEmpty) {
                if (!z13) {
                    m2Var11.f1763j.add(new f(gVar2));
                } else if (k1.L(2)) {
                    Objects.toString(k0Var5);
                }
            } else if (k1.L(2)) {
                Objects.toString(k0Var5);
            }
        }
    }

    public final void c(List operations) {
        kotlin.jvm.internal.m.f(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            ry.m.d0(arrayList, ((m2) it.next()).f1764k);
        }
        List listA1 = ry.m.a1(ry.m.f1(arrayList));
        int size = listA1.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((l2) listA1.get(i11)).c(this.f1826a);
        }
        int size2 = operations.size();
        for (int i12 = 0; i12 < size2; i12++) {
            a((m2) operations.get(i12));
        }
        List listA2 = ry.m.a1(operations);
        int size3 = listA2.size();
        for (int i13 = 0; i13 < size3; i13++) {
            m2 m2Var = (m2) listA2.get(i13);
            if (m2Var.f1764k.isEmpty()) {
                m2Var.b();
            }
        }
    }

    public final void d(q2 q2Var, n2 n2Var, u1 u1Var) {
        synchronized (this.f1827b) {
            try {
                k0 k0Var = u1Var.f1846c;
                kotlin.jvm.internal.m.e(k0Var, "fragmentStateManager.fragment");
                m2 m2VarG = g(k0Var);
                if (m2VarG == null) {
                    k0 k0Var2 = u1Var.f1846c;
                    m2VarG = (k0Var2.mTransitioning || k0Var2.mRemoving) ? h(k0Var2) : null;
                }
                if (m2VarG != null) {
                    m2VarG.d(q2Var, n2Var);
                    return;
                }
                m2 m2Var = new m2(q2Var, n2Var, u1Var);
                this.f1827b.add(m2Var);
                m2Var.f1757d.add(new k2(this, m2Var, 0));
                m2Var.f1757d.add(new k2(this, m2Var, 2));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        boolean z11;
        if (this.f1831f) {
            return;
        }
        if (!this.f1826a.isAttachedToWindow()) {
            i();
            this.f1830e = false;
            return;
        }
        synchronized (this.f1827b) {
            try {
                ArrayList arrayListC1 = ry.m.c1(this.f1828c);
                this.f1828c.clear();
                int size = arrayListC1.size();
                int i11 = 0;
                while (true) {
                    z11 = true;
                    if (i11 >= size) {
                        break;
                    }
                    Object obj = arrayListC1.get(i11);
                    i11++;
                    m2 m2Var = (m2) obj;
                    if (this.f1827b.isEmpty() || !m2Var.f1756c.mTransitioning) {
                        z11 = false;
                    }
                    m2Var.f1760g = z11;
                }
                int size2 = arrayListC1.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayListC1.get(i12);
                    i12++;
                    m2 m2Var2 = (m2) obj2;
                    if (this.f1829d) {
                        if (k1.L(2)) {
                            Objects.toString(m2Var2);
                        }
                        m2Var2.b();
                    } else {
                        if (k1.L(2)) {
                            Objects.toString(m2Var2);
                        }
                        m2Var2.a(this.f1826a);
                    }
                    this.f1829d = false;
                    if (!m2Var2.f1759f) {
                        this.f1828c.add(m2Var2);
                    }
                }
                if (!this.f1827b.isEmpty()) {
                    n();
                    ArrayList arrayListC2 = ry.m.c1(this.f1827b);
                    if (arrayListC2.isEmpty()) {
                        return;
                    }
                    this.f1827b.clear();
                    this.f1828c.addAll(arrayListC2);
                    b(arrayListC2, this.f1830e);
                    boolean zK = k(arrayListC2);
                    int size3 = arrayListC2.size();
                    int i13 = 0;
                    boolean z12 = true;
                    while (i13 < size3) {
                        Object obj3 = arrayListC2.get(i13);
                        i13++;
                        if (!((m2) obj3).f1756c.mTransitioning) {
                            z12 = false;
                        }
                    }
                    if (!z12 || zK) {
                        z11 = false;
                    }
                    this.f1829d = z11;
                    if (!z12) {
                        m(arrayListC2);
                        c(arrayListC2);
                    } else if (zK) {
                        m(arrayListC2);
                        int size4 = arrayListC2.size();
                        for (int i14 = 0; i14 < size4; i14++) {
                            a((m2) arrayListC2.get(i14));
                        }
                    }
                    this.f1830e = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final m2 g(k0 k0Var) {
        Object obj;
        ArrayList arrayList = this.f1827b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            obj = arrayList.get(i11);
            i11++;
            m2 m2Var = (m2) obj;
            if (kotlin.jvm.internal.m.a(m2Var.f1756c, k0Var) && !m2Var.f1758e) {
                return (m2) obj;
            }
        }
        obj = null;
        return (m2) obj;
    }

    public final m2 h(k0 k0Var) {
        Object obj;
        ArrayList arrayList = this.f1828c;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            obj = arrayList.get(i11);
            i11++;
            m2 m2Var = (m2) obj;
            if (kotlin.jvm.internal.m.a(m2Var.f1756c, k0Var) && !m2Var.f1758e) {
                return (m2) obj;
            }
        }
        obj = null;
        return (m2) obj;
    }

    public final void i() {
        boolean zIsAttachedToWindow = this.f1826a.isAttachedToWindow();
        synchronized (this.f1827b) {
            try {
                n();
                m(this.f1827b);
                ArrayList arrayListC1 = ry.m.c1(this.f1828c);
                int size = arrayListC1.size();
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayListC1.get(i12);
                    i12++;
                    ((m2) obj).f1760g = false;
                }
                int size2 = arrayListC1.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayListC1.get(i13);
                    i13++;
                    m2 m2Var = (m2) obj2;
                    if (k1.L(2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.f1826a);
                        }
                        Objects.toString(m2Var);
                    }
                    m2Var.a(this.f1826a);
                }
                ArrayList arrayListC2 = ry.m.c1(this.f1827b);
                int size3 = arrayListC2.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj3 = arrayListC2.get(i14);
                    i14++;
                    ((m2) obj3).f1760g = false;
                }
                int size4 = arrayListC2.size();
                while (i11 < size4) {
                    Object obj4 = arrayListC2.get(i11);
                    i11++;
                    m2 m2Var2 = (m2) obj4;
                    if (k1.L(2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.f1826a);
                        }
                        Objects.toString(m2Var2);
                    }
                    m2Var2.a(this.f1826a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l() {
        Object objPrevious;
        synchronized (this.f1827b) {
            try {
                n();
                ArrayList arrayList = this.f1827b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    m2 m2Var = (m2) objPrevious;
                    o2 o2Var = q2.Companion;
                    View view = m2Var.f1756c.mView;
                    kotlin.jvm.internal.m.e(view, "operation.fragment.mView");
                    o2Var.getClass();
                    q2 q2VarA = o2.a(view);
                    q2 q2Var = m2Var.f1754a;
                    q2 q2Var2 = q2.VISIBLE;
                    if (q2Var == q2Var2 && q2VarA != q2Var2) {
                        break;
                    }
                }
                m2 m2Var2 = (m2) objPrevious;
                k0 k0Var = m2Var2 != null ? m2Var2.f1756c : null;
                this.f1831f = k0Var != null ? k0Var.isPostponed() : false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            m2 m2Var = (m2) list.get(i11);
            u1 u1Var = m2Var.f1765l;
            if (!m2Var.f1761h) {
                m2Var.f1761h = true;
                n2 n2Var = m2Var.f1755b;
                if (n2Var == n2.ADDING) {
                    k0 k0Var = u1Var.f1846c;
                    kotlin.jvm.internal.m.e(k0Var, "fragmentStateManager.fragment");
                    View viewFindFocus = k0Var.mView.findFocus();
                    if (viewFindFocus != null) {
                        k0Var.setFocusedView(viewFindFocus);
                        if (k1.L(2)) {
                            viewFindFocus.toString();
                            k0Var.toString();
                        }
                    }
                    View viewRequireView = m2Var.f1756c.requireView();
                    kotlin.jvm.internal.m.e(viewRequireView, "this.fragment.requireView()");
                    if (viewRequireView.getParent() == null) {
                        if (k1.L(2)) {
                            k0Var.toString();
                            viewRequireView.toString();
                        }
                        u1Var.a();
                        viewRequireView.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                    }
                    if (viewRequireView.getAlpha() == CropImageView.DEFAULT_ASPECT_RATIO && viewRequireView.getVisibility() == 0) {
                        if (k1.L(2)) {
                            viewRequireView.toString();
                        }
                        viewRequireView.setVisibility(4);
                    }
                    viewRequireView.setAlpha(k0Var.getPostOnViewCreatedAlpha());
                    if (k1.L(2)) {
                        k0Var.getPostOnViewCreatedAlpha();
                    }
                } else if (n2Var == n2.REMOVING) {
                    k0 k0Var2 = u1Var.f1846c;
                    kotlin.jvm.internal.m.e(k0Var2, "fragmentStateManager.fragment");
                    View viewRequireView2 = k0Var2.requireView();
                    kotlin.jvm.internal.m.e(viewRequireView2, "fragment.requireView()");
                    if (k1.L(2)) {
                        Objects.toString(viewRequireView2.findFocus());
                        viewRequireView2.toString();
                        k0Var2.toString();
                    }
                    viewRequireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ry.m.d0(arrayList, ((m2) it.next()).f1764k);
        }
        List listA1 = ry.m.a1(ry.m.f1(arrayList));
        int size2 = listA1.size();
        for (int i12 = 0; i12 < size2; i12++) {
            l2 l2Var = (l2) listA1.get(i12);
            l2Var.getClass();
            ViewGroup container = this.f1826a;
            kotlin.jvm.internal.m.f(container, "container");
            if (!l2Var.f1740a) {
                l2Var.e(container);
            }
            l2Var.f1740a = true;
        }
    }

    public final void n() {
        ArrayList arrayList = this.f1827b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            m2 m2Var = (m2) obj;
            if (m2Var.f1755b == n2.ADDING) {
                View viewRequireView = m2Var.f1756c.requireView();
                kotlin.jvm.internal.m.e(viewRequireView, "fragment.requireView()");
                o2 o2Var = q2.Companion;
                int visibility = viewRequireView.getVisibility();
                o2Var.getClass();
                m2Var.d(o2.b(visibility), n2.NONE);
            }
        }
    }
}
