package js;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends xy.i implements fz.e {
    public int H;
    public final /* synthetic */ Set K;
    public final /* synthetic */ r L;
    public final /* synthetic */ LinkedHashMap M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f36802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f36803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f36804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f36805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36807f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f36808t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Set set, r rVar, LinkedHashMap linkedHashMap, vy.d dVar) {
        super(2, dVar);
        this.K = set;
        this.L = rVar;
        this.M = linkedHashMap;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new o(this.K, this.L, this.M, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0045  */
    /* JADX WARN: Code duplicated, block: B:13:0x006e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0073  */
    /* JADX WARN: Code duplicated, block: B:19:0x007f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0082  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x006c -> B:14:0x006f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            wy.a r0 = wy.a.COROUTINE_SUSPENDED
            int r1 = r12.H
            r2 = 1
            if (r1 == 0) goto L27
            if (r1 != r2) goto L1f
            int r1 = r12.f36808t
            int r3 = r12.f36807f
            int r4 = r12.f36806e
            java.lang.String r5 = r12.f36805d
            java.util.Iterator r6 = r12.f36804c
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.util.Collection r7 = r12.f36803b
            java.util.Collection r7 = (java.util.Collection) r7
            js.r r8 = r12.f36802a
            com.bumptech.glide.e.F(r13)
            goto L6f
        L1f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L27:
            com.bumptech.glide.e.F(r13)
            java.util.Set r13 = r12.K
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r13 = r13.iterator()
            r3 = 0
            js.r r4 = r12.L
            r6 = r13
            r7 = r1
            r1 = r3
            r8 = r4
            r4 = r1
        L3f:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L86
            java.lang.Object r13 = r6.next()
            r5 = r13
            java.lang.String r5 = (java.lang.String) r5
            hs.g r13 = r8.f36824o0
            long r9 = java.lang.Long.parseLong(r5)
            r12.f36802a = r8
            r11 = r7
            java.util.Collection r11 = (java.util.Collection) r11
            r12.f36803b = r11
            r11 = r6
            java.util.Iterator r11 = (java.util.Iterator) r11
            r12.f36804c = r11
            r12.f36805d = r5
            r12.f36806e = r4
            r12.f36807f = r3
            r12.f36808t = r1
            r12.H = r2
            java.lang.Object r13 = r13.c(r9, r12)
            if (r13 != r0) goto L6f
            return r0
        L6f:
            com.lingodeer.data.model.chinesetone.ChineseToneWord r13 = (com.lingodeer.data.model.chinesetone.ChineseToneWord) r13
            if (r13 == 0) goto L7f
            com.lingodeer.data.model.CourseWord r13 = r8.L(r13)
            if (r13 == 0) goto L7f
            qy.l r9 = new qy.l
            r9.<init>(r13, r5)
            goto L80
        L7f:
            r9 = 0
        L80:
            if (r9 == 0) goto L3f
            r7.add(r9)
            goto L3f
        L86:
            java.util.List r7 = (java.util.List) r7
            java.util.ArrayList r13 = new java.util.ArrayList
            r0 = 10
            int r0 = ry.n.W(r7, r0)
            r13.<init>(r0)
            java.util.Iterator r0 = r7.iterator()
        L97:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc0
            java.lang.Object r1 = r0.next()
            qy.l r1 = (qy.l) r1
            java.lang.Object r2 = r1.f48496b
            java.lang.String r2 = (java.lang.String) r2
            java.util.LinkedHashMap r3 = r12.M
            java.lang.Object r2 = r3.get(r2)
            com.lingodeer.data.model.uistate.CourseTestSummaryItemStatus r2 = (com.lingodeer.data.model.uistate.CourseTestSummaryItemStatus) r2
            if (r2 != 0) goto Lb3
            com.lingodeer.data.model.uistate.CourseTestSummaryItemStatus r2 = com.lingodeer.data.model.uistate.CourseTestSummaryItemStatus.CORRECT
        Lb3:
            com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType$WordType r3 = new com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType$WordType
            java.lang.Object r1 = r1.f48495a
            com.lingodeer.data.model.CourseWord r1 = (com.lingodeer.data.model.CourseWord) r1
            r3.<init>(r1, r2)
            r13.add(r3)
            goto L97
        Lc0:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: js.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
