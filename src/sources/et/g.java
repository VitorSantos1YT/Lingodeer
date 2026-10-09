package et;

import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends xy.i implements fz.e {
    public final /* synthetic */ rz.b0 H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f25875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f25876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CourseWord f25877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x1.p f25878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz.a f25879f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fz.c f25880t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, boolean z11, CourseWord courseWord, x1.p pVar, fz.a aVar, fz.c cVar, rz.b0 b0Var, vy.d dVar) {
        super(2, dVar);
        this.f25875b = oVar;
        this.f25876c = z11;
        this.f25877d = courseWord;
        this.f25878e = pVar;
        this.f25879f = aVar;
        this.f25880t = cVar;
        this.H = b0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new g(this.f25875b, this.f25876c, this.f25877d, this.f25878e, this.f25879f, this.f25880t, this.H, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x022c  */
    /* JADX WARN: Code duplicated, block: B:65:0x024a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0257  */
    /* JADX WARN: Code duplicated, block: B:84:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cc, code lost:
    
        if (r2 == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r58v2, types: [java.lang.Throwable] */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r58) {
        /*
            Method dump skipped, instruction units count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: et.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
