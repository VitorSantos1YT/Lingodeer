package androidx.media3.datasource;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class DataSourceException extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2114b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2115a;

    public DataSourceException(int i11) {
        this.f2115a = i11;
    }

    public DataSourceException(Exception exc, int i11) {
        super(exc);
        this.f2115a = i11;
    }

    public DataSourceException(String str, Exception exc, int i11) {
        super(str, exc);
        this.f2115a = i11;
    }
}
