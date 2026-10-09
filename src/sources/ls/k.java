package ls;

import java.util.Iterator;
import java.util.List;
import l1.a1;
import l1.b1;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends xy.i implements fz.e {
    public Iterator H;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public final /* synthetic */ List P;
    public final /* synthetic */ List Q;
    public final /* synthetic */ fz.c R;
    public final /* synthetic */ fz.c S;
    public final /* synthetic */ a1 T;
    public final /* synthetic */ b1 U;
    public final /* synthetic */ b1 V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f40297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fz.c f40298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fz.c f40299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a1 f40300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b1 f40301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b1 f40302f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f40303t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(List list, List list2, fz.c cVar, fz.c cVar2, a1 a1Var, b1 b1Var, b1 b1Var2, vy.d dVar) {
        super(2, dVar);
        this.P = list;
        this.Q = list2;
        this.R = cVar;
        this.S = cVar2;
        this.T = a1Var;
        this.U = b1Var;
        this.V = b1Var2;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new k(this.P, this.Q, this.R, this.S, this.T, this.U, this.V, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:40:0x012f  */
    /* JADX WARN: Code duplicated, block: B:43:0x013e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00e0 -> B:47:0x016a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x013c -> B:47:0x016a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0162 -> B:47:0x016a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
