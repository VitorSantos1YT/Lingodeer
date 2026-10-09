package dn;

import android.widget.ImageView;
import bq.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements e, bq.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageView f23499b;

    public /* synthetic */ b(ImageView imageView, int i11) {
        this.f23498a = i11;
        this.f23499b = imageView;
    }

    @Override // bq.e
    public void a() {
        switch (this.f23498a) {
            case 0:
                android.support.v4.media.session.a.H(this.f23499b.getBackground());
                break;
            default:
                android.support.v4.media.session.a.H(this.f23499b.getBackground());
                break;
        }
    }

    @Override // bq.d
    public void k(int i11) {
        switch (this.f23498a) {
            case 2:
                android.support.v4.media.session.a.H(this.f23499b.getBackground());
                break;
            default:
                android.support.v4.media.session.a.H(this.f23499b.getBackground());
                break;
        }
    }
}
