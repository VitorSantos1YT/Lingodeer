package ci;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements th.c, th.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f7123b;

    public /* synthetic */ a0(ImageView imageView, int i11) {
        this.f7122a = i11;
        this.f7123b = imageView;
    }

    @Override // th.c, th.b
    public final void a() {
        switch (this.f7122a) {
            case 0:
                android.support.v4.media.session.a.H(this.f7123b.getBackground());
                break;
            case 1:
                android.support.v4.media.session.a.H(this.f7123b.getBackground());
                break;
            case 2:
                Drawable background = this.f7123b.getBackground();
                kotlin.jvm.internal.m.e(background, "getBackground(...)");
                if (background instanceof AnimationDrawable) {
                    AnimationDrawable animationDrawable = (AnimationDrawable) background;
                    animationDrawable.selectDrawable(0);
                    animationDrawable.stop();
                }
                break;
            case 3:
                Drawable drawable = this.f7123b.getDrawable();
                kotlin.jvm.internal.m.e(drawable, "getDrawable(...)");
                if (drawable instanceof AnimationDrawable) {
                    AnimationDrawable animationDrawable2 = (AnimationDrawable) drawable;
                    animationDrawable2.selectDrawable(0);
                    animationDrawable2.stop();
                }
                break;
            case 4:
                android.support.v4.media.session.a.H(this.f7123b.getBackground());
                break;
            default:
                android.support.v4.media.session.a.H(this.f7123b.getBackground());
                break;
        }
    }
}
