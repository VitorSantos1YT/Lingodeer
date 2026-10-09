package av;

import android.media.MediaRecorder;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements MediaRecorder.OnInfoListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3106b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f3105a = i11;
        this.f3106b = obj;
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public final void onInfo(MediaRecorder mediaRecorder, int i11, int i12) {
        switch (this.f3105a) {
            case 0:
                b bVar = (b) this.f3106b;
                if (i11 != 800) {
                    bVar.getClass();
                } else {
                    bVar.f3111d = false;
                    a5.f fVar = bVar.f3108a;
                    if (fVar != null) {
                        fVar.r();
                    }
                }
                break;
            default:
                bq.f fVar2 = (bq.f) this.f3106b;
                if (i11 == 800) {
                    fVar2.t();
                }
                break;
        }
    }
}
