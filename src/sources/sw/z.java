package sw;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import lw.l0;
import lw.m0;
import lw.n0;
import lw.o0;
import lw.q0;
import lw.q1;
import lw.r0;
import mw.a4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends q0 {
    public static final Logger m = Logger.getLogger(z.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lw.f f51914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f51915h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public lw.n f51917j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f51918k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public o0 f51919l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f51913f = new LinkedHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a4 f51916i = new a4();

    public z(lw.f fVar) {
        this.f51914g = fVar;
        m.log(Level.FINE, "Created");
        this.f51918k = new AtomicInteger(new Random().nextInt());
        this.f51919l = new x();
    }

    @Override // lw.q0
    public final q1 a(n0 n0Var) {
        try {
            this.f51915h = true;
            qp.r rVarG = g(n0Var);
            q1 q1Var = (q1) rVarG.f48145b;
            if (!q1Var.f()) {
                this.f51915h = false;
                return q1Var;
            }
            j();
            for (l lVar : (List) rVarG.f48146c) {
                lVar.f51866b.f();
                lVar.f51868d = lw.n.SHUTDOWN;
                m.log(Level.FINE, "Child balancer {0} deleted", lVar.f51865a);
            }
            this.f51915h = false;
            return q1Var;
        } catch (Throwable th2) {
            this.f51915h = false;
            throw th2;
        }
    }

    @Override // lw.q0
    public final void c(q1 q1Var) {
        if (this.f51917j != lw.n.READY) {
            this.f51914g.q(lw.n.TRANSIENT_FAILURE, new l0(m0.a(q1Var)));
        }
    }

    @Override // lw.q0
    public final void f() {
        Level level = Level.FINE;
        Logger logger = m;
        logger.log(level, "Shutdown");
        LinkedHashMap linkedHashMap = this.f51913f;
        for (l lVar : linkedHashMap.values()) {
            lVar.f51866b.f();
            lVar.f51868d = lw.n.SHUTDOWN;
            logger.log(Level.FINE, "Child balancer {0} deleted", lVar.f51865a);
        }
        linkedHashMap.clear();
    }

    public final qp.r g(n0 n0Var) {
        LinkedHashMap linkedHashMap;
        m mVar;
        lw.v vVar;
        Level level = Level.FINE;
        Logger logger = m;
        logger.log(level, "Received resolution result: {0}", n0Var);
        HashMap map = new HashMap();
        List list = n0Var.f40422a;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = this.f51913f;
            if (!zHasNext) {
                break;
            }
            m mVar2 = new m((lw.v) it.next());
            l lVar = (l) linkedHashMap.get(mVar2);
            if (lVar != null) {
                map.put(mVar2, lVar);
            } else {
                map.put(mVar2, new l(this, mVar2, this.f51916i, new l0(m0.f40417e)));
            }
        }
        int i11 = 3;
        Object obj = null;
        if (map.isEmpty()) {
            q1 q1VarH = q1.m.h("NameResolver returned no usable address. " + n0Var);
            c(q1VarH);
            return new qp.r(i11, q1VarH, obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            r0 r0Var = ((l) entry.getValue()).f51867c;
            ((l) entry.getValue()).getClass();
            if (linkedHashMap.containsKey(key)) {
                l lVar2 = (l) linkedHashMap.get(key);
                if (lVar2.f51870f) {
                    lVar2.f51870f = false;
                }
            } else {
                linkedHashMap.put(key, (l) entry.getValue());
            }
            l lVar3 = (l) linkedHashMap.get(key);
            if (key instanceof lw.v) {
                mVar = new m((lw.v) key);
            } else {
                Preconditions.e("key is wrong type", key instanceof m);
                mVar = (m) key;
            }
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    vVar = null;
                    break;
                }
                vVar = (lw.v) it2.next();
            } while (!mVar.equals(new m(vVar)));
            Preconditions.k(vVar, key + " no longer present in load balancer children");
            lw.b bVar = lw.b.f40342b;
            List listSingletonList = Collections.singletonList(vVar);
            lw.b bVar2 = lw.b.f40342b;
            Boolean bool = Boolean.TRUE;
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(q0.f40431e, bool);
            for (Map.Entry entry2 : bVar2.f40343a.entrySet()) {
                if (!identityHashMap.containsKey(entry2.getKey())) {
                    identityHashMap.put((lw.a) entry2.getKey(), entry2.getValue());
                }
            }
            n0 n0Var2 = new n0(listSingletonList, new lw.b(identityHashMap), null);
            ((l) linkedHashMap.get(key)).getClass();
            if (!lVar3.f51870f) {
                lVar3.f51866b.d(n0Var2);
            }
        }
        ArrayList arrayList = new ArrayList();
        UnmodifiableListIterator unmodifiableListIteratorListIterator = ImmutableList.n(linkedHashMap.keySet()).listIterator(0);
        while (unmodifiableListIteratorListIterator.hasNext()) {
            Object next = unmodifiableListIteratorListIterator.next();
            if (!map.containsKey(next)) {
                l lVar4 = (l) linkedHashMap.get(next);
                m mVar3 = lVar4.f51865a;
                if (!lVar4.f51870f) {
                    lVar4.f51871g.f51913f.remove(mVar3);
                    lVar4.f51870f = true;
                    logger.log(Level.FINE, "Child balancer {0} deactivated", mVar3);
                }
                arrayList.add(lVar4);
            }
        }
        return new qp.r(i11, q1.f40434e, arrayList);
    }

    public final y h(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((l) it.next()).f51869e);
        }
        return new y(arrayList, this.f51918k);
    }

    public final void i(lw.n nVar, o0 o0Var) {
        if (nVar == this.f51917j && o0Var.equals(this.f51919l)) {
            return;
        }
        this.f51914g.q(nVar, o0Var);
        this.f51917j = nVar;
        this.f51919l = o0Var;
    }

    public final void j() {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = this.f51913f;
        for (l lVar : linkedHashMap.values()) {
            if (!lVar.f51870f && lVar.f51868d == lw.n.READY) {
                arrayList.add(lVar);
            }
        }
        if (!arrayList.isEmpty()) {
            i(lw.n.READY, h(arrayList));
            return;
        }
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            lw.n nVar = ((l) it.next()).f51868d;
            lw.n nVar2 = lw.n.CONNECTING;
            if (nVar == nVar2 || nVar == lw.n.IDLE) {
                i(nVar2, new x());
                return;
            }
        }
        i(lw.n.TRANSIENT_FAILURE, h(linkedHashMap.values()));
    }
}
