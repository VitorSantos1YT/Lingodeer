package f;

import android.os.Bundle;
import androidx.lifecycle.internal.SavedStateHandleImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements da.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26141b;

    public /* synthetic */ e(Object obj, int i11) {
        this.f26140a = i11;
        this.f26141b = obj;
    }

    @Override // da.d
    public final Bundle saveState() {
        switch (this.f26140a) {
            case 0:
                return n.h((n) this.f26141b);
            case 1:
                return SavedStateHandleImpl.savedStateProvider$lambda$0((SavedStateHandleImpl) this.f26141b);
            default:
                Map mapA = ((w1.f) this.f26141b).a();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : mapA.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
        }
    }
}
