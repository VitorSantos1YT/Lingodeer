package jt;

import androidx.datastore.core.CorruptionException;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t1 extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f37185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f37186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f37187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f37188f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(Object obj, Object obj2, Object obj3, vy.d dVar, int i11) {
        super(1, dVar);
        this.f37183a = i11;
        this.f37186d = obj;
        this.f37187e = obj2;
        this.f37188f = obj3;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        switch (this.f37183a) {
            case 0:
                return new t1((ns.l) this.f37185c, (String) this.f37186d, (String) this.f37187e, (String) this.f37188f, dVar);
            case 1:
                return new t1((kotlin.jvm.internal.y) this.f37186d, (n5.v) this.f37187e, (kotlin.jvm.internal.w) this.f37188f, dVar, 1);
            default:
                return new t1((n5.v) this.f37186d, (vy.i) this.f37187e, (fz.e) this.f37188f, dVar, 2);
        }
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        vy.d dVar = (vy.d) obj;
        switch (this.f37183a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((t1) create(dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.y yVar;
        kotlin.jvm.internal.w wVar;
        n5.c cVar;
        Object obj2;
        int iHashCode;
        switch (this.f37183a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f37184b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                ns.l lVar = (ns.l) this.f37185c;
                String str = (String) this.f37186d;
                String str2 = (String) this.f37187e;
                String str3 = (String) this.f37188f;
                this.f37184b = 1;
                lVar.getClass();
                Object objB = lVar.b(ns.c.SPELLING, str, str2, str3, this);
                return objB == aVar ? aVar : objB;
            case 1:
                kotlin.jvm.internal.w wVar2 = (kotlin.jvm.internal.w) this.f37188f;
                kotlin.jvm.internal.y yVar2 = (kotlin.jvm.internal.y) this.f37186d;
                n5.v vVar = (n5.v) this.f37187e;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f37184b;
                try {
                    if (i12 != 0) {
                        if (i12 == 1) {
                            yVar = (kotlin.jvm.internal.y) ((Serializable) this.f37185c);
                            com.bumptech.glide.e.F(obj);
                        } else {
                            if (i12 != 2) {
                                if (i12 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                wVar2 = (kotlin.jvm.internal.w) ((Serializable) this.f37185c);
                                com.bumptech.glide.e.F(obj);
                                wVar2.f38359a = ((Number) obj).intValue();
                                return qy.b0.f48488a;
                            }
                            wVar = (kotlin.jvm.internal.w) ((Serializable) this.f37185c);
                            com.bumptech.glide.e.F(obj);
                        }
                        wVar.f38359a = ((Number) obj).intValue();
                        return qy.b0.f48488a;
                    }
                    com.bumptech.glide.e.F(obj);
                    this.f37185c = yVar2;
                    this.f37184b = 1;
                    obj = vVar.i(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    yVar = yVar2;
                    yVar.f38361a = obj;
                    n5.g0 g0VarG = vVar.g();
                    this.f37185c = wVar2;
                    this.f37184b = 2;
                    obj = g0VarG.e(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    wVar = wVar2;
                    wVar.f38359a = ((Number) obj).intValue();
                    return qy.b0.f48488a;
                } catch (CorruptionException unused) {
                    Object obj3 = yVar2.f38361a;
                    this.f37185c = wVar2;
                    this.f37184b = 3;
                    obj = vVar.j(obj3, true, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
            default:
                n5.v vVar2 = (n5.v) this.f37186d;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f37184b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj4 = this.f37185c;
                            com.bumptech.glide.e.F(obj);
                            return obj4;
                        }
                        cVar = (n5.c) this.f37185c;
                        com.bumptech.glide.e.F(obj);
                    }
                    obj2 = cVar.f43249b;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    if (iHashCode == cVar.f43250c) {
                        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    }
                    if (!kotlin.jvm.internal.m.a(cVar.f43249b, obj)) {
                        this.f37185c = obj;
                        this.f37184b = 3;
                        if (vVar2.j(obj, true, this) == aVar3) {
                            return aVar3;
                        }
                    }
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                this.f37184b = 1;
                obj = n5.v.f(vVar2, true, this);
                if (obj == aVar3) {
                    return aVar3;
                }
                cVar = (n5.c) obj;
                vy.i iVar = (vy.i) this.f37187e;
                kb.e eVar = new kb.e(20, (fz.e) this.f37188f, cVar, null);
                this.f37185c = cVar;
                this.f37184b = 2;
                obj = rz.e0.M(iVar, eVar, this);
                if (obj == aVar3) {
                    return aVar3;
                }
                obj2 = cVar.f43249b;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                if (iHashCode == cVar.f43250c) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (!kotlin.jvm.internal.m.a(cVar.f43249b, obj)) {
                    this.f37185c = obj;
                    this.f37184b = 3;
                    if (vVar2.j(obj, true, this) == aVar3) {
                        return aVar3;
                    }
                }
                return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(ns.l lVar, String str, String str2, String str3, vy.d dVar) {
        super(1, dVar);
        this.f37183a = 0;
        this.f37185c = lVar;
        this.f37186d = str;
        this.f37187e = str2;
        this.f37188f = str3;
    }
}
