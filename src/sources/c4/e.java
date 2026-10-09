package c4;

import android.view.View;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f6545c = new e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f6546d = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Serializable f6548b;

    public e(int i11) {
        this.f6547a = i11;
        switch (i11) {
            case 1:
                this.f6548b = new HashMap();
                break;
            default:
                this.f6548b = "identity";
                break;
        }
    }

    public static e d(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new d(str);
        }
        if (str.startsWith("spline")) {
            l lVar = new l(0);
            lVar.f6548b = str;
            double[] dArr = new double[str.length() / 2];
            int iIndexOf = str.indexOf(40) + 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i11 = 0;
            while (iIndexOf2 != -1) {
                dArr[i11] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i11++;
            }
            dArr[i11] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr, i11 + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d5 = 1.0d / ((double) length2);
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
            double[] dArr3 = new double[length];
            for (int i12 = 0; i12 < dArrCopyOf.length; i12++) {
                double d11 = dArrCopyOf[i12];
                int i13 = i12 + length2;
                dArr2[i13][0] = d11;
                double d12 = ((double) i12) * d5;
                dArr3[i13] = d12;
                if (i12 > 0) {
                    int i14 = (length2 * 2) + i12;
                    dArr2[i14][0] = d11 + 1.0d;
                    dArr3[i14] = d12 + 1.0d;
                    int i15 = i12 - 1;
                    dArr2[i15][0] = (d11 - 1.0d) - d5;
                    dArr3[i15] = (d12 - 1.0d) - d5;
                }
            }
            i iVar = new i(dArr3, dArr2);
            System.out.println(" 0 " + iVar.p(0.0d));
            System.out.println(" 1 " + iVar.p(1.0d));
            lVar.f6580e = iVar;
            return lVar;
        }
        if (str.startsWith("Schlick")) {
            j jVar = new j(0);
            jVar.f6548b = str;
            int iIndexOf3 = str.indexOf(40);
            int iIndexOf4 = str.indexOf(44, iIndexOf3);
            jVar.f6569e = Double.parseDouble(str.substring(iIndexOf3 + 1, iIndexOf4).trim());
            int i16 = iIndexOf4 + 1;
            jVar.f6570f = Double.parseDouble(str.substring(i16, str.indexOf(44, i16)).trim());
            return jVar;
        }
        switch (str) {
            case "accelerate":
                return new d("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new d("cubic(0.0, 0.0, 0.2, 0.95)");
            case "anticipate":
                return new d("cubic(0.36, 0, 0.66, -0.56)");
            case "linear":
                return new d("cubic(1, 1, 0, 0)");
            case "overshoot":
                return new d("cubic(0.34, 1.56, 0.64, 1)");
            case "standard":
                return new d("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f6546d));
                return f6545c;
        }
    }

    public double b(double d5) {
        return 1.0d;
    }

    public float c(View view, String str) {
        HashMap map;
        float[] fArr;
        HashMap map2 = (HashMap) this.f6548b;
        if (map2.containsKey(view) && (map = (HashMap) map2.get(view)) != null && map.containsKey(str) && (fArr = (float[]) map.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }

    public String toString() {
        switch (this.f6547a) {
            case 0:
                return (String) this.f6548b;
            default:
                return super.toString();
        }
    }

    public double a(double d5) {
        return d5;
    }
}
