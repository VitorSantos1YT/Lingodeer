package av;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.os.Build;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f3162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AudioRecord f3163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f3167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AudioManager f3168g;

    public j0(Context context, int i11) {
        Context applicationContext;
        AudioManager audioManager = null;
        context = (i11 & 4) != 0 ? null : context;
        this.f3162a = new AtomicBoolean(false);
        this.f3165d = BuildConfig.VERSION_NAME;
        this.f3167f = new Object();
        if (context != null && (applicationContext = context.getApplicationContext()) != null) {
            audioManager = (AudioManager) applicationContext.getSystemService(AudioManager.class);
        }
        this.f3168g = audioManager;
    }

    public static final void a(j0 j0Var, AudioRecord audioRecord) {
        AudioDeviceInfo audioDeviceInfo;
        AudioManager audioManager = j0Var.f3168g;
        if (audioManager != null) {
            AudioDeviceInfo[] devices = audioManager.getDevices(1);
            kotlin.jvm.internal.m.e(devices, "getDevices(...)");
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo audioDeviceInfo2 : devices) {
                if (audioDeviceInfo2.isSource()) {
                    arrayList.add(audioDeviceInfo2);
                }
            }
            sy.c cVarO = ns.o.o();
            if (Build.VERSION.SDK_INT >= 26) {
                cVarO.add(22);
            }
            cVarO.add(11);
            cVarO.add(12);
            cVarO.add(3);
            ListIterator listIterator = ns.o.e(cVarO).listIterator(0);
            do {
                sy.a aVar = (sy.a) listIterator;
                audioDeviceInfo = null;
                Object obj = null;
                if (!aVar.hasNext()) {
                    break;
                }
                int iIntValue = ((Number) aVar.next()).intValue();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    if (((AudioDeviceInfo) obj2).getType() == iIntValue) {
                        obj = obj2;
                        break;
                    }
                }
                audioDeviceInfo = (AudioDeviceInfo) obj;
            } while (audioDeviceInfo == null);
            if (audioDeviceInfo == null) {
                return;
            }
            audioRecord.setPreferredDevice(audioDeviceInfo);
            audioDeviceInfo.getType();
            Objects.toString(audioDeviceInfo.getProductName());
        }
    }

    public final void b() {
        synchronized (this.f3167f) {
            f();
            d();
        }
    }

    public final boolean c(long j11) {
        return j11 == this.f3166e && this.f3162a.get();
    }

    public final void d() {
        AudioRecord audioRecord = this.f3163b;
        this.f3163b = null;
        if (audioRecord != null) {
            try {
                if (audioRecord.getState() == 1) {
                    try {
                        audioRecord.stop();
                    } catch (Exception unused) {
                    }
                    audioRecord.release();
                }
            } catch (Exception unused2) {
            }
        }
    }

    public final Object e(String str, fz.c cVar, xy.i iVar) {
        Object objL = rz.e0.l(new i0(this, str, cVar, null), iVar);
        return objL == wy.a.COROUTINE_SUSPENDED ? objL : qy.b0.f48488a;
    }

    public final File f() {
        if (!this.f3162a.get()) {
            return null;
        }
        synchronized (this.f3167f) {
            this.f3162a.set(false);
            d();
        }
        File file = new File(this.f3165d);
        if (!file.exists() || file.length() <= 0) {
            return null;
        }
        try {
            new ax.b(this.f3165d, 1).a();
            return file;
        } catch (Exception unused) {
            return null;
        }
    }
}
