package p;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import z4.w0;
import z4.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f46234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x0 f46235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f46236e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f46233b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f46237f = new k(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f46232a = new ArrayList();

    public final void a() {
        if (this.f46236e) {
            ArrayList arrayList = this.f46232a;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((w0) obj).b();
            }
            this.f46236e = false;
        }
    }

    public final void b() {
        if (this.f46236e) {
            return;
        }
        ArrayList arrayList = this.f46232a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            w0 w0Var = (w0) obj;
            long j11 = this.f46233b;
            if (j11 >= 0) {
                w0Var.e(j11);
            }
            Interpolator interpolator = this.f46234c;
            if (interpolator != null) {
                w0Var.f(interpolator);
            }
            if (this.f46235d != null) {
                w0Var.g(this.f46237f);
            }
            w0Var.i();
        }
        this.f46236e = true;
    }
}
