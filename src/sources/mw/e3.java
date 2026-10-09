package mw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f42407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f42408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f42409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x4 f42410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f42411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f42412f;

    public e3(c3 c3Var, HashMap map, HashMap map2, x4 x4Var, Object obj, Map map3) {
        this.f42407a = c3Var;
        this.f42408b = Collections.unmodifiableMap(new HashMap(map));
        this.f42409c = Collections.unmodifiableMap(new HashMap(map2));
        this.f42410d = x4Var;
        this.f42411e = obj;
        this.f42412f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    public static e3 a(Map map, boolean z11, int i11, int i12, Object obj) {
        x4 x4Var;
        Map mapG;
        x4 x4Var2;
        if (z11) {
            if (map == null || (mapG = e2.g("retryThrottling", map)) == null) {
                x4Var2 = null;
            } else {
                float fFloatValue = e2.e("maxTokens", mapG).floatValue();
                float fFloatValue2 = e2.e("tokenRatio", mapG).floatValue();
                Preconditions.p("maxToken should be greater than zero", fFloatValue > CropImageView.DEFAULT_ASPECT_RATIO);
                Preconditions.p("tokenRatio should be greater than zero", fFloatValue2 > CropImageView.DEFAULT_ASPECT_RATIO);
                x4Var2 = new x4(fFloatValue, fFloatValue2);
            }
            x4Var = x4Var2;
        } else {
            x4Var = null;
        }
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Map mapG2 = map == null ? null : e2.g("healthCheckConfig", map);
        List<Map> listC = e2.c("methodConfig", map);
        if (listC == null) {
            listC = null;
        } else {
            e2.a(listC);
        }
        if (listC == null) {
            return new e3(null, map2, map3, x4Var, obj, mapG2);
        }
        c3 c3Var = null;
        for (Map map4 : listC) {
            c3 c3Var2 = new c3(map4, z11, i11, i12);
            List<Map> listC2 = e2.c("name", map4);
            if (listC2 == null) {
                listC2 = null;
            } else {
                e2.a(listC2);
            }
            if (listC2 != null && !listC2.isEmpty()) {
                for (Map map5 : listC2) {
                    String strH = e2.h("service", map5);
                    String strH2 = e2.h("method", map5);
                    if (Strings.b(strH)) {
                        Preconditions.f("missing service name for method %s", Strings.b(strH2), strH2);
                        Preconditions.f("Duplicate default method config in service config %s", c3Var == null, map);
                        c3Var = c3Var2;
                    } else if (Strings.b(strH2)) {
                        Preconditions.f("Duplicate service %s", !map3.containsKey(strH), strH);
                        map3.put(strH, c3Var2);
                    } else {
                        String strA = lw.e1.a(strH, strH2);
                        Preconditions.f("Duplicate method name %s", !map2.containsKey(strA), strA);
                        map2.put(strA, c3Var2);
                    }
                }
            }
        }
        return new e3(c3Var, map2, map3, x4Var, obj, mapG2);
    }

    public final d3 b() {
        if (this.f42409c.isEmpty() && this.f42408b.isEmpty() && this.f42407a == null) {
            return null;
        }
        return new d3(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e3.class == obj.getClass()) {
            e3 e3Var = (e3) obj;
            if (Objects.a(this.f42407a, e3Var.f42407a) && Objects.a(this.f42408b, e3Var.f42408b) && Objects.a(this.f42409c, e3Var.f42409c) && Objects.a(this.f42410d, e3Var.f42410d) && Objects.a(this.f42411e, e3Var.f42411e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42407a, this.f42408b, this.f42409c, this.f42410d, this.f42411e});
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f42407a, "defaultMethodConfig");
        toStringHelperB.c(this.f42408b, "serviceMethodMap");
        toStringHelperB.c(this.f42409c, "serviceMap");
        toStringHelperB.c(this.f42410d, "retryThrottling");
        toStringHelperB.c(this.f42411e, "loadBalancingConfig");
        return toStringHelperB.toString();
    }
}
