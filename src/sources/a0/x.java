package a0;

import l1.b3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f222b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(y yVar, int i11) {
        super(1);
        this.f221a = i11;
        this.f222b = yVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f221a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                y yVar = this.f222b;
                long j11 = iIntValue;
                return Integer.valueOf(((int) (y.d(yVar) >> 32)) - ((int) (yVar.f235b.a((j11 << 32) | (j11 & 4294967295L), y.d(yVar), v3.m.Ltr) >> 32)));
            default:
                int iIntValue2 = ((Number) obj).intValue();
                y yVar2 = this.f222b;
                b3 b3Var = (b3) yVar2.f237d.g(yVar2.f234a.f3461d.getValue());
                long j12 = b3Var != null ? ((v3.l) b3Var.getValue()).f53498a : 0L;
                long j13 = iIntValue2;
                return Integer.valueOf((-((int) (yVar2.f235b.a((j13 << 32) | (j13 & 4294967295L), j12, v3.m.Ltr) >> 32))) + ((int) (j12 >> 32)));
        }
    }
}
