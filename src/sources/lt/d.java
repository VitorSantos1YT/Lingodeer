package lt;

import a0.f1;
import a0.l1;
import a0.m1;
import a0.o;
import a0.p0;
import a0.y;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.viewmodel.CreationExtras;
import b0.k2;
import com.google.api.Service;
import g2.t0;
import j9.q;
import j9.s;
import java.util.List;
import kotlin.jvm.internal.m;
import kv.j0;
import kv.l0;
import m0.p;
import m0.x;
import m0.z;
import oz.l;
import qy.b0;
import rt.n0;
import rt.y8;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40317a;

    public /* synthetic */ d(int i11) {
        this.f40317a = i11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f40317a;
        b0 b0Var = b0.f48488a;
        switch (i11) {
            case 0:
                ps.b it = (ps.b) obj;
                m.f(it, "it");
                return Long.valueOf(it.f47122a);
            case 1:
                j0 it2 = (j0) obj;
                m.f(it2, "it");
                return it2.f38762c;
            case 2:
                l0 it3 = (l0) obj;
                m.f(it3, "it");
                return it3.f38778b;
            case 3:
                List list = (List) obj;
                return new x(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 4:
                ((Integer) obj).getClass();
                p pVar = z.f40671a;
                return r.f50854a;
            case 5:
                ((Integer) obj).getClass();
                p pVar2 = z.f40671a;
                return -1;
            case 6:
                CreationExtras initializer = (CreationExtras) obj;
                m.f(initializer, "$this$initializer");
                return new m9.b(SavedStateHandleSupport.createSavedStateHandle(initializer));
            case 7:
                j9.z navOptions = (j9.z) obj;
                m.f(navOptions, "$this$navOptions");
                navOptions.f36279c = true;
                return b0Var;
            case 8:
                q destination = (q) obj;
                m.f(destination, "destination");
                s sVar = destination.f36243c;
                if (sVar == null || sVar.f36251f.f5b != destination.f36242b.f3958a) {
                    return null;
                }
                return sVar;
            case 9:
                q destination2 = (q) obj;
                m.f(destination2, "destination");
                s sVar2 = destination2.f36243c;
                if (sVar2 == null || sVar2.f36251f.f5b != destination2.f36242b.f3958a) {
                    return null;
                }
                return sVar2;
            case 10:
                q it4 = (q) obj;
                m.f(it4, "it");
                return Integer.valueOf(it4.f36242b.f3958a);
            case 11:
                m.f((lc.d) obj, "it");
                return b0Var;
            case 12:
                m.f((lc.d) obj, "it");
                return b0Var;
            case 13:
                return ((fv.a) obj).f28183b;
            case 14:
                rt.r it5 = (rt.r) obj;
                m.f(it5, "it");
                return it5.f50318a;
            case 15:
                t0 graphicsLayer = (t0) obj;
                m.f(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.b(0.7f);
                return b0Var;
            case 16:
                rt.r it6 = (rt.r) obj;
                m.f(it6, "it");
                return it6.f50318a;
            case 17:
                return String.valueOf(((Long) obj).longValue());
            case 18:
                j9.z navigate = (j9.z) obj;
                m.f(navigate, "$this$navigate");
                navigate.f36278b = true;
                return b0Var;
            case 19:
                j9.z navigate2 = (j9.z) obj;
                m.f(navigate2, "$this$navigate");
                navigate2.f36278b = true;
                return b0Var;
            case 20:
                y AnimatedContent = (y) obj;
                m.f(AnimatedContent, "$this$AnimatedContent");
                l1 l1VarP = f1.p(new k2(29), 1);
                m1 m1VarU = f1.u(new d(22), 1);
                int i12 = o.f152b;
                return new p0(l1VarP, m1VarU);
            case 21:
                n0 it7 = (n0) obj;
                m.f(it7, "it");
                return it7.f50109b.getId();
            case 22:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 23:
                return Integer.valueOf(-((Integer) obj).intValue());
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return Integer.valueOf(-((Integer) obj).intValue());
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                j9.z navigate3 = (j9.z) obj;
                m.f(navigate3, "$this$navigate");
                navigate3.f36278b = true;
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                j9.z navigate4 = (j9.z) obj;
                m.f(navigate4, "$this$navigate");
                navigate4.f36278b = true;
                return b0Var;
            case 27:
                l matchResult = (l) obj;
                m.f(matchResult, "matchResult");
                return "%" + ((oz.j) matchResult.a()).get(1) + "s";
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                y8 it8 = (y8) obj;
                m.f(it8, "it");
                return Boolean.valueOf(it8.f50699i);
            default:
                y8 it9 = (y8) obj;
                m.f(it9, "it");
                return ry.m.g0(it9.f50700j);
        }
    }
}
