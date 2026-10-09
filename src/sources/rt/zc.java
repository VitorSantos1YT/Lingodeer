package rt;

import com.lingodeer.data.model.BookmarkFolderKt;
import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.CourseUnitLessonKt;
import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.SRSStatusKt;
import com.lingodeer.data.model.UnitState;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryType;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import com.lingodeer.data.model.uistate.MasteryUiState;
import com.lingodeer.database.model.BookmarkFolderEntity;
import com.lingodeer.database.model.SRSStatusEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class zc implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uz.j f50804b;

    public /* synthetic */ zc(uz.j jVar, int i11) {
        this.f50803a = i11;
        this.f50804b = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:131:0x0246  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:175:0x0301  */
    /* JADX WARN: Code duplicated, block: B:199:0x036b  */
    /* JADX WARN: Code duplicated, block: B:217:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:251:0x0440  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:287:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:306:0x0520  */
    /* JADX WARN: Code duplicated, block: B:326:0x057a  */
    /* JADX WARN: Code duplicated, block: B:346:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:364:0x060d  */
    /* JADX WARN: Code duplicated, block: B:380:0x064f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:73:0x012c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0175  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        yc ycVar;
        od odVar;
        uz.i0 i0Var;
        vt.n nVar;
        vt.x0 x0Var;
        vt.y0 y0Var;
        wb.h hVar;
        wb.m mVar;
        wt.d dVar2;
        wt.g gVar;
        wt.h hVar2;
        wt.i iVar;
        wt.j jVar;
        wt.y yVar;
        wt.a0 a0Var;
        wu.i iVar2;
        zu.x xVar;
        zu.h1 h1Var;
        zu.r2 r2Var;
        int i11 = this.f50803a;
        boolean z11 = false;
        jh.h aVar = hc.b.f32178a;
        int i12 = 2;
        Object objAsExternalModel = null;
        qy.b0 b0Var = qy.b0.f48488a;
        uz.j jVar2 = this.f50804b;
        switch (i11) {
            case 0:
                if (dVar instanceof yc) {
                    ycVar = (yc) dVar;
                    int i13 = ycVar.f50726b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        ycVar.f50726b = i13 - Integer.MIN_VALUE;
                    } else {
                        ycVar = new yc(this, dVar);
                    }
                } else {
                    ycVar = new yc(this, dVar);
                }
                Object obj2 = ycVar.f50725a;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = ycVar.f50726b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj2);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj2);
                CourseTestFinishSummaryUiState courseTestFinishSummaryUiState = (CourseTestFinishSummaryUiState) obj;
                kotlin.jvm.internal.m.f(courseTestFinishSummaryUiState, "<this>");
                if (courseTestFinishSummaryUiState instanceof CourseTestFinishSummaryUiState.Success) {
                    CourseTestFinishSummaryUiState.Success success = (CourseTestFinishSummaryUiState.Success) courseTestFinishSummaryUiState;
                    if (success.getType() == CourseTestFinishSummaryType.LESSON && success.getAccuracy() == 100) {
                        z11 = true;
                    }
                }
                Boolean boolValueOf = Boolean.valueOf(z11);
                ycVar.f50726b = 1;
                return jVar2.emit(boolValueOf, ycVar) == aVar2 ? aVar2 : b0Var;
            case 1:
                if (dVar instanceof od) {
                    odVar = (od) dVar;
                    int i15 = odVar.f50218b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        odVar.f50218b = i15 - Integer.MIN_VALUE;
                    } else {
                        odVar = new od(this, dVar);
                    }
                } else {
                    odVar = new od(this, dVar);
                }
                Object obj3 = odVar.f50217a;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i16 = odVar.f50218b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj3);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj3);
                CourseUnit courseUnit = (CourseUnit) obj;
                kd kdVar = new kd(courseUnit, courseUnit.getSortIndex());
                odVar.f50218b = 1;
                return jVar2.emit(kdVar, odVar) == aVar3 ? aVar3 : b0Var;
            case 2:
                if (dVar instanceof uz.i0) {
                    i0Var = (uz.i0) dVar;
                    int i17 = i0Var.f53316b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        i0Var.f53316b = i17 - Integer.MIN_VALUE;
                    } else {
                        i0Var = new uz.i0(this, dVar);
                    }
                } else {
                    i0Var = new uz.i0(this, dVar);
                }
                Object obj4 = i0Var.f53315a;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i18 = i0Var.f53316b;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj4);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj4);
                if (obj == null) {
                    return b0Var;
                }
                i0Var.f53316b = 1;
                return jVar2.emit(obj, i0Var) == aVar4 ? aVar4 : b0Var;
            case 3:
                if (dVar instanceof vt.n) {
                    nVar = (vt.n) dVar;
                    int i19 = nVar.f54258b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        nVar.f54258b = i19 - Integer.MIN_VALUE;
                    } else {
                        nVar = new vt.n(this, dVar);
                    }
                } else {
                    nVar = new vt.n(this, dVar);
                }
                Object obj5 = nVar.f54257a;
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i21 = nVar.f54258b;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj5);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj5);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(BookmarkFolderKt.asExternalModel((BookmarkFolderEntity) it.next()));
                }
                nVar.f54258b = 1;
                return jVar2.emit(arrayList, nVar) == aVar5 ? aVar5 : b0Var;
            case 4:
                if (dVar instanceof vt.x0) {
                    x0Var = (vt.x0) dVar;
                    int i22 = x0Var.f54295b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        x0Var.f54295b = i22 - Integer.MIN_VALUE;
                    } else {
                        x0Var = new vt.x0(this, dVar);
                    }
                } else {
                    x0Var = new vt.x0(this, dVar);
                }
                Object obj6 = x0Var.f54294a;
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i23 = x0Var.f54295b;
                if (i23 != 0) {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj6);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj6);
                List list2 = (List) obj;
                ArrayList arrayList2 = new ArrayList(ry.n.W(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(SRSStatusKt.asExternalModel((SRSStatusEntity) it2.next()));
                }
                x0Var.f54295b = 1;
                return jVar2.emit(arrayList2, x0Var) == aVar6 ? aVar6 : b0Var;
            case 5:
                if (dVar instanceof vt.y0) {
                    y0Var = (vt.y0) dVar;
                    int i24 = y0Var.f54298b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        y0Var.f54298b = i24 - Integer.MIN_VALUE;
                    } else {
                        y0Var = new vt.y0(this, dVar);
                    }
                } else {
                    y0Var = new vt.y0(this, dVar);
                }
                Object obj7 = y0Var.f54297a;
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i25 = y0Var.f54298b;
                if (i25 != 0) {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj7);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj7);
                SRSStatusEntity sRSStatusEntity = (SRSStatusEntity) obj;
                objAsExternalModel = sRSStatusEntity != null ? SRSStatusKt.asExternalModel(sRSStatusEntity) : null;
                y0Var.f54298b = 1;
                return jVar2.emit(objAsExternalModel, y0Var) == aVar7 ? aVar7 : b0Var;
            case 6:
                if (dVar instanceof wb.h) {
                    hVar = (wb.h) dVar;
                    int i26 = hVar.f54912b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        hVar.f54912b = i26 - Integer.MIN_VALUE;
                    } else {
                        hVar = new wb.h(this, dVar);
                    }
                } else {
                    hVar = new wb.h(this, dVar);
                }
                Object obj8 = hVar.f54911a;
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                int i27 = hVar.f54912b;
                if (i27 != 0) {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj8);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj8);
                long j11 = ((f2.e) obj).f26584a;
                if (j11 == 9205357640488583168L) {
                    objAsExternalModel = hc.g.f32180c;
                } else {
                    hc.e eVar = wb.t.f54932b;
                    if (f2.e.d(j11) >= 0.5d && f2.e.b(j11) >= 0.5d) {
                        float fD = f2.e.d(j11);
                        jh.h aVar9 = (Float.isInfinite(fD) || Float.isNaN(fD)) ? aVar : new hc.a(hz.b.Q(f2.e.d(j11)));
                        float fB = f2.e.b(j11);
                        if (!Float.isInfinite(fB) && !Float.isNaN(fB)) {
                            aVar = new hc.a(hz.b.Q(f2.e.b(j11)));
                        }
                        objAsExternalModel = new hc.g(aVar9, aVar);
                    }
                }
                if (objAsExternalModel == null) {
                    return b0Var;
                }
                hVar.f54912b = 1;
                return jVar2.emit(objAsExternalModel, hVar) == aVar8 ? aVar8 : b0Var;
            case 7:
                if (dVar instanceof wb.m) {
                    mVar = (wb.m) dVar;
                    int i28 = mVar.f54922b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        mVar.f54922b = i28 - Integer.MIN_VALUE;
                    } else {
                        mVar = new wb.m(this, dVar);
                    }
                } else {
                    mVar = new wb.m(this, dVar);
                }
                Object obj9 = mVar.f54921a;
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                int i29 = mVar.f54922b;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj9);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj9);
                long j12 = ((v3.a) obj).f53483a;
                hc.e eVar2 = wb.t.f54932b;
                int i30 = (int) (3 & j12);
                int i31 = (((2 & i30) >> 1) * 3) + ((i30 & 1) << 1);
                if (!(((((1 << (18 - i31)) - 1) & ((int) (j12 >> (i31 + 46)))) - 1 == 0) | ((((int) (j12 >> 33)) & ((1 << (i31 + 13)) - 1)) - 1 == 0))) {
                    jh.h aVar11 = v3.a.d(j12) ? new hc.a(v3.a.h(j12)) : aVar;
                    if (v3.a.c(j12)) {
                        aVar = new hc.a(v3.a.g(j12));
                    }
                    objAsExternalModel = new hc.g(aVar11, aVar);
                }
                if (objAsExternalModel == null) {
                    return b0Var;
                }
                mVar.f54922b = 1;
                return jVar2.emit(objAsExternalModel, mVar) == aVar10 ? aVar10 : b0Var;
            case 8:
                if (dVar instanceof wt.d) {
                    dVar2 = (wt.d) dVar;
                    int i32 = dVar2.f55243b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        dVar2.f55243b = i32 - Integer.MIN_VALUE;
                    } else {
                        dVar2 = new wt.d(this, dVar);
                    }
                } else {
                    dVar2 = new wt.d(this, dVar);
                }
                Object obj10 = dVar2.f55242a;
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                int i33 = dVar2.f55243b;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj10);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj10);
                if (CourseUnitLessonKt.isFallbackLesson((CourseLesson) obj)) {
                    return b0Var;
                }
                dVar2.f55243b = 1;
                return jVar2.emit(obj, dVar2) == aVar12 ? aVar12 : b0Var;
            case 9:
                if (dVar instanceof wt.g) {
                    gVar = (wt.g) dVar;
                    int i34 = gVar.f55269b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        gVar.f55269b = i34 - Integer.MIN_VALUE;
                    } else {
                        gVar = new wt.g(this, dVar);
                    }
                } else {
                    gVar = new wt.g(this, dVar);
                }
                Object obj11 = gVar.f55268a;
                wy.a aVar13 = wy.a.COROUTINE_SUSPENDED;
                int i35 = gVar.f55269b;
                if (i35 != 0) {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj11);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj11);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj12 : (List) obj) {
                    CourseUnit courseUnit2 = (CourseUnit) obj12;
                    if (!courseUnit2.isTestOut() && courseUnit2.getUnitState() == UnitState.StateRedo) {
                        arrayList3.add(obj12);
                    }
                }
                List listS0 = ry.m.S0(arrayList3, new ua.e(i12));
                gVar.f55269b = 1;
                return jVar2.emit(listS0, gVar) == aVar13 ? aVar13 : b0Var;
            case 10:
                if (dVar instanceof wt.h) {
                    hVar2 = (wt.h) dVar;
                    int i36 = hVar2.f55276b;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        hVar2.f55276b = i36 - Integer.MIN_VALUE;
                    } else {
                        hVar2 = new wt.h(this, dVar);
                    }
                } else {
                    hVar2 = new wt.h(this, dVar);
                }
                Object obj13 = hVar2.f55275a;
                wy.a aVar14 = wy.a.COROUTINE_SUSPENDED;
                int i37 = hVar2.f55276b;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj13);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj13);
                List list3 = (List) obj;
                ArrayList arrayList4 = new ArrayList(ry.n.W(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    b7.e0.x(((CourseUnit) it3.next()).getUnitId(), arrayList4);
                }
                hVar2.f55276b = 1;
                return jVar2.emit(arrayList4, hVar2) == aVar14 ? aVar14 : b0Var;
            case 11:
                if (dVar instanceof wt.i) {
                    iVar = (wt.i) dVar;
                    int i38 = iVar.f55284b;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        iVar.f55284b = i38 - Integer.MIN_VALUE;
                    } else {
                        iVar = new wt.i(this, dVar);
                    }
                } else {
                    iVar = new wt.i(this, dVar);
                }
                Object obj14 = iVar.f55283a;
                wy.a aVar15 = wy.a.COROUTINE_SUSPENDED;
                int i39 = iVar.f55284b;
                if (i39 != 0) {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj14);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj14);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj15 : (List) obj) {
                    CourseUnit courseUnit3 = (CourseUnit) obj15;
                    if (!courseUnit3.isTestOut() && courseUnit3.getUnitState() != UnitState.StateLocked) {
                        arrayList5.add(obj15);
                    }
                }
                iVar.f55284b = 1;
                return jVar2.emit(arrayList5, iVar) == aVar15 ? aVar15 : b0Var;
            case 12:
                if (dVar instanceof wt.j) {
                    jVar = (wt.j) dVar;
                    int i40 = jVar.f55290b;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        jVar.f55290b = i40 - Integer.MIN_VALUE;
                    } else {
                        jVar = new wt.j(this, dVar);
                    }
                } else {
                    jVar = new wt.j(this, dVar);
                }
                Object obj16 = jVar.f55289a;
                wy.a aVar16 = wy.a.COROUTINE_SUSPENDED;
                int i41 = jVar.f55290b;
                if (i41 != 0) {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj16);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj16);
                List list4 = (List) obj;
                ArrayList arrayList6 = new ArrayList(ry.n.W(list4, 10));
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    b7.e0.x(((CourseUnit) it4.next()).getUnitId(), arrayList6);
                }
                jVar.f55290b = 1;
                return jVar2.emit(arrayList6, jVar) == aVar16 ? aVar16 : b0Var;
            case 13:
                if (dVar instanceof wt.y) {
                    yVar = (wt.y) dVar;
                    int i42 = yVar.f55364b;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        yVar.f55364b = i42 - Integer.MIN_VALUE;
                    } else {
                        yVar = new wt.y(this, dVar);
                    }
                } else {
                    yVar = new wt.y(this, dVar);
                }
                Object obj17 = yVar.f55363a;
                wy.a aVar17 = wy.a.COROUTINE_SUSPENDED;
                int i43 = yVar.f55364b;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj17);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj17);
                ArrayList arrayList7 = new ArrayList();
                for (Object obj18 : (List) obj) {
                    if (!((SRSStatus) obj18).isExcludedFromReview()) {
                        arrayList7.add(obj18);
                    }
                }
                List listU0 = ry.m.U0(ry.m.S0(arrayList7, new fr.a2(new fr.a2(new ua.e(5), 21), 22)), 50);
                yVar.f55364b = 1;
                return jVar2.emit(listU0, yVar) == aVar17 ? aVar17 : b0Var;
            case 14:
                if (dVar instanceof wt.a0) {
                    a0Var = (wt.a0) dVar;
                    int i44 = a0Var.f55233b;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        a0Var.f55233b = i44 - Integer.MIN_VALUE;
                    } else {
                        a0Var = new wt.a0(this, dVar);
                    }
                } else {
                    a0Var = new wt.a0(this, dVar);
                }
                Object obj19 = a0Var.f55232a;
                wy.a aVar18 = wy.a.COROUTINE_SUSPENDED;
                int i45 = a0Var.f55233b;
                if (i45 != 0) {
                    if (i45 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj19);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj19);
                List listU1 = ry.m.U0(ry.m.S0((List) obj, new ua.e(6)), 40);
                a0Var.f55233b = 1;
                return jVar2.emit(listU1, a0Var) == aVar18 ? aVar18 : b0Var;
            case 15:
                if (dVar instanceof wu.i) {
                    iVar2 = (wu.i) dVar;
                    int i46 = iVar2.f55394b;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        iVar2.f55394b = i46 - Integer.MIN_VALUE;
                    } else {
                        iVar2 = new wu.i(this, dVar);
                    }
                } else {
                    iVar2 = new wu.i(this, dVar);
                }
                Object obj20 = iVar2.f55393a;
                wy.a aVar19 = wy.a.COROUTINE_SUSPENDED;
                int i47 = iVar2.f55394b;
                if (i47 != 0) {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj20);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj20);
                wu.g gVar2 = new wu.g(ry.m.S0((List) obj, new ua.e(7)));
                iVar2.f55394b = 1;
                return jVar2.emit(gVar2, iVar2) == aVar19 ? aVar19 : b0Var;
            case 16:
                if (dVar instanceof zu.x) {
                    xVar = (zu.x) dVar;
                    int i48 = xVar.f59573b;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        xVar.f59573b = i48 - Integer.MIN_VALUE;
                    } else {
                        xVar = new zu.x(this, dVar);
                    }
                } else {
                    xVar = new zu.x(this, dVar);
                }
                Object obj21 = xVar.f59572a;
                wy.a aVar20 = wy.a.COROUTINE_SUSPENDED;
                int i49 = xVar.f59573b;
                if (i49 != 0) {
                    if (i49 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj21);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj21);
                zu.v vVar = new zu.v(((Boolean) obj).booleanValue());
                xVar.f59573b = 1;
                return jVar2.emit(vVar, xVar) == aVar20 ? aVar20 : b0Var;
            case 17:
                if (dVar instanceof zu.h1) {
                    h1Var = (zu.h1) dVar;
                    int i50 = h1Var.f59432b;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        h1Var.f59432b = i50 - Integer.MIN_VALUE;
                    } else {
                        h1Var = new zu.h1(this, dVar);
                    }
                } else {
                    h1Var = new zu.h1(this, dVar);
                }
                Object obj22 = h1Var.f59431a;
                wy.a aVar21 = wy.a.COROUTINE_SUSPENDED;
                int i51 = h1Var.f59432b;
                if (i51 != 0) {
                    if (i51 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj22);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj22);
                zu.p0 p0Var = new zu.p0((List) obj);
                h1Var.f59432b = 1;
                return jVar2.emit(p0Var, h1Var) == aVar21 ? aVar21 : b0Var;
            default:
                if (dVar instanceof zu.r2) {
                    r2Var = (zu.r2) dVar;
                    int i52 = r2Var.f59547b;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        r2Var.f59547b = i52 - Integer.MIN_VALUE;
                    } else {
                        r2Var = new zu.r2(this, dVar);
                    }
                } else {
                    r2Var = new zu.r2(this, dVar);
                }
                Object obj23 = r2Var.f59546a;
                wy.a aVar22 = wy.a.COROUTINE_SUSPENDED;
                int i53 = r2Var.f59547b;
                if (i53 != 0) {
                    if (i53 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj23);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj23);
                MasteryUiState.Success success2 = new MasteryUiState.Success((List) obj);
                r2Var.f59547b = 1;
                return jVar2.emit(success2, r2Var) == aVar22 ? aVar22 : b0Var;
        }
    }
}
