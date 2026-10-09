package rt;

import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.TestModel;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class dd extends y9 {
    public final r8 A0;
    public final uz.i1 B0;
    public final sy.g C0;
    public final uz.r0 D0;
    public final uz.r0 E0;
    public final uz.r0 F0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final ur.a f49637n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final wt.m f49638o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final wt.o0 f49639p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ot.e0 f49640q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ot.o1 f49641r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ot.s1 f49642s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ot.i0 f49643t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final long f49644u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final long f49645v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final CoursePracticeType f49646w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final int f49647x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final List f49648y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final List f49649z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd(vt.n0 n0Var, vt.c cVar, vt.e eVar, vt.p0 p0Var, ur.a aVar, wt.m mVar, wt.b0 b0Var, vt.h hVar, wt.o0 o0Var, ot.e0 e0Var, ot.o1 o1Var, ot.s1 s1Var, ot.i0 i0Var, long j11, long j12, CoursePracticeType practiceType, String regex, int i11, List reviews, List testOutUnitIds, r8 r8Var) {
        super(n0Var, cVar, eVar, p0Var, hVar, b0Var);
        kotlin.jvm.internal.m.f(practiceType, "practiceType");
        kotlin.jvm.internal.m.f(regex, "regex");
        kotlin.jvm.internal.m.f(reviews, "reviews");
        kotlin.jvm.internal.m.f(testOutUnitIds, "testOutUnitIds");
        this.f49637n0 = aVar;
        this.f49638o0 = mVar;
        this.f49639p0 = o0Var;
        this.f49640q0 = e0Var;
        this.f49641r0 = o1Var;
        this.f49642s0 = s1Var;
        this.f49643t0 = i0Var;
        this.f49644u0 = j11;
        this.f49645v0 = j12;
        this.f49646w0 = practiceType;
        this.f49647x0 = i11;
        this.f49648y0 = reviews;
        this.f49649z0 = testOutUnitIds;
        this.A0 = r8Var;
        uz.i1 i1VarC = uz.x0.c(BuildConfig.VERSION_NAME);
        this.B0 = i1VarC;
        this.C0 = gb.r.e(reviews);
        vy.d dVar = null;
        int i12 = 3;
        uz.m0 m0VarJ = uz.x0.j(new no.g(I(n0Var, j11, practiceType, regex, i11, reviews), uz.x0.B(i1VarC, new gu.d(4, this, n0Var, dVar)), new t3(i12, 2, dVar)), this.W, this.f50706c0, new cd(this, n0Var, null));
        yz.e eVar2 = yz.e.f58387a;
        this.D0 = uz.x0.A(uz.x0.w(m0VarJ, eVar2), ViewModelKt.getViewModelScope(this), uz.a1.a(2), new pc(CropImageView.DEFAULT_ASPECT_RATIO));
        rz.e0.B(ViewModelKt.getViewModelScope(this), eVar2, null, new ns.j(24, this, n0Var, dVar), 2);
        uz.r0 r0VarA = uz.x0.A(uz.x0.w(uz.x0.k(l1.t.K(new sc(this, 0)), this.X, this.V, new no.g(this.f50702a0, this.f50704b0, new y2(i12, 2, dVar)), o0Var.f55339f, new ad(this, cVar, n0Var, null)), eVar2), ViewModelKt.getViewModelScope(this), uz.a1.a(2), CourseTestFinishSummaryUiState.Loading.INSTANCE);
        this.E0 = r0VarA;
        this.F0 = uz.x0.A(new x3(r0VarA, 1), ViewModelKt.getViewModelScope(this), uz.a1.a(2), Boolean.FALSE);
        uz.x0.A(uz.x0.w(new gp.r(new ns.j(this, dVar, 25)), eVar2), ViewModelKt.getViewModelScope(this), uz.a1.a(2), null);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:40:0x012f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x017c  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    @Override // rt.y9
    public final Object A(int i11, long j11, int i12, boolean z11, boolean z12, long j12, boolean z13, vy.d dVar) {
        xc xcVar;
        boolean z14;
        wy.a aVar;
        xc xcVar2;
        int i13;
        long j13;
        int i14;
        boolean z15;
        int i15;
        boolean zIsEmpty;
        long j14;
        boolean z16;
        int i16;
        boolean z17;
        long j15;
        long j16;
        int i17;
        xc xcVar3;
        int i18;
        Object objM;
        long j17 = j11;
        boolean z18 = z11;
        if (dVar instanceof xc) {
            xcVar = (xc) dVar;
            int i19 = xcVar.L;
            if ((i19 & Integer.MIN_VALUE) != 0) {
                xcVar.L = i19 - Integer.MIN_VALUE;
            } else {
                xcVar = new xc(this, (xy.c) dVar);
            }
        } else {
            xcVar = new xc(this, (xy.c) dVar);
        }
        Object objU = xcVar.H;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i21 = xcVar.L;
        qy.b0 b0Var = qy.b0.f48488a;
        int i22 = 6;
        if (i21 != 0) {
            if (i21 == 1) {
                z17 = xcVar.f50662t;
                j16 = xcVar.f50659d;
                z15 = xcVar.f50661f;
                z18 = xcVar.f50660e;
                i17 = xcVar.f50657b;
                j15 = xcVar.f50658c;
                i16 = xcVar.f50656a;
                com.bumptech.glide.e.F(objU);
            } else {
                if (i21 != 2) {
                    if (i21 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(objU);
                    return b0Var;
                }
                boolean z19 = xcVar.f50662t;
                long j18 = xcVar.f50659d;
                z15 = xcVar.f50661f;
                z18 = xcVar.f50660e;
                int i23 = xcVar.f50657b;
                long j19 = xcVar.f50658c;
                int i24 = xcVar.f50656a;
                com.bumptech.glide.e.F(objU);
                z14 = z19;
                aVar = aVar2;
                i18 = 3;
                xcVar2 = xcVar;
                i14 = i23;
                i15 = i24;
                j14 = j19;
                j13 = j18;
            }
            j17 = j14;
            i13 = i18;
            if ((i15 == 0 || i14 != i22) && i15 != i13) {
                List list = (List) this.V.getValue();
                LinkedHashMap linkedHashMap = this.H;
                xcVar2.f50656a = i15;
                xcVar2.f50658c = j17;
                xcVar2.f50657b = i14;
                xcVar2.f50660e = z18;
                xcVar2.f50661f = z15;
                xcVar2.f50659d = j13;
                xcVar2.f50662t = z14;
                xcVar2.L = i13;
                ot.s1 s1Var = this.f49642s0;
                s1Var.getClass();
                yz.f fVar = rz.o0.f50940a;
                objM = rz.e0.M(yz.e.f58387a, new ot.r1(this.f49644u0, i15, j17, i14, z18, z14, linkedHashMap, s1Var, this.f49646w0, list, null), xcVar2);
                if (objM != aVar) {
                    objM = b0Var;
                }
                if (objM == aVar) {
                    return aVar;
                }
            }
            return b0Var;
        }
        com.bumptech.glide.e.F(objU);
        if (z18) {
            z14 = z13;
            aVar = aVar2;
            xcVar2 = xcVar;
            i22 = 6;
            i13 = 3;
            j13 = j12;
            i14 = i12;
            z15 = z12;
            i15 = i11;
        } else {
            if (i11 == 0 && i12 == 6) {
                TestModel testModel = new TestModel();
                testModel.elemType = 0;
                testModel.elemId = j17;
                testModel.modelType = 1;
                gp.r rVarE = this.f49641r0.e(ns.o.K(testModel));
                xcVar.f50656a = i11;
                xcVar.f50658c = j17;
                xcVar.f50657b = i12;
                xcVar.f50660e = z18;
                xcVar.f50661f = z12;
                xcVar.f50659d = j12;
                xcVar.f50662t = z13;
                xcVar.L = 1;
                objU = uz.x0.u(rVarE, xcVar);
                if (objU == aVar2) {
                    return aVar2;
                }
                i16 = i11;
                z17 = z13;
                j15 = j17;
                j16 = j12;
                i17 = i12;
                z15 = z12;
            } else {
                z14 = z13;
                zIsEmpty = false;
                i15 = i11;
                i14 = i12;
                j14 = j17;
                z15 = z12;
                z16 = false;
                j13 = j12;
            }
            if (!zIsEmpty && z15) {
                z16 = true;
            }
            xcVar.f50656a = i15;
            xcVar.f50658c = j14;
            xcVar.f50657b = i14;
            xcVar.f50660e = z18;
            xcVar.f50661f = z15;
            xcVar.f50659d = j13;
            xcVar.f50662t = z14;
            xcVar.L = 2;
            xcVar3 = xcVar;
            aVar = aVar2;
            i18 = 3;
            xcVar2 = xcVar3;
            if (this.f49642s0.a(i15, j14, i14, j13, z14, z16, this.f50720t, xcVar3) == aVar) {
                return aVar;
            }
            j17 = j14;
            i13 = i18;
        }
        if (i15 == 0) {
            List list2 = (List) this.V.getValue();
            LinkedHashMap linkedHashMap2 = this.H;
            xcVar2.f50656a = i15;
            xcVar2.f50658c = j17;
            xcVar2.f50657b = i14;
            xcVar2.f50660e = z18;
            xcVar2.f50661f = z15;
            xcVar2.f50659d = j13;
            xcVar2.f50662t = z14;
            xcVar2.L = i13;
            ot.s1 s1Var2 = this.f49642s0;
            s1Var2.getClass();
            yz.f fVar2 = rz.o0.f50940a;
            objM = rz.e0.M(yz.e.f58387a, new ot.r1(this.f49644u0, i15, j17, i14, z18, z14, linkedHashMap2, s1Var2, this.f49646w0, list2, null), xcVar2);
            if (objM != aVar) {
                objM = b0Var;
            }
            if (objM == aVar) {
                return aVar;
            }
        } else {
            List list3 = (List) this.V.getValue();
            LinkedHashMap linkedHashMap3 = this.H;
            xcVar2.f50656a = i15;
            xcVar2.f50658c = j17;
            xcVar2.f50657b = i14;
            xcVar2.f50660e = z18;
            xcVar2.f50661f = z15;
            xcVar2.f50659d = j13;
            xcVar2.f50662t = z14;
            xcVar2.L = i13;
            ot.s1 s1Var3 = this.f49642s0;
            s1Var3.getClass();
            yz.f fVar3 = rz.o0.f50940a;
            objM = rz.e0.M(yz.e.f58387a, new ot.r1(this.f49644u0, i15, j17, i14, z18, z14, linkedHashMap3, s1Var3, this.f49646w0, list3, null), xcVar2);
            if (objM != aVar) {
                objM = b0Var;
            }
            if (objM == aVar) {
                return aVar;
            }
        }
        return b0Var;
        zIsEmpty = ((List) objU).isEmpty();
        int i25 = i16;
        z14 = z17;
        j14 = j15;
        i14 = i17;
        i15 = i25;
        long j21 = j16;
        z16 = false;
        j13 = j21;
        if (!zIsEmpty) {
            z16 = true;
        }
        xcVar.f50656a = i15;
        xcVar.f50658c = j14;
        xcVar.f50657b = i14;
        xcVar.f50660e = z18;
        xcVar.f50661f = z15;
        xcVar.f50659d = j13;
        xcVar.f50662t = z14;
        xcVar.L = 2;
        xcVar3 = xcVar;
        aVar = aVar2;
        i18 = 3;
        xcVar2 = xcVar3;
        if (this.f49642s0.a(i15, j14, i14, j13, z14, z16, this.f50720t, xcVar3) == aVar) {
            return aVar;
        }
        j17 = j14;
        i13 = i18;
        if (i15 == 0) {
            List list4 = (List) this.V.getValue();
            LinkedHashMap linkedHashMap4 = this.H;
            xcVar2.f50656a = i15;
            xcVar2.f50658c = j17;
            xcVar2.f50657b = i14;
            xcVar2.f50660e = z18;
            xcVar2.f50661f = z15;
            xcVar2.f50659d = j13;
            xcVar2.f50662t = z14;
            xcVar2.L = i13;
            ot.s1 s1Var4 = this.f49642s0;
            s1Var4.getClass();
            yz.f fVar4 = rz.o0.f50940a;
            objM = rz.e0.M(yz.e.f58387a, new ot.r1(this.f49644u0, i15, j17, i14, z18, z14, linkedHashMap4, s1Var4, this.f49646w0, list4, null), xcVar2);
            if (objM != aVar) {
                objM = b0Var;
            }
            if (objM == aVar) {
                return aVar;
            }
        } else {
            List list5 = (List) this.V.getValue();
            LinkedHashMap linkedHashMap5 = this.H;
            xcVar2.f50656a = i15;
            xcVar2.f50658c = j17;
            xcVar2.f50657b = i14;
            xcVar2.f50660e = z18;
            xcVar2.f50661f = z15;
            xcVar2.f50659d = j13;
            xcVar2.f50662t = z14;
            xcVar2.L = i13;
            ot.s1 s1Var5 = this.f49642s0;
            s1Var5.getClass();
            yz.f fVar5 = rz.o0.f50940a;
            objM = rz.e0.M(yz.e.f58387a, new ot.r1(this.f49644u0, i15, j17, i14, z18, z14, linkedHashMap5, s1Var5, this.f49646w0, list5, null), xcVar2);
            if (objM != aVar) {
                objM = b0Var;
            }
            if (objM == aVar) {
                return aVar;
            }
        }
        return b0Var;
    }

    @Override // rt.y9
    public final Object C(ot.j1 j1Var, t9 t9Var) {
        Objects.toString(j1Var.a());
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new kr.k1(this, j1Var, (vy.d) null, 2), t9Var);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    public final vz.i I(vt.n0 n0Var, long j11, CoursePracticeType practiceType, String regex, int i11, List reviews) {
        kotlin.jvm.internal.m.f(practiceType, "practiceType");
        kotlin.jvm.internal.m.f(regex, "regex");
        kotlin.jvm.internal.m.f(reviews, "reviews");
        return uz.x0.B(uz.x0.B(new gp.r(new h(11, practiceType, n0Var, null)), new tc(null, practiceType, this, i11, reviews, j11, regex)), new uc(null, this, regex, practiceType, n0Var));
    }

    @Override // rt.y9
    public final String q() {
        return this.f49646w0 == CoursePracticeType.CHARACTER_DRILL ? "kanji" : "course_c";
    }

    @Override // rt.y9
    public final Object z(t9 t9Var) {
        long j11 = this.f49644u0;
        qy.b0 b0Var = qy.b0.f48488a;
        if (j11 != -1) {
            List list = (List) this.V.getValue();
            LinkedHashMap linkedHashMap = this.H;
            ot.s1 s1Var = this.f49642s0;
            s1Var.getClass();
            yz.f fVar = rz.o0.f50940a;
            Object objM = rz.e0.M(yz.e.f58387a, new mr.a(j11, list, linkedHashMap, s1Var, this.f49646w0, null), t9Var);
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            if (objM != aVar) {
                objM = b0Var;
            }
            if (objM == aVar) {
                return objM;
            }
        }
        return b0Var;
    }
}
