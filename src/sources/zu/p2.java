package zu;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p2 implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uz.j f59524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s2 f59525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f59526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f59527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f59528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f59529f;

    public p2(uz.j jVar, s2 s2Var, int i11, int i12, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.f59524a = jVar;
        this.f59525b = s2Var;
        this.f59526c = i11;
        this.f59527d = i12;
        this.f59528e = linkedHashMap;
        this.f59529f = linkedHashMap2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
    
        if (r2.emit(r4, r0) == r1) goto L22;
     */
    @Override // uz.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r13, vy.d r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof zu.o2
            if (r0 == 0) goto L13
            r0 = r14
            zu.o2 r0 = (zu.o2) r0
            int r1 = r0.f59512b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59512b = r1
            goto L18
        L13:
            zu.o2 r0 = new zu.o2
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f59511a
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f59512b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            com.bumptech.glide.e.F(r14)
            goto Laa
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            int r13 = r0.f59516f
            java.util.List r2 = r0.f59515e
            uz.j r4 = r0.f59514d
            com.bumptech.glide.e.F(r14)
            r7 = r2
            r2 = r4
            goto L65
        L3f:
            com.bumptech.glide.e.F(r14)
            r2 = r13
            java.util.List r2 = (java.util.List) r2
            zu.s2 r13 = r12.f59525b
            vt.h1 r13 = r13.f59555a
            fr.x4 r13 = (fr.x4) r13
            gp.r r13 = r13.n()
            uz.j r14 = r12.f59524a
            r0.f59514d = r14
            r0.f59515e = r2
            r5 = 0
            r0.f59516f = r5
            r0.f59512b = r4
            java.lang.Object r13 = uz.x0.u(r13, r0)
            if (r13 != r1) goto L61
            goto La9
        L61:
            r7 = r2
            r2 = r14
            r14 = r13
            r13 = r5
        L65:
            com.lingodeer.data.model.UserInfo r14 = (com.lingodeer.data.model.UserInfo) r14
            zu.a0 r4 = new zu.a0
            int r5 = r14.getTotalXP()
            int r6 = r14.getTotalTime()
            java.util.LinkedHashMap r14 = r12.f59528e
            java.util.List r14 = ry.x.f0(r14)
            ua.e r8 = new ua.e
            r9 = 13
            r8.<init>(r9)
            java.util.List r10 = ry.m.S0(r14, r8)
            java.util.LinkedHashMap r14 = r12.f59529f
            java.util.List r14 = ry.x.f0(r14)
            ua.e r8 = new ua.e
            r9 = 14
            r8.<init>(r9)
            java.util.List r11 = ry.m.S0(r14, r8)
            int r8 = r12.f59526c
            int r9 = r12.f59527d
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r14 = 0
            r0.f59514d = r14
            r0.f59515e = r14
            r0.f59516f = r13
            r0.f59512b = r3
            java.lang.Object r13 = r2.emit(r4, r0)
            if (r13 != r1) goto Laa
        La9:
            return r1
        Laa:
            qy.b0 r13 = qy.b0.f48488a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: zu.p2.emit(java.lang.Object, vy.d):java.lang.Object");
    }
}
