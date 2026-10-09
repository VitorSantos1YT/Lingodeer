package fj;

import android.widget.TextView;
import androidx.lifecycle.ViewModelKt;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import com.lingo.fluent.ui.base.adapter.PdVocabularyAdapter;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fv.d;
import hj.a4;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.m;
import qh.q;
import rp.g;
import rt.b6;
import rz.e0;
import th.e;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27321c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f27319a = i11;
        this.f27320b = obj;
        this.f27321c = obj2;
    }

    private final void A(uv.b bVar) {
    }

    private final void B(uv.b bVar) {
    }

    private final void C(uv.b bVar) {
    }

    private final void D(uv.b bVar) {
    }

    private final void g(uv.b bVar, Throwable th2) {
    }

    private final void h(uv.b bVar, Throwable th2) {
    }

    private final void i(uv.b bVar, Throwable th2) {
    }

    private final void j(uv.b bVar, Throwable th2) {
    }

    private final void k(uv.b bVar, Throwable th2) {
    }

    private final void l(uv.b bVar) {
    }

    private final void m(uv.b bVar) {
    }

    private final void n(uv.b bVar) {
    }

    private final void o(uv.b bVar) {
    }

    private final void p(uv.b bVar) {
    }

    private final void q(uv.b bVar) {
    }

    private final void r(uv.b bVar) {
    }

    private final void s(uv.b bVar) {
    }

    private final void t(uv.b bVar) {
    }

    private final void u(uv.b bVar) {
    }

    private final void v(uv.b bVar, int i11, int i12) {
    }

    private final void w(uv.b bVar, int i11, int i12) {
    }

    private final void x(uv.b bVar, int i11, int i12) {
    }

    private final void y(uv.b bVar, int i11, int i12) {
    }

    private final void z(uv.b bVar) {
    }

    @Override // fv.d
    public final void a(uv.b task) {
        switch (this.f27319a) {
            case 0:
            case 1:
            case 4:
            default:
                m.f(task, "task");
                break;
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
        }
    }

    @Override // fv.d
    public final void b(uv.b task) {
        switch (this.f27319a) {
            case 0:
                m.f(task, "task");
                ((c) this.f27320b).f27331f.add(Integer.valueOf(task.a()));
                break;
            case 1:
                m.f(task, "task");
                task.a();
                break;
            case 2:
            case 3:
                break;
            case 4:
                m.f(task, "task");
                ((q) this.f27320b).R = task.a();
                break;
            case 5:
            case 6:
            case 7:
                break;
            default:
                m.f(task, "task");
                ((yi.b) this.f27320b).f57849d = task.a();
                break;
        }
    }

    @Override // fv.d
    public final void c(uv.b task) {
        Object value;
        switch (this.f27319a) {
            case 0:
                m.f(task, "task");
                c cVar = (c) this.f27320b;
                int i11 = cVar.f27330e + 1;
                cVar.f27330e = i11;
                cVar.H.postValue(Integer.valueOf((int) ((i11 / ((ArrayList) this.f27321c).size()) * 100)));
                break;
            case 1:
                m.f(task, "task");
                gi.d dVar = (gi.d) this.f27320b;
                e0.B(ViewModelKt.getViewModelScope(dVar), null, null, new gi.c(0, dVar, (File) this.f27321c, null), 3);
                break;
            case 2:
                ((e) this.f27320b).h((String) this.f27321c);
                break;
            case 3:
                ((PdVocabularyAdapter) this.f27320b).f21652a.h((String) this.f27321c);
                break;
            case 4:
                m.f(task, "task");
                q qVar = (q) this.f27320b;
                int i12 = qVar.S + 1;
                qVar.S = i12;
                ArrayList arrayList = (ArrayList) this.f27321c;
                int size = (int) ((i12 / arrayList.size()) * 100);
                ta.a aVar = qVar.f36400f;
                m.c(aVar);
                TextView textView = ((a4) aVar).f32348g;
                if (textView != null) {
                    textView.setText(String.format("%s %s", Arrays.copyOf(new Object[]{qVar.getString(R.string.loading), w4.c.f(size, " %")}, 2)));
                }
                if (qVar.S == arrayList.size()) {
                    qVar.x();
                }
                break;
            case 5:
                ((rp.d) this.f27320b).a((File) this.f27321c);
                break;
            case 6:
                rp.e eVar = (rp.e) this.f27320b;
                eVar.f49346d++;
                i1 i1Var = eVar.f49344b;
                List list = (List) this.f27321c;
                do {
                    value = i1Var.getValue();
                } while (!i1Var.j(value, new g(eVar.f49346d / list.size(), eVar.f49346d == list.size())));
                break;
            case 7:
                ((b6) this.f27320b).f49519b.h((String) this.f27321c);
                break;
            default:
                m.f(task, "task");
                ((yi.b) this.f27320b).a((HashMap) this.f27321c);
                break;
        }
    }

    @Override // fv.d
    public final void e(uv.b task, int i11, int i12) {
        switch (this.f27319a) {
            case 0:
                m.f(task, "task");
                break;
            case 1:
                m.f(task, "task");
                float f5 = i12 > 0 ? i11 / i12 : CropImageView.DEFAULT_ASPECT_RATIO;
                i1 i1Var = ((gi.d) this.f27320b).f29258c;
                gi.a aVarA = gi.a.a((gi.a) i1Var.getValue(), null, null, null, false, f5, false, 95);
                i1Var.getClass();
                i1Var.l(null, aVarA);
                break;
            case 2:
            case 3:
                break;
            case 4:
                m.f(task, "task");
                break;
            case 5:
                ((rp.d) this.f27320b).f49339d.postValue(Integer.valueOf((int) ((i11 / i12) * 100)));
                break;
            case 6:
            case 7:
                break;
            default:
                m.f(task, "task");
                int i13 = (int) ((i11 / i12) * 100);
                ((yi.b) this.f27320b).f57846a.u(i13 + "%", false);
                break;
        }
    }

    @Override // fv.d
    public final void f(uv.b task, Throwable th2) {
        switch (this.f27319a) {
            case 0:
                m.f(task, "task");
                c cVar = (c) this.f27320b;
                int i11 = cVar.f27330e + 1;
                cVar.f27330e = i11;
                cVar.H.postValue(Integer.valueOf((int) ((i11 / ((ArrayList) this.f27321c).size()) * 100)));
                break;
            case 1:
                m.f(task, "task");
                i1 i1Var = ((gi.d) this.f27320b).f29258c;
                gi.a aVarA = gi.a.a((gi.a) i1Var.getValue(), null, null, ep.a.e("下载失败: ", th2.getMessage()), false, CropImageView.DEFAULT_ASPECT_RATIO, false, 39);
                i1Var.getClass();
                i1Var.l(null, aVarA);
                break;
            case 2:
            case 3:
                break;
            case 4:
                m.f(task, "task");
                q qVar = (q) this.f27320b;
                int i12 = qVar.S + 1;
                qVar.S = i12;
                ArrayList arrayList = (ArrayList) this.f27321c;
                int size = (int) ((i12 / arrayList.size()) * 100);
                ta.a aVar = qVar.f36400f;
                m.c(aVar);
                ((a4) aVar).f32348g.setText(String.format("%s %s", Arrays.copyOf(new Object[]{qVar.getString(R.string.loading), w4.c.f(size, " %")}, 2)));
                if (qVar.S == arrayList.size()) {
                    qVar.x();
                }
                break;
            case 5:
            case 6:
            case 7:
                break;
            default:
                m.f(task, "task");
                break;
        }
    }

    @Override // fv.d
    public final void d(uv.b bVar) {
        switch (this.f27319a) {
            case 0:
            case 1:
            case 4:
            default:
                m.f(bVar, gkbGsXmgaxRjJ.DTNeZUTLRRXaXD);
                break;
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
        }
    }
}
