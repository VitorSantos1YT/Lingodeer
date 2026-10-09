package a10;

import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import b0.a0;
import b0.z;
import cf.x;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.InstallationTokenResult;
import com.lingo.lingoskill.LingoSkillApplication;
import java.util.Objects;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements iz.a, OnCompleteListener, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280a;

    public static /* bridge */ /* synthetic */ AutofillId c(Object obj) {
        return (AutofillId) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillValue d(Object obj) {
        return (AutofillValue) obj;
    }

    @Override // b0.z
    public float a(float f5) {
        float f11;
        float f12;
        switch (this.f280a) {
            case 19:
                if (f5 < 0.36363637f) {
                    return 7.5625f * f5 * f5;
                }
                if (f5 < 0.72727275f) {
                    float f13 = f5 - 0.54545456f;
                    f11 = 7.5625f * f13 * f13;
                    f12 = 0.75f;
                } else if (f5 < 0.90909094f) {
                    float f14 = f5 - 0.8181818f;
                    f11 = 7.5625f * f14 * f14;
                    f12 = 0.9375f;
                } else {
                    float f15 = f5 - 0.95454544f;
                    f11 = 7.5625f * f15 * f15;
                    f12 = 0.984375f;
                }
                return f11 + f12;
            case 20:
                b bVar = a0.f3421a;
                if (f5 < 0.5d) {
                    return (1 - bVar.a(1.0f - (f5 * 2.0f))) / 2.0f;
                }
                return (bVar.a((f5 * 2.0f) - 1.0f) + 1) / 2.0f;
            default:
                return f5;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f280a) {
            case 17:
                m.f(task, "task");
                if (!task.isSuccessful()) {
                    task.getException();
                }
                break;
            case 18:
                m.f(task, "task");
                if (!task.isSuccessful()) {
                    task.getException();
                } else {
                    Objects.toString((InstallationTokenResult) task.getResult());
                }
                break;
            case 27:
                m.f(task, "task");
                if (task.isSuccessful()) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    x.n().firebaseInstallId = (String) task.getResult();
                    x.n().updateEntry("firebaseInstallId");
                    Objects.toString(task.getResult());
                }
                break;
            default:
                m.f(task, "task");
                if (task.isSuccessful()) {
                    Objects.toString(task.getResult());
                }
                break;
        }
    }
}
