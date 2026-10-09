package js;

import av.e0;
import java.util.List;
import rt.fb;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends xy.i implements fz.h {
    public final /* synthetic */ n0 H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f36816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ List f36818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f36819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ fb f36820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ e0 f36821f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f36822t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, n0 n0Var, vy.d dVar) {
        super(5, dVar);
        this.f36822t = rVar;
        this.H = n0Var;
    }

    @Override // fz.h
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj2).intValue();
        q qVar = new q(this.f36822t, this.H, (vy.d) obj5);
        qVar.f36818c = (List) obj;
        qVar.f36819d = iIntValue;
        qVar.f36820e = (fb) obj3;
        qVar.f36821f = (e0) obj4;
        return qVar.invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        if (rt.ia.a(r2, (java.util.List) r3, r6, r25) == r7) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015d, code lost:
    
        if (rz.e0.m(300, r25) == r7) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: js.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
