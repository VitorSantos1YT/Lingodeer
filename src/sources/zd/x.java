package zd;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements r, td.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f59202b = new x(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59203a;

    public /* synthetic */ x(int i11) {
        this.f59203a = i11;
    }

    public static ByteArrayInputStream a(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    public Class b() {
        switch (this.f59203a) {
            case 1:
                return ByteBuffer.class;
            case 3:
                return InputStream.class;
            case 8:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // td.d
    public boolean h(Object obj, File file, td.j jVar) throws Throwable {
        try {
            pe.b.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // zd.r
    public q p(w wVar) {
        switch (this.f59203a) {
            case 0:
                return y.f59204b;
            case 2:
                return new c(new x(1), 0);
            case 4:
                return new c(new x(3), 0);
            case 6:
                return new y(1);
            case 11:
                return new ae.h(wVar.b(Uri.class, AssetFileDescriptor.class), 1);
            case 12:
                return new ae.h(wVar.b(Uri.class, ParcelFileDescriptor.class), 1);
            case 13:
                return new ae.h(wVar.b(Uri.class, InputStream.class), 1);
            default:
                return new b0(wVar.b(h.class, InputStream.class));
        }
    }
}
