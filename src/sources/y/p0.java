package y;

import android.content.res.Resources;
import android.graphics.Rect;
import androidx.compose.ui.platform.AndroidComposeView;
import bt.j1;
import com.adjust.sdk.Constants;
import java.net.URLEncoder;
import java.util.Map;
import l1.b1;
import org.json.JSONObject;
import w2.v1;
import w2.w1;
import w2.x1;
import w2.y1;
import y2.i2;
import y2.k1;
import z2.l1;
import z2.m1;
import z2.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f56749b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Object obj, int i11) {
        super(1);
        this.f56748a = i11;
        this.f56749b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [w2.g1, y2.a] */
    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f56748a;
        int i12 = 0;
        vy.d dVar = null;
        int i13 = 1;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj2 = this.f56749b;
        switch (i11) {
            case 0:
                return obj == ((f0) obj2) ? "(this)" : String.valueOf(obj);
            case 1:
                return obj == ((j0) obj2) ? "(this)" : String.valueOf(obj);
            case 2:
                y2.a aVar = (y2.a) obj;
                y2.j0 j0Var = (y2.j0) obj2;
                if (aVar.q() != Integer.MAX_VALUE) {
                    if (aVar.a().f56921b) {
                        aVar.L();
                    }
                    for (Map.Entry entry : aVar.a().f56928i.entrySet()) {
                        y2.j0.a(j0Var, (w2.n) entry.getKey(), ((Number) entry.getValue()).intValue(), aVar.e());
                    }
                    k1 k1Var = aVar.e().S;
                    kotlin.jvm.internal.m.c(k1Var);
                    while (!k1Var.equals(j0Var.f56920a.e())) {
                        for (w2.n nVar : j0Var.b(k1Var).keySet()) {
                            y2.j0.a(j0Var, nVar, j0Var.c(k1Var, nVar), k1Var);
                        }
                        k1Var = k1Var.S;
                        kotlin.jvm.internal.m.c(k1Var);
                    }
                }
                return b0Var;
            case 3:
                ((n1.e) obj2).c((z1.p) obj);
                return Boolean.TRUE;
            case 4:
                ((y2.i0) obj2).c0((v3.c) obj);
                return b0Var;
            case 5:
                f2.c cVar = (f2.c) obj;
                y3.l lVar = (y3.l) obj2;
                if (lVar.P) {
                    rz.e0.B(lVar.H0(), null, null, new xg.b(i13, lVar, cVar, dVar), 3);
                }
                return b0Var;
            case 6:
                return Boolean.valueOf(((e2.e0) obj).Z0(((e2.f) obj2).f24711a));
            case 7:
                y2.n0 n0Var = (y2.n0) obj;
                AndroidComposeView androidComposeView = ((z2.j) obj2).R;
                if (androidComposeView.getInsetsListener().f54574t.l() > 0) {
                    x xVar = x1.f54603a;
                    n0Var.f56976a = true;
                    y2.q0 q0Var = n0Var.f56979d;
                    w2.x xVarH0 = q0Var.H0();
                    if (v3.j.c(n0Var.f56977b, 9223372034707292159L)) {
                        n0Var.f56977b = ew.a.B(xVarH0.x(0L));
                        n0Var.f56978c = xVarH0.m();
                    }
                    q0Var.J0().f56893j0.b();
                    long jM = xVarH0.m();
                    i0 i0Var = androidComposeView.getInsetsListener().f54573f;
                    int i14 = (int) (jM >> 32);
                    int i15 = (int) (jM & 4294967295L);
                    for (v1 v1Var : x1.f54604b) {
                        Object objG = i0Var.g(v1Var);
                        kotlin.jvm.internal.m.c(objG);
                        y1 y1Var = (y1) objG;
                        w1 w1Var = (w1) v1Var;
                        x1.a(n0Var, w1Var.f54600c, y1Var.f54613h, i14, i15);
                        if (((Boolean) y1Var.f54607b.getValue()).booleanValue()) {
                            x1.a(n0Var, y1Var.f54611f, y1Var.f54615j, i14, i15);
                            x1.a(n0Var, y1Var.f54612g, y1Var.f54616k, i14, i15);
                        }
                        x1.a(n0Var, w1Var.f54601d, y1Var.f54614i, i14, i15);
                    }
                    e0 e0Var = androidComposeView.getInsetsListener().H;
                    if (e0Var.i()) {
                        x1.p pVar = androidComposeView.getInsetsListener().K;
                        Object[] objArr = e0Var.f56686a;
                        int i16 = e0Var.f56687b;
                        while (i12 < i16) {
                            b1 b1Var = (b1) objArr[i12];
                            w2.q qVar = (w2.q) pVar.get(i12);
                            Rect rect = (Rect) b1Var.getValue();
                            n0Var.a(qVar.b(), rect.left);
                            n0Var.a(qVar.d(), rect.top);
                            n0Var.a(qVar.c(), rect.right);
                            n0Var.a(qVar.a(), rect.bottom);
                            i12++;
                        }
                    }
                }
                return b0Var;
            case 8:
                return Boolean.valueOf(((m) obj2).a(((g3.t) obj).f28702g));
            case 9:
                return Boolean.valueOf(z2.g0.l((g3.t) obj, (Resources) obj2));
            case 10:
                return new j1((z2.j1) obj2, 17);
            case 11:
                if (l1.f58611b.compareAndSet(false, true)) {
                    ((tz.h) obj2).i(b0Var);
                }
                return b0Var;
            case 12:
                i2.d dVar2 = (i2.d) obj;
                g2.v vVarX = dVar2.j0().x();
                fz.e eVar = ((m1) obj2).f58621d;
                if (eVar != null) {
                    eVar.invoke(vVarX, (j2.c) dVar2.j0().f56175c);
                }
                return b0Var;
            case 13:
                o3.l lVar2 = (o3.l) obj;
                b1.x xVar2 = lVar2.f44687b;
                if (xVar2 != null) {
                    lVar2.a(xVar2);
                    lVar2.f44687b = null;
                }
                q1 q1Var = (q1) obj2;
                n1.e eVar2 = q1Var.f58656d;
                Object[] objArr2 = eVar2.f43112a;
                int i17 = eVar2.f43114c;
                while (true) {
                    if (i12 >= i17) {
                        i12 = -1;
                    } else if (!kotlin.jvm.internal.m.a((i2) objArr2[i12], lVar2)) {
                        i12++;
                    }
                }
                if (i12 >= 0) {
                    eVar2.l(i12);
                }
                if (eVar2.f43114c == 0) {
                    q1Var.f58654b.invoke();
                }
                return b0Var;
            default:
                String str = (String) obj;
                Object objOpt = ((JSONObject) obj2).opt(str);
                if (objOpt == null) {
                    return null;
                }
                try {
                    return URLEncoder.encode(str, Constants.ENCODING) + '=' + URLEncoder.encode(objOpt.toString(), Constants.ENCODING);
                } catch (Exception unused) {
                    return null;
                }
        }
    }
}
