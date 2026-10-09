package nf;

import b7.g;
import com.google.android.datatransport.Transformer;
import com.google.api.Service;
import fb.e0;
import fb.j;
import j3.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;
import lf.a0;
import lf.h0;
import lf.j1;
import lf.u;
import lf.x;
import o3.d0;
import o3.f0;
import o3.o;
import org.json.JSONArray;
import p7.x0;
import qa.t;
import qa.v;
import re.i0;
import re.s;
import ry.n;
import u8.i;
import x7.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements u, Transformer, tx.a, f0, u.a, g, l8.g, qa.u, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43772a;

    public /* synthetic */ f(int i11) {
        this.f43772a = i11;
    }

    @Override // o3.f0
    public d0 a(h hVar) {
        return new d0(hVar, o.f44688a);
    }

    @Override // b7.g
    public void accept(Object obj) {
        ((x0) obj).f46537b.getClass();
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        long j11;
        long jF;
        switch (this.f43772a) {
            case 1:
                return (byte[]) obj;
            default:
                List list = (List) obj;
                if (list == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(n.W(list, 10));
                for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                    ob.o oVar = (ob.o) it.next();
                    List list2 = oVar.f44846q;
                    j jVar = !list2.isEmpty() ? (j) list2.get(0) : j.f27095b;
                    UUID uuidFromString = UUID.fromString(oVar.f44831a);
                    m.e(uuidFromString, "fromString(id)");
                    e0 e0Var = oVar.f44832b;
                    HashSet hashSet = new HashSet(oVar.f44845p);
                    j jVar2 = oVar.f44833c;
                    int i11 = oVar.f44838h;
                    int i12 = oVar.m;
                    fb.f fVar = oVar.f44837g;
                    long j12 = oVar.f44834d;
                    ArrayList arrayList2 = arrayList;
                    long j13 = oVar.f44835e;
                    fb.d0 d0Var = j13 != 0 ? new fb.d0(j13, oVar.f44836f) : null;
                    e0 e0Var2 = oVar.f44832b;
                    e0 e0Var3 = e0.ENQUEUED;
                    if (e0Var2 == e0Var3) {
                        f fVar2 = ob.p.f44847y;
                        jF = ff.h.f(e0Var2 == e0Var3 && i11 > 0, i11, oVar.f44839i, oVar.f44840j, oVar.f44841k, oVar.f44842l, j13 != 0, j12, oVar.f44836f, j13, oVar.f44843n);
                        j11 = j12;
                    } else {
                        j11 = j12;
                        i11 = i11;
                        jF = Long.MAX_VALUE;
                    }
                    arrayList2.add(new fb.f0(uuidFromString, e0Var, hashSet, jVar2, jVar, i11, i12, fVar, j11, d0Var, jF, oVar.f44844o));
                    arrayList = arrayList2;
                }
                return arrayList;
        }
    }

    @Override // qa.u
    public void b(t tVar, v vVar, boolean z11) {
        switch (this.f43772a) {
            case 11:
                tVar.d(vVar);
                break;
            case 12:
                tVar.c(vVar);
                break;
            case 13:
                tVar.f(vVar);
                break;
            case 14:
                tVar.b();
                break;
            default:
                tVar.e();
                break;
        }
    }

    @Override // x7.p
    public x7.m[] c() {
        switch (this.f43772a) {
            case 20:
                return new x7.m[]{new r8.j(i.E, 16)};
            default:
                return new x7.m[]{new s8.d()};
        }
    }

    @Override // l8.g
    public boolean f(int i11, int i12, int i13, int i14, int i15) {
        if (i12 == 67 && i13 == 79 && i14 == 77 && (i15 == 77 || i11 == 2)) {
            return true;
        }
        if (i12 == 77 && i13 == 76 && i14 == 76) {
            return i15 == 84 || i11 == 2;
        }
        return false;
    }

    @Override // lf.u
    public void h(boolean z11) {
        HashSet hashSet;
        int i11 = 0;
        switch (this.f43772a) {
            case 0:
                if (z11) {
                    AtomicBoolean atomicBoolean = of.c.f44909a;
                    synchronized (of.c.class) {
                        if (qf.a.b(of.c.class)) {
                            return;
                        }
                        try {
                            if (of.c.f44909a.getAndSet(true)) {
                                return;
                            }
                            s sVar = s.f49201a;
                            if (i0.c()) {
                                of.c.a();
                            }
                            int i12 = of.a.f44903a;
                            if (!qf.a.b(of.a.class)) {
                                try {
                                    of.a.f44904b.scheduleWithFixedDelay(of.a.f44906d, 0L, 500L, TimeUnit.MILLISECONDS);
                                } catch (Throwable th2) {
                                    qf.a.a(of.a.class, th2);
                                }
                            }
                            break;
                        } catch (Throwable th3) {
                            qf.a.a(of.c.class, th3);
                            break;
                        }
                        return;
                    }
                }
                return;
            case 22:
                if (z11 && i0.c()) {
                    a0.a(new h2.d(28), x.CrashReport);
                    a0.a(new h2.d(29), x.ErrorReport);
                    a0.a(new f(i11), x.AnrReport);
                    return;
                }
                return;
            case 23:
                if (!z11 || qf.a.b(se.p.class)) {
                    return;
                }
                try {
                    h0.f40033e.add(new se.o());
                    h0.d();
                    return;
                } catch (Throwable th4) {
                    qf.a.a(se.p.class, th4);
                    return;
                }
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                if (z11) {
                    s.m = true;
                    return;
                }
                return;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                if (z11) {
                    s.f49213n = true;
                    return;
                }
                return;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                if (z11) {
                    s.f49214o = true;
                    return;
                }
                return;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                if (!z11 || qf.a.b(te.a.class)) {
                    return;
                }
                try {
                    try {
                        s.d().execute(new cf.c(16));
                        return;
                    } catch (Exception unused) {
                        s sVar2 = s.f49201a;
                        return;
                    }
                } catch (Throwable th5) {
                    qf.a.a(te.a.class, th5);
                    return;
                }
            default:
                if (z11) {
                    df.a aVar = df.a.f23386a;
                    if (qf.a.b(df.a.class)) {
                        return;
                    }
                    try {
                        if (df.a.f23387b) {
                            return;
                        }
                        df.a aVar2 = df.a.f23386a;
                        if (!qf.a.b(aVar2)) {
                            try {
                                lf.e0 e0VarK = h0.k(s.b(), false);
                                if (e0VarK != null) {
                                    JSONArray jSONArray = e0VarK.f40017v;
                                    HashSet hashSet2 = null;
                                    try {
                                        if (!qf.a.b(aVar2)) {
                                            try {
                                                hashSet = j1.f(jSONArray);
                                                if (hashSet == null) {
                                                    hashSet = new HashSet();
                                                }
                                            } catch (Exception unused2) {
                                                hashSet = new HashSet();
                                            }
                                            hashSet2 = hashSet;
                                        }
                                    } catch (Throwable th6) {
                                        qf.a.a(aVar2, th6);
                                    }
                                    df.a.f23388c = hashSet2;
                                    break;
                                }
                            } catch (Throwable th7) {
                                qf.a.a(aVar2, th7);
                            }
                        }
                        df.a.f23387b = !df.a.f23388c.isEmpty();
                        return;
                    } catch (Throwable th8) {
                        qf.a.a(df.a.class, th8);
                        return;
                    }
                }
                return;
        }
    }

    @Override // tx.a
    public void run() {
    }
}
