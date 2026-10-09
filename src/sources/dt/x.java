package dt;

import android.os.Build;
import android.util.Log;
import androidx.lifecycle.ViewModelKt;
import com.google.api.Service;
import com.lingodeer.data.model.CourseQuestionPreferencePayloadKt;
import com.lingodeer.data.model.DayStreakStatus;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import mt.j5;
import rt.bb;
import rt.cb;
import rt.db;
import rt.fb;
import rt.ge;
import rt.k9;
import rt.l9;
import rt.mb;
import rt.qa;
import rt.r8;
import rt.ra;
import rt.sa;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f24338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24340e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(fz.a aVar, l1.b1 b1Var, vy.d dVar) {
        super(3, dVar);
        this.f24336a = 0;
        this.f24339d = aVar;
        this.f24340e = b1Var;
    }

    /* JADX WARN: Type inference failed for: r1v46, types: [fz.e, xy.i] */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f24336a) {
            case 0:
                long j11 = ((f2.b) obj2).f26570a;
                x xVar = new x((fz.a) this.f24339d, (l1.b1) this.f24340e, (vy.d) obj3);
                xVar.f24338c = (f0.l1) obj;
                return xVar.invokeSuspend(qy.b0.f48488a);
            case 1:
                x xVar2 = new x((vy.d) obj3, (eh.f) this.f24340e, 1);
                xVar2.f24338c = (uz.j) obj;
                xVar2.f24339d = obj2;
                return xVar2.invokeSuspend(qy.b0.f48488a);
            case 2:
                x xVar3 = new x((vy.d) obj3, (vt.h1) this.f24340e, 2);
                xVar3.f24338c = (uz.j) obj;
                xVar3.f24339d = obj2;
                return xVar3.invokeSuspend(qy.b0.f48488a);
            case 3:
                x xVar4 = new x((vy.d) obj3, (gu.a) this.f24340e, 3);
                xVar4.f24338c = (uz.j) obj;
                xVar4.f24339d = obj2;
                return xVar4.invokeSuspend(qy.b0.f48488a);
            case 4:
                x xVar5 = new x((vy.d) obj3, (hr.d) this.f24340e, 4);
                xVar5.f24338c = (uz.j) obj;
                xVar5.f24339d = obj2;
                return xVar5.invokeSuspend(qy.b0.f48488a);
            case 5:
                x xVar6 = new x((hu.k) this.f24340e, (vy.d) obj3, 5);
                xVar6.f24338c = (DayStreakStatus) obj;
                xVar6.f24339d = (Date) obj2;
                return xVar6.invokeSuspend(qy.b0.f48488a);
            case 6:
                x xVar7 = new x((vy.d) obj3, (hu.k) this.f24340e, 6);
                xVar7.f24338c = (uz.j) obj;
                xVar7.f24339d = obj2;
                return xVar7.invokeSuspend(qy.b0.f48488a);
            case 7:
                x xVar8 = new x((vy.d) obj3, (jh.f) this.f24340e, 7);
                xVar8.f24338c = (uz.j) obj;
                xVar8.f24339d = obj2;
                return xVar8.invokeSuspend(qy.b0.f48488a);
            case 8:
                x xVar9 = new x((vy.d) obj3, (mu.x) this.f24340e, 8);
                xVar9.f24338c = (uz.j) obj;
                xVar9.f24339d = obj2;
                return xVar9.invokeSuspend(qy.b0.f48488a);
            case 9:
                x xVar10 = new x((vy.d) obj3, (lv.b) this.f24340e, 9);
                xVar10.f24338c = (uz.j) obj;
                xVar10.f24339d = obj2;
                return xVar10.invokeSuspend(qy.b0.f48488a);
            case 10:
                x xVar11 = new x((vy.d) obj3, (rz.b0) this.f24340e, 10);
                xVar11.f24338c = (uz.j) obj;
                xVar11.f24339d = obj2;
                return xVar11.invokeSuspend(qy.b0.f48488a);
            case 11:
                ((Boolean) obj2).getClass();
                x xVar12 = new x((n9.j0) this.f24340e, (vy.d) obj3, 11);
                xVar12.f24339d = (n9.g0) obj;
                return xVar12.invokeSuspend(qy.b0.f48488a);
            case 12:
                x xVar13 = new x((vy.d) obj3, (n9.j0) this.f24340e, 12);
                xVar13.f24338c = (uz.j) obj;
                xVar13.f24339d = obj2;
                return xVar13.invokeSuspend(qy.b0.f48488a);
            case 13:
                x xVar14 = new x((vy.d) obj3, (ph.k) this.f24340e, 13);
                xVar14.f24338c = (uz.j) obj;
                xVar14.f24339d = obj2;
                return xVar14.invokeSuspend(qy.b0.f48488a);
            case 14:
                x xVar15 = new x((vy.d) obj3, (rt.z0) this.f24340e, 14);
                xVar15.f24338c = (uz.j) obj;
                xVar15.f24339d = obj2;
                return xVar15.invokeSuspend(qy.b0.f48488a);
            case 15:
                x xVar16 = new x((vy.d) obj3, (rt.j2) this.f24340e, 15);
                xVar16.f24338c = (uz.j) obj;
                xVar16.f24339d = obj2;
                return xVar16.invokeSuspend(qy.b0.f48488a);
            case 16:
                x xVar17 = new x((vy.d) obj3, (rt.e3) this.f24340e, 16);
                xVar17.f24338c = (uz.j) obj;
                xVar17.f24339d = obj2;
                return xVar17.invokeSuspend(qy.b0.f48488a);
            case 17:
                x xVar18 = new x((vy.d) obj3, (l9) this.f24340e, 17);
                xVar18.f24338c = (uz.j) obj;
                xVar18.f24339d = obj2;
                return xVar18.invokeSuspend(qy.b0.f48488a);
            case 18:
                x xVar19 = new x((bb) this.f24340e, (vy.d) obj3, 18);
                xVar19.f24338c = (List) obj;
                xVar19.f24339d = (fb) obj2;
                return xVar19.invokeSuspend(qy.b0.f48488a);
            case 19:
                x xVar20 = new x((vy.d) obj3, (mb) this.f24340e, 19);
                xVar20.f24338c = (uz.j) obj;
                xVar20.f24339d = obj2;
                return xVar20.invokeSuspend(qy.b0.f48488a);
            case 20:
                x xVar21 = new x((vy.d) obj3, (sr.i) this.f24340e, 20);
                xVar21.f24338c = (uz.j) obj;
                xVar21.f24339d = obj2;
                return xVar21.invokeSuspend(qy.b0.f48488a);
            case 21:
                x xVar22 = new x((vy.d) obj3, (rv.b) this.f24340e, 21);
                xVar22.f24338c = (uz.j) obj;
                xVar22.f24339d = obj2;
                return xVar22.invokeSuspend(qy.b0.f48488a);
            case 22:
                x xVar23 = new x((vy.d) obj3, (tu.e0) this.f24340e, 22);
                xVar23.f24338c = (uz.j) obj;
                xVar23.f24339d = obj2;
                return xVar23.invokeSuspend(qy.b0.f48488a);
            case 23:
                x xVar24 = new x((xy.i) this.f24340e, (vy.d) obj3);
                xVar24.f24338c = (uz.j) obj;
                xVar24.f24339d = obj2;
                return xVar24.invokeSuspend(qy.b0.f48488a);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                x xVar25 = new x((vy.d) obj3, (wt.m) this.f24340e, 24);
                xVar25.f24338c = (uz.j) obj;
                xVar25.f24339d = obj2;
                return xVar25.invokeSuspend(qy.b0.f48488a);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                x xVar26 = new x((vy.d) obj3, (wt.q) this.f24340e, 25);
                xVar26.f24338c = (uz.j) obj;
                xVar26.f24339d = obj2;
                return xVar26.invokeSuspend(qy.b0.f48488a);
            default:
                x xVar27 = new x((vy.d) obj3, (wt.o0) this.f24340e, 26);
                xVar27.f24338c = (uz.j) obj;
                xVar27.f24339d = obj2;
                return xVar27.invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0251  */
    /* JADX WARN: Code duplicated, block: B:116:0x025b  */
    /* JADX WARN: Code duplicated, block: B:243:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:244:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:255:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:256:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:258:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:262:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:264:0x05db  */
    /* JADX WARN: Code duplicated, block: B:267:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:268:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:270:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:273:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:276:0x0601  */
    /* JADX WARN: Code duplicated, block: B:285:0x063a  */
    /* JADX WARN: Code duplicated, block: B:286:0x0641  */
    /* JADX WARN: Code duplicated, block: B:287:0x0648  */
    /* JADX WARN: Code duplicated, block: B:289:0x064b  */
    /* JADX WARN: Code duplicated, block: B:290:0x0650  */
    /* JADX WARN: Code duplicated, block: B:292:0x0653  */
    /* JADX WARN: Code duplicated, block: B:293:0x0663 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:294:0x0665  */
    /* JADX WARN: Code duplicated, block: B:295:0x066a  */
    /* JADX WARN: Code duplicated, block: B:297:0x066d  */
    /* JADX WARN: Code duplicated, block: B:298:0x067f  */
    /* JADX WARN: Code duplicated, block: B:300:0x0685  */
    /* JADX WARN: Code duplicated, block: B:308:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:310:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:448:0x0648 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x060f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:? A[LOOP:2: B:274:0x05fb->B:450:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v26, types: [fz.e, xy.i] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        n9.g0 g0Var;
        Object objA;
        gh.o oVar;
        n9.w1 w1Var;
        Object objE;
        gh.o oVar2;
        List list;
        n9.w1 w1Var2;
        Integer num;
        n9.w1 w1Var3;
        Integer num2;
        Integer numValueOf;
        Integer num3;
        int iIntValue;
        List list2;
        n9.u1 u1Var;
        Integer num4;
        Integer num5;
        int iMax;
        Iterator it;
        int size;
        int i11;
        Integer num6;
        n9.w1 w1Var4;
        uz.j jVar;
        Object objInvoke;
        int i12 = this.f24336a;
        String category = BuildConfig.VERSION_NAME;
        int i13 = 27;
        int i14 = 4;
        int i15 = 9;
        int i16 = 0;
        int i17 = 2;
        qy.b0 b0Var = qy.b0.f48488a;
        vy.d dVar = null;
        Object obj2 = this.f24340e;
        switch (i12) {
            case 0:
                l1.b1 b1Var = (l1.b1) obj2;
                f0.l1 l1Var = (f0.l1) this.f24338c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i18 = this.f24337b;
                if (i18 == 0) {
                    com.bumptech.glide.e.F(obj);
                    oz.o oVar3 = a0.f23626a;
                    b1Var.setValue(Boolean.TRUE);
                    this.f24338c = null;
                    this.f24337b = 1;
                    if (l1Var.f(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                oz.o oVar4 = a0.f23626a;
                b1Var.setValue(Boolean.FALSE);
                ((fz.a) this.f24339d).invoke();
                return b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i19 = this.f24337b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar2 = (uz.j) this.f24338c;
                eh.f fVar = (eh.f) obj2;
                gp.r rVar = new gp.r(new eh.h(fVar.f25561c, fVar.f25559a, fVar.f25560b, fVar.f25565t, fVar.f25562d, fVar.f25563e, fVar.f25564f, null));
                yz.f fVar2 = rz.o0.f50940a;
                uz.i iVarW = uz.x0.w(rVar, yz.e.f58387a);
                this.f24338c = null;
                this.f24339d = null;
                this.f24337b = 1;
                return uz.x0.q(jVar2, iVarW, this) == aVar2 ? aVar2 : b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i21 = this.f24337b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar3 = (uz.j) this.f24338c;
                gp.r rVarN = ((fr.x4) ((vt.h1) obj2)).n();
                this.f24338c = null;
                this.f24339d = null;
                this.f24337b = 1;
                return uz.x0.q(jVar3, rVarN, this) == aVar3 ? aVar3 : b0Var;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i22 = this.f24337b;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar4 = (uz.j) this.f24338c;
                gp.r rVarA = ((gu.f) ((gu.a) obj2)).a();
                this.f24338c = null;
                this.f24339d = null;
                this.f24337b = 1;
                return uz.x0.q(jVar4, rVarA, this) == aVar4 ? aVar4 : b0Var;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i23 = this.f24337b;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar5 = (uz.j) this.f24338c;
                gp.r rVar2 = new gp.r(new gu.b(((hr.d) obj2).f33692a, null, 12));
                this.f24338c = null;
                this.f24339d = null;
                this.f24337b = 1;
                return uz.x0.q(jVar5, rVar2, this) == aVar5 ? aVar5 : b0Var;
            case 5:
                DayStreakStatus dayStreakStatus = (DayStreakStatus) this.f24338c;
                Date date = (Date) this.f24339d;
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i24 = this.f24337b;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                yz.f fVar3 = rz.o0.f50940a;
                yz.e eVar = yz.e.f58387a;
                fr.l lVar = new fr.l((hu.k) obj2, dayStreakStatus, date, null);
                this.f24338c = null;
                this.f24339d = null;
                this.f24337b = 1;
                Object objM = rz.e0.M(eVar, lVar, this);
                return objM == aVar6 ? aVar6 : objM;
            case 6:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i25 = this.f24337b;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar6 = (uz.j) this.f24338c;
                gp.r rVarA2 = ((gu.f) ((hu.k) obj2).f33791a).a();
                this.f24338c = null;
                this.f24339d = null;
                this.f24337b = 1;
                return uz.x0.q(jVar6, rVarA2, this) == aVar7 ? aVar7 : b0Var;
            case 7:
                boolean z11 = false;
                jh.f fVar4 = (jh.f) obj2;
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                int i26 = this.f24337b;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar7 = (uz.j) this.f24338c;
                jh.b bVar = (jh.b) this.f24339d;
                uz.i1 i1Var = fVar4.f36352c;
                i1Var.getClass();
                i1Var.l(null, jh.c.f36343a);
                bVar.getClass();
                boolean z12 = bVar.f36341b;
                ArrayList arrayList = bVar.f36342c;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int size2 = arrayList.size();
                int i27 = 0;
                while (i27 < size2) {
                    Object obj3 = arrayList.get(i27);
                    i27++;
                    if (((String) obj3).length() > 0) {
                        arrayList4.add(obj3);
                    }
                }
                int size3 = arrayList4.size();
                int i28 = 0;
                while (i28 < size3) {
                    Object obj4 = arrayList4.get(i28);
                    i28++;
                    String str = (String) obj4;
                    boolean z13 = z11;
                    if (oz.q.v0(str, "DF", z13)) {
                        arrayList2.add(str);
                    } else {
                        arrayList3.add(str);
                    }
                    z11 = z13;
                }
                String difficulty = !arrayList2.isEmpty() ? ry.m.y0(arrayList2, ";", null, null, null, 62) : BuildConfig.VERSION_NAME;
                if (!arrayList3.isEmpty()) {
                    category = ry.m.y0(arrayList3, ";", null, null, null, 62);
                }
                c7.j jVar8 = new c7.j(10, 10);
                fh.e repository = fVar4.f36350a;
                kotlin.jvm.internal.m.f(repository, "repository");
                kotlin.jvm.internal.m.f(category, "category");
                kotlin.jvm.internal.m.f(difficulty, "difficulty");
                bq.f fVar5 = new bq.f();
                fVar5.f4944b = repository;
                fVar5.f4945c = category;
                fVar5.f4946d = difficulty;
                fVar5.f4943a = z12;
                n9.j0 j0Var = new n9.j0(new d1.s0(new cr.n(fVar5, 27), null, 4), jVar8);
                this.f24338c = null;
                this.f24339d = null;
                this.f24337b = 1;
                return uz.x0.q(jVar7, j0Var.f43607e, this) == aVar8 ? aVar8 : b0Var;
            case 8:
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                int i29 = this.f24337b;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar9 = (uz.j) this.f24338c;
                gp.r rVarN2 = ((fr.x4) ((mu.x) obj2).f42186e).n();
                this.f24338c = null;
                this.f24339d = null;
                this.f24337b = 1;
                return uz.x0.q(jVar9, rVarN2, this) == aVar9 ? aVar9 : b0Var;
            case 9:
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                int i30 = this.f24337b;
                if (i30 != 0) {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar10 = (uz.j) this.f24338c;
                gp.r rVar3 = new gp.r(new kb.e((lv.b) obj2, dVar, i15));
                this.f24338c = null;
                this.f24339d = null;
                this.f24337b = 1;
                return uz.x0.q(jVar10, rVar3, this) == aVar10 ? aVar10 : b0Var;
            case 10:
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                int i31 = this.f24337b;
                if (i31 != 0) {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar11 = (uz.j) this.f24338c;
                n9.z zVar = new n9.z((rz.b0) obj2, (n9.e1) this.f24339d);
                this.f24337b = 1;
                return jVar11.emit(zVar, this) == aVar11 ? aVar11 : b0Var;
            case 11:
                n9.j0 j0Var2 = (n9.j0) obj2;
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                int i32 = this.f24337b;
                if (i32 != 0) {
                    if (i32 == 1) {
                        g0Var = (n9.g0) this.f24339d;
                        com.bumptech.glide.e.F(obj);
                        objA = obj;
                    } else {
                        if (i32 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oVar2 = (gh.o) this.f24338c;
                        g0Var = (n9.g0) this.f24339d;
                        com.bumptech.glide.e.F(obj);
                        objE = obj;
                    }
                    w1Var = (n9.w1) objE;
                    oVar = oVar2;
                    if (w1Var != null) {
                        list = w1Var.f43728a;
                    } else {
                        list = null;
                    }
                    if ((list != null || list.isEmpty()) && g0Var != null && (w1Var2 = g0Var.f43567b) != null && (!w1Var2.f43728a.isEmpty())) {
                    }
                    if (w1Var != null) {
                        num = w1Var.f43729b;
                    } else {
                        num = null;
                    }
                    if (num == null) {
                        if (g0Var != null || (w1Var4 = g0Var.f43567b) == null) {
                            num6 = null;
                        } else {
                            num6 = w1Var4.f43729b;
                        }
                        if (num6 != null) {
                            w1Var = g0Var.f43567b;
                        }
                    }
                    w1Var3 = w1Var;
                    if (w1Var3 == null) {
                        num3 = null;
                    } else {
                        oVar.getClass();
                        num2 = w1Var3.f43729b;
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                            list2 = w1Var3.f43728a;
                            if (list2.isEmpty()) {
                                u1Var = null;
                            } else {
                                it = list2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        u1Var = null;
                                    } else if (!((n9.u1) it.next()).f43705a.isEmpty()) {
                                        size = iIntValue - w1Var3.f43731d;
                                        i11 = 0;
                                        while (i11 < ns.o.A(list2) && size > ns.o.A(((n9.u1) list2.get(i11)).f43705a)) {
                                            size -= ((n9.u1) list2.get(i11)).f43705a.size();
                                            i11++;
                                        }
                                        if (size < 0) {
                                            u1Var = (n9.u1) ry.m.q0(list2);
                                        } else {
                                            u1Var = (n9.u1) list2.get(i11);
                                        }
                                    }
                                }
                            }
                            if (u1Var != null) {
                                num4 = (Integer) u1Var.f43706b;
                            } else {
                                num4 = null;
                            }
                            if (num4 != null) {
                                Object obj5 = u1Var.f43706b;
                                kotlin.jvm.internal.m.c(obj5);
                                iMax = ((Number) obj5).intValue() + 1;
                            } else {
                                if (u1Var != null) {
                                    num5 = (Integer) u1Var.f43707c;
                                } else {
                                    num5 = null;
                                }
                                if (num5 != null) {
                                    Object obj6 = u1Var.f43707c;
                                    kotlin.jvm.internal.m.c(obj6);
                                    iMax = Math.max(1, ((Number) obj6).intValue() - 1);
                                } else {
                                    iMax = 1;
                                }
                            }
                            numValueOf = Integer.valueOf(iMax);
                        } else {
                            numValueOf = null;
                        }
                        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                            String message = "Refresh key " + numValueOf + " returned from PagingSource " + oVar;
                            kotlin.jvm.internal.m.f(message, "message");
                        }
                        num3 = numValueOf;
                    }
                    if (g0Var != null) {
                        g0Var.f43566a.f43726i.cancel(null);
                    }
                    if (g0Var != null) {
                        g0Var.f43568c.cancel(null);
                    }
                    return new n9.g0(new n9.w0(num3, oVar, j0Var2.f43604b, (gp.r) j0Var2.f43606d.f44892c, w1Var3, new j5(0, j0Var2, n9.j0.class, "refresh", "refresh()V", 0, 5)), w1Var3, rz.e0.d());
                }
                com.bumptech.glide.e.F(obj);
                g0Var = (n9.g0) this.f24339d;
                gh.o oVar5 = g0Var != null ? g0Var.f43566a.f43719b : null;
                this.f24339d = g0Var;
                this.f24337b = 1;
                objA = n9.j0.a(j0Var2, oVar5, this);
                if (objA == aVar12) {
                    return aVar12;
                }
                gh.o oVar6 = (gh.o) objA;
                if (g0Var != null) {
                    n9.w0 w0Var = g0Var.f43566a;
                    this.f24339d = g0Var;
                    this.f24338c = oVar6;
                    this.f24337b = 2;
                    objE = w0Var.e(this);
                    if (objE == aVar12) {
                        return aVar12;
                    }
                    oVar2 = oVar6;
                    w1Var = (n9.w1) objE;
                    oVar = oVar2;
                } else {
                    oVar = oVar6;
                    w1Var = null;
                }
                if (w1Var != null) {
                    list = w1Var.f43728a;
                } else {
                    list = null;
                }
                w1Var = list != null ? w1Var2 : w1Var2;
                if (w1Var != null) {
                    num = w1Var.f43729b;
                } else {
                    num = null;
                }
                if (num == null) {
                    if (g0Var != null) {
                        num6 = null;
                    } else {
                        num6 = null;
                    }
                    if (num6 != null) {
                        w1Var = g0Var.f43567b;
                    }
                }
                w1Var3 = w1Var;
                if (w1Var3 == null) {
                    num3 = null;
                } else {
                    oVar.getClass();
                    num2 = w1Var3.f43729b;
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                        list2 = w1Var3.f43728a;
                        if (list2.isEmpty()) {
                            u1Var = null;
                        } else {
                            it = list2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    u1Var = null;
                                } else if (!((n9.u1) it.next()).f43705a.isEmpty()) {
                                    size = iIntValue - w1Var3.f43731d;
                                    i11 = 0;
                                    while (i11 < ns.o.A(list2)) {
                                        size -= ((n9.u1) list2.get(i11)).f43705a.size();
                                        i11++;
                                    }
                                    if (size < 0) {
                                        u1Var = (n9.u1) ry.m.q0(list2);
                                    } else {
                                        u1Var = (n9.u1) list2.get(i11);
                                    }
                                }
                            }
                        }
                        if (u1Var != null) {
                            num4 = (Integer) u1Var.f43706b;
                        } else {
                            num4 = null;
                        }
                        if (num4 != null) {
                            Object obj7 = u1Var.f43706b;
                            kotlin.jvm.internal.m.c(obj7);
                            iMax = ((Number) obj7).intValue() + 1;
                        } else {
                            if (u1Var != null) {
                                num5 = (Integer) u1Var.f43707c;
                            } else {
                                num5 = null;
                            }
                            if (num5 != null) {
                                Object obj8 = u1Var.f43707c;
                                kotlin.jvm.internal.m.c(obj8);
                                iMax = Math.max(1, ((Number) obj8).intValue() - 1);
                            } else {
                                iMax = 1;
                            }
                        }
                        numValueOf = Integer.valueOf(iMax);
                    } else {
                        numValueOf = null;
                    }
                    if (Build.ID != null) {
                        String message2 = "Refresh key " + numValueOf + " returned from PagingSource " + oVar;
                        kotlin.jvm.internal.m.f(message2, "message");
                    }
                    num3 = numValueOf;
                }
                if (g0Var != null) {
                    g0Var.f43566a.f43726i.cancel(null);
                }
                if (g0Var != null) {
                    g0Var.f43568c.cancel(null);
                }
                return new n9.g0(new n9.w0(num3, oVar, j0Var2.f43604b, (gp.r) j0Var2.f43606d.f44892c, w1Var3, new j5(0, j0Var2, n9.j0.class, "refresh", "refresh()V", 0, 5)), w1Var3, rz.e0.d());
            case 12:
                n9.j0 j0Var3 = (n9.j0) obj2;
                wy.a aVar13 = wy.a.COROUTINE_SUSPENDED;
                int i33 = this.f24337b;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar12 = (uz.j) this.f24338c;
                n9.g0 g0Var2 = (n9.g0) this.f24339d;
                n9.e1 e1Var = new n9.e1(new n9.n1(g0Var2.f43566a.f43727j, new ej.j(i17, i14, dVar), 5), new b1.p(j0Var3, j0Var3.f43606d), new a5.f(g0Var2.f43566a, 28), n9.d1.f43536a);
                this.f24337b = 1;
                return jVar12.emit(e1Var, this) == aVar13 ? aVar13 : b0Var;
            case 13:
                ph.k kVar = (ph.k) obj2;
                wy.a aVar14 = wy.a.COROUTINE_SUSPENDED;
                int i34 = this.f24337b;
                if (i34 != 0) {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar13 = (uz.j) this.f24338c;
                ph.a aVar15 = (ph.a) this.f24339d;
                String str2 = aVar15.f46836a;
                boolean z14 = aVar15.f46837b;
                List<mh.d> list3 = aVar15.f46838c;
                List<mh.f> list4 = aVar15.f46839d;
                kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                yVar.f38361a = BuildConfig.VERSION_NAME;
                ArrayList arrayList5 = new ArrayList();
                for (mh.d dVar2 : list3) {
                    arrayList5.add(dVar2.a());
                    dVar2.toString();
                }
                if (!arrayList5.isEmpty()) {
                    yVar.f38361a = ry.m.y0(arrayList5, ";", null, null, null, 62);
                }
                kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
                yVar2.f38361a = BuildConfig.VERSION_NAME;
                ArrayList arrayList6 = new ArrayList();
                for (mh.f fVar6 : list4) {
                    arrayList6.add(fVar6.a());
                    fVar6.toString();
                }
                if (!arrayList6.isEmpty()) {
                    yVar2.f38361a = ry.m.y0(arrayList6, ";", null, null, null, 62);
                }
                Objects.toString(yVar.f38361a);
                int i35 = 3;
                no.g gVar = new no.g(new ph.g(n9.m.a(new n9.j0(new d1.s0(new bp.w0(str2, kVar, yVar, yVar2, z14), dVar, i14), new c7.j(10, 10)).f43607e, ViewModelKt.getViewModelScope(kVar)), str2, yVar, kVar, z14), kVar.L, new fr.f4(i35, i17, dVar));
                uz.i1 i1Var2 = kVar.M;
                fr.f4 f4Var = new fr.f4(i35, i35, dVar);
                this.f24338c = null;
                this.f24339d = null;
                this.f24337b = 1;
                uz.x0.s(jVar13);
                Object objA2 = vz.b.a(uz.n0.f53370a, new uz.l0(f4Var, (vy.d) null), jVar13, this, new uz.i[]{gVar, i1Var2});
                if (objA2 != wy.a.COROUTINE_SUSPENDED) {
                    objA2 = b0Var;
                }
                if (objA2 != wy.a.COROUTINE_SUSPENDED) {
                    objA2 = b0Var;
                }
                return objA2 == aVar14 ? aVar14 : b0Var;
            case 14:
                wy.a aVar16 = wy.a.COROUTINE_SUSPENDED;
                int i36 = this.f24337b;
                if (i36 != 0) {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar14 = (uz.j) this.f24338c;
                ((Number) this.f24339d).intValue();
                rt.z0 z0Var = (rt.z0) obj2;
                gp.r rVar4 = new gp.r(new jt.g1(z0Var.f50739d, z0Var.f50738c, z0Var.f50737b, z0Var.f50736a, z0Var.f50740e, null));
                this.f24338c = null;
                this.f24339d = null;
                this.f24337b = 1;
                return uz.x0.q(jVar14, rVar4, this) == aVar16 ? aVar16 : b0Var;
            case 15:
                wy.a aVar17 = wy.a.COROUTINE_SUSPENDED;
                int i37 = this.f24337b;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar15 = (uz.j) this.f24338c;
                gp.r rVar5 = new gp.r(new b0.x0((rt.j2) obj2, dVar, 20));
                this.f24338c = null;
                this.f24339d = null;
                this.f24337b = 1;
                return uz.x0.q(jVar15, rVar5, this) == aVar17 ? aVar17 : b0Var;
            case 16:
                rt.e3 e3Var = (rt.e3) obj2;
                wy.a aVar18 = wy.a.COROUTINE_SUSPENDED;
                int i38 = this.f24337b;
                if (i38 != 0) {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar16 = (uz.j) this.f24338c;
                List list5 = (List) this.f24339d;
                r8 r8Var = e3Var.f49674v0;
                gp.r rVarE = e3Var.f49670r0.e(list5);
                this.f24338c = null;
                this.f24339d = null;
                this.f24337b = 1;
                uz.x0.s(jVar16);
                Object objCollect = rVarE.collect(new d0.g0(jVar16, e3Var, r8Var, r8Var, 2), this);
                if (objCollect != aVar18) {
                    objCollect = b0Var;
                }
                if (objCollect != aVar18) {
                    objCollect = b0Var;
                }
                return objCollect == aVar18 ? aVar18 : b0Var;
            case 17:
                l9 l9Var = (l9) obj2;
                wy.a aVar19 = wy.a.COROUTINE_SUSPENDED;
                int i39 = this.f24337b;
                if (i39 != 0) {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar17 = (uz.j) this.f24338c;
                int iIntValue2 = ((Number) this.f24339d).intValue();
                fr.x xVar = (fr.x) l9Var.f50023c;
                xVar.getClass();
                String id2 = CourseQuestionPreferencePayloadKt.buildCourseQuestionPreferenceProgressId(iIntValue2);
                au.e1 e1Var2 = xVar.f27958a;
                kotlin.jvm.internal.m.f(id2, "id");
                no.g gVarL = qx.p.l(e1Var2.f2984a, new String[]{"sub_learn_progress"}, new au.f(id2, 23));
                this.f24338c = null;
                this.f24339d = null;
                this.f24337b = 1;
                uz.x0.s(jVar17);
                Object objCollect2 = gVarL.collect(new fr.u(new k9(jVar17, iIntValue2, l9Var), iIntValue2, 0), this);
                if (objCollect2 != aVar19) {
                    objCollect2 = b0Var;
                }
                if (objCollect2 != aVar19) {
                    objCollect2 = b0Var;
                }
                if (objCollect2 != aVar19) {
                    objCollect2 = b0Var;
                }
                return objCollect2 == aVar19 ? aVar19 : b0Var;
            case 18:
                bb bbVar = (bb) obj2;
                uz.i1 i1Var3 = bbVar.O;
                List dataSentences = (List) this.f24338c;
                fb fbVar = (fb) this.f24339d;
                wy.a aVar20 = wy.a.COROUTINE_SUSPENDED;
                int i40 = this.f24337b;
                if (i40 == 0) {
                    com.bumptech.glide.e.F(obj);
                    if (!(fbVar instanceof cb)) {
                        if (!bbVar.M) {
                            this.f24338c = null;
                            this.f24339d = fbVar;
                            this.f24337b = 1;
                            if (bb.a(bbVar, dataSentences, this) == aVar20) {
                                return aVar20;
                            }
                        }
                        return fbVar instanceof db ? new ra(((db) fbVar).f49634a) : new ra(CropImageView.DEFAULT_ASPECT_RATIO);
                    }
                    bbVar.L.k(dataSentences);
                    if (((qa) i1Var3.getValue()).f50296a.isEmpty()) {
                        qa qaVar = (qa) i1Var3.getValue();
                        List showSentences = qaVar.f50297b;
                        int i41 = qaVar.f50298c;
                        boolean z15 = qaVar.f50299d;
                        kotlin.jvm.internal.m.f(dataSentences, "dataSentences");
                        kotlin.jvm.internal.m.f(showSentences, "showSentences");
                        qa qaVar2 = new qa(dataSentences, showSentences, i41, z15);
                        i1Var3.getClass();
                        i1Var3.l(null, qaVar2);
                    }
                    return new sa(dataSentences);
                }
                if (i40 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                bbVar.M = true;
                if (fbVar instanceof db) {
                }
            case 19:
                mb mbVar = (mb) obj2;
                wy.a aVar21 = wy.a.COROUTINE_SUSPENDED;
                int i42 = this.f24337b;
                if (i42 != 0) {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar18 = (uz.j) this.f24338c;
                ge geVar = (ge) this.f24339d;
                gp.r rVarE2 = mbVar.f50070n0.e(geVar.f49799a);
                this.f24338c = null;
                this.f24339d = null;
                this.f24337b = 1;
                uz.x0.s(jVar18);
                Object objCollect3 = rVarE2.collect(new a0.d0(jVar18, geVar, mbVar, i15), this);
                if (objCollect3 != aVar21) {
                    objCollect3 = b0Var;
                }
                if (objCollect3 != aVar21) {
                    objCollect3 = b0Var;
                }
                return objCollect3 == aVar21 ? aVar21 : b0Var;
            case 20:
                wy.a aVar22 = wy.a.COROUTINE_SUSPENDED;
                int i43 = this.f24337b;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar19 = (uz.j) this.f24338c;
                fr.i iVar = (fr.i) ((sr.i) obj2).f51774a;
                iVar.getClass();
                gp.r rVar6 = new gp.r(new fr.c(iVar, dVar, i16));
                this.f24338c = null;
                this.f24339d = null;
                this.f24337b = 1;
                return uz.x0.q(jVar19, rVar6, this) == aVar22 ? aVar22 : b0Var;
            case 21:
                wy.a aVar23 = wy.a.COROUTINE_SUSPENDED;
                int i44 = this.f24337b;
                if (i44 != 0) {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar20 = (uz.j) this.f24338c;
                gp.r rVar7 = new gp.r(new ns.j((rv.b) obj2, dVar, i13));
                this.f24338c = null;
                this.f24339d = null;
                this.f24337b = 1;
                return uz.x0.q(jVar20, rVar7, this) == aVar23 ? aVar23 : b0Var;
            case 22:
                wy.a aVar24 = wy.a.COROUTINE_SUSPENDED;
                int i45 = this.f24337b;
                if (i45 != 0) {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar21 = (uz.j) this.f24338c;
                LeaderBoardUser leaderBoardUser = (LeaderBoardUser) this.f24339d;
                gp.r rVarC = leaderBoardUser != null ? ((fr.v1) ((tu.e0) obj2).f52556a).c(leaderBoardUser.getUid()) : new gp.r(new ds.e(i17, i15, dVar));
                this.f24338c = null;
                this.f24339d = null;
                this.f24337b = 1;
                return uz.x0.q(jVar21, rVarC, this) == aVar24 ? aVar24 : b0Var;
            case 23:
                wy.a aVar25 = wy.a.COROUTINE_SUSPENDED;
                int i46 = this.f24337b;
                if (i46 == 0) {
                    com.bumptech.glide.e.F(obj);
                    jVar = (uz.j) this.f24338c;
                    Object obj9 = this.f24339d;
                    this.f24338c = jVar;
                    this.f24337b = 1;
                    objInvoke = ((xy.i) obj2).invoke(obj9, this);
                    if (objInvoke != aVar25) {
                    }
                    return aVar25;
                }
                if (i46 != 1) {
                    if (i46 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                jVar = (uz.j) this.f24338c;
                com.bumptech.glide.e.F(obj);
                objInvoke = obj;
                this.f24338c = null;
                this.f24337b = 2;
                if (jVar.emit(objInvoke, this) != aVar25) {
                    return b0Var;
                }
                return aVar25;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                wy.a aVar26 = wy.a.COROUTINE_SUSPENDED;
                int i47 = this.f24337b;
                if (i47 != 0) {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar22 = (uz.j) this.f24338c;
                wt.m mVar = (wt.m) obj2;
                gp.r rVar8 = new gp.r(new wt.f(mVar.f55309a, mVar, mVar.f55310b, null));
                yz.f fVar7 = rz.o0.f50940a;
                uz.i iVarW2 = uz.x0.w(rVar8, yz.e.f58387a);
                this.f24338c = null;
                this.f24339d = null;
                this.f24337b = 1;
                return uz.x0.q(jVar22, iVarW2, this) == aVar26 ? aVar26 : b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                wy.a aVar27 = wy.a.COROUTINE_SUSPENDED;
                int i48 = this.f24337b;
                if (i48 != 0) {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar23 = (uz.j) this.f24338c;
                n9.n0 n0VarB = ((wt.q) obj2).b(Integer.MAX_VALUE, ns.o.L("A", "B"), ry.r.f50854a, (List) this.f24339d);
                this.f24338c = null;
                this.f24339d = null;
                this.f24337b = 1;
                return uz.x0.q(jVar23, n0VarB, this) == aVar27 ? aVar27 : b0Var;
            default:
                wy.a aVar28 = wy.a.COROUTINE_SUSPENDED;
                int i49 = this.f24337b;
                if (i49 != 0) {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.j jVar24 = (uz.j) this.f24338c;
                uz.i iVarJ = ((fr.x4) ((wt.o0) obj2).f55334a).j();
                this.f24338c = null;
                this.f24339d = null;
                this.f24337b = 1;
                return uz.x0.q(jVar24, iVarJ, this) == aVar28 ? aVar28 : b0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(fz.e eVar, vy.d dVar) {
        super(3, dVar);
        this.f24336a = 23;
        this.f24340e = (xy.i) eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj, vy.d dVar, int i11) {
        super(3, dVar);
        this.f24336a = i11;
        this.f24340e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(vy.d dVar, Object obj, int i11) {
        super(3, dVar);
        this.f24336a = i11;
        this.f24340e = obj;
    }
}
