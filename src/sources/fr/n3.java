package fr;

import com.lingodeer.data.model.ReviewStatus;
import com.lingodeer.data.model.ReviewStatusKt;
import com.lingodeer.database.model.ReviewStatusEntity;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n3 implements vt.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final au.z0 f27724a;

    public n3(au.z0 z0Var) {
        this.f27724a = z0Var;
    }

    public final Object a(ReviewStatus reviewStatus, int i11, xy.c cVar) {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        if (i11 == -2) {
            str = "B";
        } else if (i11 != -1) {
            str = i11 != 0 ? "D" : "C";
        } else {
            str = "A";
        }
        ReviewStatus reviewStatusCopy$default = ReviewStatus.copy$default(reviewStatus, null, 0L, 0L, 0, jCurrentTimeMillis, str, 15, null);
        Objects.toString(reviewStatusCopy$default);
        ReviewStatusEntity reviewStatusEntityAsEntityModel = ReviewStatusKt.asEntityModel(reviewStatusCopy$default);
        au.z0 z0Var = this.f27724a;
        Object objC = cf.x.C(cVar, z0Var.f3103a, false, true, new au.b(27, z0Var, reviewStatusEntityAsEntityModel));
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        qy.b0 b0Var = qy.b0.f48488a;
        if (objC != aVar) {
            objC = b0Var;
        }
        return objC == aVar ? objC : b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b8, code lost:
    
        if (a(r2, r5, r3) == r4) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r21, long r22, xy.c r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r24
            boolean r3 = r2 instanceof fr.m3
            if (r3 == 0) goto L19
            r3 = r2
            fr.m3 r3 = (fr.m3) r3
            int r4 = r3.f27705e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f27705e = r4
            goto L1e
        L19:
            fr.m3 r3 = new fr.m3
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f27703c
            wy.a r4 = wy.a.COROUTINE_SUSPENDED
            int r5 = r3.f27705e
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L43
            if (r5 == r7) goto L39
            if (r5 != r6) goto L31
            com.bumptech.glide.e.F(r2)
            goto Lbb
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            long r7 = r3.f27702b
            java.lang.String r1 = r3.f27701a
            com.bumptech.glide.e.F(r2)
            r9 = r7
        L41:
            r8 = r1
            goto L71
        L43:
            com.bumptech.glide.e.F(r2)
            au.z0 r2 = r0.f27724a
            java.lang.String r5 = "id"
            kotlin.jvm.internal.m.f(r1, r5)
            w9.s r2 = r2.f3103a
            java.lang.String r5 = "review_status"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            au.f r8 = new au.f
            r9 = 19
            r8.<init>(r1, r9)
            no.g r2 = qx.p.l(r2, r5, r8)
            r3.f27701a = r1
            r8 = r22
            r3.f27702b = r8
            r3.f27705e = r7
            java.lang.Object r2 = uz.x0.u(r2, r3)
            if (r2 != r4) goto L6f
            goto Lba
        L6f:
            r9 = r8
            goto L41
        L71:
            com.lingodeer.database.model.ReviewStatusEntity r2 = (com.lingodeer.database.model.ReviewStatusEntity) r2
            r1 = 0
            if (r2 == 0) goto L7b
            com.lingodeer.data.model.ReviewStatus r2 = com.lingodeer.data.model.ReviewStatusKt.asExternalModel(r2)
            goto L7c
        L7b:
            r2 = r1
        L7c:
            long r11 = ef.e.o(r8)
            int r13 = ef.e.p(r8)
            r5 = -2
            r17 = -1
            r19 = 0
            if (r2 != 0) goto L9e
            com.lingodeer.data.model.ReviewStatus r7 = new com.lingodeer.data.model.ReviewStatus
            r14 = 0
            java.lang.String r16 = ""
            r7.<init>(r8, r9, r11, r13, r14, r16)
            int r2 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r2 == 0) goto L9a
            r2 = r7
            goto Lae
        L9a:
            r2 = r7
        L9b:
            r5 = r19
            goto Lae
        L9e:
            int r7 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r7 == 0) goto L9b
            java.lang.String r7 = r2.getStatus()
            java.lang.String r8 = "B"
            boolean r7 = kotlin.jvm.internal.m.a(r7, r8)
            if (r7 == 0) goto L9b
        Lae:
            r3.f27701a = r1
            r3.f27702b = r9
            r3.f27705e = r6
            java.lang.Object r1 = r0.a(r2, r5, r3)
            if (r1 != r4) goto Lbb
        Lba:
            return r4
        Lbb:
            qy.b0 r1 = qy.b0.f48488a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.n3.b(java.lang.String, long, xy.c):java.lang.Object");
    }
}
