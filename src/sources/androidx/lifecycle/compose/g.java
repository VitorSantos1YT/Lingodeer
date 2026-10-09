package androidx.lifecycle.compose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.accompanist.permissions.MutablePermissionState;
import com.google.accompanist.permissions.PermissionStatus;
import com.lingo.course.ui.CourseFlashCardIndexActivity;
import f.d0;
import f.n;
import kotlin.jvm.internal.m;
import l1.b1;
import l1.b3;
import n4.t;
import z4.o;
import z4.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2063c;

    public /* synthetic */ g(int i11, Object obj, Object obj2) {
        this.f2061a = i11;
        this.f2062b = obj;
        this.f2063c = obj2;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i11 = this.f2061a;
        Object obj = this.f2063c;
        Object obj2 = this.f2062b;
        switch (i11) {
            case 0:
                LifecycleEffectKt.LifecycleEventEffect$lambda$4$lambda$3$lambda$1((Lifecycle.Event) obj2, (b3) obj, lifecycleOwner, event);
                break;
            case 1:
                CourseFlashCardIndexActivity courseFlashCardIndexActivity = (CourseFlashCardIndexActivity) obj2;
                b1 b1Var = (b1) obj;
                int i12 = CourseFlashCardIndexActivity.f21612t;
                m.f(lifecycleOwner, "<unused var>");
                m.f(event, "event");
                if (event == Lifecycle.Event.ON_RESUME) {
                    b1Var.setValue(Boolean.valueOf(new t(courseFlashCardIndexActivity).f43230a.areNotificationsEnabled()));
                }
                break;
            case 2:
                Lifecycle.Event event2 = (Lifecycle.Event) obj2;
                MutablePermissionState mutablePermissionState = (MutablePermissionState) obj;
                m.f(lifecycleOwner, "<unused var>");
                m.f(event, "event");
                if (event == event2 && !m.a(mutablePermissionState.getStatus(), PermissionStatus.Granted.f7791a)) {
                    PermissionStatus permissionStatusB = mutablePermissionState.b();
                    m.f(permissionStatusB, "<set-?>");
                    mutablePermissionState.f7787c.setValue(permissionStatusB);
                    break;
                }
                break;
            case 3:
                d0 d0Var = (d0) obj2;
                n nVar = (n) obj;
                m.f(lifecycleOwner, "<anonymous parameter 0>");
                m.f(event, "event");
                if (event == Lifecycle.Event.ON_CREATE) {
                    d0Var.f26137e = a5.e.c(nVar);
                    d0Var.d(d0Var.f26139g);
                }
                break;
            default:
                o oVar = (o) obj2;
                p pVar = (p) obj;
                oVar.getClass();
                if (event == Lifecycle.Event.ON_DESTROY) {
                    oVar.b(pVar);
                }
                break;
        }
    }
}
