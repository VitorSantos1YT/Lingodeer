package ce;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements td.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6851a;

    public /* synthetic */ e0(int i11) {
        this.f6851a = i11;
    }

    @Override // td.l
    public final vd.b0 a(Object obj, int i11, int i12, td.j jVar) {
        switch (this.f6851a) {
            case 0:
                return new d0((Bitmap) obj);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new ee.e(drawable, 0);
                }
                return null;
            default:
                return new d0((File) obj);
        }
    }

    @Override // td.l
    public final /* bridge */ /* synthetic */ boolean b(Object obj, td.j jVar) {
        switch (this.f6851a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }
}
