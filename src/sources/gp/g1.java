package gp;

import bp.g2;
import com.google.api.Service;
import com.google.firebase.database.DataSnapshot;
import com.lingodeer.data.model.Bookmark;
import com.lingodeer.data.model.BookmarkFolder;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseSentenceModel010;
import com.lingodeer.data.model.CourseSentenceModel080;
import com.lingodeer.data.model.CourseSentenceModelQA;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.CourseWordModel010;
import com.lingodeer.data.model.DayStreakStatus;
import com.lingodeer.data.model.KnowledgeNote;
import com.lingodeer.data.model.TodayStreakType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import n9.n1;
import ot.u1;
import rt.dc;
import rt.e6;
import rt.k3;
import rt.la;
import rt.nf;
import rt.p9;
import rt.r3;
import rt.sa;
import rt.u9;
import rt.w3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g1 implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uz.j f29383b;

    public /* synthetic */ g1(uz.j jVar, int i11) {
        this.f29382a = i11;
        this.f29383b = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x018d  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:151:0x021b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0262  */
    /* JADX WARN: Code duplicated, block: B:208:0x0366  */
    /* JADX WARN: Code duplicated, block: B:224:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:240:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:256:0x0448  */
    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:272:0x048e  */
    /* JADX WARN: Code duplicated, block: B:288:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:304:0x0508  */
    /* JADX WARN: Code duplicated, block: B:326:0x0566  */
    /* JADX WARN: Code duplicated, block: B:348:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:366:0x0601  */
    /* JADX WARN: Code duplicated, block: B:382:0x0665  */
    /* JADX WARN: Code duplicated, block: B:413:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:431:0x070a  */
    /* JADX WARN: Code duplicated, block: B:447:0x0749  */
    /* JADX WARN: Code duplicated, block: B:463:0x0782  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:481:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:502:0x082d  */
    /* JADX WARN: Code duplicated, block: B:523:0x088a  */
    /* JADX WARN: Code duplicated, block: B:544:0x08e9  */
    /* JADX WARN: Code duplicated, block: B:565:0x0948  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x0150  */
    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v72, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v73 */
    /* JADX WARN: Type inference failed for: r5v82, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v83 */
    /* JADX WARN: Type inference failed for: r5v84, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r8v0, types: [vy.d] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) throws Throwable {
        f1 f1Var;
        uz.j jVar;
        h1 h1Var;
        uz.j jVar2;
        i1 i1Var;
        uz.j jVar3;
        j1 j1Var;
        uz.j jVar4;
        k1 k1Var;
        uz.j jVar5;
        gu.c cVar;
        jh.e eVar;
        js.n nVar;
        kr.x xVar;
        n5.m mVar;
        n9.d dVar2;
        n9.f fVar;
        nl.a aVar;
        nl.c cVar2;
        no.h hVar;
        no.o oVar;
        ot.b bVar;
        ot.i iVar;
        ot.r rVar;
        ot.t tVar;
        ot.x xVar2;
        rb.d dVar3;
        k3 k3Var;
        r3 r3Var;
        String note;
        w3 w3Var;
        e6 e6Var;
        p9 p9Var;
        u9 u9Var;
        la laVar;
        int i11 = this.f29382a;
        int i12 = 22;
        ?? r9 = BuildConfig.VERSION_NAME;
        int i13 = 2;
        int i14 = 0;
        z = false;
        boolean z11 = false;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        ?? r11 = 0;
        qy.b0 b0Var = qy.b0.f48488a;
        uz.j jVar6 = this.f29383b;
        switch (i11) {
            case 0:
                if (dVar instanceof f1) {
                    f1Var = (f1) dVar;
                    int i19 = f1Var.f29375b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        f1Var.f29375b = i19 - Integer.MIN_VALUE;
                    } else {
                        f1Var = new f1(this, dVar);
                    }
                } else {
                    f1Var = new f1(this, dVar);
                }
                Object objM = f1Var.f29374a;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i21 = f1Var.f29375b;
                if (i21 == 0) {
                    com.bumptech.glide.e.F(objM);
                    yz.f fVar2 = rz.o0.f50940a;
                    yz.e eVar2 = yz.e.f58387a;
                    g2 g2Var = new g2(i13, 16, r11);
                    f1Var.f29377d = jVar6;
                    f1Var.f29378e = 0;
                    f1Var.f29375b = 1;
                    objM = rz.e0.M(eVar2, g2Var, f1Var);
                    if (objM != aVar2) {
                    }
                    jVar = jVar6;
                    return aVar2;
                }
                if (i21 != 1) {
                    if (i21 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(objM);
                    return b0Var;
                }
                i14 = f1Var.f29378e;
                uz.j jVar7 = f1Var.f29377d;
                com.bumptech.glide.e.F(objM);
                jVar = jVar7;
                jVar = jVar6;
                f1Var.f29377d = null;
                f1Var.f29378e = i14;
                f1Var.f29375b = 2;
                if (jVar.emit(objM, f1Var) != aVar2) {
                    return b0Var;
                }
                jVar = jVar6;
                return aVar2;
            case 1:
                if (dVar instanceof h1) {
                    h1Var = (h1) dVar;
                    int i22 = h1Var.f29389b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        h1Var.f29389b = i22 - Integer.MIN_VALUE;
                    } else {
                        h1Var = new h1(this, dVar);
                    }
                } else {
                    h1Var = new h1(this, dVar);
                }
                Object objM2 = h1Var.f29388a;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i23 = h1Var.f29389b;
                if (i23 == 0) {
                    com.bumptech.glide.e.F(objM2);
                    yz.f fVar3 = rz.o0.f50940a;
                    yz.e eVar3 = yz.e.f58387a;
                    g2 g2Var2 = new g2(i13, 17, r11);
                    h1Var.f29391d = jVar6;
                    h1Var.f29392e = 0;
                    h1Var.f29389b = 1;
                    objM2 = rz.e0.M(eVar3, g2Var2, h1Var);
                    if (objM2 != aVar3) {
                    }
                    jVar2 = jVar6;
                    return aVar3;
                }
                if (i23 != 1) {
                    if (i23 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(objM2);
                    return b0Var;
                }
                i18 = h1Var.f29392e;
                uz.j jVar8 = h1Var.f29391d;
                com.bumptech.glide.e.F(objM2);
                jVar2 = jVar8;
                jVar2 = jVar6;
                h1Var.f29391d = null;
                h1Var.f29392e = i18;
                h1Var.f29389b = 2;
                if (jVar2.emit(objM2, h1Var) != aVar3) {
                    return b0Var;
                }
                jVar2 = jVar6;
                return aVar3;
            case 2:
                if (dVar instanceof i1) {
                    i1Var = (i1) dVar;
                    int i24 = i1Var.f29395b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        i1Var.f29395b = i24 - Integer.MIN_VALUE;
                    } else {
                        i1Var = new i1(this, dVar);
                    }
                } else {
                    i1Var = new i1(this, dVar);
                }
                Object objM3 = i1Var.f29394a;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i25 = i1Var.f29395b;
                if (i25 == 0) {
                    com.bumptech.glide.e.F(objM3);
                    yz.f fVar4 = rz.o0.f50940a;
                    yz.e eVar4 = yz.e.f58387a;
                    g2 g2Var3 = new g2(i13, 12, r11);
                    i1Var.f29397d = jVar6;
                    i1Var.f29398e = 0;
                    i1Var.f29395b = 1;
                    objM3 = rz.e0.M(eVar4, g2Var3, i1Var);
                    if (objM3 != aVar4) {
                    }
                    jVar3 = jVar6;
                    return aVar4;
                }
                if (i25 != 1) {
                    if (i25 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(objM3);
                    return b0Var;
                }
                i17 = i1Var.f29398e;
                uz.j jVar9 = i1Var.f29397d;
                com.bumptech.glide.e.F(objM3);
                jVar3 = jVar9;
                jVar3 = jVar6;
                i1Var.f29397d = null;
                i1Var.f29398e = i17;
                i1Var.f29395b = 2;
                if (jVar3.emit(objM3, i1Var) != aVar4) {
                    return b0Var;
                }
                jVar3 = jVar6;
                return aVar4;
            case 3:
                if (dVar instanceof j1) {
                    j1Var = (j1) dVar;
                    int i26 = j1Var.f29407b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        j1Var.f29407b = i26 - Integer.MIN_VALUE;
                    } else {
                        j1Var = new j1(this, dVar);
                    }
                } else {
                    j1Var = new j1(this, dVar);
                }
                Object objM4 = j1Var.f29406a;
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i27 = j1Var.f29407b;
                if (i27 == 0) {
                    com.bumptech.glide.e.F(objM4);
                    yz.f fVar5 = rz.o0.f50940a;
                    yz.e eVar5 = yz.e.f58387a;
                    g2 g2Var4 = new g2(i13, i12, r11);
                    j1Var.f29409d = jVar6;
                    j1Var.f29410e = 0;
                    j1Var.f29407b = 1;
                    objM4 = rz.e0.M(eVar5, g2Var4, j1Var);
                    if (objM4 != aVar5) {
                    }
                    jVar4 = jVar6;
                    return aVar5;
                }
                if (i27 != 1) {
                    if (i27 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(objM4);
                    return b0Var;
                }
                i16 = j1Var.f29410e;
                uz.j jVar10 = j1Var.f29409d;
                com.bumptech.glide.e.F(objM4);
                jVar4 = jVar10;
                jVar4 = jVar6;
                j1Var.f29409d = null;
                j1Var.f29410e = i16;
                j1Var.f29407b = 2;
                if (jVar4.emit(objM4, j1Var) != aVar5) {
                    return b0Var;
                }
                jVar4 = jVar6;
                return aVar5;
            case 4:
                if (dVar instanceof k1) {
                    k1Var = (k1) dVar;
                    int i28 = k1Var.f29419b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        k1Var.f29419b = i28 - Integer.MIN_VALUE;
                    } else {
                        k1Var = new k1(this, dVar);
                    }
                } else {
                    k1Var = new k1(this, dVar);
                }
                Object objM5 = k1Var.f29418a;
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i29 = k1Var.f29419b;
                if (i29 == 0) {
                    com.bumptech.glide.e.F(objM5);
                    yz.f fVar6 = rz.o0.f50940a;
                    yz.e eVar6 = yz.e.f58387a;
                    g2 g2Var5 = new g2(i13, 8, r11);
                    k1Var.f29421d = jVar6;
                    k1Var.f29422e = 0;
                    k1Var.f29419b = 1;
                    objM5 = rz.e0.M(eVar6, g2Var5, k1Var);
                    if (objM5 != aVar6) {
                    }
                    jVar5 = jVar6;
                    return aVar6;
                }
                if (i29 != 1) {
                    if (i29 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(objM5);
                    return b0Var;
                }
                i15 = k1Var.f29422e;
                uz.j jVar11 = k1Var.f29421d;
                com.bumptech.glide.e.F(objM5);
                jVar5 = jVar11;
                jVar5 = jVar6;
                k1Var.f29421d = null;
                k1Var.f29422e = i15;
                k1Var.f29419b = 2;
                if (jVar5.emit(objM5, k1Var) != aVar6) {
                    return b0Var;
                }
                jVar5 = jVar6;
                return aVar6;
            case 5:
                if (dVar instanceof gu.c) {
                    cVar = (gu.c) dVar;
                    int i30 = cVar.f29842b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        cVar.f29842b = i30 - Integer.MIN_VALUE;
                    } else {
                        cVar = new gu.c(this, dVar);
                    }
                } else {
                    cVar = new gu.c(this, dVar);
                }
                Object obj2 = cVar.f29841a;
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i31 = cVar.f29842b;
                if (i31 != 0) {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj2);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj2);
                if (ry.l.D(new TodayStreakType[]{TodayStreakType.STREAK_MILESTONE, TodayStreakType.STREAK}, ((DayStreakStatus) obj).getTodayStreakType())) {
                    return b0Var;
                }
                cVar.f29842b = 1;
                return jVar6.emit(obj, cVar) == aVar7 ? aVar7 : b0Var;
            case 6:
                if (dVar instanceof jh.e) {
                    eVar = (jh.e) dVar;
                    int i32 = eVar.f36348b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        eVar.f36348b = i32 - Integer.MIN_VALUE;
                    } else {
                        eVar = new jh.e(this, dVar);
                    }
                } else {
                    eVar = new jh.e(this, dVar);
                }
                Object obj3 = eVar.f36347a;
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                int i33 = eVar.f36348b;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj3);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj3);
                eVar.f36348b = 1;
                return jVar6.emit(b0Var, eVar) == aVar8 ? aVar8 : b0Var;
            case 7:
                if (dVar instanceof js.n) {
                    nVar = (js.n) dVar;
                    int i34 = nVar.f36800b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        nVar.f36800b = i34 - Integer.MIN_VALUE;
                    } else {
                        nVar = new js.n(this, dVar);
                    }
                } else {
                    nVar = new js.n(this, dVar);
                }
                Object obj4 = nVar.f36799a;
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                int i35 = nVar.f36800b;
                if (i35 != 0) {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj4);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj4);
                Boolean boolValueOf = Boolean.valueOf(((av.e0) obj) instanceof av.d0);
                nVar.f36800b = 1;
                return jVar6.emit(boolValueOf, nVar) == aVar9 ? aVar9 : b0Var;
            case 8:
                if (dVar instanceof kr.x) {
                    xVar = (kr.x) dVar;
                    int i36 = xVar.f38609b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        xVar.f38609b = i36 - Integer.MIN_VALUE;
                    } else {
                        xVar = new kr.x(this, dVar);
                    }
                } else {
                    xVar = new kr.x(this, dVar);
                }
                Object obj5 = xVar.f38608a;
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                int i37 = xVar.f38609b;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj5);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj5);
                if (!((Boolean) ((qy.l) obj).f48496b).booleanValue()) {
                    return b0Var;
                }
                xVar.f38609b = 1;
                return jVar6.emit(obj, xVar) == aVar10 ? aVar10 : b0Var;
            case 9:
                if (dVar instanceof n5.m) {
                    mVar = (n5.m) dVar;
                    int i38 = mVar.f43317b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        mVar.f43317b = i38 - Integer.MIN_VALUE;
                    } else {
                        mVar = new n5.m(this, dVar);
                    }
                } else {
                    mVar = new n5.m(this, dVar);
                }
                Object obj6 = mVar.f43316a;
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                int i39 = mVar.f43317b;
                if (i39 != 0) {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj6);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj6);
                n5.x0 x0Var = (n5.x0) obj;
                if (x0Var instanceof n5.q0) {
                    throw ((n5.q0) x0Var).f43362b;
                }
                if (x0Var instanceof n5.c) {
                    Object obj7 = ((n5.c) x0Var).f43249b;
                    mVar.f43317b = 1;
                    return jVar6.emit(obj7, mVar) == aVar11 ? aVar11 : b0Var;
                }
                if (x0Var instanceof n5.f0 ? true : x0Var instanceof n5.y0) {
                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                }
                throw new NoWhenBranchMatchedException();
            case 10:
                if (dVar instanceof n9.d) {
                    dVar2 = (n9.d) dVar;
                    int i40 = dVar2.f43527b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        dVar2.f43527b = i40 - Integer.MIN_VALUE;
                    } else {
                        dVar2 = new n9.d(this, dVar);
                    }
                } else {
                    dVar2 = new n9.d(this, dVar);
                }
                Object obj8 = dVar2.f43526a;
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                int i41 = dVar2.f43527b;
                if (i41 != 0) {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj8);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj8);
                n9.z zVar = (n9.z) obj;
                uz.q qVar = new uz.q(new n1(new km.s0(zVar, r11, 6), (r) zVar.f43742b.f521e), new g.k(zVar, r11, i13));
                n9.e1 e1Var = zVar.f43741a;
                n9.e1 e1Var2 = new n9.e1(qVar, e1Var.f43549b, e1Var.f43550c, new a0.c0(zVar, i12));
                dVar2.f43527b = 1;
                return jVar6.emit(e1Var2, dVar2) == aVar12 ? aVar12 : b0Var;
            case 11:
                if (dVar instanceof n9.f) {
                    fVar = (n9.f) dVar;
                    int i42 = fVar.f43553b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        fVar.f43553b = i42 - Integer.MIN_VALUE;
                    } else {
                        fVar = new n9.f(this, dVar);
                    }
                } else {
                    fVar = new n9.f(this, dVar);
                }
                Object obj9 = fVar.f43552a;
                wy.a aVar13 = wy.a.COROUTINE_SUSPENDED;
                int i43 = fVar.f43553b;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj9);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj9);
                Object obj10 = ((qy.l) obj).f48496b;
                if (obj10 == null) {
                    return b0Var;
                }
                fVar.f43553b = 1;
                return jVar6.emit(obj10, fVar) == aVar13 ? aVar13 : b0Var;
            case 12:
                if (dVar instanceof nl.a) {
                    aVar = (nl.a) dVar;
                    int i44 = aVar.f43839b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        aVar.f43839b = i44 - Integer.MIN_VALUE;
                    } else {
                        aVar = new nl.a(this, dVar);
                    }
                } else {
                    aVar = new nl.a(this, dVar);
                }
                Object obj11 = aVar.f43838a;
                wy.a aVar14 = wy.a.COROUTINE_SUSPENDED;
                int i45 = aVar.f43839b;
                if (i45 != 0) {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj11);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj11);
                Iterable iterableA = ((DataSnapshot) obj).a();
                ArrayList arrayList = new ArrayList();
                Iterator it = iterableA.iterator();
                while (it.hasNext()) {
                    String strF = ((DataSnapshot) it.next()).f18955b.f();
                    if (strF != null) {
                        arrayList.add(strF);
                    }
                }
                aVar.f43839b = 1;
                return jVar6.emit(arrayList, aVar) == aVar14 ? aVar14 : b0Var;
            case 13:
                if (dVar instanceof nl.c) {
                    cVar2 = (nl.c) dVar;
                    int i46 = cVar2.f43844b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        cVar2.f43844b = i46 - Integer.MIN_VALUE;
                    } else {
                        cVar2 = new nl.c(this, dVar);
                    }
                } else {
                    cVar2 = new nl.c(this, dVar);
                }
                Object obj12 = cVar2.f43843a;
                wy.a aVar15 = wy.a.COROUTINE_SUSPENDED;
                int i47 = cVar2.f43844b;
                if (i47 != 0) {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj12);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj12);
                Iterable iterableA2 = ((DataSnapshot) obj).a();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = iterableA2.iterator();
                while (it2.hasNext()) {
                    String strF2 = ((DataSnapshot) it2.next()).f18955b.f();
                    if (strF2 != null) {
                        arrayList2.add(strF2);
                    }
                }
                cVar2.f43844b = 1;
                return jVar6.emit(arrayList2, cVar2) == aVar15 ? aVar15 : b0Var;
            case 14:
                if (dVar instanceof no.h) {
                    hVar = (no.h) dVar;
                    int i48 = hVar.f43874b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        hVar.f43874b = i48 - Integer.MIN_VALUE;
                    } else {
                        hVar = new no.h(this, dVar);
                    }
                } else {
                    hVar = new no.h(this, dVar);
                }
                Object obj13 = hVar.f43873a;
                wy.a aVar16 = wy.a.COROUTINE_SUSPENDED;
                int i49 = hVar.f43874b;
                if (i49 != 0) {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj13);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj13);
                Object objB = ((DataSnapshot) obj).b();
                hVar.f43874b = 1;
                return jVar6.emit(objB, hVar) == aVar16 ? aVar16 : b0Var;
            case 15:
                if (dVar instanceof no.o) {
                    oVar = (no.o) dVar;
                    int i50 = oVar.f43905b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        oVar.f43905b = i50 - Integer.MIN_VALUE;
                    } else {
                        oVar = new no.o(this, dVar);
                    }
                } else {
                    oVar = new no.o(this, dVar);
                }
                Object obj14 = oVar.f43904a;
                wy.a aVar17 = wy.a.COROUTINE_SUSPENDED;
                int i51 = oVar.f43905b;
                if (i51 != 0) {
                    if (i51 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj14);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj14);
                Object objB2 = ((DataSnapshot) obj).b();
                oVar.f43905b = 1;
                return jVar6.emit(objB2, oVar) == aVar17 ? aVar17 : b0Var;
            case 16:
                if (dVar instanceof ot.b) {
                    bVar = (ot.b) dVar;
                    int i52 = bVar.f45743b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        bVar.f45743b = i52 - Integer.MIN_VALUE;
                    } else {
                        bVar = new ot.b(this, dVar);
                    }
                } else {
                    bVar = new ot.b(this, dVar);
                }
                Object obj15 = bVar.f45742a;
                wy.a aVar18 = wy.a.COROUTINE_SUSPENDED;
                int i53 = bVar.f45743b;
                if (i53 != 0) {
                    if (i53 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj15);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj15);
                CourseWordModel010 courseWordModel010 = (CourseWordModel010) obj;
                u1 u1Var = new u1(courseWordModel010.getWord(), courseWordModel010.getOptionList());
                bVar.f45743b = 1;
                return jVar6.emit(u1Var, bVar) == aVar18 ? aVar18 : b0Var;
            case 17:
                if (dVar instanceof ot.i) {
                    iVar = (ot.i) dVar;
                    int i54 = iVar.f45849b;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        iVar.f45849b = i54 - Integer.MIN_VALUE;
                    } else {
                        iVar = new ot.i(this, dVar);
                    }
                } else {
                    iVar = new ot.i(this, dVar);
                }
                Object obj16 = iVar.f45848a;
                wy.a aVar19 = wy.a.COROUTINE_SUSPENDED;
                int i55 = iVar.f45849b;
                if (i55 != 0) {
                    if (i55 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj16);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj16);
                CourseSentenceModel010 courseSentenceModel010 = (CourseSentenceModel010) obj;
                ot.h hVar2 = new ot.h(courseSentenceModel010.getSentence(), Long.parseLong(courseSentenceModel010.getAnswer()), ns.o.S(courseSentenceModel010.getOptionList()));
                iVar.f45849b = 1;
                return jVar6.emit(hVar2, iVar) == aVar19 ? aVar19 : b0Var;
            case 18:
                if (dVar instanceof ot.r) {
                    rVar = (ot.r) dVar;
                    int i56 = rVar.f45963b;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        rVar.f45963b = i56 - Integer.MIN_VALUE;
                    } else {
                        rVar = new ot.r(this, dVar);
                    }
                } else {
                    rVar = new ot.r(this, dVar);
                }
                Object obj17 = rVar.f45962a;
                wy.a aVar20 = wy.a.COROUTINE_SUSPENDED;
                int i57 = rVar.f45963b;
                if (i57 != 0) {
                    if (i57 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj17);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj17);
                CourseSentence courseSentence = (CourseSentence) obj;
                ot.q qVar2 = new ot.q(courseSentence, courseSentence.getDisplayCourseWords());
                rVar.f45963b = 1;
                return jVar6.emit(qVar2, rVar) == aVar20 ? aVar20 : b0Var;
            case 19:
                if (dVar instanceof ot.t) {
                    tVar = (ot.t) dVar;
                    int i58 = tVar.f45993b;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        tVar.f45993b = i58 - Integer.MIN_VALUE;
                    } else {
                        tVar = new ot.t(this, dVar);
                    }
                } else {
                    tVar = new ot.t(this, dVar);
                }
                Object obj18 = tVar.f45992a;
                wy.a aVar21 = wy.a.COROUTINE_SUSPENDED;
                int i59 = tVar.f45993b;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj18);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj18);
                CourseSentenceModel080 courseSentenceModel080 = (CourseSentenceModel080) obj;
                ot.s sVar = new ot.s(courseSentenceModel080.getSentence(), courseSentenceModel080.getAnswer(), ns.o.S(courseSentenceModel080.getOptionList()));
                tVar.f45993b = 1;
                return jVar6.emit(sVar, tVar) == aVar21 ? aVar21 : b0Var;
            case 20:
                if (dVar instanceof ot.x) {
                    xVar2 = (ot.x) dVar;
                    int i60 = xVar2.f46038b;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        xVar2.f46038b = i60 - Integer.MIN_VALUE;
                    } else {
                        xVar2 = new ot.x(this, dVar);
                    }
                } else {
                    xVar2 = new ot.x(this, dVar);
                }
                Object obj19 = xVar2.f46037a;
                wy.a aVar22 = wy.a.COROUTINE_SUSPENDED;
                int i61 = xVar2.f46038b;
                if (i61 != 0) {
                    if (i61 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj19);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj19);
                CourseSentenceModelQA courseSentenceModelQA = (CourseSentenceModelQA) obj;
                boolean zA = kotlin.jvm.internal.m.a(courseSentenceModelQA.getOptPosition(), "True");
                CourseSentence sentence2 = zA ? courseSentenceModelQA.getSentence2() : courseSentenceModelQA.getSentence();
                CourseSentence sentence = zA ? courseSentenceModelQA.getSentence() : courseSentenceModelQA.getSentence2();
                List<CourseWord> displayCourseWords = courseSentenceModelQA.getSentence().getDisplayCourseWords();
                ArrayList arrayList3 = new ArrayList(ry.n.W(displayCourseWords, 10));
                for (CourseWord courseWordCopy$default : displayCourseWords) {
                    if (!kotlin.jvm.internal.m.a(courseWordCopy$default.getWord(), " ") && courseWordCopy$default.getWordType() != 1) {
                        courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, "_____", null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, true, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -1048579, 63, null);
                    }
                    arrayList3.add(courseWordCopy$default);
                }
                ot.w wVar = new ot.w(zA, sentence2, sentence, arrayList3, ns.o.S(courseSentenceModelQA.getOptionList()));
                xVar2.f46038b = 1;
                return jVar6.emit(wVar, xVar2) == aVar22 ? aVar22 : b0Var;
            case 21:
                Object objEmit = jVar6.emit((List) obj, dVar);
                return objEmit == wy.a.COROUTINE_SUSPENDED ? objEmit : b0Var;
            case 22:
                if (dVar instanceof rb.d) {
                    dVar3 = (rb.d) dVar;
                    int i62 = dVar3.f49069b;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        dVar3.f49069b = i62 - Integer.MIN_VALUE;
                    } else {
                        dVar3 = new rb.d(this, dVar);
                    }
                } else {
                    dVar3 = new rb.d(this, dVar);
                }
                Object obj20 = dVar3.f49068a;
                wy.a aVar23 = wy.a.COROUTINE_SUSPENDED;
                int i63 = dVar3.f49069b;
                if (i63 != 0) {
                    if (i63 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj20);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj20);
                if (!(obj instanceof kb.b)) {
                    return b0Var;
                }
                dVar3.f49069b = 1;
                return jVar6.emit(obj, dVar3) == aVar23 ? aVar23 : b0Var;
            case 23:
                if (dVar instanceof k3) {
                    k3Var = (k3) dVar;
                    int i64 = k3Var.f49964b;
                    if ((i64 & Integer.MIN_VALUE) != 0) {
                        k3Var.f49964b = i64 - Integer.MIN_VALUE;
                    } else {
                        k3Var = new k3(this, dVar);
                    }
                } else {
                    k3Var = new k3(this, dVar);
                }
                Object obj21 = k3Var.f49963a;
                wy.a aVar24 = wy.a.COROUTINE_SUSPENDED;
                int i65 = k3Var.f49964b;
                if (i65 != 0) {
                    if (i65 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj21);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj21);
                Bookmark bookmark = (Bookmark) obj;
                if (bookmark != null && bookmark.isFav() == 1) {
                    z11 = true;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z11);
                k3Var.f49964b = 1;
                return jVar6.emit(boolValueOf2, k3Var) == aVar24 ? aVar24 : b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                if (dVar instanceof r3) {
                    r3Var = (r3) dVar;
                    int i66 = r3Var.f50330b;
                    if ((i66 & Integer.MIN_VALUE) != 0) {
                        r3Var.f50330b = i66 - Integer.MIN_VALUE;
                    } else {
                        r3Var = new r3(this, dVar);
                    }
                } else {
                    r3Var = new r3(this, dVar);
                }
                Object obj22 = r3Var.f50329a;
                wy.a aVar25 = wy.a.COROUTINE_SUSPENDED;
                int i67 = r3Var.f50330b;
                if (i67 != 0) {
                    if (i67 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj22);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj22);
                KnowledgeNote knowledgeNote = (KnowledgeNote) obj;
                if (knowledgeNote != null) {
                    note = knowledgeNote.getNote();
                }
                if (r11 != 0) {
                    r11 = note;
                    r9 = r11;
                }
                r11 = note;
                dc dcVar = new dc(true, r9);
                r3Var.f50330b = 1;
                return jVar6.emit(dcVar, r3Var) == aVar25 ? aVar25 : b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                if (dVar instanceof w3) {
                    w3Var = (w3) dVar;
                    int i68 = w3Var.f50571b;
                    if ((i68 & Integer.MIN_VALUE) != 0) {
                        w3Var.f50571b = i68 - Integer.MIN_VALUE;
                    } else {
                        w3Var = new w3(this, dVar);
                    }
                } else {
                    w3Var = new w3(this, dVar);
                }
                Object obj23 = w3Var.f50570a;
                wy.a aVar26 = wy.a.COROUTINE_SUSPENDED;
                int i69 = w3Var.f50571b;
                if (i69 != 0) {
                    if (i69 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj23);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj23);
                nf nfVar = (nf) obj;
                rt.n0 n0Var = nfVar != null ? nfVar.f50159a : null;
                w3Var.f50571b = 1;
                return jVar6.emit(n0Var, w3Var) == aVar26 ? aVar26 : b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                if (dVar instanceof e6) {
                    e6Var = (e6) dVar;
                    int i70 = e6Var.f49682b;
                    if ((i70 & Integer.MIN_VALUE) != 0) {
                        e6Var.f49682b = i70 - Integer.MIN_VALUE;
                    } else {
                        e6Var = new e6(this, dVar);
                    }
                } else {
                    e6Var = new e6(this, dVar);
                }
                Object obj24 = e6Var.f49681a;
                wy.a aVar27 = wy.a.COROUTINE_SUSPENDED;
                int i71 = e6Var.f49682b;
                if (i71 != 0) {
                    if (i71 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj24);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj24);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it3 = ((List) obj).iterator();
                while (it3.hasNext()) {
                    linkedHashSet.add(((BookmarkFolder) it3.next()).getId());
                }
                e6Var.f49682b = 1;
                return jVar6.emit(linkedHashSet, e6Var) == aVar27 ? aVar27 : b0Var;
            case 27:
                if (dVar instanceof p9) {
                    p9Var = (p9) dVar;
                    int i72 = p9Var.f50244b;
                    if ((i72 & Integer.MIN_VALUE) != 0) {
                        p9Var.f50244b = i72 - Integer.MIN_VALUE;
                    } else {
                        p9Var = new p9(this, dVar);
                    }
                } else {
                    p9Var = new p9(this, dVar);
                }
                Object obj25 = p9Var.f50243a;
                wy.a aVar28 = wy.a.COROUTINE_SUSPENDED;
                int i73 = p9Var.f50244b;
                if (i73 != 0) {
                    if (i73 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj25);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj25);
                KnowledgeNote knowledgeNote2 = (KnowledgeNote) obj;
                String note2 = knowledgeNote2 != null ? knowledgeNote2.getNote() : null;
                if (note2 != null) {
                    r9 = note2;
                }
                dc dcVar2 = new dc(true, r9);
                p9Var.f50244b = 1;
                return jVar6.emit(dcVar2, p9Var) == aVar28 ? aVar28 : b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                if (dVar instanceof u9) {
                    u9Var = (u9) dVar;
                    int i74 = u9Var.f50489b;
                    if ((i74 & Integer.MIN_VALUE) != 0) {
                        u9Var.f50489b = i74 - Integer.MIN_VALUE;
                    } else {
                        u9Var = new u9(this, dVar);
                    }
                } else {
                    u9Var = new u9(this, dVar);
                }
                Object obj26 = u9Var.f50488a;
                wy.a aVar29 = wy.a.COROUTINE_SUSPENDED;
                int i75 = u9Var.f50489b;
                if (i75 != 0) {
                    if (i75 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj26);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj26);
                KnowledgeNote knowledgeNote3 = (KnowledgeNote) obj;
                String note3 = knowledgeNote3 != null ? knowledgeNote3.getNote() : null;
                if (note3 != null) {
                    r9 = note3;
                }
                dc dcVar3 = new dc(true, r9);
                u9Var.f50489b = 1;
                return jVar6.emit(dcVar3, u9Var) == aVar29 ? aVar29 : b0Var;
            default:
                if (dVar instanceof la) {
                    laVar = (la) dVar;
                    int i76 = laVar.f50026b;
                    if ((i76 & Integer.MIN_VALUE) != 0) {
                        laVar.f50026b = i76 - Integer.MIN_VALUE;
                    } else {
                        laVar = new la(this, dVar);
                    }
                } else {
                    laVar = new la(this, dVar);
                }
                Object obj27 = laVar.f50025a;
                wy.a aVar30 = wy.a.COROUTINE_SUSPENDED;
                int i77 = laVar.f50026b;
                if (i77 != 0) {
                    if (i77 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj27);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj27);
                sa saVar = new sa((List) obj);
                laVar.f50026b = 1;
                return jVar6.emit(saVar, laVar) == aVar30 ? aVar30 : b0Var;
        }
    }
}
