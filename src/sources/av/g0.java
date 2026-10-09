package av;

import java.io.BufferedOutputStream;
import java.util.List;
import l1.b1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends xy.i implements fz.e {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3135a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3140f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3141t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(int i11, j0 j0Var, long j11, BufferedOutputStream bufferedOutputStream, vy.d dVar) {
        super(2, dVar);
        this.f3139e = i11;
        this.f3141t = j0Var;
        this.f3136b = j11;
        this.H = bufferedOutputStream;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f3135a) {
            case 0:
                return new g0(this.f3139e, (j0) this.f3141t, this.f3136b, (BufferedOutputStream) this.H, dVar);
            default:
                return new g0((List) this.f3140f, (x1.p) this.f3141t, (b1) this.H, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f3135a) {
            case 0:
                break;
        }
        return ((g0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ea A[LOOP:0: B:53:0x00cd->B:58:0x00ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005b -> B:22:0x0071). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006d -> B:21:0x006f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0105 -> B:64:0x010b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0108 -> B:64:0x010b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: av.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(List list, x1.p pVar, b1 b1Var, vy.d dVar) {
        super(2, dVar);
        this.f3140f = list;
        this.f3141t = pVar;
        this.H = b1Var;
    }
}
