package uv;

import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f53239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f53240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53241c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v f53242d = new v(new WeakReference(this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t7.d f53243e;

    public w(t7.d dVar) {
        this.f53243e = dVar;
    }

    public final void a(int i11) {
        Handler handler = this.f53239a;
        if (handler == null || this.f53240b == null) {
            o00.a.P(this, "need go next %d, but params is not ready %s %s", Integer.valueOf(i11), this.f53239a, this.f53240b);
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.arg1 = i11;
        this.f53239a.sendMessage(messageObtainMessage);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i11 = message.what;
        if (i11 == 1) {
            if (message.arg1 < this.f53240b.size()) {
                int i12 = message.arg1;
                this.f53241c = i12;
                b bVar = (b) this.f53240b.get(i12);
                synchronized (bVar.f53194p) {
                    try {
                        if (bVar.f53180a.f53199d == 0 && !f.f53206a.h(bVar)) {
                            v vVar = this.f53242d;
                            vVar.f53238b = this.f53241c + 1;
                            if (bVar.f53183d == null) {
                                bVar.f53183d = new ArrayList();
                            }
                            if (!bVar.f53183d.contains(vVar)) {
                                bVar.f53183d.add(vVar);
                            }
                            bVar.f();
                            return true;
                        }
                        a(message.arg1 + 1);
                        return true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            synchronized (((SparseArray) this.f53243e.f52059b)) {
                ((SparseArray) this.f53243e.f52059b).remove(((b) this.f53240b.get(0)).f53192n);
            }
            Handler handler = this.f53239a;
            if (handler != null && handler.getLooper() != null) {
                this.f53239a.getLooper().quit();
                this.f53239a = null;
                this.f53240b = null;
                this.f53242d = null;
                return true;
            }
        } else {
            if (i11 == 2) {
                b bVar2 = (b) this.f53240b.get(this.f53241c);
                bVar2.getClass();
                v vVar2 = this.f53242d;
                ArrayList arrayList = bVar2.f53183d;
                if (arrayList != null) {
                    arrayList.remove(vVar2);
                }
                this.f53239a.removeCallbacksAndMessages(null);
                return true;
            }
            if (i11 == 3) {
                a(this.f53241c);
            }
        }
        return true;
    }
}
