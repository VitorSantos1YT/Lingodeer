package ls;

import d0.d2;
import kotlin.jvm.internal.y;
import l1.b1;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends xy.i implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40262a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f40264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f40266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f40267f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f40268t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Integer num, Integer num2, b1 b1Var, b1 b1Var2, int i11, v3.c cVar, d2 d2Var, ms.a aVar, int i12, d2 d2Var2, vy.d dVar) {
        super(2, dVar);
        this.f40266e = num;
        this.f40267f = num2;
        this.f40268t = b1Var;
        this.H = b1Var2;
        this.f40264c = i11;
        this.K = cVar;
        this.L = d2Var;
        this.N = aVar;
        this.f40265d = i12;
        this.M = d2Var2;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f40262a) {
            case 0:
                return new e((Integer) this.f40266e, (Integer) this.f40267f, (b1) this.f40268t, (b1) this.H, this.f40264c, (v3.c) this.K, (d2) this.L, (ms.a) this.N, this.f40265d, (d2) this.M, dVar);
            default:
                return new e((String) this.f40266e, (String) this.f40267f, (String) this.f40268t, (g1.k) this.H, (String) this.K, (y) this.L, (String) this.M, (String) this.N, this.f40264c, this.f40265d, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f40262a) {
            case 0:
                break;
        }
        return ((e) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x014a, code lost:
    
        if (d0.d2.f(r4, r2, r28) == r1) goto L39;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, String str2, String str3, g1.k kVar, String str4, y yVar, String str5, String str6, int i11, int i12, vy.d dVar) {
        super(2, dVar);
        this.f40266e = str;
        this.f40267f = str2;
        this.f40268t = str3;
        this.H = kVar;
        this.K = str4;
        this.L = yVar;
        this.M = str5;
        this.N = str6;
        this.f40264c = i11;
        this.f40265d = i12;
    }
}
