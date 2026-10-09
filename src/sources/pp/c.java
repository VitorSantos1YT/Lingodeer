package pp;

import com.lingodeer.R;
import ff.h;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements fv.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f46971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f46972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f46973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f46974d;

    public c(e eVar, w wVar, List list, List list2) {
        this.f46971a = eVar;
        this.f46972b = wVar;
        this.f46973c = list;
        this.f46974d = list2;
    }

    @Override // fv.d
    public final void a(uv.b task) {
        m.f(task, "task");
    }

    @Override // fv.d
    public final void b(uv.b task) {
        m.f(task, "task");
        this.f46971a.O.add(Integer.valueOf(task.a()));
    }

    @Override // fv.d
    public final void c(uv.b task) {
        m.f(task, "task");
        e eVar = this.f46971a;
        eVar.O.remove(Integer.valueOf(task.a()));
        w wVar = this.f46972b;
        int i11 = wVar.f38359a + 1;
        wVar.f38359a = i11;
        if (i11 == this.f46973c.size()) {
            e.a(eVar, this.f46974d);
        }
    }

    @Override // fv.d
    public final void d(uv.b task) {
        m.f(task, "task");
    }

    @Override // fv.d
    public final void e(uv.b task, int i11, int i12) {
        m.f(task, "task");
    }

    @Override // fv.d
    public final void f(uv.b task, Throwable th2) {
        m.f(task, "task");
        e eVar = this.f46971a;
        h.B(eVar.f46979d, R.string.download_materials_error);
        eVar.O.remove(Integer.valueOf(task.a()));
        w wVar = this.f46972b;
        int i11 = wVar.f38359a + 1;
        wVar.f38359a = i11;
        if (i11 == this.f46973c.size()) {
            e.a(eVar, this.f46974d);
        }
    }
}
