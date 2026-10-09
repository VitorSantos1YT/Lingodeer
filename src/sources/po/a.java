package po;

import am.rVFB.LwKl;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import cj.b;
import com.bumptech.glide.e;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import ot.f2;
import qy.b0;
import rz.e0;
import vy.d;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioRecord f46962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f46963d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AudioManager f46965f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f46960a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f46961b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f46964e = LwKl.KTZCE;

    public static Object b(a aVar, String str, i iVar) {
        f2 f2Var = new f2(2);
        aVar.getClass();
        Object objL = e0.l(new b(aVar, str, f2Var, (d) null), iVar);
        return objL == wy.a.COROUTINE_SUSPENDED ? objL : b0.f48488a;
    }

    public final void a() throws IOException {
        c();
        AudioRecord audioRecord = this.f46962c;
        if (audioRecord != null && audioRecord.getState() == 1) {
            try {
                audioRecord.stop();
                audioRecord.release();
            } catch (Throwable th2) {
                e.l(th2);
            }
        }
        this.f46962c = null;
    }

    public final void c() throws IOException {
        File file = new File(this.f46964e);
        AtomicBoolean atomicBoolean = this.f46961b;
        boolean z11 = atomicBoolean.get();
        AtomicBoolean atomicBoolean2 = this.f46960a;
        if (z11) {
            atomicBoolean.set(false);
            atomicBoolean2.set(false);
            file.exists();
        } else if (atomicBoolean2.get()) {
            atomicBoolean2.set(false);
            if (file.exists()) {
                new c7.a(this.f46964e, 2).b();
            }
            file.exists();
        }
    }

    public a(Context context) {
        AudioManager audioManager;
        Context applicationContext;
        if (context != null && (applicationContext = context.getApplicationContext()) != null) {
            audioManager = (AudioManager) applicationContext.getSystemService(AudioManager.class);
        } else {
            audioManager = null;
        }
        this.f46965f = audioManager;
    }
}
