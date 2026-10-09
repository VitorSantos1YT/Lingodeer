package av;

import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.DayStreakStatus;
import com.lingodeer.data.model.UserInfo;
import g2.k0;
import g2.t0;
import java.util.concurrent.atomic.AtomicBoolean;
import l1.b1;
import rt.j6;
import rt.x8;
import s0.o1;
import s0.s0;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3195b;

    public /* synthetic */ t() {
        this.f3194a = 10;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f3194a) {
            case 0:
                ((AtomicBoolean) this.f3195b).set(true);
                return qy.b0.f48488a;
            case 1:
                t0 graphicsLayer = (t0) obj;
                kotlin.jvm.internal.m.f(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.q(((Number) ((b0.d) this.f3195b).d()).floatValue());
                return qy.b0.f48488a;
            case 2:
                CourseWord it = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it, "it");
                jt.v vVar = (jt.v) this.f3195b;
                n nVar = vVar.f37211b;
                if (!nVar.f()) {
                    String strL = b7.e0.l(it, "toString(...)");
                    vVar.f37220k.setValue(strL);
                    nVar.h(strL);
                    vVar.f37223o.setValue(-1);
                    vVar.m.setValue(Boolean.FALSE);
                    b1 b1Var = vVar.f37226r;
                    if (!((Boolean) b1Var.getValue()).booleanValue()) {
                        b1Var.setValue(Boolean.TRUE);
                    }
                }
                return qy.b0.f48488a;
            case 3:
                UserInfo userInfo = (UserInfo) obj;
                kotlin.jvm.internal.m.f(userInfo, "userInfo");
                return UserInfo.copy$default(userInfo, null, 0, 0, 0, 0, 0, 0L, 0, 0L, null, null, null, null, null, null, null, null, 0, 0, 0, 0, ((DayStreakStatus) this.f3195b).getDayStreak(), 0, null, null, 31457279, null);
            case 4:
                String it2 = (String) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                ((ln.a) this.f3195b).a(it2);
                return qy.b0.f48488a;
            case 5:
                ((l1.h) this.f3195b).cancel();
                return qy.b0.f48488a;
            case 6:
                int iIntValue = ((Number) obj).intValue();
                i1 i1Var = ((qv.j) this.f3195b).f48444c;
                Integer numValueOf = Integer.valueOf(iIntValue);
                i1Var.getClass();
                i1Var.l(null, numValueOf);
                return qy.b0.f48488a;
            case 7:
                j6 candidate = (j6) obj;
                kotlin.jvm.internal.m.f(candidate, "candidate");
                return ry.m.g0(candidate.a((x8) this.f3195b));
            case 8:
                w2.x xVar = (w2.x) obj;
                o1 o1VarD = ((s0) this.f3195b).d();
                if (o1VarD != null) {
                    o1VarD.f51126c = xVar;
                }
                return qy.b0.f48488a;
            case 9:
                float[] fArr = ((k0) obj).f28579a;
                w2.x xVar2 = (w2.x) this.f3195b;
                if (xVar2.k()) {
                    w2.a0.h(xVar2).u(xVar2, fArr);
                }
                return qy.b0.f48488a;
            case 10:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                s2.z zVar = (s2.z) this.f3195b;
                if (zVar != null) {
                    zVar.f51375c = zBooleanValue;
                }
                return qy.b0.f48488a;
            case 11:
                String it3 = (String) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                ((wl.a) this.f3195b).a(it3);
                return qy.b0.f48488a;
            default:
                rz.m mVar = (rz.m) this.f3195b;
                qy.b0 b0Var = qy.b0.f48488a;
                mVar.resumeWith(b0Var);
                return b0Var;
        }
    }

    public /* synthetic */ t(Object obj, int i11) {
        this.f3194a = i11;
        this.f3195b = obj;
    }
}
