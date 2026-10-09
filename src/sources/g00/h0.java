package g00;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends f1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f28413l;

    public h0(String str, i0 i0Var) {
        super(str, i0Var, 1);
        this.f28413l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, qy.h] */
    @Override // g00.f1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            e00.g gVar = (e00.g) obj;
            if (this.f28389a.equals(gVar.a())) {
                h0 h0Var = (h0) obj;
                if (h0Var.f28413l && Arrays.equals((e00.g[]) this.f28398j.getValue(), (e00.g[]) h0Var.f28398j.getValue())) {
                    int iF = gVar.f();
                    int i11 = this.f28391c;
                    if (i11 == iF) {
                        for (int i12 = 0; i12 < i11; i12++) {
                            if (kotlin.jvm.internal.m.a(i(i12).a(), gVar.i(i12).a()) && kotlin.jvm.internal.m.a(i(i12).e(), gVar.i(i12).e())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // g00.f1
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // g00.f1, e00.g
    public final boolean isInline() {
        return this.f28413l;
    }
}
