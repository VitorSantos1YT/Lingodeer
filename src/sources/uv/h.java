package uv;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import vd.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53208a;

    public /* synthetic */ h(int i11) {
        this.f53208a = i11;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f53208a) {
            case 0:
                int i11 = message.what;
                if (i11 == 1) {
                    ((j) message.obj).a();
                } else if (i11 == 2) {
                    ArrayList arrayList = (ArrayList) message.obj;
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        j jVar = (j) obj;
                        if (!i.a(jVar)) {
                            jVar.a();
                        }
                    }
                    arrayList.clear();
                    g.f53207a.b();
                }
                return true;
            default:
                if (message.what != 1) {
                    return false;
                }
                ((b0) message.obj).b();
                return true;
        }
    }
}
