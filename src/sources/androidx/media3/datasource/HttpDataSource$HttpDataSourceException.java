package androidx.media3.datasource;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2116c;

    public HttpDataSource$HttpDataSourceException() {
        super(2008);
        this.f2116c = 1;
    }

    public static HttpDataSource$HttpDataSourceException a(IOException iOException, int i11) {
        int i12;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i12 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i12 = 1004;
        } else {
            i12 = (message == null || !Ascii.c(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i12 == 2007 ? new HttpDataSource$CleartextNotPermittedException(2007, iOException, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted") : new HttpDataSource$HttpDataSourceException(iOException, i12, i11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpDataSource$HttpDataSourceException(IOException iOException, int i11, int i12) {
        if (i11 == 2000 && i12 == 1) {
            i11 = 2001;
        }
        super(iOException, i11);
        this.f2116c = i12;
    }

    public HttpDataSource$HttpDataSourceException(int i11, IOException iOException, String str) {
        super(str, iOException, i11 == 2000 ? 2001 : i11);
        this.f2116c = 1;
    }
}
