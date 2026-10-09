package hh;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f32313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f32314d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(c0 c0Var, boolean z11, vy.d dVar, int i11) {
        super(2, dVar);
        this.f32311a = i11;
        this.f32313c = c0Var;
        this.f32314d = z11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f32311a) {
            case 0:
                return new z(this.f32313c, this.f32314d, dVar, 0);
            case 1:
                return new z(this.f32313c, this.f32314d, dVar, 1);
            case 2:
                return new z(this.f32313c, this.f32314d, dVar, 2);
            case 3:
                return new z(this.f32313c, this.f32314d, dVar, 3);
            default:
                return new z(this.f32313c, this.f32314d, dVar, 4);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f32311a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((z) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
    
        if (r3 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x011f, code lost:
    
        if (r3 == r1) goto L52;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hh.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
