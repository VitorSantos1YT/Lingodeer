package rt;

import android.net.Uri;
import android.view.InputEvent;
import com.google.api.Service;
import com.lingo.lingoskill.ui.review.FlashCardFinishActivity;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.SyllableWriteLesson;
import com.lingodeer.data.model.UnitState;
import com.lingodeer.syllable_ko.model.KOSyllableLesson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f49805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f49806e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i11, Object obj, Object obj2, String str, vy.d dVar) {
        super(2, dVar);
        this.f49802a = i11;
        this.f49805d = obj;
        this.f49804c = str;
        this.f49806e = obj2;
    }

    private final Object j(Object obj) {
        Object objU;
        int i11;
        boolean z11;
        boolean z12;
        List list = (List) this.f49806e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = this.f49803b;
        boolean z13 = true;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            gp.r rVarG = ((bh.a1) ((vt.k0) this.f49805d)).g(list);
            this.f49803b = 1;
            objU = uz.x0.u(rVarG, this);
            if (objU == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            objU = obj;
        }
        ArrayList arrayListC = wt.m.c(list, (HashMap) objU);
        ArrayList arrayList = new ArrayList(ry.n.W(arrayListC, 10));
        int size = arrayListC.size();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i15 < size) {
            Object obj2 = arrayListC.get(i15);
            i15++;
            int i16 = i13 + 1;
            if (i13 < 0) {
                ns.o.V();
                throw null;
            }
            CourseUnit courseUnit = (CourseUnit) obj2;
            CourseUnit courseUnit2 = (CourseUnit) ry.m.t0(i16, arrayListC);
            CourseUnit courseUnit3 = (CourseUnit) ry.m.t0(i13 - 1, arrayListC);
            if (courseUnit.isTestOut()) {
                int i17 = i14 + 1;
                if (ry.l.D(new UnitState[]{UnitState.StateOpen, UnitState.StateRedo}, courseUnit2 != null ? courseUnit2.getUnitState() : null)) {
                    z11 = z13;
                    i11 = i17;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = arrayListC.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        Object obj3 = arrayListC.get(i18);
                        i18++;
                        if (courseUnit.getUnitList().contains(new Long(((CourseUnit) obj3).getUnitId()))) {
                            arrayList2.add(obj3);
                        }
                    }
                    int size3 = arrayList2.size();
                    boolean z14 = false;
                    int i19 = 0;
                    while (i19 < size3) {
                        Object obj4 = arrayList2.get(i19);
                        i19++;
                        if (ry.l.D(new UnitState[]{UnitState.StateOpen, UnitState.StateRedo}, ((CourseUnit) obj4).getUnitState())) {
                            z14 = true;
                        }
                    }
                    z12 = z14;
                    i11 = i17;
                    z11 = false;
                }
                arrayList.add(CourseUnit.m213copypls4pCs$default(courseUnit, 0L, null, null, null, 0, 0L, false, null, z11, false, z12, false, 0L, 0L, null, null, null, courseUnit.getUnitState(), null, courseUnit2, courseUnit3, i11, 0, 0, 12974847, null));
                i13 = i16;
                i14 = i11;
                z13 = true;
            } else {
                i11 = i14;
                z11 = false;
            }
            z12 = false;
            arrayList.add(CourseUnit.m213copypls4pCs$default(courseUnit, 0L, null, null, null, 0, 0L, false, null, z11, false, z12, false, 0L, 0L, null, null, null, courseUnit.getUnitState(), null, courseUnit2, courseUnit3, i11, 0, 0, 12974847, null));
            i13 = i16;
            i14 = i11;
            z13 = true;
        }
        return arrayList;
    }

    private final Object m(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f49803b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            yz.f fVar = rz.o0.f50940a;
            yz.e eVar = yz.e.f58387a;
            gh.d dVar = new gh.d((List) this.f49804c, null, 3);
            this.f49803b = 1;
            obj = rz.e0.M(eVar, dVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        int iIntValue = ((Number) obj).intValue();
        l1.b1 b1Var = (l1.b1) this.f49805d;
        lz.g gVar = new lz.g(0, 5, 1);
        ArrayList arrayList = new ArrayList(ry.n.W(gVar, 10));
        Iterator it = gVar.iterator();
        while (((lz.f) it).f40537c) {
            arrayList.add(new Integer((((ry.w) it).nextInt() * iIntValue) / 5));
        }
        b1Var.setValue(arrayList);
        ((l1.h1) ((l1.a1) this.f49806e)).m(iIntValue);
        return qy.b0.f48488a;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f49802a) {
            case 0:
                return new h((vt.p0) this.f49805d, (j) this.f49806e, (String) this.f49804c, dVar, 0);
            case 1:
                return new h(1, (e0) this.f49805d, (String) this.f49806e, (String) this.f49804c, dVar);
            case 2:
                h hVar = new h((b1) this.f49804c, dVar, 2);
                hVar.f49806e = obj;
                return hVar;
            case 3:
                h hVar2 = new h(3, (z5) this.f49806e, (ns.z) this.f49804c, dVar);
                hVar2.f49805d = obj;
                return hVar2;
            case 4:
                h hVar3 = new h(4, (g6) this.f49806e, (x8) this.f49804c, dVar);
                hVar3.f49805d = obj;
                return hVar3;
            case 5:
                return new h((g6) this.f49805d, (x8) this.f49806e, (c6) this.f49804c, dVar, 5);
            case 6:
                h hVar4 = new h(6, (LinkedHashMap) this.f49806e, (g6) this.f49804c, dVar);
                hVar4.f49805d = obj;
                return hVar4;
            case 7:
                return new h((rz.y) this.f49805d, (uz.p0) this.f49806e, (y8) this.f49804c, dVar, 7);
            case 8:
                h hVar5 = new h((ma) this.f49804c, dVar, 8);
                hVar5.f49806e = obj;
                return hVar5;
            case 9:
                h hVar6 = new h((bb) this.f49804c, dVar, 9);
                hVar6.f49806e = obj;
                return hVar6;
            case 10:
                h hVar7 = new h(10, (mb) this.f49806e, (vt.n0) this.f49804c, dVar);
                hVar7.f49805d = obj;
                return hVar7;
            case 11:
                h hVar8 = new h(11, (CoursePracticeType) this.f49806e, (vt.n0) this.f49804c, dVar);
                hVar8.f49805d = obj;
                return hVar8;
            case 12:
                return new h((rv.b) this.f49804c, dVar, 12);
            case 13:
                return new h((s9.a) this.f49805d, (Uri) this.f49806e, (InputEvent) this.f49804c, dVar, 13);
            case 14:
                return new h(14, (sm.c) this.f49806e, (l1.b1) this.f49804c, dVar);
            case 15:
                h hVar9 = new h((KOSyllableLesson) this.f49804c, dVar, 15);
                hVar9.f49806e = obj;
                return hVar9;
            case 16:
                h hVar10 = new h(16, (SyllableWriteLesson) this.f49806e, (String) this.f49804c, dVar);
                hVar10.f49805d = obj;
                return hVar10;
            case 17:
                return new h(17, (FlashCardFinishActivity) this.f49806e, (l1.b1) this.f49804c, dVar);
            case 18:
                return new h(18, (tp.b0) this.f49806e, (l1.b1) this.f49804c, dVar);
            case 19:
                h hVar11 = new h((tu.m0) this.f49804c, dVar, 19);
                hVar11.f49806e = obj;
                return hVar11;
            case 20:
                h hVar12 = new h(20, (tz.w) this.f49806e, this.f49804c, dVar);
                hVar12.f49805d = obj;
                return hVar12;
            case 21:
                return new h(21, (vt.r) this.f49805d, (Set) this.f49806e, (String) this.f49804c, dVar);
            case 22:
                h hVar13 = new h(22, (vt.s0) this.f49806e, (String) this.f49804c, dVar);
                hVar13.f49805d = obj;
                return hVar13;
            case 23:
                h hVar14 = new h(23, (uz.j) this.f49806e, (vz.d) this.f49804c, dVar);
                hVar14.f49805d = obj;
                return hVar14;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                h hVar15 = new h(24, (uz.n) this.f49806e, (uz.j) this.f49804c, dVar);
                hVar15.f49805d = obj;
                return hVar15;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                h hVar16 = new h(25, (w9.s) this.f49806e, (String[]) this.f49804c, dVar);
                hVar16.f49805d = obj;
                return hVar16;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new h((vt.k0) this.f49805d, (List) this.f49806e, (wt.m) this.f49804c, dVar, 26);
            case 27:
                h hVar17 = new h((List) this.f49804c, dVar, 27);
                hVar17.f49806e = obj;
                return hVar17;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return new h((l1.b1) this.f49805d, (l1.a1) this.f49806e, (List) this.f49804c, dVar, 28);
            default:
                return new h((y0.g) this.f49805d, (z0.e) this.f49806e, (y0.f) this.f49804c, dVar, 29);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f49802a) {
            case 0:
                return ((h) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((h) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((h) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((h) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((h) create((c6) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((h) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((h) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((h) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((h) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((h) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((h) create((List) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 11:
                return ((h) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 12:
                return ((h) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 13:
                return ((h) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 14:
                return ((h) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 15:
                return ((h) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 16:
                return ((h) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 17:
                return ((h) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 18:
                return ((h) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 19:
                return ((h) create((tt.b) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 20:
                return ((h) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 21:
                return ((h) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 22:
                return ((h) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 23:
                return ((h) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return ((h) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ((h) create((w9.x) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return ((h) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 27:
                return ((h) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return ((h) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((h) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:287:0x0639  */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x04aa, code lost:
    
        if (r0 == r3) goto L224;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r20v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v100, types: [java.lang.Object, qy.h] */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i11, Object obj, Object obj2, vy.d dVar) {
        super(2, dVar);
        this.f49802a = i11;
        this.f49806e = obj;
        this.f49804c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x0072 A[PHI: r2
      0x0072: PHI (r2v7 w9.x) = (r2v4 w9.x), (r2v4 w9.x), (r2v9 w9.x) binds: [B:17:0x0060, B:19:0x006f, B:10:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0089 A[PHI: r2
      0x0089: PHI (r2v10 w9.x) = (r2v7 w9.x), (r2v12 w9.x) binds: [B:22:0x0086, B:9:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0095 A[PHI: r2 r8
      0x0095: PHI (r2v13 w9.x) = (r2v10 w9.x), (r2v15 w9.x) binds: [B:25:0x0092, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r8v13 java.lang.Object) = (r8v12 java.lang.Object), (r8v0 java.lang.Object) binds: [B:25:0x0092, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ab A[PHI: r2
      0x00ab: PHI (r2v16 w9.x) = (r2v13 w9.x), (r2v18 w9.x) binds: [B:30:0x00a8, B:7:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b6, code lost:
    
        if (jh.h.i(r2, "VACUUM", r7) == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.h.e(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, Object obj2, Object obj3, vy.d dVar, int i11) {
        super(2, dVar);
        this.f49802a = i11;
        this.f49805d = obj;
        this.f49806e = obj2;
        this.f49804c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f49802a = i11;
        this.f49804c = obj;
    }
}
