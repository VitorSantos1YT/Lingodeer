package ce;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements td.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final td.i f6839b = td.i.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final td.i f6840c = new td.i("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, td.i.f52122e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0.n f6841a;

    public b(m0.n nVar) {
        this.f6841a = nVar;
    }

    @Override // td.m
    public final td.c d(td.j jVar) {
        return td.c.TRANSFORMED;
    }

    @Override // td.d
    public final boolean h(Object obj, File file, td.j jVar) throws Throwable {
        boolean z11;
        Bitmap bitmap = (Bitmap) ((vd.b0) obj).get();
        td.i iVar = f6840c;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) jVar.c(iVar);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i11 = pe.h.f46822a;
        SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) jVar.c(f6839b)).intValue();
        OutputStream bVar = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                m0.n nVar = this.f6841a;
                if (nVar != null) {
                    try {
                        bVar = new com.bumptech.glide.load.data.b(fileOutputStream, nVar);
                    } catch (IOException unused) {
                        bVar = fileOutputStream;
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException unused2) {
                            }
                        }
                        z11 = false;
                    } catch (Throwable th2) {
                        th = th2;
                        bVar = fileOutputStream;
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } else {
                    bVar = fileOutputStream;
                }
                bitmap.compress(compressFormat, iIntValue, bVar);
                bVar.close();
                try {
                    bVar.close();
                } catch (IOException unused4) {
                }
                z11 = true;
            } catch (Throwable th3) {
                throw th3;
            }
        } catch (IOException unused5) {
        } catch (Throwable th4) {
            th = th4;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Objects.toString(compressFormat);
            pe.m.c(bitmap);
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(jVar.c(iVar));
            bitmap.hasAlpha();
        }
        return z11;
    }
}
