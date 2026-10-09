package n5;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends xy.i implements fz.c {
    public final /* synthetic */ v H;
    public final /* synthetic */ ob.i K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f43294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Serializable f43295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f43296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f43297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f43298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43299f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f43300t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(v vVar, ob.i iVar, vy.d dVar) {
        super(1, dVar);
        this.H = vVar;
        this.K = iVar;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        return new j(this.H, this.K, dVar);
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        return ((j) create((vy.d) obj)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00df  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:40:0x0105  */
    /* JADX WARN: Code duplicated, block: B:49:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:21:0x00a3->B:51:?, LOOP_END, SYNTHETIC] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        a00.a eVar;
        kotlin.jvm.internal.u uVar;
        kotlin.jvm.internal.y yVar;
        kotlin.jvm.internal.y yVar2;
        a00.a aVar;
        Iterator it;
        a00.a aVar2;
        kotlin.jvm.internal.u uVar2;
        kotlin.jvm.internal.y yVar3;
        i iVar;
        kotlin.jvm.internal.y yVar4;
        kotlin.jvm.internal.u uVar3;
        fz.e eVar2;
        Object obj2;
        int iHashCode;
        Object objE;
        int i11;
        wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
        int i12 = this.f43300t;
        ob.i iVar2 = this.K;
        v vVar = this.H;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            eVar = new a00.e();
            uVar = new kotlin.jvm.internal.u();
            yVar = new kotlin.jvm.internal.y();
            this.f43294a = eVar;
            this.f43295b = uVar;
            this.f43296c = yVar;
            this.f43297d = yVar;
            this.f43300t = 1;
            obj = v.f(vVar, true, this);
            if (obj != aVar3) {
                yVar2 = yVar;
            }
            return aVar3;
        }
        if (i12 == 1) {
            yVar = (kotlin.jvm.internal.y) this.f43297d;
            yVar2 = (kotlin.jvm.internal.y) this.f43296c;
            uVar = (kotlin.jvm.internal.u) this.f43295b;
            eVar = (a00.a) this.f43294a;
            com.bumptech.glide.e.F(obj);
        } else {
            if (i12 == 2) {
                it = this.f43298e;
                iVar = (i) this.f43297d;
                yVar3 = (kotlin.jvm.internal.y) this.f43296c;
                uVar2 = (kotlin.jvm.internal.u) this.f43295b;
                aVar2 = (a00.a) this.f43294a;
                com.bumptech.glide.e.F(obj);
                while (it.hasNext()) {
                    eVar2 = (fz.e) it.next();
                    this.f43294a = aVar2;
                    this.f43295b = uVar2;
                    this.f43296c = yVar3;
                    this.f43297d = iVar;
                    this.f43298e = it;
                    this.f43300t = 2;
                    if (eVar2.invoke(iVar, this) == aVar3) {
                        return aVar3;
                    }
                }
                yVar2 = yVar3;
                uVar = uVar2;
                aVar = aVar2;
                iVar2.f44815d = null;
                this.f43294a = uVar;
                this.f43295b = yVar2;
                this.f43296c = aVar;
                this.f43297d = null;
                this.f43298e = null;
                this.f43300t = 3;
                if (aVar.b(this) != aVar3) {
                    yVar4 = yVar2;
                    uVar3 = uVar;
                    uVar3.f38357a = true;
                    aVar.a(null);
                    obj2 = yVar4.f38361a;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    g0 g0VarG = vVar.g();
                    this.f43294a = obj2;
                    this.f43295b = null;
                    this.f43296c = null;
                    this.f43299f = iHashCode;
                    this.f43300t = 4;
                    objE = g0VarG.e(this);
                    if (objE != aVar3) {
                        i11 = iHashCode;
                        obj = objE;
                    }
                }
                return aVar3;
            }
            if (i12 == 3) {
                aVar = (a00.a) this.f43296c;
                yVar4 = (kotlin.jvm.internal.y) this.f43295b;
                uVar3 = (kotlin.jvm.internal.u) this.f43294a;
                com.bumptech.glide.e.F(obj);
                try {
                    uVar3.f38357a = true;
                    aVar.a(null);
                    obj2 = yVar4.f38361a;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    g0 g0VarG2 = vVar.g();
                    this.f43294a = obj2;
                    this.f43295b = null;
                    this.f43296c = null;
                    this.f43299f = iHashCode;
                    this.f43300t = 4;
                    objE = g0VarG2.e(this);
                    if (objE != aVar3) {
                        i11 = iHashCode;
                        obj = objE;
                    }
                    return aVar3;
                } catch (Throwable th2) {
                    aVar.a(null);
                    throw th2;
                }
            }
            if (i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = this.f43299f;
            obj2 = this.f43294a;
            com.bumptech.glide.e.F(obj);
        }
        return new c(obj2, i11, ((Number) obj).intValue());
        yVar.f38361a = ((c) obj).f43249b;
        i iVar3 = new i(eVar, uVar, yVar2, vVar);
        List list = (List) iVar2.f44815d;
        if (list != null) {
            it = list.iterator();
            aVar2 = eVar;
            uVar2 = uVar;
            yVar3 = yVar2;
            iVar = iVar3;
            while (it.hasNext()) {
                eVar2 = (fz.e) it.next();
                this.f43294a = aVar2;
                this.f43295b = uVar2;
                this.f43296c = yVar3;
                this.f43297d = iVar;
                this.f43298e = it;
                this.f43300t = 2;
                if (eVar2.invoke(iVar, this) == aVar3) {
                    return aVar3;
                }
            }
            yVar2 = yVar3;
            uVar = uVar2;
            aVar = aVar2;
        } else {
            aVar = eVar;
        }
        iVar2.f44815d = null;
        this.f43294a = uVar;
        this.f43295b = yVar2;
        this.f43296c = aVar;
        this.f43297d = null;
        this.f43298e = null;
        this.f43300t = 3;
        if (aVar.b(this) != aVar3) {
            yVar4 = yVar2;
            uVar3 = uVar;
            uVar3.f38357a = true;
            aVar.a(null);
            obj2 = yVar4.f38361a;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            g0 g0VarG3 = vVar.g();
            this.f43294a = obj2;
            this.f43295b = null;
            this.f43296c = null;
            this.f43299f = iHashCode;
            this.f43300t = 4;
            objE = g0VarG3.e(this);
            if (objE != aVar3) {
                i11 = iHashCode;
                obj = objE;
                return new c(obj2, i11, ((Number) obj).intValue());
            }
        }
        return aVar3;
    }
}
