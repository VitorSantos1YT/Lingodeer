package sw;

import com.google.common.base.Preconditions;
import java.util.List;
import java.util.Map;
import lw.g1;
import lw.q0;
import lw.q1;
import lw.r0;
import lw.s0;
import mw.e2;
import mw.i5;
import mw.j5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends r0 {
    public static g1 t(Map map) {
        ob.i iVar;
        dm.c cVar;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Long lI = e2.i("interval", map);
        Long lI2 = e2.i("baseEjectionTime", map);
        Long lI3 = e2.i("maxEjectionTime", map);
        Integer numF = e2.f("maxEjectionPercentage", map);
        Long l9 = lI != null ? lI : 10000000000L;
        Long l11 = lI2 != null ? lI2 : 30000000000L;
        Long l12 = lI3 != null ? lI3 : 300000000000L;
        Integer num8 = numF != null ? numF : 10;
        Map mapG = e2.g("successRateEjection", map);
        List list = null;
        if (mapG != null) {
            Integer numF2 = e2.f("stdevFactor", mapG);
            Integer numF3 = e2.f("enforcementPercentage", mapG);
            Integer numF4 = e2.f("minimumHosts", mapG);
            Integer numF5 = e2.f("requestVolume", mapG);
            Integer num9 = numF2 != null ? numF2 : 1900;
            if (numF3 != null) {
                Preconditions.g(numF3.intValue() >= 0 && numF3.intValue() <= 100);
                num5 = numF3;
            } else {
                num5 = 100;
            }
            if (numF4 != null) {
                Preconditions.g(numF4.intValue() >= 0);
                num6 = numF4;
            } else {
                num6 = 5;
            }
            if (numF5 != null) {
                Preconditions.g(numF5.intValue() >= 0);
                num7 = numF5;
            } else {
                num7 = 100;
            }
            iVar = new ob.i(num9, num5, num6, num7, 14);
        } else {
            iVar = null;
        }
        Map mapG2 = e2.g("failurePercentageEjection", map);
        if (mapG2 != null) {
            Integer numF6 = e2.f("threshold", mapG2);
            Integer numF7 = e2.f("enforcementPercentage", mapG2);
            Integer numF8 = e2.f("minimumHosts", mapG2);
            Integer numF9 = e2.f("requestVolume", mapG2);
            if (numF6 != null) {
                Preconditions.g(numF6.intValue() >= 0 && numF6.intValue() <= 100);
                num = numF6;
            } else {
                num = 85;
            }
            if (numF7 != null) {
                Preconditions.g(numF7.intValue() >= 0 && numF7.intValue() <= 100);
                num2 = numF7;
            } else {
                num2 = 100;
            }
            if (numF8 != null) {
                Preconditions.g(numF8.intValue() >= 0);
                num3 = numF8;
            } else {
                num3 = 5;
            }
            if (numF9 != null) {
                Preconditions.g(numF9.intValue() >= 0);
                num4 = numF9;
            } else {
                num4 = 50;
            }
            cVar = new dm.c(num, num2, num3, num4, 16);
        } else {
            cVar = null;
        }
        List listC = e2.c("childPolicy", map);
        if (listC != null) {
            e2.a(listC);
            list = listC;
        }
        List listU = j5.u(list);
        if (listU == null || listU.isEmpty()) {
            return new g1(q1.f40441l.h("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        g1 g1VarT = j5.t(listU, s0.a());
        if (g1VarT.f40389a != null) {
            return g1VarT;
        }
        i5 i5Var = (i5) g1VarT.f40390b;
        Preconditions.r(i5Var != null);
        Preconditions.r(i5Var != null);
        return new g1(new p(l9, l11, l12, num8, iVar, cVar, i5Var));
    }

    @Override // lw.y
    public final q0 g(lw.f fVar) {
        return new v(fVar);
    }

    @Override // lw.r0
    public final String r() {
        return "outlier_detection_experimental";
    }

    @Override // lw.r0
    public final g1 s(Map map) {
        try {
            return t(map);
        } catch (RuntimeException e8) {
            return new g1(q1.m.g(e8).h("Failed parsing configuration for outlier_detection_experimental"));
        }
    }
}
