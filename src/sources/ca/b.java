package ca;

import kotlin.jvm.internal.m;
import qy.b0;
import w9.s;
import w9.w;
import w9.x;
import y9.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends xy.i implements fz.e {
    public final /* synthetic */ fz.c H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f6750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f6752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f6753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f6754f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f6755t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(boolean z11, boolean z12, s sVar, vy.d dVar, fz.c cVar, int i11) {
        super(2, dVar);
        this.f6749a = i11;
        this.f6753e = z11;
        this.f6754f = z12;
        this.f6755t = sVar;
        this.H = cVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f6749a) {
            case 0:
                b bVar = new b(this.f6753e, this.f6754f, this.f6755t, dVar, this.H, 0);
                bVar.f6752d = obj;
                return bVar;
            default:
                b bVar2 = new b(this.f6753e, this.f6754f, this.f6755t, dVar, this.H, 1);
                bVar2.f6752d = obj;
                return bVar2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        x xVar = (x) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f6749a) {
            case 0:
                break;
        }
        return ((b) create(xVar, dVar)).invokeSuspend(b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:84:0x017e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0189  */
    /* JADX WARN: Code duplicated, block: B:90:0x0193  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        w wVar;
        x xVar;
        w wVar2;
        x xVar2;
        x xVar3;
        Object objD;
        Object obj2;
        w wVar3;
        x xVar4;
        w wVar4;
        x xVar5;
        x xVar6;
        Object objD2;
        Object obj3;
        switch (this.f6749a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f6751c;
                fz.c cVar = this.H;
                s sVar = this.f6755t;
                boolean z11 = this.f6754f;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    x xVar7 = (x) this.f6752d;
                    if (!this.f6753e) {
                        m.d(xVar7, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                        return cVar.invoke(((t) xVar7).c());
                    }
                    wVar = z11 ? w.DEFERRED : w.IMMEDIATE;
                    if (z11) {
                        w wVar5 = wVar;
                        xVar = xVar7;
                        wVar2 = wVar5;
                    } else {
                        this.f6752d = xVar7;
                        this.f6750b = wVar;
                        this.f6751c = 1;
                        Object objD3 = xVar7.d(this);
                        if (objD3 == aVar) {
                            return aVar;
                        }
                        xVar2 = xVar7;
                        obj = objD3;
                    }
                    a aVar2 = new a(0, cVar, null);
                    this.f6752d = xVar;
                    this.f6750b = null;
                    this.f6751c = 3;
                    obj = xVar.b(wVar2, aVar2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    if (!z11) {
                        return obj;
                    }
                    this.f6752d = obj;
                    this.f6751c = 4;
                    objD = xVar.d(this);
                    if (objD == aVar) {
                        return aVar;
                    }
                    obj2 = obj;
                    obj = objD;
                    if (((Boolean) obj).booleanValue()) {
                        return obj2;
                    }
                    w9.g gVarK = sVar.k();
                    gVarK.f54801b.e(gVarK.f54804e, gVarK.f54805f);
                    return obj2;
                }
                if (i11 == 1) {
                    wVar = this.f6750b;
                    xVar2 = (x) this.f6752d;
                    com.bumptech.glide.e.F(obj);
                } else if (i11 == 2) {
                    wVar = this.f6750b;
                    xVar3 = (x) this.f6752d;
                    com.bumptech.glide.e.F(obj);
                    wVar2 = wVar;
                    xVar = xVar3;
                    a aVar3 = new a(0, cVar, null);
                    this.f6752d = xVar;
                    this.f6750b = null;
                    this.f6751c = 3;
                    obj = xVar.b(wVar2, aVar3, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    if (!z11) {
                        return obj;
                    }
                    this.f6752d = obj;
                    this.f6751c = 4;
                    objD = xVar.d(this);
                    if (objD == aVar) {
                        return aVar;
                    }
                    obj2 = obj;
                    obj = objD;
                } else if (i11 == 3) {
                    xVar = (x) this.f6752d;
                    com.bumptech.glide.e.F(obj);
                    if (!z11) {
                        return obj;
                    }
                    this.f6752d = obj;
                    this.f6751c = 4;
                    objD = xVar.d(this);
                    if (objD == aVar) {
                        return aVar;
                    }
                    obj2 = obj;
                    obj = objD;
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f6752d;
                    com.bumptech.glide.e.F(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return obj2;
                }
                w9.g gVarK2 = sVar.k();
                gVarK2.f54801b.e(gVarK2.f54804e, gVarK2.f54805f);
                return obj2;
                if (((Boolean) obj).booleanValue()) {
                    wVar2 = wVar;
                    xVar = xVar2;
                } else {
                    w9.g gVarK3 = sVar.k();
                    this.f6752d = xVar2;
                    this.f6750b = wVar;
                    this.f6751c = 2;
                    if (gVarK3.a(this) == aVar) {
                        return aVar;
                    }
                    xVar3 = xVar2;
                    wVar2 = wVar;
                    xVar = xVar3;
                }
                a aVar4 = new a(0, cVar, null);
                this.f6752d = xVar;
                this.f6750b = null;
                this.f6751c = 3;
                obj = xVar.b(wVar2, aVar4, this);
                if (obj == aVar) {
                    return aVar;
                }
                if (!z11) {
                    return obj;
                }
                this.f6752d = obj;
                this.f6751c = 4;
                objD = xVar.d(this);
                if (objD == aVar) {
                    return aVar;
                }
                obj2 = obj;
                obj = objD;
                if (((Boolean) obj).booleanValue()) {
                    return obj2;
                }
                w9.g gVarK4 = sVar.k();
                gVarK4.f54801b.e(gVarK4.f54804e, gVarK4.f54805f);
                return obj2;
            default:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f6751c;
                fz.c cVar2 = this.H;
                s sVar2 = this.f6755t;
                boolean z12 = this.f6754f;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    x xVar8 = (x) this.f6752d;
                    if (!this.f6753e) {
                        m.d(xVar8, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                        return cVar2.invoke(((t) xVar8).c());
                    }
                    wVar3 = z12 ? w.DEFERRED : w.IMMEDIATE;
                    if (z12) {
                        w wVar6 = wVar3;
                        xVar4 = xVar8;
                        wVar4 = wVar6;
                    } else {
                        this.f6752d = xVar8;
                        this.f6750b = wVar3;
                        this.f6751c = 1;
                        Object objD4 = xVar8.d(this);
                        if (objD4 == aVar5) {
                            return aVar5;
                        }
                        xVar5 = xVar8;
                        obj = objD4;
                    }
                    a aVar6 = new a(1, cVar2, null);
                    this.f6752d = xVar4;
                    this.f6750b = null;
                    this.f6751c = 3;
                    obj = xVar4.b(wVar4, aVar6, this);
                    if (obj == aVar5) {
                        return aVar5;
                    }
                    if (!z12) {
                        return obj;
                    }
                    this.f6752d = obj;
                    this.f6751c = 4;
                    objD2 = xVar4.d(this);
                    if (objD2 == aVar5) {
                        return aVar5;
                    }
                    obj3 = obj;
                    obj = objD2;
                    if (((Boolean) obj).booleanValue()) {
                        return obj3;
                    }
                    w9.g gVarK5 = sVar2.k();
                    gVarK5.f54801b.e(gVarK5.f54804e, gVarK5.f54805f);
                    return obj3;
                }
                if (i12 == 1) {
                    wVar3 = this.f6750b;
                    xVar5 = (x) this.f6752d;
                    com.bumptech.glide.e.F(obj);
                } else if (i12 == 2) {
                    wVar3 = this.f6750b;
                    xVar6 = (x) this.f6752d;
                    com.bumptech.glide.e.F(obj);
                    wVar4 = wVar3;
                    xVar4 = xVar6;
                    a aVar7 = new a(1, cVar2, null);
                    this.f6752d = xVar4;
                    this.f6750b = null;
                    this.f6751c = 3;
                    obj = xVar4.b(wVar4, aVar7, this);
                    if (obj == aVar5) {
                        return aVar5;
                    }
                    if (!z12) {
                        return obj;
                    }
                    this.f6752d = obj;
                    this.f6751c = 4;
                    objD2 = xVar4.d(this);
                    if (objD2 == aVar5) {
                        return aVar5;
                    }
                    obj3 = obj;
                    obj = objD2;
                } else if (i12 == 3) {
                    xVar4 = (x) this.f6752d;
                    com.bumptech.glide.e.F(obj);
                    if (!z12) {
                        return obj;
                    }
                    this.f6752d = obj;
                    this.f6751c = 4;
                    objD2 = xVar4.d(this);
                    if (objD2 == aVar5) {
                        return aVar5;
                    }
                    obj3 = obj;
                    obj = objD2;
                } else {
                    if (i12 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj3 = this.f6752d;
                    com.bumptech.glide.e.F(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return obj3;
                }
                w9.g gVarK6 = sVar2.k();
                gVarK6.f54801b.e(gVarK6.f54804e, gVarK6.f54805f);
                return obj3;
                if (((Boolean) obj).booleanValue()) {
                    wVar4 = wVar3;
                    xVar4 = xVar5;
                } else {
                    w9.g gVarK7 = sVar2.k();
                    this.f6752d = xVar5;
                    this.f6750b = wVar3;
                    this.f6751c = 2;
                    if (gVarK7.a(this) == aVar5) {
                        return aVar5;
                    }
                    xVar6 = xVar5;
                    wVar4 = wVar3;
                    xVar4 = xVar6;
                }
                a aVar8 = new a(1, cVar2, null);
                this.f6752d = xVar4;
                this.f6750b = null;
                this.f6751c = 3;
                obj = xVar4.b(wVar4, aVar8, this);
                if (obj == aVar5) {
                    return aVar5;
                }
                if (!z12) {
                    return obj;
                }
                this.f6752d = obj;
                this.f6751c = 4;
                objD2 = xVar4.d(this);
                if (objD2 == aVar5) {
                    return aVar5;
                }
                obj3 = obj;
                obj = objD2;
                if (((Boolean) obj).booleanValue()) {
                    return obj3;
                }
                w9.g gVarK8 = sVar2.k();
                gVarK8.f54801b.e(gVarK8.f54804e, gVarK8.f54805f);
                return obj3;
        }
    }
}
