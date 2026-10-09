package sv;

import bh.a1;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import fr.o0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import qy.b0;
import rz.e0;
import vt.k0;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends xy.i implements fz.f {
    public final /* synthetic */ o H;
    public final /* synthetic */ n0 K;
    public final /* synthetic */ vt.c L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set f51817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set f51818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f51819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ LinkedHashMap f51822f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ boolean f51823t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, n0 n0Var, vt.c cVar, vy.d dVar) {
        super(3, dVar);
        this.H = oVar;
        this.K = n0Var;
        this.L = cVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        n0 n0Var = this.K;
        vt.c cVar = this.L;
        m mVar = new m(this.H, n0Var, cVar, (vy.d) obj3);
        mVar.f51822f = (LinkedHashMap) obj;
        mVar.f51823t = zBooleanValue;
        return mVar.invokeSuspend(b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0093  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:35:0x010a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0141  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c2 A[SYNTHETIC] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        LinkedHashMap linkedHashMap;
        Set setKeySet;
        LinkedHashMap linkedHashMap2;
        Set setKeySet2;
        Object objM;
        Set set;
        List list;
        int size;
        Object objB;
        List list2;
        int i11;
        LinkedHashMap linkedHashMap3 = this.f51822f;
        boolean z11 = this.f51823t;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = this.f51821e;
        o oVar = this.H;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            k0 k0Var = oVar.f51830o0;
            int i13 = ((o0) this.K).f27733a.keyLanguage;
            int sortIndex = oVar.f51831p0.getSortIndex() + 1;
            this.f51822f = linkedHashMap3;
            this.f51823t = z11;
            this.f51821e = 1;
            if (((a1) k0Var).k(i13, sortIndex, this) != aVar) {
            }
            return aVar;
        }
        if (i12 == 1) {
            com.bumptech.glide.e.F(obj);
        } else {
            if (i12 == 2) {
                com.bumptech.glide.e.F(obj);
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap3.entrySet()) {
                    if (!((Boolean) entry.getValue()).booleanValue()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                setKeySet = linkedHashMap.keySet();
                linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                    if (((Boolean) entry2.getValue()).booleanValue()) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                setKeySet2 = linkedHashMap2.keySet();
                yz.f fVar = rz.o0.f50940a;
                yz.e eVar = yz.e.f58387a;
                l lVar = new l(linkedHashMap3, oVar, setKeySet, null);
                this.f51822f = linkedHashMap3;
                this.f51817a = setKeySet;
                this.f51818b = setKeySet2;
                this.f51823t = z11;
                this.f51821e = 3;
                objM = e0.M(eVar, lVar, this);
                if (objM != aVar) {
                    set = setKeySet;
                    obj = objM;
                    list = (List) obj;
                    size = (int) ((setKeySet2.size() / (setKeySet2.size() + set.size())) * 100);
                    wt.o0 o0Var = oVar.f51829n0;
                    CoursePracticeType coursePracticeType = CoursePracticeType.SYLLABLE;
                    int size2 = linkedHashMap3.size();
                    this.f51822f = null;
                    this.f51817a = null;
                    this.f51818b = null;
                    this.f51819c = list;
                    this.f51823t = z11;
                    this.f51820d = size;
                    this.f51821e = 4;
                    objB = wt.o0.b(o0Var, coursePracticeType, size2, this, 4);
                    if (objB != aVar) {
                        list2 = list;
                        obj = objB;
                        i11 = size;
                    }
                }
                return aVar;
            }
            if (i12 == 3) {
                setKeySet2 = this.f51818b;
                set = this.f51817a;
                com.bumptech.glide.e.F(obj);
                list = (List) obj;
                size = (int) ((setKeySet2.size() / (setKeySet2.size() + set.size())) * 100);
                wt.o0 o0Var2 = oVar.f51829n0;
                CoursePracticeType coursePracticeType2 = CoursePracticeType.SYLLABLE;
                int size3 = linkedHashMap3.size();
                this.f51822f = null;
                this.f51817a = null;
                this.f51818b = null;
                this.f51819c = list;
                this.f51823t = z11;
                this.f51820d = size;
                this.f51821e = 4;
                objB = wt.o0.b(o0Var2, coursePracticeType2, size3, this, 4);
                if (objB != aVar) {
                    list2 = list;
                    obj = objB;
                    i11 = size;
                }
                return aVar;
            }
            if (i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i14 = this.f51820d;
            List list3 = this.f51819c;
            Set set2 = this.f51818b;
            Set set3 = this.f51817a;
            com.bumptech.glide.e.F(obj);
            i11 = i14;
            list2 = list3;
        }
        int iIntValue = ((Number) obj).intValue();
        ry.r rVar = ry.r.f50854a;
        return new CourseTestFinishSummaryUiState.Success(z11, iIntValue, i11, false, list2, rVar, rVar, null, 128, null);
        this.f51822f = linkedHashMap3;
        this.f51823t = z11;
        this.f51821e = 2;
        ((vt.d) this.L).l(this);
        if (b0.f48488a != aVar) {
            linkedHashMap = new LinkedHashMap();
            while (r3.hasNext()) {
                if (!((Boolean) entry.getValue()).booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            setKeySet = linkedHashMap.keySet();
            linkedHashMap2 = new LinkedHashMap();
            while (r6.hasNext()) {
                if (((Boolean) entry2.getValue()).booleanValue()) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            setKeySet2 = linkedHashMap2.keySet();
            yz.f fVar2 = rz.o0.f50940a;
            yz.e eVar2 = yz.e.f58387a;
            l lVar2 = new l(linkedHashMap3, oVar, setKeySet, null);
            this.f51822f = linkedHashMap3;
            this.f51817a = setKeySet;
            this.f51818b = setKeySet2;
            this.f51823t = z11;
            this.f51821e = 3;
            objM = e0.M(eVar2, lVar2, this);
            if (objM != aVar) {
                set = setKeySet;
                obj = objM;
                list = (List) obj;
                size = (int) ((setKeySet2.size() / (setKeySet2.size() + set.size())) * 100);
                wt.o0 o0Var3 = oVar.f51829n0;
                CoursePracticeType coursePracticeType3 = CoursePracticeType.SYLLABLE;
                int size4 = linkedHashMap3.size();
                this.f51822f = null;
                this.f51817a = null;
                this.f51818b = null;
                this.f51819c = list;
                this.f51823t = z11;
                this.f51820d = size;
                this.f51821e = 4;
                objB = wt.o0.b(o0Var3, coursePracticeType3, size4, this, 4);
                if (objB != aVar) {
                    list2 = list;
                    obj = objB;
                    i11 = size;
                    int iIntValue2 = ((Number) obj).intValue();
                    ry.r rVar2 = ry.r.f50854a;
                    return new CourseTestFinishSummaryUiState.Success(z11, iIntValue2, i11, false, list2, rVar2, rVar2, null, 128, null);
                }
            }
        }
        return aVar;
    }
}
