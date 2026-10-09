package se;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lf.v0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f51597a = new HashMap();

    /* JADX WARN: Code duplicated, block: B:14:0x0024 A[Catch: all -> 0x0050, TryCatch #0 {, blocks: (B:3:0x0001, B:11:0x001a, B:12:0x001e, B:14:0x0024, B:16:0x0036, B:17:0x0040, B:19:0x0046, B:10:0x0017, B:7:0x0009), top: B:27:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0046 A[Catch: all -> 0x0050, LOOP:1: B:17:0x0040->B:19:0x0046, LOOP_END, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:11:0x001a, B:12:0x001e, B:14:0x0024, B:16:0x0036, B:17:0x0040, B:19:0x0046, B:10:0x0017, B:7:0x0009), top: B:27:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x001e A[SYNTHETIC] */
    public synchronized void a(x xVar) {
        y yVarE;
        Iterator it;
        Set<Map.Entry> set = null;
        if (qf.a.b(xVar)) {
            for (Map.Entry entry : set) {
                yVarE = e((b) entry.getKey());
                if (yVarE != null) {
                    it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        yVarE.a((f) it.next());
                    }
                }
            }
        } else {
            try {
                Set setEntrySet = xVar.f51617a.entrySet();
                kotlin.jvm.internal.m.e(setEntrySet, "events.entries");
                set = setEntrySet;
            } catch (Throwable th2) {
                qf.a.a(xVar, th2);
            }
            while (r4.hasNext()) {
                yVarE = e((b) entry.getKey());
                if (yVarE != null) {
                    it = ((List) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        yVarE.a((f) it.next());
                    }
                }
            }
        }
        throw th;
    }

    public synchronized y b(b accessTokenAppIdPair) {
        kotlin.jvm.internal.m.f(accessTokenAppIdPair, "accessTokenAppIdPair");
        return (y) this.f51597a.get(accessTokenAppIdPair);
    }

    public String c(String str) {
        HashMap map = this.f51597a;
        if (map.containsKey(str)) {
            return (String) map.get(str);
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < str.length(); i11++) {
            String strValueOf = String.valueOf(str.charAt(i11));
            if (map.containsKey(strValueOf)) {
                strValueOf = (String) map.get(strValueOf);
            }
            sb2.append(strValueOf);
        }
        return sb2.toString().trim();
    }

    public synchronized int d() {
        int i11;
        int size;
        i11 = 0;
        for (y yVar : this.f51597a.values()) {
            synchronized (yVar) {
                if (!qf.a.b(yVar)) {
                    try {
                        size = yVar.f51620c.size();
                    } catch (Throwable th2) {
                        qf.a.a(yVar, th2);
                        size = 0;
                    }
                }
                size = 0;
            }
            i11 += size;
        }
        return i11;
    }

    public synchronized y e(b bVar) {
        Context contextA;
        lf.d dVarA;
        y yVar = (y) this.f51597a.get(bVar);
        if (yVar == null && (dVarA = v0.a((contextA = re.s.a()))) != null) {
            yVar = new y(dVarA, v10.c.l(contextA));
        }
        if (yVar == null) {
            return null;
        }
        this.f51597a.put(bVar, yVar);
        return yVar;
    }

    public synchronized Set f() {
        Set setKeySet;
        setKeySet = this.f51597a.keySet();
        kotlin.jvm.internal.m.e(setKeySet, "stateMap.keys");
        return setKeySet;
    }
}
