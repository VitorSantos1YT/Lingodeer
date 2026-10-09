package wc;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import y.u0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f54959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f54960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f54961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f54962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f54963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u0 f54964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y.r f54965i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f54966j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f54967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f54968l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f54969n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f54970o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f54957a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f54958b = new HashSet();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f54971p = 0;

    public final void a(String str) {
        kd.d.b(str);
        this.f54958b.add(str);
    }

    public final float b() {
        return (long) (((this.m - this.f54968l) / this.f54969n) * 1000.0f);
    }

    public final Map c() {
        float fC = kd.k.c();
        if (fC != this.f54961e) {
            for (Map.Entry entry : this.f54960d.entrySet()) {
                HashMap map = this.f54960d;
                String str = (String) entry.getKey();
                x xVar = (x) entry.getValue();
                float f5 = this.f54961e / fC;
                int i11 = (int) (xVar.f55037a * f5);
                int i12 = (int) (xVar.f55038b * f5);
                x xVar2 = new x(xVar.f55039c, i11, xVar.f55040d, i12, xVar.f55041e);
                Bitmap bitmap = xVar.f55042f;
                if (bitmap != null) {
                    xVar2.f55042f = Bitmap.createScaledBitmap(bitmap, i11, i12, true);
                }
                map.put(str, xVar2);
            }
        }
        this.f54961e = fC;
        return this.f54960d;
    }

    public final dd.i d(String str) {
        int size = this.f54963g.size();
        for (int i11 = 0; i11 < size; i11++) {
            dd.i iVar = (dd.i) this.f54963g.get(i11);
            String str2 = iVar.f23383a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return iVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        ArrayList arrayList = this.f54966j;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            sb2.append(((gd.i) obj).a("\t"));
        }
        return sb2.toString();
    }
}
