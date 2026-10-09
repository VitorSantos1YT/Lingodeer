package ph;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mh.b f46915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f46916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f46917c;

    public t(mh.b bVar, a0 a0Var, boolean z11) {
        this.f46915a = bVar;
        this.f46916b = a0Var;
        this.f46917c = z11;
    }

    @Override // fz.a
    public final Object invoke() {
        a0 a0Var = this.f46916b;
        fh.e repository = a0Var.f46840a;
        mh.b bVar = this.f46915a;
        String difficulty = bVar.b();
        kotlin.jvm.internal.m.f(repository, "repository");
        kotlin.jvm.internal.m.f(difficulty, "difficulty");
        gh.o oVar = new gh.o(repository, BuildConfig.VERSION_NAME, difficulty, BuildConfig.VERSION_NAME, this.f46917c);
        a0Var.H.put(bVar, new WeakReference(oVar));
        return oVar;
    }
}
