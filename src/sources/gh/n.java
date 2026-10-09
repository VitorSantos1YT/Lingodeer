package gh;

import java.util.List;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f29232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f29233d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, List list, vy.d dVar, int i11) {
        super(2, dVar);
        this.f29230a = i11;
        this.f29232c = oVar;
        this.f29233d = list;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f29230a) {
            case 0:
                return new n(this.f29232c, this.f29233d, dVar, 0);
            default:
                return new n(this.f29232c, this.f29233d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f29230a) {
            case 0:
                break;
        }
        return ((n) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e A[Catch: Exception -> 0x007c, TRY_LEAVE, TryCatch #0 {Exception -> 0x007c, blocks: (B:8:0x0018, B:25:0x0065, B:26:0x0067, B:29:0x006e, B:12:0x0022, B:18:0x003b, B:20:0x0043, B:22:0x0050, B:15:0x0029), top: B:47:0x0012 }] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r9 == r0) goto L24;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f29230a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.util.List r2 = r8.f29233d
            gh.o r3 = r8.f29232c
            r4 = 1
            r5 = 2
            r6 = 0
            switch(r0) {
                case 0: goto L7d;
                default: goto Le;
            }
        Le:
            wy.a r0 = wy.a.COROUTINE_SUSPENDED
            int r7 = r8.f29231b
            if (r7 == 0) goto L26
            if (r7 == r4) goto L22
            if (r7 != r5) goto L1c
            com.bumptech.glide.e.F(r9)     // Catch: java.lang.Exception -> L7c
            goto L65
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r1)
            throw r9
        L22:
            com.bumptech.glide.e.F(r9)     // Catch: java.lang.Exception -> L7c
            goto L3b
        L26:
            com.bumptech.glide.e.F(r9)
            r8.f29231b = r4     // Catch: java.lang.Exception -> L7c
            yz.f r9 = rz.o0.f50940a     // Catch: java.lang.Exception -> L7c
            yz.e r9 = yz.e.f58387a     // Catch: java.lang.Exception -> L7c
            gh.h r1 = new gh.h     // Catch: java.lang.Exception -> L7c
            r1.<init>(r5, r6)     // Catch: java.lang.Exception -> L7c
            java.lang.Object r9 = rz.e0.M(r9, r1, r8)     // Catch: java.lang.Exception -> L7c
            if (r9 != r0) goto L3b
            goto L63
        L3b:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L7c
            boolean r1 = r9.isEmpty()     // Catch: java.lang.Exception -> L7c
            if (r1 != 0) goto L50
            int r1 = r9.size()     // Catch: java.lang.Exception -> L7c
            java.util.List r4 = uh.a.f52967a     // Catch: java.lang.Exception -> L7c
            java.lang.Long[] r4 = c.a.n()     // Catch: java.lang.Exception -> L7c
            int r4 = r4.length     // Catch: java.lang.Exception -> L7c
            if (r1 == r4) goto L67
        L50:
            r8.f29231b = r5     // Catch: java.lang.Exception -> L7c
            yz.f r9 = rz.o0.f50940a     // Catch: java.lang.Exception -> L7c
            yz.e r9 = yz.e.f58387a     // Catch: java.lang.Exception -> L7c
            b0.a1 r1 = new b0.a1     // Catch: java.lang.Exception -> L7c
            r4 = 28
            r1.<init>(r3, r6, r4)     // Catch: java.lang.Exception -> L7c
            java.lang.Object r9 = rz.e0.M(r9, r1, r8)     // Catch: java.lang.Exception -> L7c
            if (r9 != r0) goto L65
        L63:
            r2 = r0
            goto L7c
        L65:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L7c
        L67:
            boolean r0 = r9.isEmpty()     // Catch: java.lang.Exception -> L7c
            if (r0 == 0) goto L6e
            goto L7c
        L6e:
            java.util.List r0 = gh.o.a(r3, r2, r9)     // Catch: java.lang.Exception -> L7c
            r2.size()     // Catch: java.lang.Exception -> L7c
            r9.size()     // Catch: java.lang.Exception -> L7c
            r0.size()     // Catch: java.lang.Exception -> L7c
            goto L63
        L7c:
            return r2
        L7d:
            wy.a r0 = wy.a.COROUTINE_SUSPENDED
            int r7 = r8.f29231b
            if (r7 == 0) goto L8f
            if (r7 != r4) goto L89
            com.bumptech.glide.e.F(r9)     // Catch: java.lang.Exception -> Lab
            goto La5
        L89:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r1)
            throw r9
        L8f:
            com.bumptech.glide.e.F(r9)
            r8.f29231b = r4     // Catch: java.lang.Exception -> Lab
            yz.f r9 = rz.o0.f50940a     // Catch: java.lang.Exception -> Lab
            yz.e r9 = yz.e.f58387a     // Catch: java.lang.Exception -> Lab
            gh.h r1 = new gh.h     // Catch: java.lang.Exception -> Lab
            r1.<init>(r5, r6)     // Catch: java.lang.Exception -> Lab
            java.lang.Object r9 = rz.e0.M(r9, r1, r8)     // Catch: java.lang.Exception -> Lab
            if (r9 != r0) goto La5
            r2 = r0
            goto Lab
        La5:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> Lab
            java.util.List r2 = gh.o.a(r3, r2, r9)     // Catch: java.lang.Exception -> Lab
        Lab:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gh.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
