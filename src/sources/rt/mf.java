package rt;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class mf extends ViewModel {
    public final rz.z1 H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ot.u2 f50100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ot.o2 f50101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ot.l2 f50102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uz.i1 f50103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uz.r0 f50104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f50105f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedHashSet f50106t;

    public mf(ot.u2 u2Var, ot.o2 o2Var, ot.l2 l2Var) {
        this.f50100a = u2Var;
        this.f50101b = o2Var;
        this.f50102c = l2Var;
        uz.i1 i1VarC = uz.x0.c(new jf(ry.r.f50854a, true, 0, CropImageView.DEFAULT_ASPECT_RATIO, false, null));
        this.f50103d = i1VarC;
        this.f50104e = new uz.r0(i1VarC);
        this.f50105f = new LinkedHashSet();
        this.f50106t = new LinkedHashSet();
        if (this.H != null) {
            return;
        }
        this.H = rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new mv.f0(this, null, 21), 3);
    }

    public static final void a(mf mfVar, long j11, float f5) {
        Object value;
        jf jfVar;
        ArrayList arrayList;
        uz.i1 i1Var = mfVar.f50103d;
        do {
            value = i1Var.getValue();
            jfVar = (jf) value;
            List<ps.b> list = jfVar.f49948a;
            arrayList = new ArrayList(ry.n.W(list, 10));
            for (ps.b bVarA : list) {
                if (bVarA.f47122a == j11) {
                    bVarA = ps.b.a(bVarA, null, f5, false, 447);
                }
                arrayList.add(bVarA);
            }
        } while (!i1Var.j(value, jf.a(jfVar, arrayList, 0, CropImageView.DEFAULT_ASPECT_RATIO, false, null, 126)));
    }

    public final void b(long j11) {
        Object next;
        ps.h gVar;
        Iterator it = ((jf) this.f50103d.getValue()).f49948a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ps.b) next).f47122a != j11);
        ps.b bVar = (ps.b) next;
        if (bVar == null) {
            return;
        }
        float fK = hz.b.k(bVar.f47128g, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        if (fK >= 1.0f) {
            gVar = ps.d.f47131a;
        } else {
            gVar = fK > CropImageView.DEFAULT_ASPECT_RATIO ? new ps.g(fK) : ps.f.f47133a;
        }
        c(j11, gVar, fK);
    }

    public final void c(long j11, ps.h hVar, float f5) {
        uz.i1 i1Var;
        Object value;
        jf jfVar;
        ArrayList arrayList;
        do {
            i1Var = this.f50103d;
            value = i1Var.getValue();
            jfVar = (jf) value;
            List<ps.b> list = jfVar.f49948a;
            arrayList = new ArrayList(ry.n.W(list, 10));
            for (ps.b bVarA : list) {
                if (bVarA.f47122a == j11) {
                    bVarA = ps.b.a(bVarA, hVar, f5, false, 415);
                }
                arrayList.add(bVarA);
            }
        } while (!i1Var.j(value, jf.a(jfVar, arrayList, 0, CropImageView.DEFAULT_ASPECT_RATIO, false, null, 126)));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.f50101b.a();
        super.onCleared();
    }
}
