package ad;

import java.io.Serializable;
import rz.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f575a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Serializable f579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f580f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f581t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(n nVar, g1 g1Var, int i11, int i12, i iVar, vy.d dVar) {
        super(2, dVar);
        this.f579e = nVar;
        this.f580f = g1Var;
        this.f577c = i11;
        this.f578d = i12;
        this.f581t = iVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f575a) {
            case 0:
                return new c((n) this.f579e, (g1) this.f580f, this.f577c, this.f578d, (i) this.f581t, dVar);
            default:
                c cVar = new c((String[]) this.f581t, dVar);
                cVar.f580f = obj;
                return cVar;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f575a) {
            case 0:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((c) create((y9.l) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005d -> B:18:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:37:0x00b4
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String[] strArr, vy.d dVar) {
        super(2, dVar);
        this.f581t = strArr;
    }
}
