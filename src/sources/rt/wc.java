package rt;

import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.CoursePracticeTypeKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class wc implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uz.j f50591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoursePracticeType f50592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r8 f50593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r8 f50594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vt.n0 f50595e;

    public wc(uz.j jVar, CoursePracticeType coursePracticeType, r8 r8Var, r8 r8Var2, vt.n0 n0Var) {
        this.f50591a = jVar;
        this.f50592b = coursePracticeType;
        this.f50593c = r8Var;
        this.f50594d = r8Var2;
        this.f50595e = n0Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0188  */
    /* JADX WARN: Code duplicated, block: B:107:0x0195  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:116:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        vc vcVar;
        int i11;
        char c11;
        Env env;
        boolean z11;
        int i12;
        boolean z12;
        boolean z13;
        boolean z14;
        CoursePracticeType coursePracticeType;
        CoursePracticeType coursePracticeType2;
        CoursePracticeType coursePracticeType3;
        if (dVar instanceof vc) {
            vcVar = (vc) dVar;
            int i13 = vcVar.f50554b;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                vcVar.f50554b = i13 - Integer.MIN_VALUE;
            } else {
                vcVar = new vc(this, dVar);
            }
        } else {
            vcVar = new vc(this, dVar);
        }
        Object obj2 = vcVar.f50553a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i14 = vcVar.f50554b;
        int i15 = 1;
        if (i14 == 0) {
            com.bumptech.glide.e.F(obj2);
            List<ot.j1> list = (List) obj;
            char c12 = '\n';
            ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
            for (ot.j1 j1Var : list) {
                CoursePracticeType coursePracticeType4 = this.f50592b;
                boolean zIsTestOut = CoursePracticeTypeKt.isTestOut(coursePracticeType4);
                CoursePracticeType coursePracticeType5 = CoursePracticeType.COURSE_PRACTICE_LISTENING;
                r8 r8Var = this.f50594d;
                r8 r8Var2 = this.f50593c;
                int i16 = (coursePracticeType4 == coursePracticeType5 || (coursePracticeType4 == (coursePracticeType3 = CoursePracticeType.COURSE_REVIEW_WORD_SENT) && j1Var.a().f33753a == 0 && r8Var2 == r8.LISTENING) || (coursePracticeType4 == coursePracticeType3 && j1Var.a().f33753a == i15 && r8Var == r8.LISTENING)) ? i15 : 0;
                int i17 = (coursePracticeType4 == CoursePracticeType.COURSE_PRACTICE_SPEAKING || (coursePracticeType4 == (coursePracticeType2 = CoursePracticeType.COURSE_REVIEW_WORD_SENT) && j1Var.a().f33753a == 0 && r8Var2 == r8.SPEAKING) || (coursePracticeType4 == coursePracticeType2 && j1Var.a().f33753a == i15 && r8Var == r8.SPEAKING)) ? i15 : 0;
                int i18 = (coursePracticeType4 == CoursePracticeType.COURSE_PRACTICE_SPELLING || (coursePracticeType4 == (coursePracticeType = CoursePracticeType.COURSE_REVIEW_WORD_SENT) && j1Var.a().f33753a == 0 && r8Var2 == r8.SPELLING) || (coursePracticeType4 == coursePracticeType && j1Var.a().f33753a == i15 && r8Var == r8.SPELLING)) ? i15 : 0;
                int i19 = i17;
                boolean z15 = j1Var instanceof ot.f1;
                int i21 = ((j1Var.a().f33753a == 0 && j1Var.a().f33755c == 7) || (j1Var.a().f33753a == i15 && j1Var.a().f33755c == 7)) ? i15 : 0;
                boolean z16 = j1Var.a().f33753a == i15 && ry.l.D(new Integer[]{new Integer(13), new Integer(31)}, new Integer(j1Var.a().f33755c));
                if (j1Var.a().f33753a == 0) {
                    i11 = i21;
                    c11 = '\n';
                    boolean z17 = ry.l.D(new Integer[]{new Integer(5), new Integer(9), new Integer(10)}, new Integer(j1Var.a().f33755c));
                    env = ((fr.o0) this.f50595e).f27733a;
                    if (env.enableNativeSpeakerVideos || ((!xt.d.j(env.keyLanguage) || (i16 == 0 && !z16)) && ((i11 == 0 && i19 == 0 && !z17) || !xt.d.h(env.keyLanguage)))) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    i12 = i16;
                    ht.o oVarA = j1Var.a();
                    if (i19 == 0 || zIsTestOut) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (i12 == 0 || zIsTestOut || i18 != 0) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    if (i18 == 0 || zIsTestOut) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    arrayList.add(ot.p1.b(j1Var, ht.o.a(oVarA, 0, 0L, zIsTestOut, z15, z11, ry.l.m0(new Integer[]{51, 55, 61, 57}).contains(Integer.valueOf(env.keyLanguage)), false, false, false, z12, z13, z14, null, 293103)));
                    c12 = c11;
                    i15 = 1;
                } else {
                    i11 = i21;
                    c11 = c12;
                }
                env = ((fr.o0) this.f50595e).f27733a;
                if (env.enableNativeSpeakerVideos) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                i12 = i16;
                ht.o oVarA2 = j1Var.a();
                if (i19 == 0) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                if (i12 == 0) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                if (i18 == 0) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                arrayList.add(ot.p1.b(j1Var, ht.o.a(oVarA2, 0, 0L, zIsTestOut, z15, z11, ry.l.m0(new Integer[]{51, 55, 61, 57}).contains(Integer.valueOf(env.keyLanguage)), false, false, false, z12, z13, z14, null, 293103)));
                c12 = c11;
                i15 = 1;
            }
            vcVar.f50554b = i15;
            if (this.f50591a.emit(arrayList, vcVar) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj2);
        }
        return qy.b0.f48488a;
    }
}
