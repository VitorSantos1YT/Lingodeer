package wd;

import android.graphics.Bitmap;
import android.os.Build;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import pe.m;
import qh.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f55087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f55088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f55089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f55090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f55091h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f55092a = new e(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f55093b = new z(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f55094c = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f55087d = configArr;
        f55088e = configArr;
        f55089f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f55090g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f55091h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i11, Bitmap.Config config) {
        return "[" + i11 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(m.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    public final Bitmap b(int i11, int i12, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iD = m.d(config) * i11 * i12;
        e eVar = this.f55092a;
        g gVarS0 = (g) ((ArrayDeque) eVar.f3561b).poll();
        if (gVarS0 == null) {
            gVarS0 = eVar.s0();
        }
        i iVar = (i) gVarS0;
        iVar.f55085b = iD;
        iVar.f55086c = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i13 = h.f55083a[config.ordinal()];
            if (i13 == 1) {
                configArr = f55087d;
            } else if (i13 == 2) {
                configArr = f55089f;
            } else if (i13 != 3) {
                configArr = i13 != 4 ? new Bitmap.Config[]{config} : f55091h;
            } else {
                configArr = f55090g;
            }
        } else {
            configArr = f55088e;
        }
        for (Bitmap.Config config2 : configArr) {
            Integer num = (Integer) d(config2).ceilingKey(Integer.valueOf(iD));
            if (num != null && num.intValue() <= iD * 8) {
                if (num.intValue() == iD && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                eVar.i0(iVar);
                int iIntValue = num.intValue();
                g gVarS1 = (g) ((ArrayDeque) eVar.f3561b).poll();
                if (gVarS1 == null) {
                    gVarS1 = eVar.s0();
                }
                iVar = (i) gVarS1;
                iVar.f55085b = iIntValue;
                iVar.f55086c = config2;
                break;
            }
        }
        Bitmap bitmap = (Bitmap) this.f55093b.d(iVar);
        if (bitmap != null) {
            a(Integer.valueOf(iVar.f55085b), bitmap);
            bitmap.reconfigure(i11, i12, config);
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap map = this.f55094c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int iC = m.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        e eVar = this.f55092a;
        g gVarS0 = (g) ((ArrayDeque) eVar.f3561b).poll();
        if (gVarS0 == null) {
            gVarS0 = eVar.s0();
        }
        i iVar = (i) gVarS0;
        iVar.f55085b = iC;
        iVar.f55086c = config;
        this.f55093b.g(iVar, bitmap);
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num = (Integer) navigableMapD.get(Integer.valueOf(iVar.f55085b));
        navigableMapD.put(Integer.valueOf(iVar.f55085b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbN = ep.a.n("SizeConfigStrategy{groupedMap=");
        sbN.append(this.f55093b);
        sbN.append(", sortedSizes=(");
        HashMap map = this.f55094c;
        for (Map.Entry entry : map.entrySet()) {
            sbN.append(entry.getKey());
            sbN.append('[');
            sbN.append(entry.getValue());
            sbN.append("], ");
        }
        if (!map.isEmpty()) {
            sbN.replace(sbN.length() - 2, sbN.length(), BuildConfig.VERSION_NAME);
        }
        sbN.append(")}");
        return sbN.toString();
    }
}
