package bc;

import gc.l;
import java.util.ArrayList;
import java.util.List;
import kv.i0;
import rz.b0;
import wt.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends xy.i implements fz.e {
    public Object H;
    public Object K;
    public Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4105a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f4106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f4110f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f4111t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, a aVar, l lVar, List list, vb.c cVar, gc.i iVar, vy.d dVar) {
        super(2, dVar);
        this.L = gVar;
        this.M = aVar;
        this.H = lVar;
        this.f4110f = list;
        this.N = cVar;
        this.O = iVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4105a) {
            case 0:
                f fVar = new f((g) this.L, (a) this.M, (l) this.H, (List) this.f4110f, (vb.c) this.N, (gc.i) this.O, dVar);
                fVar.K = obj;
                return fVar;
            default:
                return new f((i0) this.M, (m) this.N, (ArrayList) this.O, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4105a) {
            case 0:
                break;
        }
        return ((f) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x006d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0113 A[LOOP:0: B:14:0x010d->B:16:0x0113, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:21:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:72:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x0692  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Integer, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0249 -> B:31:0x024d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x025c -> B:32:0x0254). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x04b4 -> B:73:0x061a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x056e -> B:73:0x061a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r107) {
        /*
            Method dump skipped, instruction units count: 1796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bc.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i0 i0Var, m mVar, ArrayList arrayList, vy.d dVar) {
        super(2, dVar);
        this.M = i0Var;
        this.N = mVar;
        this.O = arrayList;
    }
}
