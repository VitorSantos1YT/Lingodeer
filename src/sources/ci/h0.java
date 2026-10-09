package ci;

import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements th.c, tx.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f7134a;

    public /* synthetic */ h0(ImageView imageView) {
        this.f7134a = imageView;
    }

    @Override // th.c, th.b
    public void a() {
        android.support.v4.media.session.a.H(this.f7134a.getBackground());
    }

    @Override // tx.c
    public void accept(Object obj) {
        Long it = (Long) obj;
        kotlin.jvm.internal.m.f(it, "it");
        ImageView imageView = this.f7134a;
        imageView.setVisibility(0);
        imageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
    }
}
