package androidx.media3.datasource;

import java.util.Map;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f2118e;

    public HttpDataSource$InvalidResponseCodeException(int i11, DataSourceException dataSourceException, Map map) {
        super(2004, dataSourceException, p.j(i11, "Response code: "));
        this.f2117d = i11;
        this.f2118e = map;
    }
}
