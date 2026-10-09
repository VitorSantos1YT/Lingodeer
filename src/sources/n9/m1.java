package n9;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xy.i f43644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uz.j f43645c;

    /* JADX WARN: Multi-variable type inference failed */
    public m1(uz.j jVar, fz.e eVar, int i11) {
        this.f43643a = i11;
        switch (i11) {
            case 2:
                this.f43645c = jVar;
                this.f43644b = (xy.i) eVar;
                break;
            default:
                this.f43645c = jVar;
                this.f43644b = (xy.i) eVar;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0079  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [fz.e, xy.i] */
    /* JADX WARN: Type inference failed for: r2v14, types: [fz.e, xy.i] */
    /* JADX WARN: Type inference failed for: r9v7, types: [fz.e, xy.i] */
    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        l1 l1Var;
        uz.j jVar;
        uz.z zVar;
        Object obj2;
        Object obj3;
        m1 m1Var;
        uz.j0 j0Var;
        Object obj4;
        uz.j jVar2;
        switch (this.f43643a) {
            case 0:
                if (dVar instanceof l1) {
                    l1Var = (l1) dVar;
                    int i11 = l1Var.f43636b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        l1Var.f43636b = i11 - Integer.MIN_VALUE;
                    } else {
                        l1Var = new l1(this, dVar);
                    }
                } else {
                    l1Var = new l1(this, dVar);
                }
                Object obj5 = l1Var.f43635a;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = l1Var.f43636b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        jVar = l1Var.f43637c;
                        com.bumptech.glide.e.F(obj5);
                    } else {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj5);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj5);
                uz.j jVar3 = this.f43645c;
                l1Var.f43637c = jVar3;
                l1Var.f43636b = 1;
                Object objA = ((f0) obj).a(this.f43644b, l1Var);
                if (objA == aVar) {
                    return aVar;
                }
                obj5 = objA;
                jVar = jVar3;
                l1Var.f43637c = null;
                l1Var.f43636b = 2;
                if (jVar.emit(obj5, l1Var) == aVar) {
                    return aVar;
                }
                return qy.b0.f48488a;
            case 1:
                if (dVar instanceof uz.z) {
                    zVar = (uz.z) dVar;
                    int i13 = zVar.f53445c;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        zVar.f53445c = i13 - Integer.MIN_VALUE;
                    } else {
                        zVar = new uz.z(this, dVar);
                    }
                } else {
                    zVar = new uz.z(this, dVar);
                }
                Object obj6 = zVar.f53444b;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = zVar.f53445c;
                boolean z11 = true;
                if (i14 != 0) {
                    if (i14 == 1) {
                        Object obj7 = zVar.f53447e;
                        m1 m1Var2 = zVar.f53443a;
                        com.bumptech.glide.e.F(obj6);
                        obj3 = obj7;
                        m1Var = m1Var2;
                        obj2 = obj6;
                    } else {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        m1Var = zVar.f53443a;
                        com.bumptech.glide.e.F(obj6);
                    }
                    if (z11) {
                        return qy.b0.f48488a;
                    }
                    throw new AbortFlowException(m1Var);
                }
                com.bumptech.glide.e.F(obj6);
                zVar.f53443a = this;
                zVar.f53447e = obj;
                zVar.f53445c = 1;
                Object objInvoke = this.f43644b.invoke(obj, zVar);
                if (objInvoke == aVar2) {
                    return aVar2;
                }
                obj2 = objInvoke;
                obj3 = obj;
                m1Var = this;
                if (((Boolean) obj2).booleanValue()) {
                    uz.j jVar4 = m1Var.f43645c;
                    zVar.f53443a = m1Var;
                    zVar.f53447e = null;
                    zVar.f53445c = 2;
                    if (jVar4.emit(obj3, zVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    z11 = false;
                }
                if (z11) {
                    return qy.b0.f48488a;
                }
                throw new AbortFlowException(m1Var);
            default:
                if (dVar instanceof uz.j0) {
                    j0Var = (uz.j0) dVar;
                    int i15 = j0Var.f53321b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        j0Var.f53321b = i15 - Integer.MIN_VALUE;
                    } else {
                        j0Var = new uz.j0(this, dVar);
                    }
                } else {
                    j0Var = new uz.j0(this, dVar);
                }
                Object obj8 = j0Var.f53320a;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i16 = j0Var.f53321b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        jVar2 = j0Var.f53324e;
                        obj4 = j0Var.f53323d;
                        com.bumptech.glide.e.F(obj8);
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj8);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj8);
                j0Var.f53323d = obj;
                uz.j jVar5 = this.f43645c;
                j0Var.f53324e = jVar5;
                j0Var.f53321b = 1;
                if (this.f43644b.invoke(obj, j0Var) == aVar3) {
                    return aVar3;
                }
                obj4 = obj;
                jVar2 = jVar5;
                j0Var.f53323d = null;
                j0Var.f53324e = null;
                j0Var.f53321b = 2;
                if (jVar2.emit(obj4, j0Var) == aVar3) {
                    return aVar3;
                }
                return qy.b0.f48488a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m1(fz.e eVar, uz.j jVar) {
        this.f43643a = 1;
        this.f43644b = (xy.i) eVar;
        this.f43645c = jVar;
    }
}
