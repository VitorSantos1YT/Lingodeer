package n1;

import nz.m;
import qy.b0;
import w2.r1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends xy.h implements fz.e {
    public int H;
    public /* synthetic */ Object K;
    public Object L;
    public final /* synthetic */ Object M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f43116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43120f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f43121t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f43115a = i11;
        this.M = obj;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f43115a) {
            case 0:
                g gVar = new g((h) this.M, dVar, 0);
                gVar.K = obj;
                return gVar;
            case 1:
                g gVar2 = new g((y.g) this.M, dVar, 1);
                gVar2.K = obj;
                return gVar2;
            case 2:
                g gVar3 = new g((y.g) this.M, dVar, 2);
                gVar3.K = obj;
                return gVar3;
            default:
                g gVar4 = new g((r1) this.M, dVar, 3);
                gVar4.K = obj;
                return gVar4;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        m mVar = (m) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f43115a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((g) create(mVar, dVar)).invokeSuspend(b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x028e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0290  */
    /* JADX WARN: Code duplicated, block: B:104:0x0296  */
    /* JADX WARN: Code duplicated, block: B:93:0x0251  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x005b -> B:25:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005d -> B:16:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0077 -> B:22:0x0097). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0094 -> B:22:0x0097). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00fa -> B:50:0x013f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00fc -> B:41:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0116 -> B:47:0x0136). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0133 -> B:47:0x0136). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0198 -> B:66:0x01aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01b3 -> B:72:0x01e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01e0 -> B:73:0x01e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x01f3 -> B:78:0x01f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x024f -> B:103:0x0294). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x0251 -> B:94:0x0262). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x026b -> B:100:0x028b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x0288 -> B:100:0x028b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
