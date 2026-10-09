package ca;

import qy.b0;
import w9.s;
import w9.w;
import w9.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f6767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f6769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f6770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xy.i f6771f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(int i11, fz.c cVar, vy.d dVar, s sVar) {
        super(2, dVar);
        this.f6766a = i11;
        switch (i11) {
            case 1:
                this.f6770e = sVar;
                this.f6771f = (xy.i) cVar;
                super(2, dVar);
                break;
            default:
                this.f6770e = sVar;
                this.f6771f = (xy.i) cVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [fz.c, xy.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [fz.c, xy.i] */
    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f6766a) {
            case 0:
                e eVar = new e(0, this.f6771f, dVar, this.f6770e);
                eVar.f6769d = obj;
                return eVar;
            default:
                e eVar2 = new e(1, this.f6771f, dVar, this.f6770e);
                eVar2.f6769d = obj;
                return eVar2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        x xVar = (x) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f6766a) {
            case 0:
                break;
        }
        return ((e) create(xVar, dVar)).invokeSuspend(b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009b A[PHI: r1 r11
      0x009b: PHI (r1v21 w9.x) = (r1v18 w9.x), (r1v27 w9.x) binds: [B:32:0x0098, B:16:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r11v34 java.lang.Object) = (r11v32 java.lang.Object), (r11v0 java.lang.Object) binds: [B:32:0x0098, B:16:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:72:0x0156 A[PHI: r1 r11
      0x0156: PHI (r1v7 w9.x) = (r1v4 w9.x), (r1v13 w9.x) binds: [B:70:0x0153, B:54:0x00eb] A[DONT_GENERATE, DONT_INLINE]
      0x0156: PHI (r11v13 java.lang.Object) = (r11v11 java.lang.Object), (r11v0 java.lang.Object) binds: [B:70:0x0153, B:54:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0162  */
    /* JADX WARN: Code duplicated, block: B:78:0x016c  */
    /* JADX WARN: Type inference failed for: r7v0, types: [fz.c, xy.i] */
    /* JADX WARN: Type inference failed for: r7v1, types: [fz.c, xy.i] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        w wVar;
        x xVar;
        w wVar2;
        x xVar2;
        x xVar3;
        Object objD;
        w wVar3;
        x xVar4;
        w wVar4;
        x xVar5;
        x xVar6;
        Object objD2;
        switch (this.f6766a) {
            case 0:
                Object obj2 = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f6768c;
                s sVar = this.f6770e;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    x xVar7 = (x) this.f6769d;
                    wVar = w.IMMEDIATE;
                    this.f6769d = xVar7;
                    this.f6767b = wVar;
                    this.f6768c = 1;
                    Object objD3 = xVar7.d(this);
                    if (objD3 != obj2) {
                        xVar = xVar7;
                        obj = objD3;
                    }
                    return obj2;
                }
                if (i11 == 1) {
                    wVar = this.f6767b;
                    xVar = (x) this.f6769d;
                    com.bumptech.glide.e.F(obj);
                } else {
                    if (i11 == 2) {
                        wVar = this.f6767b;
                        xVar3 = (x) this.f6769d;
                        com.bumptech.glide.e.F(obj);
                        wVar2 = wVar;
                        xVar2 = xVar3;
                        d dVar = new d(0, (fz.c) this.f6771f, (vy.d) null);
                        this.f6769d = xVar2;
                        this.f6767b = null;
                        this.f6768c = 3;
                        obj = xVar2.b(wVar2, dVar, this);
                        if (obj != obj2) {
                            this.f6769d = obj;
                            this.f6768c = 4;
                            objD = xVar2.d(this);
                            if (objD != obj2) {
                                obj2 = obj;
                                obj = objD;
                            }
                        }
                        return obj2;
                    }
                    if (i11 == 3) {
                        xVar2 = (x) this.f6769d;
                        com.bumptech.glide.e.F(obj);
                        this.f6769d = obj;
                        this.f6768c = 4;
                        objD = xVar2.d(this);
                        if (objD != obj2) {
                            obj2 = obj;
                            obj = objD;
                        }
                        return obj2;
                    }
                    if (i11 != 4) {
                        if (i11 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                        return obj;
                    }
                    obj2 = this.f6769d;
                    com.bumptech.glide.e.F(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    w9.g gVarK = sVar.k();
                    gVarK.f54801b.e(gVarK.f54804e, gVarK.f54805f);
                }
                return obj2;
                if (((Boolean) obj).booleanValue()) {
                    wVar2 = wVar;
                    xVar2 = xVar;
                    d dVar2 = new d(0, (fz.c) this.f6771f, (vy.d) null);
                    this.f6769d = xVar2;
                    this.f6767b = null;
                    this.f6768c = 3;
                    obj = xVar2.b(wVar2, dVar2, this);
                    if (obj != obj2) {
                        this.f6769d = obj;
                        this.f6768c = 4;
                        objD = xVar2.d(this);
                        if (objD != obj2) {
                            obj2 = obj;
                            obj = objD;
                            if (!((Boolean) obj).booleanValue()) {
                                w9.g gVarK2 = sVar.k();
                                gVarK2.f54801b.e(gVarK2.f54804e, gVarK2.f54805f);
                            }
                        }
                    }
                } else {
                    w9.g gVarK3 = sVar.k();
                    this.f6769d = xVar;
                    this.f6767b = wVar;
                    this.f6768c = 2;
                    if (gVarK3.a(this) != obj2) {
                        xVar3 = xVar;
                        wVar2 = wVar;
                        xVar2 = xVar3;
                        d dVar3 = new d(0, (fz.c) this.f6771f, (vy.d) null);
                        this.f6769d = xVar2;
                        this.f6767b = null;
                        this.f6768c = 3;
                        obj = xVar2.b(wVar2, dVar3, this);
                        if (obj != obj2) {
                            this.f6769d = obj;
                            this.f6768c = 4;
                            objD = xVar2.d(this);
                            if (objD != obj2) {
                                obj2 = obj;
                                obj = objD;
                                if (!((Boolean) obj).booleanValue()) {
                                    w9.g gVarK4 = sVar.k();
                                    gVarK4.f54801b.e(gVarK4.f54804e, gVarK4.f54805f);
                                }
                            }
                        }
                    }
                }
                return obj2;
            default:
                Object obj3 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f6768c;
                s sVar2 = this.f6770e;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    x xVar8 = (x) this.f6769d;
                    wVar3 = w.IMMEDIATE;
                    this.f6769d = xVar8;
                    this.f6767b = wVar3;
                    this.f6768c = 1;
                    Object objD4 = xVar8.d(this);
                    if (objD4 != obj3) {
                        xVar4 = xVar8;
                        obj = objD4;
                    }
                    return obj3;
                }
                if (i12 == 1) {
                    wVar3 = this.f6767b;
                    xVar4 = (x) this.f6769d;
                    com.bumptech.glide.e.F(obj);
                } else {
                    if (i12 == 2) {
                        wVar3 = this.f6767b;
                        xVar6 = (x) this.f6769d;
                        com.bumptech.glide.e.F(obj);
                        wVar4 = wVar3;
                        xVar5 = xVar6;
                        d dVar4 = new d(1, (fz.c) this.f6771f, (vy.d) null);
                        this.f6769d = xVar5;
                        this.f6767b = null;
                        this.f6768c = 3;
                        obj = xVar5.b(wVar4, dVar4, this);
                        if (obj != obj3) {
                            this.f6769d = obj;
                            this.f6768c = 4;
                            objD2 = xVar5.d(this);
                            if (objD2 != obj3) {
                                obj3 = obj;
                                obj = objD2;
                            }
                        }
                        return obj3;
                    }
                    if (i12 == 3) {
                        xVar5 = (x) this.f6769d;
                        com.bumptech.glide.e.F(obj);
                        this.f6769d = obj;
                        this.f6768c = 4;
                        objD2 = xVar5.d(this);
                        if (objD2 != obj3) {
                            obj3 = obj;
                            obj = objD2;
                        }
                        return obj3;
                    }
                    if (i12 != 4) {
                        if (i12 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                        return obj;
                    }
                    obj3 = this.f6769d;
                    com.bumptech.glide.e.F(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    w9.g gVarK5 = sVar2.k();
                    gVarK5.f54801b.e(gVarK5.f54804e, gVarK5.f54805f);
                }
                return obj3;
                if (((Boolean) obj).booleanValue()) {
                    wVar4 = wVar3;
                    xVar5 = xVar4;
                    d dVar5 = new d(1, (fz.c) this.f6771f, (vy.d) null);
                    this.f6769d = xVar5;
                    this.f6767b = null;
                    this.f6768c = 3;
                    obj = xVar5.b(wVar4, dVar5, this);
                    if (obj != obj3) {
                        this.f6769d = obj;
                        this.f6768c = 4;
                        objD2 = xVar5.d(this);
                        if (objD2 != obj3) {
                            obj3 = obj;
                            obj = objD2;
                            if (!((Boolean) obj).booleanValue()) {
                                w9.g gVarK6 = sVar2.k();
                                gVarK6.f54801b.e(gVarK6.f54804e, gVarK6.f54805f);
                            }
                        }
                    }
                } else {
                    w9.g gVarK7 = sVar2.k();
                    this.f6769d = xVar4;
                    this.f6767b = wVar3;
                    this.f6768c = 2;
                    if (gVarK7.a(this) != obj3) {
                        xVar6 = xVar4;
                        wVar4 = wVar3;
                        xVar5 = xVar6;
                        d dVar6 = new d(1, (fz.c) this.f6771f, (vy.d) null);
                        this.f6769d = xVar5;
                        this.f6767b = null;
                        this.f6768c = 3;
                        obj = xVar5.b(wVar4, dVar6, this);
                        if (obj != obj3) {
                            this.f6769d = obj;
                            this.f6768c = 4;
                            objD2 = xVar5.d(this);
                            if (objD2 != obj3) {
                                obj3 = obj;
                                obj = objD2;
                                if (!((Boolean) obj).booleanValue()) {
                                    w9.g gVarK8 = sVar2.k();
                                    gVarK8.f54801b.e(gVarK8.f54804e, gVarK8.f54805f);
                                }
                            }
                        }
                    }
                }
                return obj3;
        }
    }
}
