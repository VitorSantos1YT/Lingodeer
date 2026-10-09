package rt;

import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.TestModel;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import com.yalantis.ucrop.view.CropImageView;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e3 extends y9 {
    public final bq.f A0;
    public final uz.r0 B0;
    public final sy.g C0;
    public final LinkedHashSet D0;
    public final LinkedHashSet E0;
    public boolean F0;
    public boolean G0;
    public final boolean H0;
    public final uz.r0 I0;
    public final uz.r0 J0;
    public final uz.r0 K0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final wt.m f49666n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final wt.o0 f49667o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final wt.b0 f49668p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ot.e0 f49669q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ot.o1 f49670r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ot.s1 f49671s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ot.i0 f49672t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final List f49673u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final r8 f49674v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final boolean f49675w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final CoursePracticeType f49676x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final uz.i1 f49677y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final LinkedHashMap f49678z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(vt.n0 n0Var, vt.c cVar, vt.e eVar, vt.p0 p0Var, wt.m mVar, wt.o0 o0Var, wt.b0 b0Var, vt.h hVar, ot.e0 e0Var, ot.o1 o1Var, ot.s1 s1Var, ot.i0 i0Var, List reviews, r8 practiceModelOverride, boolean z11) {
        ot.h2 h2Var;
        super(n0Var, cVar, eVar, p0Var, hVar, b0Var);
        kotlin.jvm.internal.m.f(reviews, "reviews");
        kotlin.jvm.internal.m.f(practiceModelOverride, "practiceModelOverride");
        this.f49666n0 = mVar;
        this.f49667o0 = o0Var;
        this.f49668p0 = b0Var;
        this.f49669q0 = e0Var;
        this.f49670r0 = o1Var;
        this.f49671s0 = s1Var;
        this.f49672t0 = i0Var;
        this.f49673u0 = reviews;
        this.f49674v0 = practiceModelOverride;
        this.f49675w0 = z11;
        this.f49676x0 = CoursePracticeType.COURSE_REVIEW_WORD_SENT;
        this.f49677y0 = uz.x0.c(new qy.l(0, 0));
        int iW = ry.x.W(ry.n.W(reviews, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW < 16 ? 16 : iW);
        for (Object obj : reviews) {
            SRSStatus sRSStatus = (SRSStatus) obj;
            linkedHashMap.put(K(sRSStatus.getElemType(), sRSStatus.getElemId()), obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), SRSStatus.copy$default((SRSStatus) entry.getValue(), null, 0L, 0L, 0, null, null, 0L, null, false, null, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 0, 0, 0L, false, null, 2097151, null));
        }
        this.f49678z0 = linkedHashMap2;
        vy.d dVar = null;
        if (this.f49675w0) {
            wt.b0 srsUseCase = this.f49668p0;
            ns.d dVar2 = new ns.d(8);
            kotlin.jvm.internal.m.f(srsUseCase, "srsUseCase");
            d0.m0 m0Var = new d0.m0(2, srsUseCase, wt.b0.class, "processUserRating", "processUserRating(Lcom/lingodeer/data/model/SRSStatus;Lcom/lingodeer/data/usecase/SRSUserRating;)Lcom/lingodeer/data/model/SRSStatus;", 0, 12);
            List formalStatuses = this.f49673u0;
            kotlin.jvm.internal.m.f(formalStatuses, "formalStatuses");
            h2Var = new ot.h2(formalStatuses, m0Var, dVar2, ((Number) dVar2.invoke()).longValue());
        } else {
            h2Var = null;
        }
        bq.f fVar = new bq.f(h2Var);
        this.A0 = fVar;
        this.B0 = (uz.r0) fVar.f4946d;
        this.C0 = gb.r.e(this.f49673u0);
        this.D0 = new LinkedHashSet();
        this.E0 = new LinkedHashSet();
        this.H0 = true;
        this.I0 = uz.x0.A(uz.x0.j(this.W, this.V, this.f49677y0, new mu.w(this, dVar, 2)), ViewModelKt.getViewModelScope(this), uz.a1.a(2), new nc(this.f49673u0.size(), 0, 0, ry.s.f50855a, true ^ this.f49675w0));
        uz.m0 m0VarJ = uz.x0.j(uz.x0.B(uz.x0.B(new gp.r(new ns.j(this, dVar, 19)), new gu.d(this, (vy.d) null)), new dt.x(dVar, this, 16)), this.W, this.f50706c0, new d3(this, n0Var, null));
        yz.e eVar2 = yz.e.f58387a;
        this.J0 = uz.x0.A(uz.x0.w(m0VarJ, eVar2), ViewModelKt.getViewModelScope(this), uz.a1.a(2), new pc(CropImageView.DEFAULT_ASPECT_RATIO));
        this.K0 = uz.x0.A(uz.x0.w(uz.x0.k(l1.t.K(new mt.e4(this, 2)), this.X, this.V, new no.g(this.f50702a0, this.f50704b0, new y2(3, 0, dVar)), this.f49667o0.f55339f, new b3(this, n0Var, null)), eVar2), ViewModelKt.getViewModelScope(this), uz.a1.a(2), CourseTestFinishSummaryUiState.Loading.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e A[PHI: r11
      0x005e: PHI (r11v6 com.lingodeer.data.model.SRSStatus) = 
      (r11v0 com.lingodeer.data.model.SRSStatus)
      (r11v1 com.lingodeer.data.model.SRSStatus)
      (r11v2 com.lingodeer.data.model.SRSStatus)
      (r11v8 com.lingodeer.data.model.SRSStatus)
     binds: [B:23:0x005c, B:42:0x00cc, B:36:0x00a7, B:29:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (r10 == r12) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
    
        if (r10 == r12) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c7, code lost:
    
        if (r10 == r12) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f1, code lost:
    
        if (r10 == r12) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(rt.e3 r10, com.lingodeer.data.model.SRSStatus r11, xy.c r12) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.e3.I(rt.e3, com.lingodeer.data.model.SRSStatus, xy.c):java.lang.Object");
    }

    public static String K(int i11, long j11) {
        return i11 + "_" + j11;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:40:0x012f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x017a  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    @Override // rt.y9
    public final Object A(int i11, long j11, int i12, boolean z11, boolean z12, long j12, boolean z13, vy.d dVar) {
        a3 a3Var;
        boolean z14;
        wy.a aVar;
        a3 a3Var2;
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
        a3 a3Var3;
        int i18;
        Object objM;
        long j17 = j11;
        boolean z18 = z11;
        if (dVar instanceof a3) {
            a3Var = (a3) dVar;
            int i19 = a3Var.L;
            if ((i19 & Integer.MIN_VALUE) != 0) {
                a3Var.L = i19 - Integer.MIN_VALUE;
            } else {
                a3Var = new a3(this, (xy.c) dVar);
            }
        } else {
            a3Var = new a3(this, (xy.c) dVar);
        }
        Object objU = a3Var.H;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i21 = a3Var.L;
        qy.b0 b0Var = qy.b0.f48488a;
        int i22 = 6;
        if (i21 != 0) {
            if (i21 == 1) {
                z17 = a3Var.f49431t;
                j16 = a3Var.f49428d;
                z15 = a3Var.f49430f;
                z18 = a3Var.f49429e;
                i17 = a3Var.f49426b;
                j15 = a3Var.f49427c;
                i16 = a3Var.f49425a;
                com.bumptech.glide.e.F(objU);
            } else {
                if (i21 != 2) {
                    if (i21 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(objU);
                    return b0Var;
                }
                boolean z19 = a3Var.f49431t;
                long j18 = a3Var.f49428d;
                z15 = a3Var.f49430f;
                z18 = a3Var.f49429e;
                int i23 = a3Var.f49426b;
                long j19 = a3Var.f49427c;
                int i24 = a3Var.f49425a;
                com.bumptech.glide.e.F(objU);
                z14 = z19;
                aVar = aVar2;
                i18 = 3;
                a3Var2 = a3Var;
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
                a3Var2.f49425a = i15;
                a3Var2.f49427c = j17;
                a3Var2.f49426b = i14;
                a3Var2.f49429e = z18;
                a3Var2.f49430f = z15;
                a3Var2.f49428d = j13;
                a3Var2.f49431t = z14;
                a3Var2.L = i13;
                ot.s1 s1Var = this.f49671s0;
                s1Var.getClass();
                yz.f fVar = rz.o0.f50940a;
                objM = rz.e0.M(yz.e.f58387a, new ot.r1(-1L, i15, j17, i14, z18, z14, linkedHashMap, s1Var, this.f49676x0, list, null), a3Var2);
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
            a3Var2 = a3Var;
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
                gp.r rVarE = this.f49670r0.e(ns.o.K(testModel));
                a3Var.f49425a = i11;
                a3Var.f49427c = j17;
                a3Var.f49426b = i12;
                a3Var.f49429e = z18;
                a3Var.f49430f = z12;
                a3Var.f49428d = j12;
                a3Var.f49431t = z13;
                a3Var.L = 1;
                objU = uz.x0.u(rVarE, a3Var);
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
            a3Var.f49425a = i15;
            a3Var.f49427c = j14;
            a3Var.f49426b = i14;
            a3Var.f49429e = z18;
            a3Var.f49430f = z15;
            a3Var.f49428d = j13;
            a3Var.f49431t = z14;
            a3Var.L = 2;
            a3Var3 = a3Var;
            aVar = aVar2;
            i18 = 3;
            a3Var2 = a3Var3;
            if (this.f49671s0.a(i15, j14, i14, j13, z14, z16, this.f50720t, a3Var3) == aVar) {
                return aVar;
            }
            j17 = j14;
            i13 = i18;
        }
        if (i15 == 0) {
            List list2 = (List) this.V.getValue();
            LinkedHashMap linkedHashMap2 = this.H;
            a3Var2.f49425a = i15;
            a3Var2.f49427c = j17;
            a3Var2.f49426b = i14;
            a3Var2.f49429e = z18;
            a3Var2.f49430f = z15;
            a3Var2.f49428d = j13;
            a3Var2.f49431t = z14;
            a3Var2.L = i13;
            ot.s1 s1Var2 = this.f49671s0;
            s1Var2.getClass();
            yz.f fVar2 = rz.o0.f50940a;
            objM = rz.e0.M(yz.e.f58387a, new ot.r1(-1L, i15, j17, i14, z18, z14, linkedHashMap2, s1Var2, this.f49676x0, list2, null), a3Var2);
            if (objM != aVar) {
                objM = b0Var;
            }
            if (objM == aVar) {
                return aVar;
            }
        } else {
            List list3 = (List) this.V.getValue();
            LinkedHashMap linkedHashMap3 = this.H;
            a3Var2.f49425a = i15;
            a3Var2.f49427c = j17;
            a3Var2.f49426b = i14;
            a3Var2.f49429e = z18;
            a3Var2.f49430f = z15;
            a3Var2.f49428d = j13;
            a3Var2.f49431t = z14;
            a3Var2.L = i13;
            ot.s1 s1Var3 = this.f49671s0;
            s1Var3.getClass();
            yz.f fVar3 = rz.o0.f50940a;
            objM = rz.e0.M(yz.e.f58387a, new ot.r1(-1L, i15, j17, i14, z18, z14, linkedHashMap3, s1Var3, this.f49676x0, list3, null), a3Var2);
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
        a3Var.f49425a = i15;
        a3Var.f49427c = j14;
        a3Var.f49426b = i14;
        a3Var.f49429e = z18;
        a3Var.f49430f = z15;
        a3Var.f49428d = j13;
        a3Var.f49431t = z14;
        a3Var.L = 2;
        a3Var3 = a3Var;
        aVar = aVar2;
        i18 = 3;
        a3Var2 = a3Var3;
        if (this.f49671s0.a(i15, j14, i14, j13, z14, z16, this.f50720t, a3Var3) == aVar) {
            return aVar;
        }
        j17 = j14;
        i13 = i18;
        if (i15 == 0) {
            List list4 = (List) this.V.getValue();
            LinkedHashMap linkedHashMap4 = this.H;
            a3Var2.f49425a = i15;
            a3Var2.f49427c = j17;
            a3Var2.f49426b = i14;
            a3Var2.f49429e = z18;
            a3Var2.f49430f = z15;
            a3Var2.f49428d = j13;
            a3Var2.f49431t = z14;
            a3Var2.L = i13;
            ot.s1 s1Var4 = this.f49671s0;
            s1Var4.getClass();
            yz.f fVar4 = rz.o0.f50940a;
            objM = rz.e0.M(yz.e.f58387a, new ot.r1(-1L, i15, j17, i14, z18, z14, linkedHashMap4, s1Var4, this.f49676x0, list4, null), a3Var2);
            if (objM != aVar) {
                objM = b0Var;
            }
            if (objM == aVar) {
                return aVar;
            }
        } else {
            List list5 = (List) this.V.getValue();
            LinkedHashMap linkedHashMap5 = this.H;
            a3Var2.f49425a = i15;
            a3Var2.f49427c = j17;
            a3Var2.f49426b = i14;
            a3Var2.f49429e = z18;
            a3Var2.f49430f = z15;
            a3Var2.f49428d = j13;
            a3Var2.f49431t = z14;
            a3Var2.L = i13;
            ot.s1 s1Var5 = this.f49671s0;
            s1Var5.getClass();
            yz.f fVar5 = rz.o0.f50940a;
            objM = rz.e0.M(yz.e.f58387a, new ot.r1(-1L, i15, j17, i14, z18, z14, linkedHashMap5, s1Var5, this.f49676x0, list5, null), a3Var2);
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
        Object objM = rz.e0.M(yz.e.f58387a, new kr.k1(this, j1Var, (vy.d) null, 1), t9Var);
        return objM == wy.a.COROUTINE_SUSPENDED ? objM : qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r3 == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(xy.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof rt.u2
            if (r0 == 0) goto L13
            r0 = r9
            rt.u2 r0 = (rt.u2) r0
            int r1 = r0.f50469c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50469c = r1
            goto L18
        L13:
            rt.u2 r0 = new rt.u2
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f50467a
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f50469c
            qy.b0 r3 = qy.b0.f48488a
            vt.c r4 = r8.f50703b
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L3d
            if (r2 == r7) goto L39
            if (r2 != r5) goto L31
            com.bumptech.glide.e.F(r9)     // Catch: java.lang.Throwable -> L2f
            goto L60
        L2f:
            r9 = move-exception
            goto L65
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            com.bumptech.glide.e.F(r9)     // Catch: java.lang.Throwable -> L2f
            goto L56
        L3d:
            com.bumptech.glide.e.F(r9)
            boolean r9 = r8.F0
            if (r9 == 0) goto L68
            boolean r9 = r8.G0
            if (r9 == 0) goto L49
            goto L68
        L49:
            r8.G0 = r7
            r0.f50469c = r7     // Catch: java.lang.Throwable -> L2f
            r9 = r4
            vt.d r9 = (vt.d) r9     // Catch: java.lang.Throwable -> L2f
            r9.d(r0)     // Catch: java.lang.Throwable -> L2f
            if (r3 != r1) goto L56
            goto L5f
        L56:
            r0.f50469c = r5     // Catch: java.lang.Throwable -> L2f
            vt.d r4 = (vt.d) r4     // Catch: java.lang.Throwable -> L2f
            r4.j(r0)     // Catch: java.lang.Throwable -> L2f
            if (r3 != r1) goto L60
        L5f:
            return r1
        L60:
            r8.F0 = r6     // Catch: java.lang.Throwable -> L2f
            r8.G0 = r6
            return r3
        L65:
            r8.G0 = r6
            throw r9
        L68:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.e3.J(xy.c):java.lang.Object");
    }

    @Override // rt.y9
    public final boolean s() {
        return this.H0;
    }
}
