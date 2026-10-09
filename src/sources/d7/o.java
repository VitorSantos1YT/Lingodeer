package d7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException;
import b7.f0;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends b {
    public FileInputStream H;
    public long K;
    public boolean L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f23250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f23251f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AssetFileDescriptor f23252t;

    public o(Context context) {
        super(false);
        this.f23250e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i11) {
        return Uri.parse("rawresource:///" + i11);
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
            r5.f23251f = r0
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
            android.content.res.AssetFileDescriptor r3 = r5.f23252t     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
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
            r5.f23252t = r0
            boolean r0 = r5.L
            if (r0 == 0) goto L2b
            r5.L = r2
            r5.e()
        L2b:
            return
        L2c:
            androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException r4 = new androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f23252t = r0
            boolean r0 = r5.L
            if (r0 == 0) goto L3d
            r5.L = r2
            r5.e()
        L3d:
            throw r1
        L3e:
            androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException r4 = new androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> Le
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.H = r0
            android.content.res.AssetFileDescriptor r4 = r5.f23252t     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
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
            r5.f23252t = r0
            boolean r0 = r5.L
            if (r0 == 0) goto L5d
            r5.L = r2
            r5.e()
        L5d:
            throw r3
        L5e:
            androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException r4 = new androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f23252t = r0
            boolean r0 = r5.L
            if (r0 == 0) goto L6f
            r5.L = r2
            r5.e()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.o.close():void");
    }

    @Override // y6.h
    public final int read(byte[] bArr, int i11, int i12) throws RawResourceDataSource$RawResourceDataSourceException {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.K;
        if (j11 != 0) {
            if (j11 != -1) {
                try {
                    i12 = (int) Math.min(j11, i12);
                } catch (IOException e8) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, e8, 2000);
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
            if (this.K != -1) {
                throw new RawResourceDataSource$RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }

    @Override // d7.f
    public final long u(h hVar) throws RawResourceDataSource$RawResourceDataSourceException {
        Resources resourcesForApplication;
        int identifier;
        int i11;
        Resources resources;
        this.f23251f = hVar;
        g();
        Uri uri = hVar.f23224a;
        long j11 = hVar.f23229f;
        long j12 = hVar.f23228e;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f23250e;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new RawResourceDataSource$RawResourceDataSourceException("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i11 = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSource$RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new RawResourceDataSource$RawResourceDataSourceException("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e8) {
                    throw new RawResourceDataSource$RawResourceDataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e8, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new RawResourceDataSource$RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(ep.a.D(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new RawResourceDataSource$RawResourceDataSourceException("Resource not found.", null, 2005);
                }
            }
            i11 = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i11);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new RawResourceDataSource$RawResourceDataSourceException(nv.p.n(uriNormalizeScheme, "Resource is compressed: "), null, 2000);
            }
            this.f23252t = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f23252t.getFileDescriptor());
            this.H = fileInputStream;
            try {
                if (length != -1 && j12 > length) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                }
                long startOffset = this.f23252t.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j12) - startOffset;
                if (jSkip != j12) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.K = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.K = size;
                        if (size < 0) {
                            throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                        }
                    }
                } else {
                    long j13 = length - jSkip;
                    this.K = j13;
                    if (j13 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
                if (j11 != -1) {
                    long j14 = this.K;
                    this.K = j14 == -1 ? j11 : Math.min(j14, j11);
                }
                this.L = true;
                h(hVar);
                return j11 != -1 ? j11 : this.K;
            } catch (RawResourceDataSource$RawResourceDataSourceException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RawResourceDataSource$RawResourceDataSourceException(null, e11, 2000);
            }
        } catch (Resources.NotFoundException e12) {
            throw new RawResourceDataSource$RawResourceDataSourceException(null, e12, 2005);
        }
    }

    @Override // d7.f
    public final Uri x() {
        h hVar = this.f23251f;
        if (hVar != null) {
            return hVar.f23224a;
        }
        return null;
    }
}
