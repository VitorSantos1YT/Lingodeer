package g00;

import androidx.drawerlayout.widget.ktFt.FpIL;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r1 extends j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r1 f28457c = new r1(s1.f28462a);

    @Override // g00.a
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.m.f(sArr, "<this>");
        return sArr.length;
    }

    @Override // g00.s, g00.a
    public final void f(f00.a aVar, int i11, Object obj) {
        q1 builder = (q1) obj;
        kotlin.jvm.internal.m.f(builder, "builder");
        short sH = aVar.h(this.f28425b, i11);
        builder.b(builder.d() + 1);
        short[] sArr = builder.f28453a;
        int i12 = builder.f28454b;
        builder.f28454b = i12 + 1;
        sArr[i12] = sH;
    }

    @Override // g00.a
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.m.f(sArr, "<this>");
        q1 q1Var = new q1();
        q1Var.f28453a = sArr;
        q1Var.f28454b = sArr.length;
        q1Var.b(10);
        return q1Var;
    }

    @Override // g00.j1
    public final Object j() {
        return new short[0];
    }

    @Override // g00.j1
    public final void k(f00.b encoder, Object obj, int i11) {
        short[] sArr = (short[]) obj;
        kotlin.jvm.internal.m.f(encoder, "encoder");
        kotlin.jvm.internal.m.f(sArr, FpIL.uKViDNkuztMVVK);
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.t(this.f28425b, i12, sArr[i12]);
        }
    }
}
