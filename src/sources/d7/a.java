package d7;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.datasource.AssetDataSource$AssetDataSourceException;
import b7.f0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    public long H;
    public boolean K;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AssetManager f23205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f23206f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InputStream f23207t;

    public a(Context context) {
        super(false);
        this.f23205e = context.getAssets();
    }

    @Override // d7.f
    public final void close() {
        this.f23206f = null;
        try {
            try {
                InputStream inputStream = this.f23207t;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f23207t = null;
                if (this.K) {
                    this.K = false;
                    e();
                }
            } catch (IOException e8) {
                throw new AssetDataSource$AssetDataSourceException(e8, 2000);
            }
        } catch (Throwable th2) {
            this.f23207t = null;
            if (this.K) {
                this.K = false;
                e();
            }
            throw th2;
        }
    }

    @Override // y6.h
    public final int read(byte[] bArr, int i11, int i12) throws AssetDataSource$AssetDataSourceException {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.H;
        if (j11 != 0) {
            if (j11 != -1) {
                try {
                    i12 = (int) Math.min(j11, i12);
                } catch (IOException e8) {
                    throw new AssetDataSource$AssetDataSourceException(e8, 2000);
                }
            }
            InputStream inputStream = this.f23207t;
            String str = f0.f3975a;
            int i13 = inputStream.read(bArr, i11, i12);
            if (i13 != -1) {
                long j12 = this.H;
                if (j12 != -1) {
                    this.H = j12 - ((long) i13);
                }
                b(i13);
                return i13;
            }
        }
        return -1;
    }

    @Override // d7.f
    public final long u(h hVar) throws AssetDataSource$AssetDataSourceException {
        try {
            Uri uri = hVar.f23224a;
            long j11 = hVar.f23228e;
            this.f23206f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            g();
            InputStream inputStreamOpen = this.f23205e.open(path, 1);
            this.f23207t = inputStreamOpen;
            if (inputStreamOpen.skip(j11) < j11) {
                throw new AssetDataSource$AssetDataSourceException(null, 2008);
            }
            long j12 = hVar.f23229f;
            if (j12 != -1) {
                this.H = j12;
            } else {
                long jAvailable = this.f23207t.available();
                this.H = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.H = -1L;
                }
            }
            this.K = true;
            h(hVar);
            return this.H;
        } catch (AssetDataSource$AssetDataSourceException e8) {
            throw e8;
        } catch (IOException e10) {
            throw new AssetDataSource$AssetDataSourceException(e10, e10 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // d7.f
    public final Uri x() {
        return this.f23206f;
    }
}
