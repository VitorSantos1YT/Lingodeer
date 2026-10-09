package ac;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f524a;

    public /* synthetic */ a(int i11) {
        this.f524a = i11;
    }

    @Override // ac.g
    public final h a(Object obj, gc.l lVar) {
        switch (this.f524a) {
            case 0:
                Uri uri = (Uri) obj;
                if (kc.h.c(uri)) {
                    return new b(uri, lVar, 0);
                }
                return null;
            case 1:
                return new c((Bitmap) obj, lVar, 0);
            case 2:
                return new c((ByteBuffer) obj, lVar, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (kotlin.jvm.internal.m.a(uri2.getScheme(), "content")) {
                    return new d(uri2, lVar);
                }
                return null;
            case 4:
                return new c((Drawable) obj, lVar, 2);
            case 5:
                return new i((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (kotlin.jvm.internal.m.a(uri3.getScheme(), "android.resource")) {
                    return new b(uri3, lVar, 1);
                }
                return null;
        }
    }
}
