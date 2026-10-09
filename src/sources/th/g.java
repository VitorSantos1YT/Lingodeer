package th;

import android.media.AudioRecord;
import android.media.AudioTrack;
import bq.r;
import ci.m0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f52420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f52421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m0 f52422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AudioRecord f52423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AudioTrack f52424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f52425f;

    public g() {
        int i11;
        int[] iArr = r.f4959a;
        int[] iArr2 = {8000, 11025, 16000, 22050, 32000, 37800, 44056, 44100, 47250, 48000, 50000, 50400, 88200, 96000, 176400, 192000, 352800, 2822400, 5644800};
        int i12 = 0;
        while (true) {
            i11 = -1;
            if (i12 < 19) {
                int minBufferSize = AudioRecord.getMinBufferSize(iArr2[i12], 16, 2);
                if (minBufferSize != -1 && minBufferSize != -2 && minBufferSize > 0) {
                    i11 = iArr2[i12];
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        this.f52425f = i11;
    }

    public final void a() {
        this.f52421b = false;
        AudioTrack audioTrack = this.f52424e;
        if (audioTrack == null || audioTrack.getState() != 1) {
            return;
        }
        AudioTrack audioTrack2 = this.f52424e;
        if (audioTrack2 != null) {
            audioTrack2.pause();
        }
        AudioTrack audioTrack3 = this.f52424e;
        if (audioTrack3 != null) {
            audioTrack3.flush();
        }
        AudioTrack audioTrack4 = this.f52424e;
        if (audioTrack4 != null) {
            audioTrack4.release();
        }
    }
}
