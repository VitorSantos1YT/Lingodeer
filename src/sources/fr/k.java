package fr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements vt.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.n0 f27639a;

    public k(vt.n0 n0Var) {
        this.f27639a = n0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        if (r10 == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r10, xy.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof fr.j
            if (r0 == 0) goto L13
            r0 = r12
            fr.j r0 = (fr.j) r0
            int r1 = r0.f27620d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27620d = r1
            goto L18
        L13:
            fr.j r0 = new fr.j
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f27618b
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f27620d
            r3 = 2
            r4 = 0
            qy.b0 r5 = qy.b0.f48488a
            vt.n0 r6 = r9.f27639a
            r7 = 1
            if (r2 == 0) goto L3e
            if (r2 == r7) goto L38
            if (r2 != r3) goto L30
            com.bumptech.glide.e.F(r12)
            goto La1
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            long r10 = r0.f27617a
            com.bumptech.glide.e.F(r12)
            goto L6d
        L3e:
            com.bumptech.glide.e.F(r12)
            r12 = r6
            fr.o0 r12 = (fr.o0) r12
            com.lingodeer.data.env.Env r2 = r12.f27733a
            java.lang.Boolean r2 = r2.hasFindPerfectTime
            java.lang.String r8 = "hasFindPerfectTime"
            kotlin.jvm.internal.m.e(r2, r8)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L54
            return r5
        L54:
            r0.f27617a = r10
            r0.f27620d = r7
            yz.f r2 = rz.o0.f50940a
            yz.e r2 = yz.e.f58387a
            fr.g0 r7 = new fr.g0
            r8 = 5
            r7.<init>(r8, r12, r4)
            java.lang.Object r12 = rz.e0.M(r2, r7, r0)
            if (r12 != r1) goto L69
            goto L6a
        L69:
            r12 = r5
        L6a:
            if (r12 != r1) goto L6d
            goto La0
        L6d:
            java.text.SimpleDateFormat r12 = new java.text.SimpleDateFormat
            java.lang.String r2 = "HH:mm"
            java.util.Locale r7 = java.util.Locale.getDefault()
            r12.<init>(r2, r7)
            java.util.Date r2 = new java.util.Date
            r2.<init>(r10)
            java.lang.String r12 = r12.format(r2)
            java.lang.String r2 = "format(...)"
            kotlin.jvm.internal.m.e(r12, r2)
            r0.f27617a = r10
            r0.f27620d = r3
            fr.o0 r6 = (fr.o0) r6
            yz.f r10 = rz.o0.f50940a
            yz.e r10 = yz.e.f58387a
            fr.i0 r11 = new fr.i0
            r2 = 7
            r11.<init>(r6, r12, r4, r2)
            java.lang.Object r10 = rz.e0.M(r10, r11, r0)
            if (r10 != r1) goto L9d
            goto L9e
        L9d:
            r10 = r5
        L9e:
            if (r10 != r1) goto La1
        La0:
            return r1
        La1:
            er.c.h()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.k.a(long, xy.c):java.lang.Object");
    }
}
