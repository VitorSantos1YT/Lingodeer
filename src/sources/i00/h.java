package i00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends se.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.a f33905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.android.billingclient.api.h f33906b;

    public h(a.a aVar, h00.c json) {
        kotlin.jvm.internal.m.f(json, "json");
        this.f33905a = aVar;
        this.f33906b = json.f29917b;
    }

    @Override // se.p, f00.c
    public final byte A() {
        qy.s sVar;
        a.a aVar = this.f33905a;
        String strQ = aVar.q();
        try {
            kotlin.jvm.internal.m.f(strQ, "<this>");
            qy.u uVarG0 = ub.a.g0(strQ);
            if (uVarG0 != null) {
                int i11 = uVarG0.f48510a;
                sVar = Integer.compare(Integer.MIN_VALUE ^ i11, -2147483393) > 0 ? null : new qy.s((byte) i11);
            }
            if (sVar != null) {
                return sVar.f48508a;
            }
            oz.x.m0(strQ);
            throw null;
        } catch (IllegalArgumentException unused) {
            a.a.u(aVar, nv.p.q("Failed to parse type 'UByte' for input '", strQ, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // se.p, f00.c
    public final short B() {
        qy.z zVar;
        a.a aVar = this.f33905a;
        String strQ = aVar.q();
        try {
            kotlin.jvm.internal.m.f(strQ, "<this>");
            qy.u uVarG0 = ub.a.g0(strQ);
            if (uVarG0 != null) {
                int i11 = uVarG0.f48510a;
                zVar = Integer.compare(Integer.MIN_VALUE ^ i11, -2147418113) > 0 ? null : new qy.z((short) i11);
            }
            if (zVar != null) {
                return zVar.f48515a;
            }
            oz.x.m0(strQ);
            throw null;
        } catch (IllegalArgumentException unused) {
            a.a.u(aVar, nv.p.q("Failed to parse type 'UShort' for input '", strQ, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // f00.a
    public final com.android.billingclient.api.h a() {
        return this.f33906b;
    }

    @Override // se.p, f00.c
    public final int j() {
        a.a aVar = this.f33905a;
        String strQ = aVar.q();
        try {
            kotlin.jvm.internal.m.f(strQ, "<this>");
            qy.u uVarG0 = ub.a.g0(strQ);
            if (uVarG0 != null) {
                return uVarG0.f48510a;
            }
            oz.x.m0(strQ);
            throw null;
        } catch (IllegalArgumentException unused) {
            a.a.u(aVar, nv.p.q("Failed to parse type 'UInt' for input '", strQ, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // f00.a
    public final int n(e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // se.p, f00.c
    public final long o() {
        a.a aVar = this.f33905a;
        String strQ = aVar.q();
        try {
            kotlin.jvm.internal.m.f(strQ, "<this>");
            qy.w wVarH0 = ub.a.h0(strQ);
            if (wVarH0 != null) {
                return wVarH0.f48512a;
            }
            oz.x.m0(strQ);
            throw null;
        } catch (IllegalArgumentException unused) {
            a.a.u(aVar, nv.p.q("Failed to parse type 'ULong' for input '", strQ, '\''), 0, null, 6);
            throw null;
        }
    }
}
