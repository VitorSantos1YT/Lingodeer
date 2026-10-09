package d7;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import b7.f0;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    public int H;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f23215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f23216f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f23217t;

    @Override // d7.f
    public final void close() {
        if (this.f23216f != null) {
            this.f23216f = null;
            e();
        }
        this.f23215e = null;
    }

    @Override // y6.h
    public final int read(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        int i13 = this.H;
        if (i13 == 0) {
            return -1;
        }
        int iMin = Math.min(i12, i13);
        byte[] bArr2 = this.f23216f;
        String str = f0.f3975a;
        System.arraycopy(bArr2, this.f23217t, bArr, i11, iMin);
        this.f23217t += iMin;
        this.H -= iMin;
        b(iMin);
        return iMin;
    }

    @Override // d7.f
    public final long u(h hVar) throws ParserException, DataSourceException {
        g();
        this.f23215e = hVar;
        Uri uri = hVar.f23224a;
        long j11 = hVar.f23229f;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        b7.a.c("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = f0.f3975a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ParserException(nv.p.n(uriNormalizeScheme, "Unexpected URI format: "), null, true, 0);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f23216f = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e8) {
                throw new ParserException(ep.a.e("Error while parsing Base64 encoded string: ", str2), e8, true, 0);
            }
        } else {
            this.f23216f = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j12 = hVar.f23228e;
        byte[] bArr = this.f23216f;
        if (j12 > bArr.length) {
            this.f23216f = null;
            throw new DataSourceException(2008);
        }
        int i11 = (int) j12;
        this.f23217t = i11;
        int length = bArr.length - i11;
        this.H = length;
        if (j11 != -1) {
            this.H = (int) Math.min(length, j11);
        }
        h(hVar);
        return j11 != -1 ? j11 : this.H;
    }

    @Override // d7.f
    public final Uri x() {
        h hVar = this.f23215e;
        if (hVar != null) {
            return hVar.f23224a;
        }
        return null;
    }
}
