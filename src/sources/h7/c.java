package h7;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import b7.f0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ObjectArrays;
import com.google.common.collect.UnmodifiableListIterator;
import com.google.common.primitives.Ints;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f31829c = new c(ImmutableList.u(b.f31820d));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ImmutableList f31830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ImmutableMap f31831e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f31832a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31833b;

    static {
        Object[] objArr = {2, 5, 6};
        ObjectArrays.a(3, objArr);
        f31830d = ImmutableList.k(3, objArr);
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        builder.c(5, 6);
        builder.c(17, 6);
        builder.c(7, 6);
        builder.c(30, 10);
        builder.c(18, 6);
        builder.c(6, 8);
        builder.c(8, 8);
        builder.c(14, 8);
        f31831e = builder.a(true);
    }

    public c(List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            b bVar = (b) list.get(i11);
            this.f31832a.put(bVar.f31821a, bVar);
        }
        int iMax = 0;
        for (int i12 = 0; i12 < this.f31832a.size(); i12++) {
            iMax = Math.max(iMax, ((b) this.f31832a.valueAt(i12)).f31822b);
        }
        this.f31833b = iMax;
    }

    public static ImmutableList a(int[] iArr, int i11) {
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i12 : iArr) {
            builder.h(new b(i12, i11));
        }
        return builder.j();
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:52:0x0100  */
    public static c b(Context context, Intent intent, y6.d dVar, a5.j jVar) {
        AudioManager audioManagerF = z6.c.f(context);
        if (jVar == null) {
            jVar = Build.VERSION.SDK_INT >= 33 ? a5.e.b(audioManagerF, dVar) : null;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33 && (f0.J(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            return a5.e.a(audioManagerF, dVar);
        }
        AudioDeviceInfo[] devices = jVar == null ? audioManagerF.getDevices(2) : new AudioDeviceInfo[]{(AudioDeviceInfo) jVar.f385b};
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        builder.i(8, 7);
        if (i11 >= 31) {
            builder.i(26, 27);
        }
        if (i11 >= 33) {
            builder.a(30);
        }
        ImmutableSet immutableSetK = builder.k();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (immutableSetK.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return f31829c;
            }
        }
        ImmutableSet.Builder builder2 = new ImmutableSet.Builder();
        builder2.a(2);
        if (Build.VERSION.SDK_INT >= 29 && (f0.J(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            builder2.j(a.a(dVar));
            return new c(a(Ints.f(builder2.k()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z11 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z11) {
            String str = Build.MANUFACTURER;
            if (str.equals("Amazon") || str.equals("Xiaomi")) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    builder2.j(f31830d);
                }
            }
        } else if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            builder2.j(f31830d);
        }
        if (intent == null || z11 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new c(a(Ints.f(builder2.k()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            builder2.j(Ints.a(intArrayExtra));
        }
        return new c(a(Ints.f(builder2.k()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    public static c c(Context context, y6.d dVar, a5.j jVar) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), dVar, jVar);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00cd  */
    public final Pair d(y6.d dVar, y6.p pVar) {
        String str = pVar.f57291n;
        str.getClass();
        int iD = y6.d0.d(str, pVar.f57289k);
        Integer numValueOf = Integer.valueOf(iD);
        ImmutableMap immutableMap = f31831e;
        if (!immutableMap.containsKey(numValueOf)) {
            return null;
        }
        int i11 = 6;
        SparseArray sparseArray = this.f31832a;
        if (iD == 18 && !f0.i(sparseArray, 18)) {
            iD = 6;
        } else if ((iD == 8 && !f0.i(sparseArray, 8)) || (iD == 30 && !f0.i(sparseArray, 30))) {
            iD = 7;
        }
        if (!f0.i(sparseArray, iD)) {
            return null;
        }
        b bVar = (b) sparseArray.get(iD);
        bVar.getClass();
        int iIntValue = bVar.f31822b;
        ImmutableSet immutableSet = bVar.f31823c;
        int i12 = pVar.F;
        boolean zContains = false;
        if (i12 == -1 || iD == 18) {
            int i13 = pVar.G;
            if (i13 == -1) {
                i13 = 48000;
            }
            int i14 = bVar.f31821a;
            if (immutableSet == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    iIntValue = a.b(i14, i13, dVar);
                } else {
                    Object obj = immutableMap.get(Integer.valueOf(i14));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i12 = iIntValue;
        } else if (!pVar.f57291n.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (immutableSet != null) {
                int iP = f0.p(i12);
                if (iP != 0) {
                    zContains = immutableSet.contains(Integer.valueOf(iP));
                }
            } else if (i12 <= iIntValue) {
                zContains = true;
            }
            if (!zContains) {
                return null;
            }
        } else if (i12 > 10) {
            return null;
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 > 28) {
            i11 = i12;
        } else if (i12 == 7) {
            i11 = 8;
        } else if (i12 != 3 && i12 != 4 && i12 != 5) {
            i11 = i12;
        }
        if (i15 <= 26 && "fugu".equals(Build.DEVICE) && i11 == 1) {
            i11 = 2;
        }
        int iP2 = f0.p(i11);
        if (iP2 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iD), Integer.valueOf(iP2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f0.j(this.f31832a, cVar.f31832a) && this.f31833b == cVar.f31833b;
    }

    public final int hashCode() {
        return (f0.k(this.f31832a) * 31) + this.f31833b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f31833b + ", audioProfiles=" + this.f31832a + "]";
    }
}
