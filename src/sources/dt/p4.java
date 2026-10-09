package dt;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.ExoPlayer;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p4 implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24095b;

    public /* synthetic */ p4(Object obj, int i11) {
        this.f24094a = i11;
        this.f24095b = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.f24094a) {
            case 0:
                ExoPlayer exoPlayer = (ExoPlayer) this.f24095b;
                kotlin.jvm.internal.m.f(lifecycleOwner, "<unused var>");
                kotlin.jvm.internal.m.f(event, "event");
                if (event == Lifecycle.Event.ON_RESUME && exoPlayer.u() == 4) {
                    new Handler(Looper.getMainLooper()).postDelayed(new b2.a(exoPlayer, 9), 100L);
                    break;
                }
                break;
            case 1:
                fa.a aVar = (fa.a) this.f24095b;
                kotlin.jvm.internal.m.f(lifecycleOwner, "<unused var>");
                kotlin.jvm.internal.m.f(event, "event");
                if (event == Lifecycle.Event.ON_START) {
                    aVar.f27036h = true;
                } else if (event == Lifecycle.Event.ON_STOP) {
                    aVar.f27036h = false;
                }
                break;
            case 2:
                ((fz.c) this.f24095b).invoke(event);
                break;
            case 3:
                mv.n nVar = (mv.n) this.f24095b;
                kotlin.jvm.internal.m.f(lifecycleOwner, OCBJEWZHh.NKt);
                kotlin.jvm.internal.m.f(event, "event");
                if (event == Lifecycle.Event.ON_STOP) {
                    nVar.a(mv.c.f42192a);
                }
                break;
            case 4:
                m9.g gVar = (m9.g) this.f24095b;
                kotlin.jvm.internal.m.f(lifecycleOwner, "<unused var>");
                kotlin.jvm.internal.m.f(event, "event");
                gVar.f41085q = event.getTargetState();
                if (gVar.f41072c != null) {
                    ArrayList arrayListC1 = ry.m.c1(gVar.f41075f);
                    int size = arrayListC1.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayListC1.get(i11);
                        i11++;
                        j9.e eVar = (j9.e) obj;
                        eVar.getClass();
                        m9.c cVar = eVar.H;
                        cVar.getClass();
                        j9.e eVar2 = cVar.f41051a;
                        Lifecycle.State targetState = event.getTargetState();
                        kotlin.jvm.internal.m.f(targetState, "<set-?>");
                        eVar2.f36190d = targetState;
                        cVar.f41054d = event.getTargetState();
                        cVar.b();
                    }
                }
                break;
            default:
                AbstractComposeView abstractComposeView = (AbstractComposeView) this.f24095b;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    abstractComposeView.d();
                }
                break;
        }
    }
}
