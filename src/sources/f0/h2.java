package f0;

import rt.mb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f26291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f26292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f26294e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f26290a = i11;
        this.f26294e = obj;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f26290a) {
            case 0:
                h2 h2Var = new h2((i2) this.f26294e, dVar, 0);
                h2Var.f26292c = ((v3.q) obj).f53504a;
                return h2Var;
            default:
                return new h2((mb) this.f26294e, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26290a) {
            case 0:
                long j11 = ((v3.q) obj).f53504a;
                h2 h2Var = new h2((i2) this.f26294e, (vy.d) obj2, 0);
                h2Var.f26292c = j11;
                return h2Var.invokeSuspend(qy.b0.f48488a);
            default:
                return ((h2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004a -> B:16:0x004d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.h2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
