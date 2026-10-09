package sv;

import qy.b0;
import rt.fb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends xy.i implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f51824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ qy.l f51825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f51826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ fb f51827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f51828e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, vy.d dVar) {
        super(4, dVar);
        this.f51828e = oVar;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        n nVar = new n(this.f51828e, (vy.d) obj4);
        nVar.f51825b = (qy.l) obj;
        nVar.f51826c = iIntValue;
        nVar.f51827d = (fb) obj3;
        return nVar.invokeSuspend(b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x014a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0154  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x020d  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0140, code lost:
    
        if (com.bumptech.glide.f.n(r2, r3, r30) == r9) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01bc, code lost:
    
        if (r1.u(false, true, r30) == r9) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x021d, code lost:
    
        if (rz.e0.m(300, r30) == r9) goto L87;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01bc -> B:76:0x01bf). Please report as a decompilation issue!!! */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sv.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
