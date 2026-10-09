package n5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f43376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f43377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f43378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f43379f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(v vVar, int i11, vy.d dVar, int i12) {
        super(2, dVar);
        this.f43374a = i12;
        this.f43377d = vVar;
        this.f43378e = i11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f43374a) {
            case 0:
                s sVar = new s(this.f43377d, this.f43378e, dVar, 0);
                sVar.f43376c = ((Boolean) obj).booleanValue();
                return sVar;
            default:
                s sVar2 = new s(this.f43377d, this.f43378e, dVar, 1);
                sVar2.f43376c = ((Boolean) obj).booleanValue();
                return sVar2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f43374a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        vy.d dVar = (vy.d) obj2;
        switch (i11) {
            case 0:
                break;
        }
        return ((s) create(bool, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        int iIntValue;
        ?? r9;
        ?? r11;
        x0 x0Var;
        ?? r12;
        boolean z11;
        Object obj2;
        int iIntValue2;
        int iHashCode;
        switch (this.f43374a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                ?? r13 = this.f43375b;
                v vVar = this.f43377d;
                try {
                    if (r13 == 0) {
                        com.bumptech.glide.e.F(obj);
                        boolean z12 = this.f43376c;
                        this.f43376c = z12;
                        this.f43375b = 1;
                        obj = v.f(vVar, z12, this);
                        r13 = z12;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (r13 != 1) {
                            if (r13 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            boolean z13 = this.f43376c;
                            th2 = (Throwable) this.f43379f;
                            com.bumptech.glide.e.F(obj);
                            r11 = z13;
                            iIntValue = ((Number) obj).intValue();
                            r9 = r11;
                            q0 q0Var = new q0(iIntValue, th2);
                            r12 = r9;
                            x0Var = q0Var;
                            return new qy.l(x0Var, Boolean.valueOf((boolean) r12));
                        }
                        boolean z14 = this.f43376c;
                        com.bumptech.glide.e.F(obj);
                        r13 = z14;
                    }
                    x0Var = (x0) obj;
                    r12 = r13;
                    break;
                } catch (Throwable th3) {
                    if (r13 != 0) {
                        g0 g0VarG = vVar.g();
                        this.f43379f = th3;
                        this.f43376c = r13;
                        this.f43375b = 2;
                        Object objE = g0VarG.e(this);
                        if (objE == aVar) {
                            return aVar;
                        }
                        r11 = r13;
                        th2 = th3;
                        obj = objE;
                    } else {
                        ?? r14 = r13;
                        th2 = th3;
                        iIntValue = this.f43378e;
                        r9 = r14 == true ? 1 : 0;
                    }
                    q0 q0Var2 = new q0(iIntValue, th2);
                    r12 = r9;
                    x0Var = q0Var2;
                    return new qy.l(x0Var, Boolean.valueOf((boolean) r12));
                }
                return new qy.l(x0Var, Boolean.valueOf((boolean) r12));
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f43375b;
                v vVar2 = this.f43377d;
                if (i11 != 0) {
                    if (i11 == 1) {
                        z11 = this.f43376c;
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.f43379f;
                        com.bumptech.glide.e.F(obj);
                    }
                    iIntValue2 = ((Number) obj).intValue();
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    return new c(obj2, iHashCode, iIntValue2);
                }
                com.bumptech.glide.e.F(obj);
                z11 = this.f43376c;
                this.f43376c = z11;
                this.f43375b = 1;
                obj = vVar2.i(this);
                if (obj == aVar2) {
                    return aVar2;
                }
                if (z11) {
                    g0 g0VarG2 = vVar2.g();
                    this.f43379f = obj;
                    this.f43375b = 2;
                    Object objE2 = g0VarG2.e(this);
                    if (objE2 == aVar2) {
                        return aVar2;
                    }
                    obj2 = obj;
                    obj = objE2;
                    iIntValue2 = ((Number) obj).intValue();
                } else {
                    obj2 = obj;
                    iIntValue2 = this.f43378e;
                }
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                return new c(obj2, iHashCode, iIntValue2);
        }
    }
}
