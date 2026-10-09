package mw;

import com.google.common.base.Verify;
import com.google.common.base.VerifyException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j5 implements o5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lw.a f42481a = new lw.a("io.grpc.internal.GrpcAttributes.securityLevel");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final lw.a f42482b = new lw.a("io.grpc.internal.GrpcAttributes.clientEagAttrs");

    public static k2 a() {
        return g4.f42429e == null ? new g4() : new f(0);
    }

    public static Set b(String str, Map map) {
        lw.p1 p1VarValueOf;
        List listC = e2.c(str, map);
        if (listC == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(lw.p1.class);
        for (Object obj : listC) {
            if (obj instanceof Double) {
                Double d5 = (Double) obj;
                int iIntValue = d5.intValue();
                Verify.a("Status code %s is not integral", ((double) iIntValue) == d5.doubleValue(), obj);
                p1VarValueOf = lw.q1.d(iIntValue).f40444a;
                Verify.a("Status code %s is not valid", p1VarValueOf.c() == d5.intValue(), obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new VerifyException("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
                }
                try {
                    p1VarValueOf = lw.p1.valueOf((String) obj);
                } catch (IllegalArgumentException e8) {
                    throw new VerifyException("Status code " + obj + " is not valid", e8);
                }
            }
            enumSetNoneOf.add(p1VarValueOf);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    public static List g(Map map) {
        String strH;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            List listC = e2.c("loadBalancingConfig", map);
            if (listC == null) {
                listC = null;
            } else {
                e2.a(listC);
            }
            arrayList.addAll(listC);
        }
        if (arrayList.isEmpty() && (strH = e2.h("loadBalancingPolicy", map)) != null) {
            arrayList.add(Collections.singletonMap(strH.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static lw.g1 t(List list, lw.s0 s0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h5 h5Var = (h5) it.next();
            String str = h5Var.f42442a;
            lw.r0 r0VarB = s0Var.b(str);
            if (r0VarB != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(j5.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                lw.g1 g1VarS = r0VarB.s(h5Var.f42443b);
                return g1VarS.f40389a != null ? g1VarS : new lw.g1(new i5(r0VarB, g1VarS.f40390b));
            }
            arrayList.add(str);
        }
        return new lw.g1(lw.q1.f40436g.h("None of " + arrayList + " specified by Service Config are available."));
    }

    public static List u(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            if (map.size() != 1) {
                throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
            }
            String str = (String) ((Map.Entry) map.entrySet().iterator().next()).getKey();
            arrayList.add(new h5(str, e2.g(str, map)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // mw.o5
    public void c(lw.l lVar) {
        ((c) this).f42367d.c(lVar);
    }

    @Override // mw.o5
    public void e() {
        nw.l lVar = ((nw.m) this).P;
        lVar.getClass();
        tw.b.b();
        aj.i iVar = new aj.i(lVar, 8);
        synchronized (lVar.f44229w) {
            iVar.run();
        }
    }

    @Override // mw.o5
    public void flush() {
        g1 g1Var = ((c) this).f42367d;
        if (g1Var.isClosed()) {
            return;
        }
        g1Var.flush();
    }

    public abstract int i();

    @Override // mw.o5
    public void j(qw.a aVar) {
        try {
            if (!((c) this).f42367d.isClosed()) {
                ((c) this).f42367d.e(aVar);
            }
        } finally {
            k1.b(aVar);
        }
    }

    public abstract boolean m(g5 g5Var);

    public abstract void o(g5 g5Var);

    @Override // mw.o5
    public void q() {
        nw.l lVar = ((nw.m) this).P;
        k3 k3Var = lVar.f42345d;
        k3Var.f42504a = lVar;
        lVar.f42342a = k3Var;
    }
}
