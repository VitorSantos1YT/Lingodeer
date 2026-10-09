package ry;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends xy.h implements fz.e {
    public final /* synthetic */ int H;
    public final /* synthetic */ Iterator K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f50837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f50838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f50840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f50841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f50842f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f50843t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(int i11, int i12, Iterator it, vy.d dVar) {
        super(2, dVar);
        this.f50843t = i11;
        this.H = i12;
        this.K = it;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        c0 c0Var = new c0(this.f50843t, this.H, this.K, dVar);
        c0Var.f50842f = obj;
        return c0Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((nz.m) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:48:0x0106  */
    /* JADX WARN: Code duplicated, block: B:50:0x010a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0111  */
    /* JADX WARN: Code duplicated, block: B:55:0x0116  */
    /* JADX WARN: Code duplicated, block: B:56:0x0120  */
    /* JADX WARN: Code duplicated, block: B:59:0x0132  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ab -> B:17:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0104 -> B:58:0x012e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x014a -> B:62:0x014d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0174 -> B:71:0x0177). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ry.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
