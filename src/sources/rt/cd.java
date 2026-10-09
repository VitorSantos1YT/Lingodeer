package rt;

import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.CoursePracticeTypeKt;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class cd extends xy.i implements fz.g {
    public /* synthetic */ List H;
    public /* synthetic */ int K;
    public /* synthetic */ fb L;
    public final /* synthetic */ dd M;
    public final /* synthetic */ vt.n0 N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ot.j1 f49590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f49591f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f49592t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd(dd ddVar, vt.n0 n0Var, vy.d dVar) {
        super(4, dVar);
        this.M = ddVar;
        this.N = n0Var;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        cd cdVar = new cd(this.M, this.N, (vy.d) obj4);
        cdVar.H = (List) obj;
        cdVar.K = iIntValue;
        cdVar.L = (fb) obj3;
        return cdVar.invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:109:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x0148  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:93:0x0228  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [ht.o, ot.j1] */
    /* JADX WARN: Type inference failed for: r14v7 */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        ?? r14;
        ot.j1 j1Var;
        int i11;
        CoursePracticeType coursePracticeType;
        wy.a aVar;
        int i12;
        int i13;
        boolean z12;
        wy.a aVar2;
        long j11;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long j12;
        ?? r9;
        ht.o oVarA;
        ht.o oVarA2;
        int i21;
        Object objM;
        ot.j1 j1Var2;
        ?? r11;
        long jQ;
        boolean z13;
        dd ddVar = this.M;
        sy.g gVar = ddVar.C0;
        long j13 = ddVar.f49645v0;
        CoursePracticeType coursePracticeType2 = ddVar.f49646w0;
        uz.i1 i1Var = ddVar.V;
        List list = this.H;
        int i22 = this.K;
        fb fbVar = this.L;
        wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
        int i23 = this.f49592t;
        boolean z14 = true;
        if (i23 == 0) {
            com.bumptech.glide.e.F(obj);
            boolean z15 = fbVar instanceof cb;
            vt.n0 n0Var = this.N;
            if (!z15) {
                if (!ddVar.R) {
                    fv.c cVarR = ddVar.r();
                    int i24 = ((fr.o0) n0Var).f27733a.keyLanguage;
                    long j14 = ddVar.f49644u0;
                    CoursePracticeType coursePracticeType3 = ddVar.f49646w0;
                    ot.i0 i0Var = ddVar.f49643t0;
                    bd bdVar = new bd(ddVar, 0);
                    mt.l0 l0Var = new mt.l0(ddVar, n0Var, list, 24);
                    this.H = null;
                    this.L = fbVar;
                    this.K = i22;
                    z14 = true;
                    this.f49592t = 1;
                    if (ia.b(cVarR, i24, j14, coursePracticeType3, i0Var, bdVar, l0Var, this) == aVar3) {
                        return aVar3;
                    }
                    ddVar.R = z14;
                }
                if (fbVar instanceof db) {
                }
            }
            if (((List) i1Var.getValue()).isEmpty()) {
                i1Var.k(list);
            }
            ddVar.K = ((List) i1Var.getValue()).size();
            int i25 = (!CoursePracticeTypeKt.isTestOut(coursePracticeType2) || ((Number) ddVar.L.getValue()).intValue() < 4) ? 0 : 1;
            if (i22 >= ((List) i1Var.getValue()).size() || i25 != 0) {
                z14 = true;
                z11 = false;
                r14 = 0;
                this.H = null;
                this.L = null;
                this.K = i22;
                this.f49586a = i25;
                this.f49592t = 4;
                if (rz.e0.m(300L, this) == aVar3) {
                    return aVar3;
                }
                ddVar.f50708d0 = r14;
                jQ = gb.r.Q(j13, r14, gVar);
                if (jQ > 0) {
                    z13 = z14;
                } else {
                    z13 = z11;
                }
                return new qc(null, z13, jQ, true, false, false, CoursePracticeTypeKt.isTestOut(coursePracticeType2), 112);
            }
            j1Var = (ot.j1) ((List) i1Var.getValue()).get(i22);
            ddVar.f50708d0 = j1Var;
            long jQ2 = gb.r.Q(j13, j1Var.a(), gVar);
            ot.j1 j1Var3 = ddVar.f50708d0;
            if (j1Var3 == null || (oVarA2 = j1Var3.a()) == null) {
                i11 = 0;
            } else {
                int i26 = oVarA2.f33755c;
                if (coursePracticeType2 == CoursePracticeType.COURSE_PRACTICE_SPEAKING || System.currentTimeMillis() - ((fr.o0) n0Var).f27733a.lastSkipSpeakTestTime >= 900000 || !((((i21 = oVarA2.f33753a) == 1 && i26 == 7) || (i21 == 4 && i26 == 4)) && oVarA2.f33767p)) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
            }
            ot.j1 j1Var4 = ddVar.f50708d0;
            if (j1Var4 == null || (oVarA = j1Var4.a()) == null) {
                coursePracticeType = coursePracticeType2;
                aVar = aVar3;
                i12 = 0;
            } else {
                int i27 = oVarA.f33755c;
                int i28 = oVarA.f33753a;
                if (coursePracticeType2 == CoursePracticeType.COURSE_PRACTICE_LISTENING || System.currentTimeMillis() - ((fr.o0) n0Var).f27733a.lastSkipListenTestTime >= 900000) {
                    coursePracticeType = coursePracticeType2;
                    aVar = aVar3;
                } else {
                    if (i28 == 0) {
                        coursePracticeType = coursePracticeType2;
                        aVar = aVar3;
                        if (!ry.l.D(new Integer[]{new Integer(3), new Integer(4), new Integer(5), new Integer(11)}, new Integer(i27))) {
                        }
                        i12 = 1;
                    } else {
                        coursePracticeType = coursePracticeType2;
                        aVar = aVar3;
                    }
                    if (i28 == 1 && ry.l.D(new Integer[]{new Integer(4), new Integer(31)}, new Integer(i27)) && oVarA.f33768q) {
                        i12 = 1;
                    }
                }
                i12 = 0;
            }
            if (i11 == 0 && i12 == 0) {
                i17 = i25;
                aVar2 = aVar;
                i13 = 2;
                z14 = true;
                z12 = false;
                i18 = i12;
                i19 = i11;
                j12 = jQ2;
                r9 = 0;
            } else {
                this.H = null;
                this.L = null;
                this.f49590e = j1Var;
                this.K = i22;
                this.f49586a = i25;
                this.f49591f = jQ2;
                this.f49587b = i11;
                this.f49588c = i12;
                i13 = 2;
                this.f49592t = 2;
                z14 = true;
                z12 = false;
                aVar2 = aVar;
                if (ddVar.u(false, true, this) == aVar2) {
                    return aVar2;
                }
                j11 = jQ2;
                i14 = i11;
                i15 = i12;
                i16 = i25;
                i18 = i15;
                i19 = i14;
                i17 = i16;
                j12 = j11;
                r9 = z14;
            }
            yz.f fVar = rz.o0.f50940a;
            yz.e eVar = yz.e.f58387a;
            c3 c3Var = new c3(j1Var, null, i13);
            this.H = null;
            this.L = null;
            this.f49590e = j1Var;
            this.K = i22;
            this.f49586a = i17;
            this.f49591f = j12;
            this.f49587b = i19;
            this.f49588c = i18;
            this.f49589d = r9;
            this.f49592t = 3;
            objM = rz.e0.M(eVar, c3Var, this);
            if (objM == aVar2) {
                return aVar2;
            }
            j1Var2 = j1Var;
            r11 = r9;
        } else {
            if (i23 == 1) {
                com.bumptech.glide.e.F(obj);
                ddVar.R = z14;
                return fbVar instanceof db ? new pc(((db) fbVar).f49634a) : new pc(CropImageView.DEFAULT_ASPECT_RATIO);
            }
            if (i23 == 2) {
                i15 = this.f49588c;
                i14 = this.f49587b;
                long j15 = this.f49591f;
                i16 = this.f49586a;
                j1Var = this.f49590e;
                com.bumptech.glide.e.F(obj);
                coursePracticeType = coursePracticeType2;
                aVar2 = aVar3;
                z12 = false;
                j11 = j15;
                i13 = 2;
                i18 = i15;
                i19 = i14;
                i17 = i16;
                j12 = j11;
                r9 = z14;
                yz.f fVar2 = rz.o0.f50940a;
                yz.e eVar2 = yz.e.f58387a;
                c3 c3Var2 = new c3(j1Var, null, i13);
                this.H = null;
                this.L = null;
                this.f49590e = j1Var;
                this.K = i22;
                this.f49586a = i17;
                this.f49591f = j12;
                this.f49587b = i19;
                this.f49588c = i18;
                this.f49589d = r9;
                this.f49592t = 3;
                objM = rz.e0.M(eVar2, c3Var2, this);
                if (objM == aVar2) {
                    return aVar2;
                }
                j1Var2 = j1Var;
                r11 = r9;
            } else {
                if (i23 != 3) {
                    if (i23 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    r14 = 0;
                    z11 = false;
                    ddVar.f50708d0 = r14;
                    jQ = gb.r.Q(j13, r14, gVar);
                    if (jQ > 0) {
                        z13 = z14;
                    } else {
                        z13 = z11;
                    }
                    return new qc(null, z13, jQ, true, false, false, CoursePracticeTypeKt.isTestOut(coursePracticeType2), 112);
                }
                int i29 = this.f49589d;
                j12 = this.f49591f;
                j1Var2 = this.f49590e;
                com.bumptech.glide.e.F(obj);
                coursePracticeType = coursePracticeType2;
                z12 = false;
                objM = obj;
                r11 = i29;
            }
        }
        long j16 = j12;
        return new qc(ot.p1.b(j1Var2, ht.o.a(j1Var2.a(), 0, System.currentTimeMillis() + ((long) jz.e.f37398b.d(1000)), false, false, ((Boolean) objM).booleanValue(), false, false, false, false, false, false, false, null, 523767)), j16 > 0 ? z14 : z12, j16, true, false, r11 != 0 ? z14 : z12, CoursePracticeTypeKt.isTestOut(coursePracticeType), 48);
    }
}
