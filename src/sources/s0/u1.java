package s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b.a f51205a = new b.a(o3.o.f44688a, 0, 0);

    public static final o3.d0 a(o3.f0 f0Var, j3.h hVar) {
        o3.d0 d0VarA = f0Var.a(hVar);
        int length = hVar.f35700b.length();
        j3.h hVar2 = d0VarA.f44670a;
        o3.p pVar = d0VarA.f44671b;
        int length2 = hVar2.f35700b.length();
        int iMin = Math.min(length, 100);
        for (int i11 = 0; i11 < iMin; i11++) {
            b(pVar.s(i11), length2, i11);
        }
        b(pVar.s(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i12 = 0; i12 < iMin2; i12++) {
            c(pVar.f(i12), length, i12);
        }
        c(pVar.f(length2), length, length2);
        return new o3.d0(hVar2, new b.a(pVar, hVar.f35700b.length(), hVar2.f35700b.length()));
    }

    public static final void b(int i11, int i12, int i13) {
        boolean z11 = false;
        if (i11 >= 0 && i11 <= i12) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        StringBuilder sbK = w4.c.k("OffsetMapping.originalToTransformed returned invalid mapping: ", i13, " -> ", i11, " is not in range of transformed text [0, ");
        sbK.append(i12);
        sbK.append(']');
        i0.a.c(sbK.toString());
    }

    public static final void c(int i11, int i12, int i13) {
        boolean z11 = false;
        if (i11 >= 0 && i11 <= i12) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        StringBuilder sbK = w4.c.k("OffsetMapping.transformedToOriginal returned invalid mapping: ", i13, " -> ", i11, " is not in range of original text [0, ");
        sbK.append(i12);
        sbK.append(']');
        i0.a.c(sbK.toString());
    }
}
