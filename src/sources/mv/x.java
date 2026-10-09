package mv;

import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.Bookmark;
import com.lingodeer.syllable_ko.model.KOSyllableLesson;
import fr.o0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kv.s0;
import n9.e1;
import rt.fb;
import rt.ja;
import rt.ka;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f42287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f42288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f42289d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj, vy.d dVar, int i11) {
        super(3, dVar);
        this.f42286a = i11;
        this.f42289d = obj;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f42286a) {
            case 0:
                x xVar = new x((y) this.f42289d, (vy.d) obj3, 0);
                xVar.f42287b = (List) obj;
                xVar.f42288c = (fb) obj2;
                return xVar.invokeSuspend(qy.b0.f48488a);
            case 1:
                x xVar2 = new x((n0) this.f42289d, (vy.d) obj3, 1);
                xVar2.f42287b = (lv.a) obj;
                xVar2.f42288c = (kv.h0) obj2;
                return xVar2.invokeSuspend(qy.b0.f48488a);
            case 2:
                x xVar3 = new x((n9.y) this.f42289d, (vy.d) obj3, 2);
                xVar3.f42287b = (n9.n) obj;
                xVar3.f42288c = (n9.n) obj2;
                return xVar3.invokeSuspend(qy.b0.f48488a);
            case 3:
                x xVar4 = new x((mh.b) this.f42289d, (vy.d) obj3, 3);
                xVar4.f42287b = (e1) obj;
                xVar4.f42288c = (Map) obj2;
                return xVar4.invokeSuspend(qy.b0.f48488a);
            case 4:
                x xVar5 = new x((mh.b) this.f42289d, (vy.d) obj3, 4);
                xVar5.f42288c = (e1) obj;
                xVar5.f42287b = (List) obj2;
                return xVar5.invokeSuspend(qy.b0.f48488a);
            case 5:
                x xVar6 = new x((ja) this.f42289d, (vy.d) obj3, 5);
                xVar6.f42287b = (Bookmark) obj;
                xVar6.f42288c = (Map) obj2;
                return xVar6.invokeSuspend(qy.b0.f48488a);
            default:
                x xVar7 = new x((n0) this.f42289d, (vy.d) obj3, 6);
                xVar7.f42287b = (rv.a) obj;
                xVar7.f42288c = (sv.e) obj2;
                return xVar7.invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0182  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        String currentEnteredJPSyllableLessonKey;
        kv.j0 j0Var;
        String currentEnteredKOSyllableLessonKey;
        KOSyllableLesson kOSyllableLesson;
        int i11 = this.f42286a;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i12 = 0;
        zBooleanValue = false;
        boolean zBooleanValue = false;
        boolean zC = false;
        Object obj2 = this.f42289d;
        int i13 = 1;
        switch (i11) {
            case 0:
                List list = (List) this.f42287b;
                fb fbVar = (fb) this.f42288c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return list.isEmpty() ? s.f42273a : new t(((y) obj2).f42293d, list, fbVar);
            case 1:
                n0 n0Var = (n0) obj2;
                lv.a aVar2 = (lv.a) this.f42287b;
                kv.h0 h0Var = (kv.h0) this.f42288c;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ArrayList arrayList = aVar2.f40333b;
                int i14 = aVar2.f40332a;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj3 = arrayList.get(i15);
                    i15++;
                    if (((kv.j0) obj3).f38767h == s0.HIRAGANA) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj4 = arrayList.get(i16);
                    i16++;
                    if (((kv.j0) obj4).f38767h == s0.KATAKANA) {
                        arrayList3.add(obj4);
                    }
                }
                Env env = ((o0) n0Var).f27733a;
                boolean z11 = env.isFirstTimeEnterJPSyllable && i14 <= 1;
                ArrayList arrayList4 = new ArrayList();
                int size3 = arrayList.size();
                while (i12 < size3) {
                    Object obj5 = arrayList.get(i12);
                    i12++;
                    if (((kv.j0) obj5).f38767h == s0.HANDWRITING) {
                        arrayList4.add(obj5);
                    }
                }
                if (h0Var == null || (j0Var = h0Var.f38746a) == null) {
                    currentEnteredJPSyllableLessonKey = env.currentEnteredJPSyllableLessonKey;
                    kotlin.jvm.internal.m.e(currentEnteredJPSyllableLessonKey, "currentEnteredJPSyllableLessonKey");
                } else {
                    kv.j0 j0Var2 = j0Var.f38768i ? null : j0Var;
                    if (j0Var2 == null || (currentEnteredJPSyllableLessonKey = com.bumptech.glide.d.f(j0Var2)) == null) {
                        currentEnteredJPSyllableLessonKey = env.currentEnteredJPSyllableLessonKey;
                        kotlin.jvm.internal.m.e(currentEnteredJPSyllableLessonKey, "currentEnteredJPSyllableLessonKey");
                    }
                }
                return new d0(z11, arrayList2, arrayList3, arrayList4, h0Var, currentEnteredJPSyllableLessonKey, ob.f.g(s0.HIRAGANA, i14, arrayList), ob.f.g(s0.KATAKANA, i14, arrayList));
            case 2:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                n9.n previous = (n9.n) this.f42287b;
                n9.n nVar = (n9.n) this.f42288c;
                n9.y loadType = (n9.y) obj2;
                kotlin.jvm.internal.m.f(nVar, "<this>");
                kotlin.jvm.internal.m.f(previous, "previous");
                kotlin.jvm.internal.m.f(loadType, "loadType");
                int i17 = nVar.f43646a;
                int i18 = previous.f43646a;
                if (i17 > i18) {
                    zC = true;
                } else if (i17 >= i18) {
                    zC = n9.m.c(nVar.f43647b, previous.f43647b, loadType);
                }
                return zC ? nVar : previous;
            case 3:
                e1 e1Var = (e1) this.f42287b;
                Map map = (Map) this.f42288c;
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (map.isEmpty()) {
                    return e1Var;
                }
                map.size();
                return n9.m.b(e1Var, new ph.c(map, objArr == true ? 1 : 0, i13));
            case 4:
                e1 e1Var2 = (e1) this.f42288c;
                List list2 = (List) this.f42287b;
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (list2.isEmpty()) {
                    return e1Var2;
                }
                list2.size();
                return n9.m.b(e1Var2, new ph.d(list2, objArr2 == true ? 1 : 0, i13));
            case 5:
                Bookmark bookmark = (Bookmark) this.f42287b;
                Map map2 = (Map) this.f42288c;
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Boolean bool = (Boolean) map2.get(((ja) obj2).f49927a);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else if (bookmark != null && bookmark.isFav() == 1) {
                    zBooleanValue = true;
                }
                return new ka(true, zBooleanValue);
            default:
                rv.a aVar8 = (rv.a) this.f42287b;
                sv.e eVar = (sv.e) this.f42288c;
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env2 = ((o0) ((n0) obj2)).f27733a;
                boolean z12 = env2.isFirstEnterKOAlphabet && aVar8.f50806a <= 1;
                ArrayList arrayList5 = aVar8.f50807b;
                ArrayList arrayList6 = aVar8.f50808c;
                if (eVar == null || (kOSyllableLesson = eVar.f51801a) == null || (currentEnteredKOSyllableLessonKey = com.bumptech.glide.e.h(kOSyllableLesson)) == null) {
                    currentEnteredKOSyllableLessonKey = env2.currentEnteredKOSyllableLessonKey;
                    kotlin.jvm.internal.m.e(currentEnteredKOSyllableLessonKey, "currentEnteredKOSyllableLessonKey");
                }
                return new sv.h(z12, arrayList5, arrayList6, eVar, currentEnteredKOSyllableLessonKey);
        }
    }
}
