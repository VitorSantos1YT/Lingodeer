package bp;

import android.content.Context;
import androidx.preference.Preference;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseException;
import com.google.firebase.appcheck.internal.DefaultAppCheckTokenResult;
import com.google.firebase.appcheck.internal.DefaultFirebaseAppCheck;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements p9.o, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f4625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4626b;

    public /* synthetic */ i(DefaultFirebaseAppCheck defaultFirebaseAppCheck, boolean z11) {
        this.f4626b = defaultFirebaseAppCheck;
        this.f4625a = z11;
    }

    @Override // p9.o
    public boolean i(Preference preference) {
        l lVar = (l) this.f4626b;
        if (!this.f4625a) {
            int[] iArr = bq.r.f4959a;
            Context contextRequireContext = lVar.requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
            bq.m.C(contextRequireContext, "me_setting_account");
        }
        return false;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        DefaultFirebaseAppCheck defaultFirebaseAppCheck = (DefaultFirebaseAppCheck) this.f4626b;
        if (!this.f4625a && defaultFirebaseAppCheck.e()) {
            return Tasks.forResult(DefaultAppCheckTokenResult.c(defaultFirebaseAppCheck.f17818n));
        }
        if (defaultFirebaseAppCheck.m == null) {
            return Tasks.forResult(new DefaultAppCheckTokenResult("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", new FirebaseException("No AppCheckProvider installed.")));
        }
        Task task2 = defaultFirebaseAppCheck.f17819o;
        if (task2 == null || task2.isComplete() || defaultFirebaseAppCheck.f17819o.isCanceled()) {
            defaultFirebaseAppCheck.f17819o = defaultFirebaseAppCheck.m.a().onSuccessTask(defaultFirebaseAppCheck.f17812g, new app.rive.runtime.kotlin.core.a(defaultFirebaseAppCheck, 23));
        }
        return defaultFirebaseAppCheck.f17819o.continueWithTask(defaultFirebaseAppCheck.f17813h, new c3.a(defaultFirebaseAppCheck));
    }

    public /* synthetic */ i(boolean z11, l lVar) {
        this.f4625a = z11;
        this.f4626b = lVar;
    }
}
