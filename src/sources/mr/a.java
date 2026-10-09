package mr;

import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.DbFileVersion;
import fr.d4;
import fr.x4;
import g00.g0;
import g00.m0;
import g00.t1;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.m;
import l1.z1;
import ot.j1;
import ot.m2;
import ot.n2;
import ot.o2;
import ot.s1;
import qy.q;
import ry.x;
import rz.b0;
import rz.e0;
import rz.o0;
import se.k;
import tz.s;
import tz.t;
import uz.x0;
import xy.i;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41178a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f41180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f41181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f41182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f41183f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f41184t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j11, List list, LinkedHashMap linkedHashMap, s1 s1Var, CoursePracticeType coursePracticeType, vy.d dVar) {
        super(2, dVar);
        this.f41180c = j11;
        this.f41181d = list;
        this.f41182e = linkedHashMap;
        this.f41183f = s1Var;
        this.f41184t = coursePracticeType;
    }

    public static final void e(Set set, AtomicInteger atomicInteger, int i11, t tVar, long j11, uv.b bVar) {
        String str;
        if (bVar == null || (str = bVar.f53184e) == null) {
            fv.a aVar = bVar != null ? bVar.f53188i : null;
            if (aVar == null) {
                aVar = null;
            }
            if (aVar == null) {
                return;
            } else {
                str = aVar.f28182a;
            }
        }
        if (set.add(str)) {
            int iIncrementAndGet = atomicInteger.incrementAndGet();
            s sVar = (s) tVar;
            sVar.i(new ps.a(iIncrementAndGet / i11, iIncrementAndGet, i11, j11));
            if (iIncrementAndGet >= i11) {
                sVar.a0(null);
            }
        }
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f41178a) {
            case 0:
                return new a((String) this.f41183f, (e) this.f41184t, dVar);
            case 1:
                return new a(this.f41180c, (List) this.f41181d, (LinkedHashMap) this.f41182e, (s1) this.f41183f, (CoursePracticeType) this.f41184t, dVar);
            default:
                a aVar = new a(this.f41180c, (List) this.f41184t, (o2) this.f41183f, dVar);
                aVar.f41182e = obj;
                return aVar;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41178a) {
            case 0:
                return ((a) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((a) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((a) create((t) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0221  */
    /* JADX WARN: Code duplicated, block: B:68:0x0224  */
    /* JADX WARN: Code duplicated, block: B:69:0x022b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0234  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        String strE;
        Object objM;
        File file;
        String str;
        long jLongValue;
        Object objU;
        String str2;
        File file2;
        DbFileVersion dbFileVersion;
        fv.c cVar;
        Object objM2;
        int i11 = this.f41178a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj2 = this.f41184t;
        Object obj3 = this.f41183f;
        boolean z11 = true;
        switch (i11) {
            case 0:
                String fileName = (String) obj3;
                e eVar = (e) obj2;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f41179b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    q qVar = fv.b.f28186a;
                    File file3 = new File(defpackage.e.m(fv.b.m(), fileName));
                    strE = ep.a.e("https://d27hu3tsvatwlt.cloudfront.net/dtzip/", fileName);
                    if (file3.exists()) {
                        this.f41181d = file3;
                        this.f41182e = strE;
                        this.f41179b = 1;
                        f fVar = o0.f50940a;
                        objM = e0.M(yz.e.f58387a, new c(strE, eVar, null), this);
                        if (objM != aVar) {
                            file = file3;
                            str = strE;
                        }
                        return aVar;
                    }
                    file3.getPath();
                    if (!z11) {
                        return null;
                    }
                    q qVar2 = fv.b.f28186a;
                    return new fv.a(strE, defpackage.e.m(fv.b.m(), fileName), fileName);
                }
                if (i12 == 1) {
                    str = (String) this.f41182e;
                    file = (File) this.f41181d;
                    com.bumptech.glide.e.F(obj);
                    objM = obj;
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j11 = this.f41180c;
                    str2 = (String) this.f41182e;
                    file2 = (File) this.f41181d;
                    com.bumptech.glide.e.F(obj);
                    jLongValue = j11;
                    objU = obj;
                }
                dbFileVersion = (DbFileVersion) objU;
                z11 = dbFileVersion.getLastUpdateTime() < jLongValue;
                if (z11) {
                    file2.getPath();
                    dbFileVersion.getLastUpdateTime();
                } else {
                    file2.getPath();
                    dbFileVersion.getLastUpdateTime();
                }
                strE = str2;
                if (!z11) {
                    return null;
                }
                q qVar3 = fv.b.f28186a;
                return new fv.a(strE, defpackage.e.m(fv.b.m(), fileName), fileName);
                jLongValue = ((Number) objM).longValue();
                if (jLongValue != 0) {
                    x4 x4Var = (x4) eVar.f41200a;
                    m.f(fileName, "fileName");
                    d4 d4Var = new d4(x4Var.f27968a.I().b(fileName), fileName, 0);
                    this.f41181d = file;
                    this.f41182e = str;
                    this.f41180c = jLongValue;
                    this.f41179b = 2;
                    objU = x0.u(d4Var, this);
                    if (objU != aVar) {
                        str2 = str;
                        file2 = file;
                        dbFileVersion = (DbFileVersion) objU;
                        if (dbFileVersion.getLastUpdateTime() < jLongValue) {
                        }
                        if (z11) {
                            file2.getPath();
                            dbFileVersion.getLastUpdateTime();
                        } else {
                            file2.getPath();
                            dbFileVersion.getLastUpdateTime();
                        }
                        strE = str2;
                    }
                    return aVar;
                }
                strE = str;
                z11 = false;
                if (!z11) {
                    return null;
                }
                q qVar4 = fv.b.f28186a;
                return new fv.a(strE, defpackage.e.m(fv.b.m(), fileName), fileName);
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f41179b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                if (this.f41180c == -1) {
                    return b0Var;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (j1 j1Var : (List) this.f41181d) {
                    if (j1Var.a().f33764l) {
                        linkedHashMap.put(j1Var.a().f33753a + ":" + j1Var.a().f33754b + ":" + j1Var.a().f33755c, new Integer(0));
                    }
                }
                LinkedHashMap linkedHashMapC0 = x.c0((LinkedHashMap) this.f41182e, linkedHashMap);
                linkedHashMapC0.toString();
                wt.o0 o0Var = ((s1) obj3).f45986a;
                long j12 = this.f41180c;
                h00.s sVar = xt.c.f56291a;
                sVar.getClass();
                this.f41179b = 1;
                return o0Var.h(j12, sVar.c(new g0(t1.f28468a, m0.f28434a, 1), linkedHashMapC0), (CoursePracticeType) obj2, this) == aVar2 ? aVar2 : b0Var;
            default:
                o2 o2Var = (o2) obj3;
                t tVar = (t) this.f41182e;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f41179b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    cVar = (fv.c) o2Var.f45936c.invoke();
                    o2Var.f45938e.add(cVar);
                    f fVar2 = o0.f50940a;
                    yz.e eVar2 = yz.e.f58387a;
                    m2 m2Var = new m2(this.f41180c, (List) obj2, o2Var, null);
                    this.f41182e = tVar;
                    this.f41181d = cVar;
                    this.f41179b = 1;
                    objM2 = e0.M(eVar2, m2Var, this);
                    if (objM2 != aVar3) {
                    }
                    return aVar3;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                fv.c cVar2 = (fv.c) this.f41181d;
                com.bumptech.glide.e.F(obj);
                cVar = cVar2;
                objM2 = obj;
                List list = (List) objM2;
                if (list.isEmpty()) {
                    s sVar2 = (s) tVar;
                    sVar2.i(new ps.a(1.0f, 0, 0, this.f41180c));
                    sVar2.a0(null);
                    return b0Var;
                }
                cVar.c(list, new n2(Collections.synchronizedSet(new LinkedHashSet()), new AtomicInteger(0), list.size(), tVar, this.f41180c), false);
                z1 z1Var = new z1(25, cVar, o2Var);
                this.f41182e = null;
                this.f41181d = null;
                this.f41179b = 2;
                if (k.i(tVar, z1Var, this) != aVar3) {
                    return b0Var;
                }
                return aVar3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j11, List list, o2 o2Var, vy.d dVar) {
        super(2, dVar);
        this.f41183f = o2Var;
        this.f41180c = j11;
        this.f41184t = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, e eVar, vy.d dVar) {
        super(2, dVar);
        this.f41183f = str;
        this.f41184t = eVar;
    }
}
