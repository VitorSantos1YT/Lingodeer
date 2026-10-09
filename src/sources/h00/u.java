package h00;

import g00.d2;
import g00.k1;
import g00.l1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f29945a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k1 f29946b;

    static {
        e00.e eVar = e00.e.f24681k;
        if (oz.q.K0("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((q1.i) l1.f28432a.values()).iterator();
        while (((sy.f) it).hasNext()) {
            c00.a aVar = (c00.a) ((sy.d) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(aVar.getDescriptor().a())) {
                throw new IllegalArgumentException(oz.r.g0("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + kotlin.jvm.internal.z.a(aVar.getClass()).g() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        f29946b = new k1("kotlinx.serialization.json.JsonLiteral", eVar);
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        m mVarI = com.bumptech.glide.g.g(cVar).i();
        if (mVarI instanceof t) {
            return (t) mVarI;
        }
        throw i00.j.c(-1, mVarI.toString(), "Unexpected JSON element, expected JsonLiteral, had " + kotlin.jvm.internal.z.a(mVarI.getClass()));
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f29946b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        Double dValueOf;
        t value = (t) obj;
        kotlin.jvm.internal.m.f(value, "value");
        String str = value.f29944c;
        com.bumptech.glide.g.c(dVar);
        if (value.f29942a) {
            dVar.F(str);
            return;
        }
        e00.g gVar = value.f29943b;
        if (gVar != null) {
            dVar.u(gVar).F(str);
            return;
        }
        Long lU0 = oz.x.u0(str);
        if (lU0 != null) {
            dVar.C(lU0.longValue());
            return;
        }
        qy.w wVarH0 = ub.a.h0(str);
        if (wVarH0 != null) {
            dVar.u(d2.f28378b).C(wVarH0.f48512a);
            return;
        }
        Boolean bool = null;
        try {
            dValueOf = oz.w.i0(str) ? Double.valueOf(Double.parseDouble(str)) : null;
        } catch (NumberFormatException unused) {
        }
        if (dValueOf != null) {
            dVar.j(dValueOf.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else if (str.equals("false")) {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            dVar.o(bool.booleanValue());
        } else {
            dVar.F(str);
        }
    }
}
