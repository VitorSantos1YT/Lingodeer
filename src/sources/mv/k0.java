package mv;

import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import com.yalantis.ucrop.view.CropImageView;
import iv.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ot.a2;
import ot.b1;
import ot.c1;
import ot.g1;
import ot.j1;
import ot.u1;
import ot.x1;
import ot.z0;
import ot.z1;
import rt.pc;
import rt.t9;
import rt.y9;
import uz.a1;
import uz.i1;
import uz.r0;
import uz.x0;
import vt.n0;
import wt.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends y9 {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final o0 f42231n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final vt.k0 f42232o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final kv.i0 f42233p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f42234q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final LinkedHashMap f42235r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ArrayList f42236s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final LinkedHashMap f42237t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final r0 f42238u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final r0 f42239v0;

    public k0(n0 n0Var, o0 o0Var, wt.m mVar, vt.k0 k0Var, vt.c cVar, vt.e eVar, fv.c cVar2, kv.i0 i0Var, boolean z11) {
        super(n0Var, cVar, eVar, null, null, null);
        this.f42231n0 = o0Var;
        this.f42232o0 = k0Var;
        this.f42233p0 = i0Var;
        this.f42234q0 = z11;
        this.f42235r0 = new LinkedHashMap();
        this.f42236s0 = new ArrayList();
        this.f42237t0 = new LinkedHashMap();
        uz.m0 m0VarJ = x0.j(new gp.r(new jr.i0(9, i0Var, mVar, (vy.d) null)), this.W, this.f50706c0, new j0(this, cVar2, null));
        yz.e eVar2 = yz.e.f58387a;
        this.f42238u0 = x0.A(x0.w(m0VarJ, eVar2), ViewModelKt.getViewModelScope(this), a1.a(2), new pc(CropImageView.DEFAULT_ASPECT_RATIO));
        this.f42239v0 = x0.A(x0.w(new no.g(l1.t.K(new e1(this, 3)), o0Var.f55339f, new i0(this, n0Var, cVar, null)), eVar2), ViewModelKt.getViewModelScope(this), a1.a(2), CourseTestFinishSummaryUiState.Loading.INSTANCE);
    }

    @Override // rt.y9
    public final Object A(int i11, long j11, int i12, boolean z11, boolean z12, long j12, boolean z13, vy.d dVar) {
        if (!z11) {
            I(j11, z13);
        }
        return qy.b0.f48488a;
    }

    @Override // rt.y9
    public final void B(int i11, long j11, boolean z11) {
        I(j11, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // rt.y9
    public final Object C(j1 j1Var, t9 t9Var) {
        i1 i1Var;
        Object value;
        ArrayList arrayListC1;
        ht.o oVarA = ht.o.a(j1Var.a(), 2, 0L, false, false, false, false, false, false, false, false, false, false, null, 458747);
        Object e1Var = null;
        if (j1Var instanceof c1) {
            u1 u1Var = ((c1) j1Var).f45766b;
            List list = u1Var.f46013b;
            if (list != null && list.isEmpty()) {
                e1Var = new b1(oVarA, u1Var);
                break;
            }
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    e1Var = new b1(oVarA, u1Var);
                    break;
                }
            } while (!oz.q.K0(((CourseWord) it.next()).getWord()));
        } else if (j1Var instanceof z0) {
            u1 u1Var2 = ((z0) j1Var).f46062b;
            List list2 = u1Var2.f46013b;
            if (list2 != null && list2.isEmpty()) {
                e1Var = new b1(oVarA, u1Var2);
                break;
            }
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    e1Var = new b1(oVarA, u1Var2);
                    break;
                }
            } while (!oz.q.K0(((CourseWord) it2.next()).getWord()));
        } else if (j1Var instanceof g1) {
            g1 g1Var = (g1) j1Var;
            z1 z1Var = g1Var.f45826b;
            if (z1Var.f46065c == a2.AudioWord) {
                List<CourseWord> list3 = z1Var.f46063a;
                ArrayList arrayList = new ArrayList(ry.n.W(list3, 10));
                for (CourseWord courseWord : list3) {
                    String luoMa = courseWord.getLuoMa();
                    if (oz.q.K0(luoMa)) {
                        luoMa = null;
                    }
                    if (luoMa == null) {
                        luoMa = courseWord.getZhuYin();
                    }
                    arrayList.add(CourseWord.copy$default(courseWord, 0L, luoMa, null, null, courseWord.getWord(), null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -19, 63, null));
                }
                List<CourseWord> list4 = z1Var.f46064b;
                ArrayList arrayList2 = new ArrayList(ry.n.W(list4, 10));
                for (CourseWord courseWord2 : list4) {
                    arrayList2.add(CourseWord.copy$default(courseWord2, 0L, null, null, null, courseWord2.getWord(), null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -17, 63, null));
                }
                ht.o oVarA2 = ht.o.a(g1Var.f45825a, 0, 0L, false, false, false, false, false, false, false, false, false, false, null, 458751);
                a2 matchType = a2.WordTranslation;
                kotlin.jvm.internal.m.f(matchType, "matchType");
                e1Var = new g1(oVarA2, new z1(arrayList, arrayList2, matchType));
            }
        } else if (j1Var instanceof ot.e1) {
            ot.e1 e1Var2 = (ot.e1) j1Var;
            x1 x1Var = e1Var2.f45799b;
            CourseWord courseWord3 = x1Var.f46042a;
            if (e1Var2.f45798a.f33770s == ht.r.M5 && courseWord3.getSoundChangePronunciation().length() == 0) {
                ht.o oVarA3 = ht.o.a(e1Var2.f45798a, 10, 0L, false, false, false, false, false, false, false, false, false, false, ht.r.M10, 196603);
                String luoMa2 = courseWord3.getLuoMa();
                e1Var = oz.q.K0(luoMa2) ? null : luoMa2;
                if (e1Var == null) {
                    e1Var = courseWord3.getZhuYin();
                }
                e1Var = new ot.e1(oVarA3, x1.a(x1Var, CourseWord.copy$default(courseWord3, 0L, null, null, null, e1Var, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -17, 63, null)));
            }
        }
        if (e1Var == null) {
            e1Var = (j1) this.f42237t0.get(new Long(j1Var.a().f33754b));
        }
        if (e1Var != null) {
            do {
                i1Var = this.V;
                value = i1Var.getValue();
                List list5 = (List) value;
                arrayListC1 = ry.m.c1(list5);
                i1 i1Var2 = this.W;
                if (((Number) i1Var2.getValue()).intValue() + 1 < list5.size()) {
                    arrayListC1.add(((Number) i1Var2.getValue()).intValue() + 1, e1Var);
                } else {
                    arrayListC1.add(e1Var);
                }
            } while (!i1Var.j(value, arrayListC1));
        }
        return qy.b0.f48488a;
    }

    public final void I(long j11, boolean z11) {
        Long lValueOf = Long.valueOf(j11);
        Long lValueOf2 = Long.valueOf(j11);
        LinkedHashMap linkedHashMap = this.f42235r0;
        linkedHashMap.put(lValueOf, Boolean.valueOf(!kotlin.jvm.internal.m.a(linkedHashMap.get(lValueOf2), Boolean.FALSE) && z11));
    }
}
