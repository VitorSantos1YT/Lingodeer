package m9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import bt.o1;
import cf.x;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dt.p4;
import hh.p0;
import j3.i0;
import j9.a0;
import j9.c0;
import j9.d0;
import j9.j;
import j9.p;
import j9.q;
import j9.s;
import j9.v;
import j9.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import ko.Zea.ealNNtLp;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ns.o;
import nz.n;
import qy.l;
import ry.k;
import ry.r;
import uz.i1;
import uz.r0;
import uz.w0;
import uz.x0;
import y.u0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f41070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9.g f41071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f41072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f41073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle[] f41074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f41075f = new k();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i1 f41076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i1 f41077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r0 f41078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f41079j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f41080k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f41081l;
    public final LinkedHashMap m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LifecycleOwner f41082n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j f41083o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f41084p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Lifecycle.State f41085q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p4 f41086r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d0 f41087s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedHashMap f41088t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public fz.c f41089u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public o1 f41090v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f41091w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f41092x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f41093y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final w0 f41094z;

    public g(v vVar, j9.g gVar) {
        this.f41070a = vVar;
        this.f41071b = gVar;
        r rVar = r.f50854a;
        this.f41076g = x0.c(rVar);
        i1 i1VarC = x0.c(rVar);
        this.f41077h = i1VarC;
        this.f41078i = new r0(i1VarC);
        this.f41079j = new LinkedHashMap();
        this.f41080k = new LinkedHashMap();
        this.f41081l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.f41084p = new ArrayList();
        this.f41085q = Lifecycle.State.INITIALIZED;
        this.f41086r = new p4(this, 4);
        this.f41087s = new d0();
        this.f41088t = new LinkedHashMap();
        this.f41091w = new LinkedHashMap();
        this.f41093y = new ArrayList();
        this.f41094z = x0.b(0, 2, tz.a.DROP_OLDEST);
    }

    public static q e(int i11, q qVar, q qVar2, boolean z11) {
        if (qVar.f36242b.f3958a == i11 && (qVar2 == null || (qVar.equals(qVar2) && m.a(qVar.f36243c, qVar2.f36243c)))) {
            return qVar;
        }
        s sVar = qVar instanceof s ? (s) qVar : null;
        if (sVar == null) {
            sVar = qVar.f36243c;
            m.c(sVar);
        }
        return sVar.f36251f.x(i11, sVar, qVar2, z11);
    }

    public static /* synthetic */ void p(g gVar, j9.e eVar) {
        gVar.o(eVar, false, new k());
    }

    public final void a(q qVar, Bundle bundle, j9.e eVar, List list) {
        Object objPrevious;
        Object objPrevious2;
        e eVar2 = this.f41070a.f36258c;
        q qVar2 = eVar.f36188b;
        boolean z11 = qVar2 instanceof j9.c;
        k kVar = this.f41075f;
        if (!z11) {
            while (!kVar.isEmpty() && (((j9.e) kVar.last()).f36188b instanceof j9.c) && n(((j9.e) kVar.last()).f36188b.f36242b.f3958a, true, false)) {
            }
        }
        k<j9.e> kVar2 = new k();
        Object obj = null;
        if (qVar instanceof s) {
            q qVar3 = qVar2;
            do {
                m.c(qVar3);
                qVar3 = qVar3.f36243c;
                if (qVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        }
                        objPrevious2 = listIterator.previous();
                    } while (!m.a(((j9.e) objPrevious2).f36188b, qVar3));
                    j9.e eVarA = (j9.e) objPrevious2;
                    if (eVarA == null) {
                        eVarA = j9.d.a(eVar2, qVar3, bundle, i(), this.f41083o);
                    }
                    kVar2.addFirst(eVarA);
                    if (!kVar.isEmpty() && ((j9.e) kVar.last()).f36188b == qVar3) {
                        p(this, (j9.e) kVar.last());
                    }
                }
                if (qVar3 == null) {
                    break;
                }
            } while (qVar3 != qVar);
        }
        q qVar4 = kVar2.isEmpty() ? qVar2 : ((j9.e) kVar2.first()).f36188b;
        while (qVar4 != null && d(qVar4.f36242b.f3958a, qVar4) != qVar4) {
            qVar4 = qVar4.f36243c;
            if (qVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!m.a(((j9.e) objPrevious).f36188b, qVar4));
                j9.e eVarA2 = (j9.e) objPrevious;
                if (eVarA2 == null) {
                    eVarA2 = j9.d.a(eVar2, qVar4, qVar4.b(bundle2), i(), this.f41083o);
                }
                kVar2.addFirst(eVarA2);
            }
        }
        if (!kVar2.isEmpty()) {
            qVar2 = ((j9.e) kVar2.first()).f36188b;
        }
        while (!kVar.isEmpty() && (((j9.e) kVar.last()).f36188b instanceof s)) {
            q qVar5 = ((j9.e) kVar.last()).f36188b;
            m.d(qVar5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((u0) ((s) qVar5).f36251f.f7d).d(qVar2.f36242b.f3958a) != null) {
                break;
            } else {
                p(this, (j9.e) kVar.last());
            }
        }
        j9.e eVar3 = (j9.e) kVar.g();
        if (eVar3 == null) {
            eVar3 = (j9.e) kVar2.g();
        }
        if (!m.a(eVar3 != null ? eVar3.f36188b : null, this.f41072c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                Object objPrevious3 = listIterator3.previous();
                q qVar6 = ((j9.e) objPrevious3).f36188b;
                s sVar = this.f41072c;
                m.c(sVar);
                if (m.a(qVar6, sVar)) {
                    obj = objPrevious3;
                    break;
                }
            }
            j9.e eVarA3 = (j9.e) obj;
            if (eVarA3 == null) {
                s sVar2 = this.f41072c;
                m.c(sVar2);
                s sVar3 = this.f41072c;
                m.c(sVar3);
                eVarA3 = j9.d.a(eVar2, sVar2, sVar3.b(bundle), i(), this.f41083o);
            }
            kVar2.addFirst(eVarA3);
        }
        for (j9.e eVar4 : kVar2) {
            Object obj2 = this.f41088t.get(this.f41087s.b(eVar4.f36188b.f36241a));
            if (obj2 == null) {
                throw new IllegalStateException(ep.a.k(new StringBuilder("NavigatorBackStack for "), qVar.f36241a, " should already be created").toString());
            }
            ((j9.i) obj2).a(eVar4);
        }
        kVar.addAll(kVar2);
        kVar.addLast(eVar);
        ArrayList arrayListG0 = ry.m.G0(eVar, kVar2);
        int size = arrayListG0.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj3 = arrayListG0.get(i11);
            i11++;
            j9.e eVar5 = (j9.e) obj3;
            s sVar4 = eVar5.f36188b.f36243c;
            if (sVar4 != null) {
                k(eVar5, f(sVar4.f36242b.f3958a));
            }
        }
    }

    public final boolean b() {
        k kVar;
        while (true) {
            kVar = this.f41075f;
            if (kVar.isEmpty() || !(((j9.e) kVar.last()).f36188b instanceof s)) {
                break;
            }
            p(this, (j9.e) kVar.last());
        }
        j9.e eVar = (j9.e) kVar.j();
        ArrayList arrayList = this.f41093y;
        if (eVar != null) {
            arrayList.add(eVar);
        }
        this.f41092x++;
        t();
        int i11 = this.f41092x - 1;
        this.f41092x = i11;
        if (i11 == 0) {
            ArrayList arrayListC1 = ry.m.c1(arrayList);
            arrayList.clear();
            int size = arrayListC1.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayListC1.get(i12);
                i12++;
                j9.e eVar2 = (j9.e) obj;
                for (gr.r rVar : ry.m.a1(this.f41084p)) {
                    q qVar = eVar2.f36188b;
                    eVar2.H.a();
                    rVar.a(this.f41070a, qVar);
                }
                this.f41094z.d(eVar2);
            }
            ArrayList arrayListC2 = ry.m.c1(kVar);
            i1 i1Var = this.f41076g;
            i1Var.getClass();
            i1Var.l(null, arrayListC2);
            ArrayList arrayListQ = q();
            i1 i1Var2 = this.f41077h;
            i1Var2.getClass();
            i1Var2.l(null, arrayListQ);
        }
        return eVar != null;
    }

    public final boolean c(ArrayList arrayList, q qVar, boolean z11, boolean z12) {
        g gVar;
        boolean z13;
        u uVar = new u();
        k kVar = new k();
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                gVar = this;
                z13 = z12;
                break;
            }
            int i12 = i11 + 1;
            c0 navigator = (c0) arrayList.get(i11);
            u uVar2 = new u();
            j9.e popUpTo = (j9.e) this.f41075f.last();
            gVar = this;
            z13 = z12;
            o1 o1Var = new o1(uVar2, uVar, gVar, z13, kVar);
            m.f(navigator, "navigator");
            m.f(popUpTo, "popUpTo");
            gVar.f41090v = o1Var;
            navigator.e(popUpTo, z13);
            gVar.f41090v = null;
            if (!uVar2.f38357a) {
                break;
            }
            z12 = z13;
            i11 = i12;
        }
        if (z13) {
            LinkedHashMap linkedHashMap = gVar.f41081l;
            if (!z11) {
                final int i13 = 0;
                nz.g gVar2 = new nz.g(new nz.c(n.U(qVar, new lt.d(8)), new fz.c(this) { // from class: m9.f

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f41069b;

                    {
                        this.f41069b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        boolean zContainsKey;
                        q destination = (q) obj;
                        switch (i13) {
                            case 0:
                                m.f(destination, "destination");
                                zContainsKey = this.f41069b.f41081l.containsKey(Integer.valueOf(destination.f36242b.f3958a));
                                break;
                            default:
                                m.f(destination, "destination");
                                zContainsKey = this.f41069b.f41081l.containsKey(Integer.valueOf(destination.f36242b.f3958a));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, 2), (byte) 0);
                while (gVar2.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((q) gVar2.next()).f36242b.f3958a);
                    j9.f fVar = (j9.f) kVar.g();
                    linkedHashMap.put(numValueOf, fVar != null ? fVar.f36196a.f41063a : null);
                }
            }
            if (!kVar.isEmpty()) {
                d dVar = ((j9.f) kVar.first()).f36196a;
                final int i14 = 1;
                nz.g gVar3 = new nz.g(new nz.c(n.U(d(dVar.f41064b, null), new lt.d(9)), new fz.c(this) { // from class: m9.f

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f41069b;

                    {
                        this.f41069b = this;
                    }

                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        boolean zContainsKey;
                        q destination = (q) obj;
                        switch (i14) {
                            case 0:
                                m.f(destination, "destination");
                                zContainsKey = this.f41069b.f41081l.containsKey(Integer.valueOf(destination.f36242b.f3958a));
                                break;
                            default:
                                m.f(destination, "destination");
                                zContainsKey = this.f41069b.f41081l.containsKey(Integer.valueOf(destination.f36242b.f3958a));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, 2), (byte) 0);
                while (gVar3.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((q) gVar3.next()).f36242b.f3958a), dVar.f41063a);
                }
                if (linkedHashMap.values().contains(dVar.f41063a)) {
                    gVar.m.put(dVar.f41063a, kVar);
                }
            }
        }
        gVar.f41071b.invoke();
        return uVar.f38357a;
    }

    public final q d(int i11, q qVar) {
        q qVar2;
        s sVar = this.f41072c;
        if (sVar == null) {
            return null;
        }
        if (sVar.f36242b.f3958a == i11) {
            if (qVar == null) {
                return sVar;
            }
            if (m.a(sVar, qVar) && qVar.f36243c == null) {
                return this.f41072c;
            }
        }
        j9.e eVar = (j9.e) this.f41075f.j();
        if (eVar == null || (qVar2 = eVar.f36188b) == null) {
            qVar2 = this.f41072c;
            m.c(qVar2);
        }
        return e(i11, qVar2, qVar, false);
    }

    public final j9.e f(int i11) {
        Object objPrevious;
        k kVar = this.f41075f;
        ListIterator<E> listIterator = kVar.listIterator(kVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((j9.e) objPrevious).f36188b.f36242b.f3958a != i11);
        j9.e eVar = (j9.e) objPrevious;
        if (eVar != null) {
            return eVar;
        }
        StringBuilder sbI = w4.c.i(i11, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbI.append(g());
        throw new IllegalArgumentException(sbI.toString().toString());
    }

    public final q g() {
        j9.e eVar = (j9.e) this.f41075f.j();
        if (eVar != null) {
            return eVar.f36188b;
        }
        return null;
    }

    public final Lifecycle.State i() {
        return this.f41082n == null ? Lifecycle.State.CREATED : this.f41085q;
    }

    public final s j() {
        q qVar;
        j9.e eVar = (j9.e) this.f41075f.j();
        if (eVar == null || (qVar = eVar.f36188b) == null) {
            qVar = this.f41072c;
            m.c(qVar);
        }
        s sVar = qVar instanceof s ? (s) qVar : null;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = qVar.f36243c;
        m.c(sVar2);
        return sVar2;
    }

    public final void k(j9.e eVar, j9.e eVar2) {
        this.f41079j.put(eVar, eVar2);
        LinkedHashMap linkedHashMap = this.f41080k;
        if (linkedHashMap.get(eVar2) == null) {
            linkedHashMap.put(eVar2, new a());
        }
        Object obj = linkedHashMap.get(eVar2);
        m.c(obj);
        ((a) obj).f41049a.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0205 A[LOOP:6: B:99:0x01fd->B:101:0x0205, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:105:0x0268  */
    /* JADX WARN: Code duplicated, block: B:107:0x0274  */
    /* JADX WARN: Code duplicated, block: B:112:0x028f  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d7 A[Catch: all -> 0x02ec, TryCatch #0 {all -> 0x02ec, blocks: (B:120:0x02bb, B:121:0x02d1, B:123:0x02d7, B:125:0x02e7, B:129:0x02ef), top: B:152:0x02bb }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0302  */
    /* JADX WARN: Code duplicated, block: B:152:0x02bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x027f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x02e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:? A[LOOP:9: B:121:0x02d1->B:177:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0123  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f8  */
    public final void l(q node, Bundle bundle, y yVar) {
        boolean zN;
        boolean z11;
        boolean z12;
        int iNextIndex;
        q qVar;
        k<j9.e> kVar;
        c0 c0VarB;
        q qVar2;
        j9.i iVarB;
        ListIterator listIterator;
        int iNextIndex2;
        s sVar;
        Object objPrevious;
        boolean z13;
        m.f(node, "node");
        Iterator it = this.f41088t.values().iterator();
        while (it.hasNext()) {
            ((j9.i) it.next()).f36205d = true;
        }
        u uVar = new u();
        if (yVar == null) {
            zN = false;
        } else {
            String route = yVar.f36276h;
            if (route != null) {
                boolean z14 = yVar.f36272d;
                boolean z15 = yVar.f36273e;
                m.f(route, "route");
                k kVar2 = this.f41075f;
                if (kVar2.isEmpty()) {
                    zN = false;
                } else {
                    ArrayList arrayList = new ArrayList();
                    ListIterator listIterator2 = kVar2.listIterator(kVar2.b());
                    do {
                        if (!listIterator2.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator2.previous();
                        j9.e eVar = (j9.e) objPrevious;
                        q qVar3 = eVar.f36188b;
                        Bundle bundleA = eVar.H.a();
                        qVar3.getClass();
                        b7.c cVar = qVar3.f36242b;
                        cVar.getClass();
                        if (m.a((String) cVar.f3962e, route)) {
                            z13 = true;
                        } else {
                            p pVarC = cVar.c(route);
                            if (((q) cVar.f3959b).equals(pVarC != null ? pVarC.f36235a : null)) {
                                if (bundleA != null) {
                                    Bundle bundle2 = pVarC.f36236b;
                                    if (bundle2 != null) {
                                        Set<String> setKeySet = bundle2.keySet();
                                        m.e(setKeySet, "keySet(...)");
                                        Iterator<T> it2 = setKeySet.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                String str = (String) it2.next();
                                                m.c(str);
                                                if (bundleA.containsKey(str)) {
                                                    if (pVarC.f36235a.d().get(str) != null) {
                                                        throw new ClassCastException();
                                                    }
                                                }
                                            } else {
                                                z13 = true;
                                            }
                                        }
                                    }
                                } else {
                                    pVarC.getClass();
                                }
                            }
                            z13 = false;
                        }
                        if (z14 || !z13) {
                            arrayList.add(this.f41087s.b(eVar.f36188b.f36241a));
                        }
                    } while (!z13);
                    j9.e eVar2 = (j9.e) objPrevious;
                    q qVar4 = eVar2 != null ? eVar2.f36188b : null;
                    if (qVar4 == null) {
                        String message = "Ignoring popBackStack to route " + route + " as it was not found on the current back stack";
                        m.f(message, "message");
                        zN = false;
                    } else {
                        zN = c(arrayList, qVar4, z14, z15);
                    }
                }
            } else {
                int i11 = yVar.f36271c;
                if (i11 != -1) {
                    zN = n(i11, yVar.f36272d, yVar.f36273e);
                } else {
                    zN = false;
                }
            }
        }
        Bundle bundleB = node.b(bundle);
        if (yVar != null && yVar.f36270b && this.f41081l.containsKey(Integer.valueOf(node.f36242b.f3958a))) {
            uVar.f38357a = r(node.f36242b.f3958a, bundleB, yVar);
            z12 = false;
        } else {
            if (yVar == null || !yVar.f36269a) {
                z11 = false;
            } else {
                j9.e eVar3 = (j9.e) this.f41075f.j();
                k kVar3 = this.f41075f;
                ListIterator listIterator3 = kVar3.listIterator(kVar3.b());
                while (true) {
                    if (listIterator3.hasPrevious()) {
                        if (((j9.e) listIterator3.previous()).f36188b == node) {
                            iNextIndex = listIterator3.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex == -1) {
                    z11 = false;
                } else if (node instanceof s) {
                    int i12 = s.f36250t;
                    List listZ = n.Z(n.W(n.U((s) node, new i0(29)), new lt.d(10)));
                    if (this.f41075f.f50852c - iNextIndex == listZ.size()) {
                        k kVar4 = this.f41075f;
                        List listSubList = kVar4.subList(iNextIndex, kVar4.f50852c);
                        ArrayList arrayList2 = new ArrayList(ry.n.W(listSubList, 10));
                        Iterator it3 = listSubList.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(Integer.valueOf(((j9.e) it3.next()).f36188b.f36242b.f3958a));
                        }
                        if (arrayList2.equals(listZ)) {
                            kVar = new k();
                            while (o.A(this.f41075f) >= iNextIndex) {
                                j9.e eVar4 = (j9.e) ry.m.M0(this.f41075f);
                                s(eVar4);
                                j9.e eVar5 = new j9.e(eVar4.f36187a, eVar4.f36188b, eVar4.f36188b.b(bundle), eVar4.f36190d, eVar4.f36191e, eVar4.f36192f, eVar4.f36193t);
                                c cVar2 = eVar5.H;
                                Lifecycle.State state = eVar4.f36190d;
                                cVar2.getClass();
                                m.f(state, "<set-?>");
                                cVar2.f41054d = state;
                                c cVar3 = eVar5.H;
                                Lifecycle.State maxState = eVar4.H.f41061k;
                                cVar3.getClass();
                                m.f(maxState, "maxState");
                                cVar3.f41061k = maxState;
                                cVar3.b();
                                kVar.addFirst(eVar5);
                            }
                            for (j9.e eVar6 : kVar) {
                                sVar = eVar6.f36188b.f36243c;
                                if (sVar != null) {
                                    k(eVar6, f(sVar.f36242b.f3958a));
                                }
                                this.f41075f.addLast(eVar6);
                            }
                            for (j9.e eVar7 : kVar) {
                                c0VarB = this.f41087s.b(eVar7.f36188b.f36241a);
                                qVar2 = eVar7.f36188b;
                                if (qVar2 == null) {
                                    qVar2 = null;
                                }
                                if (qVar2 == null) {
                                    com.bumptech.glide.d.w(new a0(0));
                                    c0VarB.c(qVar2);
                                    iVarB = c0VarB.b();
                                    synchronized (iVarB.f36202a) {
                                        try {
                                            ArrayList arrayListC1 = ry.m.c1((Collection) iVarB.f36206e.f53391a.getValue());
                                            listIterator = arrayListC1.listIterator(arrayListC1.size());
                                            while (true) {
                                                if (listIterator.hasPrevious()) {
                                                    if (m.a(((j9.e) listIterator.previous()).f36192f, eVar7.f36192f)) {
                                                        iNextIndex2 = listIterator.nextIndex();
                                                        break;
                                                    }
                                                } else {
                                                    iNextIndex2 = -1;
                                                    break;
                                                }
                                            }
                                            arrayListC1.set(iNextIndex2, eVar7);
                                            i1 i1Var = iVarB.f36203b;
                                            i1Var.getClass();
                                            i1Var.l(null, arrayListC1);
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            }
                            z11 = true;
                        }
                    }
                    z11 = false;
                } else if (eVar3 == null || (qVar = eVar3.f36188b) == null || node.f36242b.f3958a != qVar.f36242b.f3958a) {
                    z11 = false;
                } else {
                    kVar = new k();
                    while (o.A(this.f41075f) >= iNextIndex) {
                        j9.e eVar8 = (j9.e) ry.m.M0(this.f41075f);
                        s(eVar8);
                        j9.e eVar9 = new j9.e(eVar8.f36187a, eVar8.f36188b, eVar8.f36188b.b(bundle), eVar8.f36190d, eVar8.f36191e, eVar8.f36192f, eVar8.f36193t);
                        c cVar4 = eVar9.H;
                        Lifecycle.State state2 = eVar8.f36190d;
                        cVar4.getClass();
                        m.f(state2, "<set-?>");
                        cVar4.f41054d = state2;
                        c cVar5 = eVar9.H;
                        Lifecycle.State maxState2 = eVar8.H.f41061k;
                        cVar5.getClass();
                        m.f(maxState2, "maxState");
                        cVar5.f41061k = maxState2;
                        cVar5.b();
                        kVar.addFirst(eVar9);
                    }
                    while (r7.hasNext()) {
                        sVar = eVar6.f36188b.f36243c;
                        if (sVar != null) {
                            k(eVar6, f(sVar.f36242b.f3958a));
                        }
                        this.f41075f.addLast(eVar6);
                    }
                    while (r6.hasNext()) {
                        c0VarB = this.f41087s.b(eVar7.f36188b.f36241a);
                        qVar2 = eVar7.f36188b;
                        if (qVar2 == null) {
                            qVar2 = null;
                        }
                        if (qVar2 == null) {
                            com.bumptech.glide.d.w(new a0(0));
                            c0VarB.c(qVar2);
                            iVarB = c0VarB.b();
                            synchronized (iVarB.f36202a) {
                                ArrayList arrayListC2 = ry.m.c1((Collection) iVarB.f36206e.f53391a.getValue());
                                listIterator = arrayListC2.listIterator(arrayListC2.size());
                                while (true) {
                                    if (listIterator.hasPrevious()) {
                                        if (m.a(((j9.e) listIterator.previous()).f36192f, eVar7.f36192f)) {
                                            iNextIndex2 = listIterator.nextIndex();
                                            break;
                                        }
                                    } else {
                                        iNextIndex2 = -1;
                                        break;
                                    }
                                }
                                arrayListC2.set(iNextIndex2, eVar7);
                                i1 i1Var2 = iVarB.f36203b;
                                i1Var2.getClass();
                                i1Var2.l(null, arrayListC2);
                            }
                        }
                    }
                    z11 = true;
                }
            }
            if (!z11) {
                j9.e eVarA = j9.d.a(this.f41070a.f36258c, node, bundleB, i(), this.f41083o);
                c0 c0VarB2 = this.f41087s.b(node.f36241a);
                List listK = o.K(eVarA);
                this.f41089u = new b0.a(uVar, this, node, bundleB);
                c0VarB2.d(listK, yVar);
                this.f41089u = null;
            }
            z12 = z11;
        }
        this.f41071b.invoke();
        Iterator it4 = this.f41088t.values().iterator();
        while (it4.hasNext()) {
            ((j9.i) it4.next()).f36205d = false;
        }
        if (zN || uVar.f38357a || z12) {
            b();
        } else {
            t();
        }
    }

    public final boolean n(int i11, boolean z11, boolean z12) {
        q qVar;
        b7.c cVar;
        k kVar = this.f41075f;
        if (kVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ry.m.O0(kVar).iterator();
        do {
            if (!it.hasNext()) {
                qVar = null;
                break;
            }
            qVar = ((j9.e) it.next()).f36188b;
            String str = qVar.f36241a;
            cVar = qVar.f36242b;
            c0 c0VarB = this.f41087s.b(str);
            if (z11 || cVar.f3958a != i11) {
                arrayList.add(c0VarB);
            }
        } while (cVar.f3958a != i11);
        if (qVar != null) {
            return c(arrayList, qVar, z11, z12);
        }
        int i12 = q.f36240e;
        String message = "Ignoring popBackStack to destination " + x.m(this.f41070a.f36258c, i11) + " as it was not found on the current back stack";
        m.f(message, "message");
        return false;
    }

    public final void o(j9.e popUpTo, boolean z11, k kVar) {
        j jVar;
        r0 r0Var;
        Set set;
        m.f(popUpTo, "popUpTo");
        k kVar2 = this.f41075f;
        j9.e eVar = (j9.e) kVar2.last();
        if (!m.a(eVar, popUpTo)) {
            throw new IllegalStateException(("Attempted to pop " + popUpTo.f36188b + ", which is not the top of the back stack (" + eVar.f36188b + ')').toString());
        }
        ry.m.M0(kVar2);
        j9.i iVar = (j9.i) this.f41088t.get(this.f41087s.b(eVar.f36188b.f36241a));
        boolean z12 = true;
        if ((iVar == null || (r0Var = iVar.f36207f) == null || (set = (Set) r0Var.f53391a.getValue()) == null || !set.contains(eVar)) && !this.f41080k.containsKey(eVar)) {
            z12 = false;
        }
        Lifecycle.State currentState = eVar.H.f41060j.getCurrentState();
        Lifecycle.State state = Lifecycle.State.CREATED;
        if (currentState.isAtLeast(state)) {
            if (z11) {
                eVar.a(state);
                kVar.addFirst(new j9.f(eVar));
            }
            if (z12) {
                eVar.a(state);
            } else {
                eVar.a(Lifecycle.State.DESTROYED);
                s(eVar);
            }
        }
        if (z11 || z12 || (jVar = this.f41083o) == null) {
            return;
        }
        String backStackEntryId = eVar.f36192f;
        m.f(backStackEntryId, "backStackEntryId");
        ViewModelStore viewModelStore = (ViewModelStore) jVar.f36210a.remove(backStackEntryId);
        if (viewModelStore != null) {
            viewModelStore.clear();
        }
    }

    public final ArrayList q() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f41088t.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((j9.i) it.next()).f36207f.f53391a.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                j9.e eVar = (j9.e) obj;
                if (!arrayList.contains(eVar) && !eVar.H.f41061k.isAtLeast(Lifecycle.State.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            ry.m.d0(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f41075f) {
            j9.e eVar2 = (j9.e) obj2;
            if (!arrayList.contains(eVar2) && eVar2.H.f41061k.isAtLeast(Lifecycle.State.STARTED)) {
                arrayList3.add(obj2);
            }
        }
        ry.m.d0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj3 = arrayList.get(i11);
            i11++;
            if (!(((j9.e) obj3).f36188b instanceof s)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final boolean r(int i11, Bundle bundle, y yVar) {
        q qVarH;
        j9.e eVar;
        q qVar;
        Bundle bundle2;
        Integer numValueOf = Integer.valueOf(i11);
        LinkedHashMap linkedHashMap = this.f41081l;
        int i12 = 0;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i11));
        Collection collectionValues = linkedHashMap.values();
        m.f(collectionValues, "<this>");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (m.a((String) it.next(), str)) {
                it.remove();
            }
        }
        k<j9.f> kVar = (k) kotlin.jvm.internal.c0.c(this.m).remove(str);
        e context = this.f41070a.f36258c;
        ArrayList arrayList = new ArrayList();
        j9.e eVar2 = (j9.e) this.f41075f.j();
        if (eVar2 == null || (qVarH = eVar2.f36188b) == null) {
            qVarH = h();
        }
        if (kVar != null) {
            for (j9.f fVar : kVar) {
                d dVar = fVar.f36196a;
                d dVar2 = fVar.f36196a;
                q qVarE = e(dVar.f41064b, qVarH, null, true);
                if (qVarE == null) {
                    int i13 = q.f36240e;
                    throw new IllegalStateException(("Restore State failed: destination " + x.m(context, dVar2.f41064b) + " cannot be found from the current destination " + qVarH).toString());
                }
                Lifecycle.State hostLifecycleState = i();
                j jVar = this.f41083o;
                m.f(context, "context");
                m.f(hostLifecycleState, "hostLifecycleState");
                Bundle bundle3 = dVar2.f41065c;
                if (bundle3 != null) {
                    Context context2 = context.f41067a;
                    bundle3.setClassLoader(context2 != null ? context2.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                String id2 = dVar2.f41063a;
                Bundle bundle4 = dVar2.f41066d;
                m.f(id2, "id");
                arrayList.add(new j9.e(context, qVarE, bundle2, hostLifecycleState, jVar, id2, bundle4));
                qVarH = qVarE;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            if (!(((j9.e) obj).f36188b instanceof s)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i15 = 0;
        while (i15 < size2) {
            Object obj2 = arrayList3.get(i15);
            i15++;
            j9.e eVar3 = (j9.e) obj2;
            List list = (List) ry.m.A0(arrayList2);
            if (m.a((list == null || (eVar = (j9.e) ry.m.z0(list)) == null || (qVar = eVar.f36188b) == null) ? null : qVar.f36241a, eVar3.f36188b.f36241a)) {
                list.add(eVar3);
            } else {
                arrayList2.add(o.M(eVar3));
            }
        }
        u uVar = new u();
        int size3 = arrayList2.size();
        while (i12 < size3) {
            Object obj3 = arrayList2.get(i12);
            i12++;
            List list2 = (List) obj3;
            c0 c0VarB = this.f41087s.b(((j9.e) ry.m.q0(list2)).f36188b.f36241a);
            ArrayList arrayList4 = arrayList;
            this.f41089u = new b1.a(uVar, arrayList4, new w(), this, bundle, 15);
            c0VarB.d(list2, yVar);
            this.f41089u = null;
            arrayList = arrayList4;
        }
        return uVar.f38357a;
    }

    public final void s(j9.e child) {
        m.f(child, "child");
        j9.e eVar = (j9.e) this.f41079j.remove(child);
        if (eVar == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f41080k;
        a aVar = (a) linkedHashMap.get(eVar);
        Integer numValueOf = aVar != null ? Integer.valueOf(aVar.f41049a.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            j9.i iVar = (j9.i) this.f41088t.get(this.f41087s.b(eVar.f36188b.f36241a));
            if (iVar != null) {
                iVar.c(eVar);
            }
            linkedHashMap.remove(eVar);
        }
    }

    public final void t() {
        a aVar;
        r0 r0Var;
        Set set;
        ArrayList arrayListC1 = ry.m.c1(this.f41075f);
        if (arrayListC1.isEmpty()) {
            return;
        }
        ArrayList arrayListM = o.M(((j9.e) ry.m.z0(arrayListC1)).f36188b);
        ArrayList arrayList = new ArrayList();
        if (ry.m.z0(arrayListM) instanceof j9.c) {
            Iterator it = ry.m.O0(arrayListC1).iterator();
            while (it.hasNext()) {
                q qVar = ((j9.e) it.next()).f36188b;
                arrayList.add(qVar);
                if (!(qVar instanceof j9.c) && !(qVar instanceof s)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (j9.e eVar : ry.m.O0(arrayListC1)) {
            Lifecycle.State state = eVar.H.f41061k;
            q qVar2 = eVar.f36188b;
            q qVar3 = (q) ry.m.s0(arrayListM);
            if (qVar3 != null && qVar3.f36242b.f3958a == qVar2.f36242b.f3958a) {
                Lifecycle.State state2 = Lifecycle.State.RESUMED;
                if (state != state2) {
                    j9.i iVar = (j9.i) this.f41088t.get(this.f41087s.b(eVar.f36188b.f36241a));
                    if (m.a((iVar == null || (r0Var = iVar.f36207f) == null || (set = (Set) r0Var.f53391a.getValue()) == null) ? null : Boolean.valueOf(set.contains(eVar)), Boolean.TRUE) || ((aVar = (a) this.f41080k.get(eVar)) != null && aVar.f41049a.get() == 0)) {
                        map.put(eVar, Lifecycle.State.STARTED);
                    } else {
                        map.put(eVar, state2);
                    }
                }
                q qVar4 = (q) ry.m.s0(arrayList);
                if (qVar4 != null && qVar4.f36242b.f3958a == qVar2.f36242b.f3958a) {
                    ry.m.L0(arrayList);
                }
                ry.m.L0(arrayListM);
                s sVar = qVar2.f36243c;
                if (sVar != null) {
                    arrayListM.add(sVar);
                }
            } else if (arrayList.isEmpty() || qVar2.f36242b.f3958a != ((q) ry.m.q0(arrayList)).f36242b.f3958a) {
                eVar.a(Lifecycle.State.CREATED);
            } else {
                q qVar5 = (q) ry.m.L0(arrayList);
                if (state == Lifecycle.State.RESUMED) {
                    eVar.a(Lifecycle.State.STARTED);
                } else {
                    Lifecycle.State state3 = Lifecycle.State.STARTED;
                    if (state != state3) {
                        map.put(eVar, state3);
                    }
                }
                s sVar2 = qVar5.f36243c;
                if (sVar2 != null && !arrayList.contains(sVar2)) {
                    arrayList.add(sVar2);
                }
            }
        }
        int size = arrayListC1.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListC1.get(i11);
            i11++;
            j9.e eVar2 = (j9.e) obj;
            Lifecycle.State state4 = (Lifecycle.State) map.get(eVar2);
            if (state4 != null) {
                eVar2.a(state4);
            } else {
                eVar2.H.b();
            }
        }
    }

    public final s h() {
        s sVar = this.f41072c;
        if (sVar == null) {
            throw new IllegalStateException(ealNNtLp.DRLKMxeTiIWwmXW);
        }
        m.d(sVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return sVar;
    }

    public final void m(String route, y yVar) {
        m.f(route, "route");
        if (this.f41072c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + route + ". Navigation graph has not been set for NavController " + this + '.').toString());
        }
        s sVarJ = j();
        p pVarG = sVarJ.g(route, true, sVarJ);
        if (pVarG == null) {
            StringBuilder sbQ = p0.q("Navigation destination that matches route ", route, " cannot be found in the navigation graph ");
            sbQ.append(this.f41072c);
            throw new IllegalArgumentException(sbQ.toString());
        }
        q qVar = pVarG.f36235a;
        Bundle bundleB = qVar.b(pVarG.f36236b);
        if (bundleB == null) {
            bundleB = jh.h.b((l[]) Arrays.copyOf(new l[0], 0));
        }
        int i11 = q.f36240e;
        String str = (String) qVar.f36242b.f3962e;
        String uriString = str != null ? "android-app://androidx.navigation/".concat(str) : BuildConfig.VERSION_NAME;
        m.f(uriString, "uriString");
        Uri uri = Uri.parse(uriString);
        m.e(uri, "parse(...)");
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleB.putParcelable(kHfjNGauVgdF.fXbtCaKcqKwJtIV, intent);
        l(qVar, bundleB, yVar);
    }
}
