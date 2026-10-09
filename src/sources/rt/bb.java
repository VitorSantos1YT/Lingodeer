package rt;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class bb extends ViewModel {
    public final CoursePracticeType H;
    public final uz.i1 K;
    public final uz.i1 L;
    public boolean M;
    public final uz.i1 N;
    public final uz.i1 O;
    public final uz.r0 P;
    public final uz.r0 Q;
    public final qy.q R;
    public final uz.r0 S;
    public final uz.r0 T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ot.z f49536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.k0 f49537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.n0 f49538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.o0 f49539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ot.i0 f49540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f49541f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f49542t;

    public bb(ot.z zVar, vt.k0 k0Var, vt.n0 n0Var, wt.o0 o0Var, ot.i0 i0Var, long j11, long j12, CoursePracticeType coursePracticeType) {
        this.f49536a = zVar;
        this.f49537b = k0Var;
        this.f49538c = n0Var;
        this.f49539d = o0Var;
        this.f49540e = i0Var;
        this.f49541f = j11;
        this.f49542t = j12;
        this.H = coursePracticeType;
        uz.i1 i1VarC = uz.x0.c(eb.f49693a);
        this.K = i1VarC;
        ry.r rVar = ry.r.f50854a;
        uz.i1 i1VarC2 = uz.x0.c(rVar);
        this.L = i1VarC2;
        uz.i1 i1VarC3 = uz.x0.c(0L);
        this.N = i1VarC3;
        uz.i1 i1VarC4 = uz.x0.c(new qa(rVar, rVar, 0, false));
        this.O = i1VarC4;
        this.P = new uz.r0(i1VarC3);
        this.Q = new uz.r0(i1VarC4);
        this.R = com.bumptech.glide.d.v(new m9(3));
        vy.d dVar = null;
        no.g gVar = new no.g(new gp.r(new h(this, dVar, 9)), i1VarC, new dt.x(this, dVar, 18));
        yz.f fVar = rz.o0.f50940a;
        this.S = uz.x0.A(uz.x0.w(gVar, yz.e.f58387a), ViewModelKt.getViewModelScope(this), uz.a1.a(2), new ra(CropImageView.DEFAULT_ASPECT_RATIO));
        this.T = uz.x0.A(new no.g(i1VarC2, o0Var.f55339f, new ab(this, null)), ViewModelKt.getViewModelScope(this), uz.a1.a(2), CourseTestFinishSummaryUiState.Loading.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(bb bbVar, List list, xy.c cVar) {
        va vaVar;
        ArrayList arrayListO;
        List list2;
        Object objM;
        ArrayList arrayList;
        List list3;
        if (cVar instanceof va) {
            vaVar = (va) cVar;
            int i11 = vaVar.f50545f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                vaVar.f50545f = i11 - Integer.MIN_VALUE;
            } else {
                vaVar = new va(bbVar, cVar);
            }
        } else {
            vaVar = new va(bbVar, cVar);
        }
        Object obj = vaVar.f50543d;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = vaVar.f50545f;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i12 != 0) {
            if (i12 == 1) {
                arrayListO = vaVar.f50542c;
                ArrayList arrayList2 = vaVar.f50541b;
                List list4 = vaVar.f50540a;
                com.bumptech.glide.e.F(obj);
                objM = obj;
                list2 = list4;
                arrayList = arrayList2;
            } else {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                list3 = vaVar.f50540a;
                com.bumptech.glide.e.F(obj);
            }
            vaVar.f50540a = null;
            vaVar.f50541b = null;
            vaVar.f50545f = 3;
            if (bbVar.b(list3, vaVar) == obj2) {
                return obj2;
            }
            return b0Var;
        }
        arrayListO = ep.a.o(obj);
        long j11 = bbVar.f49541f;
        if (j11 != -1) {
            ot.i0 i0Var = bbVar.f49540e;
            int i13 = ((fr.o0) bbVar.f49538c).f27733a.keyLanguage;
            list2 = list;
            vaVar.f50540a = list2;
            vaVar.f50541b = arrayListO;
            vaVar.f50542c = arrayListO;
            vaVar.f50545f = 1;
            i0Var.getClass();
            yz.f fVar = rz.o0.f50940a;
            objM = rz.e0.M(yz.e.f58387a, new ot.h0(i0Var, true, j11, i13, null), vaVar);
            if (objM != obj2) {
                arrayList = arrayListO;
            }
        } else {
            list2 = list;
            if (arrayListO.size() == 0) {
                uz.i1 i1Var = bbVar.K;
                db dbVar = new db(CropImageView.DEFAULT_ASPECT_RATIO);
                i1Var.getClass();
                i1Var.l(null, dbVar);
                ((fv.c) bbVar.R.getValue()).c(arrayListO, new xa(arrayListO, bbVar, arrayListO.size(), list2), false);
                return b0Var;
            }
            vaVar.f50540a = list2;
            vaVar.f50541b = null;
            vaVar.f50542c = null;
            vaVar.f50545f = 2;
            if (rz.e0.m(600L, vaVar) != obj2) {
                list3 = list2;
                vaVar.f50540a = null;
                vaVar.f50541b = null;
                vaVar.f50545f = 3;
                if (bbVar.b(list3, vaVar) == obj2) {
                    return b0Var;
                }
            }
        }
        return obj2;
        arrayListO.addAll((Collection) objM);
        arrayListO = arrayList;
        if (arrayListO.size() == 0) {
            uz.i1 i1Var2 = bbVar.K;
            db dbVar2 = new db(CropImageView.DEFAULT_ASPECT_RATIO);
            i1Var2.getClass();
            i1Var2.l(null, dbVar2);
            ((fv.c) bbVar.R.getValue()).c(arrayListO, new xa(arrayListO, bbVar, arrayListO.size(), list2), false);
            return b0Var;
        }
        vaVar.f50540a = list2;
        vaVar.f50541b = null;
        vaVar.f50542c = null;
        vaVar.f50545f = 2;
        if (rz.e0.m(600L, vaVar) != obj2) {
            list3 = list2;
            vaVar.f50540a = null;
            vaVar.f50541b = null;
            vaVar.f50545f = 3;
            if (bbVar.b(list3, vaVar) == obj2) {
                return b0Var;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(List list, xy.c cVar) {
        ua uaVar;
        if (cVar instanceof ua) {
            uaVar = (ua) cVar;
            int i11 = uaVar.f50493c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                uaVar.f50493c = i11 - Integer.MIN_VALUE;
            } else {
                uaVar = new ua(this, cVar);
            }
        } else {
            uaVar = new ua(this, cVar);
        }
        Object objM = uaVar.f50491a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = uaVar.f50493c;
        vy.d dVar = null;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objM);
            yz.f fVar = rz.o0.f50940a;
            yz.e eVar = yz.e.f58387a;
            nu.b bVar = new nu.b(7, list, this, dVar);
            uaVar.f50493c = 1;
            objM = rz.e0.M(eVar, bVar, uaVar);
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objM);
        }
        List list2 = (List) objM;
        db dbVar = new db(CropImageView.DEFAULT_ASPECT_RATIO);
        uz.i1 i1Var = this.K;
        i1Var.getClass();
        i1Var.l(null, dbVar);
        int size = list2.size();
        qy.b0 b0Var = qy.b0.f48488a;
        if (size == 0) {
            i1Var.getClass();
            i1Var.l(null, cb.f49585a);
            return b0Var;
        }
        ((fv.c) this.R.getValue()).c(list2, new gn.d(list2, list2.size(), 3, this), false);
        return b0Var;
    }

    public final void c(pa paVar) {
        vy.d dVar = null;
        if (paVar.equals(na.f50145a)) {
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new ya(this, dVar, 0), 3);
        } else {
            if (!paVar.equals(oa.f50210a)) {
                throw new NoWhenBranchMatchedException();
            }
            rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new ya(this, dVar, 1), 3);
        }
    }
}
