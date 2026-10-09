package lw;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import r.x2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f40348h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f40349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f40350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[][] f40351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f40352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f40353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f40354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f40355g;

    static {
        x2 x2Var = new x2();
        x2Var.f48711c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        x2Var.f48712d = Collections.EMPTY_LIST;
        f40348h = new c(x2Var);
    }

    public c(x2 x2Var) {
        this.f40349a = (s) x2Var.f48709a;
        this.f40350b = (Executor) x2Var.f48710b;
        this.f40351c = (Object[][]) x2Var.f48711c;
        this.f40352d = (List) x2Var.f48712d;
        this.f40353e = (Boolean) x2Var.f48713e;
        this.f40354f = (Integer) x2Var.f48714f;
        this.f40355g = (Integer) x2Var.f48715t;
    }

    public static x2 b(c cVar) {
        x2 x2Var = new x2();
        x2Var.f48709a = cVar.f40349a;
        x2Var.f48710b = cVar.f40350b;
        x2Var.f48711c = cVar.f40351c;
        x2Var.f48712d = cVar.f40352d;
        x2Var.f48713e = cVar.f40353e;
        x2Var.f48714f = cVar.f40354f;
        x2Var.f48715t = cVar.f40355g;
        return x2Var;
    }

    public final Object a(lp.b bVar) {
        Preconditions.k(bVar, "key");
        int i11 = 0;
        while (true) {
            Object[][] objArr = this.f40351c;
            if (i11 >= objArr.length) {
                return null;
            }
            if (bVar.equals(objArr[i11][0])) {
                return objArr[i11][1];
            }
            i11++;
        }
    }

    public final c c(lp.b bVar, Object obj) {
        Object[][] objArr;
        Preconditions.k(bVar, "key");
        Preconditions.k(obj, "value");
        x2 x2VarB = b(this);
        int i11 = 0;
        while (true) {
            objArr = this.f40351c;
            if (i11 >= objArr.length) {
                i11 = -1;
                break;
            }
            if (bVar.equals(objArr[i11][0])) {
                break;
            }
            i11++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length + (i11 == -1 ? 1 : 0), 2);
        x2VarB.f48711c = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        if (i11 == -1) {
            ((Object[][]) x2VarB.f48711c)[objArr.length] = new Object[]{bVar, obj};
        } else {
            ((Object[][]) x2VarB.f48711c)[i11] = new Object[]{bVar, obj};
        }
        return new c(x2VarB);
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f40349a, "deadline");
        toStringHelperB.c(null, "authority");
        toStringHelperB.c(null, "callCredentials");
        Executor executor = this.f40350b;
        toStringHelperB.c(executor != null ? executor.getClass() : null, "executor");
        toStringHelperB.c(null, "compressorName");
        toStringHelperB.c(Arrays.deepToString(this.f40351c), "customOptions");
        toStringHelperB.d("waitForReady", Boolean.TRUE.equals(this.f40353e));
        toStringHelperB.c(this.f40354f, "maxInboundMessageSize");
        toStringHelperB.c(this.f40355g, "maxOutboundMessageSize");
        toStringHelperB.c(this.f40352d, "streamTracerFactories");
        return toStringHelperB.toString();
    }
}
