package b7;

import android.content.Intent;
import android.content.IntentSender;
import f0.g1;
import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3998d;

    public /* synthetic */ j(Object obj, int i11, int i12, Object obj2) {
        this.f3995a = i12;
        this.f3997c = obj;
        this.f3996b = i11;
        this.f3998d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3995a) {
            case 0:
                CopyOnWriteArraySet<m> copyOnWriteArraySet = (CopyOnWriteArraySet) this.f3997c;
                k kVar = (k) this.f3998d;
                for (m mVar : copyOnWriteArraySet) {
                    if (!mVar.f4002d) {
                        int i11 = this.f3996b;
                        if (i11 != -1) {
                            mVar.f4000b.a(i11);
                        }
                        mVar.f4001c = true;
                        kVar.invoke(mVar.f3999a);
                    }
                }
                break;
            case 1:
                f.l lVar = (f.l) this.f3997c;
                Serializable serializable = (Serializable) ((hd.b) this.f3998d).f32184b;
                String str = (String) lVar.f33879a.get(Integer.valueOf(this.f3996b));
                if (str != null) {
                    i.e eVar = (i.e) lVar.f33883e.get(str);
                    if ((eVar != null ? eVar.f33870a : null) == null) {
                        lVar.f33885g.remove(str);
                        lVar.f33884f.put(str, serializable);
                    } else {
                        i.b bVar = eVar.f33870a;
                        kotlin.jvm.internal.m.d(bVar, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                        if (lVar.f33882d.remove(str)) {
                            bVar.f(serializable);
                        }
                    }
                    break;
                }
                break;
            case 2:
                ((f.l) this.f3997c).a(this.f3996b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f3998d));
                break;
            default:
                ((u9.c) ((g1) this.f3997c).f26280c).e(this.f3996b, this.f3998d);
                break;
        }
    }
}
