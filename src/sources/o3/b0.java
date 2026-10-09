package o3;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44650b;

    public /* synthetic */ b0(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f44649a = 2;
        this.f44650b = context;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j11) {
        switch (this.f44649a) {
            case 0:
                ((Runnable) this.f44650b).run();
                break;
            case 1:
                ((Runnable) this.f44650b).run();
                break;
            default:
                (Build.VERSION.SDK_INT >= 28 ? u9.e.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new com.adjust.sdk.s((Context) this.f44650b, 2), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
        }
    }

    public /* synthetic */ b0(Runnable runnable, int i11) {
        this.f44649a = i11;
        this.f44650b = runnable;
    }
}
