package j4;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Placeholder;
import androidx.constraintlayout.widget.VirtualLayout;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f35890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f35897h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f35897h = constraintLayout;
        this.f35890a = constraintLayout2;
    }

    public static boolean a(int i11, int i12, int i13) {
        if (i11 == i12) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i13 == size;
        }
        return false;
    }

    public final void b(d4.g gVar, e4.b bVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int iMax2;
        boolean z11;
        int baseline;
        int i11;
        int childMeasureSpec;
        if (gVar == null) {
            return;
        }
        d4.d dVar = gVar.L;
        d4.d dVar2 = gVar.J;
        if (gVar.f23133i0 == 8 && !gVar.F) {
            bVar.f24782e = 0;
            bVar.f24783f = 0;
            bVar.f24784g = 0;
            return;
        }
        if (gVar.V == null) {
            return;
        }
        v vVar = ConstraintLayout.R;
        d4.f fVar = bVar.f24778a;
        d4.f fVar2 = bVar.f24779b;
        int i12 = bVar.f24780c;
        int i13 = bVar.f24781d;
        int i14 = this.f35891b + this.f35892c;
        int i15 = this.f35893d;
        View view = gVar.f23131h0;
        int[] iArr = c.f35846a;
        int i16 = iArr[fVar.ordinal()];
        if (i16 != 1) {
            if (i16 == 2) {
                childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f35895f, i15, -2);
            } else if (i16 == 3) {
                int i17 = this.f35895f;
                int i18 = dVar2 != null ? dVar2.f23112g : 0;
                if (dVar != null) {
                    i18 += dVar.f23112g;
                }
                childMeasureSpec = ViewGroup.getChildMeasureSpec(i17, i15 + i18, -1);
            } else if (i16 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f35895f, i15, -2);
                boolean z12 = gVar.f23149r == 1;
                int i19 = bVar.f24787j;
                if (i19 == 1 || i19 == 2) {
                    boolean z13 = view.getMeasuredHeight() == gVar.l();
                    if (bVar.f24787j == 2 || !z12 || ((z12 && z13) || (view instanceof Placeholder) || gVar.B())) {
                        childMeasureSpec = View.MeasureSpec.makeMeasureSpec(gVar.r(), 1073741824);
                    }
                }
            }
            iMakeMeasureSpec = childMeasureSpec;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        int i21 = iArr[fVar2.ordinal()];
        if (i21 == 1) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        } else if (i21 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f35896g, i14, -2);
        } else if (i21 == 3) {
            int i22 = this.f35896g;
            int i23 = dVar2 != null ? gVar.K.f23112g : 0;
            if (dVar != null) {
                i23 += gVar.M.f23112g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i22, i14 + i23, -1);
        } else if (i21 != 4) {
            iMakeMeasureSpec2 = 0;
        } else {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f35896g, i14, -2);
            boolean z14 = gVar.f23151s == 1;
            int i24 = bVar.f24787j;
            if (i24 == 1 || i24 == 2) {
                boolean z15 = view.getMeasuredWidth() == gVar.r();
                if (bVar.f24787j == 2 || !z14 || ((z14 && z15) || (view instanceof Placeholder) || gVar.C())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gVar.l(), 1073741824);
                }
            }
        }
        d4.h hVar = (d4.h) gVar.V;
        ConstraintLayout constraintLayout = this.f35897h;
        if (hVar != null && d4.n.c(constraintLayout.K, 256) && view.getMeasuredWidth() == gVar.r() && view.getMeasuredWidth() < hVar.r() && view.getMeasuredHeight() == gVar.l() && view.getMeasuredHeight() < hVar.l() && view.getBaseline() == gVar.f23121c0 && !gVar.A() && a(gVar.H, iMakeMeasureSpec, gVar.r()) && a(gVar.I, iMakeMeasureSpec2, gVar.l())) {
            bVar.f24782e = gVar.r();
            bVar.f24783f = gVar.l();
            bVar.f24784g = gVar.f23121c0;
            return;
        }
        d4.f fVar3 = d4.f.MATCH_CONSTRAINT;
        boolean z16 = fVar == fVar3;
        boolean z17 = fVar2 == fVar3;
        d4.f fVar4 = d4.f.MATCH_PARENT;
        boolean z18 = fVar2 == fVar4 || fVar2 == d4.f.FIXED;
        boolean z19 = fVar == fVar4 || fVar == d4.f.FIXED;
        boolean z20 = z16 && gVar.Y > CropImageView.DEFAULT_ASPECT_RATIO;
        boolean z21 = z17 && gVar.Y > CropImageView.DEFAULT_ASPECT_RATIO;
        if (view == null) {
            return;
        }
        e eVar = (e) view.getLayoutParams();
        int i25 = bVar.f24787j;
        if (i25 != 1 && i25 != 2 && z16 && gVar.f23149r == 0 && z17 && gVar.f23151s == 0) {
            z11 = false;
            i11 = -1;
            baseline = 0;
            iMax = 0;
            iMax2 = 0;
        } else {
            if ((view instanceof VirtualLayout) && (gVar instanceof d4.p)) {
                ((VirtualLayout) view).r((d4.p) gVar, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            gVar.H = iMakeMeasureSpec;
            gVar.I = iMakeMeasureSpec2;
            gVar.f23128g = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i26 = gVar.f23155u;
            iMax = i26 > 0 ? Math.max(i26, measuredWidth) : measuredWidth;
            int i27 = gVar.f23156v;
            if (i27 > 0) {
                iMax = Math.min(i27, iMax);
            }
            int i28 = gVar.f23158x;
            iMax2 = i28 > 0 ? Math.max(i28, measuredHeight) : measuredHeight;
            int i29 = iMakeMeasureSpec2;
            int i30 = gVar.f23159y;
            if (i30 > 0) {
                iMax2 = Math.min(i30, iMax2);
            }
            if (!d4.n.c(constraintLayout.K, 1)) {
                if (z20 && z18) {
                    iMax = (int) ((iMax2 * gVar.Y) + 0.5f);
                } else if (z21 && z19) {
                    iMax2 = (int) ((iMax / gVar.Y) + 0.5f);
                }
            }
            if (measuredWidth == iMax && measuredHeight == iMax2) {
                baseline = baseline2;
                z11 = false;
            } else {
                if (measuredWidth != iMax) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824) : i29;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                gVar.H = iMakeMeasureSpec;
                gVar.I = iMakeMeasureSpec3;
                z11 = false;
                gVar.f23128g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredWidth2;
                iMax2 = measuredHeight2;
            }
            i11 = -1;
        }
        boolean z22 = baseline != i11 ? true : z11;
        bVar.f24786i = (iMax == bVar.f24780c && iMax2 == bVar.f24781d) ? z11 : true;
        if (eVar.f35853c0) {
            z22 = true;
        }
        if (z22 && baseline != -1 && gVar.f23121c0 != baseline) {
            bVar.f24786i = true;
        }
        bVar.f24782e = iMax;
        bVar.f24783f = iMax2;
        bVar.f24785h = z22;
        bVar.f24784g = baseline;
    }
}
