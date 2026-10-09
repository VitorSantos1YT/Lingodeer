package s2;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.List;
import y2.k1;
import y2.y1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1.q f51309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b7.o f51310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y.r f51311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k1 f51312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f51313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f51314h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f51315i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f51316j;

    public j(z1.q qVar) {
        this.f51309c = qVar;
        b7.o oVar = new b7.o(1, (byte) 0);
        oVar.f4014c = new long[2];
        this.f51310d = oVar;
        this.f51311e = new y.r(2);
        this.f51315i = true;
        this.f51316j = true;
    }

    /* JADX WARN: Code duplicated, block: B:159:0x02da  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r5v1, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // s2.k
    public final boolean a(y.r rVar, w2.x xVar, ie.o oVar, boolean z11) {
        y.r rVar2;
        b7.o oVar2;
        Object obj;
        boolean z12;
        boolean z13;
        l lVar;
        int i11;
        int i12;
        boolean z14;
        boolean zA = super.a(rVar, xVar, oVar, z11);
        ?? F = this.f51309c;
        boolean z15 = true;
        if (F.P) {
            ?? eVar = 0;
            while (F != 0) {
                if (F instanceof y1) {
                    this.f51312f = y2.f.v((y1) F, 16);
                } else if ((F.f58484c & 16) != 0 && (F instanceof y2.n)) {
                    z1.q qVar = ((y2.n) F).R;
                    int i13 = 0;
                    while (qVar != null) {
                        if ((qVar.f58484c & 16) != 0) {
                            i13++;
                            if (i13 == 1) {
                                F = F;
                                eVar = eVar;
                                eVar = eVar;
                                F = qVar;
                            } else {
                                if (eVar == 0) {
                                    eVar = new n1.e(new z1.q[16]);
                                }
                                if (F != 0) {
                                    eVar.c(F);
                                    F = 0;
                                }
                                eVar.c(qVar);
                            }
                        } else {
                            F = F;
                            eVar = eVar;
                        }
                        qVar = qVar.f58487f;
                        F = F;
                        eVar = eVar;
                    }
                    if (i13 == 1) {
                        F = F;
                        eVar = eVar;
                    } else {
                        F = F;
                        eVar = eVar;
                    }
                }
                F = y2.f.f(eVar);
            }
            if (this.f51312f != null) {
                int iJ = rVar.j();
                int i14 = 0;
                while (true) {
                    rVar2 = this.f51311e;
                    oVar2 = this.f51310d;
                    if (i14 >= iJ) {
                        break;
                    }
                    long jG = rVar.g(i14);
                    t tVar = (t) rVar.k(i14);
                    if (oVar2.c(jG)) {
                        boolean z16 = z15;
                        long j11 = tVar.f51349g;
                        List list = tVar.f51353k;
                        long j12 = tVar.f51345c;
                        if ((((j11 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j12 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z14 = z16;
                            ry.r rVar3 = ry.r.f50854a;
                            ArrayList arrayList = new ArrayList((list == null ? rVar3 : list).size());
                            if (list == null) {
                                list = rVar3;
                            }
                            int size = list.size();
                            int i15 = 0;
                            while (i15 < size) {
                                int i16 = size;
                                c cVar = (c) list.get(i15);
                                long j13 = jG;
                                List list2 = list;
                                long j14 = cVar.f51286b;
                                if ((((j14 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long j15 = cVar.f51285a;
                                    k1 k1Var = this.f51312f;
                                    kotlin.jvm.internal.m.c(k1Var);
                                    arrayList.add(new c(j15, k1Var.S(xVar, j14), cVar.f51287c));
                                }
                                i15++;
                                list = list2;
                                size = i16;
                                jG = j13;
                                tVar = tVar;
                            }
                            long j16 = jG;
                            k1 k1Var2 = this.f51312f;
                            kotlin.jvm.internal.m.c(k1Var2);
                            long jS = k1Var2.S(xVar, j11);
                            k1 k1Var3 = this.f51312f;
                            kotlin.jvm.internal.m.c(k1Var3);
                            t tVar2 = new t(tVar.f51343a, tVar.f51344b, k1Var3.S(xVar, j12), tVar.f51346d, tVar.f51347e, tVar.f51348f, jS, tVar.f51350h, tVar.f51351i, arrayList, tVar.f51352j, tVar.f51354l);
                            t tVar3 = tVar.f51356o;
                            if (tVar3 == null) {
                                tVar3 = tVar;
                            }
                            tVar2.f51356o = tVar3;
                            t tVar4 = tVar.f51356o;
                            if (tVar4 != null) {
                                tVar = tVar4;
                            }
                            tVar2.f51356o = tVar;
                            rVar2.h(j16, tVar2);
                        } else {
                            z14 = z16;
                        }
                    } else {
                        z14 = z15;
                    }
                    i14++;
                    z15 = z14;
                    iJ = iJ;
                    zA = zA;
                }
                boolean z17 = zA;
                boolean z18 = z15;
                if (rVar2.f()) {
                    oVar2.f4013b = 0;
                    this.f51320a.h();
                    return z18;
                }
                int i17 = oVar2.f4013b;
                while (true) {
                    i17--;
                    if (-1 >= i17) {
                        break;
                    }
                    if (rVar.d(oVar2.f4014c[i17]) < 0 && i17 < (i12 = oVar2.f4013b)) {
                        int i18 = i12 - 1;
                        int i19 = i17;
                        while (i19 < i18) {
                            long[] jArr = oVar2.f4014c;
                            int i21 = i19 + 1;
                            jArr[i19] = jArr[i21];
                            i19 = i21;
                        }
                        oVar2.f4013b--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(rVar2.j());
                int iJ2 = rVar2.j();
                for (int i22 = 0; i22 < iJ2; i22++) {
                    arrayList2.add(rVar2.k(i22));
                }
                l lVar2 = new l(arrayList2, oVar);
                int size2 = arrayList2.size();
                int i23 = 0;
                while (true) {
                    if (i23 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i23);
                    if (oVar.a(((t) obj).f51343a)) {
                        break;
                    }
                    i23++;
                }
                t tVar5 = (t) obj;
                if (tVar5 != null) {
                    boolean z19 = tVar5.f51346d;
                    if (z11) {
                        z12 = false;
                        if (!this.f51315i && (z19 || tVar5.f51350h)) {
                            k1 k1Var4 = this.f51312f;
                            kotlin.jvm.internal.m.c(k1Var4);
                            long j17 = k1Var4.f54503c;
                            long j18 = tVar5.f51345c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j18 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j18 & 4294967295L));
                            int i24 = (int) (j17 >> 32);
                            this.f51315i = !((fIntBitsToFloat2 > ((float) ((int) (j17 & 4294967295L))) ? z18 : false) | (fIntBitsToFloat > ((float) i24) ? z18 : false) | (fIntBitsToFloat < CropImageView.DEFAULT_ASPECT_RATIO ? z18 : false) | (fIntBitsToFloat2 < CropImageView.DEFAULT_ASPECT_RATIO ? z18 : false));
                        }
                    } else {
                        z12 = false;
                        this.f51315i = false;
                    }
                    boolean z20 = this.f51315i;
                    boolean z21 = this.f51314h;
                    if (z20 == z21 || !((i11 = lVar2.f51332e) == 3 || i11 == 4 || i11 == 5)) {
                        int i25 = lVar2.f51332e;
                        if (i25 == 4 && z21 && !this.f51316j) {
                            lVar2.f51332e = 3;
                        } else if (i25 == 5 && z20 && z19) {
                            lVar2.f51332e = 3;
                        }
                    } else {
                        lVar2.f51332e = z20 ? 4 : 5;
                    }
                } else {
                    z12 = false;
                }
                if (!z17 && lVar2.f51332e == 3 && (lVar = this.f51313g) != null) {
                    ?? r9 = lVar.f51328a;
                    int size3 = r9.size();
                    ?? r11 = lVar2.f51328a;
                    if (size3 != r11.size()) {
                        z13 = z18;
                        break;
                    }
                    int size4 = r11.size();
                    ?? r12 = z12;
                    while (true) {
                        if (r12 >= size4) {
                            z13 = z12;
                            break;
                        }
                        if (!f2.b.c(((t) r9.get(r12)).f51345c, ((t) r11.get(r12)).f51345c)) {
                            z13 = z18;
                            break;
                        }
                        r12++;
                    }
                } else {
                    z13 = z18;
                    break;
                }
                this.f51313g = lVar2;
                return z13;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // s2.k
    public final void b(ie.o oVar) {
        super.b(oVar);
        l lVar = this.f51313g;
        if (lVar == null) {
            return;
        }
        this.f51314h = this.f51315i;
        ?? r9 = lVar.f51328a;
        int size = r9.size();
        for (int i11 = 0; i11 < size; i11++) {
            t tVar = (t) r9.get(i11);
            boolean z11 = tVar.f51346d;
            long j11 = tVar.f51343a;
            boolean zA = oVar.a(j11);
            boolean z12 = this.f51315i;
            if ((!z11 && !zA) || (!z11 && !z12)) {
                this.f51310d.e(j11);
            }
        }
        this.f51315i = false;
        this.f51316j = lVar.f51332e == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void c() {
        n1.e eVar = this.f51320a;
        Object[] objArr = eVar.f43112a;
        int i11 = eVar.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            ((j) objArr[i12]).c();
        }
        ?? F = this.f51309c;
        ?? eVar2 = 0;
        while (F != 0) {
            if (F instanceof y1) {
                ((y1) F).G();
            } else if ((F.f58484c & 16) != 0 && (F instanceof y2.n)) {
                z1.q qVar = ((y2.n) F).R;
                int i13 = 0;
                F = F;
                eVar2 = eVar2;
                while (qVar != null) {
                    if ((qVar.f58484c & 16) != 0) {
                        i13++;
                        if (i13 == 1) {
                            eVar2 = eVar2;
                            F = qVar;
                        } else {
                            if (eVar2 == 0) {
                                eVar2 = new n1.e(new z1.q[16]);
                            }
                            if (F != 0) {
                                eVar2.c(F);
                                F = 0;
                            }
                            eVar2.c(qVar);
                        }
                    }
                    qVar = qVar.f58487f;
                    F = F;
                    eVar2 = eVar2;
                }
                if (i13 == 1) {
                }
            }
            F = y2.f.f(eVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(ie.o oVar) {
        y.r rVar = this.f51311e;
        boolean z11 = false;
        z11 = false;
        if (!rVar.f()) {
            z1.q qVar = this.f51309c;
            if (qVar.P) {
                l lVar = this.f51313g;
                kotlin.jvm.internal.m.c(lVar);
                k1 k1Var = this.f51312f;
                kotlin.jvm.internal.m.c(k1Var);
                long j11 = k1Var.f54503c;
                ?? F = qVar;
                ?? eVar = 0;
                while (F != 0) {
                    if (F instanceof y1) {
                        ((y1) F).q(lVar, m.Final, j11);
                    } else if ((F.f58484c & 16) != 0 && (F instanceof y2.n)) {
                        z1.q qVar2 = ((y2.n) F).R;
                        int i11 = 0;
                        while (qVar2 != null) {
                            if ((qVar2.f58484c & 16) != 0) {
                                i11++;
                                if (i11 == 1) {
                                    F = F;
                                    eVar = eVar;
                                    eVar = eVar;
                                    F = qVar2;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new n1.e(new z1.q[16]);
                                    }
                                    if (F != 0) {
                                        eVar.c(F);
                                        F = 0;
                                    }
                                    eVar.c(qVar2);
                                }
                            } else {
                                F = F;
                                eVar = eVar;
                            }
                            qVar2 = qVar2.f58487f;
                            F = F;
                            eVar = eVar;
                        }
                        if (i11 == 1) {
                            F = F;
                            eVar = eVar;
                        } else {
                            F = F;
                            eVar = eVar;
                        }
                    }
                    F = y2.f.f(eVar);
                }
                if (qVar.P) {
                    n1.e eVar2 = this.f51320a;
                    Object[] objArr = eVar2.f43112a;
                    int i12 = eVar2.f43114c;
                    for (int i13 = 0; i13 < i12; i13++) {
                        ((j) objArr[i13]).d(oVar);
                    }
                }
                z11 = true;
            }
        }
        b(oVar);
        rVar.a();
        this.f51312f = null;
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r0v3, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [z1.q] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [n1.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(ie.o oVar, boolean z11) {
        if (!this.f51311e.f()) {
            ?? F = this.f51309c;
            if (F.P) {
                l lVar = this.f51313g;
                kotlin.jvm.internal.m.c(lVar);
                k1 k1Var = this.f51312f;
                kotlin.jvm.internal.m.c(k1Var);
                long j11 = k1Var.f54503c;
                ?? F2 = F;
                ?? eVar = 0;
                while (F2 != 0) {
                    if (F2 instanceof y1) {
                        ((y1) F2).q(lVar, m.Initial, j11);
                    } else if ((F2.f58484c & 16) != 0 && (F2 instanceof y2.n)) {
                        z1.q qVar = ((y2.n) F2).R;
                        int i11 = 0;
                        while (qVar != null) {
                            if ((qVar.f58484c & 16) != 0) {
                                i11++;
                                if (i11 == 1) {
                                    F2 = F2;
                                    eVar = eVar;
                                    eVar = eVar;
                                    F2 = qVar;
                                } else {
                                    if (eVar == 0) {
                                        eVar = new n1.e(new z1.q[16]);
                                    }
                                    if (F2 != 0) {
                                        eVar.c(F2);
                                        F2 = 0;
                                    }
                                    eVar.c(qVar);
                                }
                            } else {
                                F2 = F2;
                                eVar = eVar;
                            }
                            qVar = qVar.f58487f;
                            F2 = F2;
                            eVar = eVar;
                        }
                        if (i11 == 1) {
                            F2 = F2;
                            eVar = eVar;
                        } else {
                            F2 = F2;
                            eVar = eVar;
                        }
                    }
                    F2 = y2.f.f(eVar);
                }
                if (F.P) {
                    n1.e eVar2 = this.f51320a;
                    Object[] objArr = eVar2.f43112a;
                    int i12 = eVar2.f43114c;
                    for (int i13 = 0; i13 < i12; i13++) {
                        j jVar = (j) objArr[i13];
                        kotlin.jvm.internal.m.c(this.f51312f);
                        jVar.e(oVar, z11);
                    }
                }
                if (F.P) {
                    ?? eVar3 = 0;
                    while (F != 0) {
                        if (F instanceof y1) {
                            ((y1) F).q(lVar, m.Main, j11);
                        } else if ((F.f58484c & 16) != 0 && (F instanceof y2.n)) {
                            z1.q qVar2 = ((y2.n) F).R;
                            int i14 = 0;
                            while (qVar2 != null) {
                                if ((qVar2.f58484c & 16) != 0) {
                                    i14++;
                                    if (i14 == 1) {
                                        F = F;
                                        eVar3 = eVar3;
                                        eVar3 = eVar3;
                                        F = qVar2;
                                    } else {
                                        if (eVar3 == 0) {
                                            eVar3 = new n1.e(new z1.q[16]);
                                        }
                                        if (F != 0) {
                                            eVar3.c(F);
                                            F = 0;
                                        }
                                        eVar3.c(qVar2);
                                    }
                                } else {
                                    F = F;
                                    eVar3 = eVar3;
                                }
                                qVar2 = qVar2.f58487f;
                                F = F;
                                eVar3 = eVar3;
                            }
                            if (i14 == 1) {
                                F = F;
                                eVar3 = eVar3;
                            } else {
                                F = F;
                                eVar3 = eVar3;
                            }
                        }
                        F = y2.f.f(eVar3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j11, y.e0 e0Var) {
        b7.o oVar = this.f51310d;
        if (oVar.c(j11) && e0Var.g(this) < 0) {
            oVar.e(j11);
            this.f51311e.i(j11);
        }
        n1.e eVar = this.f51320a;
        Object[] objArr = eVar.f43112a;
        int i11 = eVar.f43114c;
        for (int i12 = 0; i12 < i11; i12++) {
            ((j) objArr[i12]).f(j11, e0Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f51309c + ", children=" + this.f51320a + ", pointerIds=" + this.f51310d + ')';
    }
}
