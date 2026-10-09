package d7;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.datasource.FileDataSource$FileDataSourceException;
import b7.f0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends b {
    public boolean H;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RandomAccessFile f23245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f23246f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f23247t;

    @Override // d7.f
    public final void close() {
        this.f23246f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f23245e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f23245e = null;
                if (this.H) {
                    this.H = false;
                    e();
                }
            } catch (IOException e8) {
                throw new FileDataSource$FileDataSourceException(e8, 2000);
            }
        } catch (Throwable th2) {
            this.f23245e = null;
            if (this.H) {
                this.H = false;
                e();
            }
            throw th2;
        }
    }

    @Override // y6.h
    public final int read(byte[] bArr, int i11, int i12) throws FileDataSource$FileDataSourceException {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.f23247t;
        if (j11 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f23245e;
            String str = f0.f3975a;
            int i13 = randomAccessFile.read(bArr, i11, (int) Math.min(j11, i12));
            if (i13 > 0) {
                this.f23247t -= (long) i13;
                b(i13);
            }
            return i13;
        } catch (IOException e8) {
            throw new FileDataSource$FileDataSourceException(e8, 2000);
        }
    }

    @Override // d7.f
    public final long u(h hVar) throws FileDataSource$FileDataSourceException {
        Uri uri = hVar.f23224a;
        long j11 = hVar.f23228e;
        this.f23246f = uri;
        g();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f23245e = randomAccessFile;
            try {
                randomAccessFile.seek(j11);
                long length = hVar.f23229f;
                if (length == -1) {
                    length = this.f23245e.length() - j11;
                }
                this.f23247t = length;
                if (length < 0) {
                    throw new FileDataSource$FileDataSourceException(null, null, 2008);
                }
                this.H = true;
                h(hVar);
                return this.f23247t;
            } catch (IOException e8) {
                throw new FileDataSource$FileDataSourceException(e8, 2000);
            }
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSource$FileDataSourceException(e10, ((e10.getCause() instanceof ErrnoException) && ((ErrnoException) e10.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbS = defpackage.e.s("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbS.append(fragment);
            throw new FileDataSource$FileDataSourceException(sbS.toString(), e10, 1004);
        } catch (SecurityException e11) {
            throw new FileDataSource$FileDataSourceException(e11, 2006);
        } catch (RuntimeException e12) {
            throw new FileDataSource$FileDataSourceException(e12, 2000);
        }
    }

    @Override // d7.f
    public final Uri x() {
        return this.f23246f;
    }
}
