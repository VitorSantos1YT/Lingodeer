package ci;

import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements th.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f7145b;

    public /* synthetic */ m0(ImageView imageView, int i11) {
        this.f7144a = i11;
        this.f7145b = imageView;
    }

    @Override // th.c, th.b
    public void a() {
        switch (this.f7144a) {
            case 0:
                android.support.v4.media.session.a.H(this.f7145b.getBackground());
                break;
            default:
                android.support.v4.media.session.a.H(this.f7145b.getBackground());
                break;
        }
    }
}
