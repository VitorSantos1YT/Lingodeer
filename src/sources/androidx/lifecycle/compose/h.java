package androidx.lifecycle.compose;

import androidx.lifecycle.LifecycleOwner;
import com.google.api.Service;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.ShareStreakType;
import d1.l;
import dt.k3;
import fu.g0;
import ht.o;
import iu.k;
import java.util.ArrayList;
import km.b1;
import km.k2;
import kotlin.jvm.internal.y;
import kr.h0;
import kr.r0;
import kv.i0;
import kv.x;
import l1.n;
import l1.t;
import mt.l5;
import mt.m3;
import n0.a0;
import n0.x0;
import ns.s;
import ot.u1;
import qx.p;
import qy.b0;
import rt.jf;
import rt.n0;
import rt.v4;
import ys.d0;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2068e;

    public /* synthetic */ h(int i11, ShareStreakType shareStreakType, y yVar, y yVar2) {
        this.f2064a = 10;
        this.f2067d = i11;
        this.f2065b = shareStreakType;
        this.f2068e = yVar;
        this.f2066c = yVar2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f2064a) {
            case 0:
                return LifecycleEffectKt.LifecycleStartEffectImpl$lambda$20((LifecycleOwner) this.f2065b, (LifecycleStartStopEffectScope) this.f2068e, (fz.c) this.f2066c, this.f2067d, (n) obj, ((Integer) obj2).intValue());
            case 1:
                return LifecycleEffectKt.LifecycleResumeEffectImpl$lambda$35((LifecycleOwner) this.f2065b, (LifecycleResumePauseEffectScope) this.f2068e, (fz.c) this.f2066c, this.f2067d, (n) obj, ((Integer) obj2).intValue());
            case 2:
                ((Integer) obj2).getClass();
                bt.b.j((CourseSentence) this.f2065b, (o) this.f2068e, (d0) this.f2066c, (n) obj, t.M(this.f2067d | 1));
                return b0.f48488a;
            case 3:
                ((Integer) obj2).getClass();
                bt.b.r((ot.j) this.f2065b, (o) this.f2068e, (d0) this.f2066c, (n) obj, t.M(this.f2067d | 1));
                return b0.f48488a;
            case 4:
                ((Integer) obj2).getClass();
                bt.b.Y((u1) this.f2065b, (o) this.f2068e, (d0) this.f2066c, (n) obj, t.M(this.f2067d | 1));
                return b0.f48488a;
            case 5:
                ((Integer) obj2).getClass();
                p.c((l) this.f2065b, (z1.e) this.f2068e, (t1.d) this.f2066c, (n) obj, t.M(this.f2067d | 1));
                return b0.f48488a;
            case 6:
                ((Integer) obj2).getClass();
                k3.g((s) this.f2065b, (fz.a) this.f2068e, (r) this.f2066c, (n) obj, t.M(this.f2067d | 1));
                return b0.f48488a;
            case 7:
                ((Integer) obj2).getClass();
                e0.g.b((r) this.f2065b, (e0.c) this.f2068e, (fz.c) this.f2066c, (n) obj, t.M(1), this.f2067d);
                return b0.f48488a;
            case 8:
                ((Integer) obj2).getClass();
                e0.g.a((e0.c) this.f2065b, (r) this.f2068e, (t1.d) this.f2066c, (n) obj, t.M(this.f2067d | 1));
                return b0.f48488a;
            case 9:
                ((Integer) obj2).getClass();
                et.a.f((et.o) this.f2065b, (fz.c) this.f2066c, (fz.a) this.f2068e, (n) obj, t.M(this.f2067d | 1));
                return b0.f48488a;
            case 10:
                ShareStreakType shareStreakType = (ShareStreakType) this.f2065b;
                y yVar = (y) this.f2068e;
                y yVar2 = (y) this.f2066c;
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fu.a.u(this.f2067d, shareStreakType, new g0(yVar, yVar2, 0), sVar, 0);
                } else {
                    sVar.W();
                }
                return b0.f48488a;
            case 11:
                ((Integer) obj2).getClass();
                gs.a.v((fz.a) this.f2065b, (fz.a) this.f2068e, (js.y) this.f2066c, this.f2067d, (n) obj, t.M(1));
                return b0.f48488a;
            case 12:
                r rVar = (r) this.f2065b;
                ((Integer) obj2).getClass();
                k.k(t.M(this.f2067d | 1), (fz.a) this.f2068e, (String) this.f2066c, (n) obj, rVar);
                return b0.f48488a;
            case 13:
                ((Integer) obj2).getClass();
                iv.o.i(this.f2067d, (fz.a) this.f2065b, (fz.c) this.f2066c, (fz.c) this.f2068e, (n) obj, t.M(1));
                return b0.f48488a;
            case 14:
                ((Integer) obj2).intValue();
                iv.a.t((i0) this.f2065b, (kv.y) this.f2068e, (fz.c) this.f2066c, (n) obj, t.M(this.f2067d | 1));
                return b0.f48488a;
            case 15:
                ((Integer) obj2).getClass();
                iv.a.z((x) this.f2065b, (r) this.f2068e, (fz.c) this.f2066c, (n) obj, t.M(this.f2067d | 1));
                return b0.f48488a;
            case 16:
                ((Integer) obj2).getClass();
                jr.a.a(this.f2067d, (h0) this.f2065b, (fz.a) this.f2068e, (fz.c) this.f2066c, (n) obj, t.M(385));
                return b0.f48488a;
            case 17:
                ((Integer) obj2).getClass();
                jr.a.l((r0) this.f2065b, (r) this.f2068e, (fz.a) this.f2066c, (n) obj, t.M(this.f2067d | 1));
                return b0.f48488a;
            case 18:
                ((Integer) obj2).getClass();
                b1.d((km.o) this.f2065b, (fz.c) this.f2066c, (r) this.f2068e, (n) obj, t.M(this.f2067d | 1));
                return b0.f48488a;
            case 19:
                ((Integer) obj2).getClass();
                b1.z((k2) this.f2065b, (fz.c) this.f2066c, (r) this.f2068e, (n) obj, t.M(this.f2067d | 1));
                return b0.f48488a;
            case 20:
                ((Integer) obj2).getClass();
                b1.l((km.n) this.f2065b, (fz.c) this.f2066c, (r) this.f2068e, (n) obj, t.M(this.f2067d | 1));
                return b0.f48488a;
            case 21:
                ((Integer) obj2).getClass();
                b1.x((ArrayList) this.f2065b, (fz.c) this.f2066c, (r) this.f2068e, (n) obj, t.M(this.f2067d | 1));
                return b0.f48488a;
            case 22:
                ((Integer) obj2).getClass();
                ku.a.j((mu.k) this.f2065b, (fz.a) this.f2068e, (fz.c) this.f2066c, (n) obj, t.M(this.f2067d | 1));
                return b0.f48488a;
            case 23:
                ((Integer) obj2).intValue();
                lt.b.b((jf) this.f2065b, (fz.c) this.f2066c, (fz.a) this.f2068e, (n) obj, t.M(this.f2067d | 1));
                return b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                ((Integer) obj2).intValue();
                mt.g.d((rt.p) this.f2065b, (fz.a) this.f2068e, (fz.c) this.f2066c, (n) obj, t.M(this.f2067d | 1));
                return b0.f48488a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((Integer) obj2).getClass();
                m3.j((n0) this.f2065b, (r) this.f2068e, (t1.d) this.f2066c, (n) obj, t.M(this.f2067d | 1));
                return b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                ((Integer) obj2).getClass();
                l5.e((v4) this.f2065b, (fz.a) this.f2068e, (r) this.f2066c, (n) obj, t.M(this.f2067d | 1));
                return b0.f48488a;
            case 27:
                ((Integer) obj2).getClass();
                n0.l.d((a0) this.f2065b, this.f2068e, this.f2067d, this.f2066c, (n) obj, t.M(1));
                return b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                ((Integer) obj2).getClass();
                ((x0) this.f2065b).c(this.f2068e, (t1.d) this.f2066c, (n) obj, t.M(this.f2067d | 1));
                return b0.f48488a;
            default:
                ((Integer) obj2).getClass();
                nv.r.m(this.f2067d, (sv.d) this.f2065b, (fz.a) this.f2068e, (fz.a) this.f2066c, (n) obj, t.M(3073));
                return b0.f48488a;
        }
    }

    public /* synthetic */ h(int i11, fz.a aVar, fz.c cVar, fz.c cVar2, int i12) {
        this.f2064a = 13;
        this.f2067d = i11;
        this.f2065b = aVar;
        this.f2066c = cVar;
        this.f2068e = cVar2;
    }

    public /* synthetic */ h(int i11, Object obj, fz.a aVar, qy.e eVar, int i12, int i13) {
        this.f2064a = i13;
        this.f2067d = i11;
        this.f2065b = obj;
        this.f2068e = aVar;
        this.f2066c = eVar;
    }

    public /* synthetic */ h(fz.a aVar, fz.a aVar2, js.y yVar, int i11, int i12) {
        this.f2064a = 11;
        this.f2065b = aVar;
        this.f2068e = aVar2;
        this.f2066c = yVar;
        this.f2067d = i11;
    }

    public /* synthetic */ h(Object obj, fz.c cVar, Object obj2, int i11, int i12) {
        this.f2064a = i12;
        this.f2065b = obj;
        this.f2066c = cVar;
        this.f2068e = obj2;
        this.f2067d = i11;
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i11, int i12) {
        this.f2064a = i12;
        this.f2065b = obj;
        this.f2068e = obj2;
        this.f2066c = obj3;
        this.f2067d = i11;
    }

    public /* synthetic */ h(a0 a0Var, Object obj, int i11, Object obj2, int i12) {
        this.f2064a = 27;
        this.f2065b = a0Var;
        this.f2068e = obj;
        this.f2067d = i11;
        this.f2066c = obj2;
    }

    public /* synthetic */ h(r rVar, e0.c cVar, fz.c cVar2, int i11, int i12) {
        this.f2064a = 7;
        this.f2065b = rVar;
        this.f2068e = cVar;
        this.f2066c = cVar2;
        this.f2067d = i12;
    }
}
