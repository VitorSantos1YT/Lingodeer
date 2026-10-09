package bp;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.InstallationTokenResult;
import com.lingo.lingoskill.ui.base.MainActivity;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c3 implements i.b, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4525b;

    public /* synthetic */ c3(MainActivity mainActivity, int i11) {
        this.f4524a = i11;
        this.f4525b = mainActivity;
    }

    @Override // i.b
    public void f(Object obj) {
        int i11 = this.f4524a;
        MainActivity mainActivity = this.f4525b;
        i.a it = (i.a) obj;
        switch (i11) {
            case 0:
                int i12 = MainActivity.U;
                kotlin.jvm.internal.m.f(it, "it");
                com.google.android.material.datepicker.d.e(2, com.google.android.material.datepicker.d.e(3, f10.e.b())).f(new np.b(25));
                gp.w wVarU = mainActivity.u();
                androidx.lifecycle.j jVar = new androidx.lifecycle.j(25);
                wVarU.getClass();
                wVarU.d(jVar);
                break;
            default:
                int i13 = MainActivity.U;
                kotlin.jvm.internal.m.f(it, "it");
                com.google.android.material.datepicker.d.e(3, com.google.android.material.datepicker.d.e(2, com.google.android.material.datepicker.d.e(1, com.google.android.material.datepicker.d.e(5, f10.e.b())))).f(new np.b(25));
                gp.w wVarU2 = mainActivity.u();
                androidx.lifecycle.j jVar2 = new androidx.lifecycle.j(25);
                wVarU2.getClass();
                wVarU2.d(jVar2);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i11 = this.f4524a;
        MainActivity mainActivity = this.f4525b;
        switch (i11) {
            case 2:
                int i12 = MainActivity.U;
                kotlin.jvm.internal.m.f(task, "task");
                if (!task.isSuccessful()) {
                    String str = mainActivity.f36388c;
                    task.getException();
                } else {
                    String str2 = mainActivity.f36388c;
                }
                break;
            default:
                int i13 = MainActivity.U;
                kotlin.jvm.internal.m.f(task, "task");
                if (!task.isSuccessful()) {
                    String str3 = mainActivity.f36388c;
                    task.getException();
                } else {
                    InstallationTokenResult installationTokenResult = (InstallationTokenResult) task.getResult();
                    String str4 = mainActivity.f36388c;
                    Objects.toString(installationTokenResult);
                }
                break;
        }
    }
}
