package d7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface f extends y6.h {
    void c(q qVar);

    void close();

    default Map p() {
        return Collections.EMPTY_MAP;
    }

    long u(h hVar);

    Uri x();
}
