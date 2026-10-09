package tp;

import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import bh.a1;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingodeer.data.model.ChineseToneLastVisited;
import com.lingodeer.data.model.CourseCharacterGroup;
import com.lingodeer.data.model.ReviewStatus;
import com.lingodeer.data.model.characterstroke.CharacterStrokeGroup;
import com.lingodeer.database.model.ChineseToneLastVisitedEntity;
import com.yalantis.ucrop.view.CropImageView;
import fr.v1;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import n9.n0;
import uz.i1;
import uz.x0;
import wt.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52459c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f52457a = i11;
        this.f52459c = obj;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f52457a) {
            case 0:
                return new f0((i0) this.f52459c, dVar, 0);
            case 1:
                return new f0((tq.d) this.f52459c, this.f52458b, dVar);
            case 2:
                return new f0((tu.j) this.f52459c, dVar, 2);
            case 3:
                return new f0((ui.h) this.f52459c, dVar, 3);
            case 4:
                return new f0((uz.i) this.f52459c, dVar, 4);
            case 5:
                return new f0((File) this.f52459c, dVar, 5);
            case 6:
                return new f0((vs.d) this.f52459c, dVar, 6);
            case 7:
                return new f0((vt.f0) this.f52459c, dVar, 7);
            case 8:
                return new f0((w9.g) this.f52459c, dVar, 8);
            case 9:
                return new f0((w9.g0) this.f52459c, dVar, 9);
            case 10:
                return new f0((wb.i) this.f52459c, dVar, 10);
            case 11:
                return new f0((x1.p) this.f52459c, dVar, 11);
            case 12:
                return new f0((rz.t) this.f52459c, dVar, 12);
            case 13:
                return new f0((yr.k) this.f52459c, dVar, 13);
            case 14:
                return new f0((yr.l) this.f52459c, dVar, 14);
            case 15:
                return new f0((zr.b) this.f52459c, dVar, 15);
            case 16:
                return new f0((zr.i) this.f52459c, dVar, 16);
            default:
                return new f0((zr.m) this.f52459c, dVar, 17);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f52457a) {
            case 0:
                return ((f0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 1:
                f0 f0Var = (f0) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                f0Var.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                return ((f0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((f0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((f0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((f0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((f0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((f0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((f0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((f0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((f0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 11:
                return ((f0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 12:
                return ((f0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 13:
                return ((f0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 14:
                return ((f0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 15:
                return ((f0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 16:
                return ((f0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((f0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:206:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:218:0x0438  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [wy.a] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v44, types: [wy.a] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, qy.h] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objU;
        int i11;
        int i12;
        Object objE;
        Object objU2;
        Object objC;
        Object objB;
        Object objM;
        Object objM2;
        int i13 = this.f52457a;
        int i14 = 5;
        int i15 = 4;
        ry.r rVar = ry.r.f50854a;
        int i16 = 2;
        vy.d dVar = null;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj2 = this.f52459c;
        int i17 = 1;
        switch (i13) {
            case 0:
                Object arrayList = wy.a.COROUTINE_SUSPENDED;
                int i18 = this.f52458b;
                if (i18 == 0) {
                    com.bumptech.glide.e.F(obj);
                    n0 n0VarB = ((wt.q) ((i0) obj2).V.getValue()).b(Integer.MAX_VALUE, rVar, ns.o.K(new Integer(2)), ns.o.K(new Long(-1L)));
                    this.f52458b = 1;
                    objU = x0.u(n0VarB, this);
                    if (objU != arrayList) {
                    }
                    return arrayList;
                }
                if (i18 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                objU = obj;
                Iterable<ReviewStatus> iterable = (Iterable) objU;
                arrayList = new ArrayList(ry.n.W(iterable, 10));
                for (ReviewStatus reviewStatus : iterable) {
                    ReviewNew reviewNew = new ReviewNew();
                    reviewNew.setCwsId(reviewStatus.getId());
                    reviewNew.setUnit(new Long(reviewStatus.getUnitId()));
                    reviewNew.setLastStudyTime(new Long(reviewStatus.getLastStudyTime()));
                    reviewNew.setStatus(reviewStatus.getStatus());
                    reviewNew.setElemType(new Integer(reviewStatus.getElemType()));
                    arrayList.add(reviewNew);
                }
                return arrayList;
            case 1:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                tq.d dVar2 = (tq.d) obj2;
                i1 i1Var = dVar2.f52525c;
                int i19 = this.f52458b;
                if (i19 == 0) {
                    i11 = 1;
                } else if (i19 == 1) {
                    i11 = 2;
                } else if (i19 == 2) {
                    i11 = 3;
                } else if (i19 != 3) {
                    i11 = 1;
                } else {
                    i11 = 4;
                }
                vy.d dVar3 = null;
                if (dVar2.f52529t.contains(new Integer(i11))) {
                    tq.a aVarA = tq.a.a((tq.a) i1Var.getValue(), null, null, null, false, CropImageView.DEFAULT_ASPECT_RATIO, true, 63);
                    i1Var.getClass();
                    i1Var.l(null, aVarA);
                } else {
                    if (i19 == 0) {
                        i12 = 1;
                    } else if (i19 == 1) {
                        i12 = 2;
                    } else if (i19 == 2) {
                        i12 = 3;
                    } else if (i19 != 3) {
                        i12 = 1;
                    } else {
                        i12 = 4;
                    }
                    long j11 = i12;
                    File file = new File(defpackage.e.m(xt.b.a().b(), fv.b.D(j11)));
                    qy.q qVar = fv.b.f28186a;
                    fv.a aVar2 = new fv.a(0L, fv.b.E(j11), fv.b.D(j11));
                    if (file.exists()) {
                        rz.e0.B(ViewModelKt.getViewModelScope(dVar2), null, null, new tq.c(i12, 1, file, dVar2, dVar3), 3);
                    } else {
                        i1Var.l(null, tq.a.a((tq.a) i1Var.getValue(), null, null, null, true, CropImageView.DEFAULT_ASPECT_RATIO, false, 15));
                        dVar2.f52523a.d(aVar2, new gn.d(dVar2, i12, file, i14));
                    }
                }
                return b0Var;
            case 2:
                tu.j jVar = (tu.j) obj2;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i21 = this.f52458b;
                if (i21 == 0) {
                    com.bumptech.glide.e.F(obj);
                    o0 o0Var = jVar.f52590t;
                    this.f52458b = 1;
                    objE = o0Var.e(this);
                    if (objE != aVar3) {
                    }
                    return aVar3;
                }
                if (i21 != 1) {
                    if (i21 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                objE = obj;
                int iIntValue = ((Number) objE).intValue();
                i1 i1Var2 = jVar.H;
                Integer num = new Integer(iIntValue);
                i1Var2.getClass();
                i1Var2.l(null, num);
                ru.a aVar4 = jVar.f52584a;
                this.f52458b = 2;
                if (((v1) aVar4).f(this) != aVar3) {
                    return b0Var;
                }
                return aVar3;
            case 3:
                ui.h hVar = (ui.h) obj2;
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i22 = this.f52458b;
                if (i22 == 0) {
                    com.bumptech.glide.e.F(obj);
                    wt.m0 m0Var = hVar.u().f55339f;
                    this.f52458b = 1;
                    objU2 = x0.u(m0Var, this);
                    if (objU2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objU2 = obj;
                }
                boolean zBooleanValue = ((Boolean) objU2).booleanValue();
                if (!FirebaseRemoteConfig.d().b("quit_lesson_show_ad") || zBooleanValue) {
                    return b0Var;
                }
                int[] iArr = bq.r.f4959a;
                Context contextRequireContext = hVar.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                bq.m.C(contextRequireContext, "quit_alphabet_lesson");
                return b0Var;
            case 4:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i23 = this.f52458b;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f52458b = 1;
                Object objCollect = ((uz.i) obj2).collect(vz.n.f54353a, this);
                if (objCollect != aVar6) {
                    objCollect = b0Var;
                }
                return objCollect == aVar6 ? aVar6 : b0Var;
            case 5:
                File file2 = (File) obj2;
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i24 = this.f52458b;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                pl.d dVarO = pl.d.f46951b.o();
                String name = file2.getName();
                kotlin.jvm.internal.m.e(name, "getName(...)");
                String path = file2.getPath();
                re.g0 g0Var = new re.g0(7);
                this.f52458b = 1;
                return dVarO.a("report/", name, path, g0Var, this) == aVar7 ? aVar7 : b0Var;
            case 6:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                int i25 = this.f52458b;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                vs.d dVar4 = (vs.d) obj2;
                vt.k0 k0Var = dVar4.f54151c;
                long j12 = dVar4.f54149a;
                this.f52458b = 1;
                a1 a1Var = (a1) k0Var;
                a1Var.getClass();
                yz.f fVar = rz.o0.f50940a;
                Object objM3 = rz.e0.M(yz.e.f58387a, new bh.n0(9, j12, a1Var, null), this);
                if (objM3 != aVar8) {
                    objM3 = b0Var;
                }
                return objM3 == aVar8 ? aVar8 : b0Var;
            case 7:
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                int i26 = this.f52458b;
                if (i26 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.t tVar = ((vt.f0) obj2).f54220a;
                    this.f52458b = 1;
                    objC = cf.x.C(this, tVar.f3070a, true, false, new au.a(i14));
                    if (objC == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objC = obj;
                }
                ChineseToneLastVisitedEntity chineseToneLastVisitedEntity = (ChineseToneLastVisitedEntity) objC;
                if (chineseToneLastVisitedEntity != null) {
                    return new ChineseToneLastVisited(chineseToneLastVisitedEntity.getId(), chineseToneLastVisitedEntity.getLessonId(), chineseToneLastVisitedEntity.getTime());
                }
                return null;
            case 8:
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                int i27 = this.f52458b;
                if (i27 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f52458b = 1;
                    return ((w9.g) obj2).a(this) == aVar10 ? aVar10 : b0Var;
                }
                if (i27 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 9:
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                int i28 = this.f52458b;
                if (i28 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f52458b = 1;
                    return ((w9.g0) obj2).f(this) == aVar11 ? aVar11 : b0Var;
                }
                if (i28 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 10:
                wb.i iVar = (wb.i) obj2;
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                int i29 = this.f52458b;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                vz.i iVarZ = x0.z(new sr.d(iVar, dVar, 23), l1.t.K(new s0.u(iVar, 24)));
                n9.h0 h0Var = new n9.h0(iVar, i17);
                this.f52458b = 1;
                return iVarZ.collect(h0Var, this) == aVar12 ? aVar12 : b0Var;
            case 11:
                x1.p pVar = (x1.p) obj2;
                wy.a aVar13 = wy.a.COROUTINE_SUSPENDED;
                int i30 = this.f52458b;
                if (i30 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f52458b = 1;
                    if (rz.e0.m(3500L, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                if (pVar.isEmpty()) {
                    return b0Var;
                }
                pVar.remove(0);
                return b0Var;
            case 12:
                wy.a aVar14 = wy.a.COROUTINE_SUSPENDED;
                int i31 = this.f52458b;
                if (i31 != 0) {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                this.f52458b = 1;
                Object objO = ((rz.t) obj2).o(this);
                return objO == aVar14 ? aVar14 : objO;
            case 13:
                wy.a aVar15 = wy.a.COROUTINE_SUSPENDED;
                int i32 = this.f52458b;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                vt.d0 d0Var = ((yr.k) obj2).f57878a;
                int i33 = ((fr.o0) xt.b.c()).f27733a.keyLanguage;
                this.f52458b = 1;
                Object objB2 = d0Var.b(i33, rVar, new ds.e(i16, 12, dVar), this);
                return objB2 == aVar15 ? aVar15 : objB2;
            case 14:
                Object arrayList2 = wy.a.COROUTINE_SUSPENDED;
                int i34 = this.f52458b;
                if (i34 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vt.d0 d0Var2 = ((yr.l) obj2).f57879a;
                    this.f52458b = 1;
                    objB = d0Var2.b(((fr.o0) d0Var2.f54212b).f27733a.keyLanguage, rVar, new ds.e(i16, 11, dVar), this);
                    if (objB != arrayList2) {
                    }
                    return arrayList2;
                }
                if (i34 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                objB = obj;
                Iterable<CharacterStrokeGroup> iterable2 = (Iterable) objB;
                arrayList2 = new ArrayList(ry.n.W(iterable2, 10));
                for (CharacterStrokeGroup characterStrokeGroup : iterable2) {
                    kotlin.jvm.internal.m.f(characterStrokeGroup, "<this>");
                    arrayList2.add(new CourseCharacterGroup(characterStrokeGroup.getGroupId(), characterStrokeGroup.getGroupIndex(), characterStrokeGroup.getGroupList(), characterStrokeGroup.getGroupName(), characterStrokeGroup.getTGroupList(), characterStrokeGroup.getTGroupName()));
                }
                return arrayList2;
            case 15:
                zr.b bVar = (zr.b) obj2;
                wy.a aVar16 = wy.a.COROUTINE_SUSPENDED;
                int i35 = this.f52458b;
                if (i35 != 0) {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                uz.i iVarO = x0.o(x0.n(bVar.f59294t, 120L));
                b1.b bVar2 = new b1.b(bVar, 21);
                this.f52458b = 1;
                return iVarO.collect(bVar2, this) == aVar16 ? aVar16 : b0Var;
            case 16:
                zr.i iVar2 = (zr.i) obj2;
                CourseCharacterGroup courseCharacterGroup = iVar2.f59302a;
                wy.a aVar17 = wy.a.COROUTINE_SUSPENDED;
                int i36 = this.f52458b;
                if (i36 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yr.m mVar = iVar2.f59303b;
                    this.f52458b = 1;
                    mVar.getClass();
                    yz.f fVar2 = rz.o0.f50940a;
                    objM = rz.e0.M(yz.e.f58387a, new xg.b(i15, mVar, courseCharacterGroup, dVar), this);
                    if (objM == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objM = obj;
                }
                List list = (List) objM;
                Objects.toString(list);
                i1 i1Var3 = iVar2.f59305d;
                zr.g gVar = new zr.g(courseCharacterGroup, list);
                i1Var3.getClass();
                i1Var3.l(null, gVar);
                return b0Var;
            default:
                zr.m mVar2 = (zr.m) obj2;
                i1 i1Var4 = mVar2.f59311c;
                wy.a aVar18 = wy.a.COROUTINE_SUSPENDED;
                int i37 = this.f52458b;
                try {
                    if (i37 == 0) {
                        com.bumptech.glide.e.F(obj);
                        zr.j jVar2 = zr.j.f59307a;
                        i1Var4.getClass();
                        i1Var4.l(null, jVar2);
                        yr.l lVar = mVar2.f59309a;
                        this.f52458b = 1;
                        lVar.getClass();
                        yz.f fVar3 = rz.o0.f50940a;
                        objM2 = rz.e0.M(yz.e.f58387a, new f0(lVar, dVar, 14), this);
                        if (objM2 == aVar18) {
                            return aVar18;
                        }
                    } else {
                        if (i37 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                        objM2 = obj;
                    }
                    List list2 = (List) objM2;
                    Objects.toString(list2);
                    zr.k kVar = new zr.k(list2);
                    i1Var4.getClass();
                    i1Var4.l(null, kVar);
                    return b0Var;
                } catch (Exception unused) {
                    zr.k kVar2 = new zr.k(rVar);
                    i1Var4.getClass();
                    i1Var4.l(null, kVar2);
                    return b0Var;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(tq.d dVar, int i11, vy.d dVar2) {
        super(2, dVar2);
        this.f52457a = 1;
        this.f52459c = dVar;
        this.f52458b = i11;
    }
}
