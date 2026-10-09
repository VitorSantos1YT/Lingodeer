package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import l7.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface ImageOutput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f2138a = new c();

    void a();

    void onImageAvailable(long j11, Bitmap bitmap);
}
