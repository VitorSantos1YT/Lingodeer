package ff;

import java.util.HashMap;
import qy.l;
import ry.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final HashMap m = x.V(new l("embedding.weight", "embed.weight"), new l("dense1.weight", "fc1.weight"), new l("dense2.weight", "fc2.weight"), new l("dense3.weight", "fc3.weight"), new l("dense1.bias", "fc1.bias"), new l("dense2.bias", "fc2.bias"), new l("dense3.bias", "fc3.bias"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f27223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f27224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f27225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f27226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f27227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f27228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f27229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f27230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f27231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f27232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f27233k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f27234l;

    public b(HashMap map) {
        Object obj = map.get("embed.weight");
        if (obj == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f27223a = (a) obj;
        Object obj2 = map.get("convs.0.weight");
        if (obj2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f27224b = h.R((a) obj2);
        Object obj3 = map.get("convs.1.weight");
        if (obj3 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f27225c = h.R((a) obj3);
        Object obj4 = map.get("convs.2.weight");
        if (obj4 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f27226d = h.R((a) obj4);
        Object obj5 = map.get("convs.0.bias");
        if (obj5 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f27227e = (a) obj5;
        Object obj6 = map.get("convs.1.bias");
        if (obj6 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f27228f = (a) obj6;
        Object obj7 = map.get("convs.2.bias");
        if (obj7 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f27229g = (a) obj7;
        Object obj8 = map.get("fc1.weight");
        if (obj8 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f27230h = h.Q((a) obj8);
        Object obj9 = map.get("fc2.weight");
        if (obj9 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f27231i = h.Q((a) obj9);
        Object obj10 = map.get("fc1.bias");
        if (obj10 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f27232j = (a) obj10;
        Object obj11 = map.get("fc2.bias");
        if (obj11 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f27233k = (a) obj11;
        this.f27234l = new HashMap();
        for (String str : ry.l.m0(new String[]{d.MTML_INTEGRITY_DETECT.a(), d.MTML_APP_EVENT_PREDICTION.a()})) {
            String strM = defpackage.e.m(str, ".weight");
            String strM2 = defpackage.e.m(str, ".bias");
            a aVar = (a) map.get(strM);
            a aVar2 = (a) map.get(strM2);
            if (aVar != null) {
                this.f27234l.put(strM, h.Q(aVar));
            }
            if (aVar2 != null) {
                this.f27234l.put(strM2, aVar2);
            }
        }
    }

    public final a a(a aVar, String[] strArr, String str) {
        HashMap map = this.f27234l;
        if (!qf.a.b(this)) {
            try {
                a aVarH = h.h(h.n(strArr, this.f27223a), this.f27224b);
                h.d(aVarH, this.f27227e);
                h.K(aVarH);
                a aVarH2 = h.h(aVarH, this.f27225c);
                h.d(aVarH2, this.f27228f);
                h.K(aVarH2);
                a aVarD = h.D(aVarH2, 2);
                a aVarH3 = h.h(aVarD, this.f27226d);
                h.d(aVarH3, this.f27229g);
                h.K(aVarH3);
                a aVarD2 = h.D(aVarH, aVarH.f27220a[1]);
                a aVarD3 = h.D(aVarD, aVarD.f27220a[1]);
                a aVarD4 = h.D(aVarH3, aVarH3.f27220a[1]);
                h.o(aVarD2);
                h.o(aVarD3);
                h.o(aVarD4);
                a aVarK = h.k(h.g(new a[]{aVarD2, aVarD3, aVarD4, aVar}), this.f27230h, this.f27232j);
                h.K(aVarK);
                a aVarK2 = h.k(aVarK, this.f27231i, this.f27233k);
                h.K(aVarK2);
                a aVar2 = (a) map.get(str.concat(".weight"));
                a aVar3 = (a) map.get(str.concat(".bias"));
                if (aVar2 != null && aVar3 != null) {
                    a aVarK3 = h.k(aVarK2, aVar2, aVar3);
                    h.M(aVarK3);
                    return aVarK3;
                }
            } catch (Throwable th2) {
                qf.a.a(this, th2);
                return null;
            }
        }
        return null;
    }
}
