package nz;

import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import mt.b6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n extends v10.c {
    public static l P(Iterator it) {
        kotlin.jvm.internal.m.f(it, "<this>");
        return new a(new o(it, 1));
    }

    public static l Q(l lVar, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException(p0.h(i11, "Requested element count ", " is less than zero.").toString());
        }
        if (i11 == 0) {
            return lVar;
        }
        return lVar instanceof f ? ((f) lVar).b(i11) : new e(lVar, i11, 0);
    }

    public static i R(l lVar, fz.c predicate) {
        kotlin.jvm.internal.m.f(predicate, "predicate");
        return new i(lVar, true, predicate);
    }

    public static Object S(i iVar) {
        g gVar = new g(iVar);
        if (gVar.hasNext()) {
            return gVar.next();
        }
        return null;
    }

    public static j T(l lVar, fz.c transform) {
        kotlin.jvm.internal.m.f(transform, "transform");
        return new j(lVar, transform, q.f44341a);
    }

    public static l U(Object obj, fz.c cVar) {
        if (obj == null) {
            return h.f44323a;
        }
        return new cz.i(1, new lt.e(obj, 9), cVar);
    }

    public static String V(l lVar, String str) {
        kotlin.jvm.internal.m.f(lVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) BuildConfig.VERSION_NAME);
        int i11 = 0;
        for (Object obj : lVar) {
            i11++;
            if (i11 > 1) {
                sb2.append((CharSequence) str);
            }
            se.p.L(sb2, obj, null);
        }
        sb2.append((CharSequence) BuildConfig.VERSION_NAME);
        return sb2.toString();
    }

    public static t W(l lVar, fz.c transform) {
        kotlin.jvm.internal.m.f(lVar, "<this>");
        kotlin.jvm.internal.m.f(transform, "transform");
        return new t(lVar, transform);
    }

    public static i X(l lVar, fz.c cVar) {
        return new i(new t(lVar, cVar), false, new b6(20));
    }

    public static l Y(l lVar, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException(p0.h(i11, "Requested element count ", " is less than zero.").toString());
        }
        if (i11 == 0) {
            return h.f44323a;
        }
        return lVar instanceof f ? ((f) lVar).a(i11) : new e(lVar, i11, 1);
    }

    public static List Z(l lVar) {
        kotlin.jvm.internal.m.f(lVar, "<this>");
        Iterator it = lVar.iterator();
        if (!it.hasNext()) {
            return ry.r.f50854a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return ns.o.K(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Set a0(l lVar) {
        Iterator it = lVar.iterator();
        if (!it.hasNext()) {
            return ry.t.f50856a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return qx.b.H(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }
}
