package h9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.media3.ui.PlayerControlView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlayerControlView f32099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f32100c;

    public /* synthetic */ v(w wVar, PlayerControlView playerControlView, int i11) {
        this.f32098a = i11;
        this.f32100c = wVar;
        this.f32099b = playerControlView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32098a) {
            case 0:
                w wVar = this.f32100c;
                wVar.i(1);
                if (wVar.B) {
                    this.f32099b.post(wVar.f32118s);
                    wVar.B = false;
                }
                break;
            case 1:
                w wVar2 = this.f32100c;
                wVar2.i(2);
                if (wVar2.B) {
                    this.f32099b.post(wVar2.f32118s);
                    wVar2.B = false;
                }
                break;
            default:
                w wVar3 = this.f32100c;
                wVar3.i(2);
                if (wVar3.B) {
                    this.f32099b.post(wVar3.f32118s);
                    wVar3.B = false;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f32098a) {
            case 0:
                this.f32100c.i(3);
                break;
            case 1:
                this.f32100c.i(3);
                break;
            default:
                this.f32100c.i(3);
                break;
        }
    }
}
