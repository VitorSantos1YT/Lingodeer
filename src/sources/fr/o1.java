package fr;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o1 implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uz.j f27749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1 f27750c;

    public /* synthetic */ o1(uz.j jVar, v1 v1Var, int i11) {
        this.f27748a = i11;
        this.f27749b = jVar;
        this.f27750c = v1Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:72:0x0155  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        n1 n1Var;
        q1 q1Var;
        r1 r1Var;
        s1 s1Var;
        int i11 = this.f27748a;
        qy.b0 b0Var = qy.b0.f48488a;
        v1 v1Var = this.f27750c;
        uz.j jVar = this.f27749b;
        vy.d dVar2 = null;
        int i12 = 1;
        int i13 = 0;
        switch (i11) {
            case 0:
                if (dVar instanceof n1) {
                    n1Var = (n1) dVar;
                    int i14 = n1Var.f27719b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        n1Var.f27719b = i14 - Integer.MIN_VALUE;
                    } else {
                        n1Var = new n1(this, dVar);
                    }
                } else {
                    n1Var = new n1(this, dVar);
                }
                Object objM = n1Var.f27718a;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i15 = n1Var.f27719b;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(objM);
                    yz.f fVar = rz.o0.f50940a;
                    yz.e eVar = yz.e.f58387a;
                    d1 d1Var = new d1((List) obj, v1Var, dVar2, i12);
                    n1Var.f27721d = jVar;
                    n1Var.f27722e = 0;
                    n1Var.f27719b = 1;
                    objM = rz.e0.M(eVar, d1Var, n1Var);
                    if (objM != aVar) {
                    }
                    return aVar;
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(objM);
                    return b0Var;
                }
                i13 = n1Var.f27722e;
                jVar = n1Var.f27721d;
                com.bumptech.glide.e.F(objM);
                n1Var.f27721d = null;
                n1Var.f27722e = i13;
                n1Var.f27719b = 2;
                if (jVar.emit(objM, n1Var) != aVar) {
                    return b0Var;
                }
                return aVar;
            case 1:
                if (dVar instanceof q1) {
                    q1Var = (q1) dVar;
                    int i16 = q1Var.f27791b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        q1Var.f27791b = i16 - Integer.MIN_VALUE;
                    } else {
                        q1Var = new q1(this, dVar);
                    }
                } else {
                    q1Var = new q1(this, dVar);
                }
                Object objM2 = q1Var.f27790a;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i17 = q1Var.f27791b;
                if (i17 == 0) {
                    com.bumptech.glide.e.F(objM2);
                    yz.f fVar2 = rz.o0.f50940a;
                    yz.e eVar2 = yz.e.f58387a;
                    d1 d1Var2 = new d1((List) obj, v1Var, dVar2, i13);
                    q1Var.f27793d = jVar;
                    q1Var.f27794e = 0;
                    q1Var.f27791b = 1;
                    objM2 = rz.e0.M(eVar2, d1Var2, q1Var);
                    if (objM2 != aVar2) {
                    }
                    return aVar2;
                }
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(objM2);
                    return b0Var;
                }
                i13 = q1Var.f27794e;
                jVar = q1Var.f27793d;
                com.bumptech.glide.e.F(objM2);
                q1Var.f27793d = null;
                q1Var.f27794e = i13;
                q1Var.f27791b = 2;
                if (jVar.emit(objM2, q1Var) != aVar2) {
                    return b0Var;
                }
                return aVar2;
            case 2:
                if (dVar instanceof r1) {
                    r1Var = (r1) dVar;
                    int i18 = r1Var.f27808b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        r1Var.f27808b = i18 - Integer.MIN_VALUE;
                    } else {
                        r1Var = new r1(this, dVar);
                    }
                } else {
                    r1Var = new r1(this, dVar);
                }
                Object objM3 = r1Var.f27807a;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i19 = r1Var.f27808b;
                if (i19 == 0) {
                    com.bumptech.glide.e.F(objM3);
                    yz.f fVar3 = rz.o0.f50940a;
                    yz.e eVar3 = yz.e.f58387a;
                    f1 f1Var = new f1((List) obj, v1Var, dVar2, i12);
                    r1Var.f27810d = jVar;
                    r1Var.f27811e = 0;
                    r1Var.f27808b = 1;
                    objM3 = rz.e0.M(eVar3, f1Var, r1Var);
                    if (objM3 != aVar3) {
                    }
                    return aVar3;
                }
                if (i19 != 1) {
                    if (i19 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(objM3);
                    return b0Var;
                }
                i13 = r1Var.f27811e;
                jVar = r1Var.f27810d;
                com.bumptech.glide.e.F(objM3);
                List listS0 = ry.m.S0((Iterable) objM3, new b4.e(22));
                r1Var.f27810d = null;
                r1Var.f27811e = i13;
                r1Var.f27808b = 2;
                if (jVar.emit(listS0, r1Var) != aVar3) {
                    return b0Var;
                }
                return aVar3;
            default:
                if (dVar instanceof s1) {
                    s1Var = (s1) dVar;
                    int i21 = s1Var.f27827b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        s1Var.f27827b = i21 - Integer.MIN_VALUE;
                    } else {
                        s1Var = new s1(this, dVar);
                    }
                } else {
                    s1Var = new s1(this, dVar);
                }
                Object objM4 = s1Var.f27826a;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i22 = s1Var.f27827b;
                if (i22 == 0) {
                    com.bumptech.glide.e.F(objM4);
                    yz.f fVar4 = rz.o0.f50940a;
                    yz.e eVar4 = yz.e.f58387a;
                    f1 f1Var2 = new f1((List) obj, v1Var, dVar2, i13);
                    s1Var.f27829d = jVar;
                    s1Var.f27830e = 0;
                    s1Var.f27827b = 1;
                    objM4 = rz.e0.M(eVar4, f1Var2, s1Var);
                    if (objM4 != aVar4) {
                    }
                    return aVar4;
                }
                if (i22 != 1) {
                    if (i22 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(objM4);
                    return b0Var;
                }
                i13 = s1Var.f27830e;
                jVar = s1Var.f27829d;
                com.bumptech.glide.e.F(objM4);
                List listS1 = ry.m.S0((Iterable) objM4, new b4.e(21));
                s1Var.f27829d = null;
                s1Var.f27830e = i13;
                s1Var.f27827b = 2;
                if (jVar.emit(listS1, s1Var) != aVar4) {
                    return b0Var;
                }
                return aVar4;
        }
    }
}
