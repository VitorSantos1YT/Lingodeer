package fr;

import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.UnitState;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27516a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f27519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f27520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f27521f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f27522t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, int i11, LinkedHashMap linkedHashMap, vy.d dVar) {
        super(2, dVar);
        this.f27521f = iVar;
        this.f27518c = i11;
        this.f27522t = linkedHashMap;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27516a) {
            case 0:
                return new g((i) this.f27521f, this.f27518c, (LinkedHashMap) this.f27522t, dVar);
            default:
                g gVar = new g((o0.t) this.f27521f, this.f27518c, this.f27519d, (b0.m) this.f27522t, dVar);
                gVar.f27520e = obj;
                return gVar;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27516a) {
            case 0:
                return ((g) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((g) create((f0.n1) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007f A[PHI: r5
      0x007f: PHI (r5v6 int) = (r5v5 int), (r5v7 int) binds: [B:29:0x0084, B:26:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objM;
        Object objL;
        float f5;
        String str;
        int i11;
        int i12;
        int i13 = this.f27516a;
        int i14 = 0;
        Object obj2 = this.f27522t;
        int i15 = this.f27518c;
        Object obj3 = this.f27521f;
        switch (i13) {
            case 0:
                i iVar = (i) obj3;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f27517b;
                int i17 = 2;
                vy.d dVar = null;
                if (i16 != 0) {
                    if (i16 == 1) {
                        com.bumptech.glide.e.F(obj);
                        objM = obj;
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f5 = this.f27519d;
                        String str2 = (String) this.f27520e;
                        com.bumptech.glide.e.F(obj);
                        str = str2;
                        objL = obj;
                    }
                    qy.l lVar = (qy.l) objL;
                    int iIntValue = ((Number) lVar.f48495a).intValue();
                    int iIntValue2 = ((Number) lVar.f48496b).intValue();
                    if (f5 == CropImageView.DEFAULT_ASPECT_RATIO && (iIntValue > 0 || iIntValue2 > 0)) {
                        f5 = 0.01f;
                    }
                    return new y0(str, f5, iIntValue, iIntValue2, ((Number) ((LinkedHashMap) obj2).getOrDefault(str, new Float(CropImageView.DEFAULT_ASPECT_RATIO))).floatValue());
                }
                com.bumptech.glide.e.F(obj);
                this.f27517b = 1;
                yz.f fVar = rz.o0.f50940a;
                objM = rz.e0.M(yz.e.f58387a, new bp.h2(iVar, i15, dVar, i17), this);
                if (objM == aVar) {
                    return aVar;
                }
                List list = (List) objM;
                Iterator it = list.iterator();
                int totalLessonCount = 0;
                while (it.hasNext()) {
                    totalLessonCount += ((CourseUnit) it.next()).getTotalLessonCount();
                }
                Iterator it2 = list.iterator();
                int finishedLessonCount = 0;
                while (it2.hasNext()) {
                    finishedLessonCount += ((CourseUnit) it2.next()).getFinishedLessonCount();
                }
                float fK = hz.b.k(totalLessonCount > 0 ? ((int) ((finishedLessonCount / totalLessonCount) * 100)) / 100.0f : 0.0f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
                String strK = xt.d.k(i15);
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (((CourseUnit) obj4).getUnitState() != UnitState.StateLocked) {
                        arrayList.add(obj4);
                    }
                }
                ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
                int size = arrayList.size();
                while (i14 < size) {
                    Object obj5 = arrayList.get(i14);
                    i14++;
                    b7.e0.x(((CourseUnit) obj5).getUnitId(), arrayList2);
                }
                ad.b0 b0Var = new ad.b0(iVar, i15, arrayList2, null);
                this.f27520e = strK;
                this.f27519d = fK;
                this.f27517b = 2;
                objL = rz.e0.l(b0Var, this);
                if (objL == aVar) {
                    return aVar;
                }
                f5 = fK;
                str = strK;
                qy.l lVar2 = (qy.l) objL;
                int iIntValue3 = ((Number) lVar2.f48495a).intValue();
                int iIntValue4 = ((Number) lVar2.f48496b).intValue();
                if (f5 == CropImageView.DEFAULT_ASPECT_RATIO) {
                    f5 = 0.01f;
                }
                return new y0(str, f5, iIntValue3, iIntValue4, ((Number) ((LinkedHashMap) obj2).getOrDefault(str, new Float(CropImageView.DEFAULT_ASPECT_RATIO))).floatValue());
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i18 = this.f27517b;
                qy.b0 b0Var2 = qy.b0.f48488a;
                if (i18 == 0) {
                    com.bumptech.glide.e.F(obj);
                    o0.t tVar = (o0.t) obj3;
                    l0.s sVar = new l0.s((f0.n1) this.f27520e, tVar, 1);
                    float f11 = this.f27519d;
                    b0.m mVar = (b0.m) obj2;
                    this.f27517b = 1;
                    float f12 = o0.w.f44457a;
                    tVar.f44449s.m(tVar.j(new Integer(i15).intValue()));
                    boolean z11 = i15 > tVar.f44436e;
                    int iE = (sVar.e() - tVar.f44436e) + 1;
                    if (((z11 && i15 > sVar.e()) || (!z11 && i15 < tVar.f44436e)) && Math.abs(i15 - tVar.f44436e) >= 3) {
                        if (z11) {
                            i12 = i15 - iE;
                            i11 = tVar.f44436e;
                            if (i12 < i11) {
                                i12 = i11;
                            }
                        } else {
                            int i19 = iE + i15;
                            i11 = tVar.f44436e;
                            if (i19 > i11) {
                                i12 = i11;
                            } else {
                                i12 = i19;
                            }
                        }
                        sVar.f(i12, 0);
                    }
                    Object objE = b0.e.e(CropImageView.DEFAULT_ASPECT_RATIO, sVar.b(i15) + f11, mVar, new k9.p(22, new kotlin.jvm.internal.v(), sVar), this, 4);
                    if (objE != aVar2) {
                        objE = b0Var2;
                    }
                    if (objE == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o0.t tVar, int i11, float f5, b0.m mVar, vy.d dVar) {
        super(2, dVar);
        this.f27521f = tVar;
        this.f27518c = i11;
        this.f27519d = f5;
        this.f27522t = mVar;
    }
}
