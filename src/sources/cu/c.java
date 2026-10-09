package cu;

import kr.a1;
import kr.l1;
import mv.y;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends xy.i implements fz.e {
    public Object H;
    public final /* synthetic */ Object K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22491a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f22495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f22496f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f22497t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i11, fr.i iVar, vy.d dVar) {
        super(2, dVar);
        this.K = iVar;
        this.f22494d = i11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f22491a) {
            case 0:
                return new c((u) this.f22497t, (g) this.K, dVar);
            case 1:
                c cVar = new c(this.f22494d, (fr.i) this.K, dVar);
                cVar.H = obj;
                return cVar;
            case 2:
                return new c((a1) this.K, (l1) this.H, dVar);
            default:
                return new c((y) this.K, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f22491a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((c) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0378  */
    /* JADX WARN: Code duplicated, block: B:103:0x037c  */
    /* JADX WARN: Code duplicated, block: B:110:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:115:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:117:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:119:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:159:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:160:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:176:0x03aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x037f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x03e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x03c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x041d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x03fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x015d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0350  */
    /* JADX WARN: Code duplicated, block: B:99:0x0370  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0083 -> B:17:0x0084). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x015b -> B:43:0x015f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:42:0x015d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 1276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cu.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(u uVar, g gVar, vy.d dVar) {
        super(2, dVar);
        this.f22497t = uVar;
        this.K = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a1 a1Var, l1 l1Var, vy.d dVar) {
        super(2, dVar);
        this.H = l1Var;
        this.K = a1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(y yVar, vy.d dVar) {
        super(2, dVar);
        this.K = yVar;
    }
}
