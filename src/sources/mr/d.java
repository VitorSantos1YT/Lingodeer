package mr;

import android.content.Context;
import rz.b0;
import wt.o0;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements fz.e {
    public Object H;
    public final /* synthetic */ Object K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41193a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41198f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f41199t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, int i11, Context context, int i12, int i13, int i14, vy.d dVar) {
        super(2, dVar);
        this.H = eVar;
        this.f41195c = i11;
        this.K = context;
        this.f41196d = i12;
        this.f41197e = i13;
        this.f41198f = i14;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f41193a) {
            case 0:
                return new d((e) this.H, this.f41195c, (Context) this.K, this.f41196d, this.f41197e, this.f41198f, dVar);
            default:
                return new d((o0) this.K, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f41193a) {
            case 0:
                break;
        }
        return ((d) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o0 o0Var, vy.d dVar) {
        super(2, dVar);
        this.K = o0Var;
    }

    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x005c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0081  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c9 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:36:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00a7 -> B:21:0x00ab). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
