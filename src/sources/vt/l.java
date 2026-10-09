package vt;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends xy.i implements fz.e {
    public final /* synthetic */ List H;
    public final /* synthetic */ r K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f54243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f54244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f54245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f54246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54248f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f54249t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, List list, r rVar, vy.d dVar) {
        super(2, dVar);
        this.f54249t = str;
        this.H = list;
        this.K = rVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new l(this.f54249t, this.H, this.K, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0093  */
    /* JADX WARN: Code duplicated, block: B:24:0x0097  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0097 -> B:25:0x009b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vt.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
