package be;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import ce.l;
import ce.o;
import ce.x;
import td.i;
import td.j;
import td.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f4128a = x.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final td.b f4131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f4132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f4134g;

    public b(int i11, int i12, j jVar) {
        this.f4129b = i11;
        this.f4130c = i12;
        this.f4131d = (td.b) jVar.c(o.f6876f);
        this.f4132e = (l) jVar.c(l.f6873g);
        i iVar = o.f6879i;
        this.f4133f = jVar.c(iVar) != null && ((Boolean) jVar.c(iVar)).booleanValue();
        this.f4134g = (k) jVar.c(o.f6877g);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f4128a.c(this.f4129b, this.f4130c, this.f4133f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f4131d == td.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.f4129b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f4130c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f4132e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(fB * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        k kVar = this.f4134g;
        if (kVar != null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((kVar == k.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i11 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
