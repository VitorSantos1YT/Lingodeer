package rt;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ha extends xy.i implements fz.e {
    public int H;
    public final /* synthetic */ wt.m K;
    public final /* synthetic */ List L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f49837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f49838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wt.m f49839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f49840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f49841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f49842f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f49843t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(wt.m mVar, List list, vy.d dVar) {
        super(2, dVar);
        this.K = mVar;
        this.L = list;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new ha(this.K, this.L, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((ha) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0088  */
    /* JADX WARN: Code duplicated, block: B:20:0x0090  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00bb -> B:25:0x00be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00cf -> B:27:0x00d1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.ha.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
