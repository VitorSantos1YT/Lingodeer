package rt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ba extends xy.i implements fz.e {
    public int H;
    public int K;
    public final /* synthetic */ ArrayList L;
    public final /* synthetic */ wt.m M;
    public final /* synthetic */ LinkedHashMap N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wt.m f49529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f49530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f49531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f49532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f49533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f49534f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f49535t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(ArrayList arrayList, wt.m mVar, LinkedHashMap linkedHashMap, vy.d dVar) {
        super(2, dVar);
        this.L = arrayList;
        this.M = mVar;
        this.N = linkedHashMap;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new ba(this.L, this.M, this.N, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((ba) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004c  */
    /* JADX WARN: Code duplicated, block: B:13:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0082  */
    /* JADX WARN: Code duplicated, block: B:18:0x008c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
    /* JADX WARN: Code duplicated, block: B:22:0x0095  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x007b -> B:14:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x004c
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
            int r3 = r12.f49535t
            int r4 = r12.f49534f
            java.lang.String r5 = r12.f49533e
            java.util.Iterator r6 = r12.f49532d
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.util.Collection r7 = r12.f49531c
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.Map r8 = r12.f49530b
            wt.m r9 = r12.f49529a
            com.bumptech.glide.e.F(r13)
            goto L7e
        L21:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L29:
            com.bumptech.glide.e.F(r13)
            java.util.ArrayList r13 = r12.L
            java.util.List r13 = ry.m.j0(r13)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r13 = r13.iterator()
            r3 = 0
            wt.m r4 = r12.M
            java.util.LinkedHashMap r5 = r12.N
            r6 = r13
            r7 = r1
            r1 = r3
            r9 = r4
            r8 = r5
            r4 = r1
        L46:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L99
            java.lang.Object r13 = r6.next()
            r5 = r13
            java.lang.String r5 = (java.lang.String) r5
            long r10 = ef.e.o(r5)
            vt.i0 r13 = r9.f55309a
            bh.t r13 = (bh.t) r13
            uz.i r13 = r13.a(r10)
            r12.f49529a = r9
            r12.f49530b = r8
            r10 = r7
            java.util.Collection r10 = (java.util.Collection) r10
            r12.f49531c = r10
            r10 = r6
            java.util.Iterator r10 = (java.util.Iterator) r10
            r12.f49532d = r10
            r12.f49533e = r5
            r12.f49534f = r4
            r12.f49535t = r3
            r12.H = r1
            r12.K = r2
            java.lang.Object r13 = uz.x0.v(r13, r12)
            if (r13 != r0) goto L7e
            return r0
        L7e:
            com.lingodeer.data.model.CourseCharacter r13 = (com.lingodeer.data.model.CourseCharacter) r13
            if (r13 == 0) goto L92
            com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType$CharacterType r10 = new com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType$CharacterType
            java.lang.Object r5 = r8.get(r5)
            com.lingodeer.data.model.uistate.CourseTestSummaryItemStatus r5 = (com.lingodeer.data.model.uistate.CourseTestSummaryItemStatus) r5
            if (r5 != 0) goto L8e
            com.lingodeer.data.model.uistate.CourseTestSummaryItemStatus r5 = com.lingodeer.data.model.uistate.CourseTestSummaryItemStatus.CORRECT
        L8e:
            r10.<init>(r13, r5)
            goto L93
        L92:
            r10 = 0
        L93:
            if (r10 == 0) goto L46
            r7.add(r10)
            goto L46
        L99:
            java.util.List r7 = (java.util.List) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.ba.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
