package fw;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AnimationDrawable f28204u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f28205v;

    @Override // fw.b
    public final boolean b(long j11) {
        int i11 = this.f28205v;
        AnimationDrawable animationDrawable = this.f28204u;
        boolean zB = super.b(j11);
        if (zB) {
            long j12 = j11 - this.f28221q;
            if (j12 > i11) {
                if (animationDrawable.isOneShot()) {
                    return false;
                }
                j12 %= (long) i11;
            }
            long duration = 0;
            for (int i12 = 0; i12 < animationDrawable.getNumberOfFrames(); i12++) {
                duration += (long) animationDrawable.getDuration(i12);
                if (duration > j12) {
                    this.f28206a = ((BitmapDrawable) animationDrawable.getFrame(i12)).getBitmap();
                    return zB;
                }
            }
        }
        return zB;
    }
}
