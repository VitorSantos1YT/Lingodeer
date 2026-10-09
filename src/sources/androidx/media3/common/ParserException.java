package androidx.media3.common;

import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ParserException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2111b;

    public ParserException(String str, Throwable th2, boolean z11, int i11) {
        super(str, th2);
        this.f2110a = z11;
        this.f2111b = i11;
    }

    public static ParserException a(RuntimeException runtimeException, String str) {
        return new ParserException(str, runtimeException, true, 1);
    }

    public static ParserException b(String str, Exception exc) {
        return new ParserException(str, exc, true, 4);
    }

    public static ParserException c(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(message != null ? message.concat(" ") : BuildConfig.VERSION_NAME);
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f2110a);
        sb2.append(", dataType=");
        return p0.i(this.f2111b, "}", sb2);
    }
}
