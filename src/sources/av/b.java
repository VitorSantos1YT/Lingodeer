package av;

import android.media.MediaRecorder;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a5.f f3108a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3109b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediaRecorder f3110c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3111d = false;

    public final void a(String str) {
        this.f3109b = str;
        MediaRecorder mediaRecorder = this.f3110c;
        if (mediaRecorder == null) {
            this.f3110c = new MediaRecorder();
        } else {
            mediaRecorder.reset();
        }
        try {
            this.f3110c.setAudioSource(1);
            this.f3110c.setOutputFormat(2);
            this.f3110c.setOutputFile(this.f3109b);
            this.f3110c.setAudioEncoder(3);
            this.f3110c.setMaxDuration(600000);
            this.f3110c.setOnInfoListener(new a(this, 0));
            try {
                this.f3110c.prepare();
                this.f3110c.start();
                this.f3111d = true;
            } catch (IOException e8) {
                e8.getMessage();
                a5.f fVar = this.f3108a;
                if (fVar != null) {
                    fVar.r();
                }
            } catch (IllegalStateException e10) {
                e10.getMessage();
                a5.f fVar2 = this.f3108a;
                if (fVar2 != null) {
                    fVar2.r();
                }
                this.f3110c.reset();
                this.f3110c.release();
                this.f3110c = new MediaRecorder();
            } catch (RuntimeException e11) {
                e11.getMessage();
                a5.f fVar3 = this.f3108a;
                if (fVar3 != null) {
                    fVar3.r();
                }
                this.f3110c.reset();
                this.f3110c.release();
                this.f3110c = new MediaRecorder();
            }
        } catch (RuntimeException e12) {
            e12.getMessage();
            e12.printStackTrace();
            this.f3111d = false;
            a5.f fVar4 = this.f3108a;
            if (fVar4 != null) {
                fVar4.r();
            }
        } catch (Exception e13) {
            e13.getMessage();
            e13.printStackTrace();
            this.f3111d = false;
            a5.f fVar5 = this.f3108a;
            if (fVar5 != null) {
                fVar5.r();
            }
        }
    }

    public final void b() {
        try {
            MediaRecorder mediaRecorder = this.f3110c;
            if (mediaRecorder != null && this.f3111d) {
                mediaRecorder.stop();
                this.f3110c.reset();
            }
            a5.f fVar = this.f3108a;
            if (fVar != null) {
                fVar.r();
            }
            this.f3111d = false;
        } catch (IllegalStateException e8) {
            e8.printStackTrace();
            a5.f fVar2 = this.f3108a;
            if (fVar2 != null) {
                fVar2.r();
            }
            this.f3111d = false;
            MediaRecorder mediaRecorder2 = this.f3110c;
            if (mediaRecorder2 != null) {
                mediaRecorder2.reset();
                this.f3110c.release();
                this.f3110c = null;
            }
        } catch (RuntimeException e10) {
            e10.printStackTrace();
            a5.f fVar3 = this.f3108a;
            if (fVar3 != null) {
                fVar3.r();
            }
            this.f3111d = false;
            MediaRecorder mediaRecorder3 = this.f3110c;
            if (mediaRecorder3 != null) {
                mediaRecorder3.reset();
                this.f3110c.release();
                this.f3110c = null;
            }
        }
    }
}
