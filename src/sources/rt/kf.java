package rt;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class kf extends xy.i implements fz.e {
    public final /* synthetic */ ArrayList H;
    public final /* synthetic */ mf K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mf f49994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f49995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ps.b f49996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ps.h f49997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f49998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f49999f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f50000t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf(ArrayList arrayList, mf mfVar, vy.d dVar) {
        super(2, dVar);
        this.H = arrayList;
        this.K = mfVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new kf(this.H, this.K, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((kf) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:18:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x007e A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:6:0x0018, B:19:0x0078, B:21:0x007e, B:16:0x005c, B:22:0x0088), top: B:28:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0088 A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:6:0x0018, B:19:0x0078, B:21:0x007e, B:16:0x005c, B:22:0x0088), top: B:28:0x0018 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0075 -> B:19:0x0078). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            wy.a r0 = wy.a.COROUTINE_SUSPENDED
            int r1 = r13.f50000t
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2b
            if (r1 != r3) goto L23
            float r1 = r13.f49999f
            int r4 = r13.f49998e
            ps.h r5 = r13.f49997d
            ps.b r6 = r13.f49996c
            java.util.Iterator r7 = r13.f49995b
            java.util.Iterator r7 = (java.util.Iterator) r7
            rt.mf r8 = r13.f49994a
            com.bumptech.glide.e.F(r14)     // Catch: java.lang.Throwable -> L20
            qy.o r14 = (qy.o) r14     // Catch: java.lang.Throwable -> L20
            java.lang.Object r14 = r14.f48498a     // Catch: java.lang.Throwable -> L20
            goto L78
        L20:
            r14 = move-exception
            goto L9a
        L23:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L2b:
            com.bumptech.glide.e.F(r14)
            java.util.ArrayList r14 = r13.H
            java.util.Iterator r14 = r14.iterator()
            r1 = 0
            rt.mf r4 = r13.K
            r7 = r14
            r8 = r4
            r4 = r1
        L3a:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto La7
            java.lang.Object r14 = r7.next()
            r6 = r14
            ps.b r6 = (ps.b) r6
            ps.h r5 = r6.f47127f
            long r9 = r6.f47122a
            float r1 = r6.f47128g
            java.util.LinkedHashSet r14 = r8.f50106t
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r9)
            r14.add(r11)
            ps.c r14 = ps.c.f47130a
            r8.c(r9, r14, r2)
            ot.l2 r14 = r8.f50102c     // Catch: java.lang.Throwable -> L20
            java.util.List r11 = r6.f47126e     // Catch: java.lang.Throwable -> L20
            r13.f49994a = r8     // Catch: java.lang.Throwable -> L20
            r12 = r7
            java.util.Iterator r12 = (java.util.Iterator) r12     // Catch: java.lang.Throwable -> L20
            r13.f49995b = r12     // Catch: java.lang.Throwable -> L20
            r13.f49996c = r6     // Catch: java.lang.Throwable -> L20
            r13.f49997d = r5     // Catch: java.lang.Throwable -> L20
            r13.f49998e = r4     // Catch: java.lang.Throwable -> L20
            r13.f49999f = r1     // Catch: java.lang.Throwable -> L20
            r13.f50000t = r3     // Catch: java.lang.Throwable -> L20
            java.lang.Object r14 = r14.a(r9, r11, r13)     // Catch: java.lang.Throwable -> L20
            if (r14 != r0) goto L78
            return r0
        L78:
            java.lang.Throwable r9 = qy.o.a(r14)     // Catch: java.lang.Throwable -> L20
            if (r9 != 0) goto L88
            qy.b0 r14 = (qy.b0) r14     // Catch: java.lang.Throwable -> L20
            long r9 = r6.f47122a     // Catch: java.lang.Throwable -> L20
            ps.f r14 = ps.f.f47133a     // Catch: java.lang.Throwable -> L20
            r8.c(r9, r14, r2)     // Catch: java.lang.Throwable -> L20
            goto L8d
        L88:
            long r9 = r6.f47122a     // Catch: java.lang.Throwable -> L20
            r8.c(r9, r5, r1)     // Catch: java.lang.Throwable -> L20
        L8d:
            java.util.LinkedHashSet r14 = r8.f50106t
            long r5 = r6.f47122a
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r5)
            r14.remove(r1)
            goto L3a
        L9a:
            java.util.LinkedHashSet r0 = r8.f50106t
            long r1 = r6.f47122a
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r1)
            r0.remove(r3)
            throw r14
        La7:
            qy.b0 r14 = qy.b0.f48488a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.kf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
