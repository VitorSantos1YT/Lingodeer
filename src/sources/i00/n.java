package i00;

import dt.Xk.wuoM;
import g00.d1;
import g00.h0;
import h00.d0;
import hh.p0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class n extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h00.z f33920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e00.g f33921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f33922h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f33923i;

    public /* synthetic */ n(h00.c cVar, h00.z zVar, String str, int i11) {
        this(cVar, zVar, (i11 & 4) != 0 ? null : str, (e00.g) null);
    }

    @Override // i00.a
    public h00.m F(String tag) {
        kotlin.jvm.internal.m.f(tag, "tag");
        return (h00.m) ry.x.U(tag, T());
    }

    @Override // i00.a
    public String R(e00.g descriptor, int i11) {
        Object next;
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        h00.c cVar = this.f33893c;
        j.n(descriptor, cVar);
        String strG = descriptor.g(i11);
        if (this.f33895e.f29936g && !T().f29949a.keySet().contains(strG)) {
            kotlin.jvm.internal.m.f(cVar, "<this>");
            a5.j jVar = cVar.f29918c;
            fp.f fVar = new fp.f(11, descriptor, cVar);
            jVar.getClass();
            k kVar = j.f33909a;
            Object objK = jVar.k(descriptor, kVar);
            if (objK == null) {
                objK = fVar.invoke();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) jVar.f385b;
                Object concurrentHashMap2 = concurrentHashMap.get(descriptor);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(descriptor, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(kVar, objK);
            }
            Map map = (Map) objK;
            Iterator it = T().f29949a.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = (Integer) map.get((String) next);
                if (num != null && num.intValue() == i11) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
        }
        return strG;
    }

    @Override // i00.a
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public h00.z T() {
        return this.f33920f;
    }

    public final boolean Z(e00.g gVar, int i11) {
        boolean z11 = (this.f33893c.f29916a.f29932c || gVar.j(i11) || !gVar.i(i11).c()) ? false : true;
        this.f33923i = z11;
        return z11;
    }

    @Override // i00.a, f00.c
    public final f00.a d(e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        e00.g gVar = this.f33921g;
        if (descriptor != gVar) {
            return super.d(descriptor);
        }
        h00.m mVarG = G();
        String strA = gVar.a();
        if (mVarG instanceof h00.z) {
            return new n(this.f33893c, (h00.z) mVarG, this.f33894d, gVar);
        }
        throw j.c(-1, mVarG.toString(), "Expected " + kotlin.jvm.internal.z.a(h00.z.class).g() + ", but had " + kotlin.jvm.internal.z.a(mVarG.getClass()).g() + " as the serialized body of " + strA + " at element: " + V());
    }

    @Override // f00.a
    public int n(e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        while (this.f33922h < descriptor.f()) {
            int i11 = this.f33922h;
            this.f33922h = i11 + 1;
            String strS = S(descriptor, i11);
            int i12 = this.f33922h - 1;
            this.f33923i = false;
            if (T().containsKey(strS) || Z(descriptor, i12)) {
                if (this.f33895e.f29934e) {
                    boolean zJ = descriptor.j(i12);
                    e00.g gVarI = descriptor.i(i12);
                    if (!zJ || gVarI.c() || !(((h00.m) T().get(strS)) instanceof h00.w)) {
                        if (kotlin.jvm.internal.m.a(gVarI.e(), e00.l.f24699c) && (!gVarI.c() || !(((h00.m) T().get(strS)) instanceof h00.w))) {
                            h00.m mVar = (h00.m) T().get(strS);
                            String strB = null;
                            d0 d0Var = mVar instanceof d0 ? (d0) mVar : null;
                            if (d0Var != null) {
                                h0 h0Var = h00.n.f29938a;
                                if (!(d0Var instanceof h00.w)) {
                                    strB = d0Var.b();
                                }
                            }
                            if (strB != null) {
                                h00.c cVar = this.f33893c;
                                int i13 = j.i(gVarI, cVar, strB);
                                boolean z11 = !cVar.f29916a.f29932c && gVarI.c();
                                if (i13 != -3 || ((!zJ && !z11) || Z(descriptor, i12))) {
                                }
                            }
                        }
                    }
                }
                return i12;
            }
        }
        return -1;
    }

    @Override // i00.a, f00.c
    public final boolean r() {
        return !this.f33923i && super.r();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(h00.c json, h00.z zVar, String str, e00.g gVar) {
        super(json, str);
        kotlin.jvm.internal.m.f(json, "json");
        this.f33920f = zVar;
        this.f33921g = gVar;
    }

    @Override // i00.a, f00.a
    public void c(e00.g descriptor) {
        Set setD;
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        h00.c cVar = this.f33893c;
        if (j.k(descriptor, cVar) || (descriptor.e() instanceof e00.d)) {
            return;
        }
        j.n(descriptor, cVar);
        if (this.f33895e.f29936g) {
            Set setB = d1.b(descriptor);
            Map map = (Map) cVar.f29918c.k(descriptor, j.f33909a);
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = ry.t.f50856a;
            }
            setD = qx.b.D(setB, setKeySet);
        } else {
            setD = d1.b(descriptor);
        }
        for (String str : T().f29949a.keySet()) {
            if (!setD.contains(str) && !kotlin.jvm.internal.m.a(str, this.f33894d)) {
                StringBuilder sbQ = p0.q(wuoM.neLhOxxrIcwpDJ, str, "' at element: ");
                sbQ.append(V());
                sbQ.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                sbQ.append((Object) j.m(T().toString(), -1));
                throw j.d(-1, sbQ.toString());
            }
        }
    }
}
