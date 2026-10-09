package x7;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface p {
    m[] c();

    default m[] g(Uri uri, Map map) {
        return c();
    }
}
