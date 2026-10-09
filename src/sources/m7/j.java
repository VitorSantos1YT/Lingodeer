package m7;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f40981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f40982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LoudnessCodecController f40983c;

    public j() {
        i iVar = i.f40979a;
        this.f40981a = new HashSet();
        this.f40982b = iVar;
    }

    public final void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f40983c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            b7.a.j(this.f40981a.add(mediaCodec));
        }
    }

    public final void b() {
        this.f40981a.clear();
        LoudnessCodecController loudnessCodecController = this.f40983c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f40981a.remove(mediaCodec) || (loudnessCodecController = this.f40983c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void d(int i11) {
        LoudnessCodecController loudnessCodecController = this.f40983c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f40983c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i11, MoreExecutors.a(), new h(this));
        this.f40983c = loudnessCodecControllerCreate;
        Iterator it = this.f40981a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
