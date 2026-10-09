package zo;

import androidx.lifecycle.ViewModel;
import fv.d;
import kotlin.jvm.internal.m;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewModel f59260b;

    public /* synthetic */ a(ViewModel viewModel, int i11) {
        this.f59259a = i11;
        this.f59260b = viewModel;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // fv.d
    public final void a(uv.b task) {
        switch (this.f59259a) {
        }
        m.f(task, "task");
    }

    @Override // fv.d
    public final void b(uv.b task) {
        switch (this.f59259a) {
            case 0:
                m.f(task, "task");
                task.a();
                break;
            default:
                m.f(task, "task");
                task.a();
                break;
        }
    }

    @Override // fv.d
    public final void c(uv.b task) {
        switch (this.f59259a) {
            case 0:
                m.f(task, "task");
                ep.a.u(1.0f, ((b) this.f59260b).f59262b, null);
                break;
            default:
                m.f(task, "task");
                i1 i1Var = ((yn.a) this.f59260b).f57865b;
                i1Var.getClass();
                i1Var.l(null, 100);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // fv.d
    public final void d(uv.b task) {
        switch (this.f59259a) {
        }
        m.f(task, "task");
    }

    @Override // fv.d
    public final void e(uv.b task, int i11, int i12) {
        switch (this.f59259a) {
            case 0:
                m.f(task, "task");
                ep.a.u(i11 / i12, ((b) this.f59260b).f59262b, null);
                break;
            default:
                m.f(task, "task");
                int i13 = (int) ((i11 / i12) * 100);
                i1 i1Var = ((yn.a) this.f59260b).f57865b;
                Integer numValueOf = Integer.valueOf(i13);
                i1Var.getClass();
                i1Var.l(null, numValueOf);
                break;
        }
    }

    @Override // fv.d
    public final void f(uv.b task, Throwable th2) {
        switch (this.f59259a) {
            case 0:
                m.f(task, "task");
                ep.a.u(1.0f, ((b) this.f59260b).f59262b, null);
                break;
            default:
                m.f(task, "task");
                i1 i1Var = ((yn.a) this.f59260b).f57865b;
                i1Var.getClass();
                i1Var.l(null, 100);
                break;
        }
    }
}
