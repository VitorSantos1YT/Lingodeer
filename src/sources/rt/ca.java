package rt;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ca extends xy.i implements fz.e {
    public int H;
    public int K;
    public final /* synthetic */ List L;
    public final /* synthetic */ wt.m M;
    public final /* synthetic */ Map N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wt.m f49578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f49579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f49580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f49581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f49582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f49583f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f49584t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(List list, wt.m mVar, Map map, vy.d dVar) {
        super(2, dVar);
        this.L = list;
        this.M = mVar;
        this.N = map;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new ca(this.L, this.M, this.N, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((ca) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0079 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x007f  */
    /* JADX WARN: Code duplicated, block: B:20:0x008f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0096  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0077 -> B:14:0x007a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:20:0x008f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            wy.a r0 = wy.a.COROUTINE_SUSPENDED
            int r1 = r12.K
            r2 = 1
            if (r1 == 0) goto L29
            if (r1 != r2) goto L21
            int r1 = r12.H
            int r3 = r12.f49584t
            int r4 = r12.f49583f
            java.lang.String r5 = r12.f49582e
            java.util.Iterator r6 = r12.f49581d
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.util.Collection r7 = r12.f49580c
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.Map r8 = r12.f49579b
            wt.m r9 = r12.f49578a
            com.bumptech.glide.e.F(r13)
            goto L7a
        L21:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L29:
            com.bumptech.glide.e.F(r13)
            java.util.List r13 = r12.L
            java.util.List r13 = ry.m.j0(r13)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r13 = r13.iterator()
            r3 = 0
            wt.m r4 = r12.M
            java.util.Map r5 = r12.N
            r6 = r13
            r7 = r1
            r1 = r3
            r9 = r4
            r8 = r5
            r4 = r1
        L46:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L9a
            java.lang.Object r13 = r6.next()
            r5 = r13
            java.lang.String r5 = (java.lang.String) r5
            long r10 = ef.e.o(r5)
            gp.r r13 = r9.g(r10)
            r12.f49578a = r9
            r12.f49579b = r8
            r10 = r7
            java.util.Collection r10 = (java.util.Collection) r10
            r12.f49580c = r10
            r10 = r6
            java.util.Iterator r10 = (java.util.Iterator) r10
            r12.f49581d = r10
            r12.f49582e = r5
            r12.f49583f = r4
            r12.f49584t = r3
            r12.H = r1
            r12.K = r2
            java.lang.Object r13 = uz.x0.v(r13, r12)
            if (r13 != r0) goto L7a
            return r0
        L7a:
            com.lingodeer.data.model.CourseWord r13 = (com.lingodeer.data.model.CourseWord) r13
            r10 = 0
            if (r13 == 0) goto L94
            boolean r11 = com.lingodeer.data.model.WordSentenceSourceKt.isPronunciation(r13)
            if (r11 != 0) goto L94
            com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType$WordType r10 = new com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType$WordType
            java.lang.Object r5 = r8.get(r5)
            com.lingodeer.data.model.uistate.CourseTestSummaryItemStatus r5 = (com.lingodeer.data.model.uistate.CourseTestSummaryItemStatus) r5
            if (r5 != 0) goto L91
            com.lingodeer.data.model.uistate.CourseTestSummaryItemStatus r5 = com.lingodeer.data.model.uistate.CourseTestSummaryItemStatus.CORRECT
        L91:
            r10.<init>(r13, r5)
        L94:
            if (r10 == 0) goto L46
            r7.add(r10)
            goto L46
        L9a:
            java.util.List r7 = (java.util.List) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.ca.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
