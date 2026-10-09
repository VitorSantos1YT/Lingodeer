package d7;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.datasource.ContentDataSource$ContentDataSourceException;
import b7.f0;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {
    public FileInputStream H;
    public long K;
    public boolean L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ContentResolver f23212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f23213f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AssetFileDescriptor f23214t;

    public c(Context context) {
        super(false);
        this.f23212e = context.getContentResolver();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // d7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f23213f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.H     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L12
        Le:
            r3 = move-exception
            goto L44
        L10:
            r3 = move-exception
            goto L3e
        L12:
            r5.H = r0
            android.content.res.AssetFileDescriptor r3 = r5.f23214t     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r3 == 0) goto L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L20
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            r5.f23214t = r0
            boolean r0 = r5.L
            if (r0 == 0) goto L2b
            r5.L = r2
            r5.e()
        L2b:
            return
        L2c:
            androidx.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new androidx.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f23214t = r0
            boolean r0 = r5.L
            if (r0 == 0) goto L3d
            r5.L = r2
            r5.e()
        L3d:
            throw r1
        L3e:
            androidx.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new androidx.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> Le
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.H = r0
            android.content.res.AssetFileDescriptor r4 = r5.f23214t     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L52
        L4e:
            r1 = move-exception
            goto L64
        L50:
            r3 = move-exception
            goto L5e
        L52:
            r5.f23214t = r0
            boolean r0 = r5.L
            if (r0 == 0) goto L5d
            r5.L = r2
            r5.e()
        L5d:
            throw r3
        L5e:
            androidx.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new androidx.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f23214t = r0
            boolean r0 = r5.L
            if (r0 == 0) goto L6f
            r5.L = r2
            r5.e()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.c.close():void");
    }

    @Override // y6.h
    public final int read(byte[] bArr, int i11, int i12) throws ContentDataSource$ContentDataSourceException {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.K;
        if (j11 != 0) {
            if (j11 != -1) {
                try {
                    i12 = (int) Math.min(j11, i12);
                } catch (IOException e8) {
                    throw new ContentDataSource$ContentDataSourceException(e8, 2000);
                }
            }
            FileInputStream fileInputStream = this.H;
            String str = f0.f3975a;
            int i13 = fileInputStream.read(bArr, i11, i12);
            if (i13 != -1) {
                long j12 = this.K;
                if (j12 != -1) {
                    this.K = j12 - ((long) i13);
                }
                b(i13);
                return i13;
            }
        }
        return -1;
    }

    @Override // d7.f
    public final long u(h hVar) throws ContentDataSource$ContentDataSourceException {
        int i11;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = hVar.f23224a;
                long j11 = hVar.f23229f;
                long j12 = hVar.f23228e;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.f23213f = uriNormalizeScheme;
                g();
                boolean zEquals = Objects.equals(uriNormalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.f23212e;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f23214t = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i11 = 2000;
                    try {
                        throw new ContentDataSource$ContentDataSourceException(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
                    } catch (IOException e8) {
                        e = e8;
                        if (e instanceof FileNotFoundException) {
                            i11 = 2005;
                        }
                        throw new ContentDataSource$ContentDataSourceException(e, i11);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.H = fileInputStream;
                if (length != -1 && j12 > length) {
                    throw new ContentDataSource$ContentDataSourceException(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j12) - startOffset;
                if (jSkip != j12) {
                    throw new ContentDataSource$ContentDataSourceException(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.K = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.K = jPosition;
                        if (jPosition < 0) {
                            throw new ContentDataSource$ContentDataSourceException(null, 2008);
                        }
                    }
                } else {
                    long j13 = length - jSkip;
                    this.K = j13;
                    if (j13 < 0) {
                        throw new ContentDataSource$ContentDataSourceException(null, 2008);
                    }
                }
                if (j11 != -1) {
                    long j14 = this.K;
                    this.K = j14 == -1 ? j11 : Math.min(j14, j11);
                }
                this.L = true;
                h(hVar);
                return j11 != -1 ? j11 : this.K;
            } catch (IOException e10) {
                e = e10;
                i11 = 2000;
            }
        } catch (ContentDataSource$ContentDataSourceException e11) {
            throw e11;
        }
    }

    @Override // d7.f
    public final Uri x() {
        return this.f23213f;
    }
}
