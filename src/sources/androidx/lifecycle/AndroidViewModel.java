package androidx.lifecycle;

import android.app.Application;
import dt.Xk.wuoM;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class AndroidViewModel extends ViewModel {
    private final Application application;

    public AndroidViewModel(Application application) {
        m.f(application, "application");
        this.application = application;
    }

    public <T extends Application> T getApplication() {
        T t6 = (T) this.application;
        m.d(t6, wuoM.kZHGVIqArVeG);
        return t6;
    }
}
