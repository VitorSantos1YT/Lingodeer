package o3;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class m extends l {
    @Override // o3.l, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i11, Bundle bundle) {
        b1.x xVar = this.f44687b;
        if (xVar != null) {
            return xVar.commitContent(inputContentInfo, i11, bundle);
        }
        return false;
    }
}
