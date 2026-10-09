package f;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.SavedStateViewModelFactory;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f26162b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i11) {
        super(0);
        this.f26161a = i11;
        this.f26162b = nVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f26161a) {
            case 0:
                n nVar = this.f26162b;
                return new SavedStateViewModelFactory(nVar.getApplication(), nVar, nVar.getIntent() != null ? nVar.getIntent().getExtras() : null);
            case 1:
                this.f26162b.reportFullyDrawn();
                return qy.b0.f48488a;
            case 2:
                n nVar2 = this.f26162b;
                return new w(nVar2.reportFullyDrawnExecutor, new m(nVar2, 1));
            default:
                n nVar3 = this.f26162b;
                d0 d0Var = new d0(new c(nVar3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (kotlin.jvm.internal.m.a(Looper.myLooper(), Looper.getMainLooper())) {
                        nVar3.getLifecycle().addObserver(new androidx.lifecycle.compose.g(3, d0Var, nVar3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new b2.c(10, nVar3, d0Var));
                    }
                }
                return d0Var;
        }
    }
}
