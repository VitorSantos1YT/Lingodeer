package v8;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f53735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f53736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f53737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f53740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f53741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f53742h;

    public b(int i11, int i12) {
        ArrayList arrayList = new ArrayList();
        this.f53735a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f53736b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.f53737c = sb2;
        this.f53741g = i11;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.f53738d = 15;
        this.f53739e = 0;
        this.f53740f = 0;
        this.f53742h = i12;
    }

    public final void a(char c11) {
        StringBuilder sb2 = this.f53737c;
        if (sb2.length() < 32) {
            sb2.append(c11);
        }
    }

    public final void b() {
        StringBuilder sb2 = this.f53737c;
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.f53735a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i11 = aVar.f53734c;
                if (i11 != length) {
                    return;
                }
                aVar.f53734c = i11 - 1;
            }
        }
    }

    public final a7.b c(int i11) {
        int i12;
        float f5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f53736b;
            if (i13 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i13));
            spannableStringBuilder.append('\n');
            i13++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i14 = this.f53739e + this.f53740f;
        int length = (32 - i14) - spannableStringBuilder.length();
        int i15 = i14 - length;
        if (i11 != Integer.MIN_VALUE) {
            i12 = i11;
        } else if (this.f53741g != 2 || (Math.abs(i15) >= 3 && length >= 0)) {
            i12 = (this.f53741g != 2 || i15 <= 0) ? 0 : 2;
        } else {
            i12 = 1;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                i14 = 32 - length;
            }
            f5 = ((i14 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f5 = 0.5f;
        }
        float f11 = f5;
        int i16 = this.f53738d;
        if (i16 > 7) {
            i16 -= 17;
        } else if (this.f53741g == 1) {
            i16 -= this.f53742h - 1;
        }
        return new a7.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i16, 1, Integer.MIN_VALUE, f11, i12, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, CropImageView.DEFAULT_ASPECT_RATIO, 0);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f53737c);
        int length = spannableStringBuilder.length();
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = 0;
        int i16 = 0;
        boolean z11 = false;
        while (true) {
            ArrayList arrayList = this.f53735a;
            if (i15 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i15);
            boolean z12 = aVar.f53733b;
            int i17 = aVar.f53732a;
            if (i17 != 8) {
                boolean z13 = i17 == 7;
                if (i17 != 7) {
                    i14 = c.B[i17];
                }
                z11 = z13;
            }
            int i18 = aVar.f53734c;
            i15++;
            if (i18 != (i15 < arrayList.size() ? ((a) arrayList.get(i15)).f53734c : length)) {
                if (i11 != -1 && !z12) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i18, 33);
                    i11 = -1;
                } else if (i11 == -1 && z12) {
                    i11 = i18;
                }
                if (i12 != -1 && !z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i12, i18, 33);
                    i12 = -1;
                } else if (i12 == -1 && z11) {
                    i12 = i18;
                }
                if (i14 != i13) {
                    if (i13 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i13), i16, i18, 33);
                    }
                    i13 = i14;
                    i16 = i18;
                }
            }
        }
        if (i11 != -1 && i11 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
        }
        if (i12 != -1 && i12 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i12, length, 33);
        }
        if (i16 != length && i13 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i13), i16, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.f53735a.isEmpty() && this.f53736b.isEmpty() && this.f53737c.length() == 0;
    }
}
