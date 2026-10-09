package ac;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;
import xb.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gc.l f529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f530c;

    public /* synthetic */ c(Object obj, gc.l lVar, int i11) {
        this.f528a = i11;
        this.f530c = obj;
        this.f529b = lVar;
    }

    @Override // ac.h
    public final Object a(vy.d dVar) {
        int i11 = this.f528a;
        Object obj = this.f530c;
        gc.l lVar = this.f529b;
        switch (i11) {
            case 0:
                return new e(new BitmapDrawable(lVar.f29044a.getResources(), (Bitmap) obj), false, xb.e.MEMORY);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    m00.i iVar = new m00.i();
                    iVar.write(byteBuffer);
                    byteBuffer.position(0);
                    Context context = lVar.f29044a;
                    return new n(new q(iVar, null), null, xb.e.MEMORY);
                } catch (Throwable th2) {
                    byteBuffer.position(0);
                    throw th2;
                }
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = kc.h.f38057a;
                boolean z11 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof ra.q);
                if (z11) {
                    bitmapDrawable = new BitmapDrawable(lVar.f29044a.getResources(), ew.a.j(bitmapDrawable, lVar.f29045b, lVar.f29047d, lVar.f29048e, lVar.f29049f));
                }
                return new e(bitmapDrawable, z11, xb.e.MEMORY);
        }
    }
}
