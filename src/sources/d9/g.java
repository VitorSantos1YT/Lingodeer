package d9;

import android.text.Layout;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f23321c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f23319a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f23320b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23322d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f23323e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23324f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23325g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f23326h = -3.4028235E38f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23327i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f23328j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23329k = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    public final a7.a a() {
        Layout.Alignment alignment;
        float f5 = this.f23326h;
        float f11 = -3.4028235E38f;
        if (f5 == -3.4028235E38f) {
            int i11 = this.f23322d;
            if (i11 != 4) {
                f5 = i11 != 5 ? 0.5f : 1.0f;
            } else {
                f5 = 0.0f;
            }
        }
        int i12 = this.f23327i;
        if (i12 == Integer.MIN_VALUE) {
            int i13 = this.f23322d;
            if (i13 == 1) {
                i12 = 0;
            } else if (i13 == 3) {
                i12 = 2;
            } else if (i13 == 4) {
                i12 = 0;
            } else if (i13 != 5) {
                i12 = 1;
            } else {
                i12 = 2;
            }
        }
        a7.a aVar = new a7.a();
        int i14 = this.f23322d;
        if (i14 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i14 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i14 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i14 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i14 != 5) {
            defpackage.e.y(i14, "Unknown textAlignment: ");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        aVar.f390c = alignment;
        float f12 = this.f23323e;
        int i15 = this.f23324f;
        if (f12 != -3.4028235E38f && i15 == 0 && (f12 < CropImageView.DEFAULT_ASPECT_RATIO || f12 > 1.0f)) {
            f11 = 1.0f;
        } else if (f12 != -3.4028235E38f) {
            f11 = f12;
        } else if (i15 == 0) {
            f11 = 1.0f;
        }
        aVar.f392e = f11;
        aVar.f393f = i15;
        aVar.f394g = this.f23325g;
        aVar.f395h = f5;
        aVar.f396i = i12;
        float f13 = this.f23328j;
        if (i12 == 0) {
            f5 = 1.0f - f5;
        } else if (i12 == 1) {
            f5 = f5 <= 0.5f ? f5 * 2.0f : (1.0f - f5) * 2.0f;
        } else if (i12 != 2) {
            throw new IllegalStateException(String.valueOf(i12));
        }
        aVar.f399l = Math.min(f13, f5);
        aVar.f402p = this.f23329k;
        CharSequence charSequence = this.f23321c;
        if (charSequence != null) {
            aVar.f388a = charSequence;
            aVar.f389b = null;
        }
        return aVar;
    }
}
