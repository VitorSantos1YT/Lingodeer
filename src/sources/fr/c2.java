package fr;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c2 extends xy.i implements fz.e {
    public int H;
    public int K;
    public final /* synthetic */ i3 L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i3 f27435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f27436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f27437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Collection f27438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27440f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f27441t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(i3 i3Var, vy.d dVar) {
        super(2, dVar);
        this.L = i3Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new c2(this.L, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:15:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0077 -> B:16:0x007a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.c2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
