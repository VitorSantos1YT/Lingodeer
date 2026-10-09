package js;

import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import fr.j3;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import rt.oc;
import rz.e0;
import wt.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public oc f36809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f36810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ LinkedHashMap f36812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ boolean f36813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vt.c f36814f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f36815t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(vt.c cVar, r rVar, vy.d dVar) {
        super(3, dVar);
        this.f36814f = cVar;
        this.f36815t = rVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        p pVar = new p(this.f36814f, this.f36815t, (vy.d) obj3);
        pVar.f36812d = (LinkedHashMap) obj;
        pVar.f36813e = zBooleanValue;
        return pVar.invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        oc ocVar;
        List list;
        Object objA;
        List list2;
        oc ocVar2;
        LinkedHashMap linkedHashMap = this.f36812d;
        boolean z11 = this.f36813e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f36811c;
        r rVar = this.f36815t;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            this.f36812d = linkedHashMap;
            this.f36813e = z11;
            this.f36811c = 1;
            ((vt.d) this.f36814f).l(this);
            if (qy.b0.f48488a != aVar) {
            }
            return aVar;
        }
        if (i11 == 1) {
            com.bumptech.glide.e.F(obj);
        } else {
            if (i11 == 2) {
                ocVar = this.f36809a;
                com.bumptech.glide.e.F(obj);
                list = (List) obj;
                o0 o0Var = rVar.f36823n0;
                CoursePracticeType coursePracticeType = CoursePracticeType.SYLLABLE;
                int size = linkedHashMap.size();
                float f5 = ocVar.f50216d;
                this.f36812d = null;
                this.f36809a = ocVar;
                this.f36810b = list;
                this.f36813e = z11;
                this.f36811c = 3;
                objA = o0Var.a(coursePracticeType, size, f5, this);
                if (objA != aVar) {
                    list2 = list;
                    obj = objA;
                    ocVar2 = ocVar;
                }
                return aVar;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list3 = this.f36810b;
            ocVar2 = this.f36809a;
            com.bumptech.glide.e.F(obj);
            list2 = list3;
        }
        int iIntValue = ((Number) obj).intValue();
        int i12 = ocVar2.f50215c;
        ry.r rVar2 = ry.r.f50854a;
        return new CourseTestFinishSummaryUiState.Success(z11, iIntValue, i12, false, list2, rVar2, rVar2, null, 128, null);
        oc ocVarG = j3.g(0, linkedHashMap.size(), linkedHashMap);
        LinkedHashMap linkedHashMapH = j3.h(linkedHashMap, ry.t.f50856a);
        Set setKeySet = linkedHashMapH.keySet();
        yz.f fVar = rz.o0.f50940a;
        yz.e eVar = yz.e.f58387a;
        o oVar = new o(setKeySet, rVar, linkedHashMapH, null);
        this.f36812d = linkedHashMap;
        this.f36809a = ocVarG;
        this.f36813e = z11;
        this.f36811c = 2;
        Object objM = e0.M(eVar, oVar, this);
        if (objM != aVar) {
            ocVar = ocVarG;
            obj = objM;
            list = (List) obj;
            o0 o0Var2 = rVar.f36823n0;
            CoursePracticeType coursePracticeType2 = CoursePracticeType.SYLLABLE;
            int size2 = linkedHashMap.size();
            float f11 = ocVar.f50216d;
            this.f36812d = null;
            this.f36809a = ocVar;
            this.f36810b = list;
            this.f36813e = z11;
            this.f36811c = 3;
            objA = o0Var2.a(coursePracticeType2, size2, f11, this);
            if (objA != aVar) {
                list2 = list;
                obj = objA;
                ocVar2 = ocVar;
                int iIntValue2 = ((Number) obj).intValue();
                int i13 = ocVar2.f50215c;
                ry.r rVar3 = ry.r.f50854a;
                return new CourseTestFinishSummaryUiState.Success(z11, iIntValue2, i13, false, list2, rVar3, rVar3, null, 128, null);
            }
        }
        return aVar;
    }
}
