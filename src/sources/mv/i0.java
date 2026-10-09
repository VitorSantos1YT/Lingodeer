package mv;

import bh.a1;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import fr.o0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kv.s0;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends xy.i implements fz.f {
    public final /* synthetic */ k0 H;
    public final /* synthetic */ n0 K;
    public final /* synthetic */ vt.c L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set f42216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set f42217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f42218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ LinkedHashMap f42221f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ boolean f42222t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, n0 n0Var, vt.c cVar, vy.d dVar) {
        super(3, dVar);
        this.H = k0Var;
        this.K = n0Var;
        this.L = cVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        n0 n0Var = this.K;
        vt.c cVar = this.L;
        i0 i0Var = new i0(this.H, n0Var, cVar, (vy.d) obj3);
        i0Var.f42221f = (LinkedHashMap) obj;
        i0Var.f42222t = zBooleanValue;
        return i0Var.invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x010e  */
    /* JADX WARN: Code duplicated, block: B:40:0x011e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0120  */
    /* JADX WARN: Code duplicated, block: B:45:0x0149  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c6 A[SYNTHETIC] */
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
        int size2;
        Object objB;
        List list2;
        int i11;
        LinkedHashMap linkedHashMap3 = this.f42221f;
        boolean z11 = this.f42222t;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = this.f42220e;
        k0 k0Var = this.H;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            kv.i0 i0Var = k0Var.f42233p0;
            if (i0Var.f38755h != s0.HANDWRITING) {
                vt.k0 k0Var2 = k0Var.f42232o0;
                int i13 = ((o0) this.K).f27733a.keyLanguage;
                int i14 = i0Var.f38749b + 1;
                this.f42221f = linkedHashMap3;
                this.f42222t = z11;
                this.f42220e = 1;
                if (((a1) k0Var2).k(i13, i14, this) != aVar) {
                    this.f42221f = linkedHashMap3;
                    this.f42222t = z11;
                    this.f42220e = 2;
                    ((vt.d) this.L).l(this);
                    if (qy.b0.f48488a != aVar) {
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
                        h0 h0Var = new h0(linkedHashMap3, k0Var, setKeySet, null);
                        this.f42221f = linkedHashMap3;
                        this.f42216a = setKeySet;
                        this.f42217b = setKeySet2;
                        this.f42222t = z11;
                        this.f42220e = 3;
                        objM = rz.e0.M(eVar, h0Var, this);
                        if (objM != aVar) {
                            set = setKeySet;
                            obj = objM;
                            list = (List) obj;
                            size = setKeySet2.size() + set.size();
                            if (size == 0) {
                                size2 = 0;
                            } else {
                                size2 = (int) ((setKeySet2.size() / size) * 100);
                            }
                            wt.o0 o0Var = k0Var.f42231n0;
                            CoursePracticeType coursePracticeType = CoursePracticeType.SYLLABLE;
                            int size3 = linkedHashMap3.size();
                            this.f42221f = null;
                            this.f42216a = null;
                            this.f42217b = null;
                            this.f42218c = list;
                            this.f42222t = z11;
                            this.f42219d = size2;
                            this.f42220e = 4;
                            objB = wt.o0.b(o0Var, coursePracticeType, size3, this, 4);
                            if (objB != aVar) {
                                list2 = list;
                                obj = objB;
                                i11 = size2;
                                int iIntValue = ((Number) obj).intValue();
                                ry.r rVar = ry.r.f50854a;
                                return new CourseTestFinishSummaryUiState.Success(z11, iIntValue, i11, false, list2, rVar, rVar, null, 128, null);
                            }
                        }
                    }
                }
            } else {
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
                h0 h0Var2 = new h0(linkedHashMap3, k0Var, setKeySet, null);
                this.f42221f = linkedHashMap3;
                this.f42216a = setKeySet;
                this.f42217b = setKeySet2;
                this.f42222t = z11;
                this.f42220e = 3;
                objM = rz.e0.M(eVar2, h0Var2, this);
                if (objM != aVar) {
                    set = setKeySet;
                    obj = objM;
                    list = (List) obj;
                    size = setKeySet2.size() + set.size();
                    if (size == 0) {
                        size2 = 0;
                    } else {
                        size2 = (int) ((setKeySet2.size() / size) * 100);
                    }
                    wt.o0 o0Var2 = k0Var.f42231n0;
                    CoursePracticeType coursePracticeType2 = CoursePracticeType.SYLLABLE;
                    int size4 = linkedHashMap3.size();
                    this.f42221f = null;
                    this.f42216a = null;
                    this.f42217b = null;
                    this.f42218c = list;
                    this.f42222t = z11;
                    this.f42219d = size2;
                    this.f42220e = 4;
                    objB = wt.o0.b(o0Var2, coursePracticeType2, size4, this, 4);
                    if (objB != aVar) {
                        list2 = list;
                        obj = objB;
                        i11 = size2;
                        int iIntValue2 = ((Number) obj).intValue();
                        ry.r rVar2 = ry.r.f50854a;
                        return new CourseTestFinishSummaryUiState.Success(z11, iIntValue2, i11, false, list2, rVar2, rVar2, null, 128, null);
                    }
                }
            }
            return aVar;
        }
        if (i12 == 1) {
            com.bumptech.glide.e.F(obj);
            this.f42221f = linkedHashMap3;
            this.f42222t = z11;
            this.f42220e = 2;
            ((vt.d) this.L).l(this);
            if (qy.b0.f48488a != aVar) {
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
                yz.f fVar3 = rz.o0.f50940a;
                yz.e eVar3 = yz.e.f58387a;
                h0 h0Var3 = new h0(linkedHashMap3, k0Var, setKeySet, null);
                this.f42221f = linkedHashMap3;
                this.f42216a = setKeySet;
                this.f42217b = setKeySet2;
                this.f42222t = z11;
                this.f42220e = 3;
                objM = rz.e0.M(eVar3, h0Var3, this);
                if (objM != aVar) {
                    set = setKeySet;
                    obj = objM;
                    list = (List) obj;
                    size = setKeySet2.size() + set.size();
                    if (size == 0) {
                        size2 = 0;
                    } else {
                        size2 = (int) ((setKeySet2.size() / size) * 100);
                    }
                    wt.o0 o0Var3 = k0Var.f42231n0;
                    CoursePracticeType coursePracticeType3 = CoursePracticeType.SYLLABLE;
                    int size5 = linkedHashMap3.size();
                    this.f42221f = null;
                    this.f42216a = null;
                    this.f42217b = null;
                    this.f42218c = list;
                    this.f42222t = z11;
                    this.f42219d = size2;
                    this.f42220e = 4;
                    objB = wt.o0.b(o0Var3, coursePracticeType3, size5, this, 4);
                    if (objB != aVar) {
                        list2 = list;
                        obj = objB;
                        i11 = size2;
                    }
                }
            }
            return aVar;
        }
        if (i12 == 2) {
            com.bumptech.glide.e.F(obj);
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
            yz.f fVar4 = rz.o0.f50940a;
            yz.e eVar4 = yz.e.f58387a;
            h0 h0Var4 = new h0(linkedHashMap3, k0Var, setKeySet, null);
            this.f42221f = linkedHashMap3;
            this.f42216a = setKeySet;
            this.f42217b = setKeySet2;
            this.f42222t = z11;
            this.f42220e = 3;
            objM = rz.e0.M(eVar4, h0Var4, this);
            if (objM != aVar) {
                set = setKeySet;
                obj = objM;
                list = (List) obj;
                size = setKeySet2.size() + set.size();
                if (size == 0) {
                    size2 = 0;
                } else {
                    size2 = (int) ((setKeySet2.size() / size) * 100);
                }
                wt.o0 o0Var4 = k0Var.f42231n0;
                CoursePracticeType coursePracticeType4 = CoursePracticeType.SYLLABLE;
                int size6 = linkedHashMap3.size();
                this.f42221f = null;
                this.f42216a = null;
                this.f42217b = null;
                this.f42218c = list;
                this.f42222t = z11;
                this.f42219d = size2;
                this.f42220e = 4;
                objB = wt.o0.b(o0Var4, coursePracticeType4, size6, this, 4);
                if (objB != aVar) {
                    list2 = list;
                    obj = objB;
                    i11 = size2;
                }
            }
            return aVar;
        }
        if (i12 == 3) {
            setKeySet2 = this.f42217b;
            set = this.f42216a;
            com.bumptech.glide.e.F(obj);
            list = (List) obj;
            size = setKeySet2.size() + set.size();
            if (size == 0) {
                size2 = 0;
            } else {
                size2 = (int) ((setKeySet2.size() / size) * 100);
            }
            wt.o0 o0Var5 = k0Var.f42231n0;
            CoursePracticeType coursePracticeType5 = CoursePracticeType.SYLLABLE;
            int size7 = linkedHashMap3.size();
            this.f42221f = null;
            this.f42216a = null;
            this.f42217b = null;
            this.f42218c = list;
            this.f42222t = z11;
            this.f42219d = size2;
            this.f42220e = 4;
            objB = wt.o0.b(o0Var5, coursePracticeType5, size7, this, 4);
            if (objB != aVar) {
                list2 = list;
                obj = objB;
                i11 = size2;
            }
            return aVar;
        }
        if (i12 != 4) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i15 = this.f42219d;
        List list3 = this.f42218c;
        Set set2 = this.f42217b;
        Set set3 = this.f42216a;
        com.bumptech.glide.e.F(obj);
        i11 = i15;
        list2 = list3;
        int iIntValue3 = ((Number) obj).intValue();
        ry.r rVar3 = ry.r.f50854a;
        return new CourseTestFinishSummaryUiState.Success(z11, iIntValue3, i11, false, list2, rVar3, rVar3, null, 128, null);
    }
}
