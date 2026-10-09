package kr;

import androidx.lifecycle.ViewModelKt;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Collection;
import rt.cb;
import rt.db;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements fv.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38590a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f38594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38595f;

    public v(fz.c cVar, Collection collection, Collection collection2, rz.b0 b0Var, fv.c cVar2) {
        this.f38591b = cVar;
        this.f38592c = collection;
        this.f38593d = collection2;
        this.f38594e = b0Var;
        this.f38595f = cVar2;
    }

    @Override // fv.d
    public final void a(uv.b bVar) {
        int i11 = this.f38590a;
    }

    @Override // fv.d
    public final void b(uv.b task) {
        switch (this.f38590a) {
            case 0:
                kotlin.jvm.internal.m.f(task, "task");
                ((b0) this.f38591b).M = task;
                break;
        }
    }

    @Override // fv.d
    public final void c(uv.b task) {
        switch (this.f38590a) {
            case 0:
                kotlin.jvm.internal.m.f(task, "task");
                b0 b0Var = (b0) this.f38591b;
                b0Var.M = null;
                rz.e0.B(ViewModelKt.getViewModelScope(b0Var), null, null, new b0.x0((ch.b0) this.f38592c, (String) this.f38593d, (fv.a) this.f38595f, task, (String) this.f38594e, (vy.d) null, 13), 3);
                break;
            default:
                fz.c cVar = (fz.c) this.f38591b;
                kotlin.jvm.internal.m.f(task, "task");
                if (((Collection) this.f38592c).isEmpty() && ((Collection) this.f38593d).isEmpty()) {
                    cVar.invoke(cb.f49585a);
                } else {
                    rz.e0.B((rz.b0) this.f38594e, null, null, new jr.i0((fv.c) this.f38595f, (Collection) this.f38592c, (Collection) this.f38593d, cVar, (vy.d) null), 3);
                }
                break;
        }
    }

    @Override // fv.d
    public final void d(uv.b bVar) {
        int i11 = this.f38590a;
    }

    @Override // fv.d
    public final void e(uv.b task, int i11, int i12) {
        switch (this.f38590a) {
            case 0:
                kotlin.jvm.internal.m.f(task, "task");
                ((ch.b0) this.f38592c).invoke((String) this.f38593d, Float.valueOf(i11 / i12));
                break;
            default:
                ((fz.c) this.f38591b).invoke(new db(i12 > 0 ? i11 / i12 : CropImageView.DEFAULT_ASPECT_RATIO));
                break;
        }
    }

    @Override // fv.d
    public final void f(uv.b task, Throwable th2) {
        switch (this.f38590a) {
            case 0:
                kotlin.jvm.internal.m.f(task, "task");
                ((b0) this.f38591b).M = null;
                break;
            default:
                kotlin.jvm.internal.m.f(task, "task");
                ((fz.c) this.f38591b).invoke(cb.f49585a);
                break;
        }
    }

    public v(b0 b0Var, ch.b0 b0Var2, String str, fv.a aVar, String str2) {
        this.f38591b = b0Var;
        this.f38592c = b0Var2;
        this.f38593d = str;
        this.f38595f = aVar;
        this.f38594e = str2;
    }

    private final void g(uv.b bVar) {
    }

    private final void h(uv.b bVar) {
    }

    private final void i(uv.b bVar) {
    }

    private final void j(uv.b bVar) {
    }

    private final void k(uv.b bVar) {
    }
}
