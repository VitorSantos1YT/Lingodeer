package ra;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ij.d f49001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f49002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ij.d f49003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f49004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f49005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f49006i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f49007j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f49008k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint.Cap f49009l;
    public Paint.Join m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f49010n;

    @Override // ra.l
    public final boolean a() {
        return this.f49003f.y() || this.f49001d.y();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // ra.l
    public final boolean b(int[] iArr) {
        boolean z11;
        ij.d dVar = this.f49003f;
        boolean z12 = true;
        if (dVar.y()) {
            ColorStateList colorStateList = (ColorStateList) dVar.f34423d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != dVar.f34421b) {
                dVar.f34421b = colorForState;
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        ij.d dVar2 = this.f49001d;
        if (dVar2.y()) {
            ColorStateList colorStateList2 = (ColorStateList) dVar2.f34423d;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != dVar2.f34421b) {
                dVar2.f34421b = colorForState2;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        return z11 | z12;
    }

    public float getFillAlpha() {
        return this.f49005h;
    }

    public int getFillColor() {
        return this.f49003f.f34421b;
    }

    public float getStrokeAlpha() {
        return this.f49004g;
    }

    public int getStrokeColor() {
        return this.f49001d.f34421b;
    }

    public float getStrokeWidth() {
        return this.f49002e;
    }

    public float getTrimPathEnd() {
        return this.f49007j;
    }

    public float getTrimPathOffset() {
        return this.f49008k;
    }

    public float getTrimPathStart() {
        return this.f49006i;
    }

    public void setFillAlpha(float f5) {
        this.f49005h = f5;
    }

    public void setFillColor(int i11) {
        this.f49003f.f34421b = i11;
    }

    public void setStrokeAlpha(float f5) {
        this.f49004g = f5;
    }

    public void setStrokeColor(int i11) {
        this.f49001d.f34421b = i11;
    }

    public void setStrokeWidth(float f5) {
        this.f49002e = f5;
    }

    public void setTrimPathEnd(float f5) {
        this.f49007j = f5;
    }

    public void setTrimPathOffset(float f5) {
        this.f49008k = f5;
    }

    public void setTrimPathStart(float f5) {
        this.f49006i = f5;
    }
}
