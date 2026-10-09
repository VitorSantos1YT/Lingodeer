package h4;

import android.graphics.Rect;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import com.yalantis.ucrop.view.CropImageView;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31740c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f31738a = CropImageView.DEFAULT_ASPECT_RATIO;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31739b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f31741d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f31742e = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f31743f = CropImageView.DEFAULT_ASPECT_RATIO;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f31744t = CropImageView.DEFAULT_ASPECT_RATIO;
    public float H = CropImageView.DEFAULT_ASPECT_RATIO;
    public float K = 1.0f;
    public float L = 1.0f;
    public float M = Float.NaN;
    public float N = Float.NaN;
    public float O = CropImageView.DEFAULT_ASPECT_RATIO;
    public float P = CropImageView.DEFAULT_ASPECT_RATIO;
    public float Q = CropImageView.DEFAULT_ASPECT_RATIO;
    public float R = Float.NaN;
    public float S = Float.NaN;

    public static boolean b(float f5, float f11) {
        if (Float.isNaN(f5) || Float.isNaN(f11)) {
            return Float.isNaN(f5) != Float.isNaN(f11);
        }
        return Math.abs(f5 - f11) > 1.0E-6f;
    }

    public final void c(Rect rect, j4.p pVar, int i11, int i12) {
        rect.width();
        rect.height();
        j4.k kVarH = pVar.h(i12);
        j4.n nVar = kVarH.f35927c;
        j4.m mVar = kVarH.f35928d;
        int i13 = nVar.f35990c;
        this.f31739b = i13;
        int i14 = nVar.f35989b;
        this.f31740c = i14;
        this.f31742e = (i14 == 0 || i13 != 0) ? nVar.f35991d : CropImageView.DEFAULT_ASPECT_RATIO;
        j4.o oVar = kVarH.f35930f;
        boolean z11 = oVar.m;
        this.f31743f = oVar.f36006n;
        this.f31744t = oVar.f35995b;
        this.H = oVar.f35996c;
        this.f31738a = oVar.f35997d;
        this.K = oVar.f35998e;
        this.L = oVar.f35999f;
        this.M = oVar.f36000g;
        this.N = oVar.f36001h;
        this.O = oVar.f36003j;
        this.P = oVar.f36004k;
        this.Q = oVar.f36005l;
        c4.e.d(mVar.f35979d);
        this.R = mVar.f35983h;
        this.S = kVarH.f35927c.f35992e;
        for (String str : kVarH.f35931g.keySet()) {
            j4.b bVar = (j4.b) kVarH.f35931g.get(str);
            int iOrdinal = bVar.f35840c.ordinal();
            if (iOrdinal != 4 && iOrdinal != 5 && iOrdinal != 7) {
                this.f31741d.put(str, bVar);
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return;
                    }
                }
            }
            float f5 = this.f31744t + 90.0f;
            this.f31744t = f5;
            if (f5 > 180.0f) {
                this.f31744t = f5 - 360.0f;
                return;
            }
            return;
        }
        this.f31744t -= 90.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((o) obj).getClass();
        return Float.compare(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public final void a(HashMap map, int i11) {
        for (String str : map.keySet()) {
            g4.l lVar = (g4.l) map.get(str);
            if (lVar != null) {
                str.getClass();
                byte b3 = -1;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            b3 = 0;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            b3 = 1;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b3 = 2;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b3 = 3;
                        }
                        break;
                    case -1225497655:
                        if (str.equals(SemtNwfPgIhi.ovEkMVx)) {
                            b3 = 4;
                        }
                        break;
                    case -1001078227:
                        if (str.equals(kHfjNGauVgdF.NDAWpwJDauKsHs)) {
                            b3 = 5;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b3 = 6;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            b3 = 7;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            b3 = 8;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            b3 = 9;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            b3 = 10;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b3 = 11;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b3 = 12;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b3 = 13;
                        }
                        break;
                }
                float f5 = 1.0f;
                float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
                switch (b3) {
                    case 0:
                        if (!Float.isNaN(this.H)) {
                            f11 = this.H;
                        }
                        lVar.b(i11, f11);
                        break;
                    case 1:
                        if (!Float.isNaN(this.f31738a)) {
                            f11 = this.f31738a;
                        }
                        lVar.b(i11, f11);
                        break;
                    case 2:
                        if (!Float.isNaN(this.O)) {
                            f11 = this.O;
                        }
                        lVar.b(i11, f11);
                        break;
                    case 3:
                        if (!Float.isNaN(this.P)) {
                            f11 = this.P;
                        }
                        lVar.b(i11, f11);
                        break;
                    case 4:
                        if (!Float.isNaN(this.Q)) {
                            f11 = this.Q;
                        }
                        lVar.b(i11, f11);
                        break;
                    case 5:
                        if (!Float.isNaN(this.S)) {
                            f11 = this.S;
                        }
                        lVar.b(i11, f11);
                        break;
                    case 6:
                        if (!Float.isNaN(this.K)) {
                            f5 = this.K;
                        }
                        lVar.b(i11, f5);
                        break;
                    case 7:
                        if (!Float.isNaN(this.L)) {
                            f5 = this.L;
                        }
                        lVar.b(i11, f5);
                        break;
                    case 8:
                        if (!Float.isNaN(this.M)) {
                            f11 = this.M;
                        }
                        lVar.b(i11, f11);
                        break;
                    case 9:
                        if (!Float.isNaN(this.N)) {
                            f11 = this.N;
                        }
                        lVar.b(i11, f11);
                        break;
                    case 10:
                        if (!Float.isNaN(this.f31744t)) {
                            f11 = this.f31744t;
                        }
                        lVar.b(i11, f11);
                        break;
                    case 11:
                        if (!Float.isNaN(this.f31743f)) {
                            f11 = this.f31743f;
                        }
                        lVar.b(i11, f11);
                        break;
                    case 12:
                        if (!Float.isNaN(this.R)) {
                            f11 = this.R;
                        }
                        lVar.b(i11, f11);
                        break;
                    case 13:
                        if (!Float.isNaN(this.f31742e)) {
                            f5 = this.f31742e;
                        }
                        lVar.b(i11, f5);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            LinkedHashMap linkedHashMap = this.f31741d;
                            if (linkedHashMap.containsKey(str2)) {
                                j4.b bVar = (j4.b) linkedHashMap.get(str2);
                                if (lVar instanceof g4.i) {
                                    ((g4.i) lVar).f28753f.append(i11, bVar);
                                } else {
                                    bVar.a();
                                    lVar.toString();
                                }
                            }
                        }
                        break;
                }
            }
        }
    }
}
